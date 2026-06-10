package w4;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class f extends y3.c {
    public f(WorkDatabase workDatabase) {
        super(workDatabase, 1);
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // y3.c
    public final void e(c4.f fVar, Object obj) {
        d dVar = (d) obj;
        String str = dVar.f18317a;
        if (str == null) {
            fVar.o(1);
        } else {
            fVar.F(str, 1);
        }
        Long l2 = dVar.f18318b;
        if (l2 == null) {
            fVar.o(2);
        } else {
            fVar.r(l2.longValue(), 2);
        }
    }
}
