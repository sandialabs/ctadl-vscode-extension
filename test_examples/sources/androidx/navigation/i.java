package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import java.util.HashMap;
import java.util.UUID;
import t3.a;

/* loaded from: classes.dex */
public final class i implements androidx.lifecycle.q, n0, androidx.lifecycle.i, b4.d {

    /* renamed from: i  reason: collision with root package name */
    public final Context f5478i;

    /* renamed from: j  reason: collision with root package name */
    public final n f5479j;

    /* renamed from: k  reason: collision with root package name */
    public Bundle f5480k;

    /* renamed from: l  reason: collision with root package name */
    public final androidx.lifecycle.r f5481l;

    /* renamed from: m  reason: collision with root package name */
    public final b4.c f5482m;
    public final UUID n;

    /* renamed from: o  reason: collision with root package name */
    public Lifecycle.State f5483o;

    /* renamed from: p  reason: collision with root package name */
    public Lifecycle.State f5484p;

    /* renamed from: q  reason: collision with root package name */
    public final k f5485q;

    /* renamed from: r  reason: collision with root package name */
    public f0 f5486r;

    /* renamed from: s  reason: collision with root package name */
    public d0 f5487s;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5488a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            f5488a = iArr;
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5488a[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5488a[Lifecycle.Event.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5488a[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5488a[Lifecycle.Event.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5488a[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5488a[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends androidx.lifecycle.a {
        public b(b4.d dVar) {
            super(dVar, null);
        }

        @Override // androidx.lifecycle.a
        public final <T extends i0> T d(String str, Class<T> cls, d0 d0Var) {
            return new c(d0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i0 {

        /* renamed from: d  reason: collision with root package name */
        public final d0 f5489d;

        public c(d0 d0Var) {
            this.f5489d = d0Var;
        }
    }

    public i(Context context, n nVar, Bundle bundle, androidx.lifecycle.q qVar, k kVar) {
        this(context, nVar, bundle, qVar, kVar, UUID.randomUUID(), null);
    }

    public i(Context context, n nVar, Bundle bundle, androidx.lifecycle.q qVar, k kVar, UUID uuid, Bundle bundle2) {
        this.f5481l = new androidx.lifecycle.r(this);
        b4.c cVar = new b4.c(this);
        this.f5482m = cVar;
        this.f5483o = Lifecycle.State.CREATED;
        this.f5484p = Lifecycle.State.RESUMED;
        this.f5478i = context;
        this.n = uuid;
        this.f5479j = nVar;
        this.f5480k = bundle;
        this.f5485q = kVar;
        cVar.b(bundle2);
        if (qVar != null) {
            this.f5483o = qVar.i0().f5413d;
        }
    }

    @Override // androidx.lifecycle.n0
    public final m0 X() {
        k kVar = this.f5485q;
        if (kVar != null) {
            HashMap<UUID, m0> hashMap = kVar.f5495d;
            UUID uuid = this.n;
            m0 m0Var = hashMap.get(uuid);
            if (m0Var == null) {
                m0 m0Var2 = new m0();
                hashMap.put(uuid, m0Var2);
                return m0Var2;
            }
            return m0Var;
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final d0 a() {
        if (this.f5487s == null) {
            this.f5487s = ((c) new k0(this, new b(this)).a(c.class)).f5489d;
        }
        return this.f5487s;
    }

    public final void b() {
        this.f5481l.h(this.f5483o.ordinal() < this.f5484p.ordinal() ? this.f5483o : this.f5484p);
    }

    @Override // b4.d
    public final b4.b e() {
        return this.f5482m.f6385b;
    }

    @Override // androidx.lifecycle.i
    public final k0.b f() {
        if (this.f5486r == null) {
            this.f5486r = new f0((Application) this.f5478i.getApplicationContext(), this, this.f5480k);
        }
        return this.f5486r;
    }

    @Override // androidx.lifecycle.i
    public final t3.a g() {
        return a.C0224a.f17563b;
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.r i0() {
        return this.f5481l;
    }
}
