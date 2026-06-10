package j$.time;

import j$.time.zone.ZoneRules;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class o extends ZoneId {

    /* renamed from: b  reason: collision with root package name */
    private final String f12013b;
    private final transient ZoneRules c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(String str, ZoneRules zoneRules) {
        this.f12013b = str;
        this.c = zoneRules;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o u(String str) {
        if (str != null) {
            int length = str.length();
            if (length >= 2) {
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i10 == 0) && ((charAt < '0' || charAt > '9' || i10 == 0) && ((charAt != '~' || i10 == 0) && ((charAt != '.' || i10 == 0) && ((charAt != '_' || i10 == 0) && ((charAt != '+' || i10 == 0) && (charAt != '-' || i10 == 0))))))))) {
                        throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                    }
                }
                try {
                    return new o(str, j$.time.zone.f.b(str, true));
                } catch (j$.time.zone.c e10) {
                    throw e10;
                }
            }
            throw new DateTimeException("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        throw new NullPointerException("zoneId");
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f12013b;
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.c;
        return zoneRules != null ? zoneRules : j$.time.zone.f.b(this.f12013b, false);
    }
}
