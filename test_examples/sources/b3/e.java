package b3;

import a3.j0;
import a3.v0;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import h6.n;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final d f6355a;

    public e(d dVar) {
        this.f6355a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f6355a.equals(((e) obj).f6355a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6355a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        boolean z11;
        n nVar = ((h6.i) this.f6355a).f11468a;
        AutoCompleteTextView autoCompleteTextView = nVar.f11476h;
        if (autoCompleteTextView != null) {
            int i10 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (z10) {
                    i10 = 2;
                }
                WeakHashMap<View, v0> weakHashMap = j0.f188a;
                j0.d.s(nVar.f11488d, i10);
            }
        }
    }
}
