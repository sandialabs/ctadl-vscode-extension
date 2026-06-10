package y8;

import fa.b;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m7.n;
import u7.l;
import v7.g;
import w8.c;

/* loaded from: classes.dex */
public final class a extends b.a<l8.b, n> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l8.b f18936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set<Object> f18937b;
    public final /* synthetic */ l<MemberScope, Collection<Object>> c;

    public a(c cVar, Set set, l lVar) {
        this.f18936a = cVar;
        this.f18937b = set;
        this.c = lVar;
    }

    @Override // fa.b.c
    public final /* bridge */ /* synthetic */ Object a() {
        return n.f16010a;
    }

    @Override // fa.b.c
    public final boolean c(Object obj) {
        l8.b bVar = (l8.b) obj;
        g.f(bVar, "current");
        if (bVar != this.f18936a) {
            MemberScope B0 = bVar.B0();
            g.e(B0, "current.staticScope");
            if (B0 instanceof d) {
                this.f18937b.addAll(this.c.U(B0));
                return false;
            }
        }
        return true;
    }
}
