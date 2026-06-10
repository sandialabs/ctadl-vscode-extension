package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/g0;", "rn", "Landroid/graphics/Matrix;", "matrix", "Lm7/n;", "invoke", "(Landroidx/compose/ui/platform/g0;Landroid/graphics/Matrix;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class RenderNodeLayer$Companion$getMatrix$1 extends Lambda implements u7.p<g0, Matrix, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public static final RenderNodeLayer$Companion$getMatrix$1 f3759j = new RenderNodeLayer$Companion$getMatrix$1();

    public RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // u7.p
    public final m7.n R(g0 g0Var, Matrix matrix) {
        g0 g0Var2 = g0Var;
        Matrix matrix2 = matrix;
        v7.g.f(g0Var2, "rn");
        v7.g.f(matrix2, "matrix");
        g0Var2.R(matrix2);
        return m7.n.f16010a;
    }
}
