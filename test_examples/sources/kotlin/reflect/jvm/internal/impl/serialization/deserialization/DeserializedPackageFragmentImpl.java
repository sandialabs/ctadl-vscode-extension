package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import l8.s;
import u9.i;
import u9.o;
import v7.g;
import x9.h;

/* loaded from: classes.dex */
public abstract class DeserializedPackageFragmentImpl extends i {

    /* renamed from: o  reason: collision with root package name */
    public final f9.a f14769o;

    /* renamed from: p  reason: collision with root package name */
    public final w9.d f14770p;

    /* renamed from: q  reason: collision with root package name */
    public final f9.d f14771q;

    /* renamed from: r  reason: collision with root package name */
    public final o f14772r;

    /* renamed from: s  reason: collision with root package name */
    public ProtoBuf$PackageFragment f14773s;

    /* renamed from: t  reason: collision with root package name */
    public w9.f f14774t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl(h9.c cVar, h hVar, s sVar, ProtoBuf$PackageFragment protoBuf$PackageFragment, f9.a aVar) {
        super(cVar, hVar, sVar);
        g.f(cVar, "fqName");
        g.f(hVar, "storageManager");
        g.f(sVar, "module");
        this.f14769o = aVar;
        this.f14770p = null;
        ProtoBuf$StringTable protoBuf$StringTable = protoBuf$PackageFragment.f14209l;
        g.e(protoBuf$StringTable, "proto.strings");
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = protoBuf$PackageFragment.f14210m;
        g.e(protoBuf$QualifiedNameTable, "proto.qualifiedNames");
        f9.d dVar = new f9.d(protoBuf$StringTable, protoBuf$QualifiedNameTable);
        this.f14771q = dVar;
        this.f14772r = new o(protoBuf$PackageFragment, dVar, aVar, new DeserializedPackageFragmentImpl$classDataFinder$1(this));
        this.f14773s = protoBuf$PackageFragment;
    }

    @Override // u9.i
    public final o M0() {
        return this.f14772r;
    }

    public final void S0(u9.e eVar) {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = this.f14773s;
        if (protoBuf$PackageFragment != null) {
            this.f14773s = null;
            ProtoBuf$Package protoBuf$Package = protoBuf$PackageFragment.n;
            g.e(protoBuf$Package, "proto.`package`");
            f9.d dVar = this.f14771q;
            f9.a aVar = this.f14769o;
            w9.d dVar2 = this.f14770p;
            this.f14774t = new w9.f(this, protoBuf$Package, dVar, aVar, dVar2, eVar, "scope of " + this, new DeserializedPackageFragmentImpl$initialize$1(this));
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    @Override // l8.u
    public final MemberScope w() {
        w9.f fVar = this.f14774t;
        if (fVar != null) {
            return fVar;
        }
        g.l("_memberScope");
        throw null;
    }
}
