package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import l8.c0;
import l8.f0;
import l8.i0;
import l8.j;
import y9.r;

/* loaded from: classes.dex */
public interface a extends l8.g, j, f0<a> {

    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0150a<V> {
    }

    c0 E();

    <V> V L(InterfaceC0150a<V> interfaceC0150a);

    c0 R();

    boolean Z();

    @Override // l8.f
    a a();

    List<c0> b0();

    Collection<? extends a> f();

    List<i0> getTypeParameters();

    r k();

    List<h> m();
}
