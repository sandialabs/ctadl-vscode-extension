package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import l8.l;
import l8.m;
import u7.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll8/m;", "kotlin.jvm.PlatformType", "first", "second", "", "invoke", "(Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)Ljava/lang/Integer;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 extends Lambda implements p<m, m, Integer> {

    /* renamed from: j  reason: collision with root package name */
    public static final KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 f13151j = new KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2();

    public KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2() {
        super(2);
    }

    @Override // u7.p
    public final Integer R(m mVar, m mVar2) {
        int intValue;
        Integer b5 = l.b(mVar, mVar2);
        if (b5 == null) {
            intValue = 0;
        } else {
            intValue = b5.intValue();
        }
        return Integer.valueOf(intValue);
    }
}
