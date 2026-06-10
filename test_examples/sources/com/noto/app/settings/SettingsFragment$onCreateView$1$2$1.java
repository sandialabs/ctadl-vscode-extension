package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.v;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isPasscodeValid", "Lm7/n;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SettingsFragment$onCreateView$1$2$1 extends Lambda implements l<Boolean, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f9519j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ v<Boolean> f9520k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsFragment$onCreateView$1$2$1(SettingsFragment settingsFragment, v<Boolean> vVar) {
        super(1);
        this.f9519j = settingsFragment;
        this.f9520k = vVar;
    }

    @Override // u7.l
    public final n U(Boolean bool) {
        boolean z10;
        NavController g10;
        androidx.navigation.n e10;
        if (g.a(bool, Boolean.TRUE)) {
            SettingsFragment settingsFragment = this.f9519j;
            NavController g11 = ViewUtilsKt.g(settingsFragment);
            if (g11 != null && (e10 = g11.e()) != null && e10.f5511k == R.id.validateVaultPasscodeDialogFragment) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (g10 = ViewUtilsKt.g(settingsFragment)) != null) {
                g10.j();
            }
            NavController g12 = ViewUtilsKt.g(settingsFragment);
            if (g12 != null) {
                a4.b.r(R.id.action_settingsFragment_to_vaultSettingsFragment, g12, null);
            }
            this.f9520k.i(null);
        }
        return n.f16010a;
    }
}
