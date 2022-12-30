package com.amazon.android.framework.task.command;

import android.os.RemoteException;
import com.amazon.venezia.command.C0216z;
import java.util.Map;

/* renamed from: com.amazon.android.framework.task.command.h */
final class C0111h extends C0216z {

    /* renamed from: a */
    private /* synthetic */ AbstractCommandTask f1028a;

    C0111h(AbstractCommandTask abstractCommandTask) {
        this.f1028a = abstractCommandTask;
    }

    /* renamed from: a */
    public final String mo385a() throws RemoteException {
        return this.f1028a.getCommandName();
    }

    /* renamed from: b */
    public final String mo386b() throws RemoteException {
        return this.f1028a.getCommandVersion();
    }

    /* renamed from: c */
    public final String mo387c() throws RemoteException {
        return this.f1028a.application.getPackageName();
    }

    /* renamed from: d */
    public final Map mo388d() throws RemoteException {
        return this.f1028a.getCommandData();
    }
}
