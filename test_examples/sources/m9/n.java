package m9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import y9.h0;
import y9.m0;

/* loaded from: classes.dex */
public final class n extends g<a> {

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: m9.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0188a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final y9.r f16025a;

            public C0188a(y9.r rVar) {
                this.f16025a = rVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0188a) && v7.g.a(this.f16025a, ((C0188a) obj).f16025a);
            }

            public final int hashCode() {
                return this.f16025a.hashCode();
            }

            public final String toString() {
                return "LocalClass(type=" + this.f16025a + ')';
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public final f f16026a;

            public b(f fVar) {
                this.f16026a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && v7.g.a(this.f16026a, ((b) obj).f16026a);
            }

            public final int hashCode() {
                return this.f16026a.hashCode();
            }

            public final String toString() {
                return "NormalClass(value=" + this.f16026a + ')';
            }
        }
    }

    public n(h9.b bVar, int i10) {
        super(new a.b(new f(bVar, i10)));
    }

    public n(a.C0188a c0188a) {
        super(c0188a);
    }

    @Override // m9.g
    public final y9.r a(l8.s sVar) {
        y9.r rVar;
        v7.g.f(sVar, "module");
        kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
        kotlin.reflect.jvm.internal.impl.types.l lVar = kotlin.reflect.jvm.internal.impl.types.l.f15046k;
        kotlin.reflect.jvm.internal.impl.builtins.e u10 = sVar.u();
        u10.getClass();
        l8.b j2 = u10.j(g.a.P.h());
        T t10 = this.f16022a;
        a aVar = (a) t10;
        if (aVar instanceof a.C0188a) {
            rVar = ((a.C0188a) t10).f16025a;
        } else if (aVar instanceof a.b) {
            f fVar = ((a.b) t10).f16026a;
            h9.b bVar = fVar.f16020a;
            l8.b a10 = FindClassInModuleKt.a(sVar, bVar);
            int i10 = fVar.f16021b;
            if (a10 == null) {
                ErrorTypeKind errorTypeKind = ErrorTypeKind.UNRESOLVED_KCLASS_CONSTANT_VALUE;
                String bVar2 = bVar.toString();
                v7.g.e(bVar2, "classId.toString()");
                rVar = aa.h.c(errorTypeKind, bVar2, String.valueOf(i10));
            } else {
                y9.v r3 = a10.r();
                v7.g.e(r3, "descriptor.defaultType");
                m0 m10 = TypeUtilsKt.m(r3);
                for (int i11 = 0; i11 < i10; i11++) {
                    m10 = sVar.u().i(m10);
                }
                rVar = m10;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return KotlinTypeFactory.e(lVar, j2, a1.c.N0(new h0(rVar)));
    }

    public n(f fVar) {
        super(new a.b(fVar));
    }
}
