package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import v7.g;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Ljava/io/File;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends Lambda implements u7.a<File> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Context f4753j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b f4754k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, b bVar) {
        super(0);
        this.f4753j = context;
        this.f4754k = bVar;
    }

    @Override // u7.a
    public final File k0() {
        Context context = this.f4753j;
        g.e(context, "applicationContext");
        String str = this.f4754k.f4763a;
        g.f(str, "name");
        String k3 = g.k(".preferences_pb", str);
        g.f(k3, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), g.k(k3, "datastore/"));
    }
}
