package org.koin.core.scope;

import a1.c;
import androidx.activity.e;
import androidx.fragment.app.g0;
import java.util.ArrayList;
import java.util.Iterator;
import kb.b;
import kotlin.Pair;
import n7.g;
import org.koin.core.error.ClosedScopeException;
import org.koin.core.error.NoBeanDefFoundException;
import org.koin.core.logger.Level;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final kb.a f16535a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16536b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final org.koin.core.a f16537d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<a> f16538e;

    /* renamed from: f  reason: collision with root package name */
    public final g<jb.a> f16539f;

    public a(b bVar, org.koin.core.a aVar) {
        v7.g.f(bVar, "scopeQualifier");
        v7.g.f(aVar, "_koin");
        this.f16535a = bVar;
        this.f16536b = "_";
        this.c = true;
        this.f16537d = aVar;
        this.f16538e = new ArrayList<>();
        new ArrayList();
        this.f16539f = new g<>();
    }

    public final Object a(u7.a aVar, c8.b bVar, kb.a aVar2) {
        v7.g.f(bVar, "clazz");
        org.koin.core.a aVar3 = this.f16537d;
        if (aVar3.c.c(Level.DEBUG)) {
            String str = "";
            if (aVar2 != null) {
                String str2 = " with qualifier '" + aVar2 + '\'';
                if (str2 != null) {
                    str = str2;
                }
            }
            aVar3.c.a("+- '" + mb.a.a(bVar) + '\'' + str);
            Pair S0 = c.S0(new Scope$get$1(this, aVar2, bVar, aVar));
            double doubleValue = ((Number) S0.f12963j).doubleValue();
            aVar3.c.a("|- '" + mb.a.a(bVar) + "' in " + doubleValue + " ms");
            return S0.f12962i;
        }
        return b(aVar, bVar, aVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (r12 == null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1 A[EDGE_INSN: B:50:0x00c1->B:35:0x00c1 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(u7.a aVar, c8.b bVar, kb.a aVar2) {
        jb.a aVar3;
        Object b5;
        String str;
        hb.b bVar2;
        StringBuilder sb;
        Object obj;
        if (aVar == null) {
            aVar3 = null;
        } else {
            aVar3 = (jb.a) aVar.k0();
        }
        g<jb.a> gVar = this.f16539f;
        if (aVar3 != null) {
            gVar.addFirst(aVar3);
        }
        org.koin.core.a aVar4 = this.f16537d;
        g0 g0Var = new g0(aVar4, this, aVar3);
        lb.a aVar5 = aVar4.f16503b;
        aVar5.getClass();
        v7.g.f(bVar, "clazz");
        kb.a aVar6 = this.f16535a;
        v7.g.f(aVar6, "scopeQualifier");
        gb.b bVar3 = (gb.b) aVar5.f15886b.get(c.K0(bVar, aVar2, aVar6));
        if (bVar3 == null) {
            b5 = null;
        } else {
            b5 = bVar3.b(g0Var);
        }
        if (b5 == null) {
            aVar4.c.e(new Scope$resolveValue$1$1(bVar, aVar2));
            if (gVar.isEmpty()) {
                obj = null;
            } else {
                obj = gVar.f16122j[gVar.f16121i];
            }
            jb.a aVar7 = (jb.a) obj;
            if (aVar7 == null) {
                b5 = null;
            } else {
                b5 = aVar7.b(bVar);
            }
            if (b5 == null) {
                aVar4.c.e(new Scope$resolveValue$2$1(bVar, aVar2));
                b5 = null;
            }
        }
        if (b5 == null) {
            aVar4.c.e(new Scope$resolveValue$3$1(bVar, aVar2));
            Iterator<a> it = this.f16538e.iterator();
            Object obj2 = null;
            while (it.hasNext()) {
                a next = it.next();
                org.koin.core.a aVar8 = next.f16537d;
                try {
                    obj2 = next.a(aVar, bVar, aVar2);
                    continue;
                } catch (ClosedScopeException unused) {
                    bVar2 = aVar8.c;
                    sb = new StringBuilder("Scope closed - no instance found for ");
                    sb.append(mb.a.a(bVar));
                    sb.append(" on scope ");
                    sb.append(next);
                    bVar2.a(sb.toString());
                    obj2 = null;
                    continue;
                    if (obj2 != null) {
                    }
                } catch (NoBeanDefFoundException unused2) {
                    bVar2 = aVar8.c;
                    sb = new StringBuilder("No instance found for ");
                    sb.append(mb.a.a(bVar));
                    sb.append(" on scope ");
                    sb.append(next);
                    bVar2.a(sb.toString());
                    obj2 = null;
                    continue;
                    if (obj2 != null) {
                    }
                }
                if (obj2 != null) {
                    break;
                }
            }
            b5 = obj2;
            if (b5 == null) {
                aVar4.c.e(new Scope$resolveValue$4$1(bVar, aVar2));
                gVar.clear();
                if (aVar2 != null) {
                    str = " & qualifier:'" + aVar2 + '\'';
                }
                str = "";
                throw new NoBeanDefFoundException("No definition found for class:'" + mb.a.a(bVar) + '\'' + str + ". Check your definitions!");
            }
        }
        if (aVar3 != null) {
            gVar.removeFirst();
        }
        return b5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return v7.g.a(this.f16535a, aVar.f16535a) && v7.g.a(this.f16536b, aVar.f16536b) && this.c == aVar.c && v7.g.a(this.f16537d, aVar.f16537d);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int g10 = a4.b.g(this.f16536b, this.f16535a.hashCode() * 31, 31);
        boolean z10 = this.c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return this.f16537d.hashCode() + ((g10 + i10) * 31);
    }

    public final String toString() {
        return e.k(new StringBuilder("['"), this.f16536b, "']");
    }
}
