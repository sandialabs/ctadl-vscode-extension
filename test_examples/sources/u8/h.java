package u8;

import java.util.Arrays;

/* loaded from: classes.dex */
public interface h {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final h9.b f17847a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f17848b;
        public final b9.g c;

        public a(h9.b bVar, b9.g gVar, int i10) {
            gVar = (i10 & 4) != 0 ? null : gVar;
            this.f17847a = bVar;
            this.f17848b = null;
            this.c = gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return v7.g.a(this.f17847a, aVar.f17847a) && v7.g.a(this.f17848b, aVar.f17848b) && v7.g.a(this.c, aVar.c);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f17847a.hashCode() * 31;
            int i10 = 0;
            byte[] bArr = this.f17848b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            b9.g gVar = this.c;
            if (gVar != null) {
                i10 = gVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public final String toString() {
            return "Request(classId=" + this.f17847a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f17848b) + ", outerClass=" + this.c + ')';
        }
    }

    r8.r a(h9.c cVar);

    kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a b(a aVar);

    void c(h9.c cVar);
}
