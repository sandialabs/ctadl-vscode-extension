package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import b9.x;
import b9.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import l8.f;
import l8.i0;
import v7.g;
import x8.c;
import x9.d;
import y8.b;

/* loaded from: classes.dex */
public final class LazyJavaTypeParameterResolver implements a {

    /* renamed from: a  reason: collision with root package name */
    public final c f13697a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13698b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f13699d;

    /* renamed from: e  reason: collision with root package name */
    public final d<x, b> f13700e;

    public LazyJavaTypeParameterResolver(c cVar, f fVar, y yVar, int i10) {
        g.f(cVar, "c");
        g.f(fVar, "containingDeclaration");
        g.f(yVar, "typeParameterOwner");
        this.f13697a = cVar;
        this.f13698b = fVar;
        this.c = i10;
        ArrayList<Object> typeParameters = yVar.getTypeParameters();
        g.f(typeParameters, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i11 = 0;
        for (Object obj : typeParameters) {
            linkedHashMap.put(obj, Integer.valueOf(i11));
            i11++;
        }
        this.f13699d = linkedHashMap;
        this.f13700e = this.f13697a.f18762a.f18739a.h(new LazyJavaTypeParameterResolver$resolve$1(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.a
    public final i0 a(x xVar) {
        g.f(xVar, "javaTypeParameter");
        b U = this.f13700e.U(xVar);
        if (U == null) {
            return this.f13697a.f18763b.a(xVar);
        }
        return U;
    }
}
