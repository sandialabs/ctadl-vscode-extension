package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import qa.b;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"K", "V", "Lsa/a;", "Lm7/n;", "invoke", "(Lsa/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PairSerializer$descriptor$1 extends Lambda implements l<sa.a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b<K> f15633j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b<V> f15634k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairSerializer$descriptor$1(b<K> bVar, b<V> bVar2) {
        super(1);
        this.f15633j = bVar;
        this.f15634k = bVar2;
    }

    @Override // u7.l
    public final n U(sa.a aVar) {
        sa.a aVar2 = aVar;
        g.f(aVar2, "$this$buildClassSerialDescriptor");
        sa.a.b(aVar2, "first", this.f15633j.a());
        sa.a.b(aVar2, "second", this.f15634k.a());
        return n.f16010a;
    }
}
