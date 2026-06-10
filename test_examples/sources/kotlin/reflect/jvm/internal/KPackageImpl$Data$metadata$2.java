package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Triple;", "Lg9/f;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lg9/e;", "invoke", "()Lkotlin/Triple;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KPackageImpl$Data$metadata$2 extends Lambda implements u7.a<Triple<? extends g9.f, ? extends ProtoBuf$Package, ? extends g9.e>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KPackageImpl.Data f13177j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$metadata$2(KPackageImpl.Data data) {
        super(0);
        this.f13177j = data;
    }

    @Override // u7.a
    public final Triple<? extends g9.f, ? extends ProtoBuf$Package, ? extends g9.e> k0() {
        KotlinClassHeader kotlinClassHeader;
        String[] strArr;
        String[] strArr2;
        q8.e a10 = KPackageImpl.Data.a(this.f13177j);
        if (a10 == null || (kotlinClassHeader = a10.f16951b) == null || (strArr = kotlinClassHeader.c) == null || (strArr2 = kotlinClassHeader.f13956e) == null) {
            return null;
        }
        Pair<g9.f, ProtoBuf$Package> h10 = g9.h.h(strArr, strArr2);
        return new Triple<>(h10.f12962i, h10.f12963j, kotlinClassHeader.f13954b);
    }
}
