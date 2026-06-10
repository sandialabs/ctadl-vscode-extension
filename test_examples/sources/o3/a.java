package o3;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import p.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<a> f16236f = new ThreadLocal<>();

    /* renamed from: d  reason: collision with root package name */
    public d f16239d;

    /* renamed from: a  reason: collision with root package name */
    public final h<b, Long> f16237a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f16238b = new ArrayList<>();
    public final C0202a c = new C0202a();

    /* renamed from: e  reason: collision with root package name */
    public boolean f16240e = false;

    /* renamed from: o3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0202a {
        public C0202a() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j2);
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final C0202a f16242a;

        public c(C0202a c0202a) {
            this.f16242a = c0202a;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final Choreographer f16243b;
        public final Choreographer$FrameCallbackC0203a c;

        /* renamed from: o3.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class Choreographer$FrameCallbackC0203a implements Choreographer.FrameCallback {
            public Choreographer$FrameCallbackC0203a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0046 A[SYNTHETIC] */
            @Override // android.view.Choreographer.FrameCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void doFrame(long j2) {
                ArrayList<b> arrayList;
                boolean z10;
                C0202a c0202a = d.this.f16242a;
                c0202a.getClass();
                long uptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                aVar.getClass();
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (true) {
                    arrayList = aVar.f16238b;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    b bVar = arrayList.get(i10);
                    if (bVar != null) {
                        h<b, Long> hVar = aVar.f16237a;
                        Long orDefault = hVar.getOrDefault(bVar, null);
                        if (orDefault != null) {
                            if (orDefault.longValue() < uptimeMillis2) {
                                hVar.remove(bVar);
                            } else {
                                z10 = false;
                                if (!z10) {
                                    bVar.a(uptimeMillis);
                                }
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                    }
                    i10++;
                }
                if (aVar.f16240e) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f16240e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.f16239d == null) {
                        aVar.f16239d = new d(aVar.c);
                    }
                    d dVar = aVar.f16239d;
                    dVar.f16243b.postFrameCallback(dVar.c);
                }
            }
        }

        public d(C0202a c0202a) {
            super(c0202a);
            this.f16243b = Choreographer.getInstance();
            this.c = new Choreographer$FrameCallbackC0203a();
        }
    }
}
