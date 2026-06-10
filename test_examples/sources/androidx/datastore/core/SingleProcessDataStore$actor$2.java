package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"T", "Landroidx/datastore/core/SingleProcessDataStore$a;", "msg", "", "ex", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SingleProcessDataStore$actor$2 extends Lambda implements p<SingleProcessDataStore.a<Object>, Throwable, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final SingleProcessDataStore$actor$2 f4693j = new SingleProcessDataStore$actor$2();

    public SingleProcessDataStore$actor$2() {
        super(2);
    }

    @Override // u7.p
    public final n R(SingleProcessDataStore.a<Object> aVar, Throwable th) {
        SingleProcessDataStore.a<Object> aVar2 = aVar;
        Throwable th2 = th;
        g.f(aVar2, "msg");
        if (aVar2 instanceof SingleProcessDataStore.a.b) {
            SingleProcessDataStore.a.b bVar = (SingleProcessDataStore.a.b) aVar2;
            if (th2 == null) {
                th2 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            bVar.f4690b.q(th2);
        }
        return n.f16010a;
    }
}
