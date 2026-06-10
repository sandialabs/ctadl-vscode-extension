package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.k;
import c8.m;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Ljava/lang/Class;", "it", "j$/util/concurrent/ConcurrentHashMap", "Lkotlin/Pair;", "", "Lc8/m;", "", "Lkotlin/reflect/jvm/internal/Key;", "Lc8/k;", "invoke", "(Ljava/lang/Class;)Lj$/util/concurrent/ConcurrentHashMap;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1 extends Lambda implements l<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends m>, ? extends Boolean>, k>> {

    /* renamed from: j  reason: collision with root package name */
    public static final CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1 f13080j = new CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1();

    public CachesKt$CACHE_FOR_GENERIC_CLASSIFIERS$1() {
        super(1);
    }

    @Override // u7.l
    public final ConcurrentHashMap<Pair<? extends List<? extends m>, ? extends Boolean>, k> U(Class<?> cls) {
        v7.g.f(cls, "it");
        return new ConcurrentHashMap<>();
    }
}
