package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.p;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class LazyJavaClassMemberScope$computeMemberIndex$1 extends Lambda implements l<p, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public static final LazyJavaClassMemberScope$computeMemberIndex$1 f13748j = new LazyJavaClassMemberScope$computeMemberIndex$1();

    public LazyJavaClassMemberScope$computeMemberIndex$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(p pVar) {
        p pVar2 = pVar;
        g.f(pVar2, "it");
        return Boolean.valueOf(!pVar2.S());
    }
}
