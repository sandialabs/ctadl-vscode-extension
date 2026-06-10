package j$.util.function;

import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class I0 implements K0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Supplier f12207a;

    private /* synthetic */ I0(Supplier supplier) {
        this.f12207a = supplier;
    }

    public static /* synthetic */ K0 a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof J0 ? ((J0) supplier).f12210a : new I0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof I0) {
            obj = ((I0) obj).f12207a;
        }
        return this.f12207a.equals(obj);
    }

    @Override // j$.util.function.K0
    public final /* synthetic */ Object get() {
        return this.f12207a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.f12207a.hashCode();
    }
}
