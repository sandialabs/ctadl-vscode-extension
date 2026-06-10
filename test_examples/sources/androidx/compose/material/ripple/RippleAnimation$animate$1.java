package androidx.compose.material.ripple;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
/* loaded from: classes.dex */
public final class RippleAnimation$animate$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public RippleAnimation f2154l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f2155m;
    public final /* synthetic */ RippleAnimation n;

    /* renamed from: o  reason: collision with root package name */
    public int f2156o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleAnimation$animate$1(RippleAnimation rippleAnimation, p7.c<? super RippleAnimation$animate$1> cVar) {
        super(cVar);
        this.n = rippleAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f2155m = obj;
        this.f2156o |= Integer.MIN_VALUE;
        return this.n.a(this);
    }
}
