package o0;

import ha.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0.c;
import u7.l;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final l<Object, Boolean> f16178a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f16179b;
    public final LinkedHashMap c;

    /* loaded from: classes.dex */
    public static final class a implements c.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f16181b;
        public final /* synthetic */ u7.a<Object> c;

        public a(String str, u7.a<? extends Object> aVar) {
            this.f16181b = str;
            this.c = aVar;
        }

        @Override // o0.c.a
        public final void a() {
            d dVar = d.this;
            LinkedHashMap linkedHashMap = dVar.c;
            String str = this.f16181b;
            List list = (List) linkedHashMap.remove(str);
            if (list != null) {
                list.remove(this.c);
            }
            if (list != null && (!list.isEmpty())) {
                dVar.c.put(str, list);
            }
        }
    }

    public d(LinkedHashMap linkedHashMap, l lVar) {
        this.f16178a = lVar;
        this.f16179b = linkedHashMap != null ? kotlin.collections.d.P1(linkedHashMap) : new LinkedHashMap();
        this.c = new LinkedHashMap();
    }

    @Override // o0.c
    public final boolean a(Object obj) {
        return this.f16178a.U(obj).booleanValue();
    }

    @Override // o0.c
    public final Map<String, List<Object>> b() {
        LinkedHashMap P1 = kotlin.collections.d.P1(this.f16179b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object k02 = ((u7.a) list.get(0)).k0();
                if (k02 == null) {
                    continue;
                } else if (!a(k02)) {
                    throw new IllegalStateException("Check failed.".toString());
                } else {
                    P1.put(str, a1.c.O(k02));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    Object k03 = ((u7.a) list.get(i10)).k0();
                    if (k03 != null && !a(k03)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(k03);
                }
                P1.put(str, arrayList);
            }
        }
        return P1;
    }

    @Override // o0.c
    public final Object c(String str) {
        v7.g.f(str, "key");
        LinkedHashMap linkedHashMap = this.f16179b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // o0.c
    public final c.a d(String str, u7.a<? extends Object> aVar) {
        v7.g.f(str, "key");
        if (!i.T0(str)) {
            LinkedHashMap linkedHashMap = this.c;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(aVar);
            return new a(str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
}
