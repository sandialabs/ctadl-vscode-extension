package com.noto.app.components;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.navigation.f;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import kotlin.Metadata;
import o6.b;
import o6.d;
import s6.c;
import v7.g;
import v7.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/components/ConfirmationDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ConfirmationDialogFragment extends b {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f7625v0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final f f7626u0;

    public ConfirmationDialogFragment() {
        super(false, 1, null);
        this.f7626u0 = new f(i.a(d.class), new ConfirmationDialogFragment$special$$inlined$navArgs$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.confirmation_dialog_fragment, viewGroup, false);
        int i10 = R.id.btn_confirm;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_confirm);
        if (materialButton != null) {
            i10 = R.id.ll;
            if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                i10 = R.id.tb;
                View O = a1.b.O(inflate, R.id.tb);
                if (O != null) {
                    c a10 = c.a(O);
                    MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_confirmation);
                    if (materialTextView != null) {
                        MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_description);
                        if (materialTextView2 != null) {
                            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                            f fVar = this.f7626u0;
                            a10.c.setText(((d) fVar.getValue()).c);
                            materialTextView.setText(((d) fVar.getValue()).f16362a);
                            materialTextView2.setText(((d) fVar.getValue()).f16363b);
                            materialButton.setText(((d) fVar.getValue()).c);
                            materialButton.setOnClickListener(new o6.c(0, this));
                            g.e(nestedScrollView, "root");
                            return nestedScrollView;
                        }
                        i10 = R.id.tv_description;
                    } else {
                        i10 = R.id.tv_confirmation;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
