package kotlin.jvm.internal;

import c8.a;
import c8.i;

/* loaded from: classes.dex */
public abstract class PropertyReference1 extends PropertyReference implements i {
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // u7.l
    public final Object U(Object obj) {
        return ((PropertyReference1Impl) this).s().a(obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final a c() {
        return v7.i.c(this);
    }

    @Override // c8.i
    public final i.a s() {
        return ((i) f()).s();
    }
}
