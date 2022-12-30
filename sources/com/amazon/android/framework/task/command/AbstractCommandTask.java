package com.amazon.android.framework.task.command;

import android.app.Application;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.android.framework.exception.KiwiException;
import com.amazon.android.framework.prompt.PromptManager;
import com.amazon.android.framework.resource.Resource;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p004b.C0053a;
import com.amazon.android.p004b.C0054b;
import com.amazon.android.p004b.C0055c;
import com.amazon.android.p004b.C0057e;
import com.amazon.android.p008f.C0073b;
import com.amazon.android.p008f.C0077f;
import com.amazon.android.p013k.C0149c;
import com.amazon.android.p018p.C0181b;
import com.amazon.android.p018p.C0183d;
import com.amazon.venezia.command.C0200j;
import com.amazon.venezia.command.C0204n;
import com.amazon.venezia.command.C0208r;
import com.amazon.venezia.command.C0213w;
import com.amazon.venezia.command.FailureResult;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

public abstract class AbstractCommandTask extends C0149c {
    private static final KiwiLogger LOGGER = new KiwiLogger("AbstractCommandTask");
    /* access modifiers changed from: private */
    @Resource
    public Application application;
    @Resource
    private C0109f authTokenVerifier;
    @Resource
    private C0106c client;
    @Resource
    private C0183d metricsManager;
    @Resource
    private PromptManager promptManager;
    @Resource
    protected C0073b resultManager;

    private void expire(C0208r rVar, C0105b bVar) throws RemoteException, KiwiException {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Expiring Decision: " + rVar + ", reason: " + bVar);
        }
        handleCommandResult(this.client.mo376a(rVar, bVar));
    }

    private C0181b extractMetric(KiwiException kiwiException) {
        C0181b bVar = new C0181b(getFailureMetricName());
        bVar.mo461a("subType", kiwiException.getType()).mo461a("reason", kiwiException.getReason()).mo461a("context", kiwiException.getContext());
        return bVar;
    }

    private C0213w getCommand() {
        return new C0111h(this);
    }

    private String getFailureMetricName() {
        return getCommandName() + "_failure";
    }

    private void handleChoice(C0208r rVar, C0204n nVar) throws RemoteException, KiwiException {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Handling customer choice: " + nVar);
        }
        Intent b = nVar.mo571b();
        if (b != null) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Choice has intent, scheduling it to be fired!!");
            }
            C0077f a = this.resultManager.mo298a(b);
            if (a == null) {
                if (KiwiLogger.TRACE_ON) {
                    LOGGER.trace("No result recived, expiring decision");
                }
                expire(rVar, C0105b.EXPIRATION_DURATION_ELAPSED);
            } else if (a.f939b == 0) {
                if (KiwiLogger.TRACE_ON) {
                    LOGGER.trace("Result canceled, expiring decision");
                }
                expire(rVar, C0105b.ACTION_CANCELED);
            } else {
                if (KiwiLogger.TRACE_ON) {
                    LOGGER.trace("Result received!!!, notifying service");
                }
                handleCommandResult(this.client.mo375a(nVar));
            }
        } else {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("No intent given, choosing now");
            }
            handleCommandResult(this.client.mo375a(nVar));
        }
    }

    private void handleCommandResult(C0116m mVar) throws KiwiException, RemoteException {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Received result from CommandService: " + mVar);
        }
        if (mVar == null) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Received null result from command service, exiting task");
            }
        } else if (mVar.f1039f != null) {
            handleException(mVar.f1039f);
        } else if (mVar.f1035b != null) {
            throw mVar.f1035b;
        } else {
            this.authTokenVerifier.mo383a(mVar.f1034a, this.client.mo378a());
            if (mVar.f1036c != null) {
                handleSuccess(mVar.f1036c);
            } else if (mVar.f1037d != null) {
                handleFailure(mVar.f1037d);
            } else {
                handleDecision(mVar.f1038e);
            }
        }
    }

    private void handleDecision(C0208r rVar) throws RemoteException, KiwiException {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Handling Decision");
        }
        try {
            C0107d dVar = new C0107d(rVar);
            this.promptManager.present(dVar);
            C0204n a = dVar.mo380a();
            if (a == null) {
                if (KiwiLogger.TRACE_ON) {
                    LOGGER.trace("DecisionChooser returned null!!, expiring");
                }
                expire(rVar, C0105b.EXPIRATION_DURATION_ELAPSED);
                return;
            }
            handleChoice(rVar, a);
        } catch (C0055c e) {
            expire(rVar, e.f910a);
        }
    }

    private void handleException(C0200j jVar) throws RemoteException, KiwiException {
        throw new C0057e(jVar);
    }

    private void handleExecutionException(Throwable th) {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Exception occurred while processing task: " + th, th);
        }
        KiwiException translate = translate(th);
        onException(translate);
        this.metricsManager.mo464a(extractMetric(translate));
    }

    private void handleFailure(FailureResult failureResult) throws RemoteException, KiwiException {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Command failed execution: " + failureResult.getDisplayableName());
        }
        onFailure(failureResult);
    }

    private void handleSuccess(SuccessResult successResult) throws RemoteException, KiwiException {
        if (KiwiLogger.TRACE_ON) {
            LOGGER.trace("Command executed successfully");
        }
        onSuccess(successResult);
    }

    private void postExecution() {
        if (!isWorkflowChild()) {
            this.client.mo379b();
        }
    }

    private KiwiException translate(Throwable th) {
        return th instanceof KiwiException ? (KiwiException) th : th instanceof RemoteException ? new C0053a((RemoteException) th) : new C0054b(th);
    }

    public final void execute() {
        try {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("----------------------------------------------");
                LOGGER.trace("Executing: " + getCommandName());
                LOGGER.trace("----------------------------------------------");
            }
            preExecution();
            if (!isExecutionNeeded()) {
                if (KiwiLogger.TRACE_ON) {
                    LOGGER.trace("Execution not needed, quitting");
                }
                if (KiwiLogger.TRACE_ON) {
                    LOGGER.trace("Task finished");
                }
                postExecution();
                return;
            }
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Executing Command: " + getCommandName());
            }
            handleCommandResult(this.client.mo377a(getCommand()));
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Task finished");
            }
            postExecution();
        } catch (Throwable th) {
            if (KiwiLogger.TRACE_ON) {
                LOGGER.trace("Task finished");
            }
            postExecution();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public abstract Map getCommandData();

    /* access modifiers changed from: protected */
    public abstract String getCommandName();

    /* access modifiers changed from: protected */
    public abstract String getCommandVersion();

    /* access modifiers changed from: protected */
    public abstract boolean isExecutionNeeded();

    /* access modifiers changed from: protected */
    public void onException(KiwiException kiwiException) {
        LOGGER.error("On Exception!!!!: " + kiwiException);
    }

    /* access modifiers changed from: protected */
    public abstract void onFailure(FailureResult failureResult) throws RemoteException, KiwiException;

    /* access modifiers changed from: protected */
    public abstract void onSuccess(SuccessResult successResult) throws RemoteException, KiwiException;

    /* access modifiers changed from: protected */
    public void preExecution() throws KiwiException {
    }
}
