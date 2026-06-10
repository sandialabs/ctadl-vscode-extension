package n6;

import android.app.NotificationManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.z;
import com.noto.app.AppActivity;
import com.noto.app.AppViewModel;
import com.noto.app.domain.model.VaultTimeout;
import com.noto.app.main.MainVaultFragment;
import v7.g;

/* loaded from: classes.dex */
public final class a extends z.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppActivity f16105a;

    public a(AppActivity appActivity) {
        this.f16105a = appActivity;
    }

    @Override // androidx.fragment.app.z.k
    public final void a(z zVar, Fragment fragment) {
        AppViewModel q10;
        AppViewModel q11;
        g.f(zVar, "fm");
        g.f(fragment, "f");
        if (fragment instanceof MainVaultFragment) {
            AppActivity appActivity = this.f16105a;
            q10 = appActivity.q();
            if (q10.f7550j.getValue() == VaultTimeout.Immediately) {
                q11 = appActivity.q();
                q11.d();
                NotificationManager v3 = appActivity.v();
                g.f(v3, "<this>");
                v3.cancel(-1);
            }
        }
    }
}
