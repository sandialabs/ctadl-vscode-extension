package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;
import l8.f;

/* loaded from: classes.dex */
public final class SubstitutingScope$_allDescriptors$2 extends Lambda implements u7.a<Collection<? extends f>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SubstitutingScope f14750j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutingScope$_allDescriptors$2(SubstitutingScope substitutingScope) {
        super(0);
        this.f14750j = substitutingScope;
    }

    @Override // u7.a
    public final Collection<? extends f> k0() {
        SubstitutingScope substitutingScope = this.f14750j;
        return substitutingScope.h(c.a.a(substitutingScope.f14747b, null, 3));
    }
}
