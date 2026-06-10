package d7;

import android.os.Bundle;
import androidx.activity.e;
import androidx.navigation.o;
import com.noto.R;
import v7.g;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final String f10437a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10438b;
    public final String c;

    public a(String str, String str2, String str3) {
        this.f10437a = str;
        this.f10438b = str2;
        this.c = str3;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("confirmation", this.f10437a);
        bundle.putString("description", this.f10438b);
        bundle.putString("btn_text", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_vaultSettingsFragment_to_confirmationDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return g.a(this.f10437a, aVar.f10437a) && g.a(this.f10438b, aVar.f10438b) && g.a(this.c, aVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + a4.b.g(this.f10438b, this.f10437a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionVaultSettingsFragmentToConfirmationDialogFragment(confirmation=");
        sb.append(this.f10437a);
        sb.append(", description=");
        sb.append(this.f10438b);
        sb.append(", btnText=");
        return e.k(sb, this.c, ")");
    }
}
