package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.internal.Lambda;
import l8.d;
import l8.h0;
import l8.i0;
import u7.l;
import v7.g;
import y9.m0;

/* loaded from: classes.dex */
public final class TypeUtilsKt$containsTypeAliasParameters$1 extends Lambda implements l<m0, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final TypeUtilsKt$containsTypeAliasParameters$1 f15077j = new TypeUtilsKt$containsTypeAliasParameters$1();

    public TypeUtilsKt$containsTypeAliasParameters$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(m0 m0Var) {
        boolean z10;
        m0 m0Var2 = m0Var;
        g.f(m0Var2, "it");
        d c = m0Var2.U0().c();
        if (c != null && (c instanceof i0) && (((i0) c).c() instanceof h0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
