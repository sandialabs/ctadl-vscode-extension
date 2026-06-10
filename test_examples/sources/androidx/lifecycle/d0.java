package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import b4.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<? extends Object>[] f5375f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5376a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f5377b;
    public final LinkedHashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f5378d;

    /* renamed from: e  reason: collision with root package name */
    public final b.InterfaceC0053b f5379e;

    /* loaded from: classes.dex */
    public static final class a {
        public static d0 a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                if (bundle2 == null) {
                    return new d0();
                }
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    v7.g.e(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new d0(hashMap);
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
            if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int size = parcelableArrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = parcelableArrayList.get(i10);
                    v7.g.d(obj, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                }
                return new d0(linkedHashMap);
            }
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends v<T> {

        /* renamed from: l  reason: collision with root package name */
        public final String f5380l;

        /* renamed from: m  reason: collision with root package name */
        public d0 f5381m;

        public b(d0 d0Var, String str) {
            this.f5380l = str;
            this.f5381m = d0Var;
        }

        public b(d0 d0Var, String str, T t10) {
            super(t10);
            this.f5380l = str;
            this.f5381m = d0Var;
        }

        @Override // androidx.lifecycle.v, androidx.lifecycle.LiveData
        public final void i(T t10) {
            d0 d0Var = this.f5381m;
            if (d0Var != null) {
                LinkedHashMap linkedHashMap = d0Var.f5376a;
                String str = this.f5380l;
                linkedHashMap.put(str, t10);
                kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) d0Var.f5378d.get(str);
                if (kVar != null) {
                    kVar.setValue(t10);
                }
            }
            super.i(t10);
        }
    }

    public d0() {
        this.f5376a = new LinkedHashMap();
        this.f5377b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.f5378d = new LinkedHashMap();
        this.f5379e = new androidx.activity.c(1, this);
    }

    public d0(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f5376a = linkedHashMap;
        this.f5377b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.f5378d = new LinkedHashMap();
        this.f5379e = new b.InterfaceC0053b() { // from class: androidx.lifecycle.c0
            @Override // b4.b.InterfaceC0053b
            public final Bundle a() {
                return d0.a(d0.this);
            }
        };
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(d0 d0Var) {
        Map K1;
        v7.g.f(d0Var, "this$0");
        LinkedHashMap linkedHashMap = d0Var.f5377b;
        v7.g.f(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        if (size != 0) {
            if (size != 1) {
                K1 = kotlin.collections.d.P1(linkedHashMap);
            } else {
                K1 = m0.b.A1(linkedHashMap);
            }
        } else {
            K1 = kotlin.collections.d.K1();
        }
        for (Map.Entry entry : K1.entrySet()) {
            d0Var.e(((b.InterfaceC0053b) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap2 = d0Var.f5376a;
        Set<String> keySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap2.get(str));
        }
        return a1.b.n(new Pair("keys", arrayList), new Pair("values", arrayList2));
    }

    public final <T> T b(String str) {
        try {
            return (T) this.f5376a.get(str);
        } catch (ClassCastException unused) {
            d(str);
            return null;
        }
    }

    public final <T> v<T> c(String str) {
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(str);
        b bVar = obj instanceof v ? (v) obj : null;
        if (bVar == null) {
            LinkedHashMap linkedHashMap2 = this.f5376a;
            bVar = linkedHashMap2.containsKey(str) ? new b(this, str, linkedHashMap2.get(str)) : new b(this, str);
            linkedHashMap.put(str, bVar);
        }
        return bVar;
    }

    public final void d(String str) {
        this.f5376a.remove(str);
        b bVar = (b) this.c.remove(str);
        if (bVar != null) {
            bVar.f5381m = null;
        }
        this.f5378d.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Object obj, String str) {
        boolean z10;
        v vVar;
        v7.g.f(str, "key");
        if (obj != null) {
            Class<? extends Object>[] clsArr = f5375f;
            z10 = false;
            for (int i10 = 0; i10 < 29; i10++) {
                Class<? extends Object> cls = clsArr[i10];
                v7.g.c(cls);
                if (!cls.isInstance(obj)) {
                }
            }
            if (!z10) {
                Object obj2 = this.c.get(str);
                if (obj2 instanceof v) {
                    vVar = (v) obj2;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    vVar.i(obj);
                } else {
                    this.f5376a.put(str, obj);
                }
                kotlinx.coroutines.flow.k kVar = (kotlinx.coroutines.flow.k) this.f5378d.get(str);
                if (kVar != null) {
                    kVar.setValue(obj);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("Can't put value with type ");
            v7.g.c(obj);
            sb.append(obj.getClass());
            sb.append(" into saved state");
            throw new IllegalArgumentException(sb.toString());
        }
        z10 = true;
        if (!z10) {
        }
    }
}
