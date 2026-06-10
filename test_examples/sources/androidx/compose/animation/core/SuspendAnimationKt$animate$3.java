package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import r.a0;
import r.z;
import u7.l;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lr/i;", "V", "Lr/c;", "Lm7/n;", "invoke", "(Lr/c;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$3 extends Lambda implements l<r.c<Object, Object>, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ p<Object, Object, n> f1307j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ z<Object, Object> f1308k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuspendAnimationKt$animate$3(p pVar, a0 a0Var) {
        super(1);
        this.f1307j = pVar;
        this.f1308k = a0Var;
    }

    @Override // u7.l
    public final n U(r.c<Object, Object> cVar) {
        r.c<Object, Object> cVar2 = cVar;
        g.f(cVar2, "$this$animate");
        this.f1307j.R(cVar2.a(), this.f1308k.b().U(cVar2.f16968f));
        return n.f16010a;
    }
}
