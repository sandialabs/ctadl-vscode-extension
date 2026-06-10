package n7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Iterable<Object>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object[] f16125i;

    public j(Object[] objArr) {
        this.f16125i = objArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return m0.b.K0(this.f16125i);
    }
}
