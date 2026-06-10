package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.l;
import kotlin.reflect.jvm.internal.impl.types.q;
import l8.i0;
import l9.a;
import l9.c;
import l9.d;
import v7.g;
import y9.f0;
import y9.h0;

/* loaded from: classes.dex */
public final class CapturedTypeConstructorKt {
    public static final f0 a(f0 f0Var, i0 i0Var) {
        if (i0Var != null && f0Var.a() != Variance.INVARIANT) {
            if (i0Var.t() == f0Var.a()) {
                if (f0Var.d()) {
                    LockBasedStorageManager.a aVar = LockBasedStorageManager.f14904e;
                    g.e(aVar, "NO_LOCKS");
                    return new h0(new kotlin.reflect.jvm.internal.impl.types.g(aVar, new CapturedTypeConstructorKt$createCapturedIfNeeded$1(f0Var)));
                }
                return new h0(f0Var.b());
            }
            c cVar = new c(f0Var);
            l.f15045j.getClass();
            return new h0(new a(f0Var, cVar, false, l.f15046k));
        }
        return f0Var;
    }

    public static q b(q qVar) {
        if (qVar instanceof y9.q) {
            y9.q qVar2 = (y9.q) qVar;
            f0[] f0VarArr = qVar2.c;
            i0[] i0VarArr = qVar2.f18962b;
            ArrayList z22 = b.z2(f0VarArr, i0VarArr);
            ArrayList arrayList = new ArrayList(n7.l.Z1(z22, 10));
            Iterator it = z22.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(a((f0) pair.f12962i, (i0) pair.f12963j));
            }
            return new y9.q(i0VarArr, (f0[]) arrayList.toArray(new f0[0]), true);
        }
        return new d(qVar, true);
    }
}
