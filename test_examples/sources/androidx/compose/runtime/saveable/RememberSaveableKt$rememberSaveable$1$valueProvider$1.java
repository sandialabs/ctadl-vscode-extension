package androidx.compose.runtime.saveable;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g1;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import o0.b;
import o0.c;
import o0.e;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class RememberSaveableKt$rememberSaveable$1$valueProvider$1 extends Lambda implements u7.a<Object> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g1<e<Object, Object>> f2913j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g1<Object> f2914k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ c f2915l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RememberSaveableKt$rememberSaveable$1$valueProvider$1(g1<? extends e<Object, Object>> g1Var, g1<Object> g1Var2, c cVar) {
        super(0);
        this.f2913j = g1Var;
        this.f2914k = g1Var2;
        this.f2915l = cVar;
    }

    @Override // u7.a
    public final Object k0() {
        return this.f2913j.getValue().a(new b(this.f2915l), this.f2914k.getValue());
    }
}
