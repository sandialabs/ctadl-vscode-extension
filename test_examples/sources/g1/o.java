package g1;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final long f11162a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11163b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11164d;

    /* renamed from: e  reason: collision with root package name */
    public final long f11165e;

    /* renamed from: f  reason: collision with root package name */
    public final long f11166f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11167g;

    /* renamed from: h  reason: collision with root package name */
    public final int f11168h;

    /* renamed from: i  reason: collision with root package name */
    public final long f11169i;

    /* renamed from: j  reason: collision with root package name */
    public final Float f11170j;

    /* renamed from: k  reason: collision with root package name */
    public final List<e> f11171k;

    /* renamed from: l  reason: collision with root package name */
    public d f11172l;

    public o() {
        throw null;
    }

    public o(long j2, long j10, long j11, boolean z10, float f10, long j12, long j13, boolean z11, int i10, List list, long j14) {
        this(j2, j10, j11, z10, f10, j12, j13, z11, false, i10, j14);
        this.f11171k = list;
    }

    public final void a() {
        d dVar = this.f11172l;
        dVar.f11140b = true;
        dVar.f11139a = true;
    }

    public final boolean b() {
        d dVar = this.f11172l;
        if (!dVar.f11140b && !dVar.f11139a) {
            return false;
        }
        return true;
    }

    public final String toString() {
        float f10;
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) n.b(this.f11162a));
        sb.append(", uptimeMillis=");
        sb.append(this.f11163b);
        sb.append(", position=");
        sb.append((Object) u0.c.h(this.c));
        sb.append(", pressed=");
        sb.append(this.f11164d);
        sb.append(", pressure=");
        Float f11 = this.f11170j;
        if (f11 != null) {
            f10 = f11.floatValue();
        } else {
            f10 = 0.0f;
        }
        sb.append(f10);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f11165e);
        sb.append(", previousPosition=");
        sb.append((Object) u0.c.h(this.f11166f));
        sb.append(", previousPressed=");
        sb.append(this.f11167g);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        int i10 = this.f11168h;
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
        sb.append(", historical=");
        Object obj = this.f11171k;
        if (obj == null) {
            obj = EmptyList.f12981i;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) u0.c.h(this.f11169i));
        sb.append(')');
        return sb.toString();
    }

    public o(long j2, long j10, long j11, boolean z10, float f10, long j12, long j13, boolean z11, boolean z12, int i10, long j14) {
        this.f11162a = j2;
        this.f11163b = j10;
        this.c = j11;
        this.f11164d = z10;
        this.f11165e = j12;
        this.f11166f = j13;
        this.f11167g = z11;
        this.f11168h = i10;
        this.f11169i = j14;
        this.f11172l = new d(z12, z12);
        this.f11170j = Float.valueOf(f10);
    }
}
