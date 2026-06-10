package r6;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class m implements Callable<t6.c> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y3.m f17104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f17105b;

    public m(j jVar, y3.m mVar) {
        this.f17105b = jVar;
        this.f17104a = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final t6.c call() {
        Cursor B = v8.b.B(this.f17105b.f17091a, this.f17104a);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "folder_id");
            int U3 = a1.b.U(B, "title");
            int U4 = a1.b.U(B, "color");
            int U5 = a1.b.U(B, "position");
            t6.c cVar = null;
            if (B.moveToFirst()) {
                cVar = new t6.c(B.getLong(U), B.getLong(U2), B.isNull(U3) ? null : B.getString(U3), ma.i.T(B.getInt(U4)), B.getInt(U5));
            }
            return cVar;
        } finally {
            B.close();
        }
    }

    public final void finalize() {
        this.f17104a.h();
    }
}
