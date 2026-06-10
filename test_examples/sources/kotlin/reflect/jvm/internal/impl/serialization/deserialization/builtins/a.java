package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import e9.a;
import e9.b;
import h9.c;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragmentImpl;
import l8.s;
import v7.g;
import x9.h;

/* loaded from: classes.dex */
public final class a extends DeserializedPackageFragmentImpl implements i8.a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0167a {
        public static a a(c cVar, h hVar, s sVar, InputStream inputStream, boolean z10) {
            ProtoBuf$PackageFragment protoBuf$PackageFragment;
            g.f(cVar, "fqName");
            g.f(hVar, "storageManager");
            g.f(sVar, "module");
            try {
                e9.a aVar = e9.a.f10672f;
                e9.a a10 = a.C0112a.a(inputStream);
                e9.a aVar2 = e9.a.f10672f;
                if (a10.b(aVar2)) {
                    d dVar = new d();
                    b.a(dVar);
                    ProtoBuf$PackageFragment.a aVar3 = ProtoBuf$PackageFragment.f14206s;
                    aVar3.getClass();
                    kotlin.reflect.jvm.internal.impl.protobuf.c cVar2 = new kotlin.reflect.jvm.internal.impl.protobuf.c(inputStream);
                    kotlin.reflect.jvm.internal.impl.protobuf.h hVar2 = (kotlin.reflect.jvm.internal.impl.protobuf.h) aVar3.a(cVar2, dVar);
                    try {
                        cVar2.a(0);
                        kotlin.reflect.jvm.internal.impl.protobuf.b.b(hVar2);
                        protoBuf$PackageFragment = (ProtoBuf$PackageFragment) hVar2;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f14537i = hVar2;
                        throw e10;
                    }
                } else {
                    protoBuf$PackageFragment = null;
                }
                m0.b.D(inputStream, null);
                if (protoBuf$PackageFragment != null) {
                    return new a(cVar, hVar, sVar, protoBuf$PackageFragment, a10);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + aVar2 + ", actual " + a10 + ". Please update Kotlin");
            } finally {
            }
        }
    }

    public a(c cVar, h hVar, s sVar, ProtoBuf$PackageFragment protoBuf$PackageFragment, e9.a aVar) {
        super(cVar, hVar, sVar, protoBuf$PackageFragment, aVar);
    }

    @Override // o8.a0, o8.n
    public final String toString() {
        return "builtins package fragment for " + this.f16379m + " from " + DescriptorUtilsKt.j(this);
    }
}
