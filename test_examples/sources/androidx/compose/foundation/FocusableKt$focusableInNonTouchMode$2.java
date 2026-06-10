package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.n0;
import androidx.datastore.preferences.PreferencesProto$Value;
import k1.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import t0.g;
import u.j;
import u7.l;
import u7.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq0/d;", "invoke", "(Lq0/d;Lg0/d;I)Lq0/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FocusableKt$focusableInNonTouchMode$2 extends Lambda implements q<q0.d, g0.d, Integer, q0.d> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f1498j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ j f1499k;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.FocusableKt$focusableInNonTouchMode$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<g, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ c1.b f1500j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c1.b bVar) {
            super(1);
            this.f1500j = bVar;
        }

        @Override // u7.l
        public final n U(g gVar) {
            boolean z10;
            g gVar2 = gVar;
            v7.g.f(gVar2, "$this$focusProperties");
            if (this.f1500j.a() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar2.a(!z10);
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusableInNonTouchMode$2(j jVar, boolean z10) {
        super(3);
        this.f1498j = z10;
        this.f1499k = jVar;
    }

    @Override // u7.q
    public final q0.d O(q0.d dVar, g0.d dVar2, Integer num) {
        g0.d dVar3 = dVar2;
        num.intValue();
        v7.g.f(dVar, "$this$composed");
        dVar3.f(-618949501);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1((c1.b) dVar3.w(CompositionLocalsKt.f3708j));
        h<t0.h> hVar = FocusPropertiesKt.f3049a;
        l<n0, n> lVar = InspectableValueKt.f3744a;
        q0.d a10 = ComposedModifierKt.a(new t0.h(anonymousClass1, lVar), lVar, new FocusableKt$focusable$2(this.f1499k, this.f1498j));
        dVar3.u();
        return a10;
    }
}
