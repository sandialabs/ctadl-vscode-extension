package kotlinx.serialization.internal;

import java.util.ArrayList;
import qa.b;
import sa.e;
import ta.c;
import ua.i1;
import v7.g;

/* loaded from: classes.dex */
public abstract class TaggedDecoder<Tag> implements c, ta.a {

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList<Tag> f15649i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public boolean f15650j;

    @Override // ta.a
    public final <T> T A(e eVar, int i10, qa.a<? extends T> aVar, T t10) {
        g.f(eVar, "descriptor");
        g.f(aVar, "deserializer");
        String w10 = w(eVar, i10);
        TaggedDecoder$decodeSerializableElement$1 taggedDecoder$decodeSerializableElement$1 = new TaggedDecoder$decodeSerializableElement$1(this, aVar, t10);
        this.f15649i.add(w10);
        T t11 = (T) taggedDecoder$decodeSerializableElement$1.k0();
        if (!this.f15650j) {
            x();
        }
        this.f15650j = false;
        return t11;
    }

    @Override // ta.a
    public final void C() {
    }

    @Override // ta.a
    public final String E(e eVar, int i10) {
        g.f(eVar, "descriptor");
        return v(w(eVar, i10));
    }

    @Override // ta.a
    public final short F(i1 i1Var, int i10) {
        g.f(i1Var, "descriptor");
        return s(w(i1Var, i10));
    }

    @Override // ta.c
    public abstract <T> T J(qa.a<? extends T> aVar);

    @Override // ta.a
    public final byte K(i1 i1Var, int i10) {
        g.f(i1Var, "descriptor");
        return e(w(i1Var, i10));
    }

    @Override // ta.c
    public final int O() {
        return p(x());
    }

    @Override // ta.a
    public final char Q(i1 i1Var, int i10) {
        g.f(i1Var, "descriptor");
        return h(w(i1Var, i10));
    }

    @Override // ta.a
    public final float R(i1 i1Var, int i10) {
        g.f(i1Var, "descriptor");
        return k(w(i1Var, i10));
    }

    @Override // ta.c
    public final byte T() {
        return e(x());
    }

    @Override // ta.c
    public final int V(e eVar) {
        g.f(eVar, "enumDescriptor");
        return j(x(), eVar);
    }

    @Override // ta.c
    public final void W() {
    }

    @Override // ta.a
    public final Object Y(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i10, b bVar, Object obj) {
        g.f(pluginGeneratedSerialDescriptor, "descriptor");
        String w10 = w(pluginGeneratedSerialDescriptor, i10);
        TaggedDecoder$decodeNullableSerializableElement$1 taggedDecoder$decodeNullableSerializableElement$1 = new TaggedDecoder$decodeNullableSerializableElement$1(this, bVar, obj);
        this.f15649i.add(w10);
        Object k02 = taggedDecoder$decodeNullableSerializableElement$1.k0();
        if (!this.f15650j) {
            x();
        }
        this.f15650j = false;
        return k02;
    }

    @Override // ta.c
    public final short b0() {
        return s(x());
    }

    @Override // ta.c
    public final String c0() {
        return v(x());
    }

    public abstract boolean d(Tag tag);

    @Override // ta.c
    public final float d0() {
        return k(x());
    }

    public abstract byte e(Tag tag);

    @Override // ta.a
    public final boolean e0(e eVar, int i10) {
        g.f(eVar, "descriptor");
        return d(w(eVar, i10));
    }

    @Override // ta.c
    public final long f() {
        return r(x());
    }

    @Override // ta.a
    public final double g(i1 i1Var, int i10) {
        g.f(i1Var, "descriptor");
        return i(w(i1Var, i10));
    }

    public abstract char h(Tag tag);

    public abstract double i(Tag tag);

    public abstract int j(Tag tag, e eVar);

    public abstract float k(Tag tag);

    @Override // ta.c
    public final boolean l() {
        return d(x());
    }

    @Override // ta.c
    public final c m(e eVar) {
        g.f(eVar, "descriptor");
        return n(x(), eVar);
    }

    @Override // ta.c
    public final double m0() {
        return i(x());
    }

    public abstract c n(Tag tag, e eVar);

    @Override // ta.c
    public abstract boolean o();

    public abstract int p(Tag tag);

    @Override // ta.a
    public final c p0(i1 i1Var, int i10) {
        g.f(i1Var, "descriptor");
        return n(w(i1Var, i10), i1Var.j(i10));
    }

    @Override // ta.c
    public final char q() {
        return h(x());
    }

    public abstract long r(Tag tag);

    public abstract short s(Tag tag);

    @Override // ta.a
    public final int u(e eVar, int i10) {
        g.f(eVar, "descriptor");
        return p(w(eVar, i10));
    }

    public abstract String v(Tag tag);

    public abstract String w(e eVar, int i10);

    public final Tag x() {
        ArrayList<Tag> arrayList = this.f15649i;
        Tag remove = arrayList.remove(a1.c.B0(arrayList));
        this.f15650j = true;
        return remove;
    }

    @Override // ta.a
    public final long y(e eVar, int i10) {
        g.f(eVar, "descriptor");
        return r(w(eVar, i10));
    }
}
