package kotlin.jvm.internal;

import c8.a;
import c8.d;
import java.io.Serializable;
import v7.i;

/* loaded from: classes.dex */
public abstract class CallableReference implements a, Serializable {

    /* renamed from: o  reason: collision with root package name */
    public static final Object f13046o = NoReceiver.f13052i;

    /* renamed from: i  reason: collision with root package name */
    public transient a f13047i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f13048j;

    /* renamed from: k  reason: collision with root package name */
    public final Class f13049k;

    /* renamed from: l  reason: collision with root package name */
    public final String f13050l;

    /* renamed from: m  reason: collision with root package name */
    public final String f13051m;
    public final boolean n;

    /* loaded from: classes.dex */
    public static class NoReceiver implements Serializable {

        /* renamed from: i  reason: collision with root package name */
        public static final NoReceiver f13052i = new NoReceiver();

        private NoReceiver() {
        }
    }

    public CallableReference() {
        this(f13046o, null, null, null, false);
    }

    public CallableReference(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f13048j = obj;
        this.f13049k = cls;
        this.f13050l = str;
        this.f13051m = str2;
        this.n = z10;
    }

    public final a b() {
        a aVar = this.f13047i;
        if (aVar == null) {
            a c = c();
            this.f13047i = c;
            return c;
        }
        return aVar;
    }

    public abstract a c();

    public d d() {
        Class cls = this.f13049k;
        if (cls == null) {
            return null;
        }
        if (this.n) {
            return i.f18169a.c(cls, "");
        }
        return i.a(cls);
    }

    public String e() {
        return this.f13051m;
    }

    @Override // c8.a
    public String getName() {
        return this.f13050l;
    }
}
