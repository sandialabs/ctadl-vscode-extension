package n4;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public interface i {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final a.c f16090a = new a.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f16091b = new a.b();

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: n4.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0191a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f16092a;

            public C0191a(Throwable th) {
                this.f16092a = th;
            }

            public final String toString() {
                return "FAILURE (" + this.f16092a.getMessage() + ")";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
