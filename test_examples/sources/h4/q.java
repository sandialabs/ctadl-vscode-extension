package h4;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b  reason: collision with root package name */
    public final View f11427b;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f11426a = new HashMap();
    public final ArrayList<j> c = new ArrayList<>();

    @Deprecated
    public q() {
    }

    public q(View view) {
        this.f11427b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f11427b == qVar.f11427b && this.f11426a.equals(qVar.f11426a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11426a.hashCode() + (this.f11427b.hashCode() * 31);
    }

    public final String toString() {
        HashMap hashMap;
        String l2 = a4.b.l(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f11427b + "\n", "    values:");
        for (String str : this.f11426a.keySet()) {
            l2 = l2 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return l2;
    }
}
