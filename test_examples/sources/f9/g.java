package f9;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import n7.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<ProtoBuf$Type> f11005a;

    public g(ProtoBuf$TypeTable protoBuf$TypeTable) {
        boolean z10;
        List<ProtoBuf$Type> list = protoBuf$TypeTable.f14376k;
        int i10 = 0;
        if ((protoBuf$TypeTable.f14375j & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i11 = protoBuf$TypeTable.f14377l;
            v7.g.e(list, "typeTable.typeList");
            ArrayList arrayList = new ArrayList(l.Z1(list, 10));
            for (Object obj : list) {
                int i12 = i10 + 1;
                if (i10 >= 0) {
                    ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) obj;
                    if (i10 >= i11) {
                        protoBuf$Type.getClass();
                        ProtoBuf$Type.b t10 = ProtoBuf$Type.t(protoBuf$Type);
                        t10.f14312l |= 2;
                        t10.n = true;
                        protoBuf$Type = t10.l();
                        if (!protoBuf$Type.a()) {
                            throw new UninitializedMessageException();
                        }
                    }
                    arrayList.add(protoBuf$Type);
                    i10 = i12;
                } else {
                    a1.c.F1();
                    throw null;
                }
            }
            list = arrayList;
        }
        v7.g.e(list, "run {\n        val origin… else originalTypes\n    }");
        this.f11005a = list;
    }

    public final ProtoBuf$Type a(int i10) {
        return this.f11005a.get(i10);
    }
}
