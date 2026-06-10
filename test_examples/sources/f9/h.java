package f9;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f11006b = new h(EmptyList.f12981i);

    /* renamed from: a  reason: collision with root package name */
    public final List<ProtoBuf$VersionRequirement> f11007a;

    /* loaded from: classes.dex */
    public static final class a {
        public static h a(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable.f14428j.size() == 0) {
                return h.f11006b;
            }
            List<ProtoBuf$VersionRequirement> list = protoBuf$VersionRequirementTable.f14428j;
            v7.g.e(list, "table.requirementList");
            return new h(list);
        }
    }

    public h(List<ProtoBuf$VersionRequirement> list) {
        this.f11007a = list;
    }
}
