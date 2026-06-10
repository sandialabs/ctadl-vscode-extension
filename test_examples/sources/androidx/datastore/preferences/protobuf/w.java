package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    public volatile i0 f4949a;

    /* renamed from: b  reason: collision with root package name */
    public volatile ByteString f4950b;

    static {
        m.a();
    }

    public final i0 a(i0 i0Var) {
        if (this.f4949a == null) {
            synchronized (this) {
                if (this.f4949a == null) {
                    try {
                        this.f4949a = i0Var;
                        this.f4950b = ByteString.f4776j;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f4949a = i0Var;
                        this.f4950b = ByteString.f4776j;
                    }
                }
            }
        }
        return this.f4949a;
    }

    public final ByteString b() {
        if (this.f4950b != null) {
            return this.f4950b;
        }
        synchronized (this) {
            if (this.f4950b != null) {
                return this.f4950b;
            }
            this.f4950b = this.f4949a == null ? ByteString.f4776j : this.f4949a.h();
            return this.f4950b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            i0 i0Var = this.f4949a;
            i0 i0Var2 = wVar.f4949a;
            return (i0Var == null && i0Var2 == null) ? b().equals(wVar.b()) : (i0Var == null || i0Var2 == null) ? i0Var != null ? i0Var.equals(wVar.a(i0Var.f())) : a(i0Var2.f()).equals(i0Var2) : i0Var.equals(i0Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
