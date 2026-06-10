package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002 \u0004*\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00030\u0002\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "kotlin.jvm.PlatformType", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl$Data$sealedSubclasses$2 extends Lambda implements u7.a<List<? extends KClassImpl<? extends T>>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T>.Data f13128j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$sealedSubclasses$2(KClassImpl<T>.Data data) {
        super(0);
        this.f13128j = data;
    }

    @Override // u7.a
    public final Object k0() {
        Collection<l8.b> e02 = this.f13128j.a().e0();
        v7.g.e(e02, "descriptor.sealedSubclasses");
        ArrayList arrayList = new ArrayList();
        for (l8.b bVar : e02) {
            v7.g.d(bVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Class<?> j2 = f8.i.j(bVar);
            KClassImpl kClassImpl = j2 != null ? new KClassImpl(j2) : null;
            if (kClassImpl != null) {
                arrayList.add(kClassImpl);
            }
        }
        return arrayList;
    }
}
