package com.noto.app.settings.vault;

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
import com.noto.app.domain.model.VaultTimeout;
import com.noto.app.settings.c;
import com.noto.app.settings.vault.VaultTimeoutDialogFragment;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import ma.i;
import o6.b;
import s6.q0;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/settings/vault/VaultTimeoutDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VaultTimeoutDialogFragment extends b {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f9795v0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f9796u0;

    public VaultTimeoutDialogFragment() {
        super(false, 1, null);
        this.f9796u0 = a.a(LazyThreadSafetyMode.SYNCHRONIZED, new VaultTimeoutDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    public final c g0() {
        return (c) this.f9796u0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.vault_timeout_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.rb_after_12_hours;
            RadioButton radioButton = (RadioButton) a1.b.O(inflate, R.id.rb_after_12_hours);
            if (radioButton != null) {
                i10 = R.id.rb_after_1_hour;
                RadioButton radioButton2 = (RadioButton) a1.b.O(inflate, R.id.rb_after_1_hour);
                if (radioButton2 != null) {
                    i10 = R.id.rb_after_4_hours;
                    RadioButton radioButton3 = (RadioButton) a1.b.O(inflate, R.id.rb_after_4_hours);
                    if (radioButton3 != null) {
                        i10 = R.id.rb_immediately;
                        RadioButton radioButton4 = (RadioButton) a1.b.O(inflate, R.id.rb_immediately);
                        if (radioButton4 != null) {
                            i10 = R.id.rb_on_app_close;
                            RadioButton radioButton5 = (RadioButton) a1.b.O(inflate, R.id.rb_on_app_close);
                            if (radioButton5 != null) {
                                i10 = R.id.rg_vault_timeout;
                                if (((RadioGroup) a1.b.O(inflate, R.id.rg_vault_timeout)) != null) {
                                    i10 = R.id.tb;
                                    View O = a1.b.O(inflate, R.id.tb);
                                    if (O != null) {
                                        s6.c a10 = s6.c.a(O);
                                        NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                        q0 q0Var = new q0(nestedScrollView, radioButton, radioButton2, radioButton3, radioButton4, radioButton5, a10);
                                        Context j2 = j();
                                        if (j2 != null) {
                                            str = q.f(j2, R.string.vault_timeout, new Object[0]);
                                        } else {
                                            str = null;
                                        }
                                        a10.c.setText(str);
                                        f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new VaultTimeoutDialogFragment$setupState$1(q0Var, null), g0().f9673s), i.z(this));
                                        radioButton4.setOnClickListener(new View.OnClickListener(this) { // from class: d7.b

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ VaultTimeoutDialogFragment f10440j;

                                            {
                                                this.f10440j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                VaultTimeoutDialogFragment vaultTimeoutDialogFragment = this.f10440j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = VaultTimeoutDialogFragment.f9795v0;
                                                        g.f(vaultTimeoutDialogFragment, "this$0");
                                                        vaultTimeoutDialogFragment.g0().h(VaultTimeout.Immediately);
                                                        vaultTimeoutDialogFragment.Z();
                                                        return;
                                                    default:
                                                        int i13 = VaultTimeoutDialogFragment.f9795v0;
                                                        g.f(vaultTimeoutDialogFragment, "this$0");
                                                        vaultTimeoutDialogFragment.g0().h(VaultTimeout.After4Hours);
                                                        vaultTimeoutDialogFragment.Z();
                                                        return;
                                                }
                                            }
                                        });
                                        radioButton5.setOnClickListener(new View.OnClickListener(this) { // from class: d7.c

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ VaultTimeoutDialogFragment f10442j;

                                            {
                                                this.f10442j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                VaultTimeoutDialogFragment vaultTimeoutDialogFragment = this.f10442j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = VaultTimeoutDialogFragment.f9795v0;
                                                        g.f(vaultTimeoutDialogFragment, "this$0");
                                                        vaultTimeoutDialogFragment.g0().h(VaultTimeout.OnAppClose);
                                                        vaultTimeoutDialogFragment.Z();
                                                        return;
                                                    default:
                                                        int i13 = VaultTimeoutDialogFragment.f9795v0;
                                                        g.f(vaultTimeoutDialogFragment, "this$0");
                                                        vaultTimeoutDialogFragment.g0().h(VaultTimeout.After12Hours);
                                                        vaultTimeoutDialogFragment.Z();
                                                        return;
                                                }
                                            }
                                        });
                                        radioButton2.setOnClickListener(new o6.c(8, this));
                                        radioButton3.setOnClickListener(new View.OnClickListener(this) { // from class: d7.b

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ VaultTimeoutDialogFragment f10440j;

                                            {
                                                this.f10440j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                VaultTimeoutDialogFragment vaultTimeoutDialogFragment = this.f10440j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = VaultTimeoutDialogFragment.f9795v0;
                                                        g.f(vaultTimeoutDialogFragment, "this$0");
                                                        vaultTimeoutDialogFragment.g0().h(VaultTimeout.Immediately);
                                                        vaultTimeoutDialogFragment.Z();
                                                        return;
                                                    default:
                                                        int i13 = VaultTimeoutDialogFragment.f9795v0;
                                                        g.f(vaultTimeoutDialogFragment, "this$0");
                                                        vaultTimeoutDialogFragment.g0().h(VaultTimeout.After4Hours);
                                                        vaultTimeoutDialogFragment.Z();
                                                        return;
                                                }
                                            }
                                        });
                                        radioButton.setOnClickListener(new View.OnClickListener(this) { // from class: d7.c

                                            /* renamed from: j  reason: collision with root package name */
                                            public final /* synthetic */ VaultTimeoutDialogFragment f10442j;

                                            {
                                                this.f10442j = this;
                                            }

                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i11 = r2;
                                                VaultTimeoutDialogFragment vaultTimeoutDialogFragment = this.f10442j;
                                                switch (i11) {
                                                    case 0:
                                                        int i12 = VaultTimeoutDialogFragment.f9795v0;
                                                        g.f(vaultTimeoutDialogFragment, "this$0");
                                                        vaultTimeoutDialogFragment.g0().h(VaultTimeout.OnAppClose);
                                                        vaultTimeoutDialogFragment.Z();
                                                        return;
                                                    default:
                                                        int i13 = VaultTimeoutDialogFragment.f9795v0;
                                                        g.f(vaultTimeoutDialogFragment, "this$0");
                                                        vaultTimeoutDialogFragment.g0().h(VaultTimeout.After12Hours);
                                                        vaultTimeoutDialogFragment.Z();
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
