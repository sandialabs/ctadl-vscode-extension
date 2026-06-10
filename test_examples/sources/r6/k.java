package r6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class k implements Callable<List<t6.c>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y3.m f17100a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f17101b;

    public k(j jVar, y3.m mVar) {
        this.f17101b = jVar;
        this.f17100a = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<t6.c> call() {
        Cursor B = v8.b.B(this.f17101b.f17091a, this.f17100a);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "folder_id");
            int U3 = a1.b.U(B, "title");
            int U4 = a1.b.U(B, "color");
            int U5 = a1.b.U(B, "position");
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(new t6.c(B.getLong(U), B.getLong(U2), B.isNull(U3) ? null : B.getString(U3), ma.i.T(B.getInt(U4)), B.getInt(U5)));
            }
            return arrayList;
        } finally {
            B.close();
        }
    }

    public final void finalize() {
        this.f17100a.h();
    }
}
