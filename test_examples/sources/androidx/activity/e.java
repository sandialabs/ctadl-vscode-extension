package androidx.activity;

import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.CombinedModifier;
import com.google.android.material.textfield.TextInputLayout;
import g0.t0;
import g0.v0;
import g0.z0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import q0.d;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements TextInputLayout.f {
    public static int a(float f10, b2.b bVar) {
        float H = bVar.H(f10);
        if (Float.isInfinite(H)) {
            return Integer.MAX_VALUE;
        }
        return m0.b.g1(H);
    }

    public static q0.d b(q0.d dVar, q0.d dVar2) {
        v7.g.f(dVar2, "other");
        int i10 = q0.d.f16823g;
        return dVar2 == d.a.f16824i ? dVar : new CombinedModifier(dVar, dVar2);
    }

    public static float c(long j2, b2.b bVar) {
        if (b2.j.a(b2.i.b(j2), 4294967296L)) {
            return bVar.getDensity() * bVar.y() * b2.i.c(j2);
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static long d(long j2, b2.b bVar) {
        boolean z10;
        int i10 = b2.f.c;
        if (j2 != b2.f.f6343b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return a1.c.v(bVar.H(b2.f.b(j2)), bVar.H(b2.f.a(j2)));
        }
        int i11 = u0.f.f17737d;
        return u0.f.c;
    }

    public static int e(float f10, int i10, int i11) {
        return (Float.floatToIntBits(f10) + i10) * i11;
    }

    public static int f(long j2, int i10, int i11) {
        return (m7.j.a(j2) + i10) * i11;
    }

    public static String g(String str, int i10) {
        return str + i10;
    }

    public static String h(StringBuilder sb, int i10, char c) {
        sb.append(i10);
        sb.append(c);
        return sb.toString();
    }

    public static String i(StringBuilder sb, long j2, String str) {
        sb.append(j2);
        sb.append(str);
        return sb.toString();
    }

    public static String j(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String k(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ Iterator l() {
        try {
            return Arrays.asList(new ka.a()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static /* bridge */ /* synthetic */ void m() {
        throw null;
    }

    public static /* bridge */ /* synthetic */ void n(int i10, int i11, Class cls) {
        throw null;
    }

    public static void o(int i10, ComposableLambdaImpl composableLambdaImpl, v0 v0Var, ComposerImpl composerImpl, int i11, int i12) {
        composableLambdaImpl.O(v0Var, composerImpl, Integer.valueOf(i10));
        composerImpl.f(i11);
        composerImpl.f(i12);
    }

    public static void p(g0.c cVar, String str, z0 z0Var, String str2, t0 t0Var, String str3) {
        v7.g.f(cVar, str);
        v7.g.f(z0Var, str2);
        v7.g.f(t0Var, str3);
    }

    public static /* bridge */ /* synthetic */ void q(Object obj) {
        throw null;
    }
}
