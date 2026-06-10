package u9;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final e f17920a;

    /* renamed from: b  reason: collision with root package name */
    public final f9.c f17921b;
    public final l8.f c;

    /* renamed from: d  reason: collision with root package name */
    public final f9.g f17922d;

    /* renamed from: e  reason: collision with root package name */
    public final f9.h f17923e;

    /* renamed from: f  reason: collision with root package name */
    public final f9.a f17924f;

    /* renamed from: g  reason: collision with root package name */
    public final w9.d f17925g;

    /* renamed from: h  reason: collision with root package name */
    public final TypeDeserializer f17926h;

    /* renamed from: i  reason: collision with root package name */
    public final MemberDeserializer f17927i;

    public g(e eVar, f9.c cVar, l8.f fVar, f9.g gVar, f9.h hVar, f9.a aVar, w9.d dVar, TypeDeserializer typeDeserializer, List<ProtoBuf$TypeParameter> list) {
        v7.g.f(eVar, "components");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(fVar, "containingDeclaration");
        v7.g.f(gVar, "typeTable");
        v7.g.f(hVar, "versionRequirementTable");
        v7.g.f(aVar, "metadataVersion");
        v7.g.f(list, "typeParameters");
        this.f17920a = eVar;
        this.f17921b = cVar;
        this.c = fVar;
        this.f17922d = gVar;
        this.f17923e = hVar;
        this.f17924f = aVar;
        this.f17925g = dVar;
        this.f17926h = new TypeDeserializer(this, typeDeserializer, list, "Deserializer for \"" + fVar.getName() + '\"', (dVar == null || (r2 = dVar.b()) == null) ? "[container not found]" : "[container not found]");
        this.f17927i = new MemberDeserializer(this);
    }

    public final g a(l8.f fVar, List<ProtoBuf$TypeParameter> list, f9.c cVar, f9.g gVar, f9.h hVar, f9.a aVar) {
        f9.h hVar2;
        v7.g.f(fVar, "descriptor");
        v7.g.f(list, "typeParameterProtos");
        v7.g.f(cVar, "nameResolver");
        v7.g.f(gVar, "typeTable");
        v7.g.f(hVar, "versionRequirementTable");
        v7.g.f(aVar, "metadataVersion");
        e eVar = this.f17920a;
        boolean z10 = true;
        if (aVar.f10974b != 1 || aVar.c < 4) {
            z10 = false;
        }
        if (z10) {
            hVar2 = hVar;
        } else {
            hVar2 = this.f17923e;
        }
        return new g(eVar, cVar, fVar, gVar, hVar2, aVar, this.f17925g, this.f17926h, list);
    }
}
