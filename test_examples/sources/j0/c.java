package j0;

import android.os.Build;
import android.view.ViewGroup;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import ma.i;
import z0.d;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12624a;

    /* renamed from: b  reason: collision with root package name */
    public Object f12625b;

    public c(int i10) {
        this.f12624a = i10;
        if (i10 == 2) {
            this.f12625b = new ArrayList();
        } else if (i10 != 4) {
            this.f12625b = new v0.c();
        } else {
            this.f12625b = Build.VERSION.SDK_INT >= 28 ? new i() : new m0.b();
        }
    }

    public final v0.c a() {
        return (v0.c) this.f12625b;
    }

    public final void b(float f10, float f11) {
        ((List) this.f12625b).add(new d.e(f10, f11));
    }

    public final String toString() {
        switch (this.f12624a) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return (String) this.f12625b;
            default:
                return super.toString();
        }
    }

    public c(ViewGroup viewGroup) {
        this.f12624a = 5;
        this.f12625b = viewGroup.getOverlay();
    }

    public c(Object obj) {
        this.f12624a = 0;
        this.f12625b = obj;
    }

    public c(String str) {
        this.f12624a = 7;
        this.f12625b = str;
    }
}
