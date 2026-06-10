package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import l8.z;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll8/z;", "descriptor", "", "invoke", "(Ll8/z;)Ljava/lang/CharSequence;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1 extends Lambda implements l<z, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public static final KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1 f13150j = new KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1();

    public KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1() {
        super(1);
    }

    @Override // u7.l
    public final CharSequence U(z zVar) {
        z zVar2 = zVar;
        v7.g.f(zVar2, "descriptor");
        return DescriptorRenderer.f14594b.F(zVar2) + " | " + i.b(zVar2).a();
    }
}
