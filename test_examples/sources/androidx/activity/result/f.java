package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public Random f478a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f479b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f480d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f481e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient HashMap f482f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f483g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f484h = new Bundle();

    /* loaded from: classes.dex */
    public static class a<O> {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.activity.result.b<O> f485a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a<?, O> f486b;

        public a(androidx.activity.result.b<O> bVar, b.a<?, O> aVar) {
            this.f485a = bVar;
            this.f486b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Lifecycle f487a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<o> f488b = new ArrayList<>();

        public b(Lifecycle lifecycle) {
            this.f487a = lifecycle;
        }
    }

    public final boolean a(int i10, int i11, Intent intent) {
        androidx.activity.result.b<O> bVar;
        String str = (String) this.f479b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f482f.get(str);
        if (aVar != null && (bVar = aVar.f485a) != 0 && this.f481e.contains(str)) {
            bVar.a(aVar.f486b.c(intent, i11));
            this.f481e.remove(str);
            return true;
        }
        this.f483g.remove(str);
        this.f484h.putParcelable(str, new androidx.activity.result.a(intent, i11));
        return true;
    }

    public abstract void b(int i10, b.a aVar, @SuppressLint({"UnknownNullness"}) Object obj);

    public final d c(final String str, q qVar, final b.a aVar, final androidx.activity.result.b bVar) {
        boolean z10;
        r i02 = qVar.i0();
        if (i02.f5413d.compareTo(Lifecycle.State.STARTED) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            e(str);
            HashMap hashMap = this.f480d;
            b bVar2 = (b) hashMap.get(str);
            if (bVar2 == null) {
                bVar2 = new b(i02);
            }
            o oVar = new o() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // androidx.lifecycle.o
                public final void f(q qVar2, Lifecycle.Event event) {
                    boolean equals = Lifecycle.Event.ON_START.equals(event);
                    String str2 = str;
                    f fVar = f.this;
                    if (!equals) {
                        if (Lifecycle.Event.ON_STOP.equals(event)) {
                            fVar.f482f.remove(str2);
                            return;
                        } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            fVar.f(str2);
                            return;
                        } else {
                            return;
                        }
                    }
                    HashMap hashMap2 = fVar.f482f;
                    b bVar3 = bVar;
                    b.a aVar2 = aVar;
                    hashMap2.put(str2, new f.a(bVar3, aVar2));
                    HashMap hashMap3 = fVar.f483g;
                    if (hashMap3.containsKey(str2)) {
                        Object obj = hashMap3.get(str2);
                        hashMap3.remove(str2);
                        bVar3.a(obj);
                    }
                    Bundle bundle = fVar.f484h;
                    a aVar3 = (a) bundle.getParcelable(str2);
                    if (aVar3 != null) {
                        bundle.remove(str2);
                        bVar3.a(aVar2.c(aVar3.f473j, aVar3.f472i));
                    }
                }
            };
            bVar2.f487a.a(oVar);
            bVar2.f488b.add(oVar);
            hashMap.put(str, bVar2);
            return new d(this, str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + qVar + " is attempting to register while current state is " + i02.f5413d + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final e d(String str, b.a aVar, androidx.activity.result.b bVar) {
        e(str);
        this.f482f.put(str, new a(bVar, aVar));
        HashMap hashMap = this.f483g;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            bVar.a(obj);
        }
        Bundle bundle = this.f484h;
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) bundle.getParcelable(str);
        if (aVar2 != null) {
            bundle.remove(str);
            bVar.a(aVar.c(aVar2.f473j, aVar2.f472i));
        }
        return new e(this, str, aVar);
    }

    public final void e(String str) {
        HashMap hashMap = this.c;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        while (true) {
            int nextInt = this.f478a.nextInt(2147418112) + 65536;
            HashMap hashMap2 = this.f479b;
            if (!hashMap2.containsKey(Integer.valueOf(nextInt))) {
                hashMap2.put(Integer.valueOf(nextInt), str);
                hashMap.put(str, Integer.valueOf(nextInt));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f481e.contains(str) && (num = (Integer) this.c.remove(str)) != null) {
            this.f479b.remove(num);
        }
        this.f482f.remove(str);
        HashMap hashMap = this.f483g;
        if (hashMap.containsKey(str)) {
            StringBuilder p10 = a4.b.p("Dropping pending result for request ", str, ": ");
            p10.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", p10.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.f484h;
        if (bundle.containsKey(str)) {
            StringBuilder p11 = a4.b.p("Dropping pending result for request ", str, ": ");
            p11.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", p11.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.f480d;
        b bVar = (b) hashMap2.get(str);
        if (bVar != null) {
            ArrayList<o> arrayList = bVar.f488b;
            Iterator<o> it = arrayList.iterator();
            while (it.hasNext()) {
                bVar.f487a.c(it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
