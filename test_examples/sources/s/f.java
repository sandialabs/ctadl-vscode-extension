package s;

import g0.d;
import g0.g0;
import g0.g1;

/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final f f17208a = new f();

    /* loaded from: classes.dex */
    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        public final g1<Boolean> f17209a;

        /* renamed from: b  reason: collision with root package name */
        public final g1<Boolean> f17210b;
        public final g1<Boolean> c;

        public a(g0 g0Var, g0 g0Var2, g0 g0Var3) {
            v7.g.f(g0Var, "isPressed");
            v7.g.f(g0Var2, "isHovered");
            v7.g.f(g0Var3, "isFocused");
            this.f17209a = g0Var;
            this.f17210b = g0Var2;
            this.c = g0Var3;
        }

        @Override // s.n
        public final void d(x0.c cVar) {
            long j2;
            float f10;
            v7.g.f(cVar, "<this>");
            cVar.o0();
            if (this.f17209a.getValue().booleanValue()) {
                j2 = v0.r.f18129b;
                f10 = 0.3f;
            } else if (this.f17210b.getValue().booleanValue() || this.c.getValue().booleanValue()) {
                j2 = v0.r.f18129b;
                f10 = 0.1f;
            } else {
                return;
            }
            x0.e.e(cVar, v0.r.b(j2, f10), cVar.a(), 122);
        }
    }

    @Override // s.m
    public final n a(u.i iVar, g0.d dVar) {
        v7.g.f(iVar, "interactionSource");
        dVar.f(1683566979);
        g0 b5 = androidx.compose.foundation.interaction.a.b(iVar, dVar, 0);
        g0 a10 = androidx.compose.foundation.interaction.b.a(iVar, dVar, 0);
        g0 a11 = androidx.compose.foundation.interaction.a.a(iVar, dVar, 0);
        dVar.f(1157296644);
        boolean z10 = dVar.z(iVar);
        Object g10 = dVar.g();
        if (z10 || g10 == d.a.f11039a) {
            g10 = new a(b5, a10, a11);
            dVar.q(g10);
        }
        dVar.u();
        a aVar = (a) g10;
        dVar.u();
        return aVar;
    }
}
