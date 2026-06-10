package va;

import kotlin.text.Regex;
import sa.d;
import ua.c2;
import ua.j0;
import ua.k1;

/* loaded from: classes.dex */
public final class l implements qa.b<k> {

    /* renamed from: a  reason: collision with root package name */
    public static final l f18225a = new l();

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f18226b = kotlinx.serialization.descriptors.a.a("kotlinx.serialization.json.JsonLiteral", d.i.f17526a);

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18226b;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    @Override // qa.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ta.d dVar, Object obj) {
        Double d5;
        Regex regex;
        long j2;
        k kVar = (k) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(kVar, "value");
        ma.i.j(dVar);
        boolean z10 = kVar.f18222i;
        String str = kVar.f18224k;
        if (!z10) {
            sa.e eVar = kVar.f18223j;
            if (eVar != null) {
                dVar = dVar.k(eVar);
            } else {
                j0 j0Var = g.f18220a;
                Long Q0 = ha.h.Q0(str);
                if (Q0 != null) {
                    j2 = Q0.longValue();
                } else {
                    m7.j D1 = m0.b.D1(str);
                    if (D1 != null) {
                        dVar = dVar.k(c2.f17958b);
                        j2 = D1.f16002i;
                    } else {
                        v7.g.f(str, "<this>");
                        try {
                            regex = ha.e.f11614a;
                            regex.getClass();
                        } catch (NumberFormatException unused) {
                        }
                        if (regex.f15129i.matcher(str).matches()) {
                            d5 = Double.valueOf(Double.parseDouble(str));
                            if (d5 == null) {
                                dVar.v(d5.doubleValue());
                                return;
                            }
                            Boolean a10 = g.a(kVar);
                            if (a10 != null) {
                                dVar.D(a10.booleanValue());
                                return;
                            }
                        }
                        d5 = null;
                        if (d5 == null) {
                        }
                    }
                }
                dVar.S(j2);
                return;
            }
        }
        dVar.l0(str);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        kotlinx.serialization.json.b N = ma.i.o(cVar).N();
        if (N instanceof k) {
            return (k) N;
        }
        throw a1.c.q(-1, "Unexpected JSON element, expected JsonLiteral, had " + v7.i.a(N.getClass()), N.toString());
    }
}
