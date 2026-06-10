package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.p;
import g0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u.j;
import u.m;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableKt$PressedInteractionSourceDisposableEffect$1$1 extends Lambda implements l<q, p> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0<m> f1416j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ j f1417k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$1$1(g0<m> g0Var, j jVar) {
        super(1);
        this.f1416j = g0Var;
        this.f1417k = jVar;
    }

    @Override // u7.l
    public final p U(q qVar) {
        g.f(qVar, "$this$DisposableEffect");
        return new s.d(this.f1416j, this.f1417k);
    }
}
