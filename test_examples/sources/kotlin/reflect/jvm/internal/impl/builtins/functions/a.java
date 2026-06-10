package kotlin.reflect.jvm.internal.impl.builtins.functions;

import h9.e;
import ha.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c;
import l8.s;
import l8.u;
import n8.b;
import v7.g;
import x9.h;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final h f13343a;

    /* renamed from: b  reason: collision with root package name */
    public final s f13344b;

    public a(h hVar, c cVar) {
        g.f(hVar, "storageManager");
        g.f(cVar, "module");
        this.f13343a = hVar;
        this.f13344b = cVar;
    }

    @Override // n8.b
    public final Collection<l8.b> a(h9.c cVar) {
        g.f(cVar, "packageFqName");
        return EmptySet.f12983i;
    }

    @Override // n8.b
    public final l8.b b(h9.b bVar) {
        g.f(bVar, "classId");
        if (!bVar.c && !bVar.k()) {
            String b5 = bVar.i().b();
            if (!kotlin.text.b.Y0(b5, "Function", false)) {
                return null;
            }
            h9.c h10 = bVar.h();
            g.e(h10, "classId.packageFqName");
            FunctionClassKind.f13334k.getClass();
            FunctionClassKind.a.C0148a a10 = FunctionClassKind.a.a(b5, h10);
            if (a10 == null) {
                return null;
            }
            List<u> d02 = this.f13344b.t0(h10).d0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : d02) {
                if (obj instanceof i8.a) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof i8.b) {
                    arrayList2.add(next);
                }
            }
            i8.a aVar = (i8.b) kotlin.collections.c.p2(arrayList2);
            if (aVar == null) {
                aVar = (i8.a) kotlin.collections.c.n2(arrayList);
            }
            return new j8.a(this.f13343a, aVar, a10.f13341a, a10.f13342b);
        }
        return null;
    }

    @Override // n8.b
    public final boolean c(h9.c cVar, e eVar) {
        g.f(cVar, "packageFqName");
        g.f(eVar, "name");
        String b5 = eVar.b();
        g.e(b5, "name.asString()");
        if (!i.X0(b5, "Function", false) && !i.X0(b5, "KFunction", false) && !i.X0(b5, "SuspendFunction", false) && !i.X0(b5, "KSuspendFunction", false)) {
            return false;
        }
        FunctionClassKind.f13334k.getClass();
        if (FunctionClassKind.a.a(b5, cVar) == null) {
            return false;
        }
        return true;
    }
}
