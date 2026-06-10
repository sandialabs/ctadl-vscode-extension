package d9;

import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public final class b implements u9.k {

    /* renamed from: a  reason: collision with root package name */
    public static final b f10446a = new b();

    @Override // u9.k
    public final r a(ProtoBuf$Type protoBuf$Type, String str, v vVar, v vVar2) {
        v7.g.f(protoBuf$Type, "proto");
        v7.g.f(str, "flexibleId");
        v7.g.f(vVar, "lowerBound");
        v7.g.f(vVar2, "upperBound");
        return !v7.g.a(str, "kotlin.jvm.PlatformType") ? aa.h.c(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, vVar.toString(), vVar2.toString()) : protoBuf$Type.m(JvmProtoBuf.f14440g) ? new RawTypeImpl(vVar, vVar2) : KotlinTypeFactory.c(vVar, vVar2);
    }
}
