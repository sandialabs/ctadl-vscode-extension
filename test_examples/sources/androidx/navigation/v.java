package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class v<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final c f5541b = new c();
    public static final d c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final e f5542d = new e();

    /* renamed from: e  reason: collision with root package name */
    public static final f f5543e = new f();

    /* renamed from: f  reason: collision with root package name */
    public static final g f5544f = new g();

    /* renamed from: g  reason: collision with root package name */
    public static final h f5545g = new h();

    /* renamed from: h  reason: collision with root package name */
    public static final i f5546h = new i();

    /* renamed from: i  reason: collision with root package name */
    public static final j f5547i = new j();

    /* renamed from: j  reason: collision with root package name */
    public static final k f5548j = new k();

    /* renamed from: k  reason: collision with root package name */
    public static final a f5549k = new a();

    /* renamed from: l  reason: collision with root package name */
    public static final b f5550l = new b();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5551a;

    /* loaded from: classes.dex */
    public class a extends v<String> {
        public a() {
            super(true);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "string";
        }

        @Override // androidx.navigation.v
        public final String c(String str) {
            return str;
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends v<String[]> {
        public b() {
            super(true);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "string[]";
        }

        @Override // androidx.navigation.v
        public final String[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* loaded from: classes.dex */
    public class c extends v<Integer> {
        public c() {
            super(false);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "integer";
        }

        @Override // androidx.navigation.v
        public final Integer c(String str) {
            int parseInt;
            if (str.startsWith("0x")) {
                parseInt = Integer.parseInt(str.substring(2), 16);
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class d extends v<Integer> {
        public d() {
            super(false);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "reference";
        }

        @Override // androidx.navigation.v
        public final Integer c(String str) {
            int parseInt;
            if (str.startsWith("0x")) {
                parseInt = Integer.parseInt(str.substring(2), 16);
            } else {
                parseInt = Integer.parseInt(str);
            }
            return Integer.valueOf(parseInt);
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class e extends v<int[]> {
        public e() {
            super(true);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "integer[]";
        }

        @Override // androidx.navigation.v
        public final int[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class f extends v<Long> {
        public f() {
            super(false);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "long";
        }

        @Override // androidx.navigation.v
        public final Long c(String str) {
            long parseLong;
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            return Long.valueOf(parseLong);
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, Long l2) {
            bundle.putLong(str, l2.longValue());
        }
    }

    /* loaded from: classes.dex */
    public class g extends v<long[]> {
        public g() {
            super(true);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "long[]";
        }

        @Override // androidx.navigation.v
        public final long[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* loaded from: classes.dex */
    public class h extends v<Float> {
        public h() {
            super(false);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "float";
        }

        @Override // androidx.navigation.v
        public final Float c(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, Float f10) {
            bundle.putFloat(str, f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class i extends v<float[]> {
        public i() {
            super(true);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "float[]";
        }

        @Override // androidx.navigation.v
        public final float[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* loaded from: classes.dex */
    public class j extends v<Boolean> {
        public j() {
            super(false);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "boolean";
        }

        @Override // androidx.navigation.v
        public final Boolean c(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class k extends v<boolean[]> {
        public k() {
            super(true);
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return "boolean[]";
        }

        @Override // androidx.navigation.v
        public final boolean[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class l<D extends Enum> extends p<D> {
        public final Class<D> n;

        public l(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.v.p, androidx.navigation.v
        public final String b() {
            return this.n.getName();
        }

        @Override // androidx.navigation.v.p
        /* renamed from: f */
        public final D e(String str) {
            D[] enumConstants;
            Class<D> cls = this.n;
            for (D d5 : cls.getEnumConstants()) {
                if (d5.name().equals(str)) {
                    return d5;
                }
            }
            StringBuilder p10 = a4.b.p("Enum value ", str, " not found for type ");
            p10.append(cls.getName());
            p10.append(".");
            throw new IllegalArgumentException(p10.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class m<D extends Parcelable> extends v<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f5552m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.f5552m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return this.f5552m.getName();
        }

        @Override // androidx.navigation.v
        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f5552m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && m.class == obj.getClass()) {
                return this.f5552m.equals(((m) obj).f5552m);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5552m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class n<D> extends v<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f5553m;

        public n(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
            }
            this.f5553m = cls;
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return this.f5553m.getName();
        }

        @Override // androidx.navigation.v
        public final D c(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, D d5) {
            this.f5553m.cast(d5);
            if (d5 != null && !(d5 instanceof Parcelable)) {
                if (d5 instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) d5);
                    return;
                }
                return;
            }
            bundle.putParcelable(str, (Parcelable) d5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && n.class == obj.getClass()) {
                return this.f5553m.equals(((n) obj).f5553m);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5553m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class o<D extends Serializable> extends v<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f5554m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.f5554m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public final String b() {
            return this.f5554m.getName();
        }

        @Override // androidx.navigation.v
        public final Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, Object obj) {
            ?? r42 = (Serializable[]) obj;
            this.f5554m.cast(r42);
            bundle.putSerializable(str, r42);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && o.class == obj.getClass()) {
                return this.f5554m.equals(((o) obj).f5554m);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5554m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class p<D extends Serializable> extends v<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f5555m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f5555m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        public p(Class cls, int i10) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f5555m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // androidx.navigation.v
        public final Object a(String str, Bundle bundle) {
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.v
        public String b() {
            return this.f5555m.getName();
        }

        @Override // androidx.navigation.v
        public final void d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.f5555m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        @Override // androidx.navigation.v
        /* renamed from: e */
        public D c(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.f5555m.equals(((p) obj).f5555m);
            }
            return false;
        }

        public final int hashCode() {
            return this.f5555m.hashCode();
        }
    }

    public v(boolean z10) {
        this.f5551a = z10;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t10);

    public final String toString() {
        return b();
    }
}
