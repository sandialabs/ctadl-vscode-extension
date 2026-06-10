package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import r.e;
import r.i;
import u7.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, d2 = {"T", "Lr/i;", "V", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.animation.core.Animatable$snapTo$2", f = "Animatable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Animatable$snapTo$2 extends SuspendLambda implements l<p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ a<Object, i> f1266m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(a<Object, i> aVar, Object obj, p7.c<? super Animatable$snapTo$2> cVar) {
        super(1, cVar);
        this.f1266m = aVar;
        this.n = obj;
    }

    @Override // u7.l
    public final Object U(p7.c<? super n> cVar) {
        return ((Animatable$snapTo$2) i(cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> i(p7.c<?> cVar) {
        return new Animatable$snapTo$2(this.f1266m, this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        a<Object, i> aVar = this.f1266m;
        e<Object, i> eVar = aVar.c;
        eVar.f16976k.d();
        eVar.f16977l = Long.MIN_VALUE;
        aVar.f1355d.setValue(Boolean.FALSE);
        Object b5 = aVar.b(this.n);
        aVar.c.f16975j.setValue(b5);
        aVar.f1356e.setValue(b5);
        return n.f16010a;
    }
}
