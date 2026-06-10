package l8;

import androidx.datastore.preferences.PreferencesProto$Value;
import da.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import l8.m0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final d f15839a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f15840b;
    public static final f c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f15841d;

    /* renamed from: e  reason: collision with root package name */
    public static final h f15842e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f15843f;

    /* renamed from: g  reason: collision with root package name */
    public static final j f15844g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f15845h;

    /* renamed from: i  reason: collision with root package name */
    public static final C0183l f15846i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<m> f15847j;

    /* renamed from: k  reason: collision with root package name */
    public static final Map<m, Integer> f15848k;

    /* renamed from: l  reason: collision with root package name */
    public static final h f15849l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f15850m;
    public static final b n;
    @Deprecated

    /* renamed from: o  reason: collision with root package name */
    public static final c f15851o;

    /* renamed from: p  reason: collision with root package name */
    public static final da.f f15852p;

    /* renamed from: q  reason: collision with root package name */
    public static final HashMap f15853q;

    /* loaded from: classes.dex */
    public static class a implements s9.g {
        @Override // s9.g
        public final y9.r b() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes.dex */
    public static class b implements s9.g {
        @Override // s9.g
        public final y9.r b() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes.dex */
    public static class c implements s9.g {
        @Override // s9.g
        public final y9.r b() {
            throw new IllegalStateException("This method should not be called");
        }
    }

    /* loaded from: classes.dex */
    public static class d extends l8.k {
        public d(m0.e eVar) {
            super(eVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "what";
            } else if (i10 != 2) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "isVisible";
            } else {
                objArr[2] = "hasContainingSourceFile";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0, types: [l8.f, l8.j] */
        /* JADX WARN: Type inference failed for: r5v1, types: [l8.f] */
        /* JADX WARN: Type inference failed for: r5v2, types: [l8.f] */
        /* JADX WARN: Type inference failed for: r5v4, types: [l8.f] */
        @Override // l8.m
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            boolean z10;
            if (fVar != null) {
                if (k9.d.t(jVar)) {
                    if (k9.d.f(fVar) != e0.f15836a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return l.d(jVar, fVar);
                    }
                }
                if (jVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) {
                    ((kotlin.reflect.jvm.internal.impl.descriptors.c) jVar).c();
                }
                while (jVar != 0) {
                    jVar = jVar.c();
                    if (jVar instanceof l8.b) {
                        if (!k9.d.l(jVar)) {
                            break;
                        }
                    }
                    if (jVar instanceof u) {
                        break;
                    }
                }
                if (jVar == 0) {
                    return false;
                }
                while (fVar != null) {
                    if (jVar == fVar) {
                        return true;
                    }
                    if (fVar instanceof u) {
                        if (!(jVar instanceof u) || !jVar.e().equals(((u) fVar).e()) || !k9.d.d(fVar).equals(k9.d.d(jVar))) {
                            return false;
                        }
                        return true;
                    }
                    fVar = fVar.c();
                }
                return false;
            }
            e(2);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends l8.k {
        public e(m0.f fVar) {
            super(fVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            l8.f i10;
            if (fVar != null) {
                if (l.f15839a.c(bVar, jVar, fVar)) {
                    if (bVar == l.n) {
                        return true;
                    }
                    if (bVar != l.f15850m && (i10 = k9.d.i(jVar, l8.b.class, true)) != null && (bVar instanceof s9.i)) {
                        return ((s9.i) bVar).n().a().equals(i10.a());
                    }
                }
                return false;
            }
            e(1);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends l8.k {
        public f(m0.g gVar) {
            super(gVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "whatDeclaration";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "fromClass";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "doesReceiverFitForProtectedVisibility";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
            if (kotlin.reflect.jvm.internal.impl.types.f.a(r0) == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
            return true;
         */
        @Override // l8.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            l8.b bVar2;
            if (fVar != null) {
                l8.b bVar3 = (l8.b) k9.d.i(jVar, l8.b.class, true);
                boolean z10 = false;
                l8.b bVar4 = (l8.b) k9.d.i(fVar, l8.b.class, false);
                if (bVar4 == null) {
                    return false;
                }
                if (bVar3 != null && k9.d.l(bVar3) && (bVar2 = (l8.b) k9.d.i(bVar3, l8.b.class, true)) != null && k9.d.r(bVar4, bVar2)) {
                    return true;
                }
                l8.j v3 = k9.d.v(jVar);
                l8.b bVar5 = (l8.b) k9.d.i(v3, l8.b.class, true);
                if (bVar5 == null) {
                    return false;
                }
                if (k9.d.r(bVar4, bVar5)) {
                    if (bVar != l.f15851o) {
                        if ((v3 instanceof CallableMemberDescriptor) && !(v3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c) && bVar != l.n) {
                            if (bVar != l.f15850m && bVar != null) {
                                if (bVar instanceof s9.h) {
                                    y9.r c = ((s9.h) bVar).c();
                                    if (!k9.d.s(c, bVar4)) {
                                    }
                                } else {
                                    bVar.b();
                                    throw null;
                                }
                            }
                        }
                        z10 = true;
                    }
                }
                return c(bVar, jVar, bVar4.c());
            }
            e(1);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends l8.k {
        public g(m0.b bVar) {
            super(bVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            if (fVar != null) {
                if (!k9.d.d(fVar).h0(k9.d.d(jVar))) {
                    return false;
                }
                l.f15852p.a(jVar, fVar);
                return true;
            }
            e(1);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends l8.k {
        public h(m0.h hVar) {
            super(hVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            if (fVar != null) {
                return true;
            }
            e(1);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class i extends l8.k {
        public i(m0.d dVar) {
            super(dVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            if (fVar == null) {
                e(1);
                throw null;
            }
            throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
        }
    }

    /* loaded from: classes.dex */
    public static class j extends l8.k {
        public j(m0.a aVar) {
            super(aVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            if (fVar == null) {
                e(1);
                throw null;
            }
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }

    /* loaded from: classes.dex */
    public static class k extends l8.k {
        public k(m0.c cVar) {
            super(cVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            if (fVar != null) {
                return false;
            }
            e(1);
            throw null;
        }
    }

    /* renamed from: l8.l$l  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0183l extends l8.k {
        public C0183l(m0.i iVar) {
            super(iVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(b bVar, l8.j jVar, l8.f fVar) {
            if (fVar != null) {
                return false;
            }
            e(1);
            throw null;
        }
    }

    static {
        da.f fVar;
        d dVar = new d(m0.e.c);
        f15839a = dVar;
        e eVar = new e(m0.f.c);
        f15840b = eVar;
        f fVar2 = new f(m0.g.c);
        c = fVar2;
        g gVar = new g(m0.b.c);
        f15841d = gVar;
        h hVar = new h(m0.h.c);
        f15842e = hVar;
        i iVar = new i(m0.d.c);
        f15843f = iVar;
        j jVar = new j(m0.a.c);
        f15844g = jVar;
        k kVar = new k(m0.c.c);
        f15845h = kVar;
        C0183l c0183l = new C0183l(m0.i.c);
        f15846i = c0183l;
        f15847j = Collections.unmodifiableSet(a1.c.w1(dVar, eVar, gVar, iVar));
        HashMap hashMap = new HashMap(6);
        hashMap.put(eVar, 0);
        hashMap.put(dVar, 0);
        hashMap.put(gVar, 1);
        hashMap.put(fVar2, 1);
        hashMap.put(hVar, 2);
        f15848k = Collections.unmodifiableMap(hashMap);
        f15849l = hVar;
        f15850m = new a();
        n = new b();
        f15851o = new c();
        Iterator it = ServiceLoader.load(da.f.class, da.f.class.getClassLoader()).iterator();
        if (it.hasNext()) {
            fVar = (da.f) it.next();
        } else {
            fVar = f.a.f10482a;
        }
        f15852p = fVar;
        f15853q = new HashMap();
        f(dVar);
        f(eVar);
        f(fVar2);
        f(gVar);
        f(hVar);
        f(iVar);
        f(jVar);
        f(kVar);
        f(c0183l);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        String str = i10 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 16 ? 3 : 2];
        if (i10 != 1 && i10 != 3 && i10 != 5 && i10 != 7) {
            switch (i10) {
                case ma.i.f16046m /* 9 */:
                    break;
                case ma.i.f16047o /* 10 */:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case ma.i.f16049q /* 15 */:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i10 == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i10) {
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case ma.i.f16046m /* 9 */:
                    objArr[2] = "findInvisibleMember";
                    break;
                case ma.i.f16047o /* 10 */:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case ma.i.f16049q /* 15 */:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i10 != 16) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "from";
        if (i10 == 16) {
        }
        switch (i10) {
        }
        String format2 = String.format(str, objArr);
        if (i10 != 16) {
        }
    }

    public static Integer b(m mVar, m mVar2) {
        if (mVar != null) {
            if (mVar2 != null) {
                Integer a10 = mVar.a().a(mVar2.a());
                if (a10 != null) {
                    return a10;
                }
                Integer a11 = mVar2.a().a(mVar.a());
                if (a11 == null) {
                    return null;
                }
                return Integer.valueOf(-a11.intValue());
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002a, code lost:
        if ((r5 instanceof o8.i0) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        r4 = c(r4, ((o8.i0) r5).Y(), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r4 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l8.j c(b bVar, l8.j jVar, l8.f fVar) {
        if (jVar != null) {
            if (fVar != null) {
                l8.f a10 = jVar.a();
                while (true) {
                    l8.j jVar2 = (l8.j) a10;
                    if (jVar2 == null || jVar2.g() == f15843f) {
                        break;
                    } else if (!jVar2.g().c(bVar, jVar2, fVar)) {
                        return jVar2;
                    } else {
                        a10 = k9.d.i(jVar2, l8.j.class, true);
                    }
                }
            } else {
                a(9);
                throw null;
            }
        } else {
            a(8);
            throw null;
        }
    }

    public static boolean d(l8.f fVar, l8.f fVar2) {
        if (fVar2 == null) {
            a(7);
            throw null;
        }
        e0 f10 = k9.d.f(fVar2);
        if (f10 != e0.f15836a) {
            return f10.equals(k9.d.f(fVar));
        }
        return false;
    }

    public static boolean e(m mVar) {
        if (mVar == null) {
            a(14);
            throw null;
        }
        if (mVar != f15839a && mVar != f15840b) {
            return false;
        }
        return true;
    }

    public static void f(l8.k kVar) {
        f15853q.put(kVar.f15838a, kVar);
    }

    public static m g(n0 n0Var) {
        if (n0Var == null) {
            a(15);
            throw null;
        }
        m mVar = (m) f15853q.get(n0Var);
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + n0Var);
    }
}
