package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import q7.c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1}, xi = 48)
@c(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$transformAndWrite$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public SingleProcessDataStore f4738l;

    /* renamed from: m  reason: collision with root package name */
    public Object f4739m;
    public Object n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f4740o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<Object> f4741p;

    /* renamed from: q  reason: collision with root package name */
    public int f4742q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$1(SingleProcessDataStore<Object> singleProcessDataStore, p7.c<? super SingleProcessDataStore$transformAndWrite$1> cVar) {
        super(cVar);
        this.f4741p = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f4740o = obj;
        this.f4742q |= Integer.MIN_VALUE;
        LinkedHashSet linkedHashSet = SingleProcessDataStore.f4674k;
        return this.f4741p.j(this, null, null);
    }
}
