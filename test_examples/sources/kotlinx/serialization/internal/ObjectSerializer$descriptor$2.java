package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.b;
import m7.n;
import sa.e;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lsa/e;", "invoke", "()Lsa/e;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ObjectSerializer$descriptor$2 extends Lambda implements u7.a<e> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f15630j = "kotlin.Unit";

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a<Object> f15631k;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lsa/a;", "Lm7/n;", "invoke", "(Lsa/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: kotlinx.serialization.internal.ObjectSerializer$descriptor$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<sa.a, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ a<Object> f15632j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a<Object> aVar) {
            super(1);
            this.f15632j = aVar;
        }

        @Override // u7.l
        public final n U(sa.a aVar) {
            sa.a aVar2 = aVar;
            g.f(aVar2, "$this$buildSerialDescriptor");
            EmptyList emptyList = this.f15632j.f15662b;
            g.f(emptyList, "<set-?>");
            aVar2.f17509b = emptyList;
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectSerializer$descriptor$2(a aVar) {
        super(0);
        this.f15631k = aVar;
    }

    @Override // u7.a
    public final e k0() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15631k);
        return kotlinx.serialization.descriptors.a.c(this.f15630j, b.d.f15612a, new e[0], anonymousClass1);
    }
}
