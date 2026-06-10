package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/e;", "descriptor", "", "invoke", "(Lkotlin/reflect/jvm/internal/impl/descriptors/e;)Ljava/lang/CharSequence;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 extends Lambda implements l<kotlin.reflect.jvm.internal.impl.descriptors.e, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1 f13149j = new KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1();

    public KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar2 = eVar;
        v7.g.f(eVar2, "descriptor");
        return DescriptorRenderer.f14594b.F(eVar2) + " | " + i.c(eVar2).a();
    }
}
