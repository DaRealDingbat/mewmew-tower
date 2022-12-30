package com.amazon.android.framework.task.command;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.amazon.venezia.command.C0198h;
import com.amazon.venezia.command.C0202l;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.amazon.android.framework.task.command.j */
final class C0113j implements ServiceConnection {

    /* renamed from: a */
    private /* synthetic */ C0106c f1031a;

    C0113j(C0106c cVar) {
        this.f1031a = cVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0198h lVar;
        C0106c.f1003a.trace("onServiceConnected");
        BlockingQueue a = this.f1031a.f1007e;
        if (iBinder == null) {
            lVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.amazon.venezia.command.CommandService");
            lVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C0198h)) ? new C0202l(iBinder) : (C0198h) queryLocalInterface;
        }
        a.add(lVar);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C0106c.f1003a.trace("onServiceDisconnected!!!");
    }
}
