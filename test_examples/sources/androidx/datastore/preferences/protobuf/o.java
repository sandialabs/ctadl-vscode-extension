package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.m;
import java.util.Map;

/* loaded from: classes.dex */
public final class o extends n<GeneratedMessageLite.d> {
    @Override // androidx.datastore.preferences.protobuf.n
    public final void a(Map.Entry entry) {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final GeneratedMessageLite.e b(m mVar, i0 i0Var, int i10) {
        mVar.getClass();
        return mVar.f4919a.get(new m.a(i10, i0Var));
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final q<GeneratedMessageLite.d> c(Object obj) {
        return ((GeneratedMessageLite.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final q<GeneratedMessageLite.d> d(Object obj) {
        GeneratedMessageLite.c cVar = (GeneratedMessageLite.c) obj;
        q<GeneratedMessageLite.d> qVar = cVar.extensions;
        if (qVar.f4931b) {
            cVar.extensions = qVar.clone();
        }
        return cVar.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final boolean e(i0 i0Var) {
        return i0Var instanceof GeneratedMessageLite.c;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final void f(Object obj) {
        q<GeneratedMessageLite.d> qVar = ((GeneratedMessageLite.c) obj).extensions;
        if (!qVar.f4931b) {
            qVar.f4930a.g();
            qVar.f4931b = true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final Object g(Object obj) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final void h(Object obj) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final void i(Object obj) {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.n
    public final void j(Map.Entry entry) {
        ((GeneratedMessageLite.d) entry.getKey()).getClass();
        throw null;
    }
}
