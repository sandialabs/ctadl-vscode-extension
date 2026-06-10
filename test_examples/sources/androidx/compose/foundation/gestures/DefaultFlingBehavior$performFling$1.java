package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior", f = "Scrollable.kt", l = {496}, m = "performFling")
/* loaded from: classes.dex */
public final class DefaultFlingBehavior$performFling$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Ref$FloatRef f1610l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f1611m;
    public final /* synthetic */ a n;

    /* renamed from: o  reason: collision with root package name */
    public int f1612o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$1(a aVar, p7.c<? super DefaultFlingBehavior$performFling$1> cVar) {
        super(cVar);
        this.n = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f1611m = obj;
        this.f1612o |= Integer.MIN_VALUE;
        return this.n.a(null, 0.0f, this);
    }
}
