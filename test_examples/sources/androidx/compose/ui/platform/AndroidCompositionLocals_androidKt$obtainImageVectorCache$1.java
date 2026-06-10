package androidx.compose.ui.platform;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 extends Lambda implements u7.l<g0.q, g0.p> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Context f3675j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ v f3676k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(Context context, v vVar) {
        super(1);
        this.f3675j = context;
        this.f3676k = vVar;
    }

    @Override // u7.l
    public final g0.p U(g0.q qVar) {
        v7.g.f(qVar, "$this$DisposableEffect");
        Context context = this.f3675j;
        Context applicationContext = context.getApplicationContext();
        v vVar = this.f3676k;
        applicationContext.registerComponentCallbacks(vVar);
        return new u(context, vVar);
    }
}
