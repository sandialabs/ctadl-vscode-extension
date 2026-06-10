package j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class x0 implements ObjDoubleConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y0 f12268a;

    private /* synthetic */ x0(y0 y0Var) {
        this.f12268a = y0Var;
    }

    public static /* synthetic */ ObjDoubleConsumer a(y0 y0Var) {
        if (y0Var == null) {
            return null;
        }
        return y0Var instanceof w0 ? ((w0) y0Var).f12266a : new x0(y0Var);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final /* synthetic */ void accept(Object obj, double d5) {
        this.f12268a.accept(obj, d5);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        y0 y0Var = this.f12268a;
        if (obj instanceof x0) {
            obj = ((x0) obj).f12268a;
        }
        return y0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12268a.hashCode();
    }
}
