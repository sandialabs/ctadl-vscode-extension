package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import qa.b;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "Tag", "invoke", "()Ljava/lang/Object;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TaggedDecoder$decodeNullableSerializableElement$1 extends Lambda implements u7.a<Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaggedDecoder<Object> f15651j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ qa.a<Object> f15652k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f15653l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaggedDecoder$decodeNullableSerializableElement$1(TaggedDecoder taggedDecoder, b bVar, Object obj) {
        super(0);
        this.f15651j = taggedDecoder;
        this.f15652k = bVar;
        this.f15653l = obj;
    }

    @Override // u7.a
    public final Object k0() {
        TaggedDecoder<Object> taggedDecoder = this.f15651j;
        if (taggedDecoder.o()) {
            qa.a<? extends T> aVar = this.f15652k;
            g.f(aVar, "deserializer");
            return taggedDecoder.J(aVar);
        }
        return null;
    }
}
