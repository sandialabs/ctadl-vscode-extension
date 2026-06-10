package androidx.compose.foundation.selection;

import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.state.ToggleableState;
import androidx.datastore.preferences.PreferencesProto$Value;
import c8.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import o1.g;
import o1.i;
import o1.o;
import u7.l;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class ToggleableKt$toggleableImpl$1$semantics$1 extends Lambda implements l<o, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g f2081j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ToggleableState f2082k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ boolean f2083l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ u7.a<n> f2084m;

    @Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.selection.ToggleableKt$toggleableImpl$1$semantics$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.a<Boolean> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ u7.a<n> f2085j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(u7.a<n> aVar) {
            super(0);
            this.f2085j = aVar;
        }

        @Override // u7.a
        public final Boolean k0() {
            this.f2085j.k0();
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1$semantics$1(g gVar, ToggleableState toggleableState, boolean z10, u7.a<n> aVar) {
        super(1);
        this.f2081j = gVar;
        this.f2082k = toggleableState;
        this.f2083l = z10;
        this.f2084m = aVar;
    }

    @Override // u7.l
    public final n U(o oVar) {
        o oVar2 = oVar;
        v7.g.f(oVar2, "$this$semantics");
        g gVar = this.f2081j;
        if (gVar != null) {
            o1.n.b(oVar2, gVar.f16190a);
        }
        j<Object>[] jVarArr = o1.n.f16212a;
        ToggleableState toggleableState = this.f2082k;
        v7.g.f(toggleableState, "<set-?>");
        o1.n.f16218h.a(oVar2, o1.n.f16212a[15], toggleableState);
        oVar2.c(i.f16194b, new o1.a(null, new AnonymousClass1(this.f2084m)));
        if (!this.f2083l) {
            oVar2.c(SemanticsProperties.f3953i, n.f16010a);
        }
        return n.f16010a;
    }
}
