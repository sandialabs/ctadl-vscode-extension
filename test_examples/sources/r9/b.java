package r9;

import r9.c;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f17170a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f17171b;

        static {
            c.a aVar = c.c;
            aVar.getClass();
            int i10 = c.f17180k;
            aVar.getClass();
            int i11 = c.f17178i;
            aVar.getClass();
            f17171b = (~(c.f17179j | i11)) & i10;
        }

        @Override // r9.b
        public final int a() {
            return f17171b;
        }
    }

    /* renamed from: r9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0218b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0218b f17172a = new C0218b();

        @Override // r9.b
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
