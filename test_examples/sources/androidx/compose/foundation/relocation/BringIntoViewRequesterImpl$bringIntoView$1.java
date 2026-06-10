package androidx.compose.foundation.relocation;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;
import u0.d;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@c(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {121}, m = "bringIntoView")
/* loaded from: classes.dex */
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public d f2032l;

    /* renamed from: m  reason: collision with root package name */
    public Object[] f2033m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f2034o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f2035p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequesterImpl f2036q;

    /* renamed from: r  reason: collision with root package name */
    public int f2037r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, p7.c<? super BringIntoViewRequesterImpl$bringIntoView$1> cVar) {
        super(cVar);
        this.f2036q = bringIntoViewRequesterImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f2035p = obj;
        this.f2037r |= Integer.MIN_VALUE;
        return this.f2036q.a(null, this);
    }
}
