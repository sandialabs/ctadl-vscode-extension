package u1;

import java.util.List;

/* loaded from: classes.dex */
public final class m implements Comparable<m> {

    /* renamed from: j  reason: collision with root package name */
    public static final m f17751j;

    /* renamed from: k  reason: collision with root package name */
    public static final m f17752k;

    /* renamed from: l  reason: collision with root package name */
    public static final m f17753l;

    /* renamed from: m  reason: collision with root package name */
    public static final m f17754m;
    public static final m n;

    /* renamed from: o  reason: collision with root package name */
    public static final m f17755o;

    /* renamed from: p  reason: collision with root package name */
    public static final m f17756p;

    /* renamed from: q  reason: collision with root package name */
    public static final m f17757q;

    /* renamed from: r  reason: collision with root package name */
    public static final List<m> f17758r;

    /* renamed from: i  reason: collision with root package name */
    public final int f17759i;

    static {
        m mVar = new m(100);
        m mVar2 = new m(200);
        m mVar3 = new m(300);
        m mVar4 = new m(400);
        f17751j = mVar4;
        m mVar5 = new m(500);
        f17752k = mVar5;
        m mVar6 = new m(600);
        f17753l = mVar6;
        m mVar7 = new m(700);
        m mVar8 = new m(800);
        m mVar9 = new m(900);
        f17754m = mVar;
        n = mVar4;
        f17755o = mVar5;
        f17756p = mVar6;
        f17757q = mVar7;
        f17758r = a1.c.O0(mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9);
    }

    public m(int i10) {
        this.f17759i = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(androidx.activity.e.g("Font weight can be in range [1, 1000]. Current value: ", i10).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(m mVar) {
        v7.g.f(mVar, "other");
        return v7.g.h(this.f17759i, mVar.f17759i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.f17759i == ((m) obj).f17759i;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17759i;
    }

    public final String toString() {
        return androidx.activity.e.h(new StringBuilder("FontWeight(weight="), this.f17759i, ')');
    }
}
