package h1;

import java.util.ArrayList;
import v0.p;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final a[] f11351a;

    /* renamed from: b  reason: collision with root package name */
    public int f11352b;
    public long c;

    public e() {
        a[] aVarArr = new a[20];
        for (int i10 = 0; i10 < 20; i10++) {
            aVarArr[i10] = null;
        }
        this.f11351a = aVarArr;
        int i11 = u0.c.f17723e;
        this.c = u0.c.f17721b;
    }

    public final long a() {
        a aVar;
        long j2;
        d dVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i10 = this.f11352b;
        a[] aVarArr = this.f11351a;
        a aVar2 = aVarArr[i10];
        if (aVar2 != null) {
            int i11 = 0;
            a aVar3 = aVar2;
            while (true) {
                a aVar4 = aVarArr[i10];
                long j10 = aVar2.f11342b;
                if (aVar4 == null) {
                    aVar = aVar2;
                    j2 = j10;
                    break;
                }
                long j11 = aVar4.f11342b;
                a[] aVarArr2 = aVarArr;
                aVar = aVar2;
                float f10 = (float) (j10 - j11);
                j2 = j10;
                float abs = (float) Math.abs(j11 - aVar3.f11342b);
                if (f10 > 100.0f || abs > 40.0f) {
                    break;
                }
                long j12 = aVar4.f11341a;
                arrayList.add(Float.valueOf(u0.c.b(j12)));
                arrayList2.add(Float.valueOf(u0.c.c(j12)));
                arrayList3.add(Float.valueOf(-f10));
                if (i10 == 0) {
                    i10 = 20;
                }
                i10--;
                i11++;
                aVar3 = aVar4;
                if (i11 >= 20) {
                    break;
                }
                aVarArr = aVarArr2;
                aVar2 = aVar;
            }
            long j13 = aVar.f11341a;
            long j14 = aVar3.f11342b;
            long j15 = aVar3.f11341a;
            if (i11 >= 3) {
                try {
                    b B = p.B(arrayList3, arrayList);
                    b B2 = p.B(arrayList3, arrayList2);
                    float f11 = 1000;
                    dVar = new d(a1.c.s(B.f11343a.get(1).floatValue() * f11, B2.f11343a.get(1).floatValue() * f11), B.f11344b * B2.f11344b, j2 - j14, u0.c.e(j13, j15));
                } catch (IllegalArgumentException unused) {
                }
            } else {
                dVar = new d(u0.c.f17721b, 1.0f, j2 - j14, u0.c.e(j13, j15));
            }
            long j16 = dVar.f11348a;
            return a1.b.h(u0.c.b(j16), u0.c.c(j16));
        }
        dVar = d.f11347e;
        long j162 = dVar.f11348a;
        return a1.b.h(u0.c.b(j162), u0.c.c(j162));
    }
}
