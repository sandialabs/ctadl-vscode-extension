package kotlin.collections;

import da.c;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;
import v7.g;

/* loaded from: classes.dex */
public abstract class a<T> implements Iterator<T>, w7.a, j$.util.Iterator {

    /* renamed from: i  reason: collision with root package name */
    public State f12989i = State.NotReady;

    /* renamed from: j  reason: collision with root package name */
    public T f12990j;

    public final void a() {
        this.f12989i = State.Done;
    }

    public final void b(T t10) {
        this.f12990j = t10;
        this.f12989i = State.Ready;
    }

    @Override // j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        int i10;
        Object[] objArr;
        State state = this.f12989i;
        State state2 = State.Failed;
        if (state != state2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int ordinal = state.ordinal();
            if (ordinal == 0) {
                return true;
            }
            if (ordinal != 2) {
                this.f12989i = state2;
                c.a aVar = (c.a) this;
                do {
                    i10 = aVar.f10478k + 1;
                    aVar.f10478k = i10;
                    objArr = aVar.f10479l.f10476i;
                    if (i10 >= objArr.length) {
                        break;
                    }
                } while (objArr[i10] == null);
                if (i10 >= objArr.length) {
                    aVar.a();
                } else {
                    Object obj = objArr[i10];
                    g.d(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                    aVar.b(obj);
                }
                if (this.f12989i == State.Ready) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f12989i = State.NotReady;
            return this.f12990j;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
