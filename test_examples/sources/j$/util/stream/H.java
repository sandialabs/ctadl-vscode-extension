package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Predicate;

/* loaded from: classes2.dex */
final class H implements E3 {

    /* renamed from: a  reason: collision with root package name */
    final boolean f12317a;

    /* renamed from: b  reason: collision with root package name */
    final Object f12318b;
    final Predicate c;

    /* renamed from: d  reason: collision with root package name */
    final j$.util.function.K0 f12319d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public H(boolean z10, W2 w22, Object obj, S1 s12, C0330b c0330b) {
        this.f12317a = z10;
        this.f12318b = obj;
        this.c = s12;
        this.f12319d = c0330b;
    }

    @Override // j$.util.stream.E3
    public final int P() {
        return V2.f12412u | (this.f12317a ? 0 : V2.f12409r);
    }

    @Override // j$.util.stream.E3
    public final Object n0(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        F3 f32 = (F3) this.f12319d.get();
        abstractC0421w0.w1(spliterator, f32);
        Object obj = f32.get();
        return obj != null ? obj : this.f12318b;
    }

    @Override // j$.util.stream.E3
    public final Object y(AbstractC0421w0 abstractC0421w0, Spliterator spliterator) {
        return new N(this, abstractC0421w0, spliterator).invoke();
    }
}
