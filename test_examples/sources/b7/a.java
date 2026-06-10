package b7;

import android.os.Bundle;
import androidx.activity.e;
import androidx.navigation.o;
import com.noto.R;
import v7.g;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final String f6487a;

    public a(String str) {
        this.f6487a = str;
    }

    @Override // androidx.navigation.o
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("title", this.f6487a);
        return bundle;
    }

    @Override // androidx.navigation.o
    public final int b() {
        return R.id.action_exportImportDialogFragment_to_progressIndicatorDialogFragment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && g.a(this.f6487a, ((a) obj).f6487a);
    }

    public final int hashCode() {
        return this.f6487a.hashCode();
    }

    public final String toString() {
        return e.k(new StringBuilder("ActionExportImportDialogFragmentToProgressIndicatorDialogFragment(title="), this.f6487a, ")");
    }
}
