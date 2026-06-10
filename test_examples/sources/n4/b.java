package n4;

import android.net.Uri;
import androidx.work.NetworkType;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final b f16075i = new b(0);

    /* renamed from: a  reason: collision with root package name */
    public final NetworkType f16076a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16077b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f16078d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16079e;

    /* renamed from: f  reason: collision with root package name */
    public final long f16080f;

    /* renamed from: g  reason: collision with root package name */
    public final long f16081g;

    /* renamed from: h  reason: collision with root package name */
    public final Set<a> f16082h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f16083a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16084b;

        public a(boolean z10, Uri uri) {
            this.f16083a = uri;
            this.f16084b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (v7.g.a(a.class, obj != null ? obj.getClass() : null)) {
                v7.g.d(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
                a aVar = (a) obj;
                return v7.g.a(this.f16083a, aVar.f16083a) && this.f16084b == aVar.f16084b;
            }
            return false;
        }

        public final int hashCode() {
            return (this.f16083a.hashCode() * 31) + (this.f16084b ? 1231 : 1237);
        }
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        this(NetworkType.NOT_REQUIRED, false, false, false, false, -1L, -1L, EmptySet.f12983i);
    }

    public b(NetworkType networkType, boolean z10, boolean z11, boolean z12, boolean z13, long j2, long j10, Set<a> set) {
        v7.g.f(networkType, "requiredNetworkType");
        v7.g.f(set, "contentUriTriggers");
        this.f16076a = networkType;
        this.f16077b = z10;
        this.c = z11;
        this.f16078d = z12;
        this.f16079e = z13;
        this.f16080f = j2;
        this.f16081g = j10;
        this.f16082h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v7.g.a(b.class, obj.getClass())) {
            b bVar = (b) obj;
            if (this.f16077b == bVar.f16077b && this.c == bVar.c && this.f16078d == bVar.f16078d && this.f16079e == bVar.f16079e && this.f16080f == bVar.f16080f && this.f16081g == bVar.f16081g && this.f16076a == bVar.f16076a) {
                return v7.g.a(this.f16082h, bVar.f16082h);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f16080f;
        long j10 = this.f16081g;
        return this.f16082h.hashCode() + (((((((((((((this.f16076a.hashCode() * 31) + (this.f16077b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.f16078d ? 1 : 0)) * 31) + (this.f16079e ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }
}
