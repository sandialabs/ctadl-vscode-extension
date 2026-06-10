package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import y9.m0;

/* loaded from: classes.dex */
final class NewCapturedTypeConstructor$initializeSupertypes$2 extends Lambda implements u7.a<List<? extends m0>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<m0> f14986j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$initializeSupertypes$2(ArrayList arrayList) {
        super(0);
        this.f14986j = arrayList;
    }

    @Override // u7.a
    public final List<? extends m0> k0() {
        return this.f14986j;
    }
}
