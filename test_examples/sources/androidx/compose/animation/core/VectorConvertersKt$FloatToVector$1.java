package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import r.f;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lr/f;", "invoke", "(F)Lr/f;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class VectorConvertersKt$FloatToVector$1 extends Lambda implements l<Float, f> {

    /* renamed from: j  reason: collision with root package name */
    public static final VectorConvertersKt$FloatToVector$1 f1339j = new VectorConvertersKt$FloatToVector$1();

    public VectorConvertersKt$FloatToVector$1() {
        super(1);
    }

    @Override // u7.l
    public final f U(Float f10) {
        return new f(f10.floatValue());
    }
}
