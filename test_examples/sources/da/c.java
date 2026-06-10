package da;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c<T> extends b<T> {

    /* renamed from: i  reason: collision with root package name */
    public Object[] f10476i = new Object[20];

    /* renamed from: j  reason: collision with root package name */
    public int f10477j = 0;

    /* loaded from: classes.dex */
    public static final class a extends kotlin.collections.a<T> {

        /* renamed from: k  reason: collision with root package name */
        public int f10478k = -1;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ c<T> f10479l;

        public a(c<T> cVar) {
            this.f10479l = cVar;
        }
    }

    @Override // da.b
    public final int c() {
        return this.f10477j;
    }

    @Override // da.b
    public final void d(int i10, T t10) {
        v7.g.f(t10, "value");
        Object[] objArr = this.f10476i;
        if (objArr.length <= i10) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length * 2);
            v7.g.e(copyOf, "copyOf(this, newSize)");
            this.f10476i = copyOf;
        }
        Object[] objArr2 = this.f10476i;
        if (objArr2[i10] == null) {
            this.f10477j++;
        }
        objArr2[i10] = t10;
    }

    @Override // da.b
    public final T get(int i10) {
        Object[] objArr = this.f10476i;
        v7.g.f(objArr, "<this>");
        if (i10 >= 0 && i10 <= objArr.length - 1) {
            return (T) objArr[i10];
        }
        return null;
    }

    @Override // da.b, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
