package wa;

import kotlin.Result;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f18503a;

    static {
        Object Q;
        int i10;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            v7.g.e(property, "getProperty(\"kotlinx.ser…lization.json.pool.size\")");
            Q = ha.h.P0(property);
        } catch (Throwable th) {
            Q = m0.b.Q(th);
        }
        if (Q instanceof Result.Failure) {
            Q = null;
        }
        Integer num = (Integer) Q;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 2097152;
        }
        f18503a = i10;
    }
}
