package y9;

/* loaded from: classes.dex */
public abstract class e implements e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f18946a;

    @Override // y9.e0
    public abstract l8.d c();

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0) || obj.hashCode() != hashCode()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (e0Var.e().size() != e().size()) {
            return false;
        }
        l8.d c = c();
        l8.d c10 = e0Var.c();
        if (c10 == null) {
            return false;
        }
        if (!aa.h.f(c) && !k9.d.o(c)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (aa.h.f(c10) || k9.d.o(c10)) {
                z11 = false;
            }
            if (z11) {
                return g(c10);
            }
        }
        return false;
    }

    public abstract boolean g(l8.d dVar);

    public final int hashCode() {
        boolean z10;
        int identityHashCode;
        int i10 = this.f18946a;
        if (i10 != 0) {
            return i10;
        }
        l8.d c = c();
        if (!aa.h.f(c) && !k9.d.o(c)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            identityHashCode = k9.d.g(c).hashCode();
        } else {
            identityHashCode = System.identityHashCode(this);
        }
        this.f18946a = identityHashCode;
        return identityHashCode;
    }
}
