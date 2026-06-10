package v0;

/* loaded from: classes.dex */
public abstract class x {

    /* loaded from: classes.dex */
    public static final class a extends x {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                ((a) obj).getClass();
                return v7.g.a(null, null);
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x {

        /* renamed from: a  reason: collision with root package name */
        public final u0.d f18140a;

        public b(u0.d dVar) {
            this.f18140a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return v7.g.a(this.f18140a, ((b) obj).f18140a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f18140a.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends x {

        /* renamed from: a  reason: collision with root package name */
        public final u0.e f18141a;

        /* renamed from: b  reason: collision with root package name */
        public final h f18142b;

        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(u0.e eVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            h hVar;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            this.f18141a = eVar;
            long j2 = eVar.f17735h;
            float b5 = u0.a.b(j2);
            long j10 = eVar.f17734g;
            boolean z18 = false;
            if (b5 == u0.a.b(j10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j11 = eVar.f17732e;
            long j12 = eVar.f17733f;
            if (z10) {
                if (u0.a.b(j10) == u0.a.b(j12)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z16) {
                    if (u0.a.b(j12) == u0.a.b(j11)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        z11 = true;
                        if (u0.a.c(j2) != u0.a.c(j10)) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            if (u0.a.c(j10) == u0.a.c(j12)) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                if (u0.a.c(j12) == u0.a.c(j11)) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    z13 = true;
                                    if (z11 && z13) {
                                        z18 = true;
                                    }
                                    if (!z18) {
                                        hVar = m0.b.k();
                                        hVar.b(eVar);
                                    } else {
                                        hVar = null;
                                    }
                                    this.f18142b = hVar;
                                }
                            }
                        }
                        z13 = false;
                        if (z11) {
                            z18 = true;
                        }
                        if (!z18) {
                        }
                        this.f18142b = hVar;
                    }
                }
            }
            z11 = false;
            if (u0.a.c(j2) != u0.a.c(j10)) {
            }
            if (z12) {
            }
            z13 = false;
            if (z11) {
            }
            if (!z18) {
            }
            this.f18142b = hVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return v7.g.a(this.f18141a, ((c) obj).f18141a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f18141a.hashCode();
        }
    }
}
