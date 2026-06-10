package z0;

import java.util.ArrayList;
import java.util.List;
import v0.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f18993a;

    /* renamed from: b  reason: collision with root package name */
    public final float f18994b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f18995d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18996e;

    /* renamed from: f  reason: collision with root package name */
    public final i f18997f;

    /* renamed from: g  reason: collision with root package name */
    public final long f18998g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18999h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f19000i;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f19001a;

        /* renamed from: b  reason: collision with root package name */
        public final float f19002b;
        public final float c;

        /* renamed from: d  reason: collision with root package name */
        public final float f19003d;

        /* renamed from: e  reason: collision with root package name */
        public final float f19004e;

        /* renamed from: f  reason: collision with root package name */
        public final long f19005f;

        /* renamed from: g  reason: collision with root package name */
        public final int f19006g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f19007h;

        /* renamed from: i  reason: collision with root package name */
        public final ArrayList f19008i;

        /* renamed from: j  reason: collision with root package name */
        public final C0247a f19009j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f19010k;

        /* renamed from: z0.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0247a {

            /* renamed from: a  reason: collision with root package name */
            public final String f19011a;

            /* renamed from: b  reason: collision with root package name */
            public final float f19012b;
            public final float c;

            /* renamed from: d  reason: collision with root package name */
            public final float f19013d;

            /* renamed from: e  reason: collision with root package name */
            public final float f19014e;

            /* renamed from: f  reason: collision with root package name */
            public final float f19015f;

            /* renamed from: g  reason: collision with root package name */
            public final float f19016g;

            /* renamed from: h  reason: collision with root package name */
            public final float f19017h;

            /* renamed from: i  reason: collision with root package name */
            public final List<? extends d> f19018i;

            /* renamed from: j  reason: collision with root package name */
            public final List<k> f19019j;

            public C0247a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            }

            public C0247a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, int i10) {
                str = (i10 & 1) != 0 ? "" : str;
                f10 = (i10 & 2) != 0 ? 0.0f : f10;
                f11 = (i10 & 4) != 0 ? 0.0f : f11;
                f12 = (i10 & 8) != 0 ? 0.0f : f12;
                f13 = (i10 & 16) != 0 ? 1.0f : f13;
                f14 = (i10 & 32) != 0 ? 1.0f : f14;
                f15 = (i10 & 64) != 0 ? 0.0f : f15;
                f16 = (i10 & 128) != 0 ? 0.0f : f16;
                list = (i10 & 256) != 0 ? j.f19079a : list;
                ArrayList arrayList = (i10 & 512) != 0 ? new ArrayList() : null;
                v7.g.f(str, "name");
                v7.g.f(list, "clipPathData");
                v7.g.f(arrayList, "children");
                this.f19011a = str;
                this.f19012b = f10;
                this.c = f11;
                this.f19013d = f12;
                this.f19014e = f13;
                this.f19015f = f14;
                this.f19016g = f15;
                this.f19017h = f16;
                this.f19018i = list;
                this.f19019j = arrayList;
            }
        }

        public a(String str, float f10, float f11, float f12, float f13, long j2, int i10, boolean z10) {
            this.f19001a = str;
            this.f19002b = f10;
            this.c = f11;
            this.f19003d = f12;
            this.f19004e = f13;
            this.f19005f = j2;
            this.f19006g = i10;
            this.f19007h = z10;
            ArrayList arrayList = new ArrayList();
            this.f19008i = arrayList;
            C0247a c0247a = new C0247a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            this.f19009j = c0247a;
            arrayList.add(c0247a);
        }

        public final void a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list) {
            v7.g.f(str, "name");
            v7.g.f(list, "clipPathData");
            e();
            this.f19008i.add(new C0247a(str, f10, f11, f12, f13, f14, f15, f16, list, 512));
        }

        public final void b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10, int i11, int i12, v0.m mVar, v0.m mVar2, String str, List list) {
            v7.g.f(list, "pathData");
            v7.g.f(str, "name");
            e();
            ArrayList arrayList = this.f19008i;
            ((C0247a) arrayList.get(arrayList.size() - 1)).f19019j.add(new m(str, list, i10, mVar, f10, mVar2, f11, f12, i11, i12, f13, f14, f15, f16));
        }

        public final c c() {
            e();
            while (this.f19008i.size() > 1) {
                d();
            }
            String str = this.f19001a;
            float f10 = this.f19002b;
            float f11 = this.c;
            float f12 = this.f19003d;
            float f13 = this.f19004e;
            C0247a c0247a = this.f19009j;
            c cVar = new c(str, f10, f11, f12, f13, new i(c0247a.f19011a, c0247a.f19012b, c0247a.c, c0247a.f19013d, c0247a.f19014e, c0247a.f19015f, c0247a.f19016g, c0247a.f19017h, c0247a.f19018i, c0247a.f19019j), this.f19005f, this.f19006g, this.f19007h);
            this.f19010k = true;
            return cVar;
        }

        public final void d() {
            e();
            ArrayList arrayList = this.f19008i;
            C0247a c0247a = (C0247a) arrayList.remove(arrayList.size() - 1);
            ((C0247a) arrayList.get(arrayList.size() - 1)).f19019j.add(new i(c0247a.f19011a, c0247a.f19012b, c0247a.c, c0247a.f19013d, c0247a.f19014e, c0247a.f19015f, c0247a.f19016g, c0247a.f19017h, c0247a.f19018i, c0247a.f19019j));
        }

        public final void e() {
            if (!(!this.f19010k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }
    }

    public c(String str, float f10, float f11, float f12, float f13, i iVar, long j2, int i10, boolean z10) {
        this.f18993a = str;
        this.f18994b = f10;
        this.c = f11;
        this.f18995d = f12;
        this.f18996e = f13;
        this.f18997f = iVar;
        this.f18998g = j2;
        this.f18999h = i10;
        this.f19000i = z10;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!v7.g.a(this.f18993a, cVar.f18993a) || !b2.d.a(this.f18994b, cVar.f18994b) || !b2.d.a(this.c, cVar.c)) {
            return false;
        }
        if (this.f18995d == cVar.f18995d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        if (this.f18996e == cVar.f18996e) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 || !v7.g.a(this.f18997f, cVar.f18997f) || !r.c(this.f18998g, cVar.f18998g)) {
            return false;
        }
        if (this.f18999h == cVar.f18999h) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && this.f19000i == cVar.f19000i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e10 = androidx.activity.e.e(this.f18996e, androidx.activity.e.e(this.f18995d, androidx.activity.e.e(this.c, androidx.activity.e.e(this.f18994b, this.f18993a.hashCode() * 31, 31), 31), 31), 31);
        int i11 = r.f18134h;
        int f10 = (androidx.activity.e.f(this.f18998g, (this.f18997f.hashCode() + e10) * 31, 31) + this.f18999h) * 31;
        if (this.f19000i) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return f10 + i10;
    }
}
