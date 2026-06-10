package ma;

import java.util.Arrays;
import m7.n;
import ma.b;

/* loaded from: classes.dex */
public abstract class a<S extends b<?>> {

    /* renamed from: i  reason: collision with root package name */
    public S[] f16027i;

    /* renamed from: j  reason: collision with root package name */
    public int f16028j;

    /* renamed from: k  reason: collision with root package name */
    public int f16029k;

    /* renamed from: l  reason: collision with root package name */
    public l f16030l;

    public final S g() {
        S s10;
        l lVar;
        synchronized (this) {
            S[] sArr = this.f16027i;
            if (sArr == null) {
                sArr = (S[]) j();
                this.f16027i = sArr;
            } else if (this.f16028j >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                v7.g.e(copyOf, "copyOf(this, newSize)");
                this.f16027i = (S[]) ((b[]) copyOf);
                sArr = (S[]) ((b[]) copyOf);
            }
            int i10 = this.f16029k;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = i();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
            } while (!s10.a(this));
            this.f16029k = i10;
            this.f16028j++;
            lVar = this.f16030l;
        }
        if (lVar != null) {
            lVar.y(1);
        }
        return s10;
    }

    public final l h() {
        l lVar;
        synchronized (this) {
            lVar = this.f16030l;
            if (lVar == null) {
                lVar = new l(this.f16028j);
                this.f16030l = lVar;
            }
        }
        return lVar;
    }

    public abstract S i();

    public abstract b[] j();

    public final void k(S s10) {
        l lVar;
        int i10;
        p7.c[] b5;
        synchronized (this) {
            int i11 = this.f16028j - 1;
            this.f16028j = i11;
            lVar = this.f16030l;
            if (i11 == 0) {
                this.f16029k = 0;
            }
            b5 = s10.b(this);
        }
        for (p7.c cVar : b5) {
            if (cVar != null) {
                cVar.t(n.f16010a);
            }
        }
        if (lVar != null) {
            lVar.y(-1);
        }
    }
}
