package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import y9.m0;

/* loaded from: classes.dex */
public final class NewCapturedTypeConstructor$_supertypes$2 extends Lambda implements u7.a<List<? extends m0>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NewCapturedTypeConstructor f14985j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$_supertypes$2(NewCapturedTypeConstructor newCapturedTypeConstructor) {
        super(0);
        this.f14985j = newCapturedTypeConstructor;
    }

    @Override // u7.a
    public final List<? extends m0> k0() {
        u7.a<? extends List<? extends m0>> aVar = this.f14985j.f14981b;
        if (aVar != null) {
            return aVar.k0();
        }
        return null;
    }
}
