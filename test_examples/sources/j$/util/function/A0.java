package j$.util.function;

import java.util.function.ObjIntConsumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class A0 implements ObjIntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ B0 f12189a;

    private /* synthetic */ A0(B0 b02) {
        this.f12189a = b02;
    }

    public static /* synthetic */ ObjIntConsumer a(B0 b02) {
        if (b02 == null) {
            return null;
        }
        return b02 instanceof z0 ? ((z0) b02).f12270a : new A0(b02);
    }

    @Override // java.util.function.ObjIntConsumer
    public final /* synthetic */ void accept(Object obj, int i10) {
        this.f12189a.accept(obj, i10);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        B0 b02 = this.f12189a;
        if (obj instanceof A0) {
            obj = ((A0) obj).f12189a;
        }
        return b02.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12189a.hashCode();
    }
}
