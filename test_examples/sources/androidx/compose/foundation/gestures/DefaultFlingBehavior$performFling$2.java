package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import m7.n;
import r.f;
import t.i;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr/c;", "", "Lr/f;", "Lm7/n;", "invoke", "(Lr/c;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DefaultFlingBehavior$performFling$2 extends Lambda implements l<r.c<Float, f>, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref$FloatRef f1613j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i f1614k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Ref$FloatRef f1615l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(Ref$FloatRef ref$FloatRef, ScrollingLogic$doFlingAnimation$2.a aVar, Ref$FloatRef ref$FloatRef2) {
        super(1);
        this.f1613j = ref$FloatRef;
        this.f1614k = aVar;
        this.f1615l = ref$FloatRef2;
    }

    @Override // u7.l
    public final n U(r.c<Float, f> cVar) {
        r.c<Float, f> cVar2 = cVar;
        g.f(cVar2, "$this$animateDecay");
        float floatValue = cVar2.a().floatValue();
        Ref$FloatRef ref$FloatRef = this.f1613j;
        float f10 = floatValue - ref$FloatRef.f13057i;
        float a10 = this.f1614k.a(f10);
        ref$FloatRef.f13057i = cVar2.a().floatValue();
        this.f1615l.f13057i = cVar2.f16964a.b().U(cVar2.f16968f).floatValue();
        if (Math.abs(f10 - a10) > 0.5f) {
            cVar2.f16971i.setValue(Boolean.FALSE);
            cVar2.f16966d.k0();
        }
        return n.f16010a;
    }
}
