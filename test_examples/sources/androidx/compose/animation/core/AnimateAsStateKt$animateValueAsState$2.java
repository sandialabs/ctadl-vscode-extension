package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$2 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ la.c<Object> f1267j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Object f1268k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(la.c<Object> cVar, Object obj) {
        super(0);
        this.f1267j = cVar;
        this.f1268k = obj;
    }

    @Override // u7.a
    public final n k0() {
        this.f1267j.F(this.f1268k);
        return n.f16010a;
    }
}
