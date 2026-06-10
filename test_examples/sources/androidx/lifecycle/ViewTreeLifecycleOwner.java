package androidx.lifecycle;

import android.view.View;
import com.noto.R;
import kotlin.sequences.SequencesKt__SequencesKt;

/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    public static final q a(View view) {
        v7.g.f(view, "<this>");
        return (q) kotlin.sequences.a.U0(kotlin.sequences.a.X0(SequencesKt__SequencesKt.O0(view, ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.f5361j), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.f5362j));
    }

    public static final void b(View view, q qVar) {
        v7.g.f(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, qVar);
    }
}
