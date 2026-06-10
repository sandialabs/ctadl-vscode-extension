package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.Member;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Member;", "T", "V", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KProperty1Impl$delegateSource$1 extends Lambda implements u7.a<Member> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KProperty1Impl<T, V> f13195j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KProperty1Impl$delegateSource$1(KProperty1Impl<T, ? extends V> kProperty1Impl) {
        super(0);
        this.f13195j = kProperty1Impl;
    }

    @Override // u7.a
    public final Member k0() {
        return this.f13195j.g();
    }
}
