package g1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Map<n, o> f11143a;

    /* renamed from: b  reason: collision with root package name */
    public final q f11144b;

    public f(LinkedHashMap linkedHashMap, q qVar) {
        this.f11143a = linkedHashMap;
        this.f11144b = qVar;
    }

    public final boolean a(long j2) {
        Object obj;
        List list = (List) this.f11144b.c;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                obj = list.get(i10);
                if (n.a(((r) obj).f11178a, j2)) {
                    break;
                }
                i10++;
            } else {
                obj = null;
                break;
            }
        }
        r rVar = (r) obj;
        if (rVar == null) {
            return false;
        }
        return rVar.f11184h;
    }
}
