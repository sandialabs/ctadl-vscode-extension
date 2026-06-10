package ha;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import u7.p;

/* loaded from: classes.dex */
public final class b implements ga.h<b8.i> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f11601a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11602b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, Pair<Integer, Integer>> f11603d;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<b8.i>, w7.a, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f11604i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f11605j;

        /* renamed from: k  reason: collision with root package name */
        public int f11606k;

        /* renamed from: l  reason: collision with root package name */
        public b8.i f11607l;

        /* renamed from: m  reason: collision with root package name */
        public int f11608m;

        public a() {
            int c0 = a1.c.c0(b.this.f11602b, 0, b.this.f11601a.length());
            this.f11605j = c0;
            this.f11606k = c0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
            if (r6 < r3) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a() {
            b8.i iVar;
            int i10 = this.f11606k;
            int i11 = 0;
            if (i10 < 0) {
                this.f11604i = 0;
                this.f11607l = null;
                return;
            }
            b bVar = b.this;
            int i12 = bVar.c;
            if (i12 > 0) {
                int i13 = this.f11608m + 1;
                this.f11608m = i13;
            }
            if (i10 <= bVar.f11601a.length()) {
                Pair<Integer, Integer> R = bVar.f11603d.R(bVar.f11601a, Integer.valueOf(this.f11606k));
                if (R == null) {
                    iVar = new b8.i(this.f11605j, kotlin.text.b.a1(bVar.f11601a));
                    this.f11607l = iVar;
                    this.f11606k = -1;
                    this.f11604i = 1;
                }
                int intValue = R.f12962i.intValue();
                int intValue2 = R.f12963j.intValue();
                this.f11607l = a1.c.V1(this.f11605j, intValue);
                int i14 = intValue + intValue2;
                this.f11605j = i14;
                if (intValue2 == 0) {
                    i11 = 1;
                }
                this.f11606k = i14 + i11;
                this.f11604i = 1;
            }
            iVar = new b8.i(this.f11605j, kotlin.text.b.a1(bVar.f11601a));
            this.f11607l = iVar;
            this.f11606k = -1;
            this.f11604i = 1;
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super b8.i> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f11604i == -1) {
                a();
            }
            return this.f11604i == 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (this.f11604i == -1) {
                a();
            }
            if (this.f11604i != 0) {
                b8.i iVar = this.f11607l;
                v7.g.d(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f11607l = null;
                this.f11604i = -1;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> pVar) {
        v7.g.f(charSequence, "input");
        this.f11601a = charSequence;
        this.f11602b = i10;
        this.c = i11;
        this.f11603d = pVar;
    }

    @Override // ga.h
    public final java.util.Iterator<b8.i> iterator() {
        return new a();
    }
}
