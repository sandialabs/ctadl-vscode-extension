package o1;

import m7.c;

/* loaded from: classes.dex */
public final class a<T extends m7.c<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    public final String f16184a;

    /* renamed from: b  reason: collision with root package name */
    public final T f16185b;

    public a(String str, T t10) {
        this.f16184a = str;
        this.f16185b = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return v7.g.a(this.f16184a, aVar.f16184a) && v7.g.a(this.f16185b, aVar.f16185b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16184a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        T t10 = this.f16185b;
        return hashCode + (t10 != null ? t10.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f16184a + ", action=" + this.f16185b + ')';
    }
}
