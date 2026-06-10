package v7;

import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.TypeReference;

/* loaded from: classes.dex */
public class j {
    public c8.e a(FunctionReference functionReference) {
        return functionReference;
    }

    public c8.b b(Class cls) {
        return new c(cls);
    }

    public c8.d c(Class cls, String str) {
        return new h(cls, str);
    }

    public c8.g d(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public c8.h e(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public c8.i f(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public String g(Lambda lambda) {
        return h(lambda);
    }

    public String h(f fVar) {
        String obj = fVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public c8.k i(c8.b bVar, List list) {
        return new TypeReference(bVar, list);
    }
}
