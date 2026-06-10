package androidx.compose.ui.input.nestedscroll;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@c(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {94, 96}, m = "onPostFling-RZ2iAVY")
/* loaded from: classes.dex */
public final class NestedScrollModifierLocal$onPostFling$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public NestedScrollModifierLocal f3264l;

    /* renamed from: m  reason: collision with root package name */
    public long f3265m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f3266o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NestedScrollModifierLocal f3267p;

    /* renamed from: q  reason: collision with root package name */
    public int f3268q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPostFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, p7.c<? super NestedScrollModifierLocal$onPostFling$1> cVar) {
        super(cVar);
        this.f3267p = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f3266o = obj;
        this.f3268q |= Integer.MIN_VALUE;
        return this.f3267p.d(0L, 0L, this);
    }
}
