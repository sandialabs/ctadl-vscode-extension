package kotlinx.serialization;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import m7.n;
import sa.c;
import sa.e;
import sa.h;
import u7.a;
import u7.l;
import ua.s1;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lsa/e;", "invoke", "()Lsa/e;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SealedClassSerializer$descriptor$2 extends Lambda implements a<e> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f15584j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ SealedClassSerializer<T> f15585k;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lsa/a;", "Lm7/n;", "invoke", "(Lsa/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.SealedClassSerializer$descriptor$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<sa.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ SealedClassSerializer<Object> f15586j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SealedClassSerializer<Object> sealedClassSerializer) {
            super(1);
            this.f15586j = sealedClassSerializer;
        }

        @Override // u7.l
        public final n U(sa.a aVar) {
            sa.a aVar2 = aVar;
            g.f(aVar2, "$this$buildSerialDescriptor");
            sa.a.b(aVar2, "type", s1.f18011b);
            StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
            SealedClassSerializer<Object> sealedClassSerializer = this.f15586j;
            sb.append(sealedClassSerializer.f15580a.d());
            sb.append('>');
            sa.a.b(aVar2, "value", kotlinx.serialization.descriptors.a.c(sb.toString(), h.a.f17530a, new e[0], new SealedClassSerializer$descriptor$2$1$elementDescriptor$1(sealedClassSerializer)));
            EmptyList emptyList = sealedClassSerializer.f15581b;
            g.f(emptyList, "<set-?>");
            aVar2.f17509b = emptyList;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer$descriptor$2(String str, SealedClassSerializer<T> sealedClassSerializer) {
        super(0);
        this.f15584j = str;
        this.f15585k = sealedClassSerializer;
    }

    @Override // u7.a
    public final e k0() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15585k);
        return kotlinx.serialization.descriptors.a.c(this.f15584j, c.b.f17517a, new e[0], anonymousClass1);
    }
}
