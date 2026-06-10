package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.activity.e;
import h9.c;
import ha.i;
import v7.g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum n uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class FunctionClassKind {

    /* renamed from: k  reason: collision with root package name */
    public static final a f13334k;

    /* renamed from: l  reason: collision with root package name */
    public static final FunctionClassKind f13335l;

    /* renamed from: m  reason: collision with root package name */
    public static final FunctionClassKind f13336m;
    public static final FunctionClassKind n;

    /* renamed from: o  reason: collision with root package name */
    public static final FunctionClassKind f13337o;

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ FunctionClassKind[] f13338p;

    /* renamed from: i  reason: collision with root package name */
    public final c f13339i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13340j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0148a {

            /* renamed from: a  reason: collision with root package name */
            public final FunctionClassKind f13341a;

            /* renamed from: b  reason: collision with root package name */
            public final int f13342b;

            public C0148a(FunctionClassKind functionClassKind, int i10) {
                this.f13341a = functionClassKind;
                this.f13342b = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0148a) {
                    C0148a c0148a = (C0148a) obj;
                    return this.f13341a == c0148a.f13341a && this.f13342b == c0148a.f13342b;
                }
                return false;
            }

            public final int hashCode() {
                return (this.f13341a.hashCode() * 31) + this.f13342b;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("KindWithArity(kind=");
                sb.append(this.f13341a);
                sb.append(", arity=");
                return e.h(sb, this.f13342b, ')');
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C0148a a(String str, c cVar) {
            FunctionClassKind functionClassKind;
            boolean z10;
            Integer valueOf;
            boolean z11;
            boolean z12;
            g.f(cVar, "packageFqName");
            FunctionClassKind[] values = FunctionClassKind.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    functionClassKind = values[i10];
                    if (g.a(functionClassKind.f13339i, cVar) && i.X0(str, functionClassKind.f13340j, false)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        break;
                    }
                    i10++;
                } else {
                    functionClassKind = null;
                    break;
                }
            }
            if (functionClassKind == null) {
                return null;
            }
            String substring = str.substring(functionClassKind.f13340j.length());
            g.e(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int length2 = substring.length();
                int i11 = 0;
                for (int i12 = 0; i12 < length2; i12++) {
                    int charAt = substring.charAt(i12) - '0';
                    if (charAt >= 0 && charAt < 10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i11 = (i11 * 10) + charAt;
                    }
                }
                valueOf = Integer.valueOf(i11);
                if (valueOf != null) {
                    return null;
                }
                return new C0148a(functionClassKind, valueOf.intValue());
            }
            valueOf = null;
            if (valueOf != null) {
            }
        }
    }

    static {
        FunctionClassKind functionClassKind = new FunctionClassKind("Function", 0, kotlin.reflect.jvm.internal.impl.builtins.g.f13354k, "Function");
        f13335l = functionClassKind;
        FunctionClassKind functionClassKind2 = new FunctionClassKind("SuspendFunction", 1, kotlin.reflect.jvm.internal.impl.builtins.g.f13348e, "SuspendFunction");
        f13336m = functionClassKind2;
        c cVar = kotlin.reflect.jvm.internal.impl.builtins.g.f13351h;
        FunctionClassKind functionClassKind3 = new FunctionClassKind("KFunction", 2, cVar, "KFunction");
        n = functionClassKind3;
        FunctionClassKind functionClassKind4 = new FunctionClassKind("KSuspendFunction", 3, cVar, "KSuspendFunction");
        f13337o = functionClassKind4;
        f13338p = new FunctionClassKind[]{functionClassKind, functionClassKind2, functionClassKind3, functionClassKind4};
        f13334k = new a();
    }

    public FunctionClassKind(String str, int i10, c cVar, String str2) {
        this.f13339i = cVar;
        this.f13340j = str2;
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) f13338p.clone();
    }

    public final h9.e a(int i10) {
        return h9.e.k(this.f13340j + i10);
    }
}
