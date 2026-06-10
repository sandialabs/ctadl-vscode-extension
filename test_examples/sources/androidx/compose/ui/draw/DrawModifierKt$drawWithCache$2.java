package androidx.compose.ui.draw;

import androidx.compose.runtime.ComposerKt;
import androidx.datastore.preferences.PreferencesProto$Value;
import g0.c;
import g0.d;
import g0.t0;
import g0.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import q0.d;
import s0.e;
import s0.g;
import u7.l;
import u7.q;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class DrawModifierKt$drawWithCache$2 extends Lambda implements q<d, g0.d, Integer, d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<s0.b, g> f2995j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DrawModifierKt$drawWithCache$2(l<? super s0.b, g> lVar) {
        super(3);
        this.f2995j = lVar;
    }

    @Override // u7.q
    public final d O(d dVar, g0.d dVar2, Integer num) {
        d dVar3 = dVar;
        g0.d dVar4 = dVar2;
        num.intValue();
        v7.g.f(dVar3, "$this$composed");
        dVar4.f(-1689569019);
        q<c<?>, z0, t0, n> qVar = ComposerKt.f2737a;
        dVar4.f(-492369756);
        Object g10 = dVar4.g();
        if (g10 == d.a.f11039a) {
            g10 = new s0.b();
            dVar4.q(g10);
        }
        dVar4.u();
        q0.d Z = dVar3.Z(new e((s0.b) g10, this.f2995j));
        dVar4.u();
        return Z;
    }
}
