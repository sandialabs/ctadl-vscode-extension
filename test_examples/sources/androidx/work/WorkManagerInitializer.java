package androidx.work;

import android.content.Context;
import androidx.work.a;
import java.util.Collections;
import java.util.List;
import n4.g;
import n4.j;
import o4.a0;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements f4.b<j> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6195a = g.f("WrkMgrInitializer");

    @Override // f4.b
    public final List<Class<? extends f4.b<?>>> a() {
        return Collections.emptyList();
    }

    @Override // f4.b
    public final j b(Context context) {
        g.d().a(f6195a, "Initializing WorkManager with default configuration.");
        a0.e(context, new a(new a.C0047a()));
        return a0.d(context);
    }
}
