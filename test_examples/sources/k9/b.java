package k9;

import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import l8.h0;
import y9.r;

/* loaded from: classes.dex */
public final class b extends androidx.datastore.preferences.protobuf.k {
    public static final void L0(DeserializedClassDescriptor deserializedClassDescriptor, LinkedHashSet linkedHashSet, MemberScope memberScope, boolean z10) {
        boolean z11;
        for (l8.f fVar : c.a.a(memberScope, r9.c.f17183o, 2)) {
            if (fVar instanceof l8.b) {
                l8.b bVar = (l8.b) fVar;
                if (bVar.l0()) {
                    h9.e name = bVar.getName();
                    v7.g.e(name, "descriptor.name");
                    l8.d e10 = memberScope.e(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    if (e10 instanceof l8.b) {
                        bVar = (l8.b) e10;
                    } else if (e10 instanceof h0) {
                        bVar = ((h0) e10).n();
                    } else {
                        bVar = null;
                    }
                }
                if (bVar != null) {
                    int i10 = d.f12940a;
                    Iterator<r> it = bVar.o().f().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (d.p(it.next(), deserializedClassDescriptor)) {
                                z11 = true;
                                break;
                            }
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        linkedHashSet.add(bVar);
                    }
                    if (z10) {
                        MemberScope w02 = bVar.w0();
                        v7.g.e(w02, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        L0(deserializedClassDescriptor, linkedHashSet, w02, z10);
                    }
                }
            }
        }
    }
}
