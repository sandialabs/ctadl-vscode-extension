package androidx.compose.ui.text;

import a2.i;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "La2/i;", "invoke", "(Ljava/lang/Object;)La2/i;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SaversKt$TextGeometricTransformSaver$2 extends Lambda implements l<Object, i> {

    /* renamed from: j  reason: collision with root package name */
    public static final SaversKt$TextGeometricTransformSaver$2 f4045j = new SaversKt$TextGeometricTransformSaver$2();

    public SaversKt$TextGeometricTransformSaver$2() {
        super(1);
    }

    @Override // u7.l
    public final i U(Object obj) {
        g.f(obj, "it");
        List list = (List) obj;
        return new i(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }
}
