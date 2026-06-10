package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.x;
import java.util.HashMap;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public class y {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<Class<?>, String> f5556b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, x<? extends n>> f5557a = new HashMap<>();

    public static String b(Class<? extends x> cls) {
        boolean z10;
        HashMap<Class<?>, String> hashMap = f5556b;
        String str = hashMap.get(cls);
        if (str == null) {
            x.a aVar = (x.a) cls.getAnnotation(x.a.class);
            if (aVar != null) {
                str = aVar.value();
            } else {
                str = null;
            }
            if (str != null && !str.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                hashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
            }
        }
        return str;
    }

    public final void a(x xVar) {
        boolean z10;
        String b5 = b(xVar.getClass());
        if (b5 != null && !b5.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f5557a.put(b5, xVar);
            return;
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public <T extends x<?>> T c(String str) {
        boolean z10;
        if (str != null && !str.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            x<? extends n> xVar = this.f5557a.get(str);
            if (xVar != null) {
                return xVar;
            }
            throw new IllegalStateException(a4.b.m("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
