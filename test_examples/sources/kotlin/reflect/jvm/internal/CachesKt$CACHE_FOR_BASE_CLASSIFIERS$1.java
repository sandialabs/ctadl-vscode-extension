package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.k;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/lang/Class;", "it", "Lc8/k;", "invoke", "(Ljava/lang/Class;)Lc8/k;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1 extends Lambda implements l<Class<?>, k> {

    /* renamed from: j  reason: collision with root package name */
    public static final CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1 f13079j = new CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1();

    public CachesKt$CACHE_FOR_BASE_CLASSIFIERS$1() {
        super(1);
    }

    @Override // u7.l
    public final k U(Class<?> cls) {
        Class<?> cls2 = cls;
        v7.g.f(cls2, "it");
        KClassImpl a10 = CachesKt.a(cls2);
        EmptyList emptyList = EmptyList.f12981i;
        return d8.a.a(a10, emptyList, false, emptyList);
    }
}
