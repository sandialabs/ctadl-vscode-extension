package j$.util.stream;

import j$.util.function.Function;

/* loaded from: classes2.dex */
final class V1 extends Y1 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f12396s;

    /* renamed from: t  reason: collision with root package name */
    final /* synthetic */ Function f12397t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V1(AbstractC0335c abstractC0335c, int i10, Function function, int i11) {
        super(abstractC0335c, i10);
        this.f12396s = i11;
        this.f12397t = function;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC0335c
    public final InterfaceC0363h2 K1(int i10, InterfaceC0363h2 interfaceC0363h2) {
        switch (this.f12396s) {
            case 0:
                return new T1(this, interfaceC0363h2, 2);
            default:
                return new T1(this, interfaceC0363h2, 6);
        }
    }
}
