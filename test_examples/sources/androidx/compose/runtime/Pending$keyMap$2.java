package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.t0;
import g0.x;
import g0.y;
import g0.z0;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004`\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lg0/y;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "invoke", "()Ljava/util/HashMap;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class Pending$keyMap$2 extends Lambda implements u7.a<HashMap<Object, LinkedHashSet<y>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ d f2769j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pending$keyMap$2(d dVar) {
        super(0);
        this.f2769j = dVar;
    }

    @Override // u7.a
    public final HashMap<Object, LinkedHashSet<y>> k0() {
        Object valueOf;
        q<g0.c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        HashMap<Object, LinkedHashSet<y>> hashMap = new HashMap<>();
        d dVar = this.f2769j;
        int size = dVar.f2871a.size();
        for (int i10 = 0; i10 < size; i10++) {
            y yVar = dVar.f2871a.get(i10);
            Object obj = yVar.f11111b;
            int i11 = yVar.f11110a;
            if (obj != null) {
                valueOf = new x(Integer.valueOf(i11), yVar.f11111b);
            } else {
                valueOf = Integer.valueOf(i11);
            }
            LinkedHashSet<y> linkedHashSet = hashMap.get(valueOf);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                hashMap.put(valueOf, linkedHashSet);
            }
            linkedHashSet.add(yVar);
        }
        return hashMap;
    }
}
