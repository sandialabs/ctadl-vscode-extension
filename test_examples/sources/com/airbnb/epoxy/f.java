package com.airbnb.epoxy;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f implements Iterable<b0> {

    /* renamed from: i  reason: collision with root package name */
    public final p.e<b0> f6637i = new p.e<>();

    /* loaded from: classes.dex */
    public class a implements Iterator<b0>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f6638i = 0;

        public a() {
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super b0> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f6638i < f.this.f6637i.L()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (hasNext()) {
                p.e<b0> eVar = f.this.f6637i;
                int i10 = this.f6638i;
                this.f6638i = i10 + 1;
                return eVar.M(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<b0> iterator() {
        return new a();
    }
}
