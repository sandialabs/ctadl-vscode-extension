package com.noto.app.settings.general;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.core.widget.NestedScrollView;
import com.noto.R;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import ma.i;
import o6.b;
import s6.c;
import s6.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/general/FontDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FontDialogFragment extends b {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f9681v0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f9682u0;

    public FontDialogFragment() {
        super(false, 1, null);
        this.f9682u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new FontDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.font_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.rb_monospace;
            RadioButton radioButton = (RadioButton) a1.b.O(inflate, R.id.rb_monospace);
            if (radioButton != null) {
                i10 = R.id.rb_nunito;
                RadioButton radioButton2 = (RadioButton) a1.b.O(inflate, R.id.rb_nunito);
                if (radioButton2 != null) {
                    i10 = R.id.rg_font;
                    if (((RadioGroup) a1.b.O(inflate, R.id.rg_font)) != null) {
                        i10 = R.id.tb;
                        View O = a1.b.O(inflate, R.id.tb);
                        if (O != null) {
                            c a10 = c.a(O);
                            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                            p pVar = new p(nestedScrollView, radioButton, radioButton2, a10);
                            Context j2 = j();
                            if (j2 != null) {
                                str = q.f(j2, R.string.font, new Object[0]);
                            } else {
                                str = null;
                            }
                            a10.c.setText(str);
                            f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FontDialogFragment$setupState$1(pVar, null), ((com.noto.app.settings.c) this.f9682u0.getValue()).f9665j), i.z(this));
                            radioButton2.setOnClickListener(new z5.a(3, this));
                            radioButton.setOnClickListener(new o6.c(7, this));
                            g.e(nestedScrollView, "root");
                            return nestedScrollView;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
