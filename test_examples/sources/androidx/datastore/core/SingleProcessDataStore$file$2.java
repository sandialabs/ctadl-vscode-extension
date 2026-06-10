package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.File;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "Ljava/io/File;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class SingleProcessDataStore$file$2 extends Lambda implements u7.a<File> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<Object> f4700j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$file$2(SingleProcessDataStore<Object> singleProcessDataStore) {
        super(0);
        this.f4700j = singleProcessDataStore;
    }

    @Override // u7.a
    public final File k0() {
        File k02 = this.f4700j.f4676a.k0();
        String absolutePath = k02.getAbsolutePath();
        synchronized (SingleProcessDataStore.f4675l) {
            LinkedHashSet linkedHashSet = SingleProcessDataStore.f4674k;
            if (!linkedHashSet.contains(absolutePath)) {
                g.e(absolutePath, "it");
                linkedHashSet.add(absolutePath);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + k02 + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return k02;
    }
}
