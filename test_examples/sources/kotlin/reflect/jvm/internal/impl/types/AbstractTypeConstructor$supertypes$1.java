package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* loaded from: classes.dex */
public final class AbstractTypeConstructor$supertypes$1 extends Lambda implements u7.a<AbstractTypeConstructor.a> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AbstractTypeConstructor f14936j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$1(AbstractTypeConstructor abstractTypeConstructor) {
        super(0);
        this.f14936j = abstractTypeConstructor;
    }

    @Override // u7.a
    public final AbstractTypeConstructor.a k0() {
        return new AbstractTypeConstructor.a(this.f14936j.h());
    }
}
