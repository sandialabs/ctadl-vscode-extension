package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import c8.d;
import java.lang.reflect.Member;
import kotlin.jvm.internal.FunctionReference;
import u7.l;
import v7.g;
import v7.i;

/* loaded from: classes.dex */
final /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReference implements l<Member, Boolean> {

    /* renamed from: r  reason: collision with root package name */
    public static final ReflectJavaClass$fields$1 f13589r = new ReflectJavaClass$fields$1();

    public ReflectJavaClass$fields$1() {
        super(1);
    }

    @Override // u7.l
    public final Boolean U(Member member) {
        Member member2 = member;
        g.f(member2, "p0");
        return Boolean.valueOf(member2.isSynthetic());
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final d d() {
        return i.a(Member.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String e() {
        return "isSynthetic()Z";
    }

    @Override // kotlin.jvm.internal.CallableReference, c8.a
    public final String getName() {
        return "isSynthetic";
    }
}
