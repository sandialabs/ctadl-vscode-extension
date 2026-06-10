package ja;

import android.content.ContentValues;
import kotlin.Result;

/* loaded from: classes.dex */
public final class y implements z3.a {

    /* renamed from: b  reason: collision with root package name */
    public static y f12810b;

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String b(p7.c cVar) {
        String str;
        String str2;
        if (cVar instanceof kotlinx.coroutines.internal.f) {
            return cVar.toString();
        }
        try {
            str = cVar + '@' + a(cVar);
        } catch (Throwable th) {
            str = m0.b.Q(th);
        }
        if (Result.a(str) == null) {
            str2 = str;
        } else {
            str2 = cVar.getClass().getName() + '@' + a(cVar);
        }
        return (String) str2;
    }

    @Override // z3.a
    public final void f(c4.b bVar) {
        v7.g.f(bVar, "db");
        bVar.g("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        bVar.K(contentValues, new Object[0]);
    }
}
