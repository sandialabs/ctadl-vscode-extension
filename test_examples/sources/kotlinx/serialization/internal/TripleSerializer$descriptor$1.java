package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"A", "B", "C", "Lsa/a;", "Lm7/n;", "invoke", "(Lsa/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TripleSerializer$descriptor$1 extends Lambda implements l<sa.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TripleSerializer<A, B, C> f15660j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleSerializer$descriptor$1(TripleSerializer<A, B, C> tripleSerializer) {
        super(1);
        this.f15660j = tripleSerializer;
    }

    @Override // u7.l
    public final n U(sa.a aVar) {
        sa.a aVar2 = aVar;
        g.f(aVar2, "$this$buildClassSerialDescriptor");
        TripleSerializer<A, B, C> tripleSerializer = this.f15660j;
        sa.a.b(aVar2, "first", tripleSerializer.f15657a.a());
        sa.a.b(aVar2, "second", tripleSerializer.f15658b.a());
        sa.a.b(aVar2, "third", tripleSerializer.c.a());
        return n.f16010a;
    }
}
