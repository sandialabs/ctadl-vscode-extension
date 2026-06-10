package androidx.compose.ui.input.nestedscroll;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@c(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {217}, m = "dispatchPostFling-RZ2iAVY")
/* loaded from: classes.dex */
public final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f3254l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ NestedScrollDispatcher f3255m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, p7.c<? super NestedScrollDispatcher$dispatchPostFling$1> cVar) {
        super(cVar);
        this.f3255m = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f3254l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.f3255m.a(0L, 0L, this);
    }
}
