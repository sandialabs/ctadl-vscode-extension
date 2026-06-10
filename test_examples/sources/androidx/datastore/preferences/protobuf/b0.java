package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f4842b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final h0 f4843a;

    /* loaded from: classes.dex */
    public static class a implements h0 {
        @Override // androidx.datastore.preferences.protobuf.h0
        public final g0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public final boolean b(Class<?> cls) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements h0 {

        /* renamed from: a  reason: collision with root package name */
        public final h0[] f4844a;

        public b(h0... h0VarArr) {
            this.f4844a = h0VarArr;
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public final g0 a(Class<?> cls) {
            h0[] h0VarArr;
            for (h0 h0Var : this.f4844a) {
                if (h0Var.b(cls)) {
                    return h0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }

        @Override // androidx.datastore.preferences.protobuf.h0
        public final boolean b(Class<?> cls) {
            for (h0 h0Var : this.f4844a) {
                if (h0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public b0() {
        h0 h0Var;
        h0[] h0VarArr = new h0[2];
        h0VarArr[0] = s.f4934a;
        try {
            h0Var = (h0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            h0Var = f4842b;
        }
        h0VarArr[1] = h0Var;
        b bVar = new b(h0VarArr);
        Charset charset = u.f4942a;
        this.f4843a = bVar;
    }
}
