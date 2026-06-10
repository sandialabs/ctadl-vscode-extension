package androidx.lifecycle;

import android.os.Bundle;
import b4.b;
import java.util.Map;

/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements b.InterfaceC0053b {

    /* renamed from: a  reason: collision with root package name */
    public final b4.b f5356a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5357b;
    public Bundle c;

    /* renamed from: d  reason: collision with root package name */
    public final m7.e f5358d;

    public SavedStateHandlesProvider(b4.b bVar, n0 n0Var) {
        v7.g.f(bVar, "savedStateRegistry");
        v7.g.f(n0Var, "viewModelStoreOwner");
        this.f5356a = bVar;
        this.f5358d = kotlin.a.b(new SavedStateHandlesProvider$viewModel$2(n0Var));
    }

    @Override // b4.b.InterfaceC0053b
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((e0) this.f5358d.getValue()).f5382d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a10 = ((d0) entry.getValue()).f5379e.a();
            if (!v7.g.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f5357b = false;
        return bundle;
    }
}
