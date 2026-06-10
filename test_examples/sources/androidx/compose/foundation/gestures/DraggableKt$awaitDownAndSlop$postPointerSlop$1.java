package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import g1.o;
import h1.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$FloatRef;
import m7.n;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg1/o;", "event", "", "offset", "Lm7/n;", "invoke", "(Lg1/o;F)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DraggableKt$awaitDownAndSlop$postPointerSlop$1 extends Lambda implements p<o, Float, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ e f1701j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Ref$FloatRef f1702k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableKt$awaitDownAndSlop$postPointerSlop$1(e eVar, Ref$FloatRef ref$FloatRef) {
        super(2);
        this.f1701j = eVar;
        this.f1702k = ref$FloatRef;
    }

    @Override // u7.p
    public final n R(o oVar, Float f10) {
        o oVar2 = oVar;
        float floatValue = f10.floatValue();
        g.f(oVar2, "event");
        v0.p.e(this.f1701j, oVar2);
        oVar2.a();
        this.f1702k.f13057i = floatValue;
        return n.f16010a;
    }
}
