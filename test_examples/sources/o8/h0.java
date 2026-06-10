package o8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import r9.b;

/* loaded from: classes.dex */
public final class h0 extends r9.f {

    /* renamed from: b  reason: collision with root package name */
    public final l8.s f16427b;
    public final h9.c c;

    public h0(kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar, h9.c cVar2) {
        v7.g.f(cVar, "moduleDescriptor");
        v7.g.f(cVar2, "fqName");
        this.f16427b = cVar;
        this.c = cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (r3.isEmpty() != false) goto L21;
     */
    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<l8.f> f(r9.c cVar, u7.l<? super h9.e, Boolean> lVar) {
        l8.x t02;
        v7.g.f(cVar, "kindFilter");
        v7.g.f(lVar, "nameFilter");
        if (!cVar.a(r9.c.f17177h)) {
            return EmptyList.f12981i;
        }
        h9.c cVar2 = this.c;
        if (cVar2.d()) {
            if (cVar.f17188a.contains(b.C0218b.f17172a)) {
                return EmptyList.f12981i;
            }
        }
        l8.s sVar = this.f16427b;
        Collection<h9.c> q10 = sVar.q(cVar2, lVar);
        ArrayList arrayList = new ArrayList(q10.size());
        for (h9.c cVar3 : q10) {
            h9.e f10 = cVar3.f();
            v7.g.e(f10, "subFqName.shortName()");
            if (lVar.U(f10).booleanValue()) {
                if (!f10.f11573j) {
                    t02 = sVar.t0(cVar2.c(f10));
                }
                t02 = null;
                m0.b.u(arrayList, t02);
            }
        }
        return arrayList;
    }

    @Override // r9.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Set<h9.e> g() {
        return EmptySet.f12983i;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.f16427b;
    }
}
