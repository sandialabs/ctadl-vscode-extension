package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.kotlin.e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;

/* loaded from: classes.dex */
public final class d implements h.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.a f13931a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h.a f13932b;
    public final /* synthetic */ e.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ h9.e f13933d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList<m8.c> f13934e;

    public d(f fVar, e.a aVar, h9.e eVar, ArrayList arrayList) {
        this.f13932b = fVar;
        this.c = aVar;
        this.f13933d = eVar;
        this.f13934e = arrayList;
        this.f13931a = fVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
    public final void a() {
        this.f13932b.a();
        this.c.g(this.f13933d, new m9.a((m8.c) kotlin.collections.c.C2(this.f13934e)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
    public final void b(h9.e eVar, h9.b bVar, h9.e eVar2) {
        this.f13931a.b(eVar, bVar, eVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
    public final void c(Object obj, h9.e eVar) {
        this.f13931a.c(obj, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
    public final void d(h9.e eVar, m9.f fVar) {
        this.f13931a.d(eVar, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
    public final h.a e(h9.b bVar, h9.e eVar) {
        return this.f13931a.e(bVar, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
    public final h.b f(h9.e eVar) {
        return this.f13931a.f(eVar);
    }
}
