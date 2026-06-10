package androidx.datastore.preferences;

import ja.f0;
import ja.l1;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.e;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static b a() {
        PreferenceDataStoreDelegateKt$preferencesDataStore$1 preferenceDataStoreDelegateKt$preferencesDataStore$1 = PreferenceDataStoreDelegateKt$preferencesDataStore$1.f4752j;
        kotlinx.coroutines.scheduling.a aVar = f0.f12767b;
        l1 l1Var = new l1(null);
        aVar.getClass();
        e g10 = a1.b.g(CoroutineContext.DefaultImpls.a(aVar, l1Var));
        g.f(preferenceDataStoreDelegateKt$preferencesDataStore$1, "produceMigrations");
        return new b(preferenceDataStoreDelegateKt$preferencesDataStore$1, g10);
    }
}
