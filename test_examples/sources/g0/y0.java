package g0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y0 implements Iterable<Object>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final x0 f11113i;

    /* renamed from: j  reason: collision with root package name */
    public final int f11114j;

    /* renamed from: k  reason: collision with root package name */
    public final int f11115k;

    public y0(int i10, int i11, x0 x0Var) {
        v7.g.f(x0Var, "table");
        this.f11113i = x0Var;
        this.f11114j = i10;
        this.f11115k = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        x0 x0Var = this.f11113i;
        if (x0Var.f11108o == this.f11115k) {
            int i10 = this.f11114j;
            return new u(i10 + 1, a1.c.A(x0Var.f11103i, i10) + i10, x0Var);
        }
        throw new ConcurrentModificationException();
    }
}
