package u9;

/* loaded from: classes.dex */
public final class l<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f17931a;

    /* renamed from: b  reason: collision with root package name */
    public final T f17932b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final h9.b f17933d;

    /* JADX WARN: Multi-variable type inference failed */
    public l(g9.e eVar, g9.e eVar2, String str, h9.b bVar) {
        v7.g.f(str, "filePath");
        v7.g.f(bVar, "classId");
        this.f17931a = eVar;
        this.f17932b = eVar2;
        this.c = str;
        this.f17933d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return v7.g.a(this.f17931a, lVar.f17931a) && v7.g.a(this.f17932b, lVar.f17932b) && v7.g.a(this.c, lVar.c) && v7.g.a(this.f17933d, lVar.f17933d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        T t10 = this.f17931a;
        if (t10 == null) {
            hashCode = 0;
        } else {
            hashCode = t10.hashCode();
        }
        int i11 = hashCode * 31;
        T t11 = this.f17932b;
        if (t11 != null) {
            i10 = t11.hashCode();
        }
        return this.f17933d.hashCode() + a4.b.g(this.c, (i11 + i10) * 31, 31);
    }

    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f17931a + ", expectedVersion=" + this.f17932b + ", filePath=" + this.c + ", classId=" + this.f17933d + ')';
    }
}
