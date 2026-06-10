package androidx.fragment.app;

import a3.j0;
import a3.v0;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m0 implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f5231i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5232j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5233k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5234l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5235m;

    public m0(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f5231i = i10;
        this.f5232j = arrayList;
        this.f5233k = arrayList2;
        this.f5234l = arrayList3;
        this.f5235m = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i10 = 0; i10 < this.f5231i; i10++) {
            WeakHashMap<View, v0> weakHashMap = a3.j0.f188a;
            j0.i.v((View) this.f5232j.get(i10), (String) this.f5233k.get(i10));
            j0.i.v((View) this.f5234l.get(i10), (String) this.f5235m.get(i10));
        }
    }
}
