package z5;

import a1.c;
import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.app.domain.model.Font;
import com.noto.app.filtered.FilteredFragment;
import com.noto.app.label.LabelDialogFragment;
import com.noto.app.settings.general.FontDialogFragment;
import com.noto.app.settings.whatsnew.WhatsNewFragment;
import com.noto.app.util.ViewUtilsKt;
import com.noto.app.widget.NoteListWidgetConfigActivity;
import s6.j0;
import s6.t0;
import v7.g;
import w6.q;
import y6.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f19119i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f19120j;

    public /* synthetic */ a(int i10, Object obj) {
        this.f19119i = i10;
        this.f19120j = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f19119i;
        Object obj = this.f19120j;
        switch (i10) {
            case 1:
                FilteredFragment filteredFragment = (FilteredFragment) obj;
                int i11 = FilteredFragment.f8233f0;
                g.f(filteredFragment, "this$0");
                NavController g10 = ViewUtilsKt.g(filteredFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new q(new long[0], true, 0L, false, false, null), null);
                    return;
                }
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                LabelDialogFragment labelDialogFragment = (LabelDialogFragment) obj;
                int i12 = LabelDialogFragment.f8728w0;
                g.f(labelDialogFragment, "this$0");
                Context j2 = labelDialogFragment.j();
                if (j2 != null) {
                    c.W1(j2);
                }
                labelDialogFragment.Z();
                NavController g11 = ViewUtilsKt.g(labelDialogFragment);
                if (g11 != null) {
                    ViewUtilsKt.o(g11, new f(labelDialogFragment.h0().f18899a, labelDialogFragment.h0().f18900b), null);
                    return;
                }
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                FontDialogFragment fontDialogFragment = (FontDialogFragment) obj;
                int i13 = FontDialogFragment.f9681v0;
                g.f(fontDialogFragment, "this$0");
                ((com.noto.app.settings.c) fontDialogFragment.f9682u0.getValue()).n(Font.Nunito);
                fontDialogFragment.Z();
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                t0 t0Var = (t0) obj;
                int i14 = WhatsNewFragment.f9806e0;
                g.f(t0Var, "$this_setupListeners");
                t0Var.f17474a.j0(0);
                return;
            default:
                j0 j0Var = (j0) obj;
                int i15 = NoteListWidgetConfigActivity.L;
                g.f(j0Var, "$this_setupListeners");
                j0Var.f17394e.v(0);
                return;
        }
    }
}
