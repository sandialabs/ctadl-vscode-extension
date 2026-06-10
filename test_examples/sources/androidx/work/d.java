package androidx.work;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: i  reason: collision with root package name */
    public final Context f6218i;

    /* renamed from: j  reason: collision with root package name */
    public final WorkerParameters f6219j;

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f6220k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6221l;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0048a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final androidx.work.b f6222a = androidx.work.b.c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C0048a.class == obj.getClass()) {
                    return this.f6222a.equals(((C0048a) obj).f6222a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f6222a.hashCode() + (C0048a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f6222a + '}';
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public final int hashCode() {
                return b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public final androidx.work.b f6223a;

            public c() {
                this(androidx.work.b.c);
            }

            public c(androidx.work.b bVar) {
                this.f6223a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.f6223a.equals(((c) obj).f6223a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f6223a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f6223a + '}';
            }
        }
    }

    public d(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f6218i = context;
        this.f6219j = workerParameters;
    }

    public m6.a<n4.c> e() {
        androidx.work.impl.utils.futures.a aVar = new androidx.work.impl.utils.futures.a();
        aVar.j(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return aVar;
    }

    public void f() {
    }

    public abstract androidx.work.impl.utils.futures.a g();

    public final void h() {
        this.f6220k = true;
        f();
    }
}
