package sa;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements Iterable<String>, w7.a {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ e f17529i;

    public g(e eVar) {
        this.f17529i = eVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new f(this.f17529i);
    }
}
