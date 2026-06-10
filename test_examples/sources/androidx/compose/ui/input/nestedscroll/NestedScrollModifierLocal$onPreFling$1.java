package androidx.compose.ui.input.nestedscroll;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@c(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {88, 89}, m = "onPreFling-QWom1Mo")
/* loaded from: classes.dex */
public final class NestedScrollModifierLocal$onPreFling$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public NestedScrollModifierLocal f3269l;

    /* renamed from: m  reason: collision with root package name */
    public long f3270m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ NestedScrollModifierLocal f3271o;

    /* renamed from: p  reason: collision with root package name */
    public int f3272p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPreFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, p7.c<? super NestedScrollModifierLocal$onPreFling$1> cVar) {
        super(cVar);
        this.f3271o = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f3272p |= Integer.MIN_VALUE;
        return this.f3271o.e(0L, this);
    }
}
