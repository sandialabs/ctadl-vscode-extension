package j$.util.function;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class J0 implements Supplier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K0 f12210a;

    private /* synthetic */ J0(K0 k02) {
        this.f12210a = k02;
    }

    public static /* synthetic */ Supplier a(K0 k02) {
        if (k02 == null) {
            return null;
        }
        return k02 instanceof I0 ? ((I0) k02).f12207a : new J0(k02);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        K0 k02 = this.f12210a;
        if (obj instanceof J0) {
            obj = ((J0) obj).f12210a;
        }
        return k02.equals(obj);
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.f12210a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12210a.hashCode();
    }
}
