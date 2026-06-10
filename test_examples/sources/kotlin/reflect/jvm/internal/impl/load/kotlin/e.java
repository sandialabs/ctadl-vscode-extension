package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.d0;
import l8.s;
import m9.j;
import m9.n;
import y9.r;

/* loaded from: classes.dex */
public final class e extends AbstractBinaryClassAnnotationAndConstantLoader<m8.c, m9.g<?>> {
    public final s c;

    /* renamed from: d  reason: collision with root package name */
    public final NotFoundClasses f13935d;

    /* renamed from: e  reason: collision with root package name */
    public final u9.a f13936e;

    /* loaded from: classes.dex */
    public abstract class a implements h.a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0159a implements h.b {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<m9.g<?>> f13938a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e f13939b;
            public final /* synthetic */ h9.e c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ a f13940d;

            /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.e$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0160a implements h.a {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ h.a f13941a;

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ h.a f13942b;
                public final /* synthetic */ C0159a c;

                /* renamed from: d  reason: collision with root package name */
                public final /* synthetic */ ArrayList<m8.c> f13943d;

                public C0160a(f fVar, C0159a c0159a, ArrayList arrayList) {
                    this.f13942b = fVar;
                    this.c = c0159a;
                    this.f13943d = arrayList;
                    this.f13941a = fVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
                public final void a() {
                    this.f13942b.a();
                    this.c.f13938a.add(new m9.a((m8.c) kotlin.collections.c.C2(this.f13943d)));
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
                public final void b(h9.e eVar, h9.b bVar, h9.e eVar2) {
                    this.f13941a.b(eVar, bVar, eVar2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
                public final void c(Object obj, h9.e eVar) {
                    this.f13941a.c(obj, eVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
                public final void d(h9.e eVar, m9.f fVar) {
                    this.f13941a.d(eVar, fVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
                public final h.a e(h9.b bVar, h9.e eVar) {
                    return this.f13941a.e(bVar, eVar);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
                public final h.b f(h9.e eVar) {
                    return this.f13941a.f(eVar);
                }
            }

            public C0159a(e eVar, h9.e eVar2, a aVar) {
                this.f13939b = eVar;
                this.c = eVar2;
                this.f13940d = aVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
            public final void a() {
                ArrayList<m9.g<?>> arrayList = this.f13938a;
                f fVar = (f) this.f13940d;
                fVar.getClass();
                v7.g.f(arrayList, "elements");
                h9.e eVar = this.c;
                if (eVar != null) {
                    kotlin.reflect.jvm.internal.impl.descriptors.h t10 = v8.b.t(eVar, fVar.f13945d);
                    if (t10 != null) {
                        HashMap<h9.e, m9.g<?>> hashMap = fVar.f13944b;
                        List G = m0.b.G(arrayList);
                        r b5 = t10.b();
                        v7.g.e(b5, "parameter.type");
                        hashMap.put(eVar, ConstantValueFactory.b(G, b5));
                    } else if (fVar.c.p(fVar.f13946e) && v7.g.a(eVar.b(), "value")) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<m9.g<?>> it = arrayList.iterator();
                        while (it.hasNext()) {
                            m9.g<?> next = it.next();
                            if (next instanceof m9.a) {
                                arrayList2.add(next);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            fVar.f13947f.add((m8.c) ((m9.a) it2.next()).f16022a);
                        }
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
            public final void b(m9.f fVar) {
                this.f13938a.add(new n(fVar));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
            public final h.a c(h9.b bVar) {
                ArrayList arrayList = new ArrayList();
                return new C0160a(this.f13939b.q(bVar, d0.f15835a, arrayList), this, arrayList);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
            public final void d(h9.b bVar, h9.e eVar) {
                this.f13938a.add(new m9.i(bVar, eVar));
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
            public final void e(Object obj) {
                this.f13938a.add(e.u(this.f13939b, this.c, obj));
            }
        }

        public a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void b(h9.e eVar, h9.b bVar, h9.e eVar2) {
            ((f) this).f13944b.put(eVar, new m9.i(bVar, eVar2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void c(Object obj, h9.e eVar) {
            ((f) this).f13944b.put(eVar, e.u(e.this, eVar, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void d(h9.e eVar, m9.f fVar) {
            ((f) this).f13944b.put(eVar, new n(fVar));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final h.a e(h9.b bVar, h9.e eVar) {
            ArrayList arrayList = new ArrayList();
            return new d(e.this.q(bVar, d0.f15835a, arrayList), this, eVar, arrayList);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final h.b f(h9.e eVar) {
            return new C0159a(e.this, eVar, this);
        }

        public abstract void g(h9.e eVar, m9.g<?> gVar);
    }

    public e(kotlin.reflect.jvm.internal.impl.descriptors.impl.c cVar, NotFoundClasses notFoundClasses, LockBasedStorageManager lockBasedStorageManager, q8.f fVar) {
        super(lockBasedStorageManager, fVar);
        this.c = cVar;
        this.f13935d = notFoundClasses;
        this.f13936e = new u9.a(cVar, notFoundClasses);
    }

    public static final m9.g u(e eVar, h9.e eVar2, Object obj) {
        eVar.getClass();
        m9.g c = ConstantValueFactory.c(obj);
        if (c == null) {
            String str = "Unsupported annotation argument: " + eVar2;
            v7.g.f(str, "message");
            return new j.a(str);
        }
        return c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final f q(h9.b bVar, d0 d0Var, List list) {
        v7.g.f(list, "result");
        return new f(this, FindClassInModuleKt.c(this.c, bVar, this.f13935d), bVar, list, d0Var);
    }
}
