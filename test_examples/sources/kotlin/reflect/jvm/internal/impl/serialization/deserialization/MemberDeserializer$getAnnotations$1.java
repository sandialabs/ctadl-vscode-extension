package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class MemberDeserializer$getAnnotations$1 extends Lambda implements u7.a<List<? extends m8.c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MemberDeserializer f14779j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h f14780k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ AnnotatedCallableKind f14781l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getAnnotations$1(MemberDeserializer memberDeserializer, h hVar, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.f14779j = memberDeserializer;
        this.f14780k = hVar;
        this.f14781l = annotatedCallableKind;
    }

    @Override // u7.a
    public final List<? extends m8.c> k0() {
        List<? extends m8.c> list;
        MemberDeserializer memberDeserializer = this.f14779j;
        f a10 = memberDeserializer.a(memberDeserializer.f14777a.c);
        if (a10 != null) {
            list = kotlin.collections.c.L2(memberDeserializer.f14777a.f17920a.f17904e.i(a10, this.f14780k, this.f14781l));
        } else {
            list = null;
        }
        if (list == null) {
            return EmptyList.f12981i;
        }
        return list;
    }
}
