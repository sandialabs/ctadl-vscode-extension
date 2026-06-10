package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.f;
import l8.s;
import m9.g;
import n7.l;
import y9.r;

/* loaded from: classes.dex */
public final class c implements b<m8.c, g<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final t9.a f14823a;

    /* renamed from: b  reason: collision with root package name */
    public final u9.a f14824b;

    public c(s sVar, NotFoundClasses notFoundClasses, v9.a aVar) {
        v7.g.f(sVar, "module");
        v7.g.f(aVar, "protocol");
        this.f14823a = aVar;
        this.f14824b = new u9.a(sVar, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final ArrayList a(ProtoBuf$TypeParameter protoBuf$TypeParameter, f9.c cVar) {
        v7.g.f(protoBuf$TypeParameter, "proto");
        v7.g.f(cVar, "nameResolver");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$TypeParameter.l(this.f14823a.f17707l);
        if (iterable == null) {
            iterable = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            arrayList.add(this.f14824b.a(protoBuf$Annotation, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List b(f.a aVar, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        v7.g.f(aVar, "container");
        v7.g.f(protoBuf$EnumEntry, "proto");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$EnumEntry.l(this.f14823a.f17703h);
        if (iterable == null) {
            iterable = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            arrayList.add(this.f14824b.a(protoBuf$Annotation, aVar.f14895a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<m8.c> c(f fVar, ProtoBuf$Property protoBuf$Property) {
        v7.g.f(protoBuf$Property, "proto");
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<m8.c> d(f fVar, h hVar, AnnotatedCallableKind annotatedCallableKind) {
        v7.g.f(hVar, "proto");
        v7.g.f(annotatedCallableKind, "kind");
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<m8.c> e(f fVar, h hVar, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        v7.g.f(fVar, "container");
        v7.g.f(hVar, "callableProto");
        v7.g.f(annotatedCallableKind, "kind");
        v7.g.f(protoBuf$ValueParameter, "proto");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$ValueParameter.l(this.f14823a.f17705j);
        if (iterable == null) {
            iterable = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            arrayList.add(this.f14824b.a(protoBuf$Annotation, fVar.f14895a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<m8.c> f(f fVar, ProtoBuf$Property protoBuf$Property) {
        v7.g.f(protoBuf$Property, "proto");
        return EmptyList.f12981i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final ArrayList g(f.a aVar) {
        v7.g.f(aVar, "container");
        Iterable<ProtoBuf$Annotation> iterable = (List) aVar.f14897d.l(this.f14823a.c);
        if (iterable == null) {
            iterable = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            arrayList.add(this.f14824b.a(protoBuf$Annotation, aVar.f14895a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.b
    public final g<?> h(f fVar, ProtoBuf$Property protoBuf$Property, r rVar) {
        v7.g.f(protoBuf$Property, "proto");
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) f9.e.a(protoBuf$Property, this.f14823a.f17704i);
        if (value == null) {
            return null;
        }
        return this.f14824b.c(rVar, value, fVar.f14895a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final List<m8.c> i(f fVar, h hVar, AnnotatedCallableKind annotatedCallableKind) {
        GeneratedMessageLite.ExtendableMessage extendableMessage;
        Object obj;
        v7.g.f(hVar, "proto");
        v7.g.f(annotatedCallableKind, "kind");
        boolean z10 = hVar instanceof ProtoBuf$Constructor;
        t9.a aVar = this.f14823a;
        if (z10) {
            extendableMessage = (ProtoBuf$Constructor) hVar;
            obj = aVar.f17698b;
        } else if (hVar instanceof ProtoBuf$Function) {
            extendableMessage = (ProtoBuf$Function) hVar;
            obj = aVar.f17699d;
        } else if (hVar instanceof ProtoBuf$Property) {
            int ordinal = annotatedCallableKind.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        extendableMessage = (ProtoBuf$Property) hVar;
                        obj = aVar.f17702g;
                    } else {
                        throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                    }
                } else {
                    extendableMessage = (ProtoBuf$Property) hVar;
                    obj = aVar.f17701f;
                }
            } else {
                extendableMessage = (ProtoBuf$Property) hVar;
                obj = aVar.f17700e;
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + hVar).toString());
        }
        Iterable<ProtoBuf$Annotation> iterable = (List) extendableMessage.l(obj);
        if (iterable == null) {
            iterable = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            arrayList.add(this.f14824b.a(protoBuf$Annotation, fVar.f14895a));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.d
    public final ArrayList j(ProtoBuf$Type protoBuf$Type, f9.c cVar) {
        v7.g.f(protoBuf$Type, "proto");
        v7.g.f(cVar, "nameResolver");
        Iterable<ProtoBuf$Annotation> iterable = (List) protoBuf$Type.l(this.f14823a.f17706k);
        if (iterable == null) {
            iterable = EmptyList.f12981i;
        }
        ArrayList arrayList = new ArrayList(l.Z1(iterable, 10));
        for (ProtoBuf$Annotation protoBuf$Annotation : iterable) {
            arrayList.add(this.f14824b.a(protoBuf$Annotation, cVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.b
    public final g<?> k(f fVar, ProtoBuf$Property protoBuf$Property, r rVar) {
        v7.g.f(protoBuf$Property, "proto");
        return null;
    }
}
