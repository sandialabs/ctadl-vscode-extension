package r8;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* loaded from: classes.dex */
public final class g extends e implements b9.e {

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f17149b;

    public g(h9.e eVar, Object[] objArr) {
        super(eVar);
        this.f17149b = objArr;
    }

    @Override // b9.e
    public final ArrayList c() {
        b9.b oVar;
        Object[] objArr = this.f17149b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            v7.g.c(obj);
            Class<?> cls = obj.getClass();
            List<c8.b<? extends Object>> list = ReflectClassUtilKt.f13582a;
            if (Enum.class.isAssignableFrom(cls)) {
                oVar = new m(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                oVar = new f(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                oVar = new g(null, (Object[]) obj);
            } else if (obj instanceof Class) {
                oVar = new i(null, (Class) obj);
            } else {
                oVar = new o(obj, null);
            }
            arrayList.add(oVar);
        }
        return arrayList;
    }
}
