package w2;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f18267a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18268b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f18269d;

    /* renamed from: e  reason: collision with root package name */
    public final String f18270e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f18267a = str;
        str2.getClass();
        this.f18268b = str2;
        this.c = str3;
        list.getClass();
        this.f18269d = list;
        this.f18270e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f18267a + ", mProviderPackage: " + this.f18268b + ", mQuery: " + this.c + ", mCertificates:");
        int i10 = 0;
        while (true) {
            List<List<byte[]>> list = this.f18269d;
            if (i10 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List<byte[]> list2 = list.get(i10);
            for (int i11 = 0; i11 < list2.size(); i11++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list2.get(i11), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i10++;
        }
    }
}
