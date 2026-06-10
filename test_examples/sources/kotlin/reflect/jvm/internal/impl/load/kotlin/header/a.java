package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.load.kotlin.h;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import u8.q;

/* loaded from: classes.dex */
public final class a implements h.c {

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f13967i = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap f13968j;

    /* renamed from: a  reason: collision with root package name */
    public int[] f13969a = null;

    /* renamed from: b  reason: collision with root package name */
    public String f13970b = null;
    public int c = 0;

    /* renamed from: d  reason: collision with root package name */
    public String[] f13971d = null;

    /* renamed from: e  reason: collision with root package name */
    public String[] f13972e = null;

    /* renamed from: f  reason: collision with root package name */
    public String[] f13973f = null;

    /* renamed from: g  reason: collision with root package name */
    public KotlinClassHeader.Kind f13974g = null;

    /* renamed from: h  reason: collision with root package name */
    public String[] f13975h = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0161a implements h.b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f13976a = new ArrayList();

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
        public final void a() {
            f((String[]) this.f13976a.toArray(new String[0]));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
        public final void b(m9.f fVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
        public final h.a c(h9.b bVar) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
        public final void d(h9.b bVar, h9.e eVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.b
        public final void e(Object obj) {
            if (obj instanceof String) {
                this.f13976a.add((String) obj);
            }
        }

        public abstract void f(String[] strArr);
    }

    /* loaded from: classes.dex */
    public class b implements h.a {
        public b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void b(h9.e eVar, h9.b bVar, h9.e eVar2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void c(Object obj, h9.e eVar) {
            String b5 = eVar.b();
            boolean equals = "k".equals(b5);
            a aVar = a.this;
            if (equals) {
                if (obj instanceof Integer) {
                    KotlinClassHeader.Kind kind = (KotlinClassHeader.Kind) KotlinClassHeader.Kind.f13959j.get(Integer.valueOf(((Integer) obj).intValue()));
                    if (kind == null) {
                        kind = KotlinClassHeader.Kind.f13960k;
                    }
                    aVar.f13974g = kind;
                }
            } else if ("mv".equals(b5)) {
                if (obj instanceof int[]) {
                    aVar.f13969a = (int[]) obj;
                }
            } else if ("xs".equals(b5)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (!str.isEmpty()) {
                        aVar.f13970b = str;
                    }
                }
            } else if ("xi".equals(b5)) {
                if (obj instanceof Integer) {
                    aVar.c = ((Integer) obj).intValue();
                }
            } else if ("pn".equals(b5) && (obj instanceof String) && !((String) obj).isEmpty()) {
                aVar.getClass();
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void d(h9.e eVar, m9.f fVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final h.a e(h9.b bVar, h9.e eVar) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final h.b f(h9.e eVar) {
            String b5 = eVar.b();
            if ("d1".equals(b5)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.b(this);
            }
            if ("d2".equals(b5)) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.c(this);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements h.a {
        public c() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void b(h9.e eVar, h9.b bVar, h9.e eVar2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void c(Object obj, h9.e eVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void d(h9.e eVar, m9.f fVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final h.a e(h9.b bVar, h9.e eVar) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final h.b f(h9.e eVar) {
            if ("b".equals(eVar.b())) {
                return new kotlin.reflect.jvm.internal.impl.load.kotlin.header.d(this);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class d implements h.a {
        public d() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void b(h9.e eVar, h9.b bVar, h9.e eVar2) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void c(Object obj, h9.e eVar) {
            String str;
            String b5 = eVar.b();
            boolean equals = "version".equals(b5);
            a aVar = a.this;
            if (equals) {
                if (obj instanceof int[]) {
                    aVar.f13969a = (int[]) obj;
                }
            } else if ("multifileClassName".equals(b5)) {
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                aVar.f13970b = str;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final void d(h9.e eVar, m9.f fVar) {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final h.a e(h9.b bVar, h9.e eVar) {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.a
        public final h.b f(h9.e eVar) {
            String b5 = eVar.b();
            if (!"data".equals(b5) && !"filePartClassNames".equals(b5)) {
                if ("strings".equals(b5)) {
                    return new f(this);
                }
                return null;
            }
            return new e(this);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f13968j = hashMap;
        hashMap.put(h9.b.l(new h9.c("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.f13961l);
        hashMap.put(h9.b.l(new h9.c("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.f13962m);
        hashMap.put(h9.b.l(new h9.c("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.f13963o);
        hashMap.put(h9.b.l(new h9.c("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.f13964p);
        hashMap.put(h9.b.l(new h9.c("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.n);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.c
    public final void a() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.h.c
    public final h.a b(h9.b bVar, q8.b bVar2) {
        KotlinClassHeader.Kind kind;
        h9.c b5 = bVar.b();
        if (b5.equals(q.f17864a)) {
            return new b();
        }
        if (b5.equals(q.f17876o)) {
            return new c();
        }
        if (f13967i || this.f13974g != null || (kind = (KotlinClassHeader.Kind) f13968j.get(bVar)) == null) {
            return null;
        }
        this.f13974g = kind;
        return new d();
    }
}
