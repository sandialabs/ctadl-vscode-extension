package kotlin.reflect.jvm.internal.impl.resolve.constants;

import a1.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.e;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import l8.s;
import n7.f;
import u7.a;
import v7.g;
import y9.h0;
import y9.j0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class IntegerLiteralTypeConstructor$supertypes$2 extends Lambda implements a<List<v>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ IntegerLiteralTypeConstructor f14709j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegerLiteralTypeConstructor$supertypes$2(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        super(0);
        this.f14709j = integerLiteralTypeConstructor;
    }

    @Override // u7.a
    public final List<v> k0() {
        boolean z10 = true;
        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = this.f14709j;
        v r3 = integerLiteralTypeConstructor.u().k("Comparable").r();
        g.e(r3, "builtIns.comparable.defaultType");
        ArrayList arrayList = new ArrayList(new f(new v[]{j0.d(r3, c.N0(new h0(integerLiteralTypeConstructor.f14707d, Variance.IN_VARIANCE)), null, 2)}, true));
        s sVar = integerLiteralTypeConstructor.f14706b;
        g.f(sVar, "<this>");
        v[] vVarArr = new v[4];
        e u10 = sVar.u();
        u10.getClass();
        v t10 = u10.t(PrimitiveType.f13300r);
        if (t10 != null) {
            vVarArr[0] = t10;
            e u11 = sVar.u();
            u11.getClass();
            v t11 = u11.t(PrimitiveType.f13302t);
            if (t11 != null) {
                vVarArr[1] = t11;
                e u12 = sVar.u();
                u12.getClass();
                v t12 = u12.t(PrimitiveType.f13298p);
                if (t12 != null) {
                    vVarArr[2] = t12;
                    e u13 = sVar.u();
                    u13.getClass();
                    v t13 = u13.t(PrimitiveType.f13299q);
                    if (t13 != null) {
                        vVarArr[3] = t13;
                        List O0 = c.O0(vVarArr);
                        if (!(O0 instanceof Collection) || !O0.isEmpty()) {
                            Iterator it = O0.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (!(!integerLiteralTypeConstructor.c.contains((r) it.next()))) {
                                    z10 = false;
                                    break;
                                }
                            }
                        }
                        if (!z10) {
                            v r10 = integerLiteralTypeConstructor.u().k("Number").r();
                            if (r10 != null) {
                                arrayList.add(r10);
                            } else {
                                e.a(55);
                                throw null;
                            }
                        }
                        return arrayList;
                    }
                    e.a(57);
                    throw null;
                }
                e.a(56);
                throw null;
            }
            e.a(59);
            throw null;
        }
        e.a(58);
        throw null;
    }
}
