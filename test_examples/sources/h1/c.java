package h1;

import v7.g;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f11345a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11346b;

    public c(int i10, int i11) {
        if (i11 == 1) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f11346b = new Object[i10];
            return;
        }
        this.f11345a = i10;
        Float[] fArr = new Float[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            fArr[i12] = Float.valueOf(0.0f);
        }
        this.f11346b = fArr;
    }

    public Object a() {
        int i10 = this.f11345a;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object obj = this.f11346b;
            Object obj2 = ((Object[]) obj)[i11];
            ((Object[]) obj)[i11] = null;
            this.f11345a = i10 - 1;
            return obj2;
        }
        return null;
    }

    public boolean b(Object obj) {
        int i10;
        Object obj2;
        boolean z10;
        int i11 = 0;
        while (true) {
            i10 = this.f11345a;
            obj2 = this.f11346b;
            if (i11 < i10) {
                if (((Object[]) obj2)[i11] == obj) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (!z10) {
            if (i10 >= ((Object[]) obj2).length) {
                return false;
            }
            ((Object[]) obj2)[i10] = obj;
            this.f11345a = i10 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public final float c(c cVar) {
        g.f(cVar, "a");
        int i10 = this.f11345a;
        float f10 = 0.0f;
        for (int i11 = 0; i11 < i10; i11++) {
            f10 += ((Float[]) cVar.f11346b)[i11].floatValue() * ((Float[]) this.f11346b)[i11].floatValue();
        }
        return f10;
    }
}
