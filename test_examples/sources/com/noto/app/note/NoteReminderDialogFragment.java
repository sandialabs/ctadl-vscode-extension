package com.noto.app.note;

import a7.m0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.noto.R;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/note/NoteReminderDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteReminderDialogFragment extends o6.b {

    /* renamed from: x0  reason: collision with root package name */
    public static final /* synthetic */ int f9176x0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final m7.e f9177u0;

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.navigation.f f9178v0;

    /* renamed from: w0  reason: collision with root package name */
    public final m7.e f9179w0;

    public NoteReminderDialogFragment() {
        super(false, 1, null);
        this.f9177u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NoteReminderDialogFragment$special$$inlined$viewModel$default$1(this, new NoteReminderDialogFragment$viewModel$2(this)));
        this.f9178v0 = new androidx.navigation.f(v7.i.a(m0.class), new NoteReminderDialogFragment$special$$inlined$navArgs$1(this));
        this.f9179w0 = kotlin.a.b(new NoteReminderDialogFragment$alarmManager$2(this));
    }

    public final NoteViewModel g0() {
        return (NoteViewModel) this.f9177u0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.note_reminder_dialog_fragment, viewGroup, false);
        int i10 = R.id.btn_done;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_done);
        if (materialButton != null) {
            i10 = R.id.et;
            TextInputEditText textInputEditText = (TextInputEditText) a1.b.O(inflate, R.id.et);
            if (textInputEditText != null) {
                i10 = R.id.ll;
                if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                    i10 = R.id.tb;
                    View O = a1.b.O(inflate, R.id.tb);
                    if (O != null) {
                        s6.c a10 = s6.c.a(O);
                        TextInputLayout textInputLayout = (TextInputLayout) a1.b.O(inflate, R.id.til);
                        if (textInputLayout != null) {
                            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                            s6.m0 m0Var = new s6.m0(nestedScrollView, materialButton, textInputEditText, a10, textInputLayout);
                            Context j2 = j();
                            if (j2 != null) {
                                str = q.f(j2, R.string.new_note_reminder, new Object[0]);
                            } else {
                                str = null;
                            }
                            a10.c.setText(str);
                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteReminderDialogFragment$setupState$1(this, m0Var, null), g0().f9270q), ma.i.z(this));
                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NoteReminderDialogFragment$setupState$2(this, m0Var, null), g0().h()), ma.i.z(this));
                            materialButton.setOnClickListener(new h6.b(9, this));
                            textInputLayout.setEndIconOnClickListener(new g(3, this));
                            v7.g.e(nestedScrollView, "root");
                            return nestedScrollView;
                        }
                        i10 = R.id.til;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
