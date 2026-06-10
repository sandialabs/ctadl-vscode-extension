package androidx.compose.animation.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import r.e;
import r.i;
import u7.l;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, 278}, m = "animate")
/* loaded from: classes.dex */
public final class SuspendAnimationKt$animate$4<T, V extends i> extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public e f1309l;

    /* renamed from: m  reason: collision with root package name */
    public r.a f1310m;
    public l n;

    /* renamed from: o  reason: collision with root package name */
    public Ref$ObjectRef f1311o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f1312p;

    /* renamed from: q  reason: collision with root package name */
    public int f1313q;

    public SuspendAnimationKt$animate$4(p7.c<? super SuspendAnimationKt$animate$4> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1312p = obj;
        this.f1313q |= Integer.MIN_VALUE;
        return SuspendAnimationKt.a(null, null, 0L, null, this);
    }
}
