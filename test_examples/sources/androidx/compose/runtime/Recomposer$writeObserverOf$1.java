package androidx.compose.runtime;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lm7/n;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class Recomposer$writeObserverOf$1 extends Lambda implements l<Object, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g0.l f2826j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ h0.c<Object> f2827k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(g0.l lVar, h0.c<Object> cVar) {
        super(1);
        this.f2826j = lVar;
        this.f2827k = cVar;
    }

    @Override // u7.l
    public final n U(Object obj) {
        v7.g.f(obj, "value");
        this.f2826j.g(obj);
        h0.c<Object> cVar = this.f2827k;
        if (cVar != null) {
            cVar.add(obj);
        }
        return n.f16010a;
    }
}
