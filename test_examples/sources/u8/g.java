package u8;

import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import l8.z;

/* loaded from: classes.dex */
public final class g implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, l8.b bVar) {
        v7.g.f(aVar, "superDescriptor");
        v7.g.f(aVar2, "subDescriptor");
        boolean z10 = aVar2 instanceof z;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.UNKNOWN;
        if (z10 && (aVar instanceof z)) {
            z zVar = (z) aVar2;
            z zVar2 = (z) aVar;
            if (v7.g.a(zVar.getName(), zVar2.getName())) {
                if (m0.b.G0(zVar) && m0.b.G0(zVar2)) {
                    return ExternalOverridabilityCondition.Result.OVERRIDABLE;
                }
                if (!m0.b.G0(zVar) && !m0.b.G0(zVar2)) {
                    return result;
                }
                return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
            }
            return result;
        }
        return result;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract b() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }
}
