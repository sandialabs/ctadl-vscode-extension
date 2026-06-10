package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$handleUpdate$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Object f4701l;

    /* renamed from: m  reason: collision with root package name */
    public SingleProcessDataStore f4702m;
    public p n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f4703o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<Object> f4704p;

    /* renamed from: q  reason: collision with root package name */
    public int f4705q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$handleUpdate$1(SingleProcessDataStore<Object> singleProcessDataStore, p7.c<? super SingleProcessDataStore$handleUpdate$1> cVar) {
        super(cVar);
        this.f4704p = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4703o = obj;
        this.f4705q |= Integer.MIN_VALUE;
        return SingleProcessDataStore.c(this.f4704p, null, this);
    }
}
