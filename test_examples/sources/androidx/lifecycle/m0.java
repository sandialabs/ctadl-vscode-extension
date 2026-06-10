package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5410a = new LinkedHashMap();

    public final void a() {
        for (i0 i0Var : this.f5410a.values()) {
            i0Var.c = true;
            HashMap hashMap = i0Var.f5397a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : i0Var.f5397a.values()) {
                        i0.a(obj);
                    }
                }
            }
            LinkedHashSet linkedHashSet = i0Var.f5398b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : i0Var.f5398b) {
                        i0.a(closeable);
                    }
                }
            }
            i0Var.b();
        }
        this.f5410a.clear();
    }
}
