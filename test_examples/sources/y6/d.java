package y6;

import android.os.Bundle;
import com.noto.R;

/* loaded from: classes.dex */
public final class d implements androidx.navigation.o {

    /* renamed from: a  reason: collision with root package name */
    public final String f18901a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18902b;
    public final String c;

    public d(String str, String str2, String str3) {
        this.f18901a = str;
        this.f18902b = str2;
        this.c = str3;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("confirmation", this.f18901a);
        bundle.putString("description", this.f18902b);
        bundle.putString("btn_text", this.c);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_labelDialogFragment_to_confirmationDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return v7.g.a(this.f18901a, dVar.f18901a) && v7.g.a(this.f18902b, dVar.f18902b) && v7.g.a(this.c, dVar.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + a4.b.g(this.f18902b, this.f18901a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionLabelDialogFragmentToConfirmationDialogFragment(confirmation=");
        sb.append(this.f18901a);
        sb.append(", description=");
        sb.append(this.f18902b);
        sb.append(", btnText=");
        return androidx.activity.e.k(sb, this.c, ")");
    }
}
