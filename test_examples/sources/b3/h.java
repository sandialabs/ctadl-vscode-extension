package b3;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6376a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final h f6377a;

        public a(h hVar) {
            this.f6377a = hVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            g a10 = this.f6377a.a(i10);
            if (a10 == null) {
                return null;
            }
            return a10.f6357a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            this.f6377a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f6377a.c(i10, i11, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(h hVar) {
            super(hVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i10) {
            g b5 = this.f6377a.b(i10);
            if (b5 == null) {
                return null;
            }
            return b5.f6357a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(h hVar) {
            super(hVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f6377a.getClass();
        }
    }

    public h() {
        this.f6376a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public h(AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f6376a = accessibilityNodeProvider;
    }

    public g a(int i10) {
        return null;
    }

    public g b(int i10) {
        return null;
    }

    public boolean c(int i10, int i11, Bundle bundle) {
        return false;
    }
}
