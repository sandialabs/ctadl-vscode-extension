package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import c9.f;
import c9.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.kotlin.j;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m7.n;
import n7.l;
import n7.r;
import n7.s;
import n7.t;
import v7.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f13906a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13907a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f13908b;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0157a {

            /* renamed from: a  reason: collision with root package name */
            public final String f13909a;

            /* renamed from: b  reason: collision with root package name */
            public final ArrayList f13910b = new ArrayList();
            public Pair<String, h> c = new Pair<>("V", null);

            public C0157a(a aVar, String str) {
                this.f13909a = str;
            }

            public final void a(String str, c9.c... cVarArr) {
                boolean z10;
                h hVar;
                g.f(str, "type");
                ArrayList arrayList = this.f13910b;
                if (cVarArr.length == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    hVar = null;
                } else {
                    s y22 = kotlin.collections.b.y2(cVarArr);
                    int O0 = m0.b.O0(l.Z1(y22, 10));
                    if (O0 < 16) {
                        O0 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
                    Iterator it = y22.iterator();
                    while (true) {
                        t tVar = (t) it;
                        if (!tVar.hasNext()) {
                            break;
                        }
                        r rVar = (r) tVar.next();
                        linkedHashMap.put(Integer.valueOf(rVar.f16128a), (c9.c) rVar.f16129b);
                    }
                    hVar = new h(linkedHashMap);
                }
                arrayList.add(new Pair(str, hVar));
            }

            public final void b(String str, c9.c... cVarArr) {
                g.f(str, "type");
                s y22 = kotlin.collections.b.y2(cVarArr);
                int O0 = m0.b.O0(l.Z1(y22, 10));
                if (O0 < 16) {
                    O0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
                Iterator it = y22.iterator();
                while (true) {
                    t tVar = (t) it;
                    if (tVar.hasNext()) {
                        r rVar = (r) tVar.next();
                        linkedHashMap.put(Integer.valueOf(rVar.f16128a), (c9.c) rVar.f16129b);
                    } else {
                        this.c = new Pair<>(str, new h(linkedHashMap));
                        return;
                    }
                }
            }

            public final void c(JvmPrimitiveType jvmPrimitiveType) {
                g.f(jvmPrimitiveType, "type");
                String i10 = jvmPrimitiveType.i();
                g.e(i10, "type.desc");
                this.c = new Pair<>(i10, null);
            }
        }

        public a(d dVar, String str) {
            g.f(str, "className");
            this.f13908b = dVar;
            this.f13907a = str;
        }

        public final void a(String str, u7.l<? super C0157a, n> lVar) {
            LinkedHashMap linkedHashMap = this.f13908b.f13906a;
            C0157a c0157a = new C0157a(this, str);
            lVar.U(c0157a);
            ArrayList arrayList = c0157a.f13910b;
            ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((Pair) it.next()).f12962i);
            }
            String f10 = j.f(this.f13907a, j.e(c0157a.f13909a, arrayList2, c0157a.c.f12962i));
            h hVar = c0157a.c.f12963j;
            ArrayList arrayList3 = new ArrayList(l.Z1(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add((h) ((Pair) it2.next()).f12963j);
            }
            linkedHashMap.put(f10, new f(hVar, arrayList3));
        }
    }
}
