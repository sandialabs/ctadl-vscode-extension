package j$.util.function;

import java.util.function.ObjIntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class z0 implements B0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ObjIntConsumer f12270a;

    private /* synthetic */ z0(ObjIntConsumer objIntConsumer) {
        this.f12270a = objIntConsumer;
    }

    public static /* synthetic */ B0 a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof A0 ? ((A0) objIntConsumer).f12189a : new z0(objIntConsumer);
    }

    @Override // j$.util.function.B0
    public final /* synthetic */ void accept(Object obj, int i10) {
        this.f12270a.accept(obj, i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof z0) {
            obj = ((z0) obj).f12270a;
        }
        return this.f12270a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12270a.hashCode();
    }
}
