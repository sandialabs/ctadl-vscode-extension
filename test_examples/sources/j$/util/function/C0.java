package j$.util.function;

import java.util.function.ObjLongConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class C0 implements E0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ObjLongConsumer f12193a;

    private /* synthetic */ C0(ObjLongConsumer objLongConsumer) {
        this.f12193a = objLongConsumer;
    }

    public static /* synthetic */ E0 a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof D0 ? ((D0) objLongConsumer).f12196a : new C0(objLongConsumer);
    }

    @Override // j$.util.function.E0
    public final /* synthetic */ void accept(Object obj, long j2) {
        this.f12193a.accept(obj, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0) {
            obj = ((C0) obj).f12193a;
        }
        return this.f12193a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12193a.hashCode();
    }
}
