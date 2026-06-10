package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.e;
import l8.l0;

/* loaded from: classes.dex */
final class ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1 extends Lambda implements u7.a<List<? extends l0>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e.a f13526j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(e.a aVar) {
        super(0);
        this.f13526j = aVar;
    }

    @Override // u7.a
    public final List<? extends l0> k0() {
        return (List) this.f13526j.f13581t.getValue();
    }
}
