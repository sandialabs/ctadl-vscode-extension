package l6;

import android.animation.TimeInterpolator;
import com.noto.R;

/* loaded from: classes.dex */
public final class h extends j<c> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h() {
        super(r0, r1);
        c cVar = new c();
        cVar.f15814a = 0.3f;
        l lVar = new l(true);
        lVar.f15825d = false;
        lVar.f15824b = 0.8f;
    }

    @Override // l6.j
    public final TimeInterpolator P() {
        return e5.a.f10647a;
    }

    @Override // l6.j
    public final int Q(boolean z10) {
        return z10 ? R.attr.motionDurationMedium4 : R.attr.motionDurationShort3;
    }

    @Override // l6.j
    public final int R(boolean z10) {
        return z10 ? R.attr.motionEasingEmphasizedDecelerateInterpolator : R.attr.motionEasingEmphasizedAccelerateInterpolator;
    }
}
