package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.e;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.TypeCastException;

/* loaded from: classes.dex */
public final class f<Args extends e> implements m7.e<Args> {

    /* renamed from: i  reason: collision with root package name */
    public Args f5456i;

    /* renamed from: j  reason: collision with root package name */
    public final c8.b<Args> f5457j;

    /* renamed from: k  reason: collision with root package name */
    public final u7.a<Bundle> f5458k;

    public f(c8.b<Args> bVar, u7.a<Bundle> aVar) {
        v7.g.g(bVar, "navArgsClass");
        this.f5457j = bVar;
        this.f5458k = aVar;
    }

    @Override // m7.e
    public final boolean a() {
        throw null;
    }

    @Override // m7.e
    public final Object getValue() {
        Args args = this.f5456i;
        if (args == null) {
            Bundle k02 = this.f5458k.k0();
            p.b<c8.b<? extends e>, Method> bVar = g.f5474b;
            c8.b<Args> bVar2 = this.f5457j;
            Method orDefault = bVar.getOrDefault(bVar2, null);
            if (orDefault == null) {
                orDefault = a1.c.y0(bVar2).getMethod("fromBundle", (Class[]) Arrays.copyOf(g.f5473a, 1));
                bVar.put(bVar2, orDefault);
                v7.g.b(orDefault, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke = orDefault.invoke(null, k02);
            if (invoke != null) {
                Args args2 = (Args) invoke;
                this.f5456i = args2;
                return args2;
            }
            throw new TypeCastException();
        }
        return args;
    }
}
