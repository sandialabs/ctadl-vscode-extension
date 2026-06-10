package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public Object f4717l;

    /* renamed from: m  reason: collision with root package name */
    public Object f4718m;
    public Object n;

    /* renamed from: o  reason: collision with root package name */
    public Ref$ObjectRef f4719o;

    /* renamed from: p  reason: collision with root package name */
    public SingleProcessDataStore f4720p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f4721q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 f4722r;

    /* renamed from: s  reason: collision with root package name */
    public int f4723s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, p7.c<? super SingleProcessDataStore$readAndInit$api$1$updateData$1> cVar) {
        super(cVar);
        this.f4722r = singleProcessDataStore$readAndInit$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4721q = obj;
        this.f4723s |= Integer.MIN_VALUE;
        return this.f4722r.a(null, this);
    }
}
