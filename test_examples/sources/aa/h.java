package aa;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import l8.z;
import y9.e0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f405a = new h();

    /* renamed from: b  reason: collision with root package name */
    public static final c f406b = c.f391i;
    public static final a c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f407d;

    /* renamed from: e  reason: collision with root package name */
    public static final f f408e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<z> f409f;

    static {
        String format = String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1));
        v7.g.e(format, "format(this, *args)");
        c = new a(h9.e.m(format));
        f407d = c(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        f408e = c(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        f409f = a1.c.v1(new d());
    }

    public static final e a(ErrorScopeKind errorScopeKind, boolean z10, String... strArr) {
        v7.g.f(strArr, "formatParams");
        return z10 ? new i(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length)) : new e(errorScopeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final e b(ErrorScopeKind errorScopeKind, String... strArr) {
        return a(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final f c(ErrorTypeKind errorTypeKind, String... strArr) {
        EmptyList emptyList = EmptyList.f12981i;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        v7.g.f(emptyList, "arguments");
        v7.g.f(strArr2, "formatParams");
        return e(errorTypeKind, emptyList, d(errorTypeKind, (String[]) Arrays.copyOf(strArr2, strArr2.length)), (String[]) Arrays.copyOf(strArr2, strArr2.length));
    }

    public static g d(ErrorTypeKind errorTypeKind, String... strArr) {
        v7.g.f(strArr, "formatParams");
        return new g(errorTypeKind, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static f e(ErrorTypeKind errorTypeKind, List list, e0 e0Var, String... strArr) {
        v7.g.f(list, "arguments");
        v7.g.f(strArr, "formatParams");
        return new f(e0Var, b(ErrorScopeKind.n, e0Var.toString()), errorTypeKind, list, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final boolean f(l8.f fVar) {
        if (fVar != null && ((fVar instanceof a) || (fVar.c() instanceof a) || fVar == f406b)) {
            return true;
        }
        return false;
    }
}
