package y3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.appcompat.widget.j1;
import d.v;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import y3.d;
import y3.e;
import y3.f;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final String f18848a;

    /* renamed from: b  reason: collision with root package name */
    public final f f18849b;
    public final Executor c;

    /* renamed from: d  reason: collision with root package name */
    public int f18850d;

    /* renamed from: e  reason: collision with root package name */
    public f.c f18851e;

    /* renamed from: f  reason: collision with root package name */
    public e f18852f;

    /* renamed from: g  reason: collision with root package name */
    public final b f18853g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f18854h;

    /* renamed from: i  reason: collision with root package name */
    public final androidx.activity.b f18855i;

    /* renamed from: j  reason: collision with root package name */
    public final j1 f18856j;

    /* loaded from: classes.dex */
    public static final class a extends f.c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // y3.f.c
        public final void a(Set<String> set) {
            v7.g.f(set, "tables");
            h hVar = h.this;
            if (hVar.f18854h.get()) {
                return;
            }
            try {
                e eVar = hVar.f18852f;
                if (eVar != null) {
                    int i10 = hVar.f18850d;
                    Object[] array = set.toArray(new String[0]);
                    v7.g.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    eVar.c(i10, (String[]) array);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d.a {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f18858b = 0;

        public b() {
        }

        @Override // y3.d
        public final void a(String[] strArr) {
            v7.g.f(strArr, "tables");
            h hVar = h.this;
            hVar.c.execute(new v(hVar, 1, strArr));
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            e c0244a;
            v7.g.f(componentName, "name");
            v7.g.f(iBinder, "service");
            int i10 = e.a.f18826a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof e)) {
                c0244a = (e) queryLocalInterface;
            } else {
                c0244a = new e.a.C0244a(iBinder);
            }
            h hVar = h.this;
            hVar.f18852f = c0244a;
            hVar.c.execute(hVar.f18855i);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            v7.g.f(componentName, "name");
            h hVar = h.this;
            hVar.c.execute(hVar.f18856j);
            hVar.f18852f = null;
        }
    }

    public h(Context context, String str, Intent intent, f fVar, Executor executor) {
        this.f18848a = str;
        this.f18849b = fVar;
        this.c = executor;
        Context applicationContext = context.getApplicationContext();
        this.f18853g = new b();
        this.f18854h = new AtomicBoolean(false);
        c cVar = new c();
        this.f18855i = new androidx.activity.b(9, this);
        this.f18856j = new j1(4, this);
        Object[] array = fVar.f18830d.keySet().toArray(new String[0]);
        v7.g.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f18851e = new a((String[]) array);
        applicationContext.bindService(intent, cVar, 1);
    }
}
