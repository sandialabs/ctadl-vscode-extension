package u9;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import l8.d0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final f9.c f17897a;

    /* renamed from: b  reason: collision with root package name */
    public final ProtoBuf$Class f17898b;
    public final f9.a c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f17899d;

    public b(f9.c cVar, ProtoBuf$Class protoBuf$Class, f9.a aVar, d0 d0Var) {
        v7.g.f(cVar, "nameResolver");
        v7.g.f(protoBuf$Class, "classProto");
        v7.g.f(aVar, "metadataVersion");
        v7.g.f(d0Var, "sourceElement");
        this.f17897a = cVar;
        this.f17898b = protoBuf$Class;
        this.c = aVar;
        this.f17899d = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return v7.g.a(this.f17897a, bVar.f17897a) && v7.g.a(this.f17898b, bVar.f17898b) && v7.g.a(this.c, bVar.c) && v7.g.a(this.f17899d, bVar.f17899d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f17898b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.f17899d.hashCode() + ((hashCode2 + ((hashCode + (this.f17897a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f17897a + ", classProto=" + this.f17898b + ", metadataVersion=" + this.c + ", sourceElement=" + this.f17899d + ')';
    }
}
