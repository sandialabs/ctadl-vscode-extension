package g0;

import androidx.compose.runtime.ComposerKt;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class x0 implements Iterable<Object>, w7.a {

    /* renamed from: j  reason: collision with root package name */
    public int f11104j;

    /* renamed from: l  reason: collision with root package name */
    public int f11106l;

    /* renamed from: m  reason: collision with root package name */
    public int f11107m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f11108o;

    /* renamed from: i  reason: collision with root package name */
    public int[] f11103i = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public Object[] f11105k = new Object[0];

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<b> f11109p = new ArrayList<>();

    public final b c() {
        boolean z10;
        if (!this.n) {
            int i10 = this.f11104j;
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                ArrayList<b> arrayList = this.f11109p;
                int o12 = a1.c.o1(arrayList, 0, i10);
                if (o12 < 0) {
                    b bVar = new b(0);
                    arrayList.add(-(o12 + 1), bVar);
                    return bVar;
                }
                b bVar2 = arrayList.get(o12);
                v7.g.e(bVar2, "get(location)");
                return bVar2;
            }
            throw new IllegalArgumentException("Parameter index is out of range".toString());
        }
        ComposerKt.c("use active SlotWriter to create an anchor location instead ".toString());
        throw null;
    }

    public final int d(b bVar) {
        v7.g.f(bVar, "anchor");
        if (!this.n) {
            if (bVar.a()) {
                return bVar.f11033a;
            }
            throw new IllegalArgumentException("Anchor refers to a group that was removed".toString());
        }
        ComposerKt.c("Use active SlotWriter to determine anchor location instead".toString());
        throw null;
    }

    public final boolean g(int i10, b bVar) {
        boolean z10;
        boolean z11;
        if (!this.n) {
            if (i10 >= 0 && i10 < this.f11104j) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (u(bVar)) {
                    int A = a1.c.A(this.f11103i, i10) + i10;
                    int i11 = bVar.f11033a;
                    if (i10 <= i11 && i11 < A) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        return true;
                    }
                }
                return false;
            }
            ComposerKt.c("Invalid group index".toString());
            throw null;
        }
        ComposerKt.c("Writer is active".toString());
        throw null;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new u(0, this.f11104j, this);
    }

    public final w0 s() {
        if (this.n) {
            throw new IllegalStateException("Cannot read while a writer is pending".toString());
        }
        this.f11107m++;
        return new w0(this);
    }

    public final z0 t() {
        if (!(!this.n)) {
            ComposerKt.c("Cannot start a writer when another writer is pending".toString());
            throw null;
        }
        if (!(this.f11107m <= 0)) {
            ComposerKt.c("Cannot start a writer when a reader is pending".toString());
            throw null;
        }
        this.n = true;
        this.f11108o++;
        return new z0(this);
    }

    public final boolean u(b bVar) {
        boolean z10;
        if (!bVar.a()) {
            return false;
        }
        int o12 = a1.c.o1(this.f11109p, bVar.f11033a, this.f11104j);
        if (o12 >= 0 && v7.g.a(this.f11109p.get(o12), bVar)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        return true;
    }
}
