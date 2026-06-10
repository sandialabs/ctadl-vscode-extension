package androidx.compose.animation.core;

import g0.k0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m7.n;
import r.d;
import r.e;
import r.i;
import r.u;
import r.w;
import r.x;
import r.z;
import v7.g;

/* loaded from: classes.dex */
public final class a<T, V extends i> {

    /* renamed from: a  reason: collision with root package name */
    public final z<T, V> f1353a;

    /* renamed from: b  reason: collision with root package name */
    public final T f1354b;
    public final e<T, V> c;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f1355d;

    /* renamed from: e  reason: collision with root package name */
    public final k0 f1356e;

    /* renamed from: f  reason: collision with root package name */
    public T f1357f;

    /* renamed from: g  reason: collision with root package name */
    public T f1358g;

    /* renamed from: h  reason: collision with root package name */
    public final u f1359h;

    /* renamed from: i  reason: collision with root package name */
    public final V f1360i;

    /* renamed from: j  reason: collision with root package name */
    public final V f1361j;

    /* renamed from: k  reason: collision with root package name */
    public V f1362k;

    /* renamed from: l  reason: collision with root package name */
    public V f1363l;

    public a(T t10, z<T, V> zVar, T t11, String str) {
        g.f(zVar, "typeConverter");
        g.f(str, "label");
        this.f1353a = zVar;
        this.f1354b = t11;
        this.c = new e<>(zVar, t10, null, 60);
        this.f1355d = a1.c.V0(Boolean.FALSE);
        this.f1356e = a1.c.V0(t10);
        this.f1359h = new u();
        new w(t11, 3);
        V U = zVar.a().U(t10);
        int b5 = U.b();
        for (int i10 = 0; i10 < b5; i10++) {
            U.e(i10, Float.NEGATIVE_INFINITY);
        }
        this.f1360i = U;
        V U2 = this.f1353a.a().U(t10);
        int b10 = U2.b();
        for (int i11 = 0; i11 < b10; i11++) {
            U2.e(i11, Float.POSITIVE_INFINITY);
        }
        this.f1361j = U2;
        this.f1362k = U;
        this.f1363l = U2;
    }

    public static Object a(a aVar, Object obj, d dVar, p7.c cVar) {
        T U = aVar.f1353a.b().U(aVar.c.f16976k);
        Object c = aVar.c();
        g.f(dVar, "animationSpec");
        z<T, V> zVar = aVar.f1353a;
        g.f(zVar, "typeConverter");
        Animatable$runAnimation$2 animatable$runAnimation$2 = new Animatable$runAnimation$2(aVar, U, new x(dVar, zVar, c, obj, zVar.a().U(U)), aVar.c.f16977l, null, null);
        MutatePriority mutatePriority = MutatePriority.Default;
        u uVar = aVar.f1359h;
        uVar.getClass();
        return a1.b.H(new MutatorMutex$mutate$2(mutatePriority, uVar, animatable$runAnimation$2, null), cVar);
    }

    public final T b(T t10) {
        if (g.a(this.f1362k, this.f1360i) && g.a(this.f1363l, this.f1361j)) {
            return t10;
        }
        z<T, V> zVar = this.f1353a;
        V U = zVar.a().U(t10);
        int b5 = U.b();
        boolean z10 = false;
        for (int i10 = 0; i10 < b5; i10++) {
            if (U.a(i10) < this.f1362k.a(i10) || U.a(i10) > this.f1363l.a(i10)) {
                U.e(i10, a1.c.b0(U.a(i10), this.f1362k.a(i10), this.f1363l.a(i10)));
                z10 = true;
            }
        }
        return z10 ? zVar.b().U(U) : t10;
    }

    public final T c() {
        return this.c.getValue();
    }

    public final Object d(b2.d dVar, p7.c cVar) {
        Animatable$snapTo$2 animatable$snapTo$2 = new Animatable$snapTo$2(this, dVar, null);
        MutatePriority mutatePriority = MutatePriority.Default;
        u uVar = this.f1359h;
        uVar.getClass();
        Object H = a1.b.H(new MutatorMutex$mutate$2(mutatePriority, uVar, animatable$snapTo$2, null), cVar);
        if (H == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return H;
        }
        return n.f16010a;
    }
}
