package d2;

import androidx.constraintlayout.core.SolverVariable;
import g0.v;
import h1.c;
import java.util.ArrayList;
import java.util.HashSet;
import p.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10381a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10382b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public Object f10383d;

    public a(int i10) {
        if (i10 != 1) {
            this.f10381a = new v(256, 2);
            this.f10382b = new v(256, 2);
            this.c = new v(256, 2);
            this.f10383d = new SolverVariable[32];
            return;
        }
        this.f10381a = new c(10, 1);
        this.f10382b = new h();
        this.c = new ArrayList();
        this.f10383d = new HashSet();
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((h) this.f10382b).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
