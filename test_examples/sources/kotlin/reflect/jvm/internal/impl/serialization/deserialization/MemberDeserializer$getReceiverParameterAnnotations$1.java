package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MemberDeserializer$getReceiverParameterAnnotations$1 extends Lambda implements u7.a<List<? extends m8.c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MemberDeserializer f14785j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h f14786k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ AnnotatedCallableKind f14787l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getReceiverParameterAnnotations$1(MemberDeserializer memberDeserializer, h hVar, AnnotatedCallableKind annotatedCallableKind) {
        super(0);
        this.f14785j = memberDeserializer;
        this.f14786k = hVar;
        this.f14787l = annotatedCallableKind;
    }

    @Override // u7.a
    public final List<? extends m8.c> k0() {
        List<m8.c> list;
        MemberDeserializer memberDeserializer = this.f14785j;
        f a10 = memberDeserializer.a(memberDeserializer.f14777a.c);
        if (a10 != null) {
            list = memberDeserializer.f14777a.f17920a.f17904e.d(a10, this.f14786k, this.f14787l);
        } else {
            list = null;
        }
        if (list == null) {
            return EmptyList.f12981i;
        }
        return list;
    }
}
