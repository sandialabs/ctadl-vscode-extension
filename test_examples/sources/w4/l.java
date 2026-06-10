package w4;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f18326a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18327b;

    public l(String str, int i10) {
        v7.g.f(str, "workSpecId");
        this.f18326a = str;
        this.f18327b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return v7.g.a(this.f18326a, lVar.f18326a) && this.f18327b == lVar.f18327b;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f18326a.hashCode() * 31) + this.f18327b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb.append(this.f18326a);
        sb.append(", generation=");
        return androidx.activity.e.h(sb, this.f18327b, ')');
    }
}
