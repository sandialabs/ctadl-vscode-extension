package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.g0;
import androidx.navigation.n;
import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class p extends n implements Iterable<n> {

    /* renamed from: q  reason: collision with root package name */
    public final p.i<n> f5521q;

    /* renamed from: r  reason: collision with root package name */
    public int f5522r;

    /* renamed from: s  reason: collision with root package name */
    public String f5523s;

    /* loaded from: classes.dex */
    public class a implements Iterator<n>, j$.util.Iterator {

        /* renamed from: i  reason: collision with root package name */
        public int f5524i = -1;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5525j = false;

        public a() {
        }

        @Override // j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super n> consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f5524i + 1 < p.this.f5521q.h();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.f5525j = true;
                p.i<n> iVar = p.this.f5521q;
                int i10 = this.f5524i + 1;
                this.f5524i = i10;
                return iVar.i(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            if (this.f5525j) {
                p pVar = p.this;
                pVar.f5521q.i(this.f5524i).f5510j = null;
                p.i<n> iVar = pVar.f5521q;
                int i10 = this.f5524i;
                Object[] objArr = iVar.f16584k;
                Object obj = objArr[i10];
                Object obj2 = p.i.f16581m;
                if (obj != obj2) {
                    objArr[i10] = obj2;
                    iVar.f16582i = true;
                }
                this.f5524i = i10 - 1;
                this.f5525j = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
    }

    public p(x<? extends p> xVar) {
        super(xVar);
        this.f5521q = new p.i<>();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<n> iterator() {
        return new a();
    }

    @Override // androidx.navigation.n
    public final n.a s(g0 g0Var) {
        n.a s10 = super.s(g0Var);
        a aVar = new a();
        while (aVar.hasNext()) {
            n.a s11 = ((n) aVar.next()).s(g0Var);
            if (s11 != null && (s10 == null || s11.compareTo(s10) > 0)) {
                s10 = s11;
            }
        }
        return s10;
    }

    @Override // androidx.navigation.n
    public final void t(Context context, AttributeSet attributeSet) {
        super.t(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, ma.i.f16053u);
        w(obtainAttributes.getResourceId(0, 0));
        this.f5523s = n.h(context, this.f5522r);
        obtainAttributes.recycle();
    }

    @Override // androidx.navigation.n
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        n v3 = v(this.f5522r, true);
        if (v3 == null) {
            str = this.f5523s;
            if (str == null) {
                sb.append("0x");
                str = Integer.toHexString(this.f5522r);
            }
        } else {
            sb.append("{");
            sb.append(v3.toString());
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }

    public final void u(n nVar) {
        int i10 = nVar.f5511k;
        if (i10 != 0) {
            if (i10 != this.f5511k) {
                p.i<n> iVar = this.f5521q;
                n nVar2 = (n) iVar.e(i10, null);
                if (nVar2 == nVar) {
                    return;
                }
                if (nVar.f5510j == null) {
                    if (nVar2 != null) {
                        nVar2.f5510j = null;
                    }
                    nVar.f5510j = this;
                    iVar.f(nVar.f5511k, nVar);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            }
            throw new IllegalArgumentException("Destination " + nVar + " cannot have the same id as graph " + this);
        }
        throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
    }

    public final n v(int i10, boolean z10) {
        p pVar;
        n nVar = (n) this.f5521q.e(i10, null);
        if (nVar != null) {
            return nVar;
        }
        if (!z10 || (pVar = this.f5510j) == null) {
            return null;
        }
        return pVar.v(i10, true);
    }

    public final void w(int i10) {
        if (i10 != this.f5511k) {
            this.f5522r = i10;
            this.f5523s = null;
            return;
        }
        throw new IllegalArgumentException("Start destination " + i10 + " cannot use the same id as the graph " + this);
    }
}
