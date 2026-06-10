package kotlin.jvm.internal;

import c8.a;
import c8.g;
import c8.i;
import v7.i;

/* loaded from: classes.dex */
public abstract class MutablePropertyReference1 extends MutablePropertyReference implements g {
    public MutablePropertyReference1(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // u7.l
    public final Object U(Object obj) {
        return ((MutablePropertyReference1Impl) this).s().a(obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final a c() {
        return i.b(this);
    }

    @Override // c8.f
    public final g.a l() {
        return ((g) f()).l();
    }

    @Override // c8.i
    public final i.a s() {
        return ((g) f()).s();
    }
}
