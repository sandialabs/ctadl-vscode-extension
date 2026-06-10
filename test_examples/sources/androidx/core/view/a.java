package androidx.core.view;

import android.view.View;
import androidx.compose.ui.platform.AbstractComposeView;
import ga.h;
import ga.k;
import kotlin.sequences.SequencesKt__SequencesKt;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final k a(View view) {
        g.f(view, "<this>");
        return new k(new ViewKt$allViews$1(view, null));
    }

    public static final h b(AbstractComposeView abstractComposeView) {
        return SequencesKt__SequencesKt.O0(abstractComposeView.getParent(), ViewKt$ancestors$1.f4634r);
    }
}
