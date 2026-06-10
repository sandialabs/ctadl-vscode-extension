package androidx.room;

import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.n;
import p7.c;
import v7.g;
import y3.o;

/* loaded from: classes.dex */
public final class b {
    public static final n a(RoomDatabase roomDatabase, String[] strArr, Callable callable) {
        g.f(roomDatabase, "db");
        return new n(new CoroutinesRoom$Companion$createFlow$1(false, roomDatabase, strArr, callable, null));
    }

    public static final Object b(RoomDatabase roomDatabase, Callable callable, c cVar) {
        if (roomDatabase.m() && roomDatabase.j()) {
            return callable.call();
        }
        o oVar = (o) cVar.f().a(o.f18879i);
        return m0.b.I1(cVar, a1.b.c0(roomDatabase), new CoroutinesRoom$Companion$execute$2(callable, null));
    }
}
