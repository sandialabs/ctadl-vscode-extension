package na;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

@qa.d(with = pa.c.class)
/* loaded from: classes.dex */
public final class b extends g {
    public static final a Companion = new a();

    /* loaded from: classes.dex */
    public static final class a {
        public final qa.b<b> serializer() {
            return pa.c.f16789a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(h hVar) {
        super(r2);
        ZoneOffset zoneOffset = hVar.f16152a;
        v7.g.f(zoneOffset, "zoneId");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, ZoneId zoneId) {
        super(zoneId);
        v7.g.f(zoneId, "zoneId");
    }
}
