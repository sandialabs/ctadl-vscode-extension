package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.n;
import h9.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import n7.l;

/* loaded from: classes.dex */
public final class LazyJavaClassMemberScope$enumEntryIndex$1 extends Lambda implements u7.a<Map<e, ? extends n>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LazyJavaClassMemberScope f13753j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope$enumEntryIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(0);
        this.f13753j = lazyJavaClassMemberScope;
    }

    @Override // u7.a
    public final Map<e, ? extends n> k0() {
        List F = this.f13753j.f13741o.F();
        ArrayList arrayList = new ArrayList();
        for (Object obj : F) {
            if (((n) obj).x()) {
                arrayList.add(obj);
            }
        }
        int O0 = m0.b.O0(l.Z1(arrayList, 10));
        if (O0 < 16) {
            O0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(O0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((n) next).getName(), next);
        }
        return linkedHashMap;
    }
}
