package z8;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import l8.i0;
import n7.l;
import v7.g;
import y9.m;
import y9.v;

/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: b  reason: collision with root package name */
    public final TypeUsage f19177b;
    public final JavaTypeFlexibility c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19178d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19179e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<i0> f19180f;

    /* renamed from: g  reason: collision with root package name */
    public final v f19181g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z10, boolean z11, Set<? extends i0> set, v vVar) {
        super(typeUsage, set, vVar);
        g.f(javaTypeFlexibility, "flexibility");
        this.f19177b = typeUsage;
        this.c = javaTypeFlexibility;
        this.f19178d = z10;
        this.f19179e = z11;
        this.f19180f = set;
        this.f19181g = vVar;
    }

    public /* synthetic */ a(TypeUsage typeUsage, boolean z10, boolean z11, Set set, int i10) {
        this(typeUsage, (i10 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : null, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? false : z11, (i10 & 16) != 0 ? null : set, null);
    }

    public static a e(a aVar, JavaTypeFlexibility javaTypeFlexibility, boolean z10, Set set, v vVar, int i10) {
        TypeUsage typeUsage;
        boolean z11;
        if ((i10 & 1) != 0) {
            typeUsage = aVar.f19177b;
        } else {
            typeUsage = null;
        }
        TypeUsage typeUsage2 = typeUsage;
        if ((i10 & 2) != 0) {
            javaTypeFlexibility = aVar.c;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i10 & 4) != 0) {
            z10 = aVar.f19178d;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = aVar.f19179e;
        } else {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            set = aVar.f19180f;
        }
        Set set2 = set;
        if ((i10 & 32) != 0) {
            vVar = aVar.f19181g;
        }
        aVar.getClass();
        g.f(typeUsage2, "howThisTypeIsUsed");
        g.f(javaTypeFlexibility2, "flexibility");
        return new a(typeUsage2, javaTypeFlexibility2, z12, z11, set2, vVar);
    }

    @Override // y9.m
    public final v a() {
        return this.f19181g;
    }

    @Override // y9.m
    public final TypeUsage b() {
        return this.f19177b;
    }

    @Override // y9.m
    public final Set<i0> c() {
        return this.f19180f;
    }

    @Override // y9.m
    public final m d(i0 i0Var) {
        Set<i0> set = this.f19180f;
        return e(this, null, false, set != null ? l.b2(set, i0Var) : a1.c.v1(i0Var), null, 47);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!g.a(aVar.f19181g, this.f19181g) || aVar.f19177b != this.f19177b || aVar.c != this.c || aVar.f19178d != this.f19178d || aVar.f19179e != this.f19179e) {
            return false;
        }
        return true;
    }

    public final a f(JavaTypeFlexibility javaTypeFlexibility) {
        return e(this, javaTypeFlexibility, false, null, null, 61);
    }

    @Override // y9.m
    public final int hashCode() {
        v vVar = this.f19181g;
        int hashCode = vVar != null ? vVar.hashCode() : 0;
        int hashCode2 = this.f19177b.hashCode() + (hashCode * 31) + hashCode;
        int hashCode3 = this.c.hashCode() + (hashCode2 * 31) + hashCode2;
        int i10 = (hashCode3 * 31) + (this.f19178d ? 1 : 0) + hashCode3;
        return (i10 * 31) + (this.f19179e ? 1 : 0) + i10;
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f19177b + ", flexibility=" + this.c + ", isRaw=" + this.f19178d + ", isForAnnotationParameter=" + this.f19179e + ", visitedTypeParameters=" + this.f19180f + ", defaultType=" + this.f19181g + ')';
    }
}
