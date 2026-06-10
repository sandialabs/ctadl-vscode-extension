package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class C3 extends X2 {
    C3(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10) {
        super(abstractC0421w0, spliterator, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        super(abstractC0421w0, c0325a, z10);
    }

    @Override // j$.util.Spliterator
    public final boolean a(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean e10 = e();
        if (e10) {
            R2 r22 = (R2) this.f12428h;
            long j2 = this.f12427g;
            if (r22.c != 0) {
                if (j2 < r22.count()) {
                    for (int i10 = 0; i10 <= r22.c; i10++) {
                        long j10 = r22.f12457d[i10];
                        Object[] objArr = r22.f12375f[i10];
                        if (j2 < objArr.length + j10) {
                            obj = objArr[(int) (j2 - j10)];
                        }
                    }
                    throw new IndexOutOfBoundsException(Long.toString(j2));
                }
                throw new IndexOutOfBoundsException(Long.toString(j2));
            } else if (j2 >= r22.f12456b) {
                throw new IndexOutOfBoundsException(Long.toString(j2));
            } else {
                obj = r22.f12374e[(int) j2];
            }
            consumer.accept(obj);
        }
        return e10;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f12428h != null || this.f12429i) {
            do {
            } while (a(consumer));
            return;
        }
        consumer.getClass();
        h();
        B3 b32 = new B3(consumer, 1);
        this.f12423b.w1(this.f12424d, b32);
        this.f12429i = true;
    }

    @Override // j$.util.stream.X2
    final void i() {
        R2 r22 = new R2();
        this.f12428h = r22;
        this.f12425e = this.f12423b.x1(new B3(r22, 0));
        this.f12426f = new C0325a(7, this);
    }

    @Override // j$.util.stream.X2
    final X2 j(Spliterator spliterator) {
        return new C3(this.f12423b, spliterator, this.f12422a);
    }
}
