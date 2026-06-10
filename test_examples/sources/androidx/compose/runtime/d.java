package androidx.compose.runtime;

import g0.t;
import g0.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<y> f2871a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2872b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f2873d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<Integer, t> f2874e;

    /* renamed from: f  reason: collision with root package name */
    public final m7.e f2875f;

    public d(int i10, ArrayList arrayList) {
        boolean z10;
        this.f2871a = arrayList;
        this.f2872b = i10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f2873d = new ArrayList();
            HashMap<Integer, t> hashMap = new HashMap<>();
            int size = arrayList.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                y yVar = this.f2871a.get(i12);
                Integer valueOf = Integer.valueOf(yVar.c);
                int i13 = yVar.f11112d;
                hashMap.put(valueOf, new t(i12, i11, i13));
                i11 += i13;
            }
            this.f2874e = hashMap;
            this.f2875f = kotlin.a.b(new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a(y yVar) {
        v7.g.f(yVar, "keyInfo");
        t tVar = this.f2874e.get(Integer.valueOf(yVar.c));
        if (tVar != null) {
            return tVar.f11080b;
        }
        return -1;
    }

    public final boolean b(int i10, int i11) {
        int i12;
        HashMap<Integer, t> hashMap = this.f2874e;
        t tVar = hashMap.get(Integer.valueOf(i10));
        if (tVar != null) {
            int i13 = tVar.f11080b;
            int i14 = i11 - tVar.c;
            tVar.c = i11;
            if (i14 != 0) {
                Collection<t> values = hashMap.values();
                v7.g.e(values, "groupInfos.values");
                for (t tVar2 : values) {
                    if (tVar2.f11080b >= i13 && !v7.g.a(tVar2, tVar) && (i12 = tVar2.f11080b + i14) >= 0) {
                        tVar2.f11080b = i12;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
