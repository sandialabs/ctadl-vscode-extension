package kotlin.jvm.internal;

import c8.a;
import c8.h;
import ja.y;
import v7.i;

/* loaded from: classes.dex */
public abstract class PropertyReference0 extends PropertyReference implements h {
    public PropertyReference0(Object obj) {
        super(obj, y.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final a c() {
        return i.f18169a.e(this);
    }

    @Override // u7.a
    public final Object k0() {
        return get();
    }
}
