package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import u9.g;

/* loaded from: classes.dex */
public final class MemberDeserializer$getPropertyFieldAnnotations$1 extends Lambda implements u7.a<List<? extends m8.c>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MemberDeserializer f14782j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f14783k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ ProtoBuf$Property f14784l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemberDeserializer$getPropertyFieldAnnotations$1(MemberDeserializer memberDeserializer, boolean z10, ProtoBuf$Property protoBuf$Property) {
        super(0);
        this.f14782j = memberDeserializer;
        this.f14783k = z10;
        this.f14784l = protoBuf$Property;
    }

    @Override // u7.a
    public final List<? extends m8.c> k0() {
        List<? extends m8.c> list;
        List<m8.c> c;
        MemberDeserializer memberDeserializer = this.f14782j;
        f a10 = memberDeserializer.a(memberDeserializer.f14777a.c);
        if (a10 != null) {
            g gVar = memberDeserializer.f14777a;
            boolean z10 = this.f14783k;
            ProtoBuf$Property protoBuf$Property = this.f14784l;
            if (z10) {
                c = gVar.f17920a.f17904e.f(a10, protoBuf$Property);
            } else {
                c = gVar.f17920a.f17904e.c(a10, protoBuf$Property);
            }
            list = kotlin.collections.c.L2(c);
        } else {
            list = null;
        }
        if (list == null) {
            return EmptyList.f12981i;
        }
        return list;
    }
}
