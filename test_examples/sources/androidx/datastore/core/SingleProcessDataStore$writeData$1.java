package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$writeData$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public SingleProcessDataStore f4745l;

    /* renamed from: m  reason: collision with root package name */
    public File f4746m;
    public FileOutputStream n;

    /* renamed from: o  reason: collision with root package name */
    public FileOutputStream f4747o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f4748p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f4749q;

    /* renamed from: r  reason: collision with root package name */
    public int f4750r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$writeData$1(SingleProcessDataStore<T> singleProcessDataStore, p7.c<? super SingleProcessDataStore$writeData$1> cVar) {
        super(cVar);
        this.f4749q = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4748p = obj;
        this.f4750r |= Integer.MIN_VALUE;
        return this.f4749q.k(null, this);
    }
}
