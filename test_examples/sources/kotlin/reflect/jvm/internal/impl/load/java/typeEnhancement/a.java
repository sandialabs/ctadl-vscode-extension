package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ba.f;
import ba.k;
import c9.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.checker.b;
import u7.l;
import u8.o;
import v7.g;
import y9.n;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public abstract class a<TAnnotation> {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0155a {

        /* renamed from: a  reason: collision with root package name */
        public final f f13898a;

        /* renamed from: b  reason: collision with root package name */
        public final o f13899b;
        public final k c;

        public C0155a(f fVar, o oVar, k kVar) {
            this.f13898a = fVar;
            this.f13899b = oVar;
            this.c = kVar;
        }
    }

    public static void a(Object obj, ArrayList arrayList, l lVar) {
        arrayList.add(obj);
        Iterable<? extends C0155a> U = ((AbstractSignatureParts$toIndexed$1$1) lVar).U(obj);
        if (U != null) {
            for (C0155a c0155a : U) {
                a(c0155a, arrayList, lVar);
            }
        }
    }

    public static NullabilityQualifier c(f fVar) {
        v i10;
        v i11;
        g.f(fVar, "<this>");
        n g10 = b.a.g(fVar);
        if (g10 == null || (i10 = b.a.W(g10)) == null) {
            i10 = b.a.i(fVar);
            g.c(i10);
        }
        if (b.a.N(i10)) {
            return NullabilityQualifier.NULLABLE;
        }
        n g11 = b.a.g(fVar);
        if (g11 == null || (i11 = b.a.h0(g11)) == null) {
            i11 = b.a.i(fVar);
            g.c(i11);
        }
        if (!b.a.N(i11)) {
            return NullabilityQualifier.NOT_NULL;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final e b(k kVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? arrayList;
        boolean z15;
        NullabilityQualifier nullabilityQualifier;
        if (!(kVar instanceof y8.b)) {
            return null;
        }
        List<f> z16 = b.a.z(kVar);
        boolean z17 = true;
        if (!z16.isEmpty()) {
            for (f fVar : z16) {
                if (!b.a.J(fVar)) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return null;
        }
        if (!z16.isEmpty()) {
            for (f fVar2 : z16) {
                if (c(fVar2) != null) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    z12 = true;
                    break;
                }
            }
        }
        z12 = false;
        if (z12) {
            arrayList = z16;
        } else {
            if (!z16.isEmpty()) {
                for (f fVar3 : z16) {
                    g.f(fVar3, "<this>");
                    if (a1.b.W((r) fVar3) != null) {
                        z13 = true;
                        continue;
                    } else {
                        z13 = false;
                        continue;
                    }
                    if (z13) {
                        z14 = true;
                        break;
                    }
                }
            }
            z14 = false;
            if (!z14) {
                return null;
            }
            arrayList = new ArrayList();
            for (f fVar4 : z16) {
                g.f(fVar4, "<this>");
                r W = a1.b.W((r) fVar4);
                if (W != null) {
                    arrayList.add(W);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            for (f fVar5 : arrayList) {
                if (!b.a.P(fVar5)) {
                    z15 = false;
                    break;
                }
            }
        }
        z15 = true;
        if (z15) {
            nullabilityQualifier = NullabilityQualifier.NULLABLE;
        } else {
            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        }
        if (arrayList == z16) {
            z17 = false;
        }
        return new e(nullabilityQualifier, z17);
    }

    public final ArrayList d(f fVar) {
        x8.c cVar = ((c9.g) this).c;
        u8.b bVar = cVar.f18762a.f18753q;
        g.f(fVar, "<this>");
        C0155a c0155a = new C0155a(fVar, bVar.b((o) cVar.f18764d.getValue(), ((r) fVar).getAnnotations()), null);
        AbstractSignatureParts$toIndexed$1$1 abstractSignatureParts$toIndexed$1$1 = new AbstractSignatureParts$toIndexed$1$1(this);
        ArrayList arrayList = new ArrayList(1);
        a(c0155a, arrayList, abstractSignatureParts$toIndexed$1$1);
        return arrayList;
    }
}
