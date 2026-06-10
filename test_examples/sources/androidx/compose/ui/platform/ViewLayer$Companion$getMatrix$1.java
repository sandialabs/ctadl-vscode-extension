package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "Lm7/n;", "invoke", "(Landroid/view/View;Landroid/graphics/Matrix;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class ViewLayer$Companion$getMatrix$1 extends Lambda implements u7.p<View, Matrix, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public static final ViewLayer$Companion$getMatrix$1 f3780j = new ViewLayer$Companion$getMatrix$1();

    public ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // u7.p
    public final m7.n R(View view, Matrix matrix) {
        View view2 = view;
        Matrix matrix2 = matrix;
        v7.g.f(view2, "view");
        v7.g.f(matrix2, "matrix");
        matrix2.set(view2.getMatrix());
        return m7.n.f16010a;
    }
}
