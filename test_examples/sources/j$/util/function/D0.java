package j$.util.function;

import java.util.function.ObjLongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class D0 implements ObjLongConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ E0 f12196a;

    private /* synthetic */ D0(E0 e02) {
        this.f12196a = e02;
    }

    public static /* synthetic */ ObjLongConsumer a(E0 e02) {
        if (e02 == null) {
            return null;
        }
        return e02 instanceof C0 ? ((C0) e02).f12193a : new D0(e02);
    }

    @Override // java.util.function.ObjLongConsumer
    public final /* synthetic */ void accept(Object obj, long j2) {
        this.f12196a.accept(obj, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        E0 e02 = this.f12196a;
        if (obj instanceof D0) {
            obj = ((D0) obj).f12196a;
        }
        return e02.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12196a.hashCode();
    }
}
