package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import u7.l;
import y9.r;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/h;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/reflect/jvm/internal/impl/descriptors/h;)Ljava/lang/CharSequence;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ReflectionObjectRenderer$renderFunction$1$1 extends Lambda implements l<kotlin.reflect.jvm.internal.impl.descriptors.h, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final ReflectionObjectRenderer$renderFunction$1$1 f13233j = new ReflectionObjectRenderer$renderFunction$1$1();

    public ReflectionObjectRenderer$renderFunction$1$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f13232a;
        r b5 = hVar.b();
        v7.g.e(b5, "it.type");
        return ReflectionObjectRenderer.d(b5);
    }
}
