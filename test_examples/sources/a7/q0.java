package a7;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class q0 implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final String f335a;

    /* renamed from: b  reason: collision with root package name */
    public final String f336b;
    public final String c;

    public q0(String str, String str2, String str3) {
        this.f335a = str;
        this.f336b = str2;
        this.c = str3;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("confirmation", this.f335a);
        bundle.putString("description", this.f336b);
        bundle.putString("btn_text", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_noteSelectionDialogFragment_to_confirmationDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            return v7.g.a(this.f335a, q0Var.f335a) && v7.g.a(this.f336b, q0Var.f336b) && v7.g.a(this.c, q0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + a4.b.g(this.f336b, this.f335a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionNoteSelectionDialogFragmentToConfirmationDialogFragment(confirmation=");
        sb.append(this.f335a);
        sb.append(", description=");
        sb.append(this.f336b);
        sb.append(", btnText=");
        return androidx.activity.e.k(sb, this.c, ")");
    }
}
