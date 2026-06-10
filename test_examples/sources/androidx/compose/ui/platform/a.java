package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public String f3818a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f3819b = new int[2];

    public final int[] c(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 != i11) {
            int[] iArr = this.f3819b;
            iArr[0] = i10;
            iArr[1] = i11;
            return iArr;
        }
        return null;
    }

    public final String d() {
        String str = this.f3818a;
        if (str != null) {
            return str;
        }
        v7.g.l("text");
        throw null;
    }

    public void e(String str) {
        v7.g.f(str, "text");
        this.f3818a = str;
    }
}
