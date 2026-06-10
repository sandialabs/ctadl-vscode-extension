package kotlinx.serialization;

import a1.c;
import androidx.datastore.preferences.PreferencesProto$Value;
import c8.b;
import c8.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc8/b;", "", "clazz", "", "Lc8/k;", "types", "Lqa/b;", "invoke", "(Lc8/b;Ljava/util/List;)Lqa/b;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1 extends Lambda implements p<b<Object>, List<? extends k>, qa.b<? extends Object>> {

    /* renamed from: j  reason: collision with root package name */
    public static final SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1 f15591j = new SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1();

    public SerializersCacheKt$PARAMETRIZED_SERIALIZERS_CACHE$1() {
        super(2);
    }

    @Override // u7.p
    public final qa.b<? extends Object> R(b<Object> bVar, List<? extends k> list) {
        b<Object> bVar2 = bVar;
        List<? extends k> list2 = list;
        g.f(bVar2, "clazz");
        g.f(list2, "types");
        ArrayList r1 = c.r1(xa.c.f18773a, list2, true);
        g.c(r1);
        return c.g1(bVar2, list2, r1);
    }
}
