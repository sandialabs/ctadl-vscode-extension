package r6;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class r implements Callable<List<t6.b>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y3.m f17112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f17113b;

    public r(s sVar, y3.m mVar) {
        this.f17113b = sVar;
        this.f17112a = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final List<t6.b> call() {
        Cursor B = v8.b.B(this.f17113b.f17114a, this.f17112a);
        try {
            ArrayList arrayList = new ArrayList(B.getCount());
            while (B.moveToNext()) {
                arrayList.add(new t6.b(B.getLong(0), B.getInt(1)));
            }
            return arrayList;
        } finally {
            B.close();
        }
    }

    public final void finalize() {
        this.f17112a.h();
    }
}
