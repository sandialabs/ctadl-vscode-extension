package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final k0 f5188a = new k0();

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f5189b;

    static {
        n0 n0Var;
        try {
            n0Var = (n0) h4.f.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            n0Var = null;
        }
        f5189b = n0Var;
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z10) {
        if (z10) {
            fragment2.getClass();
        } else {
            fragment.getClass();
        }
    }

    public static void b(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }
}
