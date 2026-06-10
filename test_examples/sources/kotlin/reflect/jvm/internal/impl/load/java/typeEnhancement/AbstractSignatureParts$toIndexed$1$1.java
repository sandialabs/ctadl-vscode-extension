package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ba.f;
import ba.i;
import ba.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import u7.l;
import u8.o;
import v7.g;
import y9.e0;
import y9.m0;
import y9.n;
import y9.u;
import y9.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AbstractSignatureParts$toIndexed$1$1 extends Lambda implements l<a.C0155a, Iterable<? extends a.C0155a>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a<Object> f13845j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$toIndexed$1$1(a aVar) {
        super(1);
        this.f13845j = aVar;
    }

    @Override // u7.l
    public final Iterable<? extends a.C0155a> U(a.C0155a c0155a) {
        a.C0155a c0155a2;
        n g10;
        u uVar;
        n g11;
        a.C0155a c0155a3 = c0155a;
        g.f(c0155a3, "it");
        a<Object> aVar = this.f13845j;
        boolean z10 = ((c9.g) aVar).f6578e;
        f fVar = c0155a3.f13898a;
        if (z10) {
            if (fVar != null && (g11 = b.a.g(fVar)) != null) {
                uVar = b.a.h(g11);
            } else {
                uVar = null;
            }
            if (uVar != null) {
                return null;
            }
        }
        if (fVar == null) {
            return null;
        }
        v i10 = b.a.i(fVar);
        if (i10 == null && ((g10 = b.a.g(fVar)) == null || (i10 = b.a.W(g10)) == null)) {
            i10 = b.a.i(fVar);
            g.c(i10);
        }
        e0 g02 = b.a.g0(i10);
        if (g02 == null) {
            return null;
        }
        List r3 = b.a.r(g02);
        List o10 = b.a.o(fVar);
        Iterator it = r3.iterator();
        Iterator it2 = o10.iterator();
        ArrayList arrayList = new ArrayList(Math.min(n7.l.Z1(r3, 10), n7.l.Z1(o10, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            i iVar = (i) it2.next();
            k kVar = (k) next;
            boolean S = b.a.S(iVar);
            o oVar = c0155a3.f13899b;
            if (S) {
                c0155a2 = new a.C0155a(null, oVar, kVar);
            } else {
                m0 v3 = b.a.v(iVar);
                aVar.getClass();
                u8.b bVar = ((c9.g) aVar).c.f18762a.f18753q;
                g.f(v3, "<this>");
                c0155a2 = new a.C0155a(v3, bVar.b(oVar, v3.getAnnotations()), kVar);
            }
            arrayList.add(c0155a2);
        }
        return arrayList;
    }
}
