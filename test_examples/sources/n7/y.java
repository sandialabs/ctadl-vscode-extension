package n7;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y<T> extends c<T> {

    /* renamed from: i  reason: collision with root package name */
    public final List<T> f16133i;

    public y(ArrayList arrayList) {
        this.f16133i = arrayList;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, T t10) {
        if (new b8.i(0, size()).s(i10)) {
            this.f16133i.add(size() - i10, t10);
            return;
        }
        StringBuilder o10 = a4.b.o("Position index ", i10, " must be in range [");
        o10.append(new b8.i(0, size()));
        o10.append("].");
        throw new IndexOutOfBoundsException(o10.toString());
    }

    @Override // n7.c
    public final int c() {
        return this.f16133i.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f16133i.clear();
    }

    @Override // n7.c
    public final T d(int i10) {
        return this.f16133i.remove(n.e2(i10, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i10) {
        return this.f16133i.get(n.e2(i10, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i10, T t10) {
        return this.f16133i.set(n.e2(i10, this), t10);
    }
}
