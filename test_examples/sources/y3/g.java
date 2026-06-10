package y3;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import l.b;
import y3.f;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ f f18847i;

    public g(f fVar) {
        this.f18847i = fVar;
    }

    public final SetBuilder a() {
        f fVar = this.f18847i;
        SetBuilder setBuilder = new SetBuilder();
        Cursor n = fVar.f18828a.n(new c4.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (n.moveToNext()) {
            try {
                setBuilder.add(Integer.valueOf(n.getInt(0)));
            } finally {
            }
        }
        m7.n nVar = m7.n.f16010a;
        m0.b.D(n, null);
        a1.c.T(setBuilder);
        if (!setBuilder.isEmpty()) {
            if (this.f18847i.f18834h != null) {
                c4.f fVar2 = this.f18847i.f18834h;
                if (fVar2 != null) {
                    fVar2.k();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return setBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Set<Integer> set;
        ReentrantReadWriteLock.ReadLock readLock = this.f18847i.f18828a.f6034i.readLock();
        v7.g.e(readLock, "readWriteLock.readLock()");
        readLock.lock();
        try {
            try {
            } catch (SQLiteException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                set = EmptySet.f12983i;
                readLock.unlock();
                this.f18847i.getClass();
                if (!set.isEmpty()) {
                }
            } catch (IllegalStateException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                set = EmptySet.f12983i;
                readLock.unlock();
                this.f18847i.getClass();
                if (!set.isEmpty()) {
                }
            }
            if (this.f18847i.b() && this.f18847i.f18832f.compareAndSet(true, false) && !this.f18847i.f18828a.j()) {
                c4.b L = this.f18847i.f18828a.g().L();
                L.B();
                try {
                    set = a();
                    L.x();
                    L.d();
                    readLock.unlock();
                    this.f18847i.getClass();
                    if (!set.isEmpty()) {
                        f fVar = this.f18847i;
                        synchronized (fVar.f18836j) {
                            Iterator<Map.Entry<f.c, f.d>> it = fVar.f18836j.iterator();
                            while (true) {
                                b.e eVar = (b.e) it;
                                if (eVar.hasNext()) {
                                    ((f.d) ((Map.Entry) eVar.next()).getValue()).a(set);
                                } else {
                                    m7.n nVar = m7.n.f16010a;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    L.d();
                    throw th;
                }
            }
        } finally {
            readLock.unlock();
            this.f18847i.getClass();
        }
    }
}
