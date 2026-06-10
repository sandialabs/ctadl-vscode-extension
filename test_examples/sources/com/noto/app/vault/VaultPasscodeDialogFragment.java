package com.noto.app.vault;

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
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import f7.q;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.f;
import m7.e;
import ma.i;
import o6.b;
import s6.c;
import s6.r0;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/vault/VaultPasscodeDialogFragment;", "Lo6/b;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VaultPasscodeDialogFragment extends b {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f9922v0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public final e f9923u0;

    public VaultPasscodeDialogFragment() {
        super(false, 1, null);
        this.f9923u0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new VaultPasscodeDialogFragment$special$$inlined$viewModel$default$1(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.vault_passcode_dialog_fragment, viewGroup, false);
        int i10 = R.id.btn_done;
        MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_done);
        if (materialButton != null) {
            i10 = R.id.et_current_passcode;
            TextInputEditText textInputEditText = (TextInputEditText) a1.b.O(inflate, R.id.et_current_passcode);
            if (textInputEditText != null) {
                i10 = R.id.et_new_passcode;
                TextInputEditText textInputEditText2 = (TextInputEditText) a1.b.O(inflate, R.id.et_new_passcode);
                if (textInputEditText2 != null) {
                    i10 = R.id.ll;
                    if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                        i10 = R.id.tb;
                        View O = a1.b.O(inflate, R.id.tb);
                        if (O != null) {
                            c a10 = c.a(O);
                            TextInputLayout textInputLayout = (TextInputLayout) a1.b.O(inflate, R.id.til_current_passcode);
                            if (textInputLayout != null) {
                                TextInputLayout textInputLayout2 = (TextInputLayout) a1.b.O(inflate, R.id.til_new_passcode);
                                if (textInputLayout2 != null) {
                                    if (((MaterialTextView) a1.b.O(inflate, R.id.tv_confirmation)) != null) {
                                        MaterialTextView materialTextView = (MaterialTextView) a1.b.O(inflate, R.id.tv_current_passcode);
                                        if (materialTextView != null) {
                                            if (((MaterialTextView) a1.b.O(inflate, R.id.tv_new_vault_passcode)) != null) {
                                                NestedScrollView nestedScrollView = (NestedScrollView) inflate;
                                                final r0 r0Var = new r0(nestedScrollView, materialButton, textInputEditText, textInputEditText2, a10, textInputLayout, textInputLayout2, materialTextView);
                                                Context j2 = j();
                                                if (j2 != null) {
                                                    str = q.f(j2, R.string.vault_passcode, new Object[0]);
                                                } else {
                                                    str = null;
                                                }
                                                a10.c.setText(str);
                                                f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new VaultPasscodeDialogFragment$setupState$1(r0Var, this, null), ((com.noto.app.settings.c) this.f9923u0.getValue()).f9672r), i.z(this));
                                                materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.noto.app.vault.a
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view) {
                                                        int i11 = VaultPasscodeDialogFragment.f9922v0;
                                                        r0 r0Var2 = r0.this;
                                                        g.f(r0Var2, "$this_setupListeners");
                                                        VaultPasscodeDialogFragment vaultPasscodeDialogFragment = this;
                                                        g.f(vaultPasscodeDialogFragment, "this$0");
                                                        String valueOf = String.valueOf(r0Var2.f17464b.getText());
                                                        boolean T0 = ha.i.T0(valueOf);
                                                        String str2 = null;
                                                        TextInputLayout textInputLayout3 = r0Var2.f17465d;
                                                        if (T0) {
                                                            Context j10 = vaultPasscodeDialogFragment.j();
                                                            if (j10 != null) {
                                                                str2 = q.f(j10, R.string.passcode_empty_message, new Object[0]);
                                                            }
                                                        } else if (valueOf.length() < 6) {
                                                            Context j11 = vaultPasscodeDialogFragment.j();
                                                            if (j11 != null) {
                                                                str2 = q.f(j11, R.string.passcode_length_message, new Object[0]);
                                                            }
                                                        } else {
                                                            textInputLayout3.setError(null);
                                                            e eVar = vaultPasscodeDialogFragment.f9923u0;
                                                            if (((com.noto.app.settings.c) eVar.getValue()).f9672r.getValue() != null) {
                                                                String valueOf2 = String.valueOf(r0Var2.f17463a.getText());
                                                                if (ha.i.T0(valueOf2)) {
                                                                    Context j12 = vaultPasscodeDialogFragment.j();
                                                                    if (j12 != null) {
                                                                        str2 = q.f(j12, R.string.passcode_empty_message, new Object[0]);
                                                                    }
                                                                } else if (!g.a(ModelUtilsKt.t(valueOf2), ((com.noto.app.settings.c) eVar.getValue()).f9672r.getValue())) {
                                                                    Context j13 = vaultPasscodeDialogFragment.j();
                                                                    if (j13 != null) {
                                                                        str2 = q.f(j13, R.string.passcode_doesnt_match, new Object[0]);
                                                                    }
                                                                }
                                                                r0Var2.c.setError(str2);
                                                                return;
                                                            }
                                                            ((com.noto.app.settings.c) eVar.getValue()).g(valueOf).O(new VaultPasscodeDialogFragment$setVaultPasscodeAndDismiss$1(r0Var2, vaultPasscodeDialogFragment));
                                                            return;
                                                        }
                                                        textInputLayout3.setError(str2);
                                                    }
                                                });
                                                g.e(nestedScrollView, "root");
                                                return nestedScrollView;
                                            }
                                            i10 = R.id.tv_new_vault_passcode;
                                        } else {
                                            i10 = R.id.tv_current_passcode;
                                        }
                                    } else {
                                        i10 = R.id.tv_confirmation;
                                    }
                                } else {
                                    i10 = R.id.til_new_passcode;
                                }
                            } else {
                                i10 = R.id.til_current_passcode;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
