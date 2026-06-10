package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<Object, Object> f13924a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap<i, List<Object>> f13925b;
    public final /* synthetic */ h c;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0158a extends b {
        public C0158a(i iVar) {
            super(iVar);
        }

        public final f c(int i10, h9.b bVar, q8.b bVar2) {
            i iVar = this.f13927a;
            v7.g.f(iVar, "signature");
            i iVar2 = new i(iVar.f13985a + '@' + i10);
            a aVar = a.this;
            List<Object> list = aVar.f13925b.get(iVar2);
            if (list == null) {
                list = new ArrayList<>();
                aVar.f13925b.put(iVar2, list);
            }
            return aVar.f13924a.r(bVar, bVar2, list);
        }
    }

    /* loaded from: classes.dex */
    public class b implements h.c {

        /* renamed from: a  reason: collision with root package name */
        public final i f13927a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<Object> f13928b = new ArrayList<>();

        public b(i iVar) {
            this.f13927a = iVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.c
        public final void a() {
            ArrayList<Object> arrayList = this.f13928b;
            if (!arrayList.isEmpty()) {
                a.this.f13925b.put(this.f13927a, arrayList);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.c
        public final h.a b(h9.b bVar, q8.b bVar2) {
            return a.this.f13924a.r(bVar, bVar2, this.f13928b);
        }
    }

    public a(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, HashMap hashMap, h hVar, HashMap hashMap2) {
        this.f13924a = abstractBinaryClassAnnotationAndConstantLoader;
        this.f13925b = hashMap;
        this.c = hVar;
    }

    public final b a(h9.e eVar, String str) {
        v7.g.f(str, "desc");
        String b5 = eVar.b();
        v7.g.e(b5, "name.asString()");
        return new b(new i(b5 + '#' + str));
    }

    public final C0158a b(h9.e eVar, String str) {
        v7.g.f(eVar, "name");
        String b5 = eVar.b();
        v7.g.e(b5, "name.asString()");
        return new C0158a(new i(b5.concat(str)));
    }
}
