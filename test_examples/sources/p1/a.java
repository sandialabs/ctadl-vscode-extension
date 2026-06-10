package p1;

import java.util.Comparator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class a implements CharSequence {

    /* renamed from: i  reason: collision with root package name */
    public final String f16641i;

    /* renamed from: j  reason: collision with root package name */
    public final List<C0207a<k>> f16642j;

    /* renamed from: k  reason: collision with root package name */
    public final List<C0207a<h>> f16643k;

    /* renamed from: l  reason: collision with root package name */
    public final List<C0207a<? extends Object>> f16644l;

    /* renamed from: p1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0207a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f16645a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16646b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final String f16647d;

        public C0207a(int i10, int i11, Object obj) {
            this(obj, i10, i11, "");
        }

        public C0207a(T t10, int i10, int i11, String str) {
            v7.g.f(str, "tag");
            this.f16645a = t10;
            this.f16646b = i10;
            this.c = i11;
            this.f16647d = str;
            if (!(i10 <= i11)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0207a) {
                C0207a c0207a = (C0207a) obj;
                return v7.g.a(this.f16645a, c0207a.f16645a) && this.f16646b == c0207a.f16646b && this.c == c0207a.c && v7.g.a(this.f16647d, c0207a.f16647d);
            }
            return false;
        }

        public final int hashCode() {
            T t10 = this.f16645a;
            return this.f16647d.hashCode() + ((((((t10 == null ? 0 : t10.hashCode()) * 31) + this.f16646b) * 31) + this.c) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.f16645a);
            sb.append(", start=");
            sb.append(this.f16646b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return androidx.activity.e.j(sb, this.f16647d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return a1.c.g0(Integer.valueOf(((C0207a) t10).f16646b), Integer.valueOf(((C0207a) t11).f16646b));
        }
    }

    public a() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, List list, int i10) {
        this(str, list, r4, EmptyList.f12981i);
        list = (i10 & 2) != 0 ? EmptyList.f12981i : list;
        EmptyList emptyList = (i10 & 4) != 0 ? EmptyList.f12981i : null;
        v7.g.f(str, "text");
        v7.g.f(list, "spanStyles");
        v7.g.f(emptyList, "paragraphStyles");
    }

    @Override // java.lang.CharSequence
    /* renamed from: a */
    public final a subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
        }
        String str = this.f16641i;
        if (i10 == 0 && i11 == str.length()) {
            return this;
        }
        String substring = str.substring(i10, i11);
        v7.g.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new a(substring, p1.b.a(this.f16642j, i10, i11), p1.b.a(this.f16643k, i10, i11), p1.b.a(this.f16644l, i10, i11));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f16641i.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return v7.g.a(this.f16641i, aVar.f16641i) && v7.g.a(this.f16642j, aVar.f16642j) && v7.g.a(this.f16643k, aVar.f16643k) && v7.g.a(this.f16644l, aVar.f16644l);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f16642j.hashCode();
        int hashCode2 = this.f16643k.hashCode();
        return this.f16644l.hashCode() + ((hashCode2 + ((hashCode + (this.f16641i.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f16641i.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f16641i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, List<C0207a<k>> list, List<C0207a<h>> list2, List<? extends C0207a<? extends Object>> list3) {
        v7.g.f(str, "text");
        v7.g.f(list3, "annotations");
        this.f16641i = str;
        this.f16642j = list;
        this.f16643k = list2;
        this.f16644l = list3;
        List G2 = kotlin.collections.c.G2(list2, new b());
        int size = G2.size();
        int i10 = -1;
        int i11 = 0;
        while (i11 < size) {
            C0207a c0207a = (C0207a) G2.get(i11);
            boolean z10 = true;
            if (!(c0207a.f16646b >= i10)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
            int length = this.f16641i.length();
            int i12 = c0207a.c;
            if (i12 > length) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + c0207a.f16646b + ", " + i12 + ") is out of boundary").toString());
            }
            i11++;
            i10 = i12;
        }
    }
}
