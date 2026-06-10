package o4;

import androidx.work.ExistingWorkPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends androidx.datastore.preferences.protobuf.k {

    /* renamed from: r  reason: collision with root package name */
    public static final String f16344r = n4.g.f("WorkContinuationImpl");

    /* renamed from: i  reason: collision with root package name */
    public final a0 f16345i;

    /* renamed from: j  reason: collision with root package name */
    public final String f16346j;

    /* renamed from: k  reason: collision with root package name */
    public final ExistingWorkPolicy f16347k;

    /* renamed from: l  reason: collision with root package name */
    public final List<? extends n4.k> f16348l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f16349m;
    public final ArrayList n;

    /* renamed from: o  reason: collision with root package name */
    public final List<u> f16350o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16351p;

    /* renamed from: q  reason: collision with root package name */
    public m f16352q;

    public u() {
        throw null;
    }

    public u(a0 a0Var, List<? extends n4.k> list) {
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
        this.f16345i = a0Var;
        this.f16346j = null;
        this.f16347k = existingWorkPolicy;
        this.f16348l = list;
        this.f16350o = null;
        this.f16349m = new ArrayList(list.size());
        this.n = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = list.get(i10).f16093a.toString();
            v7.g.e(uuid, "id.toString()");
            this.f16349m.add(uuid);
            this.n.add(uuid);
        }
    }

    public static boolean L0(u uVar, HashSet hashSet) {
        hashSet.addAll(uVar.f16349m);
        HashSet M0 = M0(uVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (M0.contains((String) it.next())) {
                return true;
            }
        }
        List<u> list = uVar.f16350o;
        if (list != null && !list.isEmpty()) {
            for (u uVar2 : list) {
                if (L0(uVar2, hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(uVar.f16349m);
        return false;
    }

    public static HashSet M0(u uVar) {
        HashSet hashSet = new HashSet();
        List<u> list = uVar.f16350o;
        if (list != null && !list.isEmpty()) {
            for (u uVar2 : list) {
                hashSet.addAll(uVar2.f16349m);
            }
        }
        return hashSet;
    }
}
