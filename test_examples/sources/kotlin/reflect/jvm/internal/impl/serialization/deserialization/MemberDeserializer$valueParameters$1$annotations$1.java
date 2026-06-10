package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class MemberDeserializer$valueParameters$1$annotations$1 extends Lambda implements u7.a<List<? extends m8.c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MemberDeserializer f14800j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ f f14801k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ h f14802l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ AnnotatedCallableKind f14803m;
    public final /* synthetic */ int n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ProtoBuf$ValueParameter f14804o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$valueParameters$1$annotations$1(MemberDeserializer memberDeserializer, f fVar, h hVar, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        super(0);
        this.f14800j = memberDeserializer;
        this.f14801k = fVar;
        this.f14802l = hVar;
        this.f14803m = annotatedCallableKind;
        this.n = i10;
        this.f14804o = protoBuf$ValueParameter;
    }

    @Override // u7.a
    public final List<? extends m8.c> k0() {
        return kotlin.collections.c.L2(this.f14800j.f14777a.f17920a.f17904e.e(this.f14801k, this.f14802l, this.f14803m, this.n, this.f14804o));
    }
}
