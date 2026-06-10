package k8;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import l8.c0;
import l8.d0;
import o8.g0;
import o8.l;
import x9.h;

/* loaded from: classes.dex */
public final class a extends GivenFunctionsMemberScope {

    /* renamed from: e  reason: collision with root package name */
    public static final h9.e f12919e = h9.e.k("clone");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, l lVar) {
        super(hVar, lVar);
        v7.g.f(hVar, "storageManager");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.e> h() {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.DECLARATION;
        d0.a aVar = d0.f15835a;
        h9.e eVar = f12919e;
        l8.b bVar = this.f14733b;
        g0 c12 = g0.c1(bVar, eVar, kind, aVar);
        c0 R0 = bVar.R0();
        EmptyList emptyList = EmptyList.f12981i;
        c12.V0(null, R0, emptyList, emptyList, emptyList, DescriptorUtilsKt.e(bVar).f(), Modality.OPEN, l8.l.c);
        return a1.c.N0(c12);
    }
}
