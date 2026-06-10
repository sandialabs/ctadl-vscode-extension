package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.Lambda;
import l8.i0;
import u7.l;
import v7.g;
import y9.m0;

/* loaded from: classes.dex */
public final class AbstractTypeAliasDescriptor$isInner$1 extends Lambda implements l<m0, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AbstractTypeAliasDescriptor f13513j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeAliasDescriptor$isInner$1(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        super(1);
        this.f13513j = abstractTypeAliasDescriptor;
    }

    @Override // u7.l
    public final Boolean U(m0 m0Var) {
        boolean z10;
        m0 m0Var2 = m0Var;
        g.e(m0Var2, "type");
        boolean z11 = false;
        if (!m0.b.D0(m0Var2)) {
            l8.d c = m0Var2.U0().c();
            if ((c instanceof i0) && !g.a(((i0) c).c(), this.f13513j)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }
}
