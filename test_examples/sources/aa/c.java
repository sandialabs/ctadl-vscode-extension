package aa;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import l8.s;
import l8.x;
import m8.e;
import u7.l;

/* loaded from: classes.dex */
public final class c implements s {

    /* renamed from: i  reason: collision with root package name */
    public static final c f391i = new c();

    /* renamed from: j  reason: collision with root package name */
    public static final h9.e f392j = h9.e.m("<Error module>");

    /* renamed from: k  reason: collision with root package name */
    public static final EmptyList f393k = EmptyList.f12981i;

    /* renamed from: l  reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.builtins.b f394l;

    static {
        EmptySet emptySet = EmptySet.f12983i;
        f394l = kotlin.reflect.jvm.internal.impl.builtins.b.f13322f;
    }

    @Override // l8.f
    public final l8.f a() {
        return this;
    }

    @Override // l8.f
    public final l8.f c() {
        return null;
    }

    @Override // l8.s
    public final List<s> g0() {
        return f393k;
    }

    @Override // m8.a
    public final m8.e getAnnotations() {
        return e.a.f16014a;
    }

    @Override // l8.f
    public final h9.e getName() {
        return f392j;
    }

    @Override // l8.s
    public final boolean h0(s sVar) {
        v7.g.f(sVar, "targetModule");
        return false;
    }

    @Override // l8.s
    public final <T> T k0(j0.c cVar) {
        v7.g.f(cVar, "capability");
        return null;
    }

    @Override // l8.f
    public final <R, D> R n0(l8.h<R, D> hVar, D d5) {
        return null;
    }

    @Override // l8.s
    public final Collection<h9.c> q(h9.c cVar, l<? super h9.e, Boolean> lVar) {
        v7.g.f(cVar, "fqName");
        v7.g.f(lVar, "nameFilter");
        return EmptyList.f12981i;
    }

    @Override // l8.s
    public final x t0(h9.c cVar) {
        v7.g.f(cVar, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // l8.s
    public final kotlin.reflect.jvm.internal.impl.builtins.e u() {
        return f394l;
    }
}
