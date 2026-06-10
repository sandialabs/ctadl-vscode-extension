package j$.util.stream;

import j$.util.function.Predicate;

/* renamed from: j$.util.stream.o0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0390o0 extends AbstractC0405s0 {
    final /* synthetic */ EnumC0409t0 c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Predicate f12508d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0390o0(Predicate predicate, EnumC0409t0 enumC0409t0) {
        super(enumC0409t0);
        this.c = enumC0409t0;
        this.f12508d = predicate;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        if (this.f12537a) {
            return;
        }
        boolean test = this.f12508d.test(obj);
        EnumC0409t0 enumC0409t0 = this.c;
        z10 = enumC0409t0.f12542a;
        if (test == z10) {
            this.f12537a = true;
            z11 = enumC0409t0.f12543b;
            this.f12538b = z11;
        }
    }
}
