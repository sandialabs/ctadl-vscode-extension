package j1;

/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0135a f12647a = new C0135a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f12648b = new b();

        /* renamed from: j1.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0135a implements c {
            @Override // j1.c
            public final long a(long j2, long j10) {
                float min = Math.min(u0.f.d(j10) / u0.f.d(j2), u0.f.b(j10) / u0.f.b(j2));
                return m0.b.l(min, min);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements c {
            @Override // j1.c
            public final long a(long j2, long j10) {
                float min;
                if (u0.f.d(j2) <= u0.f.d(j10) && u0.f.b(j2) <= u0.f.b(j10)) {
                    min = 1.0f;
                } else {
                    min = Math.min(u0.f.d(j10) / u0.f.d(j2), u0.f.b(j10) / u0.f.b(j2));
                }
                return m0.b.l(min, min);
            }
        }
    }

    long a(long j2, long j10);
}
