package c4;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    void B();

    int K(ContentValues contentValues, Object[] objArr);

    void d();

    void e();

    Cursor f(e eVar, CancellationSignal cancellationSignal);

    void g(String str);

    boolean isOpen();

    f l(String str);

    Cursor n(e eVar);

    boolean s();

    boolean t();

    void x();
}
