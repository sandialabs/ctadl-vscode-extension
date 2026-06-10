package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import l8.v;
import n7.l;
import o8.m;
import o8.x;
import v7.g;

/* loaded from: classes.dex */
final class ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 extends Lambda implements u7.a<m> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ c f13522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2(c cVar) {
        super(0);
        this.f13522j = cVar;
    }

    @Override // u7.a
    public final m k0() {
        c cVar = this.f13522j;
        x xVar = cVar.f13567o;
        if (xVar != null) {
            List<c> b5 = xVar.b();
            cVar.z0();
            b5.contains(cVar);
            for (c cVar2 : b5) {
                cVar2.getClass();
            }
            ArrayList arrayList = new ArrayList(l.Z1(b5, 10));
            for (c cVar3 : b5) {
                v vVar = cVar3.f13568p;
                g.c(vVar);
                arrayList.add(vVar);
            }
            return new m("CompositeProvider@ModuleDescriptor for " + cVar.getName(), arrayList);
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = cVar.getName().f11572i;
        g.e(str, "name.toString()");
        sb.append(str);
        sb.append(" were not set before querying module content");
        throw new AssertionError(sb.toString());
    }
}
