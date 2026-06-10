package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Lambda;
import l8.d0;
import u7.l;
import v7.g;

/* loaded from: classes.dex */
final class DeserializedPackageFragmentImpl$classDataFinder$1 extends Lambda implements l<h9.b, d0> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedPackageFragmentImpl f14775j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$classDataFinder$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(1);
        this.f14775j = deserializedPackageFragmentImpl;
    }

    @Override // u7.l
    public final d0 U(h9.b bVar) {
        g.f(bVar, "it");
        w9.d dVar = this.f14775j.f14770p;
        if (dVar == null) {
            return d0.f15835a;
        }
        return dVar;
    }
}
