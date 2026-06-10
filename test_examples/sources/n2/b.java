package n2;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f16070a;

    /* renamed from: b  reason: collision with root package name */
    public final LocusId f16071b;

    /* loaded from: classes.dex */
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }
    }

    public b(String str) {
        LocusId locusId;
        if (!TextUtils.isEmpty(str)) {
            this.f16070a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                locusId = a.a(str);
            } else {
                locusId = null;
            }
            this.f16071b = locusId;
            return;
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            String str = ((b) obj).f16070a;
            String str2 = this.f16070a;
            return str2 == null ? str == null : str2.equals(str);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16070a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        int length = this.f16070a.length();
        sb.append(length + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
