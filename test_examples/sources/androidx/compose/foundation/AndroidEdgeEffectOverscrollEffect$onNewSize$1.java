package androidx.compose.foundation;

import androidx.datastore.preferences.PreferencesProto$Value;
import b2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u0.f;
import u7.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb2/h;", "size", "Lm7/n;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends Lambda implements l<h, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f1383j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.f1383j = androidEdgeEffectOverscrollEffect;
    }

    @Override // u7.l
    public final n U(h hVar) {
        long j2 = hVar.f6346a;
        long M = v8.b.M(j2);
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.f1383j;
        boolean z10 = !f.a(M, androidEdgeEffectOverscrollEffect.n);
        androidEdgeEffectOverscrollEffect.n = v8.b.M(j2);
        if (z10) {
            int i10 = (int) (j2 >> 32);
            androidEdgeEffectOverscrollEffect.f1368b.setSize(i10, h.b(j2));
            androidEdgeEffectOverscrollEffect.c.setSize(i10, h.b(j2));
            androidEdgeEffectOverscrollEffect.f1369d.setSize(h.b(j2), i10);
            androidEdgeEffectOverscrollEffect.f1370e.setSize(h.b(j2), i10);
            androidEdgeEffectOverscrollEffect.f1372g.setSize(i10, h.b(j2));
            androidEdgeEffectOverscrollEffect.f1373h.setSize(i10, h.b(j2));
            androidEdgeEffectOverscrollEffect.f1374i.setSize(h.b(j2), i10);
            androidEdgeEffectOverscrollEffect.f1375j.setSize(h.b(j2), i10);
        }
        if (z10) {
            androidEdgeEffectOverscrollEffect.k();
            androidEdgeEffectOverscrollEffect.g();
        }
        return n.f16010a;
    }
}
