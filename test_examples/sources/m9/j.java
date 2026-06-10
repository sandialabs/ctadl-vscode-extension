package m9;

import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* loaded from: classes.dex */
public abstract class j extends g<m7.n> {

    /* loaded from: classes.dex */
    public static final class a extends j {

        /* renamed from: b  reason: collision with root package name */
        public final String f16024b;

        public a(String str) {
            this.f16024b = str;
        }

        @Override // m9.g
        public final y9.r a(l8.s sVar) {
            v7.g.f(sVar, "module");
            return aa.h.c(ErrorTypeKind.ERROR_CONSTANT_VALUE, this.f16024b);
        }

        @Override // m9.g
        public final String toString() {
            return this.f16024b;
        }
    }

    public j() {
        super(m7.n.f16010a);
    }

    @Override // m9.g
    public final m7.n b() {
        throw new UnsupportedOperationException();
    }
}
