package androidx.datastore.preferences.protobuf;

import android.graphics.Path;
import android.graphics.Typeface;
import android.view.View;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ua.i1;

/* loaded from: classes.dex */
public abstract class k implements ta.c, ta.a, ta.d, ta.b {
    @Override // ta.a
    public Object A(sa.e eVar, int i10, qa.a aVar, Object obj) {
        v7.g.f(eVar, "descriptor");
        v7.g.f(aVar, "deserializer");
        return J(aVar);
    }

    public abstract float A0(Object obj);

    @Override // ta.d
    public abstract void B(byte b5);

    public abstract void B0(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2);

    @Override // ta.a
    public void C() {
    }

    public abstract View C0(int i10);

    @Override // ta.d
    public abstract void D(boolean z10);

    public abstract void D0(int i10);

    @Override // ta.a
    public String E(sa.e eVar, int i10) {
        v7.g.f(eVar, "descriptor");
        return c0();
    }

    public abstract void E0(Typeface typeface, boolean z10);

    @Override // ta.a
    public short F(i1 i1Var, int i10) {
        v7.g.f(i1Var, "descriptor");
        return b0();
    }

    public abstract boolean F0();

    @Override // ta.b
    public void G(i1 i1Var, int i10, double d5) {
        v7.g.f(i1Var, "descriptor");
        u0(i1Var, i10);
        v(d5);
    }

    public abstract y9.m0 G0(ba.f fVar);

    public abstract y9.r H0(ba.f fVar);

    @Override // ta.d
    public abstract void I(int i10);

    public void I0(CallableMemberDescriptor callableMemberDescriptor, Collection collection) {
        v7.g.f(callableMemberDescriptor, "member");
        callableMemberDescriptor.s0(collection);
    }

    @Override // ta.c
    public Object J(qa.a aVar) {
        v7.g.f(aVar, "deserializer");
        return aVar.e(this);
    }

    public abstract void J0(float f10, Object obj);

    @Override // ta.a
    public byte K(i1 i1Var, int i10) {
        v7.g.f(i1Var, "descriptor");
        return T();
    }

    public abstract void K0(byte[] bArr, int i10, int i11);

    @Override // ta.d
    public abstract void M(float f10);

    @Override // ta.c
    public abstract int O();

    @Override // ta.a
    public char Q(i1 i1Var, int i10) {
        v7.g.f(i1Var, "descriptor");
        return q();
    }

    @Override // ta.a
    public float R(i1 i1Var, int i10) {
        v7.g.f(i1Var, "descriptor");
        return d0();
    }

    @Override // ta.d
    public abstract void S(long j2);

    @Override // ta.c
    public abstract byte T();

    @Override // ta.d
    public abstract void U(char c);

    @Override // ta.c
    public int V(sa.e eVar) {
        v7.g.f(eVar, "enumDescriptor");
        s0();
        throw null;
    }

    @Override // ta.c
    public void W() {
    }

    @Override // ta.a
    public Object Y(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i10, qa.b bVar, Object obj) {
        v7.g.f(pluginGeneratedSerialDescriptor, "descriptor");
        if (!bVar.a().f() && !o()) {
            W();
            return null;
        }
        return J(bVar);
    }

    @Override // ta.d
    public void Z() {
    }

    @Override // ta.a, ta.b
    public void a(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
    }

    @Override // ta.d
    public abstract void a0(qa.e eVar, Object obj);

    @Override // ta.c, ta.d
    public ta.a b(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        return this;
    }

    @Override // ta.c
    public abstract short b0();

    @Override // ta.c
    public String c0() {
        s0();
        throw null;
    }

    @Override // ta.c
    public float d0() {
        s0();
        throw null;
    }

    @Override // ta.a
    public boolean e0(sa.e eVar, int i10) {
        v7.g.f(eVar, "descriptor");
        return l();
    }

    @Override // ta.c
    public abstract long f();

    @Override // ta.b
    public ta.d f0(i1 i1Var, int i10) {
        v7.g.f(i1Var, "descriptor");
        u0(i1Var, i10);
        return k(i1Var.j(i10));
    }

    @Override // ta.a
    public double g(i1 i1Var, int i10) {
        v7.g.f(i1Var, "descriptor");
        return m0();
    }

    @Override // ta.b
    public void g0(sa.e eVar, int i10, qa.e eVar2, Object obj) {
        v7.g.f(eVar, "descriptor");
        v7.g.f(eVar2, "serializer");
        u0(eVar, i10);
        a0(eVar2, obj);
    }

    @Override // ta.b
    public void h(sa.e eVar, int i10, long j2) {
        v7.g.f(eVar, "descriptor");
        u0(eVar, i10);
        S(j2);
    }

    @Override // ta.b
    public void h0(sa.e eVar, int i10, boolean z10) {
        v7.g.f(eVar, "descriptor");
        u0(eVar, i10);
        D(z10);
    }

    @Override // ta.d
    public ta.b j0(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        return b(eVar);
    }

    @Override // ta.d
    public abstract ta.d k(sa.e eVar);

    @Override // ta.b
    public void k0(i1 i1Var, int i10, short s10) {
        v7.g.f(i1Var, "descriptor");
        u0(i1Var, i10);
        w(s10);
    }

    @Override // ta.c
    public boolean l() {
        s0();
        throw null;
    }

    @Override // ta.d
    public abstract void l0(String str);

    @Override // ta.c
    public ta.c m(sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        return this;
    }

    @Override // ta.c
    public double m0() {
        s0();
        throw null;
    }

    @Override // ta.c
    public boolean o() {
        return true;
    }

    @Override // ta.b
    public void o0(sa.e eVar, int i10, String str) {
        v7.g.f(eVar, "descriptor");
        v7.g.f(str, "value");
        u0(eVar, i10);
        l0(str);
    }

    @Override // ta.b
    public void p(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, int i10, qa.b bVar, Comparable comparable) {
        u0(pluginGeneratedSerialDescriptor, i10);
        if (!bVar.a().f() && comparable == null) {
            j();
            return;
        }
        a0(bVar, comparable);
    }

    @Override // ta.a
    public ta.c p0(i1 i1Var, int i10) {
        v7.g.f(i1Var, "descriptor");
        return m(i1Var.j(i10));
    }

    @Override // ta.c
    public char q() {
        s0();
        throw null;
    }

    public abstract void q0(CallableMemberDescriptor callableMemberDescriptor);

    @Override // ta.b
    public void r(int i10, int i11, sa.e eVar) {
        v7.g.f(eVar, "descriptor");
        u0(eVar, i10);
        I(i11);
    }

    public abstract boolean r0(k1.c cVar);

    @Override // ta.b
    public void s(i1 i1Var, int i10, float f10) {
        v7.g.f(i1Var, "descriptor");
        u0(i1Var, i10);
        M(f10);
    }

    public void s0() {
        throw new SerializationException(v7.i.a(getClass()) + " can't retrieve untyped values");
    }

    public abstract void t0(wa.q qVar);

    @Override // ta.a
    public int u(sa.e eVar, int i10) {
        v7.g.f(eVar, "descriptor");
        return O();
    }

    public abstract void u0(sa.e eVar, int i10);

    @Override // ta.d
    public abstract void v(double d5);

    public abstract Object v0(k1.h hVar);

    @Override // ta.d
    public abstract void w(short s10);

    public abstract qa.b w0(c8.b bVar, List list);

    @Override // ta.b
    public void x(i1 i1Var, int i10, char c) {
        v7.g.f(i1Var, "descriptor");
        u0(i1Var, i10);
        U(c);
    }

    public abstract Path x0(float f10, float f11, float f12, float f13);

    @Override // ta.a
    public long y(sa.e eVar, int i10) {
        v7.g.f(eVar, "descriptor");
        return f();
    }

    public abstract qa.a y0(String str, c8.b bVar);

    @Override // ta.b
    public void z(i1 i1Var, int i10, byte b5) {
        v7.g.f(i1Var, "descriptor");
        u0(i1Var, i10);
        B(b5);
    }

    public abstract qa.e z0(c8.b bVar, Object obj);
}
