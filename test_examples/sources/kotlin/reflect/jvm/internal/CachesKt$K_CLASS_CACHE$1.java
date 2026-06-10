package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/KClassImpl;", "", "kotlin.jvm.PlatformType", "it", "Ljava/lang/Class;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CachesKt$K_CLASS_CACHE$1 extends Lambda implements l<Class<?>, KClassImpl<? extends Object>> {

    /* renamed from: j  reason: collision with root package name */
    public static final CachesKt$K_CLASS_CACHE$1 f13082j = new CachesKt$K_CLASS_CACHE$1();

    public CachesKt$K_CLASS_CACHE$1() {
        super(1);
    }

    @Override // u7.l
    public final KClassImpl<? extends Object> U(Class<?> cls) {
        Class<?> cls2 = cls;
        v7.g.f(cls2, "it");
        return new KClassImpl<>(cls2);
    }
}
