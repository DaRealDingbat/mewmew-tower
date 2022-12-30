package com.amazon.android.framework.prompt;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import com.amazon.android.framework.util.KiwiLogger;
import com.amazon.android.p006d.C0067a;

public abstract class SimplePrompt extends Prompt {
    private static final String LEGACY_BUTTON_LABEL = "OK";
    private static final KiwiLogger LOGGER = new KiwiLogger("SimplePrompt");
    protected final PromptContent content;
    protected final C0083b mode;

    public SimplePrompt(PromptContent promptContent) {
        this(promptContent, C0083b.LEGACY);
    }

    public SimplePrompt(PromptContent promptContent, C0083b bVar) {
        C0067a.m219a((Object) promptContent, "content");
        this.content = promptContent;
        this.mode = bVar;
        LOGGER.trace("created SimplePrompt with mode " + bVar);
    }

    private final Dialog createExtendedDialog(Activity activity) {
        LOGGER.trace("doCreate() called to create extended dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.content.getExtendedTitle()).setMessage(this.content.getMessage()).setCancelable(false);
        setUpButtons(builder);
        LOGGER.trace("doCreate() returning");
        return builder.create();
    }

    private final Dialog createLegacyDialog(Activity activity) {
        LOGGER.trace("Legacy mode dialog, legacy title = " + this.content.getTitle() + ", extended title = " + this.content.getExtendedTitle());
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.content.getExtendedTitle()).setMessage(this.content.getMessage()).setCancelable(false).setNeutralButton(LEGACY_BUTTON_LABEL, new C0093l(this));
        return builder.create();
    }

    private boolean[] filterActions(C0082a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            zArr[i] = canHandleAction(aVarArr[i]);
            if (!zArr[i]) {
                LOGGER.trace("filterActions() filtering item " + i);
            }
        }
        return zArr;
    }

    private void setNeutralButton(AlertDialog.Builder builder, String str, int i) {
        builder.setNeutralButton(str, new C0092k(this, i));
    }

    private void setUpButtons(AlertDialog.Builder builder) {
        String[] buttonLabels = this.content.getButtonLabels();
        if (buttonLabels.length <= 0 || buttonLabels.length > 2) {
            LOGGER.error("Unexpected button count: " + buttonLabels.length);
            return;
        }
        boolean[] filterActions = filterActions(this.content.getButtonActions());
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < filterActions.length; i3++) {
            if (filterActions[i3]) {
                i++;
                i2 = i3;
            }
        }
        if (i == 1) {
            LOGGER.trace("single button dialog");
            setNeutralButton(builder, buttonLabels[i2], i2);
            return;
        }
        LOGGER.trace("two button dialog");
        builder.setNegativeButton(buttonLabels[0], new C0095n(this));
        builder.setPositiveButton(buttonLabels[1], new C0090i(this));
    }

    /* access modifiers changed from: protected */
    public boolean canHandleAction(C0082a aVar) {
        return aVar == C0082a.DEFAULT;
    }

    /* access modifiers changed from: protected */
    public abstract void doAction();

    /* access modifiers changed from: protected */
    public void doAction(int i) {
        LOGGER.error("extended doAction from base class called, this should never happen.");
        doAction();
    }

    /* access modifiers changed from: protected */
    public boolean doCompatibilityCheck(Activity activity) {
        return this.content.isVisible();
    }

    public final Dialog doCreate(Activity activity) {
        return this.mode == C0083b.LEGACY ? createLegacyDialog(activity) : createExtendedDialog(activity);
    }

    /* access modifiers changed from: protected */
    public void doExpiration(C0087f fVar) {
        doAction();
    }
}
