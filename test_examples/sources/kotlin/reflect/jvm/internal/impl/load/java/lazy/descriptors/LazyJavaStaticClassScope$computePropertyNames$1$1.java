package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h9.e;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements l<MemberScope, Collection<? extends e>> {

    /* renamed from: j  reason: collision with root package name */
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 f13820j = new LazyJavaStaticClassScope$computePropertyNames$1$1();

    public LazyJavaStaticClassScope$computePropertyNames$1$1() {
        super(1);
    }

    @Override // u7.l
    public final Collection<? extends e> U(MemberScope memberScope) {
        MemberScope memberScope2 = memberScope;
        g.f(memberScope2, "it");
        return memberScope2.d();
    }
}
