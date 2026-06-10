package m8;

import aa.h;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import l8.d0;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final r f16012a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<h9.e, m9.g<?>> f16013b;
    public final d0 c;

    public d(v vVar, Map map, d0 d0Var) {
        if (vVar == null) {
            c(0);
            throw null;
        } else if (map == null) {
            c(1);
            throw null;
        } else if (d0Var == null) {
            c(2);
            throw null;
        } else {
            this.f16012a = vVar;
            this.f16013b = map;
            this.c = d0Var;
        }
    }

    public static /* synthetic */ void c(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // m8.c
    public final Map<h9.e, m9.g<?>> a() {
        Map<h9.e, m9.g<?>> map = this.f16013b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // m8.c
    public final r b() {
        r rVar = this.f16012a;
        if (rVar != null) {
            return rVar;
        }
        c(3);
        throw null;
    }

    @Override // m8.c
    public final h9.c e() {
        l8.b d5 = DescriptorUtilsKt.d(this);
        if (d5 != null) {
            if (h.f(d5)) {
                d5 = null;
            }
            if (d5 != null) {
                return DescriptorUtilsKt.c(d5);
            }
            return null;
        }
        return null;
    }

    @Override // m8.c
    public final d0 j() {
        d0 d0Var = this.c;
        if (d0Var != null) {
            return d0Var;
        }
        c(5);
        throw null;
    }

    public final String toString() {
        return DescriptorRenderer.f14593a.p(this, null);
    }
}
