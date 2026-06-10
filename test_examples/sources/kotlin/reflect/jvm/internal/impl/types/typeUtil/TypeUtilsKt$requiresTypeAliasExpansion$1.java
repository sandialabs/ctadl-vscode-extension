package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import kotlin.jvm.internal.Lambda;
import l8.d;
import l8.h0;
import l8.i0;
import u7.l;
import v7.g;
import y9.m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TypeUtilsKt$requiresTypeAliasExpansion$1 extends Lambda implements l<m0, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final TypeUtilsKt$requiresTypeAliasExpansion$1 f15078j = new TypeUtilsKt$requiresTypeAliasExpansion$1();

    public TypeUtilsKt$requiresTypeAliasExpansion$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(m0 m0Var) {
        boolean z10;
        m0 m0Var2 = m0Var;
        g.f(m0Var2, "it");
        d c = m0Var2.U0().c();
        if (c != null && ((c instanceof h0) || (c instanceof i0))) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
