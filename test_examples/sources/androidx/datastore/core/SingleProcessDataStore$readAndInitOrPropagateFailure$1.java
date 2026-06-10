package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInitOrPropagateFailure$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public SingleProcessDataStore f4727l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f4728m;
    public final /* synthetic */ SingleProcessDataStore<T> n;

    /* renamed from: o  reason: collision with root package name */
    public int f4729o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateFailure$1(SingleProcessDataStore<T> singleProcessDataStore, p7.c<? super SingleProcessDataStore$readAndInitOrPropagateFailure$1> cVar) {
        super(cVar);
        this.n = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4728m = obj;
        this.f4729o |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f4674k;
        return this.n.g(this);
    }
}
