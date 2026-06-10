package o3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.datastore.preferences.protobuf.k;
import java.util.ArrayList;
import o3.a;

/* loaded from: classes.dex */
public final class c extends b<c> {

    /* renamed from: t  reason: collision with root package name */
    public d f16264t;

    /* renamed from: u  reason: collision with root package name */
    public float f16265u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f16266v;

    public <K> c(K k3, k kVar) {
        super(k3, kVar);
        this.f16264t = null;
        this.f16265u = Float.MAX_VALUE;
        this.f16266v = false;
    }

    public final void d() {
        boolean z10;
        if (this.f16264t.f16268b > 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f16256f) {
                    this.f16266v = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    public final void e() {
        d dVar = this.f16264t;
        if (dVar != null) {
            double d5 = (float) dVar.f16274i;
            if (d5 <= Float.MAX_VALUE) {
                float f10 = this.f16257g;
                if (d5 >= f10) {
                    double abs = Math.abs(this.f16259i * 0.75f);
                    dVar.f16269d = abs;
                    dVar.f16270e = abs * 62.5d;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        boolean z10 = this.f16256f;
                        if (!z10 && !z10) {
                            this.f16256f = true;
                            if (!this.c) {
                                this.f16253b = this.f16255e.A0(this.f16254d);
                            }
                            float f11 = this.f16253b;
                            if (f11 <= Float.MAX_VALUE && f11 >= f10) {
                                ThreadLocal<a> threadLocal = a.f16236f;
                                if (threadLocal.get() == null) {
                                    threadLocal.set(new a());
                                }
                                a aVar = threadLocal.get();
                                ArrayList<a.b> arrayList = aVar.f16238b;
                                if (arrayList.size() == 0) {
                                    if (aVar.f16239d == null) {
                                        aVar.f16239d = new a.d(aVar.c);
                                    }
                                    a.d dVar2 = aVar.f16239d;
                                    dVar2.f16243b.postFrameCallback(dVar2.c);
                                }
                                if (!arrayList.contains(this)) {
                                    arrayList.add(this);
                                    return;
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                        }
                        return;
                    }
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }
}
