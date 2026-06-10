package f8;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<ClassLoader> f10971a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10972b;

    public j(ClassLoader classLoader) {
        this.f10971a = new WeakReference<>(classLoader);
        this.f10972b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && this.f10971a.get() == ((j) obj).f10971a.get();
    }

    public final int hashCode() {
        return this.f10972b;
    }

    public final String toString() {
        String obj;
        ClassLoader classLoader = this.f10971a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
