package j3;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import java.io.FileInputStream;
import m7.n;

/* loaded from: classes.dex */
public interface h<T> {
    MutablePreferences a();

    n b(Object obj, SingleProcessDataStore.b bVar);

    MutablePreferences c(FileInputStream fileInputStream);
}
