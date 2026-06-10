package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.c0;
import java.util.Map;

/* loaded from: classes.dex */
public final class e0 implements d0 {
    @Override // androidx.datastore.preferences.protobuf.d0
    public final MapFieldLite a(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.f4820i) {
                mapFieldLite = mapFieldLite.c();
            }
            mapFieldLite.b();
            if (!mapFieldLite2.isEmpty()) {
                mapFieldLite.putAll(mapFieldLite2);
            }
        }
        return mapFieldLite;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final int b(Object obj, int i10, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        c0 c0Var = (c0) obj2;
        int i11 = 0;
        if (!mapFieldLite.isEmpty()) {
            for (Map.Entry entry : mapFieldLite.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                c0Var.getClass();
                int d12 = CodedOutputStream.d1(i10);
                int a10 = c0.a(c0Var.f4846a, key, value);
                i11 += CodedOutputStream.f1(a10) + a10 + d12;
            }
        }
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final boolean c(Object obj) {
        return !((MapFieldLite) obj).f4820i;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final Object d(Object obj) {
        ((MapFieldLite) obj).f4820i = false;
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final c0.a<?, ?> e(Object obj) {
        return ((c0) obj).f4846a;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final MapFieldLite f() {
        return MapFieldLite.f4819j.c();
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final MapFieldLite g(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.d0
    public final MapFieldLite h(Object obj) {
        return (MapFieldLite) obj;
    }
}
