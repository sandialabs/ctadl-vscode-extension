package j$.util.function;

import java.util.Comparator;

/* renamed from: j$.util.function.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0271c implements InterfaceC0277f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12233a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Comparator f12234b;

    public /* synthetic */ C0271c(Comparator comparator, int i10) {
        this.f12233a = i10;
        this.f12234b = comparator;
    }

    @Override // j$.util.function.BiFunction
    public final BiFunction a(Function function) {
        switch (this.f12233a) {
            case 0:
                function.getClass();
                return new j$.util.concurrent.u(this, function);
            default:
                function.getClass();
                return new j$.util.concurrent.u(this, function);
        }
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i10 = this.f12233a;
        Comparator comparator = this.f12234b;
        switch (i10) {
            case 0:
                return comparator.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
