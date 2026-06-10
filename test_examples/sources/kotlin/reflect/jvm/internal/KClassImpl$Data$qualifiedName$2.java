package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KClassImpl$Data$qualifiedName$2 extends Lambda implements u7.a<String> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KClassImpl<T> f13127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$qualifiedName$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.f13127j = kClassImpl;
    }

    @Override // u7.a
    public final String k0() {
        KClassImpl<T> kClassImpl = this.f13127j;
        if (kClassImpl.f13104j.isAnonymousClass()) {
            return null;
        }
        h9.b r3 = kClassImpl.r();
        if (r3.c) {
            return null;
        }
        return r3.b().b();
    }
}
