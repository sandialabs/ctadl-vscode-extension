package u8;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.HashMap;
import l8.l;
import l8.u;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17852a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f17853b;
    public static final c c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f17854d;

    /* loaded from: classes.dex */
    public static class a extends l8.k {
        public a(p8.a aVar) {
            super(aVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(l.b bVar, l8.j jVar, l8.f fVar) {
            if (fVar != null) {
                return k.c(jVar, fVar);
            }
            e(1);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends l8.k {
        public b(p8.c cVar) {
            super(cVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(l.b bVar, l8.j jVar, l8.f fVar) {
            if (fVar != null) {
                return k.b(bVar, jVar, fVar);
            }
            e(1);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends l8.k {
        public c(p8.b bVar) {
            super(bVar);
        }

        public static /* synthetic */ void e(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // l8.m
        public final boolean c(l.b bVar, l8.j jVar, l8.f fVar) {
            if (fVar != null) {
                return k.b(bVar, jVar, fVar);
            }
            e(1);
            throw null;
        }
    }

    static {
        a aVar = new a(p8.a.c);
        f17852a = aVar;
        b bVar = new b(p8.c.c);
        f17853b = bVar;
        c cVar = new c(p8.b.c);
        c = cVar;
        HashMap hashMap = new HashMap();
        f17854d = hashMap;
        hashMap.put(aVar.f15838a, aVar);
        hashMap.put(bVar.f15838a, bVar);
        hashMap.put(cVar.f15838a, cVar);
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                objArr[0] = "first";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                objArr[0] = "second";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String format = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static boolean b(l.b bVar, l8.j jVar, l8.f fVar) {
        if (fVar == null) {
            a(1);
            throw null;
        } else if (c(k9.d.v(jVar), fVar)) {
            return true;
        } else {
            return l8.l.c.c(bVar, jVar, fVar);
        }
    }

    public static boolean c(l8.f fVar, l8.f fVar2) {
        if (fVar == null) {
            a(2);
            throw null;
        } else if (fVar2 == null) {
            a(3);
            throw null;
        } else {
            u uVar = (u) k9.d.i(fVar, u.class, false);
            u uVar2 = (u) k9.d.i(fVar2, u.class, false);
            return (uVar2 == null || uVar == null || !uVar.e().equals(uVar2.e())) ? false : true;
        }
    }
}
