package q8;

import r8.l;

/* loaded from: classes.dex */
public final class i implements a9.b {

    /* renamed from: a  reason: collision with root package name */
    public static final i f16957a = new i();

    /* loaded from: classes.dex */
    public static final class a implements a9.a {

        /* renamed from: b  reason: collision with root package name */
        public final l f16958b;

        public a(l lVar) {
            v7.g.f(lVar, "javaElement");
            this.f16958b = lVar;
        }

        @Override // l8.d0
        public final void a() {
        }

        @Override // a9.a
        public final l c() {
            return this.f16958b;
        }

        public final String toString() {
            return a.class.getName() + ": " + this.f16958b;
        }
    }

    @Override // a9.b
    public final a a(b9.l lVar) {
        v7.g.f(lVar, "javaElement");
        return new a((l) lVar);
    }
}
