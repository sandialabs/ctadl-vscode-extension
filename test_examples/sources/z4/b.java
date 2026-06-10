package z4;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.c;
import n4.g;
import w4.i;
import w4.j;
import w4.n;
import w4.s;
import w4.w;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19118a;

    static {
        String f10 = g.f("DiagnosticsWrkr");
        v7.g.e(f10, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f19118a = f10;
    }

    public static final String a(n nVar, w wVar, j jVar, List list) {
        String str;
        Integer num;
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 23) {
            str = "Job Id";
        } else {
            str = "Alarm Id";
        }
        sb.append("\n Id \t Class Name\t " + str + "\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            i a10 = jVar.a(ma.i.x(sVar));
            if (a10 != null) {
                num = Integer.valueOf(a10.c);
            } else {
                num = null;
            }
            String str2 = sVar.f18334a;
            String t22 = c.t2(nVar.b(str2), ",", null, null, null, 62);
            String t23 = c.t2(wVar.b(str2), ",", null, null, null, 62);
            StringBuilder p10 = a4.b.p("\n", str2, "\t ");
            p10.append(sVar.c);
            p10.append("\t ");
            p10.append(num);
            p10.append("\t ");
            p10.append(sVar.f18335b.name());
            p10.append("\t ");
            p10.append(t22);
            p10.append("\t ");
            p10.append(t23);
            p10.append('\t');
            sb.append(p10.toString());
        }
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
