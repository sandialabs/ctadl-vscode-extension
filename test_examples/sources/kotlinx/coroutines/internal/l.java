package kotlinx.coroutines.internal;

import ja.b1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final b1 f15491a;

    static {
        String str;
        Object next;
        int i10 = s.f15496a;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        Iterator l2 = androidx.activity.e.l();
        v7.g.f(l2, "<this>");
        ga.h lVar = new ga.l(l2);
        if (!(lVar instanceof ga.a)) {
            lVar = new ga.a(lVar);
        }
        List<? extends k> a12 = a1.c.a1(kotlin.sequences.a.Z0(lVar));
        Iterator it = a12.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int c = ((k) next).c();
                do {
                    Object next2 = it.next();
                    int c10 = ((k) next2).c();
                    if (c < c10) {
                        next = next2;
                        c = c10;
                    }
                } while (it.hasNext());
            }
        }
        k kVar = (k) next;
        if (kVar != null) {
            b1 b5 = kVar.b(a12);
            if (b5 != null) {
                f15491a = b5;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
