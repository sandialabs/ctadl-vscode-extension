package androidx.room;

import c4.f;
import java.util.concurrent.atomic.AtomicBoolean;
import m7.e;
import v7.g;

/* loaded from: classes.dex */
public abstract class SharedSQLiteStatement {

    /* renamed from: a  reason: collision with root package name */
    public final RoomDatabase f6058a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f6059b;
    public final e c;

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        g.f(roomDatabase, "database");
        this.f6058a = roomDatabase;
        this.f6059b = new AtomicBoolean(false);
        this.c = kotlin.a.b(new SharedSQLiteStatement$stmt$2(this));
    }

    public final f a() {
        this.f6058a.a();
        if (this.f6059b.compareAndSet(false, true)) {
            return (f) this.c.getValue();
        }
        return b();
    }

    public final f b() {
        String c = c();
        RoomDatabase roomDatabase = this.f6058a;
        roomDatabase.getClass();
        g.f(c, "sql");
        roomDatabase.a();
        roomDatabase.b();
        return roomDatabase.g().L().l(c);
    }

    public abstract String c();

    public final void d(f fVar) {
        g.f(fVar, "statement");
        if (fVar == ((f) this.c.getValue())) {
            this.f6059b.set(false);
        }
    }
}
