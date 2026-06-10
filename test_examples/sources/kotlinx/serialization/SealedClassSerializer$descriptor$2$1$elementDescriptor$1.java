package kotlinx.serialization;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import qa.b;
import sa.a;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lsa/a;", "Lm7/n;", "invoke", "(Lsa/a;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SealedClassSerializer$descriptor$2$1$elementDescriptor$1 extends Lambda implements l<a, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SealedClassSerializer<Object> f15587j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SealedClassSerializer$descriptor$2$1$elementDescriptor$1(SealedClassSerializer<Object> sealedClassSerializer) {
        super(1);
        this.f15587j = sealedClassSerializer;
    }

    @Override // u7.l
    public final n U(a aVar) {
        a aVar2 = aVar;
        g.f(aVar2, "$this$buildSerialDescriptor");
        for (Map.Entry entry : this.f15587j.f15583e.entrySet()) {
            a.b(aVar2, (String) entry.getKey(), ((b) entry.getValue()).a());
        }
        return n.f16010a;
    }
}
