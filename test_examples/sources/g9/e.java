package g9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class e extends f9.a {

    /* renamed from: g  reason: collision with root package name */
    public static final e f11274g = new e(1, 8, 0);

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11275f;

    static {
        new e(new int[0]);
    }

    public e(int... iArr) {
        this(iArr, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int[] iArr, boolean z10) {
        super(Arrays.copyOf(iArr, iArr.length));
        v7.g.f(iArr, "versionArray");
        this.f11275f = z10;
    }

    public final boolean c() {
        boolean z10;
        int i10 = this.c;
        int i11 = this.f10974b;
        if (i11 == 1 && i10 == 0) {
            return false;
        }
        boolean z11 = this.f11275f;
        e eVar = f11274g;
        if (z11) {
            z10 = b(eVar);
        } else if (i11 == eVar.f10974b && i10 <= eVar.c + 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }
}
