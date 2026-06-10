package o8;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;

/* loaded from: classes.dex */
public final class h implements u7.a<y9.v> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ h9.e f16425i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i f16426j;

    public h(i iVar, h9.e eVar) {
        this.f16426j = iVar;
        this.f16425i = eVar;
    }

    @Override // u7.a
    public final y9.v k0() {
        kotlin.reflect.jvm.internal.impl.types.l.f15045j.getClass();
        kotlin.reflect.jvm.internal.impl.types.l lVar = kotlin.reflect.jvm.internal.impl.types.l.f15046k;
        y9.e0 o10 = this.f16426j.o();
        List emptyList = Collections.emptyList();
        g gVar = new g(this);
        LockBasedStorageManager.a aVar = LockBasedStorageManager.f14904e;
        v7.g.e(aVar, "NO_LOCKS");
        return KotlinTypeFactory.g(emptyList, new LazyScopeAdapter(aVar, gVar), lVar, o10, false);
    }
}
