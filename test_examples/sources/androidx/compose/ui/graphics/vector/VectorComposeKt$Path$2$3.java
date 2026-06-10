package androidx.compose.ui.graphics.vector;

import android.graphics.Path;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v0.a0;
import v0.h;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class VectorComposeKt$Path$2$3 extends Lambda implements p<PathComponent, a0, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final VectorComposeKt$Path$2$3 f3203j = new VectorComposeKt$Path$2$3();

    public VectorComposeKt$Path$2$3() {
        super(2);
    }

    @Override // u7.p
    public final n R(PathComponent pathComponent, a0 a0Var) {
        Path.FillType fillType;
        PathComponent pathComponent2 = pathComponent;
        int i10 = a0Var.f18084a;
        g.f(pathComponent2, "$this$set");
        h hVar = pathComponent2.f3158s;
        hVar.getClass();
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10) {
            fillType = Path.FillType.EVEN_ODD;
        } else {
            fillType = Path.FillType.WINDING;
        }
        hVar.f18115a.setFillType(fillType);
        pathComponent2.c();
        return n.f16010a;
    }
}
