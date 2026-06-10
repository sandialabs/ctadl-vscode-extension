package androidx.activity;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.k1;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.platform.b1;
import androidx.compose.ui.platform.p;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import androidx.lifecycle.z;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import l1.a0;
import m7.n;
import p.g;
import p1.o;
import y3.f;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f449i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f450j;

    public /* synthetic */ b(int i10, Object obj) {
        this.f449i = i10;
        this.f450j = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x04b0, code lost:
        if (r6 == null) goto L216;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cf  */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r4v53, types: [p1.a] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.Collection, java.util.Set, java.util.LinkedHashSet] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        androidx.appcompat.view.menu.h hVar;
        SemanticsNode semanticsNode;
        String str;
        o1.j jVar;
        SemanticsNode semanticsNode2;
        boolean z10;
        androidx.compose.ui.semantics.a<?> key;
        androidx.compose.ui.semantics.a<String> aVar;
        boolean a10;
        AndroidComposeViewAccessibilityDelegateCompat.f fVar;
        Map<Integer, b1> map;
        ArrayList arrayList;
        boolean a11;
        boolean z11;
        int i10;
        SemanticsNode semanticsNode3;
        int i11;
        String str2;
        ArrayList arrayList2;
        int y10;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z12;
        String str3;
        String str4;
        Object obj = this.f450j;
        SemanticsNode semanticsNode4 = null;
        switch (this.f449i) {
            case 0:
                ((ComponentActivity) obj).invalidateOptionsMenu();
                return;
            case 1:
                h.a((h) obj);
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                ((OnBackPressedDispatcher) obj).b();
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                Toolbar.f fVar2 = ((Toolbar) obj).U;
                if (fVar2 == null) {
                    hVar = null;
                } else {
                    hVar = fVar2.f817j;
                }
                if (hVar != null) {
                    hVar.collapseActionView();
                    return;
                }
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                ((k1) obj).c(false);
                return;
            case 5:
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) obj;
                int[] iArr = AndroidComposeViewAccessibilityDelegateCompat.f3610z;
                v7.g.f(androidComposeViewAccessibilityDelegateCompat, "this$0");
                int i16 = a0.f15727a;
                AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.f3611d;
                androidComposeView.E(true);
                androidComposeViewAccessibilityDelegateCompat.F(androidComposeView.getSemanticsOwner().a(), androidComposeViewAccessibilityDelegateCompat.f3627u);
                Map<Integer, b1> p10 = androidComposeViewAccessibilityDelegateCompat.p();
                v7.g.f(p10, "newSemanticsNodes");
                ArrayList arrayList3 = androidComposeViewAccessibilityDelegateCompat.f3630x;
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList3.clear();
                Iterator<Integer> it = p10.keySet().iterator();
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
                while (true) {
                    boolean hasNext = it.hasNext();
                    LinkedHashMap linkedHashMap = androidComposeViewAccessibilityDelegateCompat2.f3626t;
                    if (hasNext) {
                        int intValue = it.next().intValue();
                        AndroidComposeViewAccessibilityDelegateCompat.f fVar3 = (AndroidComposeViewAccessibilityDelegateCompat.f) linkedHashMap.get(Integer.valueOf(intValue));
                        if (fVar3 != null) {
                            b1 b1Var = p10.get(Integer.valueOf(intValue));
                            if (b1Var != null) {
                                semanticsNode2 = b1Var.f3831a;
                            } else {
                                semanticsNode2 = semanticsNode4;
                            }
                            v7.g.c(semanticsNode2);
                            o1.j jVar2 = semanticsNode2.f3939f;
                            Iterator<Map.Entry<? extends androidx.compose.ui.semantics.a<?>, ? extends Object>> it2 = jVar2.iterator();
                            boolean z13 = false;
                            while (true) {
                                boolean hasNext2 = it2.hasNext();
                                o1.j jVar3 = fVar3.f3644a;
                                if (hasNext2) {
                                    Map.Entry<? extends androidx.compose.ui.semantics.a<?>, ? extends Object> next = it2.next();
                                    androidx.compose.ui.semantics.a<?> key2 = next.getKey();
                                    androidx.compose.ui.semantics.a<o1.h> aVar2 = SemanticsProperties.f3957m;
                                    if (!v7.g.a(key2, aVar2) && !v7.g.a(next.getKey(), SemanticsProperties.n)) {
                                        z10 = false;
                                        if (!z10 || !v7.g.a(next.getValue(), SemanticsConfigurationKt.a(jVar3, next.getKey()))) {
                                            key = next.getKey();
                                            aVar = SemanticsProperties.f3948d;
                                            if (!v7.g.a(key, aVar)) {
                                                Object value = next.getValue();
                                                v7.g.d(value, "null cannot be cast to non-null type kotlin.String");
                                                String str5 = (String) value;
                                                if (jVar3.d(aVar)) {
                                                    androidComposeViewAccessibilityDelegateCompat2.C(intValue, 8, str5);
                                                }
                                            } else {
                                                if (v7.g.a(key, SemanticsProperties.f3947b)) {
                                                    a10 = true;
                                                } else {
                                                    a10 = v7.g.a(key, SemanticsProperties.f3964u);
                                                }
                                                if (!a10 && !v7.g.a(key, SemanticsProperties.c)) {
                                                    androidx.compose.ui.semantics.a<Boolean> aVar3 = SemanticsProperties.f3963t;
                                                    if (v7.g.a(key, aVar3)) {
                                                        o1.g gVar = (o1.g) SemanticsConfigurationKt.a(semanticsNode2.f(), SemanticsProperties.f3958o);
                                                        if (gVar != null && gVar.f16190a == 4) {
                                                            z12 = true;
                                                            if (z12) {
                                                                if (v7.g.a(SemanticsConfigurationKt.a(semanticsNode2.f(), aVar3), Boolean.TRUE)) {
                                                                    AccessibilityEvent l2 = androidComposeViewAccessibilityDelegateCompat2.l(androidComposeViewAccessibilityDelegateCompat2.y(intValue), 4);
                                                                    SemanticsNode semanticsNode5 = new SemanticsNode(semanticsNode2.f3935a, true);
                                                                    List list = (List) SemanticsConfigurationKt.a(semanticsNode5.f(), SemanticsProperties.f3946a);
                                                                    if (list != null) {
                                                                        str3 = a1.c.s0(list);
                                                                    } else {
                                                                        str3 = null;
                                                                    }
                                                                    List list2 = (List) SemanticsConfigurationKt.a(semanticsNode5.f(), SemanticsProperties.f3960q);
                                                                    if (list2 != null) {
                                                                        str4 = a1.c.s0(list2);
                                                                    } else {
                                                                        str4 = null;
                                                                    }
                                                                    if (str3 != null) {
                                                                        l2.setContentDescription(str3);
                                                                        n nVar = n.f16010a;
                                                                    }
                                                                    if (str4 != null) {
                                                                        l2.getText().add(str4);
                                                                    }
                                                                    androidComposeViewAccessibilityDelegateCompat2.z(l2);
                                                                } else {
                                                                    y10 = androidComposeViewAccessibilityDelegateCompat2.y(intValue);
                                                                    i12 = 0;
                                                                    fVar = fVar3;
                                                                    arrayList2 = arrayList3;
                                                                    map = p10;
                                                                    i14 = 2048;
                                                                    i15 = 8;
                                                                    AndroidComposeViewAccessibilityDelegateCompat.B(androidComposeViewAccessibilityDelegateCompat, y10, i14, i12, i15);
                                                                }
                                                            }
                                                        }
                                                        z12 = false;
                                                        if (z12) {
                                                        }
                                                    } else if (v7.g.a(key, SemanticsProperties.f3946a)) {
                                                        int y11 = androidComposeViewAccessibilityDelegateCompat2.y(intValue);
                                                        Object value2 = next.getValue();
                                                        v7.g.d(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                        androidComposeViewAccessibilityDelegateCompat2.A(y11, 2048, 4, (List) value2);
                                                    } else {
                                                        String str6 = "";
                                                        if (v7.g.a(key, SemanticsProperties.f3961r)) {
                                                            if (p.f(semanticsNode2)) {
                                                                androidComposeViewAccessibilityDelegateCompat2.getClass();
                                                                p1.a r3 = AndroidComposeViewAccessibilityDelegateCompat.r(jVar3);
                                                                if (r3 == null) {
                                                                    r3 = "";
                                                                }
                                                                ?? r10 = AndroidComposeViewAccessibilityDelegateCompat.r(jVar2);
                                                                if (r10 != 0) {
                                                                    str6 = r10;
                                                                }
                                                                int length = r3.length();
                                                                int length2 = str6.length();
                                                                if (length > length2) {
                                                                    i13 = length2;
                                                                } else {
                                                                    i13 = length;
                                                                }
                                                                fVar = fVar3;
                                                                int i17 = 0;
                                                                while (true) {
                                                                    arrayList2 = arrayList3;
                                                                    if (i17 < i13) {
                                                                        map = p10;
                                                                        if (r3.charAt(i17) == str6.charAt(i17)) {
                                                                            i17++;
                                                                            arrayList3 = arrayList2;
                                                                            p10 = map;
                                                                        }
                                                                    } else {
                                                                        map = p10;
                                                                    }
                                                                }
                                                                int i18 = 0;
                                                                while (i18 < i13 - i17) {
                                                                    int i19 = i13;
                                                                    if (r3.charAt((length - 1) - i18) == str6.charAt((length2 - 1) - i18)) {
                                                                        i18++;
                                                                        i13 = i19;
                                                                    } else {
                                                                        AccessibilityEvent l4 = androidComposeViewAccessibilityDelegateCompat2.l(androidComposeViewAccessibilityDelegateCompat2.y(intValue), 16);
                                                                        l4.setFromIndex(i17);
                                                                        l4.setRemovedCount((length - i18) - i17);
                                                                        l4.setAddedCount((length2 - i18) - i17);
                                                                        l4.setBeforeText(r3);
                                                                        l4.getText().add(AndroidComposeViewAccessibilityDelegateCompat.I(str6));
                                                                        androidComposeViewAccessibilityDelegateCompat2.z(l4);
                                                                    }
                                                                }
                                                                AccessibilityEvent l42 = androidComposeViewAccessibilityDelegateCompat2.l(androidComposeViewAccessibilityDelegateCompat2.y(intValue), 16);
                                                                l42.setFromIndex(i17);
                                                                l42.setRemovedCount((length - i18) - i17);
                                                                l42.setAddedCount((length2 - i18) - i17);
                                                                l42.setBeforeText(r3);
                                                                l42.getText().add(AndroidComposeViewAccessibilityDelegateCompat.I(str6));
                                                                androidComposeViewAccessibilityDelegateCompat2.z(l42);
                                                            } else {
                                                                fVar = fVar3;
                                                                arrayList2 = arrayList3;
                                                                map = p10;
                                                                y10 = androidComposeViewAccessibilityDelegateCompat2.y(intValue);
                                                                i12 = 2;
                                                                i14 = 2048;
                                                                i15 = 8;
                                                                AndroidComposeViewAccessibilityDelegateCompat.B(androidComposeViewAccessibilityDelegateCompat, y10, i14, i12, i15);
                                                            }
                                                        } else {
                                                            fVar = fVar3;
                                                            ArrayList arrayList5 = arrayList3;
                                                            map = p10;
                                                            androidx.compose.ui.semantics.a<o> aVar4 = SemanticsProperties.f3962s;
                                                            boolean a12 = v7.g.a(key, aVar4);
                                                            int i20 = semanticsNode2.f3940g;
                                                            if (a12) {
                                                                androidComposeViewAccessibilityDelegateCompat2.getClass();
                                                                p1.a r11 = AndroidComposeViewAccessibilityDelegateCompat.r(jVar2);
                                                                if (r11 != null && (str2 = r11.f16641i) != null) {
                                                                    str6 = str2;
                                                                }
                                                                int y12 = androidComposeViewAccessibilityDelegateCompat2.y(intValue);
                                                                long j2 = ((o) jVar2.g(aVar4)).f16702a;
                                                                semanticsNode3 = semanticsNode2;
                                                                i11 = intValue;
                                                                arrayList = arrayList5;
                                                                androidComposeViewAccessibilityDelegateCompat.z(androidComposeViewAccessibilityDelegateCompat.m(y12, Integer.valueOf((int) (j2 >> 32)), Integer.valueOf(o.a(j2)), Integer.valueOf(str6.length()), (String) AndroidComposeViewAccessibilityDelegateCompat.I(str6)));
                                                                androidComposeViewAccessibilityDelegateCompat.D(i20);
                                                                androidComposeViewAccessibilityDelegateCompat2 = androidComposeViewAccessibilityDelegateCompat;
                                                                semanticsNode2 = semanticsNode3;
                                                                intValue = i11;
                                                                arrayList3 = arrayList;
                                                                fVar3 = fVar;
                                                                p10 = map;
                                                            } else {
                                                                arrayList = arrayList5;
                                                                if (v7.g.a(key, aVar2)) {
                                                                    a11 = true;
                                                                } else {
                                                                    a11 = v7.g.a(key, SemanticsProperties.n);
                                                                }
                                                                if (a11) {
                                                                    androidComposeViewAccessibilityDelegateCompat2.t(semanticsNode2.c);
                                                                    a1 c = p.c(intValue, arrayList);
                                                                    v7.g.c(c);
                                                                    c.f3826m = (o1.h) SemanticsConfigurationKt.a(jVar2, aVar2);
                                                                    c.n = (o1.h) SemanticsConfigurationKt.a(jVar2, SemanticsProperties.n);
                                                                    androidComposeViewAccessibilityDelegateCompat2.E(c);
                                                                } else if (v7.g.a(key, SemanticsProperties.f3955k)) {
                                                                    Object value3 = next.getValue();
                                                                    v7.g.d(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                                    if (((Boolean) value3).booleanValue()) {
                                                                        i10 = 8;
                                                                        androidComposeViewAccessibilityDelegateCompat2.z(androidComposeViewAccessibilityDelegateCompat2.l(androidComposeViewAccessibilityDelegateCompat2.y(i20), 8));
                                                                    } else {
                                                                        i10 = 8;
                                                                    }
                                                                    AndroidComposeViewAccessibilityDelegateCompat.B(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat2.y(i20), 2048, 0, i10);
                                                                } else {
                                                                    androidx.compose.ui.semantics.a<List<o1.d>> aVar5 = o1.i.f16205o;
                                                                    if (v7.g.a(key, aVar5)) {
                                                                        List list3 = (List) jVar2.g(aVar5);
                                                                        List list4 = (List) SemanticsConfigurationKt.a(jVar3, aVar5);
                                                                        if (list4 != null) {
                                                                            ?? linkedHashSet = new LinkedHashSet();
                                                                            int size = list3.size();
                                                                            for (int i21 = 0; i21 < size; i21++) {
                                                                                ((o1.d) list3.get(i21)).getClass();
                                                                                linkedHashSet.add(null);
                                                                            }
                                                                            ?? linkedHashSet2 = new LinkedHashSet();
                                                                            int size2 = list4.size();
                                                                            for (int i22 = 0; i22 < size2; i22++) {
                                                                                ((o1.d) list4.get(i22)).getClass();
                                                                                linkedHashSet2.add(null);
                                                                            }
                                                                            if (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) {
                                                                                z13 = false;
                                                                            }
                                                                            z13 = true;
                                                                        } else if (!list3.isEmpty()) {
                                                                            z13 = true;
                                                                        }
                                                                    } else {
                                                                        if (next.getValue() instanceof o1.a) {
                                                                            Object value4 = next.getValue();
                                                                            v7.g.d(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                            o1.a aVar6 = (o1.a) value4;
                                                                            Object a13 = SemanticsConfigurationKt.a(jVar3, next.getKey());
                                                                            if (aVar6 != a13) {
                                                                                if (a13 instanceof o1.a) {
                                                                                    o1.a aVar7 = (o1.a) a13;
                                                                                    if (v7.g.a(aVar6.f16184a, aVar7.f16184a)) {
                                                                                        Object obj2 = aVar7.f16185b;
                                                                                        Object obj3 = aVar6.f16185b;
                                                                                        if (obj3 == null) {
                                                                                            if (obj2 != null) {
                                                                                            }
                                                                                        }
                                                                                        if (obj3 != null) {
                                                                                        }
                                                                                    }
                                                                                }
                                                                                z11 = false;
                                                                                z13 = !z11;
                                                                            }
                                                                            z11 = true;
                                                                            z13 = !z11;
                                                                        }
                                                                        z13 = true;
                                                                    }
                                                                    arrayList3 = arrayList;
                                                                    fVar3 = fVar;
                                                                    p10 = map;
                                                                }
                                                                arrayList3 = arrayList;
                                                                fVar3 = fVar;
                                                                p10 = map;
                                                            }
                                                        }
                                                    }
                                                    i11 = intValue;
                                                    semanticsNode3 = semanticsNode2;
                                                    arrayList = arrayList2;
                                                    semanticsNode2 = semanticsNode3;
                                                    intValue = i11;
                                                    arrayList3 = arrayList;
                                                    fVar3 = fVar;
                                                    p10 = map;
                                                }
                                                AndroidComposeViewAccessibilityDelegateCompat.B(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat2.y(intValue), 2048, 64, 8);
                                                y10 = androidComposeViewAccessibilityDelegateCompat2.y(intValue);
                                                i12 = 0;
                                                fVar = fVar3;
                                                arrayList2 = arrayList3;
                                                map = p10;
                                                i14 = 2048;
                                                i15 = 8;
                                                AndroidComposeViewAccessibilityDelegateCompat.B(androidComposeViewAccessibilityDelegateCompat, y10, i14, i12, i15);
                                                i11 = intValue;
                                                semanticsNode3 = semanticsNode2;
                                                arrayList = arrayList2;
                                                semanticsNode2 = semanticsNode3;
                                                intValue = i11;
                                                arrayList3 = arrayList;
                                                fVar3 = fVar;
                                                p10 = map;
                                            }
                                        }
                                        fVar = fVar3;
                                        arrayList2 = arrayList3;
                                        map = p10;
                                        i11 = intValue;
                                        semanticsNode3 = semanticsNode2;
                                        arrayList = arrayList2;
                                        semanticsNode2 = semanticsNode3;
                                        intValue = i11;
                                        arrayList3 = arrayList;
                                        fVar3 = fVar;
                                        p10 = map;
                                    }
                                    a1 c10 = p.c(intValue, arrayList4);
                                    if (c10 != null) {
                                        z10 = false;
                                    } else {
                                        c10 = new a1(intValue, arrayList3);
                                        z10 = true;
                                    }
                                    arrayList3.add(c10);
                                    if (!z10) {
                                    }
                                    key = next.getKey();
                                    aVar = SemanticsProperties.f3948d;
                                    if (!v7.g.a(key, aVar)) {
                                    }
                                    fVar = fVar3;
                                    arrayList2 = arrayList3;
                                    map = p10;
                                    i11 = intValue;
                                    semanticsNode3 = semanticsNode2;
                                    arrayList = arrayList2;
                                    semanticsNode2 = semanticsNode3;
                                    intValue = i11;
                                    arrayList3 = arrayList;
                                    fVar3 = fVar;
                                    p10 = map;
                                } else {
                                    ArrayList arrayList6 = arrayList3;
                                    Map<Integer, b1> map2 = p10;
                                    if (!z13) {
                                        Iterator<Map.Entry<? extends androidx.compose.ui.semantics.a<?>, ? extends Object>> it3 = jVar3.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                if (!semanticsNode2.f().d(it3.next().getKey())) {
                                                    z13 = true;
                                                }
                                            } else {
                                                z13 = false;
                                            }
                                        }
                                    }
                                    if (z13) {
                                        AndroidComposeViewAccessibilityDelegateCompat.B(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat2.y(intValue), 2048, 0, 8);
                                    }
                                    semanticsNode4 = null;
                                    p10 = map2;
                                    arrayList3 = arrayList6;
                                }
                            }
                        }
                    } else {
                        SemanticsNode semanticsNode6 = semanticsNode4;
                        p.d<Integer> dVar = androidComposeViewAccessibilityDelegateCompat2.f3625s;
                        Iterator<Integer> it4 = dVar.iterator();
                        while (true) {
                            g.a aVar8 = (g.a) it4;
                            if (aVar8.hasNext()) {
                                Integer num = (Integer) aVar8.next();
                                b1 b1Var2 = androidComposeViewAccessibilityDelegateCompat.p().get(num);
                                if (b1Var2 != null) {
                                    semanticsNode = b1Var2.f3831a;
                                } else {
                                    semanticsNode = semanticsNode6;
                                }
                                if (semanticsNode == null || !semanticsNode.f().d(SemanticsProperties.f3948d)) {
                                    dVar.remove(num);
                                    v7.g.e(num, "id");
                                    int intValue2 = num.intValue();
                                    AndroidComposeViewAccessibilityDelegateCompat.f fVar4 = (AndroidComposeViewAccessibilityDelegateCompat.f) linkedHashMap.get(num);
                                    if (fVar4 != null && (jVar = fVar4.f3644a) != null) {
                                        str = (String) SemanticsConfigurationKt.a(jVar, SemanticsProperties.f3948d);
                                    } else {
                                        str = semanticsNode6;
                                    }
                                    androidComposeViewAccessibilityDelegateCompat2.C(intValue2, 32, str);
                                }
                            } else {
                                linkedHashMap.clear();
                                for (Map.Entry<Integer, b1> entry : androidComposeViewAccessibilityDelegateCompat.p().entrySet()) {
                                    o1.j f10 = entry.getValue().f3831a.f();
                                    androidx.compose.ui.semantics.a<String> aVar9 = SemanticsProperties.f3948d;
                                    if (f10.d(aVar9) && dVar.add(entry.getKey())) {
                                        androidComposeViewAccessibilityDelegateCompat2.C(entry.getKey().intValue(), 16, (String) entry.getValue().f3831a.f3939f.g(aVar9));
                                    }
                                    linkedHashMap.put(entry.getKey(), new AndroidComposeViewAccessibilityDelegateCompat.f(entry.getValue().f3831a, androidComposeViewAccessibilityDelegateCompat.p()));
                                }
                                androidComposeViewAccessibilityDelegateCompat2.f3627u = new AndroidComposeViewAccessibilityDelegateCompat.f(androidComposeView.getSemanticsOwner().a(), androidComposeViewAccessibilityDelegateCompat.p());
                                androidComposeViewAccessibilityDelegateCompat2.f3628v = false;
                                return;
                            }
                        }
                    }
                }
                break;
            case 6:
                z zVar = (z) obj;
                z zVar2 = z.f5425q;
                v7.g.f(zVar, "this$0");
                int i23 = zVar.f5427j;
                r rVar = zVar.n;
                if (i23 == 0) {
                    zVar.f5428k = true;
                    rVar.f(Lifecycle.Event.ON_PAUSE);
                }
                if (zVar.f5426i == 0 && zVar.f5428k) {
                    rVar.f(Lifecycle.Event.ON_STOP);
                    zVar.f5429l = true;
                    return;
                }
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                androidx.profileinstaller.b.b((Context) obj, new k.b(2), androidx.profileinstaller.b.f5571a, false);
                return;
            case 8:
                a4.b.s(obj);
                v7.g.f(null, "this$0");
                throw null;
            case ma.i.f16046m /* 9 */:
                y3.h hVar2 = (y3.h) obj;
                v7.g.f(hVar2, "this$0");
                try {
                    y3.e eVar = hVar2.f18852f;
                    if (eVar != null) {
                        hVar2.f18850d = eVar.b(hVar2.f18853g, hVar2.f18848a);
                        y3.f fVar5 = hVar2.f18849b;
                        f.c cVar = hVar2.f18851e;
                        if (cVar != null) {
                            fVar5.a(cVar);
                            return;
                        } else {
                            v7.g.l("observer");
                            throw null;
                        }
                    }
                    return;
                } catch (RemoteException e10) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
                    return;
                }
            case ma.i.f16047o /* 10 */:
                androidx.work.impl.background.systemalarm.c.c((androidx.work.impl.background.systemalarm.c) obj);
                return;
            case 11:
                SideSheetBehavior.c cVar2 = (SideSheetBehavior.c) obj;
                cVar2.f7288b = false;
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                i3.c cVar3 = sideSheetBehavior.f7274i;
                if (cVar3 != null && cVar3.g()) {
                    cVar2.a(cVar2.f7287a);
                    return;
                } else if (sideSheetBehavior.f7273h == 2) {
                    sideSheetBehavior.s(cVar2.f7287a);
                    return;
                } else {
                    return;
                }
            default:
                ((h6.f) obj).t(true);
                return;
        }
    }
}
