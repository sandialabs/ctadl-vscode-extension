package p9;

import h9.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import n7.n;
import v7.g;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f16780b;

    public a(EmptyList emptyList) {
        g.f(emptyList, "inner");
        this.f16780b = emptyList;
    }

    @Override // p9.c
    public final void a(x8.c cVar, w8.c cVar2, e eVar, ArrayList arrayList) {
        g.f(cVar, "<this>");
        g.f(cVar2, "thisDescriptor");
        g.f(eVar, "name");
        for (c cVar3 : this.f16780b) {
            cVar3.a(cVar, cVar2, eVar, arrayList);
        }
    }

    @Override // p9.c
    public final void b(x8.c cVar, l8.b bVar, e eVar, ArrayList arrayList) {
        g.f(cVar, "<this>");
        g.f(bVar, "thisDescriptor");
        g.f(eVar, "name");
        for (c cVar2 : this.f16780b) {
            cVar2.b(cVar, bVar, eVar, arrayList);
        }
    }

    @Override // p9.c
    public final ArrayList c(x8.c cVar, l8.b bVar) {
        g.f(cVar, "<this>");
        g.f(bVar, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (c cVar2 : this.f16780b) {
            n.f2(cVar2.c(cVar, bVar), arrayList);
        }
        return arrayList;
    }

    @Override // p9.c
    public final void d(x8.c cVar, l8.b bVar, ArrayList arrayList) {
        g.f(cVar, "<this>");
        g.f(bVar, "thisDescriptor");
        for (c cVar2 : this.f16780b) {
            cVar2.d(cVar, bVar, arrayList);
        }
    }

    @Override // p9.c
    public final ArrayList e(x8.c cVar, w8.c cVar2) {
        g.f(cVar, "<this>");
        g.f(cVar2, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (c cVar3 : this.f16780b) {
            n.f2(cVar3.e(cVar, cVar2), arrayList);
        }
        return arrayList;
    }

    @Override // p9.c
    public final void f(x8.c cVar, l8.b bVar, e eVar, ListBuilder listBuilder) {
        g.f(cVar, "<this>");
        g.f(bVar, "thisDescriptor");
        g.f(eVar, "name");
        for (c cVar2 : this.f16780b) {
            cVar2.f(cVar, bVar, eVar, listBuilder);
        }
    }

    @Override // p9.c
    public final ArrayList g(x8.c cVar, l8.b bVar) {
        g.f(cVar, "<this>");
        g.f(bVar, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        for (c cVar2 : this.f16780b) {
            n.f2(cVar2.g(cVar, bVar), arrayList);
        }
        return arrayList;
    }
}
