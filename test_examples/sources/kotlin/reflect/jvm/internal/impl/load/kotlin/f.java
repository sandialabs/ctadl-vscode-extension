package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.kotlin.e;
import l8.d0;
import m9.n;

/* loaded from: classes.dex */
public final class f extends e.a {

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<h9.e, m9.g<?>> f13944b;
    public final /* synthetic */ e c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l8.b f13945d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ h9.b f13946e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List<m8.c> f13947f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ d0 f13948g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, l8.b bVar, h9.b bVar2, List<m8.c> list, d0 d0Var) {
        super();
        this.c = eVar;
        this.f13945d = bVar;
        this.f13946e = bVar2;
        this.f13947f = list;
        this.f13948g = d0Var;
        this.f13944b = new HashMap<>();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
    public final void a() {
        n nVar;
        boolean p10;
        HashMap<h9.e, m9.g<?>> hashMap = this.f13944b;
        e eVar = this.c;
        eVar.getClass();
        h9.b bVar = this.f13946e;
        v7.g.f(bVar, "annotationClassId");
        v7.g.f(hashMap, "arguments");
        if (v7.g.a(bVar, h8.b.f11558b)) {
            m9.g<?> gVar = hashMap.get(h9.e.k("value"));
            n.a.b bVar2 = null;
            if (gVar instanceof n) {
                nVar = (n) gVar;
            } else {
                nVar = null;
            }
            if (nVar != null) {
                T t10 = nVar.f16022a;
                if (t10 instanceof n.a.b) {
                    bVar2 = (n.a.b) t10;
                }
                if (bVar2 != null) {
                    p10 = eVar.p(bVar2.f16026a.f16020a);
                    if (!p10 || eVar.p(bVar)) {
                        return;
                    }
                    this.f13947f.add(new m8.d(this.f13945d.r(), hashMap, this.f13948g));
                }
            }
        }
        p10 = false;
        if (!p10) {
            return;
        }
        this.f13947f.add(new m8.d(this.f13945d.r(), hashMap, this.f13948g));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.e.a
    public final void g(h9.e eVar, m9.g<?> gVar) {
        if (eVar != null) {
            this.f13944b.put(eVar, gVar);
        }
    }
}
