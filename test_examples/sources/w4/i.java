package w4;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final String f18321a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18322b;
    public final int c;

    public i(int i10, int i11, String str) {
        v7.g.f(str, "workSpecId");
        this.f18321a = str;
        this.f18322b = i10;
        this.c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return v7.g.a(this.f18321a, iVar.f18321a) && this.f18322b == iVar.f18322b && this.c == iVar.c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f18321a.hashCode() * 31) + this.f18322b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f18321a);
        sb.append(", generation=");
        sb.append(this.f18322b);
        sb.append(", systemId=");
        return androidx.activity.e.h(sb, this.c, ')');
    }
}
