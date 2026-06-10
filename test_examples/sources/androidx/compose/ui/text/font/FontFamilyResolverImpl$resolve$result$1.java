package androidx.compose.ui.text.font;

import android.graphics.Typeface;
import androidx.compose.ui.text.font.a;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m7.n;
import n7.f;
import u1.d;
import u1.e;
import u1.h;
import u1.m;
import u1.o;
import u1.p;
import u1.r;
import u1.w;
import u1.y;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lu1/y;", "Lm7/n;", "onAsyncCompletion", "invoke", "(Lu7/l;)Lu1/y;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class FontFamilyResolverImpl$resolve$result$1 extends Lambda implements l<l<? super y, ? extends n>, y> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f4112j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ w f4113k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$resolve$result$1(b bVar, w wVar) {
        super(1);
        this.f4112j = bVar;
        this.f4113k = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03a8 A[SYNTHETIC] */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y U(l<? super y, ? extends n> lVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z10;
        int size;
        int i10;
        Pair pair;
        List list;
        y aVar;
        boolean z11;
        Object b5;
        boolean z12;
        boolean z13;
        boolean z14;
        Object Q;
        boolean z15;
        boolean z16;
        boolean z17;
        y.b bVar;
        Typeface d5;
        l<? super y, ? extends n> lVar2 = lVar;
        g.f(lVar2, "onAsyncCompletion");
        b bVar2 = this.f4112j;
        h hVar = bVar2.f4125d;
        w wVar = this.f4113k;
        p pVar = bVar2.f4123a;
        l<w, Object> lVar3 = bVar2.f4127f;
        hVar.getClass();
        g.f(wVar, "typefaceRequest");
        g.f(pVar, "platformFontLoader");
        g.f(lVar3, "createDefaultTypeface");
        e eVar = wVar.f17768a;
        Object obj = null;
        if (!(eVar instanceof u1.g)) {
            aVar = null;
        } else {
            ArrayList arrayList3 = ((u1.g) eVar).f17745l;
            m mVar = wVar.f17769b;
            int i11 = wVar.c;
            g.f(arrayList3, "fontList");
            g.f(mVar, "fontWeight");
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Object obj2 = arrayList3.get(i12);
                d dVar = (d) obj2;
                if (g.a(dVar.c(), mVar)) {
                    if (dVar.a() == i11) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        z15 = true;
                        if (!z15) {
                            arrayList4.add(obj2);
                        }
                    }
                }
                z15 = false;
                if (!z15) {
                }
            }
            if (!(!arrayList4.isEmpty())) {
                n nVar = n.f16010a;
                ArrayList arrayList5 = new ArrayList(arrayList3.size());
                int size3 = arrayList3.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Object obj3 = arrayList3.get(i13);
                    if (((d) obj3).a() == i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList5.add(obj3);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    arrayList3 = arrayList5;
                }
                if (mVar.compareTo(m.f17751j) < 0) {
                    int size4 = arrayList3.size();
                    m mVar2 = null;
                    m mVar3 = null;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size4) {
                            break;
                        }
                        m c = ((d) arrayList3.get(i14)).c();
                        if (c.compareTo(mVar) < 0) {
                            if (mVar2 == null || c.compareTo(mVar2) > 0) {
                                mVar2 = c;
                            }
                        } else if (c.compareTo(mVar) > 0) {
                            if (mVar3 == null || c.compareTo(mVar3) < 0) {
                                mVar3 = c;
                            }
                        } else {
                            mVar2 = c;
                            mVar3 = mVar2;
                            break;
                        }
                        i14++;
                    }
                    if (mVar2 == null) {
                        mVar2 = mVar3;
                    }
                    arrayList2 = new ArrayList(arrayList3.size());
                    int size5 = arrayList3.size();
                    for (int i15 = 0; i15 < size5; i15++) {
                        Object obj4 = arrayList3.get(i15);
                        if (g.a(((d) obj4).c(), mVar2)) {
                            arrayList2.add(obj4);
                        }
                    }
                } else {
                    m mVar4 = m.f17752k;
                    if (mVar.compareTo(mVar4) > 0) {
                        int size6 = arrayList3.size();
                        m mVar5 = null;
                        m mVar6 = null;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size6) {
                                break;
                            }
                            m c10 = ((d) arrayList3.get(i16)).c();
                            if (c10.compareTo(mVar) < 0) {
                                if (mVar5 == null || c10.compareTo(mVar5) > 0) {
                                    mVar5 = c10;
                                }
                            } else if (c10.compareTo(mVar) > 0) {
                                if (mVar6 == null || c10.compareTo(mVar6) < 0) {
                                    mVar6 = c10;
                                }
                            } else {
                                mVar5 = c10;
                                mVar6 = mVar5;
                                break;
                            }
                            i16++;
                        }
                        if (mVar6 != null) {
                            mVar5 = mVar6;
                        }
                        arrayList2 = new ArrayList(arrayList3.size());
                        int size7 = arrayList3.size();
                        for (int i17 = 0; i17 < size7; i17++) {
                            Object obj5 = arrayList3.get(i17);
                            if (g.a(((d) obj5).c(), mVar5)) {
                                arrayList2.add(obj5);
                            }
                        }
                    } else {
                        int size8 = arrayList3.size();
                        m mVar7 = null;
                        m mVar8 = null;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size8) {
                                break;
                            }
                            m c11 = ((d) arrayList3.get(i18)).c();
                            if (c11.compareTo(mVar4) <= 0) {
                                if (c11.compareTo(mVar) < 0) {
                                    if (mVar7 == null || c11.compareTo(mVar7) > 0) {
                                        mVar7 = c11;
                                    }
                                } else if (c11.compareTo(mVar) > 0) {
                                    if (mVar8 == null || c11.compareTo(mVar8) < 0) {
                                        mVar8 = c11;
                                    }
                                } else {
                                    mVar7 = c11;
                                    mVar8 = mVar7;
                                    break;
                                }
                            }
                            i18++;
                        }
                        if (mVar8 != null) {
                            mVar7 = mVar8;
                        }
                        arrayList = new ArrayList(arrayList3.size());
                        int size9 = arrayList3.size();
                        for (int i19 = 0; i19 < size9; i19++) {
                            Object obj6 = arrayList3.get(i19);
                            if (g.a(((d) obj6).c(), mVar7)) {
                                arrayList.add(obj6);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            m mVar9 = m.f17752k;
                            int size10 = arrayList3.size();
                            m mVar10 = null;
                            m mVar11 = null;
                            int i20 = 0;
                            while (true) {
                                if (i20 >= size10) {
                                    break;
                                }
                                m c12 = ((d) arrayList3.get(i20)).c();
                                if (mVar9 == null || c12.compareTo(mVar9) >= 0) {
                                    if (c12.compareTo(mVar) < 0) {
                                        if (mVar10 == null || c12.compareTo(mVar10) > 0) {
                                            mVar10 = c12;
                                        }
                                    } else if (c12.compareTo(mVar) > 0) {
                                        if (mVar11 == null || c12.compareTo(mVar11) < 0) {
                                            mVar11 = c12;
                                        }
                                    } else {
                                        mVar10 = c12;
                                        mVar11 = mVar10;
                                        break;
                                    }
                                }
                                i20++;
                            }
                            if (mVar11 != null) {
                                mVar10 = mVar11;
                            }
                            arrayList2 = new ArrayList(arrayList3.size());
                            int size11 = arrayList3.size();
                            for (int i21 = 0; i21 < size11; i21++) {
                                Object obj7 = arrayList3.get(i21);
                                if (g.a(((d) obj7).c(), mVar10)) {
                                    arrayList2.add(obj7);
                                }
                            }
                        }
                        a aVar2 = hVar.f17746a;
                        size = arrayList.size();
                        ArrayList arrayList6 = null;
                        i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                d dVar2 = (d) arrayList.get(i10);
                                int b10 = dVar2.b();
                                if (b10 == 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    synchronized (aVar2.c) {
                                        pVar.c();
                                        a.b bVar3 = new a.b(dVar2, obj);
                                        a.C0027a a10 = aVar2.f4118a.a(bVar3);
                                        if (a10 == null) {
                                            a10 = aVar2.f4119b.a(bVar3);
                                        }
                                        if (a10 != null) {
                                            b5 = a10.f4120a;
                                        } else {
                                            n nVar2 = n.f16010a;
                                            try {
                                                b5 = pVar.b(dVar2);
                                                a.b(aVar2, dVar2, pVar, b5);
                                            } catch (Exception e10) {
                                                throw new IllegalStateException("Unable to load font " + dVar2, e10);
                                            }
                                        }
                                    }
                                    if (b5 != null) {
                                        pair = new Pair(arrayList6, v0.p.H(wVar.f17770d, b5, dVar2, wVar.f17769b, wVar.c));
                                    } else {
                                        throw new IllegalStateException("Unable to load font " + dVar2);
                                    }
                                } else {
                                    if (b10 == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        synchronized (aVar2.c) {
                                            pVar.c();
                                            a.b bVar4 = new a.b(dVar2, obj);
                                            a.C0027a a11 = aVar2.f4118a.a(bVar4);
                                            if (a11 == null) {
                                                a11 = aVar2.f4119b.a(bVar4);
                                            }
                                            if (a11 != null) {
                                                Q = a11.f4120a;
                                            } else {
                                                n nVar3 = n.f16010a;
                                                try {
                                                    Q = pVar.b(dVar2);
                                                } catch (Throwable th) {
                                                    Q = m0.b.Q(th);
                                                }
                                                if (Q instanceof Result.Failure) {
                                                    Q = null;
                                                }
                                                a.b(aVar2, dVar2, pVar, Q);
                                            }
                                        }
                                        if (Q != null) {
                                            pair = new Pair(arrayList6, v0.p.H(wVar.f17770d, Q, dVar2, wVar.f17769b, wVar.c));
                                            break;
                                        }
                                        i10++;
                                        obj = null;
                                    } else {
                                        if (b10 == 2) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            a.C0027a a12 = aVar2.a(dVar2, pVar);
                                            if (a12 == null) {
                                                if (arrayList6 == null) {
                                                    arrayList6 = new ArrayList(new f(new d[]{dVar2}, true));
                                                } else {
                                                    arrayList6.add(dVar2);
                                                }
                                            } else {
                                                Object obj8 = a12.f4120a;
                                                if (obj8 == null) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                if (!z14 && obj8 != null) {
                                                    pair = new Pair(arrayList6, v0.p.H(wVar.f17770d, obj8, dVar2, wVar.f17769b, wVar.c));
                                                    break;
                                                }
                                            }
                                            i10++;
                                            obj = null;
                                        } else {
                                            throw new IllegalStateException("Unknown font type " + dVar2);
                                        }
                                    }
                                }
                            } else {
                                pair = new Pair(arrayList6, ((FontFamilyResolverImpl$createDefaultTypeface$1) lVar3).U(wVar));
                                break;
                            }
                        }
                        list = (List) pair.f12962i;
                        B b11 = pair.f12963j;
                        if (list != null) {
                            aVar = new y.b(b11, true);
                        } else {
                            AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, b11, wVar, hVar.f17746a, lVar2, pVar);
                            m0.b.M0(hVar.f17747b, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1);
                            aVar = new y.a(asyncFontListLoader);
                        }
                    }
                }
                arrayList4 = arrayList2;
            }
            arrayList = arrayList4;
            a aVar22 = hVar.f17746a;
            size = arrayList.size();
            ArrayList arrayList62 = null;
            i10 = 0;
            while (true) {
                if (i10 < size) {
                }
                i10++;
                obj = null;
            }
            list = (List) pair.f12962i;
            B b112 = pair.f12963j;
            if (list != null) {
            }
        }
        if (aVar == null) {
            b bVar5 = this.f4112j;
            j0.c cVar = bVar5.f4126e;
            w wVar2 = this.f4113k;
            p pVar2 = bVar5.f4123a;
            l<w, Object> lVar4 = bVar5.f4127f;
            cVar.getClass();
            g.f(wVar2, "typefaceRequest");
            g.f(pVar2, "platformFontLoader");
            g.f(lVar4, "createDefaultTypeface");
            e eVar2 = wVar2.f17768a;
            if (eVar2 == null) {
                z17 = true;
            } else {
                z17 = eVar2 instanceof u1.c;
            }
            int i22 = wVar2.c;
            m mVar12 = wVar2.f17769b;
            if (z17) {
                d5 = ((r) cVar.f12625b).h(mVar12, i22);
            } else if (eVar2 instanceof u1.n) {
                d5 = ((r) cVar.f12625b).d((u1.n) eVar2, mVar12, i22);
            } else if (!(eVar2 instanceof o)) {
                bVar = null;
                if (bVar == null) {
                    return bVar;
                }
                throw new IllegalStateException("Could not load font");
            } else {
                ((o) eVar2).getClass();
                g.d(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                throw null;
            }
            bVar = new y.b(d5, true);
            if (bVar == null) {
            }
        } else {
            return aVar;
        }
    }
}
