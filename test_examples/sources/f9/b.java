package f9;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import ma.i;

/* loaded from: classes.dex */
public final class b {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;

    /* renamed from: a  reason: collision with root package name */
    public static final a f10977a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f10978b;
    public static final a c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0117b f10979d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0117b f10980e;

    /* renamed from: f  reason: collision with root package name */
    public static final C0117b f10981f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f10982g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f10983h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f10984i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f10985j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f10986k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f10987l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f10988m;
    public static final a n;

    /* renamed from: o  reason: collision with root package name */
    public static final C0117b f10989o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f10990p;

    /* renamed from: q  reason: collision with root package name */
    public static final a f10991q;

    /* renamed from: r  reason: collision with root package name */
    public static final a f10992r;

    /* renamed from: s  reason: collision with root package name */
    public static final a f10993s;

    /* renamed from: t  reason: collision with root package name */
    public static final a f10994t;

    /* renamed from: u  reason: collision with root package name */
    public static final a f10995u;

    /* renamed from: v  reason: collision with root package name */
    public static final a f10996v;

    /* renamed from: w  reason: collision with root package name */
    public static final a f10997w;

    /* renamed from: x  reason: collision with root package name */
    public static final a f10998x;

    /* renamed from: y  reason: collision with root package name */
    public static final a f10999y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f11000z;

    /* loaded from: classes.dex */
    public static class a extends c<Boolean> {
        public a(int i10) {
            super(i10, 1);
        }

        public final Boolean c(int i10) {
            boolean z10;
            if ((i10 & (1 << this.f11001a)) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        public final int d(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f11001a;
            }
            return 0;
        }
    }

    /* renamed from: f9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0117b<E extends f.a> extends c<E> {
        public final E[] c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0117b(int i10, E[] eArr) {
            super(i10, r0);
            int i11 = 1;
            if (eArr != null) {
                int length = eArr.length - 1;
                if (length != 0) {
                    for (int i12 = 31; i12 >= 0; i12--) {
                        if (((1 << i12) & length) != 0) {
                            i11 = 1 + i12;
                        }
                    }
                    throw new IllegalStateException("Empty enum: " + eArr.getClass());
                }
                this.c = eArr;
                return;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public final Object c(int i10) {
            E[] eArr;
            int i11 = this.f11001a;
            int i12 = (i10 & (((1 << this.f11002b) - 1) << i11)) >> i11;
            for (E e10 : this.c) {
                if (e10.c() == i12) {
                    return e10;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f11001a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11002b;

        public c(int i10, int i11) {
            this.f11001a = i10;
            this.f11002b = i11;
        }

        public static a a(c<?> cVar) {
            return new a(cVar.f11001a + cVar.f11002b);
        }

        public static a b() {
            return new a(0);
        }
    }

    static {
        a b5 = c.b();
        f10977a = b5;
        f10978b = c.a(b5);
        a b10 = c.b();
        c = b10;
        C0117b c0117b = new C0117b(1, ProtoBuf$Visibility.values());
        f10979d = c0117b;
        ProtoBuf$Modality[] values = ProtoBuf$Modality.values();
        int i10 = 1 + c0117b.f11002b;
        C0117b c0117b2 = new C0117b(i10, values);
        f10980e = c0117b2;
        ProtoBuf$Class.Kind[] values2 = ProtoBuf$Class.Kind.values();
        int i11 = c0117b2.f11002b;
        C0117b c0117b3 = new C0117b(i10 + i11, values2);
        f10981f = c0117b3;
        a a10 = c.a(c0117b3);
        f10982g = a10;
        a a11 = c.a(a10);
        f10983h = a11;
        a a12 = c.a(a11);
        f10984i = a12;
        a a13 = c.a(a12);
        f10985j = a13;
        a a14 = c.a(a13);
        f10986k = a14;
        f10987l = c.a(a14);
        a a15 = c.a(c0117b);
        f10988m = a15;
        n = c.a(a15);
        C0117b c0117b4 = new C0117b(i10 + i11, ProtoBuf$MemberKind.values());
        f10989o = c0117b4;
        a a16 = c.a(c0117b4);
        f10990p = a16;
        a a17 = c.a(a16);
        f10991q = a17;
        a a18 = c.a(a17);
        f10992r = a18;
        a a19 = c.a(a18);
        f10993s = a19;
        a a20 = c.a(a19);
        f10994t = a20;
        a a21 = c.a(a20);
        f10995u = a21;
        a a22 = c.a(a21);
        f10996v = a22;
        f10997w = c.a(a22);
        a a23 = c.a(c0117b4);
        f10998x = a23;
        a a24 = c.a(a23);
        f10999y = a24;
        a a25 = c.a(a24);
        f11000z = a25;
        a a26 = c.a(a25);
        A = a26;
        a a27 = c.a(a26);
        B = a27;
        a a28 = c.a(a27);
        C = a28;
        a a29 = c.a(a28);
        D = a29;
        a a30 = c.a(a29);
        E = a30;
        F = c.a(a30);
        a a31 = c.a(b10);
        G = a31;
        a a32 = c.a(a31);
        H = a32;
        I = c.a(a32);
        a a33 = c.a(c0117b2);
        J = a33;
        a a34 = c.a(a33);
        K = a34;
        L = c.a(a34);
        M = c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            if (i10 == 2) {
                objArr[0] = "kind";
            } else if (i10 != 5) {
                if (i10 != 6) {
                    if (i10 != 8) {
                        if (i10 != 9) {
                            if (i10 != 11) {
                                objArr[0] = "visibility";
                            }
                        }
                    }
                }
                objArr[0] = "memberKind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i10) {
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    objArr[2] = "getConstructorFlags";
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case i.f16046m /* 9 */:
                    objArr[2] = "getPropertyFlags";
                    break;
                case i.f16047o /* 10 */:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i10) {
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
