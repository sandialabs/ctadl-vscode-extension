package androidx.compose.ui.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import g0.g0;
import g0.g1;
import g0.p;
import g0.q;
import j1.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$5$1 extends Lambda implements l<q, p> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g1<c> f3336j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$5$1(g0 g0Var) {
        super(1);
        this.f3336j = g0Var;
    }

    @Override // u7.l
    public final p U(q qVar) {
        g.f(qVar, "$this$DisposableEffect");
        return new e0(this.f3336j);
    }
}
