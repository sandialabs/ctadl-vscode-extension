package g0;

import android.os.Looper;
import androidx.compose.runtime.ComposerKt;
import fa.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;

/* loaded from: classes.dex */
public final class l0 implements b.InterfaceC0118b {

    /* renamed from: b  reason: collision with root package name */
    public final Object f11061b;

    public /* synthetic */ l0() {
        this.f11061b = new ArrayList();
    }

    public l0(int i10) {
        if (i10 != 3) {
            this.f11061b = new HashMap();
        } else {
            this.f11061b = v2.g.a(Looper.getMainLooper());
        }
    }

    public /* synthetic */ l0(int i10, int i11) {
        h1.c[] cVarArr = new h1.c[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            cVarArr[i12] = new h1.c(i11, 0);
        }
        this.f11061b = cVarArr;
    }

    public final void a(int i10) {
        Object obj = this.f11061b;
        if ((!((List) obj).isEmpty()) && (((Number) ((List) obj).get(0)).intValue() == i10 || ((Number) ((List) obj).get(((List) obj).size() - 1)).intValue() == i10)) {
            return;
        }
        int size = ((List) obj).size();
        ((List) obj).add(Integer.valueOf(i10));
        while (size > 0) {
            int i11 = ((size + 1) >>> 1) - 1;
            int intValue = ((Number) ((List) obj).get(i11)).intValue();
            if (i10 <= intValue) {
                break;
            }
            ((List) obj).set(size, Integer.valueOf(intValue));
            size = i11;
        }
        ((List) obj).set(size, Integer.valueOf(i10));
    }

    public final float b(int i10, int i11) {
        return ((Float[]) ((h1.c[]) this.f11061b)[i10].f11346b)[i11].floatValue();
    }

    @Override // fa.b.InterfaceC0118b
    public final Iterable c(Object obj) {
        l8.d dVar;
        l8.b bVar;
        JvmBuiltInsCustomizer jvmBuiltInsCustomizer = (JvmBuiltInsCustomizer) this.f11061b;
        c8.j<Object>[] jVarArr = JvmBuiltInsCustomizer.f13392h;
        v7.g.f(jvmBuiltInsCustomizer, "this$0");
        Collection<y9.r> f10 = ((l8.b) obj).o().f();
        v7.g.e(f10, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        for (y9.r rVar : f10) {
            l8.d c = rVar.U0().c();
            LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
            if (c != null) {
                dVar = c.a();
            } else {
                dVar = null;
            }
            if (dVar instanceof l8.b) {
                bVar = (l8.b) dVar;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                lazyJavaClassDescriptor = jvmBuiltInsCustomizer.f(bVar);
            }
            if (lazyJavaClassDescriptor != null) {
                arrayList.add(lazyJavaClassDescriptor);
            }
        }
        return arrayList;
    }

    public final h1.c d(int i10) {
        return ((h1.c[]) this.f11061b)[i10];
    }

    public final void e(float f10, int i10, int i11) {
        ((Float[]) ((h1.c[]) this.f11061b)[i10].f11346b)[i11] = Float.valueOf(f10);
    }

    public final int f() {
        int intValue;
        List list = (List) this.f11061b;
        if (!(list.size() > 0)) {
            ComposerKt.c("Set is empty".toString());
            throw null;
        }
        int intValue2 = ((Number) list.get(0)).intValue();
        while ((!list.isEmpty()) && ((Number) list.get(0)).intValue() == intValue2) {
            list.set(0, kotlin.collections.c.v2(list));
            list.remove(list.size() - 1);
            int size = list.size();
            int size2 = list.size() >>> 1;
            int i10 = 0;
            while (i10 < size2) {
                int intValue3 = ((Number) list.get(i10)).intValue();
                int i11 = (i10 + 1) * 2;
                int i12 = i11 - 1;
                int intValue4 = ((Number) list.get(i12)).intValue();
                if (i11 >= size || (intValue = ((Number) list.get(i11)).intValue()) <= intValue4) {
                    if (intValue4 > intValue3) {
                        list.set(i10, Integer.valueOf(intValue4));
                        list.set(i12, Integer.valueOf(intValue3));
                        i10 = i12;
                    }
                } else if (intValue > intValue3) {
                    list.set(i10, Integer.valueOf(intValue));
                    list.set(i11, Integer.valueOf(intValue3));
                    i10 = i11;
                }
            }
        }
        return intValue2;
    }
}
