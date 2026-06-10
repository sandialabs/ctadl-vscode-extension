package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.i;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "changed", "Lp0/f;", "<anonymous parameter 1>", "Lm7/n;", "invoke", "(Ljava/util/Set;Lp0/f;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class Recomposer$recompositionRunner$2$unregisterApplyObserver$1 extends Lambda implements p<Set<? extends Object>, p0.f, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Recomposer f2813j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2$unregisterApplyObserver$1(Recomposer recomposer) {
        super(2);
        this.f2813j = recomposer;
    }

    @Override // u7.p
    public final n R(Set<? extends Object> set, p0.f fVar) {
        i<n> iVar;
        Set<? extends Object> set2 = set;
        v7.g.f(set2, "changed");
        v7.g.f(fVar, "<anonymous parameter 1>");
        Recomposer recomposer = this.f2813j;
        synchronized (recomposer.f2777d) {
            if (((Recomposer.State) recomposer.f2789q.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                recomposer.f2781h.add(set2);
                iVar = recomposer.x();
            } else {
                iVar = null;
            }
        }
        if (iVar != null) {
            iVar.t(n.f16010a);
        }
        return n.f16010a;
    }
}
