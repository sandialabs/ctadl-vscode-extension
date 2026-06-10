package androidx.work;

import androidx.work.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends n4.e {
    @Override // n4.e
    public final b a(ArrayList arrayList) {
        b.a aVar = new b.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((b) it.next()).f6214a));
        }
        aVar.a(hashMap);
        b bVar = new b(aVar.f6215a);
        b.b(bVar);
        return bVar;
    }
}
