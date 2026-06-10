package j$.util.function;

import java.util.function.IntUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class W implements Y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntUnaryOperator f12227a;

    private /* synthetic */ W(IntUnaryOperator intUnaryOperator) {
        this.f12227a = intUnaryOperator;
    }

    public static /* synthetic */ Y d(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return intUnaryOperator instanceof X ? ((X) intUnaryOperator).f12228a : new W(intUnaryOperator);
    }

    public final /* synthetic */ Y a(Y y10) {
        return d(this.f12227a.andThen(X.a(y10)));
    }

    public final /* synthetic */ int b(int i10) {
        return this.f12227a.applyAsInt(i10);
    }

    public final /* synthetic */ Y c(Y y10) {
        return d(this.f12227a.compose(X.a(y10)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof W) {
            obj = ((W) obj).f12227a;
        }
        return this.f12227a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12227a.hashCode();
    }
}
