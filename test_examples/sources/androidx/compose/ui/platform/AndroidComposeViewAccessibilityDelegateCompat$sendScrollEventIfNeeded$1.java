package androidx.compose.ui.platform;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1 extends Lambda implements u7.a<m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a1 f3647j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f3648k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, a1 a1Var) {
        super(0);
        this.f3647j = a1Var;
        this.f3648k = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r4 == false) goto L23;
     */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m7.n k0() {
        float f10;
        float f11;
        boolean z10;
        a1 a1Var = this.f3647j;
        o1.h hVar = a1Var.f3826m;
        o1.h hVar2 = a1Var.n;
        Float f12 = a1Var.f3824k;
        Float f13 = a1Var.f3825l;
        if (hVar != null && f12 != null) {
            f10 = hVar.f16191a.k0().floatValue() - f12.floatValue();
        } else {
            f10 = 0.0f;
        }
        if (hVar2 != null && f13 != null) {
            f11 = hVar2.f16191a.k0().floatValue() - f13.floatValue();
        } else {
            f11 = 0.0f;
        }
        boolean z11 = false;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (f11 == 0.0f) {
                z11 = true;
            }
        }
        int i10 = a1Var.f3822i;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f3648k;
        int y10 = androidComposeViewAccessibilityDelegateCompat.y(i10);
        AndroidComposeViewAccessibilityDelegateCompat.B(androidComposeViewAccessibilityDelegateCompat, y10, 2048, 1, 8);
        AccessibilityEvent l2 = androidComposeViewAccessibilityDelegateCompat.l(y10, 4096);
        if (hVar != null) {
            l2.setScrollX((int) hVar.f16191a.k0().floatValue());
            l2.setMaxScrollX((int) hVar.f16192b.k0().floatValue());
        }
        if (hVar2 != null) {
            l2.setScrollY((int) hVar2.f16191a.k0().floatValue());
            l2.setMaxScrollY((int) hVar2.f16192b.k0().floatValue());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AndroidComposeViewAccessibilityDelegateCompat.c.a(l2, (int) f10, (int) f11);
        }
        androidComposeViewAccessibilityDelegateCompat.z(l2);
        if (hVar != null) {
            a1Var.f3824k = hVar.f16191a.k0();
        }
        if (hVar2 != null) {
            a1Var.f3825l = hVar2.f16191a.k0();
        }
        return m7.n.f16010a;
    }
}
