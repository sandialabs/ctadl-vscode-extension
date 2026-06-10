package r6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class w implements Callable<List<t6.e>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y3.m f17131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f17132b;

    public w(v vVar, y3.m mVar) {
        this.f17132b = vVar;
        this.f17131a = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<t6.e> call() {
        Cursor B = v8.b.B(this.f17132b.f17125a, this.f17131a);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "note_id");
            int U3 = a1.b.U(B, "label_id");
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(new t6.e(B.getLong(U), B.getLong(U2), B.getLong(U3)));
            }
            return arrayList;
        } finally {
            B.close();
        }
    }

    public final void finalize() {
        this.f17131a.h();
    }
}
