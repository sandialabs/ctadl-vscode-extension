package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class a1 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f855a = new Object();

    public static void a(Context context) {
        if ((context instanceof a1) || (context.getResources() instanceof c1)) {
            return;
        }
        context.getResources();
        int i10 = m1.f1039a;
    }
}
