package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import j3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"T", "", "it", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SingleProcessDataStore$actor$1 extends Lambda implements l<Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<Object> f4692j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$1(SingleProcessDataStore<Object> singleProcessDataStore) {
        super(1);
        this.f4692j = singleProcessDataStore;
    }

    @Override // u7.l
    public final n U(Throwable th) {
        Throwable th2 = th;
        if (th2 != null) {
            this.f4692j.f4682h.setValue(new e(th2));
        }
        Object obj = SingleProcessDataStore.f4675l;
        SingleProcessDataStore<Object> singleProcessDataStore = this.f4692j;
        synchronized (obj) {
            SingleProcessDataStore.f4674k.remove(singleProcessDataStore.d().getAbsolutePath());
        }
        return n.f16010a;
    }
}
