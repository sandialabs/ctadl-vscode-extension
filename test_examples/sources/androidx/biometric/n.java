package androidx.biometric;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.b;
import androidx.lifecycle.i0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class n extends i0 {
    public androidx.lifecycle.v<Integer> A;
    public androidx.lifecycle.v<CharSequence> B;

    /* renamed from: d  reason: collision with root package name */
    public Executor f1212d;

    /* renamed from: e  reason: collision with root package name */
    public BiometricPrompt.a f1213e;

    /* renamed from: f  reason: collision with root package name */
    public BiometricPrompt.d f1214f;

    /* renamed from: g  reason: collision with root package name */
    public BiometricPrompt.c f1215g;

    /* renamed from: h  reason: collision with root package name */
    public androidx.biometric.b f1216h;

    /* renamed from: i  reason: collision with root package name */
    public o f1217i;

    /* renamed from: j  reason: collision with root package name */
    public c f1218j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1219k;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1221m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1222o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1223p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1224q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1225r;

    /* renamed from: s  reason: collision with root package name */
    public androidx.lifecycle.v<BiometricPrompt.b> f1226s;

    /* renamed from: t  reason: collision with root package name */
    public androidx.lifecycle.v<d> f1227t;

    /* renamed from: u  reason: collision with root package name */
    public androidx.lifecycle.v<CharSequence> f1228u;

    /* renamed from: v  reason: collision with root package name */
    public androidx.lifecycle.v<Boolean> f1229v;

    /* renamed from: w  reason: collision with root package name */
    public androidx.lifecycle.v<Boolean> f1230w;

    /* renamed from: y  reason: collision with root package name */
    public androidx.lifecycle.v<Boolean> f1232y;

    /* renamed from: l  reason: collision with root package name */
    public int f1220l = 0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1231x = true;

    /* renamed from: z  reason: collision with root package name */
    public int f1233z = 0;

    /* loaded from: classes.dex */
    public static final class a extends b.c {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<n> f1234a;

        public a(n nVar) {
            this.f1234a = new WeakReference<>(nVar);
        }

        @Override // androidx.biometric.b.c
        public final void a(int i10, CharSequence charSequence) {
            WeakReference<n> weakReference = this.f1234a;
            if (weakReference.get() != null && !weakReference.get().f1222o && weakReference.get().n) {
                weakReference.get().f(new d(i10, charSequence));
            }
        }

        @Override // androidx.biometric.b.c
        public final void b() {
            WeakReference<n> weakReference = this.f1234a;
            if (weakReference.get() != null && weakReference.get().n) {
                n nVar = weakReference.get();
                if (nVar.f1229v == null) {
                    nVar.f1229v = new androidx.lifecycle.v<>();
                }
                n.j(nVar.f1229v, Boolean.TRUE);
            }
        }

        @Override // androidx.biometric.b.c
        public final void c(BiometricPrompt.b bVar) {
            boolean z10;
            WeakReference<n> weakReference = this.f1234a;
            if (weakReference.get() != null && weakReference.get().n) {
                int i10 = -1;
                if (bVar.f1173b == -1) {
                    int d5 = weakReference.get().d();
                    if ((d5 & 32767) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !androidx.biometric.c.a(d5)) {
                        i10 = 2;
                    }
                    bVar = new BiometricPrompt.b(bVar.f1172a, i10);
                }
                n nVar = weakReference.get();
                if (nVar.f1226s == null) {
                    nVar.f1226s = new androidx.lifecycle.v<>();
                }
                n.j(nVar.f1226s, bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Executor {

        /* renamed from: i  reason: collision with root package name */
        public final Handler f1235i = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f1235i.post(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements DialogInterface.OnClickListener {

        /* renamed from: i  reason: collision with root package name */
        public final WeakReference<n> f1236i;

        public c(n nVar) {
            this.f1236i = new WeakReference<>(nVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            WeakReference<n> weakReference = this.f1236i;
            if (weakReference.get() != null) {
                weakReference.get().i(true);
            }
        }
    }

    public static <T> void j(androidx.lifecycle.v<T> vVar, T t10) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            vVar.i(t10);
        } else {
            vVar.j(t10);
        }
    }

    public final int d() {
        BiometricPrompt.d dVar = this.f1214f;
        if (dVar != null) {
            BiometricPrompt.c cVar = this.f1215g;
            int i10 = dVar.c;
            if (i10 == 0) {
                if (cVar != null) {
                    return 15;
                }
                return 255;
            }
            return i10;
        }
        return 0;
    }

    public final CharSequence e() {
        CharSequence charSequence = this.f1219k;
        if (charSequence != null) {
            return charSequence;
        }
        BiometricPrompt.d dVar = this.f1214f;
        if (dVar != null) {
            CharSequence charSequence2 = dVar.f1179b;
            if (charSequence2 == null) {
                return "";
            }
            return charSequence2;
        }
        return null;
    }

    public final void f(d dVar) {
        if (this.f1227t == null) {
            this.f1227t = new androidx.lifecycle.v<>();
        }
        j(this.f1227t, dVar);
    }

    public final void g(CharSequence charSequence) {
        if (this.B == null) {
            this.B = new androidx.lifecycle.v<>();
        }
        j(this.B, charSequence);
    }

    public final void h(int i10) {
        if (this.A == null) {
            this.A = new androidx.lifecycle.v<>();
        }
        j(this.A, Integer.valueOf(i10));
    }

    public final void i(boolean z10) {
        if (this.f1230w == null) {
            this.f1230w = new androidx.lifecycle.v<>();
        }
        j(this.f1230w, Boolean.valueOf(z10));
    }
}
