package com.noto.app.components;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.navigation.f;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.noto.R;
import kotlin.Metadata;
import o6.b;
import o6.j;
import s6.c;
import v7.g;
import v7.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/components/ProgressIndicatorDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProgressIndicatorDialogFragment extends b {

    /* renamed from: u0  reason: collision with root package name */
    public final f f7628u0;

    public ProgressIndicatorDialogFragment() {
        super(false, 1, null);
        this.f7628u0 = new f(i.a(j.class), new ProgressIndicatorDialogFragment$special$$inlined$navArgs$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.progress_indicator_dialog_fragment, viewGroup, false);
        int i10 = R.id.indicator;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) a1.b.O(inflate, R.id.indicator);
        if (circularProgressIndicator != null) {
            i10 = R.id.ll;
            if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                i10 = R.id.tb;
                View O = a1.b.O(inflate, R.id.tb);
                if (O != null) {
                    c a10 = c.a(O);
                    NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                    f fVar = this.f7628u0;
                    a10.c.setText(((j) fVar.getValue()).f16373a);
                    circularProgressIndicator.setContentDescription(((j) fVar.getValue()).f16373a);
                    this.f5215j0 = false;
                    Dialog dialog = this.f5220o0;
                    if (dialog != null) {
                        dialog.setCancelable(false);
                    }
                    g.e(nestedScrollView, "root");
                    return nestedScrollView;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
