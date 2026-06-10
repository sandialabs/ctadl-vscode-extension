package a4;

import a1.c;
import android.os.Bundle;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import com.airbnb.epoxy.r;
import com.noto.app.util.ViewUtilsKt;
import f9.b;
import g0.j1;
import g0.k0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import q0.d;
import u7.l;
import v.m;
import v7.g;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements r.b {
    public /* synthetic */ b(int i10) {
    }

    public static boolean a(d.b bVar, l lVar) {
        g.f(lVar, "predicate");
        return ((Boolean) lVar.U(bVar)).booleanValue();
    }

    public static boolean b(r.a aVar, long j2) {
        return j2 >= aVar.c();
    }

    public static float f(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int g(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static k0 h(long j2, j1 j1Var) {
        return c.U0(new v0.r(j2), j1Var);
    }

    public static String i(String str, int i10, String str2) {
        return str + i10 + str2;
    }

    public static String j(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String k(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(StringBuilder sb, float f10, char c) {
        sb.append(f10);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder o(String str, int i10, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i10);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ Iterator q() {
        try {
            return Arrays.asList(new ka.b()).iterator();
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void r(int i10, NavController navController, l lVar) {
        ViewUtilsKt.o(navController, new androidx.navigation.a(i10), lVar);
    }

    public static /* synthetic */ void s(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* bridge */ /* synthetic */ void t(Object obj, int i10, int i11, int i12) {
        throw null;
    }

    public static boolean u(Bundle bundle, String str, Class cls, String str2) {
        g.f(bundle, str);
        bundle.setClassLoader(cls.getClassLoader());
        return bundle.containsKey(str2);
    }

    public static boolean v(b.a aVar, int i10, String str) {
        Boolean c = aVar.c(i10);
        g.e(c, str);
        return c.booleanValue();
    }

    public static d x() {
        boolean z10;
        if (1.0f > 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new m(true, InspectableValueKt.f3744a);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }
}
