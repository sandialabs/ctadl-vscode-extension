package d9;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f10449a = new c(JvmPrimitiveType.BOOLEAN);

    /* renamed from: b  reason: collision with root package name */
    public static final c f10450b = new c(JvmPrimitiveType.CHAR);
    public static final c c = new c(JvmPrimitiveType.BYTE);

    /* renamed from: d  reason: collision with root package name */
    public static final c f10451d = new c(JvmPrimitiveType.SHORT);

    /* renamed from: e  reason: collision with root package name */
    public static final c f10452e = new c(JvmPrimitiveType.INT);

    /* renamed from: f  reason: collision with root package name */
    public static final c f10453f = new c(JvmPrimitiveType.FLOAT);

    /* renamed from: g  reason: collision with root package name */
    public static final c f10454g = new c(JvmPrimitiveType.LONG);

    /* renamed from: h  reason: collision with root package name */
    public static final c f10455h = new c(JvmPrimitiveType.DOUBLE);

    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: i  reason: collision with root package name */
        public final d f10456i;

        public a(d dVar) {
            v7.g.f(dVar, "elementType");
            this.f10456i = dVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d {

        /* renamed from: i  reason: collision with root package name */
        public final String f10457i;

        public b(String str) {
            v7.g.f(str, "internalName");
            this.f10457i = str;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends d {

        /* renamed from: i  reason: collision with root package name */
        public final JvmPrimitiveType f10458i;

        public c(JvmPrimitiveType jvmPrimitiveType) {
            this.f10458i = jvmPrimitiveType;
        }
    }

    public final String toString() {
        return e.e(this);
    }
}
