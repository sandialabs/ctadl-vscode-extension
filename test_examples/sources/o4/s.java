package o4;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16342a = n4.g.f("Schedulers");

    public static void a(androidx.work.a aVar, WorkDatabase workDatabase, List<r> list) {
        if (list != null && list.size() != 0) {
            w4.t w10 = workDatabase.w();
            workDatabase.c();
            try {
                int i10 = Build.VERSION.SDK_INT;
                int i11 = aVar.f6212h;
                if (i10 == 23) {
                    i11 /= 2;
                }
                ArrayList<w4.s> k3 = w10.k(i11);
                ArrayList c = w10.c();
                if (k3 != null && k3.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (w4.s sVar : k3) {
                        w10.g(currentTimeMillis, sVar.f18334a);
                    }
                }
                workDatabase.p();
                if (k3 != null && k3.size() > 0) {
                    w4.s[] sVarArr = (w4.s[]) k3.toArray(new w4.s[k3.size()]);
                    for (r rVar : list) {
                        if (rVar.f()) {
                            rVar.c(sVarArr);
                        }
                    }
                }
                if (c != null && c.size() > 0) {
                    w4.s[] sVarArr2 = (w4.s[]) c.toArray(new w4.s[c.size()]);
                    for (r rVar2 : list) {
                        if (!rVar2.f()) {
                            rVar2.c(sVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.k();
            }
        }
    }
}
