package aa;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import l8.i0;
import y9.e0;
import y9.r;

/* loaded from: classes.dex */
public final class g implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public final ErrorTypeKind f403a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f404b;
    public final String c;

    public g(ErrorTypeKind errorTypeKind, String... strArr) {
        v7.g.f(strArr, "formatParams");
        this.f403a = errorTypeKind;
        this.f404b = strArr;
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(errorTypeKind.f15030i, Arrays.copyOf(copyOf, copyOf.length));
        v7.g.e(format, "format(this, *args)");
        String format2 = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{format}, 1));
        v7.g.e(format2, "format(this, *args)");
        this.c = format2;
    }

    @Override // y9.e0
    public final boolean a() {
        return false;
    }

    @Override // y9.e0
    public final l8.d c() {
        h.f405a.getClass();
        return h.c;
    }

    @Override // y9.e0
    public final List<i0> e() {
        return EmptyList.f12981i;
    }

    @Override // y9.e0
    public final Collection<r> f() {
        return EmptyList.f12981i;
    }

    public final String toString() {
        return this.c;
    }

    @Override // y9.e0
    public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
        kotlin.reflect.jvm.internal.impl.builtins.b bVar = kotlin.reflect.jvm.internal.impl.builtins.b.f13322f;
        return kotlin.reflect.jvm.internal.impl.builtins.b.f13322f;
    }
}
