package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ta.c;
import v7.g;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Tag", "invoke", "()Ljava/lang/Object;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TaggedDecoder$decodeSerializableElement$1 extends Lambda implements u7.a<T> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TaggedDecoder<Tag> f15654j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ qa.a<T> f15655k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ T f15656l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TaggedDecoder$decodeSerializableElement$1(TaggedDecoder<Tag> taggedDecoder, qa.a<? extends T> aVar, T t10) {
        super(0);
        this.f15654j = taggedDecoder;
        this.f15655k = aVar;
        this.f15656l = t10;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    @Override // u7.a
    public final T k0() {
        c cVar = this.f15654j;
        cVar.getClass();
        Object obj = this.f15655k;
        g.f(obj, "deserializer");
        return cVar.J(obj);
    }
}
