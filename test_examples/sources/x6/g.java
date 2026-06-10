package x6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class g implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final String f18678a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18679b;
    public final String c;

    public g(String str, String str2, String str3) {
        this.f18678a = str;
        this.f18679b = str2;
        this.c = str3;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("confirmation", this.f18678a);
        bundle.putString("description", this.f18679b);
        bundle.putString("btn_text", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_folderDialogFragment_to_confirmationDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return v7.g.a(this.f18678a, gVar.f18678a) && v7.g.a(this.f18679b, gVar.f18679b) && v7.g.a(this.c, gVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + a4.b.g(this.f18679b, this.f18678a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionFolderDialogFragmentToConfirmationDialogFragment(confirmation=");
        sb.append(this.f18678a);
        sb.append(", description=");
        sb.append(this.f18679b);
        sb.append(", btnText=");
        return androidx.activity.e.k(sb, this.c, ")");
    }
}
