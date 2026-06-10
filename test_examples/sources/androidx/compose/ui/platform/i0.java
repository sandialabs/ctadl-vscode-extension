package androidx.compose.ui.platform;

import android.os.Bundle;
import android.os.Parcelable;
import b4.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i0 implements b.InterfaceC0053b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o0.c f3849a;

    public i0(o0.d dVar) {
        this.f3849a = dVar;
    }

    @Override // b4.b.InterfaceC0053b
    public final Bundle a() {
        ArrayList<? extends Parcelable> arrayList;
        Map<String, List<Object>> b5 = this.f3849a.b();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, List<Object>> entry : b5.entrySet()) {
            String key = entry.getKey();
            List<Object> value = entry.getValue();
            if (value instanceof ArrayList) {
                arrayList = (ArrayList) value;
            } else {
                arrayList = new ArrayList<>(value);
            }
            bundle.putParcelableArrayList(key, arrayList);
        }
        return bundle;
    }
}
