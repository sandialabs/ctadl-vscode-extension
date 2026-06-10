package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.g0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m0;
import androidx.navigation.i;
import androidx.navigation.n;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class NavController {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5434a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f5435b;
    public s c;

    /* renamed from: d  reason: collision with root package name */
    public p f5436d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f5437e;

    /* renamed from: f  reason: collision with root package name */
    public Parcelable[] f5438f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5439g;

    /* renamed from: i  reason: collision with root package name */
    public androidx.lifecycle.q f5441i;

    /* renamed from: j  reason: collision with root package name */
    public k f5442j;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayDeque f5440h = new ArrayDeque();

    /* renamed from: k  reason: collision with root package name */
    public final y f5443k = new y();

    /* renamed from: l  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f5444l = new CopyOnWriteArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public final androidx.lifecycle.p f5445m = new androidx.lifecycle.o() { // from class: androidx.navigation.NavController.1
        @Override // androidx.lifecycle.o
        public final void f(androidx.lifecycle.q qVar, Lifecycle.Event event) {
            Lifecycle.State state;
            NavController navController = NavController.this;
            if (navController.f5436d != null) {
                Iterator it = navController.f5440h.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    iVar.getClass();
                    switch (i.a.f5488a[event.ordinal()]) {
                        case 1:
                        case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                            state = Lifecycle.State.CREATED;
                            break;
                        case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                        case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                            state = Lifecycle.State.STARTED;
                            break;
                        case 5:
                            state = Lifecycle.State.RESUMED;
                            break;
                        case 6:
                            state = Lifecycle.State.DESTROYED;
                            break;
                        default:
                            throw new IllegalArgumentException("Unexpected event value " + event);
                    }
                    iVar.f5483o = state;
                    iVar.b();
                }
            }
        }
    };
    public final a n = new a();

    /* renamed from: o  reason: collision with root package name */
    public boolean f5446o = true;

    /* loaded from: classes.dex */
    public class a extends androidx.activity.i {
        public a() {
            super(false);
        }

        @Override // androidx.activity.i
        public final void a() {
            NavController.this.k();
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(n nVar);
    }

    public NavController(Context context) {
        this.f5434a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f5435b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        y yVar = this.f5443k;
        yVar.a(new q(yVar));
        this.f5443k.a(new androidx.navigation.b(this.f5434a));
    }

    public final boolean a() {
        ArrayDeque arrayDeque;
        n nVar;
        while (true) {
            arrayDeque = this.f5440h;
            if (arrayDeque.isEmpty() || !(((i) arrayDeque.peekLast()).f5479j instanceof p) || !m(((i) arrayDeque.peekLast()).f5479j.f5511k, true)) {
                break;
            }
        }
        if (!arrayDeque.isEmpty()) {
            n nVar2 = ((i) arrayDeque.peekLast()).f5479j;
            if (nVar2 instanceof c) {
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    nVar = ((i) descendingIterator.next()).f5479j;
                    if (!(nVar instanceof p) && !(nVar instanceof c)) {
                        break;
                    }
                }
            }
            nVar = null;
            HashMap hashMap = new HashMap();
            Iterator descendingIterator2 = arrayDeque.descendingIterator();
            while (descendingIterator2.hasNext()) {
                i iVar = (i) descendingIterator2.next();
                Lifecycle.State state = iVar.f5484p;
                Lifecycle.State state2 = Lifecycle.State.RESUMED;
                n nVar3 = iVar.f5479j;
                if (nVar2 != null && nVar3.f5511k == nVar2.f5511k) {
                    if (state != state2) {
                        hashMap.put(iVar, state2);
                    }
                    nVar2 = nVar2.f5510j;
                } else if (nVar != null && nVar3.f5511k == nVar.f5511k) {
                    Lifecycle.State state3 = Lifecycle.State.STARTED;
                    if (state == state2) {
                        iVar.f5484p = state3;
                        iVar.b();
                    } else if (state != state3) {
                        hashMap.put(iVar, state3);
                    }
                    nVar = nVar.f5510j;
                } else {
                    iVar.f5484p = Lifecycle.State.CREATED;
                    iVar.b();
                }
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                i iVar2 = (i) it.next();
                Lifecycle.State state4 = (Lifecycle.State) hashMap.get(iVar2);
                if (state4 != null) {
                    iVar2.f5484p = state4;
                    iVar2.b();
                } else {
                    iVar2.b();
                }
            }
            i iVar3 = (i) arrayDeque.peekLast();
            Iterator<b> it2 = this.f5444l.iterator();
            while (it2.hasNext()) {
                it2.next().a(iVar3.f5479j);
            }
            return true;
        }
        return false;
    }

    public final n b(int i10) {
        n nVar;
        p pVar;
        p pVar2 = this.f5436d;
        if (pVar2 == null) {
            return null;
        }
        if (pVar2.f5511k == i10) {
            return pVar2;
        }
        ArrayDeque arrayDeque = this.f5440h;
        if (arrayDeque.isEmpty()) {
            nVar = this.f5436d;
        } else {
            nVar = ((i) arrayDeque.getLast()).f5479j;
        }
        if (nVar instanceof p) {
            pVar = (p) nVar;
        } else {
            pVar = nVar.f5510j;
        }
        return pVar.v(i10, true);
    }

    public final i c(int i10) {
        i iVar;
        Iterator descendingIterator = this.f5440h.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                iVar = (i) descendingIterator.next();
                if (iVar.f5479j.f5511k == i10) {
                    break;
                }
            } else {
                iVar = null;
                break;
            }
        }
        if (iVar != null) {
            return iVar;
        }
        StringBuilder o10 = a4.b.o("No destination with ID ", i10, " is on the NavController's back stack. The current destination is ");
        o10.append(e());
        throw new IllegalArgumentException(o10.toString());
    }

    public final i d() {
        ArrayDeque arrayDeque = this.f5440h;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        return (i) arrayDeque.getLast();
    }

    public final n e() {
        i d5 = d();
        if (d5 != null) {
            return d5.f5479j;
        }
        return null;
    }

    public final int f() {
        Iterator it = this.f5440h.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!(((i) it.next()).f5479j instanceof p)) {
                i10++;
            }
        }
        return i10;
    }

    public final i g() {
        Iterator descendingIterator = this.f5440h.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            i iVar = (i) descendingIterator.next();
            if (!(iVar.f5479j instanceof p)) {
                return iVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i10, Bundle bundle, t tVar) {
        n nVar;
        int i11;
        Bundle bundle2;
        int i12;
        ArrayDeque arrayDeque = this.f5440h;
        if (arrayDeque.isEmpty()) {
            nVar = this.f5436d;
        } else {
            nVar = ((i) arrayDeque.getLast()).f5479j;
        }
        if (nVar != null) {
            d g10 = nVar.g(i10);
            if (g10 != null) {
                if (tVar == null) {
                    tVar = g10.f5455b;
                }
                Bundle bundle3 = g10.c;
                i11 = g10.f5454a;
                if (bundle3 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(bundle3);
                    if (bundle != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putAll(bundle);
                    }
                    if (i11 != 0 && tVar != null && (i12 = tVar.f5531b) != -1) {
                        l(i12, tVar.c);
                        return;
                    } else if (i11 == 0) {
                        n b5 = b(i11);
                        if (b5 == null) {
                            Context context = this.f5434a;
                            String h10 = n.h(context, i11);
                            if (g10 != null) {
                                StringBuilder p10 = a4.b.p("Navigation destination ", h10, " referenced from action ");
                                p10.append(n.h(context, i10));
                                p10.append(" cannot be found from the current destination ");
                                p10.append(nVar);
                                throw new IllegalArgumentException(p10.toString());
                            }
                            throw new IllegalArgumentException("Navigation action/destination " + h10 + " cannot be found from the current destination " + nVar);
                        }
                        i(b5, bundle2, tVar);
                        return;
                    } else {
                        throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
                    }
                }
            } else {
                i11 = i10;
            }
            bundle2 = null;
            if (bundle != null) {
            }
            if (i11 != 0) {
            }
            if (i11 == 0) {
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    public final void i(n nVar, Bundle bundle, t tVar) {
        boolean z10;
        boolean z11;
        n nVar2;
        n nVar3;
        int i10;
        if (tVar != null && (i10 = tVar.f5531b) != -1) {
            z10 = m(i10, tVar.c);
        } else {
            z10 = false;
        }
        x c = this.f5443k.c(nVar.f5509i);
        Bundle c10 = nVar.c(bundle);
        n b5 = c.b(nVar, c10, tVar);
        ArrayDeque arrayDeque = this.f5440h;
        if (b5 != null) {
            if (!(b5 instanceof c)) {
                while (!arrayDeque.isEmpty() && (((i) arrayDeque.peekLast()).f5479j instanceof c) && m(((i) arrayDeque.peekLast()).f5479j.f5511k, true)) {
                }
            }
            ArrayDeque arrayDeque2 = new ArrayDeque();
            if (nVar instanceof p) {
                p pVar = b5;
                while (true) {
                    p pVar2 = pVar.f5510j;
                    if (pVar2 != null) {
                        arrayDeque2.addFirst(new i(this.f5434a, pVar2, c10, this.f5441i, this.f5442j));
                        if (!arrayDeque.isEmpty() && ((i) arrayDeque.getLast()).f5479j == pVar2) {
                            m(pVar2.f5511k, true);
                        }
                    }
                    if (pVar2 == null || pVar2 == nVar) {
                        break;
                    }
                    pVar = pVar2;
                }
            }
            if (arrayDeque2.isEmpty()) {
                nVar2 = b5;
            } else {
                nVar2 = ((i) arrayDeque2.getFirst()).f5479j;
            }
            while (nVar2 != null && b(nVar2.f5511k) == null) {
                nVar2 = nVar2.f5510j;
                if (nVar2 != null) {
                    arrayDeque2.addFirst(new i(this.f5434a, nVar2, c10, this.f5441i, this.f5442j));
                }
            }
            if (arrayDeque2.isEmpty()) {
                nVar3 = b5;
            } else {
                nVar3 = ((i) arrayDeque2.getLast()).f5479j;
            }
            while (!arrayDeque.isEmpty() && (((i) arrayDeque.getLast()).f5479j instanceof p)) {
                if (((p) ((i) arrayDeque.getLast()).f5479j).v(nVar3.f5511k, false) != null || !m(((i) arrayDeque.getLast()).f5479j.f5511k, true)) {
                    break;
                }
            }
            arrayDeque.addAll(arrayDeque2);
            if (arrayDeque.isEmpty() || ((i) arrayDeque.getFirst()).f5479j != this.f5436d) {
                arrayDeque.addFirst(new i(this.f5434a, this.f5436d, c10, this.f5441i, this.f5442j));
            }
            arrayDeque.add(new i(this.f5434a, b5, b5.c(c10), this.f5441i, this.f5442j));
        } else if (tVar != null && tVar.f5530a) {
            i iVar = (i) arrayDeque.peekLast();
            if (iVar != null) {
                iVar.f5480k = c10;
            }
            z11 = true;
            o();
            if (!z10 || b5 != null || z11) {
                a();
            }
            return;
        }
        z11 = false;
        o();
        if (!z10) {
        }
        a();
    }

    public final void j() {
        if (f() == 1) {
            n e10 = e();
            int i10 = e10.f5511k;
            p pVar = e10;
            while (true) {
                p pVar2 = pVar.f5510j;
                if (pVar2 != null) {
                    if (pVar2.f5522r != i10) {
                        Bundle bundle = new Bundle();
                        Activity activity = this.f5435b;
                        if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                            n.a s10 = this.f5436d.s(new g0(activity.getIntent()));
                            if (s10 != null) {
                                bundle.putAll(s10.f5516i.c(s10.f5517j));
                            }
                        }
                        m mVar = new m(this.f5434a);
                        p pVar3 = this.f5436d;
                        if (pVar3 != null) {
                            mVar.c = pVar3;
                            mVar.f5508d = pVar2.f5511k;
                            mVar.b();
                            mVar.f5507b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                            mVar.a().g();
                            if (activity != null) {
                                activity.finish();
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
                    }
                    i10 = pVar2.f5511k;
                    pVar = pVar2;
                } else {
                    return;
                }
            }
        } else {
            k();
        }
    }

    public final boolean k() {
        if (this.f5440h.isEmpty()) {
            return false;
        }
        return l(e().f5511k, true);
    }

    public final boolean l(int i10, boolean z10) {
        return m(i10, z10) && a();
    }

    public final boolean m(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        m0 remove;
        ArrayDeque arrayDeque = this.f5440h;
        if (arrayDeque.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (true) {
            if (descendingIterator.hasNext()) {
                n nVar = ((i) descendingIterator.next()).f5479j;
                x c = this.f5443k.c(nVar.f5509i);
                if (z10 || nVar.f5511k != i10) {
                    arrayList.add(c);
                }
                if (nVar.f5511k == i10) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        if (!z11) {
            String h10 = n.h(this.f5434a, i10);
            Log.i("NavController", "Ignoring popBackStack to destination " + h10 + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        boolean z13 = false;
        while (it.hasNext() && ((x) it.next()).e()) {
            i iVar = (i) arrayDeque.removeLast();
            if (iVar.f5481l.f5413d.compareTo(Lifecycle.State.CREATED) >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                iVar.f5484p = Lifecycle.State.DESTROYED;
                iVar.b();
            }
            k kVar = this.f5442j;
            if (kVar != null && (remove = kVar.f5495d.remove(iVar.n)) != null) {
                remove.a();
            }
            z13 = true;
        }
        o();
        return z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(p pVar, Bundle bundle) {
        boolean z10;
        Activity activity;
        int[] iArr;
        Bundle bundle2;
        n.a s10;
        String str;
        boolean z11;
        n v3;
        boolean z12;
        boolean z13;
        n v10;
        ArrayList<String> stringArrayList;
        p pVar2 = this.f5436d;
        if (pVar2 != null) {
            m(pVar2.f5511k, true);
        }
        this.f5436d = pVar;
        Bundle bundle3 = this.f5437e;
        if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                x c = this.f5443k.c(next);
                Bundle bundle4 = this.f5437e.getBundle(next);
                if (bundle4 != null) {
                    c.c(bundle4);
                }
            }
        }
        Parcelable[] parcelableArr = this.f5438f;
        ArrayDeque arrayDeque = this.f5440h;
        Context context = this.f5434a;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                j jVar = (j) parcelable;
                n b5 = b(jVar.f5491j);
                if (b5 != null) {
                    Bundle bundle5 = jVar.f5492k;
                    if (bundle5 != null) {
                        bundle5.setClassLoader(context.getClassLoader());
                    }
                    arrayDeque.add(new i(this.f5434a, b5, bundle5, this.f5441i, this.f5442j, jVar.f5490i, jVar.f5493l));
                } else {
                    StringBuilder p10 = a4.b.p("Restoring the Navigation back stack failed: destination ", n.h(context, jVar.f5491j), " cannot be found from the current destination ");
                    p10.append(e());
                    throw new IllegalStateException(p10.toString());
                }
            }
            o();
            this.f5438f = null;
        }
        if (this.f5436d != null && arrayDeque.isEmpty()) {
            if (!this.f5439g && (activity = this.f5435b) != null) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        iArr = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    } else {
                        iArr = null;
                    }
                    Bundle bundle6 = new Bundle();
                    if (extras != null) {
                        bundle2 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                    } else {
                        bundle2 = null;
                    }
                    if (bundle2 != null) {
                        bundle6.putAll(bundle2);
                    }
                    if ((iArr == null || iArr.length == 0) && intent.getData() != null && (s10 = this.f5436d.s(new g0(intent))) != null) {
                        n nVar = s10.f5516i;
                        int[] d5 = nVar.d();
                        bundle6.putAll(nVar.c(s10.f5517j));
                        iArr = d5;
                    }
                    if (iArr != null && iArr.length != 0) {
                        p pVar3 = this.f5436d;
                        int i10 = 0;
                        while (true) {
                            if (i10 < iArr.length) {
                                int i11 = iArr[i10];
                                if (i10 == 0) {
                                    v10 = this.f5436d;
                                    if (v10.f5511k != i11) {
                                        v10 = null;
                                    }
                                    z13 = true;
                                } else {
                                    z13 = true;
                                    v10 = pVar3.v(i11, true);
                                }
                                if (v10 == null) {
                                    str = n.h(context, i11);
                                    break;
                                }
                                if (i10 != iArr.length - (z13 ? 1 : 0)) {
                                    p pVar4 = (p) v10;
                                    while (pVar4.v(pVar4.f5522r, z13) instanceof p) {
                                        pVar4 = (p) pVar4.v(pVar4.f5522r, z13);
                                        z13 = true;
                                    }
                                    pVar3 = pVar4;
                                }
                                i10++;
                            } else {
                                str = null;
                                break;
                            }
                        }
                        if (str != null) {
                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                        } else {
                            bundle6.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                            int flags = intent.getFlags();
                            int i12 = 268435456 & flags;
                            if (i12 != 0 && (flags & 32768) == 0) {
                                intent.addFlags(32768);
                                m2.w wVar = new m2.w(context);
                                ComponentName component = intent.getComponent();
                                if (component == null) {
                                    component = intent.resolveActivity(wVar.f15974j.getPackageManager());
                                }
                                if (component != null) {
                                    wVar.c(component);
                                }
                                wVar.f15973i.add(intent);
                                wVar.g();
                                activity.finish();
                                activity.overridePendingTransition(0, 0);
                            } else if (i12 != 0) {
                                if (!arrayDeque.isEmpty()) {
                                    m(this.f5436d.f5511k, true);
                                }
                                int i13 = 0;
                                while (i13 < iArr.length) {
                                    int i14 = i13 + 1;
                                    int i15 = iArr[i13];
                                    n b10 = b(i15);
                                    if (b10 != null) {
                                        i(b10, bundle6, new t(false, -1, false, 0, 0, -1, -1));
                                        i13 = i14;
                                    } else {
                                        StringBuilder p11 = a4.b.p("Deep Linking failed: destination ", n.h(context, i15), " cannot be found from the current destination ");
                                        p11.append(e());
                                        throw new IllegalStateException(p11.toString());
                                    }
                                }
                            } else {
                                p pVar5 = this.f5436d;
                                for (int i16 = 0; i16 < iArr.length; i16++) {
                                    int i17 = iArr[i16];
                                    if (i16 == 0) {
                                        v3 = this.f5436d;
                                        z11 = true;
                                    } else {
                                        z11 = true;
                                        v3 = pVar5.v(i17, true);
                                    }
                                    if (v3 != null) {
                                        if (i16 != iArr.length - (z11 ? 1 : 0)) {
                                            p pVar6 = (p) v3;
                                            while (pVar6.v(pVar6.f5522r, z11) instanceof p) {
                                                pVar6 = (p) pVar6.v(pVar6.f5522r, z11);
                                                z11 = true;
                                            }
                                            pVar5 = pVar6;
                                        } else {
                                            i(v3, v3.c(bundle6), new t(false, this.f5436d.f5511k, true, 0, 0, -1, -1));
                                        }
                                    } else {
                                        throw new IllegalStateException("Deep Linking failed: destination " + n.h(context, i17) + " cannot be found in graph " + pVar5);
                                    }
                                }
                                this.f5439g = true;
                            }
                            z12 = true;
                            if (z12) {
                                z10 = true;
                                if (z10) {
                                    i(this.f5436d, bundle, null);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                z12 = false;
                if (z12) {
                }
            }
            z10 = false;
            if (z10) {
            }
        } else {
            a();
        }
    }

    public final void o() {
        boolean z10;
        if (this.f5446o) {
            z10 = true;
            if (f() > 1) {
                this.n.b(z10);
            }
        }
        z10 = false;
        this.n.b(z10);
    }
}
