package j$.time.temporal;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements q, m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12033a;

    public /* synthetic */ p(int i10) {
        this.f12033a = i10;
    }

    @Override // j$.time.temporal.q
    public Object d(l lVar) {
        p pVar = n.f12027a;
        switch (this.f12033a) {
            case 0:
                return (ZoneId) lVar.r(pVar);
            case 1:
                return (j$.time.chrono.d) lVar.r(n.f12028b);
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return (r) lVar.r(n.c);
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                a aVar = a.OFFSET_SECONDS;
                if (lVar.c(aVar)) {
                    return ZoneOffset.x(lVar.f(aVar));
                }
                return null;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                ZoneId zoneId = (ZoneId) lVar.r(pVar);
                return zoneId != null ? zoneId : (ZoneId) lVar.r(n.f12029d);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (lVar.c(aVar2)) {
                    return LocalDate.y(lVar.o(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (lVar.c(aVar3)) {
                    return j$.time.j.B(lVar.o(aVar3));
                }
                return null;
        }
    }

    @Override // j$.time.temporal.m
    public k k(k kVar) {
        int f10 = kVar.f(a.DAY_OF_WEEK);
        int i10 = this.f12033a;
        if (f10 == i10) {
            return kVar;
        }
        int i11 = f10 - i10;
        return kVar.j(i11 >= 0 ? 7 - i11 : -i11, b.DAYS);
    }
}
