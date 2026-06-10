package o3;

import android.view.View;
import java.util.ArrayList;
import o3.a;
import o3.b;

/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: l  reason: collision with root package name */
    public static final C0204b f16245l = new C0204b();

    /* renamed from: m  reason: collision with root package name */
    public static final c f16246m = new c();
    public static final d n = new d();

    /* renamed from: o  reason: collision with root package name */
    public static final e f16247o = new e();

    /* renamed from: p  reason: collision with root package name */
    public static final f f16248p = new f();

    /* renamed from: q  reason: collision with root package name */
    public static final g f16249q = new g();

    /* renamed from: r  reason: collision with root package name */
    public static final h f16250r = new h();

    /* renamed from: s  reason: collision with root package name */
    public static final a f16251s = new a();

    /* renamed from: d  reason: collision with root package name */
    public final Object f16254d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f16255e;

    /* renamed from: i  reason: collision with root package name */
    public final float f16259i;

    /* renamed from: a  reason: collision with root package name */
    public float f16252a = 0.0f;

    /* renamed from: b  reason: collision with root package name */
    public float f16253b = Float.MAX_VALUE;
    public boolean c = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16256f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float f16257g = -3.4028235E38f;

    /* renamed from: h  reason: collision with root package name */
    public long f16258h = 0;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList<j> f16260j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList<k> f16261k = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a extends l {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((View) obj).getAlpha();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            ((View) obj).setAlpha(f10);
        }
    }

    /* renamed from: o3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0204b extends l {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((View) obj).getTranslationX();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            ((View) obj).setTranslationX(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends l {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((View) obj).getTranslationY();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            ((View) obj).setTranslationY(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends l {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((View) obj).getScaleX();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            ((View) obj).setScaleX(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class e extends l {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((View) obj).getScaleY();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            ((View) obj).setScaleY(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends l {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((View) obj).getRotation();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            ((View) obj).setRotation(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends l {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((View) obj).getRotationX();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            ((View) obj).setRotationX(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends l {
        @Override // androidx.datastore.preferences.protobuf.k
        public final float A0(Object obj) {
            return ((View) obj).getRotationY();
        }

        @Override // androidx.datastore.preferences.protobuf.k
        public final void J0(float f10, Object obj) {
            ((View) obj).setRotationY(f10);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public float f16262a;

        /* renamed from: b  reason: collision with root package name */
        public float f16263b;
    }

    /* loaded from: classes.dex */
    public interface j {
        void a();
    }

    /* loaded from: classes.dex */
    public interface k {
        void a();
    }

    /* loaded from: classes.dex */
    public static abstract class l extends androidx.datastore.preferences.protobuf.k {
    }

    public <K> b(K k3, androidx.datastore.preferences.protobuf.k kVar) {
        float f10;
        this.f16254d = k3;
        this.f16255e = kVar;
        if (kVar != f16248p && kVar != f16249q && kVar != f16250r) {
            if (kVar != f16251s && kVar != n && kVar != f16247o) {
                f10 = 1.0f;
                this.f16259i = f10;
            }
            f10 = 0.00390625f;
            this.f16259i = f10;
        }
        f10 = 0.1f;
        this.f16259i = f10;
    }

    @Override // o3.a.b
    public final boolean a(long j2) {
        double d5;
        float f10;
        float min;
        boolean z10;
        long j10 = this.f16258h;
        if (j10 == 0) {
            this.f16258h = j2;
            c(this.f16253b);
            return false;
        }
        long j11 = j2 - j10;
        this.f16258h = j2;
        o3.c cVar = (o3.c) this;
        boolean z11 = true;
        if (cVar.f16266v) {
            float f11 = cVar.f16265u;
            if (f11 != Float.MAX_VALUE) {
                cVar.f16264t.f16274i = f11;
                cVar.f16265u = Float.MAX_VALUE;
            }
            cVar.f16253b = (float) cVar.f16264t.f16274i;
            cVar.f16252a = 0.0f;
            cVar.f16266v = false;
        } else {
            int i10 = (cVar.f16265u > Float.MAX_VALUE ? 1 : (cVar.f16265u == Float.MAX_VALUE ? 0 : -1));
            o3.d dVar = cVar.f16264t;
            if (i10 != 0) {
                double d10 = dVar.f16274i;
                j11 /= 2;
                i c10 = dVar.c(cVar.f16253b, cVar.f16252a, j11);
                dVar = cVar.f16264t;
                dVar.f16274i = cVar.f16265u;
                cVar.f16265u = Float.MAX_VALUE;
                d5 = c10.f16262a;
                f10 = c10.f16263b;
            } else {
                d5 = cVar.f16253b;
                f10 = cVar.f16252a;
            }
            i c11 = dVar.c(d5, f10, j11);
            float f12 = c11.f16262a;
            cVar.f16253b = f12;
            cVar.f16252a = c11.f16263b;
            float max = Math.max(f12, cVar.f16257g);
            cVar.f16253b = max;
            cVar.f16253b = Math.min(max, Float.MAX_VALUE);
            float f13 = cVar.f16252a;
            o3.d dVar2 = cVar.f16264t;
            dVar2.getClass();
            if (Math.abs(f13) < dVar2.f16270e && Math.abs(min - ((float) dVar2.f16274i)) < dVar2.f16269d) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                cVar.f16253b = (float) cVar.f16264t.f16274i;
                cVar.f16252a = 0.0f;
            } else {
                z11 = false;
            }
        }
        float min2 = Math.min(this.f16253b, Float.MAX_VALUE);
        this.f16253b = min2;
        float max2 = Math.max(min2, this.f16257g);
        this.f16253b = max2;
        c(max2);
        if (z11) {
            b(false);
        }
        return z11;
    }

    public final void b(boolean z10) {
        ArrayList<j> arrayList;
        int i10 = 0;
        this.f16256f = false;
        ThreadLocal<o3.a> threadLocal = o3.a.f16236f;
        if (threadLocal.get() == null) {
            threadLocal.set(new o3.a());
        }
        o3.a aVar = threadLocal.get();
        aVar.f16237a.remove(this);
        ArrayList<a.b> arrayList2 = aVar.f16238b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            aVar.f16240e = true;
        }
        this.f16258h = 0L;
        this.c = false;
        while (true) {
            arrayList = this.f16260j;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                arrayList.get(i10).a();
            }
            i10++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }

    public final void c(float f10) {
        ArrayList<k> arrayList;
        this.f16255e.J0(f10, this.f16254d);
        int i10 = 0;
        while (true) {
            arrayList = this.f16261k;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i10) != null) {
                arrayList.get(i10).a();
            }
            i10++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (arrayList.get(size) == null) {
                    arrayList.remove(size);
                }
            } else {
                return;
            }
        }
    }
}
