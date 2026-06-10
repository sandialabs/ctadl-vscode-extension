package k1;

import androidx.datastore.preferences.protobuf.k;

/* loaded from: classes.dex */
public final class b extends k {

    /* renamed from: i  reason: collision with root package name */
    public static final b f12867i = new b();

    @Override // androidx.datastore.preferences.protobuf.k
    public final boolean r0(c<?> cVar) {
        v7.g.f(cVar, "key");
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.k
    public final Object v0(h hVar) {
        v7.g.f(hVar, "key");
        throw new IllegalStateException("".toString());
    }
}
