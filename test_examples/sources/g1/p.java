package g1;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f11173a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f11174a;

        /* renamed from: b  reason: collision with root package name */
        public final long f11175b;
        public final boolean c;

        public a(long j2, long j10, boolean z10) {
            this.f11174a = j2;
            this.f11175b = j10;
            this.c = z10;
        }
    }

    public final f a(q qVar, x xVar) {
        boolean z10;
        long j2;
        long j10;
        int i10;
        v7.g.f(xVar, "positionCalculator");
        List list = (List) qVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            r rVar = (r) list.get(i11);
            LinkedHashMap linkedHashMap2 = this.f11173a;
            a aVar = (a) linkedHashMap2.get(new n(rVar.f11178a));
            if (aVar == null) {
                j10 = rVar.f11179b;
                j2 = rVar.f11180d;
                z10 = false;
            } else {
                long q10 = xVar.q(aVar.f11175b);
                long j11 = aVar.f11174a;
                z10 = aVar.c;
                j2 = q10;
                j10 = j11;
            }
            long j12 = rVar.f11178a;
            linkedHashMap.put(new n(j12), new o(j12, rVar.f11179b, rVar.f11180d, rVar.f11181e, rVar.f11182f, j10, j2, z10, rVar.f11183g, rVar.f11185i, rVar.f11186j));
            boolean z11 = rVar.f11181e;
            long j13 = rVar.f11178a;
            if (z11) {
                i10 = i11;
                linkedHashMap2.put(new n(j13), new a(rVar.f11179b, rVar.c, z11));
            } else {
                i10 = i11;
                linkedHashMap2.remove(new n(j13));
            }
            i11 = i10 + 1;
        }
        return new f(linkedHashMap, qVar);
    }
}
