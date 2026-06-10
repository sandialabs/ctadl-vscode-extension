package j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class w0 implements y0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ObjDoubleConsumer f12266a;

    private /* synthetic */ w0(ObjDoubleConsumer objDoubleConsumer) {
        this.f12266a = objDoubleConsumer;
    }

    public static /* synthetic */ y0 a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof x0 ? ((x0) objDoubleConsumer).f12268a : new w0(objDoubleConsumer);
    }

    @Override // j$.util.function.y0
    public final /* synthetic */ void accept(Object obj, double d5) {
        this.f12266a.accept(obj, d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof w0) {
            obj = ((w0) obj).f12266a;
        }
        return this.f12266a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12266a.hashCode();
    }
}
