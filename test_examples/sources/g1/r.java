package g1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final long f11178a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11179b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f11180d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11181e;

    /* renamed from: f  reason: collision with root package name */
    public final float f11182f;

    /* renamed from: g  reason: collision with root package name */
    public final int f11183g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11184h;

    /* renamed from: i  reason: collision with root package name */
    public final List<e> f11185i;

    /* renamed from: j  reason: collision with root package name */
    public final long f11186j;

    public r() {
        throw null;
    }

    public r(long j2, long j10, long j11, long j12, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j13) {
        this.f11178a = j2;
        this.f11179b = j10;
        this.c = j11;
        this.f11180d = j12;
        this.f11181e = z10;
        this.f11182f = f10;
        this.f11183g = i10;
        this.f11184h = z11;
        this.f11185i = arrayList;
        this.f11186j = j13;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!n.a(this.f11178a, rVar.f11178a) || this.f11179b != rVar.f11179b || !u0.c.a(this.c, rVar.c) || !u0.c.a(this.f11180d, rVar.f11180d) || this.f11181e != rVar.f11181e || !v7.g.a(Float.valueOf(this.f11182f), Float.valueOf(rVar.f11182f))) {
            return false;
        }
        if (this.f11183g == rVar.f11183g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && this.f11184h == rVar.f11184h && v7.g.a(this.f11185i, rVar.f11185i) && u0.c.a(this.f11186j, rVar.f11186j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j2 = this.f11178a;
        long j10 = this.f11179b;
        int d5 = u0.c.d(this.c);
        int d10 = (u0.c.d(this.f11180d) + ((d5 + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31)) * 31)) * 31;
        int i10 = 1;
        boolean z10 = this.f11181e;
        int i11 = z10;
        if (z10 != 0) {
            i11 = 1;
        }
        int e10 = (androidx.activity.e.e(this.f11182f, (d10 + i11) * 31, 31) + this.f11183g) * 31;
        boolean z11 = this.f11184h;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        int hashCode = this.f11185i.hashCode();
        return u0.c.d(this.f11186j) + ((hashCode + ((e10 + i10) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) n.b(this.f11178a));
        sb.append(", uptime=");
        sb.append(this.f11179b);
        sb.append(", positionOnScreen=");
        sb.append((Object) u0.c.h(this.c));
        sb.append(", position=");
        sb.append((Object) u0.c.h(this.f11180d));
        sb.append(", down=");
        sb.append(this.f11181e);
        sb.append(", pressure=");
        sb.append(this.f11182f);
        sb.append(", type=");
        int i10 = this.f11183g;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb.append((Object) str);
        sb.append(", issuesEnterExit=");
        sb.append(this.f11184h);
        sb.append(", historical=");
        sb.append(this.f11185i);
        sb.append(", scrollDelta=");
        sb.append((Object) u0.c.h(this.f11186j));
        sb.append(')');
        return sb.toString();
    }
}
