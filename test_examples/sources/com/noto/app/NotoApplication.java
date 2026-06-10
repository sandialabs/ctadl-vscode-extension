package com.noto.app;

import a1.b;
import android.app.Application;
import java.util.ArrayList;
import kotlin.Metadata;
import m7.n;
import nb.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/NotoApplication;", "Landroid/app/Application;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NotoApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        boolean z10;
        super.onCreate();
        a.b bVar = nb.a.f16153a;
        a.C0200a c0200a = new a.C0200a();
        bVar.getClass();
        if (c0200a != bVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ArrayList<a.c> arrayList = nb.a.f16154b;
            synchronized (arrayList) {
                arrayList.add(c0200a);
                Object[] array = arrayList.toArray(new a.c[0]);
                if (array != null) {
                    a.c[] cVarArr = (a.c[]) array;
                    n nVar = n.f16010a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            b.B0(new NotoApplication$onCreate$1(this));
            return;
        }
        throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
    }
}
