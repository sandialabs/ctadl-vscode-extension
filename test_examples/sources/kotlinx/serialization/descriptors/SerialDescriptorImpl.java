package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.collections.d;
import n7.l;
import n7.r;
import n7.s;
import n7.t;
import sa.e;
import sa.h;
import ua.m;
import v7.g;

/* loaded from: classes.dex */
public final class SerialDescriptorImpl implements e, m {

    /* renamed from: a  reason: collision with root package name */
    public final String f15595a;

    /* renamed from: b  reason: collision with root package name */
    public final h f15596b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Annotation> f15597d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f15598e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f15599f;

    /* renamed from: g  reason: collision with root package name */
    public final e[] f15600g;

    /* renamed from: h  reason: collision with root package name */
    public final List<Annotation>[] f15601h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean[] f15602i;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Integer> f15603j;

    /* renamed from: k  reason: collision with root package name */
    public final e[] f15604k;

    /* renamed from: l  reason: collision with root package name */
    public final m7.e f15605l;

    public SerialDescriptorImpl(String str, h hVar, int i10, List<? extends e> list, sa.a aVar) {
        g.f(str, "serialName");
        g.f(hVar, "kind");
        g.f(list, "typeParameters");
        this.f15595a = str;
        this.f15596b = hVar;
        this.c = i10;
        this.f15597d = aVar.f17509b;
        ArrayList arrayList = aVar.c;
        g.f(arrayList, "<this>");
        HashSet hashSet = new HashSet(m0.b.O0(l.Z1(arrayList, 12)));
        c.J2(arrayList, hashSet);
        this.f15598e = hashSet;
        int i11 = 0;
        this.f15599f = (String[]) arrayList.toArray(new String[0]);
        this.f15600g = m0.b.H(aVar.f17511e);
        this.f15601h = (List[]) aVar.f17512f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f17513g;
        g.f(arrayList2, "<this>");
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i11] = ((Boolean) it.next()).booleanValue();
            i11++;
        }
        this.f15602i = zArr;
        s y22 = kotlin.collections.b.y2(this.f15599f);
        ArrayList arrayList3 = new ArrayList(l.Z1(y22, 10));
        Iterator it2 = y22.iterator();
        while (true) {
            t tVar = (t) it2;
            if (tVar.hasNext()) {
                r rVar = (r) tVar.next();
                arrayList3.add(new Pair(rVar.f16129b, Integer.valueOf(rVar.f16128a)));
            } else {
                this.f15603j = d.N1(arrayList3);
                this.f15604k = m0.b.H(list);
                this.f15605l = kotlin.a.b(new SerialDescriptorImpl$_hashCode$2(this));
                return;
            }
        }
    }

    @Override // sa.e
    public final int a(String str) {
        g.f(str, "name");
        Integer num = this.f15603j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // sa.e
    public final String b() {
        return this.f15595a;
    }

    @Override // sa.e
    public final int c() {
        return this.c;
    }

    @Override // sa.e
    public final String d(int i10) {
        return this.f15599f[i10];
    }

    @Override // ua.m
    public final Set<String> e() {
        return this.f15598e;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            e eVar = (e) obj;
            if (g.a(b(), eVar.b()) && Arrays.equals(this.f15604k, ((SerialDescriptorImpl) obj).f15604k) && c() == eVar.c()) {
                int c = c();
                while (i10 < c) {
                    i10 = (g.a(j(i10).b(), eVar.j(i10).b()) && g.a(j(i10).h(), eVar.j(i10).h())) ? i10 + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    @Override // sa.e
    public final boolean f() {
        return false;
    }

    @Override // sa.e
    public final List<Annotation> g(int i10) {
        return this.f15601h[i10];
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return this.f15597d;
    }

    @Override // sa.e
    public final h h() {
        return this.f15596b;
    }

    public final int hashCode() {
        return ((Number) this.f15605l.getValue()).intValue();
    }

    @Override // sa.e
    public final boolean i() {
        return false;
    }

    @Override // sa.e
    public final e j(int i10) {
        return this.f15600g[i10];
    }

    @Override // sa.e
    public final boolean k(int i10) {
        return this.f15602i[i10];
    }

    public final String toString() {
        return c.t2(a1.c.V1(0, this.c), ", ", androidx.activity.e.j(new StringBuilder(), this.f15595a, '('), ")", new SerialDescriptorImpl$toString$1(this), 24);
    }
}
