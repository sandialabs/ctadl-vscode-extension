package j$.util.stream;

import androidx.datastore.preferences.PreferencesProto$Value;
import j$.util.AbstractC0261c;
import j$.util.Spliterator;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class X2 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final boolean f12422a;

    /* renamed from: b  reason: collision with root package name */
    final AbstractC0421w0 f12423b;
    private j$.util.function.K0 c;

    /* renamed from: d  reason: collision with root package name */
    Spliterator f12424d;

    /* renamed from: e  reason: collision with root package name */
    InterfaceC0363h2 f12425e;

    /* renamed from: f  reason: collision with root package name */
    C0325a f12426f;

    /* renamed from: g  reason: collision with root package name */
    long f12427g;

    /* renamed from: h  reason: collision with root package name */
    AbstractC0345e f12428h;

    /* renamed from: i  reason: collision with root package name */
    boolean f12429i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2(AbstractC0421w0 abstractC0421w0, Spliterator spliterator, boolean z10) {
        this.f12423b = abstractC0421w0;
        this.c = null;
        this.f12424d = spliterator;
        this.f12422a = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public X2(AbstractC0421w0 abstractC0421w0, C0325a c0325a, boolean z10) {
        this.f12423b = abstractC0421w0;
        this.c = c0325a;
        this.f12424d = null;
        this.f12422a = z10;
    }

    private boolean g() {
        boolean a10;
        while (this.f12428h.count() == 0) {
            if (!this.f12425e.i()) {
                C0325a c0325a = this.f12426f;
                int i10 = c0325a.f12431a;
                Object obj = c0325a.f12432b;
                switch (i10) {
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        C0359g3 c0359g3 = (C0359g3) obj;
                        a10 = c0359g3.f12424d.a(c0359g3.f12425e);
                        break;
                    case 5:
                        i3 i3Var = (i3) obj;
                        a10 = i3Var.f12424d.a(i3Var.f12425e);
                        break;
                    case 6:
                        k3 k3Var = (k3) obj;
                        a10 = k3Var.f12424d.a(k3Var.f12425e);
                        break;
                    default:
                        C3 c32 = (C3) obj;
                        a10 = c32.f12424d.a(c32.f12425e);
                        break;
                }
                if (a10) {
                    continue;
                }
            }
            if (this.f12429i) {
                return false;
            }
            this.f12425e.end();
            this.f12429i = true;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        h();
        int o10 = V2.o(this.f12423b.g1()) & V2.f12398f;
        return (o10 & 64) != 0 ? (o10 & (-16449)) | (this.f12424d.characteristics() & 16448) : o10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        AbstractC0345e abstractC0345e = this.f12428h;
        if (abstractC0345e == null) {
            if (this.f12429i) {
                return false;
            }
            h();
            i();
            this.f12427g = 0L;
            this.f12425e.g(this.f12424d.getExactSizeIfKnown());
            return g();
        }
        long j2 = this.f12427g + 1;
        this.f12427g = j2;
        boolean z10 = j2 < abstractC0345e.count();
        if (z10) {
            return z10;
        }
        this.f12427g = 0L;
        this.f12428h.clear();
        return g();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        h();
        return this.f12424d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC0261c.j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        h();
        if (V2.SIZED.i(this.f12423b.g1())) {
            return this.f12424d.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (this.f12424d == null) {
            this.f12424d = (Spliterator) this.c.get();
            this.c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return AbstractC0261c.j(this, i10);
    }

    abstract void i();

    abstract X2 j(Spliterator spliterator);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f12424d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f12422a || this.f12429i) {
            return null;
        }
        h();
        Spliterator trySplit = this.f12424d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return j(trySplit);
    }
}
