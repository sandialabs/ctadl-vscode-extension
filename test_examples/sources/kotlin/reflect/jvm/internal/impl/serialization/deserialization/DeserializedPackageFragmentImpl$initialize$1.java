package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import n7.l;

/* loaded from: classes.dex */
public final class DeserializedPackageFragmentImpl$initialize$1 extends Lambda implements u7.a<Collection<? extends h9.e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ DeserializedPackageFragmentImpl f14776j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$initialize$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(0);
        this.f14776j = deserializedPackageFragmentImpl;
    }

    @Override // u7.a
    public final Collection<? extends h9.e> k0() {
        boolean z10;
        Set keySet = this.f14776j.f14772r.f17937d.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            h9.b bVar = (h9.b) obj;
            if (!bVar.k() && !ClassDeserializer.c.contains(bVar)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l.Z1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((h9.b) it.next()).j());
        }
        return arrayList2;
    }
}
