package r6;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class q implements Callable<t6.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y3.m f17110a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s f17111b;

    public q(s sVar, y3.m mVar) {
        this.f17111b = sVar;
        this.f17110a = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final t6.d call() {
        Cursor B = v8.b.B(this.f17111b.f17114a, this.f17110a);
        try {
            int U = a1.b.U(B, "id");
            int U2 = a1.b.U(B, "folder_id");
            int U3 = a1.b.U(B, "title");
            int U4 = a1.b.U(B, "body");
            int U5 = a1.b.U(B, "position");
            int U6 = a1.b.U(B, "creation_date");
            int U7 = a1.b.U(B, "is_pinned");
            int U8 = a1.b.U(B, "is_archived");
            int U9 = a1.b.U(B, "reminder_date");
            int U10 = a1.b.U(B, "is_vaulted");
            int U11 = a1.b.U(B, "access_date");
            int U12 = a1.b.U(B, "scrolling_position");
            t6.d dVar = null;
            String string = null;
            if (B.moveToFirst()) {
                long j2 = B.getLong(U);
                long j10 = B.getLong(U2);
                String string2 = B.isNull(U3) ? null : B.getString(U3);
                String string3 = B.isNull(U4) ? null : B.getString(U4);
                int i10 = B.getInt(U5);
                na.c a10 = p6.a.a(B.isNull(U6) ? null : B.getString(U6));
                if (a10 == null) {
                    throw new IllegalStateException("Expected non-null kotlinx.datetime.Instant, but it was null.");
                }
                boolean z10 = B.getInt(U7) != 0;
                boolean z11 = B.getInt(U8) != 0;
                na.c a11 = p6.a.a(B.isNull(U9) ? null : B.getString(U9));
                boolean z12 = B.getInt(U10) != 0;
                if (!B.isNull(U11)) {
                    string = B.getString(U11);
                }
                na.c a12 = p6.a.a(string);
                if (a12 == null) {
                    throw new IllegalStateException("Expected non-null kotlinx.datetime.Instant, but it was null.");
                }
                dVar = new t6.d(j2, j10, string2, string3, i10, a10, z10, z11, a11, z12, a12, B.getInt(U12));
            }
            return dVar;
        } finally {
            B.close();
        }
    }

    public final void finalize() {
        this.f17110a.h();
    }
}
