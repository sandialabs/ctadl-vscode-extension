package androidx.work;

import g0.l0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import n4.f;
import n4.l;
import n4.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f6206a = a(false);

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f6207b = a(true);
    public final l c;

    /* renamed from: d  reason: collision with root package name */
    public final f f6208d;

    /* renamed from: e  reason: collision with root package name */
    public final l0 f6209e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6210f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6211g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6212h;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0047a {
    }

    /* loaded from: classes.dex */
    public interface b {
        a a();
    }

    public a(C0047a c0047a) {
        String str = m.f16097a;
        this.c = new l();
        this.f6208d = new f();
        this.f6209e = new l0(3);
        this.f6210f = 4;
        this.f6211g = Integer.MAX_VALUE;
        this.f6212h = 20;
    }

    public static ExecutorService a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new n4.a(z10));
    }
}
