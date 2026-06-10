package i0;

import java.util.Collection;
import java.util.List;
import v7.g;

/* loaded from: classes.dex */
public interface a<E> extends List<E>, Collection, w7.a {

    /* renamed from: i0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0127a<E> extends n7.a<E> implements a<E> {

        /* renamed from: i  reason: collision with root package name */
        public final a<E> f11670i;

        /* renamed from: j  reason: collision with root package name */
        public final int f11671j;

        /* renamed from: k  reason: collision with root package name */
        public final int f11672k;

        /* JADX WARN: Multi-variable type inference failed */
        public C0127a(a<? extends E> aVar, int i10, int i11) {
            g.f(aVar, "source");
            this.f11670i = aVar;
            this.f11671j = i10;
            a1.c.X(i10, i11, aVar.size());
            this.f11672k = i11 - i10;
        }

        @Override // kotlin.collections.AbstractCollection
        public final int c() {
            return this.f11672k;
        }

        @Override // n7.a, java.util.List
        public final E get(int i10) {
            a1.c.V(i10, this.f11672k);
            return this.f11670i.get(this.f11671j + i10);
        }

        @Override // n7.a, java.util.List
        public final List subList(int i10, int i11) {
            a1.c.X(i10, i11, this.f11672k);
            int i12 = this.f11671j;
            return new C0127a(this.f11670i, i10 + i12, i12 + i11);
        }
    }
}
