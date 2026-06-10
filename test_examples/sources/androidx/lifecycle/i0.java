package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5397a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f5398b = new LinkedHashSet();
    public volatile boolean c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public void b() {
    }

    public final Object c(Object obj, String str) {
        Object obj2;
        synchronized (this.f5397a) {
            obj2 = this.f5397a.get(str);
            if (obj2 == null) {
                this.f5397a.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.c) {
            a(obj);
        }
        return obj;
    }
}
