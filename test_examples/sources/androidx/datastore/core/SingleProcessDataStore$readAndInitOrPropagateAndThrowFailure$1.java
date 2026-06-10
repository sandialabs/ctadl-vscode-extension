package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public SingleProcessDataStore f4724l;

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f4725m;
    public final /* synthetic */ SingleProcessDataStore<T> n;

    /* renamed from: o  reason: collision with root package name */
    public int f4726o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(SingleProcessDataStore<T> singleProcessDataStore, p7.c<? super SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1> cVar) {
        super(cVar);
        this.n = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4725m = obj;
        this.f4726o |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f4674k;
        return this.n.f(this);
    }
}
