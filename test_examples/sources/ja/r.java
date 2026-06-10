package ja;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12793a;

    /* renamed from: b  reason: collision with root package name */
    public final g f12794b;
    public final u7.l<Throwable, m7.n> c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f12795d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f12796e;

    /* JADX WARN: Multi-variable type inference failed */
    public r(Object obj, g gVar, u7.l<? super Throwable, m7.n> lVar, Object obj2, Throwable th) {
        this.f12793a = obj;
        this.f12794b = gVar;
        this.c = lVar;
        this.f12795d = obj2;
        this.f12796e = th;
    }

    public /* synthetic */ r(Object obj, g gVar, u7.l lVar, Object obj2, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : gVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static r a(r rVar, g gVar, CancellationException cancellationException, int i10) {
        Object obj;
        u7.l<Throwable, m7.n> lVar;
        Object obj2 = null;
        if ((i10 & 1) != 0) {
            obj = rVar.f12793a;
        } else {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            gVar = rVar.f12794b;
        }
        g gVar2 = gVar;
        if ((i10 & 4) != 0) {
            lVar = rVar.c;
        } else {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            obj2 = rVar.f12795d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i10 & 16) != 0) {
            cancellationException2 = rVar.f12796e;
        }
        rVar.getClass();
        return new r(obj, gVar2, lVar, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return v7.g.a(this.f12793a, rVar.f12793a) && v7.g.a(this.f12794b, rVar.f12794b) && v7.g.a(this.c, rVar.c) && v7.g.a(this.f12795d, rVar.f12795d) && v7.g.a(this.f12796e, rVar.f12796e);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        Object obj = this.f12793a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        g gVar = this.f12794b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        u7.l<Throwable, m7.n> lVar = this.c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f12795d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f12796e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return hashCode4 + i10;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f12793a + ", cancelHandler=" + this.f12794b + ", onCancellation=" + this.c + ", idempotentResume=" + this.f12795d + ", cancelCause=" + this.f12796e + ')';
    }
}
