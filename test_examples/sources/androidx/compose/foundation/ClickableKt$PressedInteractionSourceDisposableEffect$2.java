package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u.j;
import u.m;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableKt$PressedInteractionSourceDisposableEffect$2 extends Lambda implements p<g0.d, Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ j f1418j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ g0<m> f1419k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f1420l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$2(j jVar, g0<m> g0Var, int i10) {
        super(2);
        this.f1418j = jVar;
        this.f1419k = g0Var;
        this.f1420l = i10;
    }

    @Override // u7.p
    public final n R(g0.d dVar, Integer num) {
        num.intValue();
        ClickableKt.a(this.f1418j, this.f1419k, dVar, this.f1420l | 1);
        return n.f16010a;
    }
}
