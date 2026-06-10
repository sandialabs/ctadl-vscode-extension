package k1;

import androidx.datastore.preferences.protobuf.k;

/* loaded from: classes.dex */
public final class a extends k {

    /* renamed from: i  reason: collision with root package name */
    public f<?> f12866i;

    public a(f<?> fVar) {
        v7.g.f(fVar, "element");
        this.f12866i = fVar;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean r0(c<?> cVar) {
        v7.g.f(cVar, "key");
        return cVar == this.f12866i.getKey();
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final Object v0(h hVar) {
        v7.g.f(hVar, "key");
        if (hVar == this.f12866i.getKey()) {
            return this.f12866i.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
