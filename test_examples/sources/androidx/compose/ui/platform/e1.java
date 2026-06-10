package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3840a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3841b;

    public e1(Object obj, String str) {
        this.f3840a = str;
        this.f3841b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            e1 e1Var = (e1) obj;
            return v7.g.a(this.f3840a, e1Var.f3840a) && v7.g.a(this.f3841b, e1Var.f3841b);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f3840a.hashCode() * 31;
        Object obj = this.f3841b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ValueElement(name=" + this.f3840a + ", value=" + this.f3841b + ')';
    }
}
