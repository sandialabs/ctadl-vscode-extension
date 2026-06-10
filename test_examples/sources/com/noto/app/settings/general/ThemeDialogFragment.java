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
import com.noto.app.domain.model.Theme;
import com.noto.app.settings.c;
import com.noto.app.settings.general.ThemeDialogFragment;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import ma.i;
import o6.b;
import s6.q0;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/general/ThemeDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ThemeDialogFragment extends b {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f9760v0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f9761u0;

    public ThemeDialogFragment() {
        super(false, 1, null);
        this.f9761u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new ThemeDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    public final c g0() {
        return (c) this.f9761u0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.theme_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.rb_black_theme;
            RadioButton radioButton = (RadioButton) a1.b.O(inflate, R.id.rb_black_theme);
            if (radioButton != null) {
                i10 = R.id.rb_dark_theme;
                RadioButton radioButton2 = (RadioButton) a1.b.O(inflate, R.id.rb_dark_theme);
                if (radioButton2 != null) {
                    i10 = R.id.rb_light_theme;
                    RadioButton radioButton3 = (RadioButton) a1.b.O(inflate, R.id.rb_light_theme);
                    if (radioButton3 != null) {
                        i10 = R.id.rb_system_black_theme;
                        RadioButton radioButton4 = (RadioButton) a1.b.O(inflate, R.id.rb_system_black_theme);
                        if (radioButton4 != null) {
                            i10 = R.id.rb_system_dark_theme;
                            RadioButton radioButton5 = (RadioButton) a1.b.O(inflate, R.id.rb_system_dark_theme);
                            if (radioButton5 != null) {
                                i10 = R.id.rg_theme;
                                if (((RadioGroup) a1.b.O(inflate, R.id.rg_theme)) != null) {
                                    i10 = R.id.tb;
                                    View O = a1.b.O(inflate, R.id.tb);
                                    if (O != null) {
                                        s6.c a10 = s6.c.a(O);
                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                        q0 q0Var = new q0(nestedScrollView, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, a10);
                                        Context j2 = j();
                                        if (j2 != null) {
                                            str = q.f(j2, R.string.theme, new Object[0]);
                                        } else {
                                            str = null;
                                        }
                                        a10.c.setText(str);
                                        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new ThemeDialogFragment$setupState$1(this, q0Var, null), g0().f9664i), i.z(this));
                                        radioButton5.setOnClickListener(new View.OnClickListener(this) { // from class: c7.e

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ ThemeDialogFragment f6558j;

                                            {
                                                this.f6558j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                ThemeDialogFragment themeDialogFragment = this.f6558j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = ThemeDialogFragment.f9760v0;
                                                        g.f(themeDialogFragment, "this$0");
                                                        themeDialogFragment.g0().r(Theme.System);
                                                        themeDialogFragment.Z();
                                                        return;
                                                    default:
                                                        int i13 = ThemeDialogFragment.f9760v0;
                                                        g.f(themeDialogFragment, "this$0");
                                                        themeDialogFragment.g0().r(Theme.Dark);
                                                        themeDialogFragment.Z();
                                                        return;
                                                }
                                            }
                                        });
                                        radioButton4.setOnClickListener(new View.OnClickListener(this) { // from class: c7.f

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ ThemeDialogFragment f6560j;

                                            {
                                                this.f6560j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                ThemeDialogFragment themeDialogFragment = this.f6560j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = ThemeDialogFragment.f9760v0;
                                                        g.f(themeDialogFragment, "this$0");
                                                        themeDialogFragment.g0().r(Theme.SystemBlack);
                                                        themeDialogFragment.Z();
                                                        return;
                                                    default:
                                                        int i13 = ThemeDialogFragment.f9760v0;
                                                        g.f(themeDialogFragment, "this$0");
                                                        themeDialogFragment.g0().r(Theme.Black);
                                                        themeDialogFragment.Z();
                                                        return;
                                                }
                                            }
                                        });
                                        radioButton3.setOnClickListener(new h6.b(11, this));
                                        radioButton2.setOnClickListener(new View.OnClickListener(this) { // from class: c7.e

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ ThemeDialogFragment f6558j;

                                            {
                                                this.f6558j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                ThemeDialogFragment themeDialogFragment = this.f6558j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = ThemeDialogFragment.f9760v0;
                                                        g.f(themeDialogFragment, "this$0");
                                                        themeDialogFragment.g0().r(Theme.System);
                                                        themeDialogFragment.Z();
                                                        return;
                                                    default:
                                                        int i13 = ThemeDialogFragment.f9760v0;
                                                        g.f(themeDialogFragment, "this$0");
                                                        themeDialogFragment.g0().r(Theme.Dark);
                                                        themeDialogFragment.Z();
                                                        return;
                                                }
                                            }
                                        });
                                        radioButton.setOnClickListener(new View.OnClickListener(this) { // from class: c7.f

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ ThemeDialogFragment f6560j;

                                            {
                                                this.f6560j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                ThemeDialogFragment themeDialogFragment = this.f6560j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = ThemeDialogFragment.f9760v0;
                                                        g.f(themeDialogFragment, "this$0");
                                                        themeDialogFragment.g0().r(Theme.SystemBlack);
                                                        themeDialogFragment.Z();
                                                        return;
                                                    default:
                                                        int i13 = ThemeDialogFragment.f9760v0;
                                                        g.f(themeDialogFragment, "this$0");
                                                        themeDialogFragment.g0().r(Theme.Black);
                                                        themeDialogFragment.Z();
                                                        return;
                                                }
                                            }
                                        });
                                        g.e(nestedScrollView, "root");
                                        return nestedScrollView;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
