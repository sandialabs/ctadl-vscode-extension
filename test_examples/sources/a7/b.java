package a7;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class b implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final String f266a;

    /* renamed from: b  reason: collision with root package name */
    public final String f267b;
    public final String c;

    public b(String str, String str2, String str3) {
        this.f266a = str;
        this.f267b = str2;
        this.c = str3;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("confirmation", this.f266a);
        bundle.putString("description", this.f267b);
        bundle.putString("btn_text", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteDialogFragment_to_confirmationDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return v7.g.a(this.f266a, bVar.f266a) && v7.g.a(this.f267b, bVar.f267b) && v7.g.a(this.c, bVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + a4.b.g(this.f267b, this.f266a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteDialogFragmentToConfirmationDialogFragment(confirmation=");
        sb.append(this.f266a);
        sb.append(", description=");
        sb.append(this.f267b);
        sb.append(", btnText=");
        return androidx.activity.e.k(sb, this.c, ")");
    }
}
