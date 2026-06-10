package j$.time;

import j$.time.zone.ZoneRules;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f11883a;

    static {
        HashMap hashMap = new HashMap(64);
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f11883a = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != o.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneId of(String str) {
        int i10;
        if (str != null) {
            if (str.length() > 1 && !str.startsWith("+") && !str.startsWith("-")) {
                if (!str.startsWith("UTC") && !str.startsWith("GMT")) {
                    if (str.startsWith("UT")) {
                        i10 = 2;
                        String substring = str.substring(0, i10);
                        if (str.length() != i10) {
                            return t(substring, ZoneOffset.UTC);
                        }
                        if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
                            try {
                                ZoneOffset of = ZoneOffset.of(str.substring(i10));
                                ZoneOffset zoneOffset = ZoneOffset.UTC;
                                return t(substring, of);
                            } catch (DateTimeException e10) {
                                throw new DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e10);
                            }
                        }
                        return o.u(str);
                    }
                    return o.u(str);
                }
                i10 = 3;
                String substring2 = str.substring(0, i10);
                if (str.length() != i10) {
                }
            }
            return ZoneOffset.of(str);
        }
        throw new NullPointerException("zoneId");
    }

    public static ZoneId systemDefault() {
        String id = TimeZone.getDefault().getID();
        if (id != null) {
            Map map = f11883a;
            if (map != null) {
                String str = (String) map.get(id);
                if (str != null) {
                    id = str;
                }
                return of(id);
            }
            throw new NullPointerException("aliasMap");
        }
        throw new NullPointerException("zoneId");
    }

    public static ZoneId t(String str, ZoneOffset zoneOffset) {
        if (str != null) {
            if (zoneOffset != null) {
                if (str.length() == 0) {
                    return zoneOffset;
                }
                if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
                    throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
                }
                if (zoneOffset.v() != 0) {
                    str = str.concat(zoneOffset.getId());
                }
                return new o(str, ZoneRules.i(zoneOffset));
            }
            throw new NullPointerException("offset");
        }
        throw new NullPointerException("prefix");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return getId().equals(((ZoneId) obj).getId());
        }
        return false;
    }

    public abstract String getId();

    public abstract ZoneRules getRules();

    public int hashCode() {
        return getId().hashCode();
    }

    public ZoneId normalized() {
        try {
            ZoneRules rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.d(Instant.EPOCH);
            }
        } catch (j$.time.zone.c unused) {
        }
        return this;
    }

    public String toString() {
        return getId();
    }
}
