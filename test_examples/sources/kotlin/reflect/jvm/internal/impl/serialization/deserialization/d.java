package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.f;

/* loaded from: classes.dex */
public interface d<A> {
    ArrayList a(ProtoBuf$TypeParameter protoBuf$TypeParameter, f9.c cVar);

    List b(f.a aVar, ProtoBuf$EnumEntry protoBuf$EnumEntry);

    List<A> c(f fVar, ProtoBuf$Property protoBuf$Property);

    List<A> d(f fVar, h hVar, AnnotatedCallableKind annotatedCallableKind);

    List<A> e(f fVar, h hVar, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf$ValueParameter protoBuf$ValueParameter);

    List<A> f(f fVar, ProtoBuf$Property protoBuf$Property);

    ArrayList g(f.a aVar);

    List<A> i(f fVar, h hVar, AnnotatedCallableKind annotatedCallableKind);

    ArrayList j(ProtoBuf$Type protoBuf$Type, f9.c cVar);
}
