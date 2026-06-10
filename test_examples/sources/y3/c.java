package y3;

import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;

/* loaded from: classes.dex */
public abstract class c extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RoomDatabase roomDatabase, int i10) {
        super(roomDatabase);
        if (i10 != 1) {
            v7.g.f(roomDatabase, "database");
            return;
        }
        v7.g.f(roomDatabase, "database");
        super(roomDatabase);
    }

    public abstract void e(c4.f fVar, Object obj);

    public final void f(Object obj) {
        c4.f a10 = a();
        try {
            e(a10, obj);
            a10.k();
        } finally {
            d(a10);
        }
    }

    public final void g(Object obj) {
        c4.f a10 = a();
        try {
            e(a10, obj);
            a10.Q();
        } finally {
            d(a10);
        }
    }

    public final long h(Object obj) {
        c4.f a10 = a();
        try {
            e(a10, obj);
            return a10.Q();
        } finally {
            d(a10);
        }
    }
}
