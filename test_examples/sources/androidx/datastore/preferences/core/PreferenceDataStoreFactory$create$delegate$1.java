package androidx.datastore.preferences.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.text.b;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends Lambda implements u7.a<File> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ u7.a<File> f4773j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStoreFactory$create$delegate$1(u7.a<? extends File> aVar) {
        super(0);
        this.f4773j = aVar;
    }

    @Override // u7.a
    public final File k0() {
        File k02 = this.f4773j.k0();
        g.f(k02, "<this>");
        String name = k02.getName();
        g.e(name, "name");
        if (g.a(b.t1(name, '.', ""), "preferences_pb")) {
            return k02;
        }
        throw new IllegalStateException(("File extension for file: " + k02 + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
