package v;

import androidx.compose.ui.platform.InspectableValueKt;
import q0.a;
import q0.b;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public static final e f18047a = new e();

    @Override // v.d
    public final q0.d a(boolean z10) {
        boolean z11;
        if (1.0f > 0.0d) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return new m(z10, InspectableValueKt.f3744a);
        }
        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero".toString());
    }

    @Override // v.d
    public final q0.d b(q0.d dVar) {
        b.a aVar = a.C0210a.f16817g;
        v7.g.f(dVar, "<this>");
        return dVar.Z(new i(aVar, InspectableValueKt.f3744a));
    }
}
