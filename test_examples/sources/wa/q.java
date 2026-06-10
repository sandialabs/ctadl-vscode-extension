package wa;

import java.util.List;
import kotlinx.serialization.descriptors.b;
import sa.h;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18522a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18523b;

    public q(String str, boolean z10) {
        v7.g.f(str, "discriminator");
        this.f18522a = z10;
        this.f18523b = str;
    }

    public final <T> void a(c8.b<T> bVar, u7.l<? super List<? extends qa.b<?>>, ? extends qa.b<?>> lVar) {
        v7.g.f(bVar, "kClass");
        v7.g.f(lVar, "provider");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
        r6 = r4.c();
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r0 >= r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        r1 = r4.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (v7.g.a(r1, r3.f18523b) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
        throw new java.lang.IllegalArgumentException("Polymorphic serializer for " + r5 + " has property '" + r1 + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <Base, Sub extends Base> void b(c8.b<Base> bVar, c8.b<Sub> bVar2, qa.b<Sub> bVar3) {
        sa.e a10 = bVar3.a();
        sa.h h10 = a10.h();
        if (!(h10 instanceof sa.c) && !v7.g.a(h10, h.a.f17530a)) {
            boolean z10 = this.f18522a;
            if (!z10 && (v7.g.a(h10, b.C0175b.f15610a) || v7.g.a(h10, b.c.f15611a) || (h10 instanceof sa.d) || (h10 instanceof h.b))) {
                throw new IllegalArgumentException("Serializer for " + bVar2.d() + " of kind " + h10 + " cannot be serialized polymorphically with class discriminator.");
            }
            return;
        }
        throw new IllegalArgumentException("Serializer for " + bVar2.d() + " can't be registered as a subclass for polymorphic serialization because its kind " + h10 + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }
}
