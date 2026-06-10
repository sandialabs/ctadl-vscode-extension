package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc8/c;", "invoke", "()Lc8/c;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KTypeImpl$classifier$2 extends Lambda implements u7.a<c8.c> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KTypeImpl f13226j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeImpl$classifier$2(KTypeImpl kTypeImpl) {
        super(0);
        this.f13226j = kTypeImpl;
    }

    @Override // u7.a
    public final c8.c k0() {
        KTypeImpl kTypeImpl = this.f13226j;
        return kTypeImpl.d(kTypeImpl.f13217a);
    }
}
