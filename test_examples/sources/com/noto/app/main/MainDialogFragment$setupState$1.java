package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isPasscodeValid", "Lm7/n;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class MainDialogFragment$setupState$1 extends Lambda implements l<Boolean, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ MainDialogFragment f8842j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDialogFragment$setupState$1(MainDialogFragment mainDialogFragment) {
        super(1);
        this.f8842j = mainDialogFragment;
    }

    @Override // u7.l
    public final n U(Boolean bool) {
        boolean z10;
        NavController g10;
        androidx.navigation.n e10;
        Boolean bool2 = bool;
        g.e(bool2, "isPasscodeValid");
        if (bool2.booleanValue()) {
            int i10 = MainDialogFragment.f8838v0;
            MainDialogFragment mainDialogFragment = this.f8842j;
            MainViewModel mainViewModel = (MainViewModel) mainDialogFragment.f8839u0.getValue();
            mainViewModel.getClass();
            m0.b.M0(a1.b.d0(mainViewModel), null, null, new MainViewModel$openVault$1(mainViewModel, null), 3);
            NavController g11 = ViewUtilsKt.g(mainDialogFragment);
            if (g11 != null && (e10 = g11.e()) != null && e10.f5511k == R.id.validateVaultPasscodeDialogFragment) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (g10 = ViewUtilsKt.g(mainDialogFragment)) != null) {
                g10.j();
            }
            NavController g12 = ViewUtilsKt.g(mainDialogFragment);
            if (g12 != null) {
                a4.b.r(R.id.action_mainDialogFragment_to_mainVaultFragment, g12, null);
            }
        }
        return n.f16010a;
    }
}
