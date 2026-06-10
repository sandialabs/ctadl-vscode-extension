package com.airbnb.epoxy;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ List f6613i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f6614j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ j f6615k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ c f6616l;

    public b(int i10, c cVar, j jVar, List list) {
        this.f6616l = cVar;
        this.f6613i = list;
        this.f6614j = i10;
        this.f6615k = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6614j;
        List list = this.f6613i;
        c cVar = this.f6616l;
        boolean b5 = cVar.b(i10, list);
        j jVar = this.f6615k;
        if (jVar != null && b5) {
            n nVar = (n) cVar.f6623b;
            nVar.getClass();
            nVar.f6667l = jVar.f6648b.size();
            m0 m0Var = nVar.f6664i;
            m0Var.f6663a = true;
            jVar.a(new androidx.recyclerview.widget.b(nVar));
            m0Var.f6663a = false;
            ArrayList arrayList = nVar.f6668m;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((n0) arrayList.get(size)).a(jVar);
            }
        }
    }
}
