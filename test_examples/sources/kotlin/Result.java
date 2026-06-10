package kotlin;

import java.io.Serializable;
import v7.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0001\u0004\u0088\u0001\u0005\u0092\u0001\u0004\u0018\u00010\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Failure", "value", "", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Result<T> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    public final Object f12964i;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Failure implements Serializable {

        /* renamed from: i  reason: collision with root package name */
        public final Throwable f12965i;

        public Failure(Throwable th) {
            g.f(th, "exception");
            this.f12965i = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Failure) {
                if (g.a(this.f12965i, ((Failure) obj).f12965i)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f12965i.hashCode();
        }

        public final String toString() {
            return "Failure(" + this.f12965i + ')';
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f12965i;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Result)) {
            return false;
        }
        if (!g.a(this.f12964i, ((Result) obj).f12964i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f12964i;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f12964i;
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
