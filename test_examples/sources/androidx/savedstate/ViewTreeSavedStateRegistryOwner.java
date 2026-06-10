package androidx.savedstate;

import android.view.View;
import b4.d;
import com.noto.R;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.a;
import v7.g;

/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final d a(View view) {
        g.f(view, "<this>");
        return (d) a.U0(a.X0(SequencesKt__SequencesKt.O0(view, ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1.f6063j), ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2.f6064j));
    }

    public static final void b(View view, d dVar) {
        g.f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, dVar);
    }
}
