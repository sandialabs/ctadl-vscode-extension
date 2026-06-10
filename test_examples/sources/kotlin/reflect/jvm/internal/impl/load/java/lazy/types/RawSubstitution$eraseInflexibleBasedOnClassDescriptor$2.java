package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import l8.b;
import u7.l;
import v7.g;
import y9.v;

/* loaded from: classes.dex */
public final class RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2 extends Lambda implements l<e, v> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b f13837j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2(b bVar, z8.a aVar, RawSubstitution rawSubstitution, v vVar) {
        super(1);
        this.f13837j = bVar;
    }

    @Override // u7.l
    public final v U(e eVar) {
        h9.b f10;
        e eVar2 = eVar;
        g.f(eVar2, "kotlinTypeRefiner");
        b bVar = this.f13837j;
        if (!(bVar instanceof b)) {
            bVar = null;
        }
        if (bVar != null && (f10 = DescriptorUtilsKt.f(bVar)) != null) {
            eVar2.L0(f10);
        }
        return null;
    }
}
