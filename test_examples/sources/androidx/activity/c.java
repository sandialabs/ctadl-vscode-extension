package androidx.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.d0;
import b4.b;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements b.InterfaceC0053b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f451a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f452b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f451a = i10;
        this.f452b = obj;
    }

    @Override // b4.b.InterfaceC0053b
    public final Bundle a() {
        int i10 = this.f451a;
        Object obj = this.f452b;
        switch (i10) {
            case 0:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                componentActivity.getClass();
                Bundle bundle = new Bundle();
                ComponentActivity.b bVar = componentActivity.f419r;
                bVar.getClass();
                HashMap hashMap = bVar.c;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(bVar.f481e));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) bVar.f484h.clone());
                bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", bVar.f478a);
                return bundle;
            default:
                return d0.a((d0) obj);
        }
    }
}
