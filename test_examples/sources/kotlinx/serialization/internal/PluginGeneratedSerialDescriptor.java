package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.collections.d;
import kotlinx.serialization.descriptors.b;
import sa.e;
import sa.h;
import ua.f0;
import ua.m;
import v7.g;

/* loaded from: classes.dex */
public class PluginGeneratedSerialDescriptor implements e, m {

    /* renamed from: a  reason: collision with root package name */
    public final String f15635a;

    /* renamed from: b  reason: collision with root package name */
    public final f0<?> f15636b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public int f15637d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f15638e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Annotation>[] f15639f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f15640g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, Integer> f15641h;

    /* renamed from: i  reason: collision with root package name */
    public final m7.e f15642i;

    /* renamed from: j  reason: collision with root package name */
    public final m7.e f15643j;

    /* renamed from: k  reason: collision with root package name */
    public final m7.e f15644k;

    public PluginGeneratedSerialDescriptor(String str, f0<?> f0Var, int i10) {
        g.f(str, "serialName");
        this.f15635a = str;
        this.f15636b = f0Var;
        this.c = i10;
        this.f15637d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f15638e = strArr;
        int i12 = this.c;
        this.f15639f = new List[i12];
        this.f15640g = new boolean[i12];
        this.f15641h = d.K1();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f15642i = kotlin.a.a(lazyThreadSafetyMode, new PluginGeneratedSerialDescriptor$childSerializers$2(this));
        this.f15643j = kotlin.a.a(lazyThreadSafetyMode, new PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(this));
        this.f15644k = kotlin.a.a(lazyThreadSafetyMode, new PluginGeneratedSerialDescriptor$_hashCode$2(this));
    }

    @Override // sa.e
    public final int a(String str) {
        g.f(str, "name");
        Integer num = this.f15641h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // sa.e
    public final String b() {
        return this.f15635a;
    }

    @Override // sa.e
    public final int c() {
        return this.c;
    }

    @Override // sa.e
    public final String d(int i10) {
        return this.f15638e[i10];
    }

    @Override // ua.m
    public final Set<String> e() {
        return this.f15641h.keySet();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PluginGeneratedSerialDescriptor)) {
                return false;
            }
            e eVar = (e) obj;
            if (g.a(this.f15635a, eVar.b()) && Arrays.equals((e[]) this.f15643j.getValue(), (e[]) ((PluginGeneratedSerialDescriptor) obj).f15643j.getValue())) {
                int c = eVar.c();
                int i10 = this.c;
                if (i10 != c) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    if (g.a(j(i11).b(), eVar.j(i11).b()) && g.a(j(i11).h(), eVar.j(i11).h())) {
                    }
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // sa.e
    public final boolean f() {
        return false;
    }

    @Override // sa.e
    public final List<Annotation> g(int i10) {
        List<Annotation> list = this.f15639f[i10];
        if (list == null) {
            return EmptyList.f12981i;
        }
        return list;
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f12981i;
    }

    @Override // sa.e
    public h h() {
        return b.a.f15609a;
    }

    public int hashCode() {
        return ((Number) this.f15644k.getValue()).intValue();
    }

    @Override // sa.e
    public boolean i() {
        return false;
    }

    @Override // sa.e
    public e j(int i10) {
        return ((qa.b[]) this.f15642i.getValue())[i10].a();
    }

    @Override // sa.e
    public final boolean k(int i10) {
        return this.f15640g[i10];
    }

    public final void l(String str, boolean z10) {
        g.f(str, "name");
        int i10 = this.f15637d + 1;
        this.f15637d = i10;
        String[] strArr = this.f15638e;
        strArr[i10] = str;
        this.f15640g[i10] = z10;
        this.f15639f[i10] = null;
        if (i10 == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                hashMap.put(strArr[i11], Integer.valueOf(i11));
            }
            this.f15641h = hashMap;
        }
    }

    public String toString() {
        return c.t2(a1.c.V1(0, this.c), ", ", androidx.activity.e.j(new StringBuilder(), this.f15635a, '('), ")", new PluginGeneratedSerialDescriptor$toString$1(this), 24);
    }
}
