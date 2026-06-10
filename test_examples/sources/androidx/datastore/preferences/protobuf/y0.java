package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.q;
import java.util.Map;

/* loaded from: classes.dex */
public final class y0 extends z0<Object, Object> {
    public y0(int i10) {
        super(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public final void g() {
        if (!this.f4961l) {
            for (int i10 = 0; i10 < d(); i10++) {
                ((q.a) c(i10).getKey()).d();
            }
            for (Map.Entry<Object, Object> entry : e()) {
                ((q.a) entry.getKey()).d();
            }
        }
        super.g();
    }

    @Override // androidx.datastore.preferences.protobuf.z0, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((q.a) obj, obj2);
    }
}
