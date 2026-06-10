package kotlinx.serialization;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ra.a;
import u7.l;
import ua.l1;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc8/b;", "it", "Lqa/b;", "", "invoke", "(Lc8/b;)Lqa/b;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1 extends Lambda implements l<b<?>, qa.b<Object>> {

    /* renamed from: j  reason: collision with root package name */
    public static final SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1 f15594j = new SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1();

    public SerializersCacheKt$SERIALIZERS_CACHE_NULLABLE$1() {
        super(1);
    }

    @Override // u7.l
    public final qa.b<Object> U(b<?> bVar) {
        b<?> bVar2 = bVar;
        g.f(bVar2, "it");
        qa.b<? extends Object> D = a1.b.D(bVar2, new qa.b[0]);
        if (D == null) {
            D = l1.f17990a.get(bVar2);
        }
        if (D != null) {
            return a.a(D);
        }
        return null;
    }
}
