package androidx.compose.runtime;

import g0.a1;
import g0.j0;
import g0.r0;
import g0.t0;
import g0.u0;
import g0.w;
import g0.w0;
import g0.z0;
import java.util.ArrayList;
import java.util.List;
import m7.n;
import u7.q;

/* loaded from: classes.dex */
public final class ComposerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final q<g0.c<?>, z0, t0, n> f2737a = ComposerKt$removeCurrentGroupInstance$1.f2748j;

    /* renamed from: b  reason: collision with root package name */
    public static final q<g0.c<?>, z0, t0, n> f2738b = ComposerKt$skipToGroupEndInstance$1.f2750j;
    public static final q<g0.c<?>, z0, t0, n> c = ComposerKt$endGroupInstance$1.f2747j;

    /* renamed from: d  reason: collision with root package name */
    public static final q<g0.c<?>, z0, t0, n> f2739d = ComposerKt$startRootGroup$1.f2751j;

    /* renamed from: e  reason: collision with root package name */
    public static final q<g0.c<?>, z0, t0, n> f2740e = ComposerKt$resetSlotsInstance$1.f2749j;

    /* renamed from: f  reason: collision with root package name */
    public static final j0 f2741f = new j0("provider");

    /* renamed from: g  reason: collision with root package name */
    public static final j0 f2742g = new j0("provider");

    /* renamed from: h  reason: collision with root package name */
    public static final j0 f2743h = new j0("compositionLocalMap");

    /* renamed from: i  reason: collision with root package name */
    public static final j0 f2744i = new j0("providerValues");

    /* renamed from: j  reason: collision with root package name */
    public static final j0 f2745j = new j0("providers");

    /* renamed from: k  reason: collision with root package name */
    public static final j0 f2746k = new j0("reference");

    public static final void a(ArrayList arrayList, int i10, int i11) {
        int d5 = d(i10, arrayList);
        if (d5 < 0) {
            d5 = -(d5 + 1);
        }
        while (d5 < arrayList.size() && ((w) arrayList.get(d5)).f11089b < i11) {
            arrayList.remove(d5);
        }
    }

    public static final void b(w0 w0Var, ArrayList arrayList, int i10) {
        if (w0Var.i(i10)) {
            arrayList.add(w0Var.j(i10));
            return;
        }
        int i11 = i10 + 1;
        int h10 = w0Var.h(i10) + i10;
        while (i11 < h10) {
            b(w0Var, arrayList, i11);
            i11 += w0Var.h(i11);
        }
    }

    public static final void c(String str) {
        v7.g.f(str, "message");
        throw new ComposeRuntimeError(a4.b.m("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int d(int i10, List list) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int h10 = v7.g.h(((w) list.get(i12)).f11089b, i10);
            if (h10 < 0) {
                i11 = i12 + 1;
            } else if (h10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final void e(z0 z0Var, t0 t0Var) {
        r0 r0Var;
        b bVar;
        v7.g.f(z0Var, "<this>");
        v7.g.f(t0Var, "rememberManager");
        int g10 = z0Var.g(z0Var.f11120b, z0Var.n(z0Var.f11134r));
        int[] iArr = z0Var.f11120b;
        int i10 = z0Var.f11134r;
        a1 a1Var = new a1(g10, z0Var.g(iArr, z0Var.n(z0Var.o(i10) + i10)), z0Var);
        while (a1Var.hasNext()) {
            Object next = a1Var.next();
            if (next instanceof u0) {
                t0Var.b((u0) next);
            } else if ((next instanceof r0) && (bVar = (r0Var = (r0) next).f11072b) != null) {
                bVar.f2861v = true;
                r0Var.f11072b = null;
                r0Var.f11075f = null;
                r0Var.f11076g = null;
            }
        }
        z0Var.C();
    }

    public static final void f(boolean z10) {
        if (z10) {
            return;
        }
        c("Check failed".toString());
        throw null;
    }
}
