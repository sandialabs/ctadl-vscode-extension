package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h0;
import androidx.lifecycle.Lifecycle;
import com.noto.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class z {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList<androidx.fragment.app.a> E;
    public ArrayList<Boolean> F;
    public ArrayList<Fragment> G;
    public c0 H;
    public final g I;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5274b;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f5275d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f5276e;

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f5278g;

    /* renamed from: m  reason: collision with root package name */
    public final y f5284m;
    public final CopyOnWriteArrayList<d0> n;

    /* renamed from: o  reason: collision with root package name */
    public int f5285o;

    /* renamed from: p  reason: collision with root package name */
    public w<?> f5286p;

    /* renamed from: q  reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.k f5287q;

    /* renamed from: r  reason: collision with root package name */
    public Fragment f5288r;

    /* renamed from: s  reason: collision with root package name */
    public Fragment f5289s;

    /* renamed from: t  reason: collision with root package name */
    public final e f5290t;

    /* renamed from: u  reason: collision with root package name */
    public final f f5291u;

    /* renamed from: v  reason: collision with root package name */
    public androidx.activity.result.e f5292v;

    /* renamed from: w  reason: collision with root package name */
    public androidx.activity.result.e f5293w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.activity.result.e f5294x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayDeque<l> f5295y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5296z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<m> f5273a = new ArrayList<>();
    public final g0 c = new g0();

    /* renamed from: f  reason: collision with root package name */
    public final x f5277f = new x(this);

    /* renamed from: h  reason: collision with root package name */
    public final c f5279h = new c();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f5280i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f5281j = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f5282k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map<Fragment, HashSet<v2.d>> f5283l = DesugarCollections.synchronizedMap(new HashMap());

    /* loaded from: classes.dex */
    public class a implements androidx.activity.result.b<androidx.activity.result.a> {
        public a() {
        }

        @Override // androidx.activity.result.b
        public final void a(androidx.activity.result.a aVar) {
            StringBuilder sb;
            androidx.activity.result.a aVar2 = aVar;
            z zVar = z.this;
            l pollFirst = zVar.f5295y.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No IntentSenders were started for ");
                sb.append(this);
            } else {
                g0 g0Var = zVar.c;
                String str = pollFirst.f5304i;
                Fragment d5 = g0Var.d(str);
                if (d5 == null) {
                    sb = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    d5.t(pollFirst.f5305j, aVar2.f472i, aVar2.f473j);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public class b implements androidx.activity.result.b<Map<String, Boolean>> {
        public b() {
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        public final void a(Map<String, Boolean> map) {
            StringBuilder sb;
            int i10;
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((Boolean) arrayList.get(i11)).booleanValue()) {
                    i10 = 0;
                } else {
                    i10 = -1;
                }
                iArr[i11] = i10;
            }
            z zVar = z.this;
            l pollFirst = zVar.f5295y.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No permissions were requested for ");
                sb.append(this);
            } else {
                g0 g0Var = zVar.c;
                String str = pollFirst.f5304i;
                if (g0Var.d(str) == null) {
                    sb = new StringBuilder("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public class c extends androidx.activity.i {
        public c() {
            super(false);
        }

        @Override // androidx.activity.i
        public final void a() {
            z zVar = z.this;
            zVar.y(true);
            if (zVar.f5279h.f462a) {
                zVar.R();
            } else {
                zVar.f5278g.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public d(z zVar) {
        }
    }

    /* loaded from: classes.dex */
    public class e extends v {
        public e() {
        }

        @Override // androidx.fragment.app.v
        public final Fragment a(String str) {
            Context context = z.this.f5286p.f5263j;
            Object obj = Fragment.c0;
            try {
                return v.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new Fragment.InstantiationException(a4.b.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
            } catch (InstantiationException e11) {
                throw new Fragment.InstantiationException(a4.b.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
            } catch (NoSuchMethodException e12) {
                throw new Fragment.InstantiationException(a4.b.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
            } catch (InvocationTargetException e13) {
                throw new Fragment.InstantiationException(a4.b.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements q0 {
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            z.this.y(true);
        }
    }

    /* loaded from: classes.dex */
    public class h implements d0 {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Fragment f5302i;

        public h(Fragment fragment) {
            this.f5302i = fragment;
        }

        @Override // androidx.fragment.app.d0
        public final void L(Fragment fragment) {
            this.f5302i.v(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class i implements androidx.activity.result.b<androidx.activity.result.a> {
        public i() {
        }

        @Override // androidx.activity.result.b
        public final void a(androidx.activity.result.a aVar) {
            StringBuilder sb;
            androidx.activity.result.a aVar2 = aVar;
            z zVar = z.this;
            l pollFirst = zVar.f5295y.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder("No Activities were started for result for ");
                sb.append(this);
            } else {
                g0 g0Var = zVar.c;
                String str = pollFirst.f5304i;
                Fragment d5 = g0Var.d(str);
                if (d5 == null) {
                    sb = new StringBuilder("Activity result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    d5.t(pollFirst.f5305j, aVar2.f472i, aVar2.f473j);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    /* loaded from: classes.dex */
    public static class j extends b.a<androidx.activity.result.h, androidx.activity.result.a> {
        @Override // b.a
        public final Intent a(ComponentActivity componentActivity, Object obj) {
            Bundle bundleExtra;
            androidx.activity.result.h hVar = (androidx.activity.result.h) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = hVar.f490j;
            if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new androidx.activity.result.h(hVar.f489i, null, hVar.f491k, hVar.f492l);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (z.K(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // b.a
        public final Object c(Intent intent, int i10) {
            return new androidx.activity.result.a(intent, i10);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public void a(z zVar, Fragment fragment) {
        }

        public void b(z zVar, Fragment fragment, View view) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: i  reason: collision with root package name */
        public final String f5304i;

        /* renamed from: j  reason: collision with root package name */
        public final int f5305j;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            public final l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final l[] newArray(int i10) {
                return new l[i10];
            }
        }

        public l(Parcel parcel) {
            this.f5304i = parcel.readString();
            this.f5305j = parcel.readInt();
        }

        public l(String str) {
            this.f5304i = str;
            this.f5305j = 1;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f5304i);
            parcel.writeInt(this.f5305j);
        }
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* loaded from: classes.dex */
    public class n implements m {

        /* renamed from: a  reason: collision with root package name */
        public final String f5306a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5307b;
        public final int c = 1;

        public n(String str, int i10) {
            this.f5306a = str;
            this.f5307b = i10;
        }

        @Override // androidx.fragment.app.z.m
        public final boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = z.this.f5289s;
            if (fragment == null || this.f5307b >= 0 || this.f5306a != null || !fragment.h().R()) {
                return z.this.S(arrayList, arrayList2, this.f5306a, this.f5307b, this.c);
            }
            return false;
        }
    }

    public z() {
        new d(this);
        this.f5284m = new y(this);
        this.n = new CopyOnWriteArrayList<>();
        this.f5285o = -1;
        this.f5290t = new e();
        this.f5291u = new f();
        this.f5295y = new ArrayDeque<>();
        this.I = new g();
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean L(Fragment fragment) {
        fragment.getClass();
        Iterator it = fragment.B.c.f().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z10 = L(fragment2);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.J && (fragment.f5052z == null || M(fragment.C));
    }

    public static boolean N(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        z zVar = fragment.f5052z;
        if (fragment.equals(zVar.f5289s) && N(zVar.f5288r)) {
            return true;
        }
        return false;
    }

    public static void c0(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.G) {
            fragment.G = false;
            fragment.Q = !fragment.Q;
        }
    }

    public final void A(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        boolean z10 = arrayList3.get(i10).f5177p;
        ArrayList<Fragment> arrayList5 = this.G;
        if (arrayList5 == null) {
            this.G = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<Fragment> arrayList6 = this.G;
        g0 g0Var4 = this.c;
        arrayList6.addAll(g0Var4.h());
        Fragment fragment = this.f5289s;
        int i13 = i10;
        boolean z11 = false;
        while (true) {
            int i14 = 1;
            if (i13 < i11) {
                androidx.fragment.app.a aVar = arrayList3.get(i13);
                if (arrayList4.get(i13).booleanValue()) {
                    g0Var2 = g0Var4;
                    int i15 = 1;
                    ArrayList<Fragment> arrayList7 = this.G;
                    ArrayList<h0.a> arrayList8 = aVar.f5164a;
                    int size = arrayList8.size() - 1;
                    while (size >= 0) {
                        h0.a aVar2 = arrayList8.get(size);
                        int i16 = aVar2.f5178a;
                        if (i16 != i15) {
                            if (i16 != 3) {
                                switch (i16) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case ma.i.f16046m /* 9 */:
                                        fragment = aVar2.f5179b;
                                        break;
                                    case ma.i.f16047o /* 10 */:
                                        aVar2.f5184h = aVar2.f5183g;
                                        break;
                                }
                                size--;
                                i15 = 1;
                            }
                            arrayList7.add(aVar2.f5179b);
                            size--;
                            i15 = 1;
                        }
                        arrayList7.remove(aVar2.f5179b);
                        size--;
                        i15 = 1;
                    }
                } else {
                    ArrayList<Fragment> arrayList9 = this.G;
                    int i17 = 0;
                    while (true) {
                        ArrayList<h0.a> arrayList10 = aVar.f5164a;
                        if (i17 < arrayList10.size()) {
                            h0.a aVar3 = arrayList10.get(i17);
                            int i18 = aVar3.f5178a;
                            if (i18 != i14) {
                                if (i18 != 2) {
                                    if (i18 == 3 || i18 == 6) {
                                        arrayList9.remove(aVar3.f5179b);
                                        Fragment fragment2 = aVar3.f5179b;
                                        if (fragment2 == fragment) {
                                            arrayList10.add(i17, new h0.a(9, fragment2));
                                            i17++;
                                            g0Var3 = g0Var4;
                                            i12 = 1;
                                            fragment = null;
                                        }
                                    } else if (i18 != 7) {
                                        if (i18 == 8) {
                                            arrayList10.add(i17, new h0.a(9, fragment));
                                            i17++;
                                            fragment = aVar3.f5179b;
                                        }
                                    }
                                    g0Var3 = g0Var4;
                                    i12 = 1;
                                } else {
                                    Fragment fragment3 = aVar3.f5179b;
                                    int i19 = fragment3.E;
                                    int size2 = arrayList9.size() - 1;
                                    boolean z12 = false;
                                    while (size2 >= 0) {
                                        g0 g0Var5 = g0Var4;
                                        Fragment fragment4 = arrayList9.get(size2);
                                        if (fragment4.E == i19) {
                                            if (fragment4 == fragment3) {
                                                z12 = true;
                                            } else {
                                                if (fragment4 == fragment) {
                                                    arrayList10.add(i17, new h0.a(9, fragment4));
                                                    i17++;
                                                    fragment = null;
                                                }
                                                h0.a aVar4 = new h0.a(3, fragment4);
                                                aVar4.c = aVar3.c;
                                                aVar4.f5181e = aVar3.f5181e;
                                                aVar4.f5180d = aVar3.f5180d;
                                                aVar4.f5182f = aVar3.f5182f;
                                                arrayList10.add(i17, aVar4);
                                                arrayList9.remove(fragment4);
                                                i17++;
                                                fragment = fragment;
                                            }
                                        }
                                        size2--;
                                        g0Var4 = g0Var5;
                                    }
                                    g0Var3 = g0Var4;
                                    i12 = 1;
                                    if (z12) {
                                        arrayList10.remove(i17);
                                        i17--;
                                    } else {
                                        aVar3.f5178a = 1;
                                        arrayList9.add(fragment3);
                                    }
                                }
                                i17 += i12;
                                g0Var4 = g0Var3;
                                i14 = 1;
                            }
                            g0Var3 = g0Var4;
                            i12 = 1;
                            arrayList9.add(aVar3.f5179b);
                            i17 += i12;
                            g0Var4 = g0Var3;
                            i14 = 1;
                        } else {
                            g0Var2 = g0Var4;
                        }
                    }
                }
                if (!z11 && !aVar.f5169g) {
                    z11 = false;
                    i13++;
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                    g0Var4 = g0Var2;
                }
                z11 = true;
                i13++;
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                g0Var4 = g0Var2;
            } else {
                g0 g0Var6 = g0Var4;
                this.G.clear();
                if (!z10 && this.f5285o >= 1) {
                    for (int i20 = i10; i20 < i11; i20++) {
                        Iterator<h0.a> it = arrayList.get(i20).f5164a.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = it.next().f5179b;
                            if (fragment5 == null || fragment5.f5052z == null) {
                                g0Var = g0Var6;
                            } else {
                                g0Var = g0Var6;
                                g0Var.i(g(fragment5));
                            }
                            g0Var6 = g0Var;
                        }
                        g0 g0Var7 = g0Var6;
                    }
                }
                for (int i21 = i10; i21 < i11; i21++) {
                    androidx.fragment.app.a aVar5 = arrayList.get(i21);
                    if (arrayList2.get(i21).booleanValue()) {
                        aVar5.c(-1);
                        aVar5.h();
                    } else {
                        aVar5.c(1);
                        aVar5.g();
                    }
                }
                boolean booleanValue = arrayList2.get(i11 - 1).booleanValue();
                for (int i22 = i10; i22 < i11; i22++) {
                    androidx.fragment.app.a aVar6 = arrayList.get(i22);
                    if (booleanValue) {
                        for (int size3 = aVar6.f5164a.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = aVar6.f5164a.get(size3).f5179b;
                            if (fragment6 != null) {
                                g(fragment6).k();
                            }
                        }
                    } else {
                        Iterator<h0.a> it2 = aVar6.f5164a.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().f5179b;
                            if (fragment7 != null) {
                                g(fragment7).k();
                            }
                        }
                    }
                }
                P(this.f5285o, true);
                HashSet hashSet = new HashSet();
                for (int i23 = i10; i23 < i11; i23++) {
                    Iterator<h0.a> it3 = arrayList.get(i23).f5164a.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().f5179b;
                        if (fragment8 != null && (viewGroup = fragment8.L) != null) {
                            hashSet.add(SpecialEffectsController.f(viewGroup, I()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it4.next();
                    specialEffectsController.f5075d = booleanValue;
                    specialEffectsController.g();
                    specialEffectsController.c();
                }
                for (int i24 = i10; i24 < i11; i24++) {
                    androidx.fragment.app.a aVar7 = arrayList.get(i24);
                    if (arrayList2.get(i24).booleanValue() && aVar7.f5100s >= 0) {
                        aVar7.f5100s = -1;
                    }
                    aVar7.getClass();
                }
                return;
            }
        }
    }

    public final void B(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
    }

    public final Fragment C(String str) {
        return this.c.c(str);
    }

    public final Fragment D(int i10) {
        g0 g0Var = this.c;
        ArrayList arrayList = (ArrayList) g0Var.f5159b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && fragment.D == i10) {
                    return fragment;
                }
            } else {
                for (f0 f0Var : ((HashMap) g0Var.c).values()) {
                    if (f0Var != null) {
                        Fragment fragment2 = f0Var.c;
                        if (fragment2.D == i10) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment E(String str) {
        g0 g0Var = this.c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) g0Var.f5159b;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && str.equals(fragment.F)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (f0 f0Var : ((HashMap) g0Var.c).values()) {
                if (f0Var != null) {
                    Fragment fragment2 = f0Var.c;
                    if (str.equals(fragment2.F)) {
                        return fragment2;
                    }
                }
            }
        } else {
            g0Var.getClass();
        }
        return null;
    }

    public final void F() {
        Iterator it = f().iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.f5076e) {
                specialEffectsController.f5076e = false;
                specialEffectsController.c();
            }
        }
    }

    public final ViewGroup G(Fragment fragment) {
        ViewGroup viewGroup = fragment.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.E > 0 && this.f5287q.F0()) {
            View C0 = this.f5287q.C0(fragment.E);
            if (C0 instanceof ViewGroup) {
                return (ViewGroup) C0;
            }
        }
        return null;
    }

    public final v H() {
        Fragment fragment = this.f5288r;
        return fragment != null ? fragment.f5052z.H() : this.f5290t;
    }

    public final q0 I() {
        Fragment fragment = this.f5288r;
        return fragment != null ? fragment.f5052z.I() : this.f5291u;
    }

    public final void J(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.G) {
            return;
        }
        fragment.G = true;
        fragment.Q = true ^ fragment.Q;
        b0(fragment);
    }

    public final boolean O() {
        if (!this.A && !this.B) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r5 != r4.f5285o) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(int i10, boolean z10) {
        Object obj;
        w<?> wVar;
        boolean z11;
        if (this.f5286p == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        this.f5285o = i10;
        g0 g0Var = this.c;
        Iterator it = ((ArrayList) g0Var.f5159b).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            obj = g0Var.c;
            if (!hasNext) {
                break;
            }
            f0 f0Var = (f0) ((HashMap) obj).get(((Fragment) it.next()).f5040m);
            if (f0Var != null) {
                f0Var.k();
            }
        }
        Iterator it2 = ((HashMap) obj).values().iterator();
        while (true) {
            boolean z12 = false;
            if (!it2.hasNext()) {
                break;
            }
            f0 f0Var2 = (f0) it2.next();
            if (f0Var2 != null) {
                f0Var2.k();
                Fragment fragment = f0Var2.c;
                if (fragment.f5046t) {
                    if (fragment.f5051y > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        z12 = true;
                    }
                }
                if (z12) {
                    g0Var.j(f0Var2);
                }
            }
        }
        d0();
        if (this.f5296z && (wVar = this.f5286p) != null && this.f5285o == 7) {
            wVar.O0();
            this.f5296z = false;
        }
    }

    public final void Q() {
        if (this.f5286p == null) {
            return;
        }
        this.A = false;
        this.B = false;
        this.H.f5130i = false;
        for (Fragment fragment : this.c.h()) {
            if (fragment != null) {
                fragment.B.Q();
            }
        }
    }

    public final boolean R() {
        y(false);
        x(true);
        Fragment fragment = this.f5289s;
        if (fragment == null || !fragment.h().R()) {
            boolean S = S(this.E, this.F, null, -1, 0);
            if (S) {
                this.f5274b = true;
                try {
                    U(this.E, this.F);
                    e();
                } catch (Throwable th) {
                    e();
                    throw th;
                }
            }
            f0();
            u();
            this.c.b();
            return S;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f5275d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f5275d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str == null && i10 < 0) {
                i12 = -1;
                if (i12 != this.f5275d.size() - 1) {
                    return false;
                }
                for (int size2 = this.f5275d.size() - 1; size2 > i12; size2--) {
                    arrayList.add(this.f5275d.remove(size2));
                    arrayList2.add(Boolean.TRUE);
                }
            }
            int size3 = arrayList3.size() - 1;
            while (size3 >= 0) {
                androidx.fragment.app.a aVar = this.f5275d.get(size3);
                if ((str == null || !str.equals(aVar.f5171i)) && (i10 < 0 || i10 != aVar.f5100s)) {
                    size3--;
                }
            }
            if (size3 < 0) {
                return false;
            }
            if ((i11 & 1) != 0) {
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    androidx.fragment.app.a aVar2 = this.f5275d.get(size3);
                    if (str == null || !str.equals(aVar2.f5171i)) {
                        if (i10 < 0 || i10 != aVar2.f5100s) {
                            break;
                        }
                    }
                }
            }
            i12 = size3;
            if (i12 != this.f5275d.size() - 1) {
            }
        }
        return true;
    }

    public final void T(Fragment fragment) {
        boolean z10;
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.f5051y);
        }
        if (fragment.f5051y > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = !z10;
        if (!fragment.H || z11) {
            g0 g0Var = this.c;
            synchronized (((ArrayList) g0Var.f5159b)) {
                ((ArrayList) g0Var.f5159b).remove(fragment);
            }
            fragment.f5045s = false;
            if (L(fragment)) {
                this.f5296z = true;
            }
            fragment.f5046t = true;
            b0(fragment);
        }
    }

    public final void U(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        B(arrayList, arrayList2);
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f5177p) {
                if (i11 != i10) {
                    A(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f5177p) {
                        i11++;
                    }
                }
                A(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            A(arrayList, arrayList2, i11, size);
        }
    }

    public final void V(Parcelable parcelable) {
        y yVar;
        int i10;
        Fragment fragment;
        f0 f0Var;
        if (parcelable == null) {
            return;
        }
        b0 b0Var = (b0) parcelable;
        if (b0Var.f5114i == null) {
            return;
        }
        g0 g0Var = this.c;
        ((HashMap) g0Var.c).clear();
        Iterator<e0> it = b0Var.f5114i.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yVar = this.f5284m;
            if (!hasNext) {
                break;
            }
            e0 next = it.next();
            if (next != null) {
                Fragment fragment2 = this.H.f5125d.get(next.f5137j);
                if (fragment2 != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment2);
                    }
                    f0Var = new f0(yVar, g0Var, fragment2, next);
                } else {
                    f0Var = new f0(this.f5284m, this.c, this.f5286p.f5263j.getClassLoader(), H(), next);
                }
                Fragment fragment3 = f0Var.c;
                fragment3.f5052z = this;
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment3.f5040m + "): " + fragment3);
                }
                f0Var.m(this.f5286p.f5263j.getClassLoader());
                g0Var.i(f0Var);
                f0Var.f5154e = this.f5285o;
            }
        }
        c0 c0Var = this.H;
        c0Var.getClass();
        Iterator it2 = new ArrayList(c0Var.f5125d.values()).iterator();
        while (true) {
            i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Fragment fragment4 = (Fragment) it2.next();
            if (((HashMap) g0Var.c).get(fragment4.f5040m) != null) {
                i10 = 1;
            }
            if (i10 == 0) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment4 + " that was not found in the set of active Fragments " + b0Var.f5114i);
                }
                this.H.d(fragment4);
                fragment4.f5052z = this;
                f0 f0Var2 = new f0(yVar, g0Var, fragment4);
                f0Var2.f5154e = 1;
                f0Var2.k();
                fragment4.f5046t = true;
                f0Var2.k();
            }
        }
        ArrayList<String> arrayList = b0Var.f5115j;
        ((ArrayList) g0Var.f5159b).clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                Fragment c10 = g0Var.c(str);
                if (c10 != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + c10);
                    }
                    g0Var.a(c10);
                } else {
                    throw new IllegalStateException(a4.b.m("No instantiated fragment for (", str, ")"));
                }
            }
        }
        if (b0Var.f5116k != null) {
            this.f5275d = new ArrayList<>(b0Var.f5116k.length);
            int i11 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = b0Var.f5116k;
                if (i11 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i11];
                bVar.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = bVar.f5101i;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    h0.a aVar2 = new h0.a();
                    int i14 = i12 + 1;
                    aVar2.f5178a = iArr[i12];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i13 + " base fragment #" + iArr[i14]);
                    }
                    String str2 = bVar.f5102j.get(i13);
                    if (str2 != null) {
                        fragment = C(str2);
                    } else {
                        fragment = null;
                    }
                    aVar2.f5179b = fragment;
                    aVar2.f5183g = Lifecycle.State.values()[bVar.f5103k[i13]];
                    aVar2.f5184h = Lifecycle.State.values()[bVar.f5104l[i13]];
                    int i15 = i14 + 1;
                    int i16 = iArr[i14];
                    aVar2.c = i16;
                    int i17 = i15 + 1;
                    int i18 = iArr[i15];
                    aVar2.f5180d = i18;
                    int i19 = i17 + 1;
                    int i20 = iArr[i17];
                    aVar2.f5181e = i20;
                    int i21 = iArr[i19];
                    aVar2.f5182f = i21;
                    aVar.f5165b = i16;
                    aVar.c = i18;
                    aVar.f5166d = i20;
                    aVar.f5167e = i21;
                    aVar.b(aVar2);
                    i13++;
                    i12 = i19 + 1;
                }
                aVar.f5168f = bVar.f5105m;
                aVar.f5171i = bVar.n;
                aVar.f5100s = bVar.f5106o;
                aVar.f5169g = true;
                aVar.f5172j = bVar.f5107p;
                aVar.f5173k = bVar.f5108q;
                aVar.f5174l = bVar.f5109r;
                aVar.f5175m = bVar.f5110s;
                aVar.n = bVar.f5111t;
                aVar.f5176o = bVar.f5112u;
                aVar.f5177p = bVar.f5113v;
                aVar.c(1);
                if (K(2)) {
                    StringBuilder o10 = a4.b.o("restoreAllState: back stack #", i11, " (index ");
                    o10.append(aVar.f5100s);
                    o10.append("): ");
                    o10.append(aVar);
                    Log.v("FragmentManager", o10.toString());
                    PrintWriter printWriter = new PrintWriter(new p0());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f5275d.add(aVar);
                i11++;
            }
        } else {
            this.f5275d = null;
        }
        this.f5280i.set(b0Var.f5117l);
        String str3 = b0Var.f5118m;
        if (str3 != null) {
            Fragment C = C(str3);
            this.f5289s = C;
            q(C);
        }
        ArrayList<String> arrayList2 = b0Var.n;
        if (arrayList2 != null) {
            while (i10 < arrayList2.size()) {
                Bundle bundle = b0Var.f5119o.get(i10);
                bundle.setClassLoader(this.f5286p.f5263j.getClassLoader());
                this.f5281j.put(arrayList2.get(i10), bundle);
                i10++;
            }
        }
        this.f5295y = new ArrayDeque<>(b0Var.f5120p);
    }

    public final b0 W() {
        ArrayList<String> arrayList;
        int size;
        F();
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
        y(true);
        this.A = true;
        this.H.f5130i = true;
        g0 g0Var = this.c;
        g0Var.getClass();
        HashMap hashMap = (HashMap) g0Var.c;
        ArrayList<e0> arrayList2 = new ArrayList<>(hashMap.size());
        for (f0 f0Var : hashMap.values()) {
            if (f0Var != null) {
                Fragment fragment = f0Var.c;
                e0 e0Var = new e0(fragment);
                if (fragment.f5036i > -1 && e0Var.f5147u == null) {
                    Bundle o10 = f0Var.o();
                    e0Var.f5147u = o10;
                    if (fragment.f5042p != null) {
                        if (o10 == null) {
                            e0Var.f5147u = new Bundle();
                        }
                        e0Var.f5147u.putString("android:target_state", fragment.f5042p);
                        int i10 = fragment.f5043q;
                        if (i10 != 0) {
                            e0Var.f5147u.putInt("android:target_req_state", i10);
                        }
                    }
                } else {
                    e0Var.f5147u = fragment.f5037j;
                }
                arrayList2.add(e0Var);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragment + ": " + e0Var.f5147u);
                }
            }
        }
        androidx.fragment.app.b[] bVarArr = null;
        if (arrayList2.isEmpty()) {
            if (K(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        g0 g0Var2 = this.c;
        synchronized (((ArrayList) g0Var2.f5159b)) {
            if (((ArrayList) g0Var2.f5159b).isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList<>(((ArrayList) g0Var2.f5159b).size());
                Iterator it2 = ((ArrayList) g0Var2.f5159b).iterator();
                while (it2.hasNext()) {
                    Fragment fragment2 = (Fragment) it2.next();
                    arrayList.add(fragment2.f5040m);
                    if (K(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment2.f5040m + "): " + fragment2);
                    }
                }
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f5275d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i11 = 0; i11 < size; i11++) {
                bVarArr[i11] = new androidx.fragment.app.b(this.f5275d.get(i11));
                if (K(2)) {
                    StringBuilder o11 = a4.b.o("saveAllState: adding back stack #", i11, ": ");
                    o11.append(this.f5275d.get(i11));
                    Log.v("FragmentManager", o11.toString());
                }
            }
        }
        b0 b0Var = new b0();
        b0Var.f5114i = arrayList2;
        b0Var.f5115j = arrayList;
        b0Var.f5116k = bVarArr;
        b0Var.f5117l = this.f5280i.get();
        Fragment fragment3 = this.f5289s;
        if (fragment3 != null) {
            b0Var.f5118m = fragment3.f5040m;
        }
        b0Var.n.addAll(this.f5281j.keySet());
        b0Var.f5119o.addAll(this.f5281j.values());
        b0Var.f5120p = new ArrayList<>(this.f5295y);
        return b0Var;
    }

    public final void X() {
        synchronized (this.f5273a) {
            try {
                boolean z10 = true;
                if (this.f5273a.size() != 1) {
                    z10 = false;
                }
                if (z10) {
                    this.f5286p.f5264k.removeCallbacks(this.I);
                    this.f5286p.f5264k.post(this.I);
                    f0();
                }
            } finally {
            }
        }
    }

    public final void Y(Fragment fragment, boolean z10) {
        ViewGroup G = G(fragment);
        if (G == null || !(G instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) G).setDrawDisappearingViewsLast(!z10);
    }

    public final void Z(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(C(fragment.f5040m)) && (fragment.A == null || fragment.f5052z == this)) {
            fragment.T = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final f0 a(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        f0 g10 = g(fragment);
        fragment.f5052z = this;
        g0 g0Var = this.c;
        g0Var.i(g10);
        if (!fragment.H) {
            g0Var.a(fragment);
            fragment.f5046t = false;
            if (fragment.M == null) {
                fragment.Q = false;
            }
            if (L(fragment)) {
                this.f5296z = true;
            }
        }
        return g10;
    }

    public final void a0(Fragment fragment) {
        if (fragment != null && (!fragment.equals(C(fragment.f5040m)) || (fragment.A != null && fragment.f5052z != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.f5289s;
        this.f5289s = fragment;
        q(fragment2);
        q(this.f5289s);
    }

    public final void b(d0 d0Var) {
        this.n.add(d0Var);
    }

    public final void b0(Fragment fragment) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup G = G(fragment);
        if (G != null) {
            Fragment.b bVar = fragment.P;
            boolean z10 = false;
            if (bVar == null) {
                i10 = 0;
            } else {
                i10 = bVar.f5056b;
            }
            if (bVar == null) {
                i11 = 0;
            } else {
                i11 = bVar.c;
            }
            int i14 = i11 + i10;
            if (bVar == null) {
                i12 = 0;
            } else {
                i12 = bVar.f5057d;
            }
            int i15 = i12 + i14;
            if (bVar == null) {
                i13 = 0;
            } else {
                i13 = bVar.f5058e;
            }
            if (i13 + i15 > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, fragment);
                }
                Fragment fragment2 = (Fragment) G.getTag(R.id.visible_removing_fragment_view_tag);
                Fragment.b bVar2 = fragment.P;
                if (bVar2 != null) {
                    z10 = bVar2.f5055a;
                }
                if (fragment2.P != null) {
                    fragment2.b().f5055a = z10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"SyntheticAccessor"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(w<?> wVar, androidx.datastore.preferences.protobuf.k kVar, Fragment fragment) {
        d0 d0Var;
        c0 c0Var;
        w<?> wVar2;
        String str;
        if (this.f5286p == null) {
            this.f5286p = wVar;
            this.f5287q = kVar;
            this.f5288r = fragment;
            if (fragment != null) {
                d0Var = new h(fragment);
            } else {
                if (wVar instanceof d0) {
                    d0Var = (d0) wVar;
                }
                if (this.f5288r != null) {
                    f0();
                }
                if (wVar instanceof androidx.activity.m) {
                    androidx.activity.m mVar = (androidx.activity.m) wVar;
                    OnBackPressedDispatcher d5 = mVar.d();
                    this.f5278g = d5;
                    androidx.lifecycle.q qVar = mVar;
                    if (fragment != null) {
                        qVar = fragment;
                    }
                    d5.a(qVar, this.f5279h);
                }
                if (fragment == null) {
                    c0 c0Var2 = fragment.f5052z.H;
                    HashMap<String, c0> hashMap = c0Var2.f5126e;
                    c0 c0Var3 = hashMap.get(fragment.f5040m);
                    if (c0Var3 == null) {
                        c0Var3 = new c0(c0Var2.f5128g);
                        hashMap.put(fragment.f5040m, c0Var3);
                    }
                    this.H = c0Var3;
                } else {
                    if (wVar instanceof androidx.lifecycle.n0) {
                        c0Var = (c0) new androidx.lifecycle.k0(((androidx.lifecycle.n0) wVar).X(), c0.f5124j).a(c0.class);
                    } else {
                        c0Var = new c0(false);
                    }
                    this.H = c0Var;
                }
                this.H.f5130i = O();
                this.c.f5160d = this.H;
                wVar2 = this.f5286p;
                if (!(wVar2 instanceof androidx.activity.result.g)) {
                    androidx.activity.result.f P = ((androidx.activity.result.g) wVar2).P();
                    if (fragment != null) {
                        str = androidx.activity.e.k(new StringBuilder(), fragment.f5040m, ":");
                    } else {
                        str = "";
                    }
                    String str2 = "FragmentManager:" + str;
                    this.f5292v = P.d(a4.b.l(str2, "StartActivityForResult"), new b.f(), new i());
                    this.f5293w = P.d(a4.b.l(str2, "StartIntentSenderForResult"), new j(), new a());
                    this.f5294x = P.d(a4.b.l(str2, "RequestPermissions"), new b.d(), new b());
                    return;
                }
                return;
            }
            b(d0Var);
            if (this.f5288r != null) {
            }
            if (wVar instanceof androidx.activity.m) {
            }
            if (fragment == null) {
            }
            this.H.f5130i = O();
            this.c.f5160d = this.H;
            wVar2 = this.f5286p;
            if (!(wVar2 instanceof androidx.activity.result.g)) {
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public final void d(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.H) {
            fragment.H = false;
            if (fragment.f5045s) {
                return;
            }
            this.c.a(fragment);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (L(fragment)) {
                this.f5296z = true;
            }
        }
    }

    public final void d0() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            Fragment fragment = f0Var.c;
            if (fragment.N) {
                if (this.f5274b) {
                    this.D = true;
                } else {
                    fragment.N = false;
                    f0Var.k();
                }
            }
        }
    }

    public final void e() {
        this.f5274b = false;
        this.F.clear();
        this.E.clear();
    }

    public final void e0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new p0());
        w<?> wVar = this.f5286p;
        try {
            if (wVar != null) {
                wVar.L0(printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
        }
        throw illegalStateException;
    }

    public final HashSet f() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((f0) it.next()).c.L;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.f(viewGroup, I()));
            }
        }
        return hashSet;
    }

    public final void f0() {
        int i10;
        synchronized (this.f5273a) {
            boolean z10 = true;
            if (!this.f5273a.isEmpty()) {
                this.f5279h.b(true);
                return;
            }
            c cVar = this.f5279h;
            ArrayList<androidx.fragment.app.a> arrayList = this.f5275d;
            if (arrayList != null) {
                i10 = arrayList.size();
            } else {
                i10 = 0;
            }
            if (i10 <= 0 || !N(this.f5288r)) {
                z10 = false;
            }
            cVar.b(z10);
        }
    }

    public final f0 g(Fragment fragment) {
        String str = fragment.f5040m;
        g0 g0Var = this.c;
        f0 g10 = g0Var.g(str);
        if (g10 != null) {
            return g10;
        }
        f0 f0Var = new f0(this.f5284m, g0Var, fragment);
        f0Var.m(this.f5286p.f5263j.getClassLoader());
        f0Var.f5154e = this.f5285o;
        return f0Var;
    }

    public final void h(Fragment fragment) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.H) {
            fragment.H = true;
            if (fragment.f5045s) {
                if (K(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                g0 g0Var = this.c;
                synchronized (((ArrayList) g0Var.f5159b)) {
                    ((ArrayList) g0Var.f5159b).remove(fragment);
                }
                fragment.f5045s = false;
                if (L(fragment)) {
                    this.f5296z = true;
                }
                b0(fragment);
            }
        }
    }

    public final void i(Configuration configuration) {
        for (Fragment fragment : this.c.h()) {
            if (fragment != null) {
                fragment.onConfigurationChanged(configuration);
                fragment.B.i(configuration);
            }
        }
    }

    public final boolean j() {
        boolean z10;
        if (this.f5285o < 1) {
            return false;
        }
        for (Fragment fragment : this.c.h()) {
            if (fragment != null) {
                if (!fragment.G) {
                    z10 = fragment.B.j();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z10;
        if (this.f5285o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z11 = false;
        for (Fragment fragment : this.c.h()) {
            if (fragment != null && M(fragment)) {
                if (!fragment.G) {
                    z10 = fragment.B.k() | false;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z11 = true;
                }
            }
        }
        if (this.f5276e != null) {
            for (int i10 = 0; i10 < this.f5276e.size(); i10++) {
                Fragment fragment2 = this.f5276e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.getClass();
                }
            }
        }
        this.f5276e = arrayList;
        return z11;
    }

    public final void l() {
        this.C = true;
        y(true);
        Iterator it = f().iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
        t(-1);
        this.f5286p = null;
        this.f5287q = null;
        this.f5288r = null;
        if (this.f5278g != null) {
            Iterator<androidx.activity.a> it2 = this.f5279h.f463b.iterator();
            while (it2.hasNext()) {
                it2.next().cancel();
            }
            this.f5278g = null;
        }
        androidx.activity.result.e eVar = this.f5292v;
        if (eVar != null) {
            eVar.b();
            this.f5293w.b();
            this.f5294x.b();
        }
    }

    public final void m() {
        for (Fragment fragment : this.c.h()) {
            if (fragment != null) {
                fragment.M();
            }
        }
    }

    public final void n(boolean z10) {
        for (Fragment fragment : this.c.h()) {
            if (fragment != null) {
                fragment.N(z10);
            }
        }
    }

    public final boolean o() {
        boolean z10;
        if (this.f5285o < 1) {
            return false;
        }
        for (Fragment fragment : this.c.h()) {
            if (fragment != null) {
                if (!fragment.G) {
                    z10 = fragment.B.o();
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f5285o < 1) {
            return;
        }
        for (Fragment fragment : this.c.h()) {
            if (fragment != null && !fragment.G) {
                fragment.B.p();
            }
        }
    }

    public final void q(Fragment fragment) {
        if (fragment != null && fragment.equals(C(fragment.f5040m))) {
            fragment.f5052z.getClass();
            boolean N = N(fragment);
            Boolean bool = fragment.f5044r;
            if (bool == null || bool.booleanValue() != N) {
                fragment.f5044r = Boolean.valueOf(N);
                fragment.D(N);
                a0 a0Var = fragment.B;
                a0Var.f0();
                a0Var.q(a0Var.f5289s);
            }
        }
    }

    public final void r(boolean z10) {
        for (Fragment fragment : this.c.h()) {
            if (fragment != null) {
                fragment.O(z10);
            }
        }
    }

    public final boolean s() {
        boolean z10 = false;
        if (this.f5285o < 1) {
            return false;
        }
        for (Fragment fragment : this.c.h()) {
            if (fragment != null && M(fragment) && fragment.P()) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void t(int i10) {
        try {
            this.f5274b = true;
            for (f0 f0Var : ((HashMap) this.c.c).values()) {
                if (f0Var != null) {
                    f0Var.f5154e = i10;
                }
            }
            P(i10, false);
            Iterator it = f().iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).e();
            }
            this.f5274b = false;
            y(true);
        } catch (Throwable th) {
            this.f5274b = false;
            throw th;
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f5288r;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f5288r;
        } else {
            w<?> wVar = this.f5286p;
            if (wVar == null) {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
            sb.append(wVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f5286p;
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.D) {
            this.D = false;
            d0();
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String l2 = a4.b.l(str, "    ");
        g0 g0Var = this.c;
        g0Var.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) g0Var.c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (f0 f0Var : hashMap.values()) {
                printWriter.print(str);
                if (f0Var != null) {
                    Fragment fragment = f0Var.c;
                    printWriter.println(fragment);
                    fragment.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.D));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.E));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.F);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f5036i);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.f5040m);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.f5051y);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.f5045s);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.f5046t);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.f5047u);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.f5048v);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.G);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.H);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.J);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.I);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.O);
                    if (fragment.f5052z != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.f5052z);
                    }
                    if (fragment.A != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.A);
                    }
                    if (fragment.C != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.C);
                    }
                    if (fragment.n != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.n);
                    }
                    if (fragment.f5037j != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f5037j);
                    }
                    if (fragment.f5038k != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.f5038k);
                    }
                    if (fragment.f5039l != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(fragment.f5039l);
                    }
                    Object obj = fragment.f5041o;
                    if (obj == null) {
                        z zVar = fragment.f5052z;
                        obj = (zVar == null || (str2 = fragment.f5042p) == null) ? null : zVar.C(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.f5043q);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    Fragment.b bVar = fragment.P;
                    printWriter.println(bVar == null ? false : bVar.f5055a);
                    Fragment.b bVar2 = fragment.P;
                    if ((bVar2 == null ? 0 : bVar2.f5056b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        Fragment.b bVar3 = fragment.P;
                        printWriter.println(bVar3 == null ? 0 : bVar3.f5056b);
                    }
                    Fragment.b bVar4 = fragment.P;
                    if ((bVar4 == null ? 0 : bVar4.c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        Fragment.b bVar5 = fragment.P;
                        printWriter.println(bVar5 == null ? 0 : bVar5.c);
                    }
                    Fragment.b bVar6 = fragment.P;
                    if ((bVar6 == null ? 0 : bVar6.f5057d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        Fragment.b bVar7 = fragment.P;
                        printWriter.println(bVar7 == null ? 0 : bVar7.f5057d);
                    }
                    Fragment.b bVar8 = fragment.P;
                    if ((bVar8 == null ? 0 : bVar8.f5058e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        Fragment.b bVar9 = fragment.P;
                        printWriter.println(bVar9 == null ? 0 : bVar9.f5058e);
                    }
                    if (fragment.L != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.L);
                    }
                    if (fragment.M != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(fragment.M);
                    }
                    Fragment.b bVar10 = fragment.P;
                    if (bVar10 != null) {
                        bVar10.getClass();
                    }
                    if (fragment.j() != null) {
                        new u3.a(fragment, fragment.X()).L0(str3, printWriter);
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + fragment.B + ":");
                    fragment.B.v(a4.b.l(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) g0Var.f5159b;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((Fragment) arrayList.get(i10)).toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f5276e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(this.f5276e.get(i11).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f5275d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.a aVar = this.f5275d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(l2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f5280i.get());
        synchronized (this.f5273a) {
            int size4 = this.f5273a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i13 = 0; i13 < size4; i13++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i13);
                    printWriter.print(": ");
                    printWriter.println((m) this.f5273a.get(i13));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f5286p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f5287q);
        if (this.f5288r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f5288r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f5285o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.f5296z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f5296z);
        }
    }

    public final void w(m mVar, boolean z10) {
        if (!z10) {
            if (this.f5286p == null) {
                if (this.C) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (O()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f5273a) {
            if (this.f5286p == null) {
                if (z10) {
                    return;
                }
                throw new IllegalStateException("Activity has been destroyed");
            }
            this.f5273a.add(mVar);
            X();
        }
    }

    public final void x(boolean z10) {
        if (!this.f5274b) {
            if (this.f5286p == null) {
                if (this.C) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f5286p.f5264k.getLooper()) {
                if (!z10 && O()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.E == null) {
                    this.E = new ArrayList<>();
                    this.F = new ArrayList<>();
                }
                this.f5274b = false;
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public final boolean y(boolean z10) {
        boolean z11;
        x(z10);
        boolean z12 = false;
        while (true) {
            ArrayList<androidx.fragment.app.a> arrayList = this.E;
            ArrayList<Boolean> arrayList2 = this.F;
            synchronized (this.f5273a) {
                if (this.f5273a.isEmpty()) {
                    z11 = false;
                } else {
                    int size = this.f5273a.size();
                    z11 = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        z11 |= this.f5273a.get(i10).a(arrayList, arrayList2);
                    }
                    this.f5273a.clear();
                    this.f5286p.f5264k.removeCallbacks(this.I);
                }
            }
            if (z11) {
                z12 = true;
                this.f5274b = true;
                try {
                    U(this.E, this.F);
                    e();
                } catch (Throwable th) {
                    e();
                    throw th;
                }
            } else {
                f0();
                u();
                this.c.b();
                return z12;
            }
        }
    }

    public final void z(m mVar, boolean z10) {
        if (z10 && (this.f5286p == null || this.C)) {
            return;
        }
        x(z10);
        if (mVar.a(this.E, this.F)) {
            this.f5274b = true;
            try {
                U(this.E, this.F);
                e();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
        f0();
        u();
        this.c.b();
    }
}
