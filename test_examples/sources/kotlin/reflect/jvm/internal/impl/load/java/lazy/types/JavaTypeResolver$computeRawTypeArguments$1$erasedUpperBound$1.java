package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import b9.j;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.p;
import l8.d;
import l8.i0;
import y9.e0;
import y9.r;
import y9.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1 extends Lambda implements u7.a<r> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ a f13830j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i0 f13831k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ z8.a f13832l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e0 f13833m;
    public final /* synthetic */ j n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1(a aVar, i0 i0Var, z8.a aVar2, e0 e0Var, j jVar) {
        super(0);
        this.f13830j = aVar;
        this.f13831k = i0Var;
        this.f13832l = aVar2;
        this.f13833m = e0Var;
        this.n = jVar;
    }

    @Override // u7.a
    public final r k0() {
        v vVar;
        p pVar = this.f13830j.f13841d;
        d c = this.f13833m.c();
        if (c != null) {
            vVar = c.r();
        } else {
            vVar = null;
        }
        z8.a aVar = this.f13832l;
        aVar.getClass();
        return pVar.a(this.f13831k, z8.a.e(z8.a.e(aVar, null, false, null, vVar, 31), null, this.n.P(), null, null, 59));
    }
}
