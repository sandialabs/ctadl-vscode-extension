package com.noto.app.label;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.s;
import androidx.navigation.f;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m7.e;
import s6.c;
import s6.z;
import v7.g;
import v7.i;
import y6.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/label/NewLabelDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NewLabelDialogFragment extends o6.b {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f8766w0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f8767u0;

    /* renamed from: v0  reason: collision with root package name */
    public final f f8768v0;

    public NewLabelDialogFragment() {
        super(false, 1, null);
        this.f8767u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NewLabelDialogFragment$special$$inlined$viewModel$default$1(this, new NewLabelDialogFragment$viewModel$2(this)));
        this.f8768v0 = new f(i.a(o.class), new NewLabelDialogFragment$special$$inlined$navArgs$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        Context j2;
        int i10;
        String str2;
        String str3;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.new_label_dialog_fragment, viewGroup, false);
        int i11 = R.id.btn_create;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_create);
        if (materialButton != null) {
            i11 = R.id.et;
            TextInputEditText textInputEditText = (TextInputEditText) a1.b.O(inflate, R.id.et);
            if (textInputEditText != null) {
                i11 = R.id.ll;
                if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                    i11 = R.id.tb;
                    View O = a1.b.O(inflate, R.id.tb);
                    if (O != null) {
                        c a10 = c.a(O);
                        TextInputLayout textInputLayout = (TextInputLayout) a1.b.O(inflate, R.id.til);
                        if (textInputLayout != null) {
                            if (((MaterialTextView) a1.b.O(inflate, R.id.tv_label_title)) != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                final z zVar = new z(nestedScrollView, materialButton, textInputEditText, a10, textInputLayout);
                                textInputEditText.requestFocus();
                                s c = c();
                                if (c != null) {
                                    g.e(nestedScrollView, "root");
                                    ViewUtilsKt.v(c, nestedScrollView);
                                }
                                long j10 = ((o) this.f8768v0.getValue()).f18924b;
                                MaterialTextView materialTextView = a10.c;
                                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                                Context j11 = j();
                                if (i12 == 0) {
                                    if (j11 != null) {
                                        str3 = q.f(j11, R.string.new_label, new Object[0]);
                                    } else {
                                        str3 = null;
                                    }
                                    materialTextView.setText(str3);
                                    j2 = j();
                                    if (j2 != null) {
                                        i10 = R.string.create_label;
                                        str2 = q.f(j2, i10, new Object[0]);
                                    }
                                    str2 = null;
                                } else {
                                    if (j11 != null) {
                                        str = q.f(j11, R.string.edit_label, new Object[0]);
                                    } else {
                                        str = null;
                                    }
                                    materialTextView.setText(str);
                                    j2 = j();
                                    if (j2 != null) {
                                        i10 = R.string.update_label;
                                        str2 = q.f(j2, i10, new Object[0]);
                                    }
                                    str2 = null;
                                }
                                materialButton.setText(str2);
                                e eVar = this.f8767u0;
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NewLabelDialogFragment$setupState$1(this, zVar, null), ((LabelViewModel) eVar.getValue()).f8753g), ma.i.z(this));
                                kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NewLabelDialogFragment$setupState$2(zVar, null), ((LabelViewModel) eVar.getValue()).f8755i), ma.i.z(this));
                                materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.label.b
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        int i13 = NewLabelDialogFragment.f8766w0;
                                        z zVar2 = z.this;
                                        g.f(zVar2, "$this_setupListeners");
                                        NewLabelDialogFragment newLabelDialogFragment = this;
                                        g.f(newLabelDialogFragment, "this$0");
                                        String valueOf = String.valueOf(zVar2.c.getText());
                                        if (ha.i.T0(valueOf)) {
                                            TextInputLayout textInputLayout2 = zVar2.f17500e;
                                            textInputLayout2.setErrorEnabled(true);
                                            Context j12 = newLabelDialogFragment.j();
                                            if (j12 != null) {
                                                textInputLayout2.setError(q.f(j12, R.string.empty_title, new Object[0]));
                                                return;
                                            }
                                            return;
                                        }
                                        s c10 = newLabelDialogFragment.c();
                                        if (c10 != null) {
                                            NestedScrollView nestedScrollView2 = zVar2.f17497a;
                                            g.e(nestedScrollView2, "root");
                                            ViewUtilsKt.h(c10, nestedScrollView2);
                                        }
                                        LabelViewModel labelViewModel = (LabelViewModel) newLabelDialogFragment.f8767u0.getValue();
                                        labelViewModel.getClass();
                                        m0.b.M0(a1.b.d0(labelViewModel), null, null, new LabelViewModel$createOrUpdateLabel$1(labelViewModel, valueOf, null), 3).O(new NewLabelDialogFragment$setupListeners$1$2(newLabelDialogFragment));
                                    }
                                });
                                g.e(nestedScrollView, "root");
                                return nestedScrollView;
                            }
                            i11 = R.id.tv_label_title;
                        } else {
                            i11 = R.id.til;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }
}
