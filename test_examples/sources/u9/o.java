package u9;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment;
import l8.d0;

/* loaded from: classes.dex */
public final class o implements c {

    /* renamed from: a  reason: collision with root package name */
    public final f9.c f17935a;

    /* renamed from: b  reason: collision with root package name */
    public final f9.a f17936b;
    public final u7.l<h9.b, d0> c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f17937d;

    public o(ProtoBuf$PackageFragment protoBuf$PackageFragment, f9.d dVar, f9.a aVar, u7.l lVar) {
        this.f17935a = dVar;
        this.f17936b = aVar;
        this.c = lVar;
        List<ProtoBuf$Class> list = protoBuf$PackageFragment.f14211o;
        v7.g.e(list, "proto.class_List");
        int O0 = m0.b.O0(n7.l.Z1(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(O0 < 16 ? 16 : O0);
        for (Object obj : list) {
            linkedHashMap.put(m0.b.j0(this.f17935a, ((ProtoBuf$Class) obj).f14050m), obj);
        }
        this.f17937d = linkedHashMap;
    }

    @Override // u9.c
    public final b a(h9.b bVar) {
        v7.g.f(bVar, "classId");
        ProtoBuf$Class protoBuf$Class = (ProtoBuf$Class) this.f17937d.get(bVar);
        if (protoBuf$Class == null) {
            return null;
        }
        return new b(this.f17935a, protoBuf$Class, this.f17936b, this.c.U(bVar));
    }
}
