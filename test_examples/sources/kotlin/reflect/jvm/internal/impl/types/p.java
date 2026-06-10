package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.SetBuilder;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import l8.i0;
import y9.f0;
import y9.j0;
import y9.m0;
import y9.v;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final ma.i f15067a;

    /* renamed from: b  reason: collision with root package name */
    public final v8.b f15068b;
    public final m7.e c;

    /* renamed from: d  reason: collision with root package name */
    public final LockBasedStorageManager.k f15069d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i0 f15070a;

        /* renamed from: b  reason: collision with root package name */
        public final y9.m f15071b;

        public a(i0 i0Var, y9.m mVar) {
            v7.g.f(i0Var, "typeParameter");
            v7.g.f(mVar, "typeAttr");
            this.f15070a = i0Var;
            this.f15071b = mVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return v7.g.a(aVar.f15070a, this.f15070a) && v7.g.a(aVar.f15071b, this.f15071b);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f15070a.hashCode();
            return this.f15071b.hashCode() + (hashCode * 31) + hashCode;
        }

        public final String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f15070a + ", typeAttr=" + this.f15071b + ')';
        }
    }

    public p(z8.c cVar) {
        v8.b bVar = new v8.b();
        this.f15067a = cVar;
        this.f15068b = bVar;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.c = kotlin.a.b(new TypeParameterUpperBoundEraser$erroneousErasedBound$2(this));
        this.f15069d = lockBasedStorageManager.e(new TypeParameterUpperBoundEraser$getErasedUpperBound$1(this));
    }

    public final y9.r a(i0 i0Var, y9.m mVar) {
        v7.g.f(i0Var, "typeParameter");
        v7.g.f(mVar, "typeAttr");
        Object U = this.f15069d.U(new a(i0Var, mVar));
        v7.g.e(U, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return (y9.r) U;
    }

    public final SetBuilder b(TypeSubstitutor typeSubstitutor, List list, y9.m mVar) {
        boolean z10;
        y9.r rVar;
        m0 m0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        Iterator it;
        SetBuilder setBuilder = new SetBuilder();
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            y9.r rVar2 = (y9.r) it2.next();
            l8.d c = rVar2.U0().c();
            boolean z14 = c instanceof l8.b;
            v8.b bVar = this.f15068b;
            if (z14) {
                Set<i0> c10 = mVar.c();
                bVar.getClass();
                m0 X0 = rVar2.X0();
                if (X0 instanceof y9.n) {
                    y9.n nVar = (y9.n) X0;
                    v vVar = nVar.f18958j;
                    if (!vVar.U0().e().isEmpty() && vVar.U0().c() != null) {
                        List<i0> e10 = vVar.U0().e();
                        v7.g.e(e10, "constructor.parameters");
                        ArrayList arrayList = new ArrayList(n7.l.Z1(e10, 10));
                        Iterator it3 = e10.iterator();
                        while (it3.hasNext()) {
                            i0 i0Var = (i0) it3.next();
                            f0 f0Var = (f0) kotlin.collections.c.q2(i0Var.getIndex(), rVar2.S0());
                            if (c10 != null && c10.contains(i0Var)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (f0Var != null && !z13) {
                                q g10 = typeSubstitutor.g();
                                it = it3;
                                y9.r b5 = f0Var.b();
                                v7.g.e(b5, "argument.type");
                                if (g10.d(b5) != null) {
                                    arrayList.add(f0Var);
                                    it3 = it;
                                }
                            } else {
                                it = it3;
                            }
                            f0Var = new StarProjectionImpl(i0Var);
                            arrayList.add(f0Var);
                            it3 = it;
                        }
                        vVar = j0.d(vVar, arrayList, null, 2);
                    }
                    v vVar2 = nVar.f18959k;
                    if (!vVar2.U0().e().isEmpty() && vVar2.U0().c() != null) {
                        List<i0> e11 = vVar2.U0().e();
                        v7.g.e(e11, "constructor.parameters");
                        ArrayList arrayList2 = new ArrayList(n7.l.Z1(e11, 10));
                        for (i0 i0Var2 : e11) {
                            f0 f0Var2 = (f0) kotlin.collections.c.q2(i0Var2.getIndex(), rVar2.S0());
                            if (c10 != null && c10.contains(i0Var2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (f0Var2 != null && !z12) {
                                q g11 = typeSubstitutor.g();
                                y9.r b10 = f0Var2.b();
                                v7.g.e(b10, "argument.type");
                                if (g11.d(b10) != null) {
                                    arrayList2.add(f0Var2);
                                }
                            }
                            f0Var2 = new StarProjectionImpl(i0Var2);
                            arrayList2.add(f0Var2);
                        }
                        vVar2 = j0.d(vVar2, arrayList2, null, 2);
                    }
                    m0Var = KotlinTypeFactory.c(vVar, vVar2);
                } else if (X0 instanceof v) {
                    v vVar3 = (v) X0;
                    if (!vVar3.U0().e().isEmpty() && vVar3.U0().c() != null) {
                        List<i0> e12 = vVar3.U0().e();
                        v7.g.e(e12, "constructor.parameters");
                        ArrayList arrayList3 = new ArrayList(n7.l.Z1(e12, 10));
                        for (i0 i0Var3 : e12) {
                            f0 f0Var3 = (f0) kotlin.collections.c.q2(i0Var3.getIndex(), rVar2.S0());
                            if (c10 != null && c10.contains(i0Var3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (f0Var3 != null && !z11) {
                                q g12 = typeSubstitutor.g();
                                y9.r b11 = f0Var3.b();
                                v7.g.e(b11, "argument.type");
                                if (g12.d(b11) != null) {
                                    arrayList3.add(f0Var3);
                                }
                            }
                            f0Var3 = new StarProjectionImpl(i0Var3);
                            arrayList3.add(f0Var3);
                        }
                        m0Var = j0.d(vVar3, arrayList3, null, 2);
                    }
                    m0Var = vVar3;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                rVar = typeSubstitutor.i(a1.b.f0(m0Var, X0), Variance.OUT_VARIANCE);
            } else {
                if (c instanceof i0) {
                    Set<i0> c11 = mVar.c();
                    if (c11 != null && c11.contains(c)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        v a10 = mVar.a();
                        if (a10 == null || (rVar = TypeUtilsKt.m(a10)) == null) {
                            rVar = (aa.f) this.c.getValue();
                        }
                    } else {
                        List<y9.r> upperBounds = ((i0) c).getUpperBounds();
                        v7.g.e(upperBounds, "declaration.upperBounds");
                        setBuilder.addAll(b(typeSubstitutor, upperBounds, mVar));
                    }
                }
                bVar.getClass();
            }
            setBuilder.add(rVar);
            bVar.getClass();
        }
        a1.c.T(setBuilder);
        return setBuilder;
    }
}
