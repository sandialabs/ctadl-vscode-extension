package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.d;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.b;
import n7.l;
import v7.g;
import y9.f0;
import y9.m0;
import y9.n;
import y9.r;
import y9.u;
import y9.v;

/* loaded from: classes.dex */
public final class RawTypeImpl extends n implements u {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RawTypeImpl(v vVar, v vVar2) {
        this(vVar, vVar2, false);
        g.f(vVar, "lowerBound");
        g.f(vVar2, "upperBound");
    }

    public RawTypeImpl(v vVar, v vVar2, boolean z10) {
        super(vVar, vVar2);
        if (z10) {
            return;
        }
        d.f14997a.d(vVar, vVar2);
    }

    public static final ArrayList e1(DescriptorRenderer descriptorRenderer, v vVar) {
        List<f0> S0 = vVar.S0();
        ArrayList arrayList = new ArrayList(l.Z1(S0, 10));
        for (f0 f0Var : S0) {
            arrayList.add(descriptorRenderer.v(f0Var));
        }
        return arrayList;
    }

    public static final String f1(String str, String str2) {
        if (!b.Z0(str, '<')) {
            return str;
        }
        return b.u1(str, '<') + '<' + str2 + '>' + b.t1(str, '>', str);
    }

    @Override // y9.m0
    public final m0 Y0(boolean z10) {
        return new RawTypeImpl(this.f18958j.Y0(z10), this.f18959k.Y0(z10));
    }

    @Override // y9.m0
    public final m0 a1(kotlin.reflect.jvm.internal.impl.types.l lVar) {
        g.f(lVar, "newAttributes");
        return new RawTypeImpl(this.f18958j.a1(lVar), this.f18959k.a1(lVar));
    }

    @Override // y9.n
    public final v b1() {
        return this.f18958j;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f A[SYNTHETIC] */
    @Override // y9.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c1(DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.b bVar) {
        boolean z10;
        g.f(descriptorRenderer, "renderer");
        g.f(bVar, "options");
        v vVar = this.f18958j;
        String u10 = descriptorRenderer.u(vVar);
        v vVar2 = this.f18959k;
        String u11 = descriptorRenderer.u(vVar2);
        if (bVar.j()) {
            return "raw (" + u10 + ".." + u11 + ')';
        } else if (vVar2.S0().isEmpty()) {
            return descriptorRenderer.r(u10, u11, TypeUtilsKt.g(this));
        } else {
            ArrayList e12 = e1(descriptorRenderer, vVar);
            ArrayList e13 = e1(descriptorRenderer, vVar2);
            String t22 = c.t2(e12, ", ", null, null, RawTypeImpl$render$newArgs$1.f13838j, 30);
            ArrayList S2 = c.S2(e12, e13);
            boolean z11 = true;
            if (!S2.isEmpty()) {
                Iterator it = S2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) it.next();
                    String str = (String) pair.f12963j;
                    if (!g.a((String) pair.f12962i, b.k1("out ", str)) && !g.a(str, "*")) {
                        z10 = false;
                        continue;
                        if (!z10) {
                            z11 = false;
                            break;
                        }
                    }
                    z10 = true;
                    if (!z10) {
                    }
                }
            }
            if (z11) {
                u11 = f1(u11, t22);
            }
            String f12 = f1(u10, t22);
            if (g.a(f12, u11)) {
                return f12;
            }
            return descriptorRenderer.r(f12, u11, TypeUtilsKt.g(this));
        }
    }

    @Override // y9.m0
    /* renamed from: d1 */
    public final n Z0(e eVar) {
        g.f(eVar, "kotlinTypeRefiner");
        r P0 = eVar.P0(this.f18958j);
        g.d(P0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r P02 = eVar.P0(this.f18959k);
        g.d(P02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new RawTypeImpl((v) P0, (v) P02, true);
    }

    @Override // y9.n, y9.r
    public final MemberScope w() {
        l8.d c = U0().c();
        l8.b bVar = c instanceof l8.b ? (l8.b) c : null;
        if (bVar != null) {
            MemberScope y10 = bVar.y(new RawSubstitution());
            g.e(y10, "classDescriptor.getMemberScope(RawSubstitution())");
            return y10;
        }
        throw new IllegalStateException(("Incorrect classifier: " + U0().c()).toString());
    }
}
