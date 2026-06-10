package y3;

import android.database.sqlite.SQLiteProgram;
import java.util.List;

/* loaded from: classes.dex */
public class j implements c4.d {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f18861i = 1;

    /* renamed from: j  reason: collision with root package name */
    public final Object f18862j;

    public j(SQLiteProgram sQLiteProgram) {
        v7.g.f(sQLiteProgram, "delegate");
        this.f18862j = sQLiteProgram;
    }

    @Override // c4.d
    public final void E(int i10, byte[] bArr) {
        switch (this.f18861i) {
            case 0:
                b(i10, bArr);
                return;
            default:
                ((SQLiteProgram) this.f18862j).bindBlob(i10, bArr);
                return;
        }
    }

    @Override // c4.d
    public final void F(String str, int i10) {
        switch (this.f18861i) {
            case 0:
                v7.g.f(str, "value");
                b(i10, str);
                return;
            default:
                v7.g.f(str, "value");
                ((SQLiteProgram) this.f18862j).bindString(i10, str);
                return;
        }
    }

    public final void a(double d5, int i10) {
        switch (this.f18861i) {
            case 0:
                b(i10, Double.valueOf(d5));
                return;
            default:
                ((SQLiteProgram) this.f18862j).bindDouble(i10, d5);
                return;
        }
    }

    public final void b(int i10, Object obj) {
        int size;
        int i11 = i10 - 1;
        Object obj2 = this.f18862j;
        if (i11 >= ((List) obj2).size() && (size = ((List) obj2).size()) <= i11) {
            while (true) {
                ((List) obj2).add(null);
                if (size == i11) {
                    break;
                }
                size++;
            }
        }
        ((List) obj2).set(i11, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f18861i) {
            case 0:
                return;
            default:
                ((SQLiteProgram) this.f18862j).close();
                return;
        }
    }

    @Override // c4.d
    public final void o(int i10) {
        switch (this.f18861i) {
            case 0:
                b(i10, null);
                return;
            default:
                ((SQLiteProgram) this.f18862j).bindNull(i10);
                return;
        }
    }

    @Override // c4.d
    public final void r(long j2, int i10) {
        switch (this.f18861i) {
            case 0:
                b(i10, Long.valueOf(j2));
                return;
            default:
                ((SQLiteProgram) this.f18862j).bindLong(i10, j2);
                return;
        }
    }
}
