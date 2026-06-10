package mb;

import a1.c;
import c8.b;
import j$.util.concurrent.ConcurrentHashMap;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f16060a = new ConcurrentHashMap();

    public static final String a(b<?> bVar) {
        g.f(bVar, "<this>");
        ConcurrentHashMap concurrentHashMap = f16060a;
        String str = (String) concurrentHashMap.get(bVar);
        if (str == null) {
            String name = c.y0(bVar).getName();
            concurrentHashMap.put(bVar, name);
            return name;
        }
        return str;
    }
}
