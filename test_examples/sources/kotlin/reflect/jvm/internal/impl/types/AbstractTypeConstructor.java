package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import l8.g0;

/* loaded from: classes.dex */
public abstract class AbstractTypeConstructor extends y9.e {

    /* renamed from: b  reason: collision with root package name */
    public final x9.e<a> f14933b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Collection<y9.r> f14934a;

        /* renamed from: b  reason: collision with root package name */
        public List<? extends y9.r> f14935b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends y9.r> collection) {
            v7.g.f(collection, "allSupertypes");
            this.f14934a = collection;
            this.f14935b = a1.c.N0(aa.h.f407d);
        }
    }

    public AbstractTypeConstructor(x9.h hVar) {
        v7.g.f(hVar, "storageManager");
        this.f14933b = hVar.b(new AbstractTypeConstructor$supertypes$1(this), AbstractTypeConstructor$supertypes$2.f14937j, new AbstractTypeConstructor$supertypes$3(this));
    }

    public abstract Collection<y9.r> h();

    public y9.r i() {
        return null;
    }

    public Collection j() {
        return EmptyList.f12981i;
    }

    public abstract g0 k();

    @Override // y9.e0
    /* renamed from: l */
    public final List<y9.r> f() {
        return this.f14933b.k0().f14935b;
    }

    public List<y9.r> m(List<y9.r> list) {
        v7.g.f(list, "supertypes");
        return list;
    }

    public void n(y9.r rVar) {
        v7.g.f(rVar, "type");
    }
}
