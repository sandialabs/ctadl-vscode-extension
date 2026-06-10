package com.noto.app.settings;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.JsonUtilsKt;
import com.noto.app.util.ModelUtilsKt;
import j$.util.Map;
import ja.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import t6.d;
import t6.f;
import t6.v;
import u6.e;
import u7.p;
import va.j;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lt6/f;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.settings.SettingsViewModel$importJson$2", f = "SettingsViewModel.kt", l = {121, 126, 132, 137, 143, 145}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SettingsViewModel$importJson$2 extends SuspendLambda implements p<x, p7.c<? super f>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Object f9546m;
    public Map n;

    /* renamed from: o  reason: collision with root package name */
    public Object f9547o;

    /* renamed from: p  reason: collision with root package name */
    public Object f9548p;

    /* renamed from: q  reason: collision with root package name */
    public Object f9549q;

    /* renamed from: r  reason: collision with root package name */
    public Object f9550r;

    /* renamed from: s  reason: collision with root package name */
    public Iterator f9551s;

    /* renamed from: t  reason: collision with root package name */
    public Object f9552t;

    /* renamed from: u  reason: collision with root package name */
    public int f9553u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f9554v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ c f9555w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$importJson$2(c cVar, String str, p7.c cVar2) {
        super(2, cVar2);
        this.f9554v = str;
        this.f9555w = cVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super f> cVar) {
        return ((SettingsViewModel$importJson$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new SettingsViewModel$importJson$2(this.f9555w, this.f9554v, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0184 A[LOOP:1: B:23:0x0162->B:34:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0370 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0142 -> B:13:0x0108). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x01fc -> B:51:0x01fe). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0270 -> B:59:0x0275). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x02d8 -> B:67:0x02dd). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Iterator it;
        SettingsViewModel$importJson$2 settingsViewModel$importJson$2;
        f fVar;
        c cVar;
        Object obj2;
        f fVar2;
        t6.a aVar;
        LinkedHashMap linkedHashMap3;
        LinkedHashMap linkedHashMap4;
        Object obj3;
        f fVar3;
        c cVar2;
        f fVar4;
        Iterator it2;
        SettingsViewModel$importJson$2 settingsViewModel$importJson$22;
        Iterator it3;
        Object obj4;
        long j2;
        boolean z10;
        Object i10;
        SettingsViewModel$importJson$2 settingsViewModel$importJson$23;
        t6.a aVar2;
        boolean z11;
        LinkedHashMap linkedHashMap5;
        LinkedHashMap linkedHashMap6;
        Object obj5;
        LinkedHashMap linkedHashMap7;
        LinkedHashMap linkedHashMap8;
        Object obj6;
        Iterator it4;
        f fVar5;
        Object g10;
        SettingsViewModel$importJson$2 settingsViewModel$importJson$24;
        d dVar;
        LinkedHashMap linkedHashMap9;
        LinkedHashMap linkedHashMap10;
        Object obj7;
        LinkedHashMap linkedHashMap11;
        LinkedHashMap linkedHashMap12;
        Object obj8;
        Iterator it5;
        f fVar6;
        SettingsViewModel$importJson$2 settingsViewModel$importJson$25;
        CoroutineSingletons coroutineSingletons;
        f fVar7;
        Map map;
        Object f10;
        SettingsViewModel$importJson$2 settingsViewModel$importJson$26;
        t6.c cVar3;
        LinkedHashMap linkedHashMap13;
        LinkedHashMap linkedHashMap14;
        LinkedHashMap linkedHashMap15;
        LinkedHashMap linkedHashMap16;
        e eVar;
        v vVar;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.f9553u) {
            case 0:
                m0.b.n1(obj);
                LinkedHashMap linkedHashMap17 = new LinkedHashMap();
                LinkedHashMap linkedHashMap18 = new LinkedHashMap();
                Object linkedHashMap19 = new LinkedHashMap();
                j jVar = JsonUtilsKt.f9819a;
                jVar.getClass();
                f fVar8 = (f) jVar.a(f.Companion.serializer(), this.f9554v);
                linkedHashMap = linkedHashMap17;
                linkedHashMap2 = linkedHashMap18;
                it = fVar8.f17638a.iterator();
                settingsViewModel$importJson$2 = this;
                fVar = fVar8;
                cVar = this.f9555w;
                obj2 = linkedHashMap19;
                fVar2 = fVar;
                if (it.hasNext()) {
                    t6.a aVar3 = (t6.a) it.next();
                    if (ModelUtilsKt.u(aVar3)) {
                        u6.a aVar4 = cVar.f9659d;
                        settingsViewModel$importJson$2.f9546m = linkedHashMap;
                        settingsViewModel$importJson$2.n = linkedHashMap2;
                        settingsViewModel$importJson$2.f9547o = obj2;
                        settingsViewModel$importJson$2.f9548p = fVar;
                        settingsViewModel$importJson$2.f9549q = cVar;
                        settingsViewModel$importJson$2.f9550r = fVar2;
                        settingsViewModel$importJson$2.f9551s = it;
                        settingsViewModel$importJson$2.f9552t = aVar3;
                        settingsViewModel$importJson$2.f9553u = 1;
                        if (aVar4.f(aVar3, settingsViewModel$importJson$2) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        Iterator it6 = it;
                        settingsViewModel$importJson$22 = settingsViewModel$importJson$2;
                        aVar = aVar3;
                        linkedHashMap3 = linkedHashMap;
                        linkedHashMap4 = linkedHashMap2;
                        obj3 = obj2;
                        fVar3 = fVar;
                        cVar2 = cVar;
                        fVar4 = fVar2;
                        it2 = it6;
                        linkedHashMap3.put(new Long(aVar.f17592a), new Long(-1L));
                        settingsViewModel$importJson$2 = settingsViewModel$importJson$22;
                        it = it2;
                        fVar2 = fVar4;
                        cVar = cVar2;
                        fVar = fVar3;
                        obj2 = obj3;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap = linkedHashMap3;
                        if (it.hasNext()) {
                            it3 = fVar2.f17639b.iterator();
                            obj6 = obj2;
                            linkedHashMap8 = linkedHashMap2;
                            linkedHashMap7 = linkedHashMap;
                            if (it3.hasNext()) {
                                d dVar2 = (d) it3.next();
                                long longValue = ((Number) kotlin.collections.d.L1(new Long(dVar2.f17622b), linkedHashMap7)).longValue();
                                u6.d dVar3 = cVar.f9660e;
                                d a10 = d.a(dVar2, 0L, longValue, null, null, 0, false, false, null, null, 0, 4092);
                                settingsViewModel$importJson$2.f9546m = linkedHashMap7;
                                settingsViewModel$importJson$2.n = linkedHashMap8;
                                settingsViewModel$importJson$2.f9547o = obj6;
                                settingsViewModel$importJson$2.f9548p = fVar;
                                settingsViewModel$importJson$2.f9549q = cVar;
                                settingsViewModel$importJson$2.f9550r = fVar2;
                                settingsViewModel$importJson$2.f9551s = it3;
                                settingsViewModel$importJson$2.f9552t = dVar2;
                                settingsViewModel$importJson$2.f9553u = 3;
                                g10 = dVar3.g(a10, false, settingsViewModel$importJson$2);
                                if (g10 == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                settingsViewModel$importJson$24 = settingsViewModel$importJson$2;
                                dVar = dVar2;
                                obj7 = obj6;
                                linkedHashMap10 = linkedHashMap8;
                                linkedHashMap9 = linkedHashMap7;
                                linkedHashMap10.put(new Long(dVar.f17621a), new Long(((Number) g10).longValue()));
                                settingsViewModel$importJson$2 = settingsViewModel$importJson$24;
                                obj6 = obj7;
                                linkedHashMap8 = linkedHashMap10;
                                linkedHashMap7 = linkedHashMap9;
                                if (it3.hasNext()) {
                                    it4 = fVar2.c.iterator();
                                    fVar5 = fVar2;
                                    obj8 = obj6;
                                    linkedHashMap12 = linkedHashMap8;
                                    linkedHashMap11 = linkedHashMap7;
                                    if (it4.hasNext()) {
                                        t6.c cVar4 = (t6.c) it4.next();
                                        long longValue2 = ((Number) kotlin.collections.d.L1(new Long(cVar4.f17616b), linkedHashMap11)).longValue();
                                        u6.b bVar = cVar.f9661f;
                                        t6.c a11 = t6.c.a(cVar4, longValue2, null, 0, 28);
                                        settingsViewModel$importJson$2.f9546m = linkedHashMap11;
                                        settingsViewModel$importJson$2.n = linkedHashMap12;
                                        settingsViewModel$importJson$2.f9547o = obj8;
                                        settingsViewModel$importJson$2.f9548p = fVar;
                                        settingsViewModel$importJson$2.f9549q = cVar;
                                        settingsViewModel$importJson$2.f9550r = fVar5;
                                        settingsViewModel$importJson$2.f9551s = it4;
                                        settingsViewModel$importJson$2.f9552t = cVar4;
                                        settingsViewModel$importJson$2.f9553u = 4;
                                        f10 = bVar.f(a11, false, settingsViewModel$importJson$2);
                                        if (f10 == coroutineSingletons2) {
                                            return coroutineSingletons2;
                                        }
                                        settingsViewModel$importJson$26 = settingsViewModel$importJson$2;
                                        cVar3 = cVar4;
                                        linkedHashMap15 = obj8;
                                        linkedHashMap14 = linkedHashMap12;
                                        linkedHashMap13 = linkedHashMap11;
                                        linkedHashMap15.put(new Long(cVar3.f17615a), new Long(((Number) f10).longValue()));
                                        settingsViewModel$importJson$2 = settingsViewModel$importJson$26;
                                        obj8 = linkedHashMap15;
                                        linkedHashMap12 = linkedHashMap14;
                                        linkedHashMap11 = linkedHashMap13;
                                        if (it4.hasNext()) {
                                            it5 = fVar5.f17640d.iterator();
                                            fVar6 = fVar5;
                                            settingsViewModel$importJson$25 = settingsViewModel$importJson$2;
                                            coroutineSingletons = coroutineSingletons2;
                                            fVar7 = fVar;
                                            map = linkedHashMap12;
                                            linkedHashMap16 = obj8;
                                            while (it5.hasNext()) {
                                                t6.e eVar2 = (t6.e) it5.next();
                                                long longValue3 = ((Number) kotlin.collections.d.L1(new Long(eVar2.f17635b), map)).longValue();
                                                long longValue4 = ((Number) kotlin.collections.d.L1(new Long(eVar2.c), linkedHashMap16)).longValue();
                                                u6.c cVar5 = cVar.f9662g;
                                                t6.e eVar3 = new t6.e(0L, longValue3, longValue4);
                                                settingsViewModel$importJson$25.f9546m = map;
                                                settingsViewModel$importJson$25.n = linkedHashMap16;
                                                settingsViewModel$importJson$25.f9547o = fVar7;
                                                settingsViewModel$importJson$25.f9548p = cVar;
                                                settingsViewModel$importJson$25.f9549q = fVar6;
                                                settingsViewModel$importJson$25.f9550r = it5;
                                                settingsViewModel$importJson$25.f9551s = null;
                                                settingsViewModel$importJson$25.f9552t = null;
                                                settingsViewModel$importJson$25.f9553u = 5;
                                                if (cVar5.c(eVar3, settingsViewModel$importJson$25) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            }
                                            eVar = cVar.f9663h;
                                            vVar = fVar6.f17641e;
                                            settingsViewModel$importJson$25.f9546m = fVar7;
                                            settingsViewModel$importJson$25.n = null;
                                            settingsViewModel$importJson$25.f9547o = null;
                                            settingsViewModel$importJson$25.f9548p = null;
                                            settingsViewModel$importJson$25.f9549q = null;
                                            settingsViewModel$importJson$25.f9550r = null;
                                            settingsViewModel$importJson$25.f9551s = null;
                                            settingsViewModel$importJson$25.f9552t = null;
                                            settingsViewModel$importJson$25.f9553u = 6;
                                            if (eVar.C(vVar, settingsViewModel$importJson$25) != coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            return fVar7;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        Iterator it7 = fVar2.f17638a.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                obj4 = it7.next();
                                long j10 = ((t6.a) obj4).f17592a;
                                Long l2 = aVar3.f17593b;
                                if (l2 != null && j10 == l2.longValue()) {
                                    z11 = true;
                                    if (!z11) {
                                    }
                                }
                                z11 = false;
                                if (!z11) {
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        t6.a aVar5 = (t6.a) obj4;
                        if (aVar5 != null) {
                            j2 = aVar5.f17592a;
                        } else {
                            j2 = 0;
                        }
                        Object orDefault = Map.EL.getOrDefault(linkedHashMap, new Long(j2), new Long(0L));
                        if (((Number) orDefault).longValue() == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            orDefault = null;
                        }
                        u6.a aVar6 = cVar.f9659d;
                        t6.a a12 = t6.a.a(aVar3, (Long) orDefault, null, 0, null, null, 0, false, false, false, null, null, null, null, null, false, 0, null, null, null, 2097148);
                        settingsViewModel$importJson$2.f9546m = linkedHashMap;
                        settingsViewModel$importJson$2.n = linkedHashMap2;
                        settingsViewModel$importJson$2.f9547o = obj2;
                        settingsViewModel$importJson$2.f9548p = fVar;
                        settingsViewModel$importJson$2.f9549q = cVar;
                        settingsViewModel$importJson$2.f9550r = fVar2;
                        settingsViewModel$importJson$2.f9551s = it;
                        settingsViewModel$importJson$2.f9552t = aVar3;
                        settingsViewModel$importJson$2.f9553u = 2;
                        i10 = aVar6.i(a12, false, settingsViewModel$importJson$2);
                        if (i10 == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                        settingsViewModel$importJson$23 = settingsViewModel$importJson$2;
                        aVar2 = aVar3;
                        obj5 = obj2;
                        linkedHashMap6 = linkedHashMap2;
                        linkedHashMap5 = linkedHashMap;
                        linkedHashMap5.put(new Long(aVar2.f17592a), new Long(((Number) i10).longValue()));
                        settingsViewModel$importJson$2 = settingsViewModel$importJson$23;
                        obj2 = obj5;
                        linkedHashMap2 = linkedHashMap6;
                        linkedHashMap = linkedHashMap5;
                        if (it.hasNext()) {
                        }
                    }
                }
                break;
            case 1:
                aVar = (t6.a) this.f9552t;
                Iterator it8 = this.f9551s;
                ?? r10 = this.n;
                m0.b.n1(obj);
                linkedHashMap3 = (java.util.Map) this.f9546m;
                linkedHashMap4 = r10;
                obj3 = (java.util.Map) this.f9547o;
                fVar3 = (f) this.f9548p;
                cVar2 = (c) this.f9549q;
                fVar4 = (f) this.f9550r;
                it2 = it8;
                settingsViewModel$importJson$22 = this;
                linkedHashMap3.put(new Long(aVar.f17592a), new Long(-1L));
                settingsViewModel$importJson$2 = settingsViewModel$importJson$22;
                it = it2;
                fVar2 = fVar4;
                cVar = cVar2;
                fVar = fVar3;
                obj2 = obj3;
                linkedHashMap2 = linkedHashMap4;
                linkedHashMap = linkedHashMap3;
                if (it.hasNext()) {
                }
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                aVar2 = (t6.a) this.f9552t;
                it = this.f9551s;
                fVar2 = (f) this.f9550r;
                cVar = (c) this.f9549q;
                fVar = (f) this.f9548p;
                ?? r102 = this.n;
                m0.b.n1(obj);
                i10 = obj;
                settingsViewModel$importJson$23 = this;
                obj5 = (java.util.Map) this.f9547o;
                linkedHashMap6 = r102;
                linkedHashMap5 = (java.util.Map) this.f9546m;
                linkedHashMap5.put(new Long(aVar2.f17592a), new Long(((Number) i10).longValue()));
                settingsViewModel$importJson$2 = settingsViewModel$importJson$23;
                obj2 = obj5;
                linkedHashMap2 = linkedHashMap6;
                linkedHashMap = linkedHashMap5;
                if (it.hasNext()) {
                }
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                dVar = (d) this.f9552t;
                it3 = this.f9551s;
                fVar2 = (f) this.f9550r;
                cVar = (c) this.f9549q;
                fVar = (f) this.f9548p;
                ?? r103 = this.n;
                m0.b.n1(obj);
                g10 = obj;
                settingsViewModel$importJson$24 = this;
                obj7 = (java.util.Map) this.f9547o;
                linkedHashMap10 = r103;
                linkedHashMap9 = (java.util.Map) this.f9546m;
                linkedHashMap10.put(new Long(dVar.f17621a), new Long(((Number) g10).longValue()));
                settingsViewModel$importJson$2 = settingsViewModel$importJson$24;
                obj6 = obj7;
                linkedHashMap8 = linkedHashMap10;
                linkedHashMap7 = linkedHashMap9;
                if (it3.hasNext()) {
                }
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                cVar3 = (t6.c) this.f9552t;
                it4 = this.f9551s;
                cVar = (c) this.f9549q;
                fVar = (f) this.f9548p;
                ?? r104 = this.n;
                m0.b.n1(obj);
                settingsViewModel$importJson$26 = this;
                fVar5 = (f) this.f9550r;
                f10 = obj;
                linkedHashMap15 = (java.util.Map) this.f9547o;
                linkedHashMap14 = r104;
                linkedHashMap13 = (java.util.Map) this.f9546m;
                linkedHashMap15.put(new Long(cVar3.f17615a), new Long(((Number) f10).longValue()));
                settingsViewModel$importJson$2 = settingsViewModel$importJson$26;
                obj8 = linkedHashMap15;
                linkedHashMap12 = linkedHashMap14;
                linkedHashMap11 = linkedHashMap13;
                if (it4.hasNext()) {
                }
                break;
            case 5:
                ?? r72 = this.n;
                map = (java.util.Map) this.f9546m;
                m0.b.n1(obj);
                it5 = (Iterator) this.f9550r;
                linkedHashMap16 = r72;
                coroutineSingletons = coroutineSingletons2;
                cVar = (c) this.f9548p;
                fVar7 = (f) this.f9547o;
                fVar6 = (f) this.f9549q;
                settingsViewModel$importJson$25 = this;
                while (it5.hasNext()) {
                }
                eVar = cVar.f9663h;
                vVar = fVar6.f17641e;
                settingsViewModel$importJson$25.f9546m = fVar7;
                settingsViewModel$importJson$25.n = null;
                settingsViewModel$importJson$25.f9547o = null;
                settingsViewModel$importJson$25.f9548p = null;
                settingsViewModel$importJson$25.f9549q = null;
                settingsViewModel$importJson$25.f9550r = null;
                settingsViewModel$importJson$25.f9551s = null;
                settingsViewModel$importJson$25.f9552t = null;
                settingsViewModel$importJson$25.f9553u = 6;
                if (eVar.C(vVar, settingsViewModel$importJson$25) != coroutineSingletons) {
                }
                break;
            case 6:
                f fVar9 = (f) this.f9546m;
                m0.b.n1(obj);
                return fVar9;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
