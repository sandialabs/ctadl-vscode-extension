package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.g0;
import androidx.navigation.l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class n {

    /* renamed from: i  reason: collision with root package name */
    public final String f5509i;

    /* renamed from: j  reason: collision with root package name */
    public p f5510j;

    /* renamed from: k  reason: collision with root package name */
    public int f5511k;

    /* renamed from: l  reason: collision with root package name */
    public String f5512l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f5513m;
    public ArrayList<l> n;

    /* renamed from: o  reason: collision with root package name */
    public p.i<d> f5514o;

    /* renamed from: p  reason: collision with root package name */
    public HashMap<String, h> f5515p;

    /* loaded from: classes.dex */
    public static class a implements Comparable<a> {

        /* renamed from: i  reason: collision with root package name */
        public final n f5516i;

        /* renamed from: j  reason: collision with root package name */
        public final Bundle f5517j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f5518k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f5519l;

        /* renamed from: m  reason: collision with root package name */
        public final int f5520m;

        public a(n nVar, Bundle bundle, boolean z10, boolean z11, int i10) {
            this.f5516i = nVar;
            this.f5517j = bundle;
            this.f5518k = z10;
            this.f5519l = z11;
            this.f5520m = i10;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public final int compareTo(a aVar) {
            boolean z10 = this.f5518k;
            if (!z10 || aVar.f5518k) {
                if (z10 || !aVar.f5518k) {
                    Bundle bundle = this.f5517j;
                    if (bundle == null || aVar.f5517j != null) {
                        if (bundle != null || aVar.f5517j == null) {
                            if (bundle != null) {
                                int size = bundle.size() - aVar.f5517j.size();
                                if (size > 0) {
                                    return 1;
                                }
                                if (size < 0) {
                                    return -1;
                                }
                            }
                            boolean z11 = this.f5519l;
                            if (!z11 || aVar.f5519l) {
                                if (z11 || !aVar.f5519l) {
                                    return this.f5520m - aVar.f5520m;
                                }
                                return -1;
                            }
                            return 1;
                        }
                        return -1;
                    }
                    return 1;
                }
                return -1;
            }
            return 1;
        }
    }

    static {
        new HashMap();
    }

    public n(x<? extends n> xVar) {
        this(y.b(xVar.getClass()));
    }

    public n(String str) {
        this.f5509i = str;
    }

    public static String h(Context context, int i10) {
        if (i10 <= 16777215) {
            return Integer.toString(i10);
        }
        try {
            return context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[LOOP:1: B:21:0x0054->B:34:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle c(Bundle bundle) {
        boolean z10;
        HashMap<String, h> hashMap;
        if (bundle == null && ((hashMap = this.f5515p) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, h> hashMap2 = this.f5515p;
        if (hashMap2 != null) {
            for (Map.Entry<String, h> entry : hashMap2.entrySet()) {
                h value = entry.getValue();
                String key = entry.getKey();
                if (value.c) {
                    value.f5475a.d(bundle2, key, value.f5477d);
                }
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, h> hashMap3 = this.f5515p;
            if (hashMap3 != null) {
                for (Map.Entry<String, h> entry2 : hashMap3.entrySet()) {
                    h value2 = entry2.getValue();
                    String key2 = entry2.getKey();
                    if (value2.f5476b || !bundle2.containsKey(key2) || bundle2.get(key2) != null) {
                        try {
                            value2.f5475a.a(key2, bundle2);
                            z10 = true;
                        } catch (ClassCastException unused) {
                        }
                        if (z10) {
                            throw new IllegalArgumentException("Wrong argument type for '" + entry2.getKey() + "' in argument bundle. " + entry2.getValue().f5475a.b() + " expected.");
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
            }
        }
        return bundle2;
    }

    public final int[] d() {
        ArrayDeque arrayDeque = new ArrayDeque();
        p pVar = this;
        while (true) {
            p pVar2 = pVar.f5510j;
            if (pVar2 == null || pVar2.f5522r != pVar.f5511k) {
                arrayDeque.addFirst(pVar);
            }
            if (pVar2 == null) {
                break;
            }
            pVar = pVar2;
        }
        int[] iArr = new int[arrayDeque.size()];
        Iterator it = arrayDeque.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((n) it.next()).f5511k;
            i10++;
        }
        return iArr;
    }

    public final d g(int i10) {
        d dVar;
        p.i<d> iVar = this.f5514o;
        if (iVar == null) {
            dVar = null;
        } else {
            dVar = (d) iVar.e(i10, null);
        }
        if (dVar != null) {
            return dVar;
        }
        p pVar = this.f5510j;
        if (pVar == null) {
            return null;
        }
        return pVar.g(i10);
    }

    public a s(g0 g0Var) {
        Bundle bundle;
        boolean z10;
        int i10;
        int i11;
        Map unmodifiableMap;
        Bundle bundle2;
        Matcher matcher;
        String str;
        HashMap hashMap;
        boolean z11;
        boolean z12;
        ArrayList<l> arrayList = this.n;
        Bundle bundle3 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator<l> it = arrayList.iterator();
        a aVar = null;
        while (it.hasNext()) {
            l next = it.next();
            Uri uri = (Uri) g0Var.f5159b;
            if (uri != null) {
                HashMap<String, h> hashMap2 = this.f5515p;
                if (hashMap2 == null) {
                    unmodifiableMap = Collections.emptyMap();
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(hashMap2);
                }
                next.getClass();
                Matcher matcher2 = next.c.matcher(uri.toString());
                if (!matcher2.matches()) {
                    bundle2 = bundle3;
                } else {
                    bundle2 = new Bundle();
                    ArrayList<String> arrayList2 = next.f5497a;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size) {
                            String str2 = arrayList2.get(i12);
                            i12++;
                            String decode = Uri.decode(matcher2.group(i12));
                            h hVar = (h) unmodifiableMap.get(str2);
                            if (hVar != null) {
                                v vVar = hVar.f5475a;
                                try {
                                    vVar.d(bundle2, str2, vVar.c(decode));
                                } catch (IllegalArgumentException unused) {
                                    z12 = true;
                                }
                            } else {
                                bundle2.putString(str2, decode);
                            }
                            z12 = false;
                            if (z12) {
                                break;
                            }
                        } else if (next.f5500e) {
                            HashMap hashMap3 = next.f5498b;
                            for (String str3 : hashMap3.keySet()) {
                                l.a aVar2 = (l.a) hashMap3.get(str3);
                                String queryParameter = uri.getQueryParameter(str3);
                                if (queryParameter != null) {
                                    matcher = Pattern.compile(aVar2.f5504a).matcher(queryParameter);
                                    if (!matcher.matches()) {
                                    }
                                } else {
                                    matcher = null;
                                }
                                int i13 = 0;
                                while (i13 < aVar2.f5505b.size()) {
                                    if (matcher != null) {
                                        str = Uri.decode(matcher.group(i13 + 1));
                                    } else {
                                        str = null;
                                    }
                                    String str4 = aVar2.f5505b.get(i13);
                                    h hVar2 = (h) unmodifiableMap.get(str4);
                                    Uri uri2 = uri;
                                    if (str != null) {
                                        hashMap = hashMap3;
                                        if (str.replaceAll("[{}]", "").equals(str4)) {
                                            continue;
                                        } else {
                                            if (hVar2 != null) {
                                                v vVar2 = hVar2.f5475a;
                                                try {
                                                    vVar2.d(bundle2, str4, vVar2.c(str));
                                                } catch (IllegalArgumentException unused2) {
                                                    z11 = true;
                                                }
                                            } else {
                                                bundle2.putString(str4, str);
                                            }
                                            z11 = false;
                                            if (z11) {
                                            }
                                        }
                                    } else {
                                        hashMap = hashMap3;
                                    }
                                    i13++;
                                    uri = uri2;
                                    hashMap3 = hashMap;
                                }
                            }
                        }
                    }
                    bundle2 = null;
                }
                bundle = bundle2;
            } else {
                bundle = null;
            }
            String str5 = (String) g0Var.c;
            if (str5 != null && str5.equals(next.f5501f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str6 = (String) g0Var.f5160d;
            if (str6 != null) {
                String str7 = next.f5503h;
                if (str7 != null && next.f5502g.matcher(str6).matches()) {
                    String[] split = str7.split("/", -1);
                    String str8 = split[0];
                    String str9 = split[1];
                    String[] split2 = str6.split("/", -1);
                    String str10 = split2[0];
                    String str11 = split2[1];
                    if (str8.equals(str10)) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    if (str9.equals(str11)) {
                        i11++;
                    }
                    i10 = i11;
                }
                i11 = -1;
                i10 = i11;
            } else {
                i10 = -1;
            }
            if (bundle != null || z10 || i10 > -1) {
                a aVar3 = new a(this, bundle, next.f5499d, z10, i10);
                if (aVar == null || aVar3.compareTo(aVar) > 0) {
                    aVar = aVar3;
                }
            }
            bundle3 = null;
        }
        return aVar;
    }

    public void t(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, ma.i.f16054v);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        this.f5511k = resourceId;
        this.f5512l = null;
        this.f5512l = h(context, resourceId);
        this.f5513m = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f5512l;
        if (str == null) {
            sb.append("0x");
            str = Integer.toHexString(this.f5511k);
        }
        sb.append(str);
        sb.append(")");
        if (this.f5513m != null) {
            sb.append(" label=");
            sb.append(this.f5513m);
        }
        return sb.toString();
    }
}
