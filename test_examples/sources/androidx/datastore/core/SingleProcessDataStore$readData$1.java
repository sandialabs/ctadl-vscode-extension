package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.FileInputStream;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$readData$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public SingleProcessDataStore f4730l;

    /* renamed from: m  reason: collision with root package name */
    public FileInputStream f4731m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<T> f4732o;

    /* renamed from: p  reason: collision with root package name */
    public int f4733p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readData$1(SingleProcessDataStore<T> singleProcessDataStore, p7.c<? super SingleProcessDataStore$readData$1> cVar) {
        super(cVar);
        this.f4732o = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.n = obj;
        this.f4733p |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f4674k;
        return this.f4732o.h(this);
    }
}
