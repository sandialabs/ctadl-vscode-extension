package wa;

import java.util.Arrays;
import kotlinx.serialization.descriptors.b;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f18511a = new Object[8];

    /* renamed from: b  reason: collision with root package name */
    public int[] f18512b;
    public int c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18513a = new a();
    }

    public k() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f18512b = iArr;
        this.c = -1;
    }

    public final String a() {
        String str;
        StringBuilder sb = new StringBuilder("$");
        int i10 = this.c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f18511a[i11];
            if (obj instanceof sa.e) {
                sa.e eVar = (sa.e) obj;
                if (!v7.g.a(eVar.h(), b.C0175b.f15610a)) {
                    int i12 = this.f18512b[i11];
                    if (i12 >= 0) {
                        sb.append(".");
                        str = eVar.d(i12);
                        sb.append(str);
                    }
                } else if (this.f18512b[i11] != -1) {
                    sb.append("[");
                    sb.append(this.f18512b[i11]);
                    str = "]";
                    sb.append(str);
                }
            } else if (obj != a.f18513a) {
                sb.append("['");
                sb.append(obj);
                str = "']";
                sb.append(str);
            }
        }
        String sb2 = sb.toString();
        v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void b() {
        int i10 = this.c * 2;
        Object[] copyOf = Arrays.copyOf(this.f18511a, i10);
        v7.g.e(copyOf, "copyOf(this, newSize)");
        this.f18511a = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.f18512b, i10);
        v7.g.e(copyOf2, "copyOf(this, newSize)");
        this.f18512b = copyOf2;
    }

    public final String toString() {
        return a();
    }
}
