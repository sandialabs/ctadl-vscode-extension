package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import n7.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003 \u0004*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0018\u00010\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "Lc8/e;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KClassImpl$Data$constructors$2 extends Lambda implements u7.a<List<? extends c8.e<? extends T>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T> f13119j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$constructors$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.f13119j = kClassImpl;
    }

    @Override // u7.a
    public final Object k0() {
        KDeclarationContainerImpl kDeclarationContainerImpl = this.f13119j;
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> h10 = kDeclarationContainerImpl.h();
        ArrayList arrayList = new ArrayList(l.Z1(h10, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.c cVar : h10) {
            arrayList.add(new KFunctionImpl(kDeclarationContainerImpl, cVar));
        }
        return arrayList;
    }
}
