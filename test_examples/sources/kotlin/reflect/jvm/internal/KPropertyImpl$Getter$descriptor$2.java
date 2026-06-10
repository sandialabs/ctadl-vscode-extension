package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import l8.a0;
import m8.e;
import o8.d0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001\"\u0006\b\u0001\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"V", "Ll8/a0;", "kotlin.jvm.PlatformType", "invoke", "()Ll8/a0;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KPropertyImpl$Getter$descriptor$2 extends Lambda implements u7.a<a0> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KPropertyImpl.Getter<V> f13208j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KPropertyImpl$Getter$descriptor$2(KPropertyImpl.Getter<? extends V> getter) {
        super(0);
        this.f13208j = getter;
    }

    @Override // u7.a
    public final a0 k0() {
        KPropertyImpl.a aVar = this.f13208j;
        d0 s10 = aVar.h().d().s();
        return s10 == null ? k9.c.c(aVar.h().d(), e.a.f16014a) : s10;
    }
}
