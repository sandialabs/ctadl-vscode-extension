package org.koin.core;

import a1.c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.logger.Level;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final lb.b f16502a = new lb.b(this);

    /* renamed from: b  reason: collision with root package name */
    public final lb.a f16503b = new lb.a(this);
    public hb.b c;

    public a() {
        new ConcurrentHashMap();
        this.c = new hb.a();
    }

    public final void a(List<ib.a> list, boolean z10) {
        g.f(list, "modules");
        lb.a aVar = this.f16503b;
        aVar.getClass();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            Level level = Level.DEBUG;
            if (hasNext) {
                ib.a aVar2 = (ib.a) it.next();
                for (Map.Entry<String, gb.b<?>> entry : aVar2.c.entrySet()) {
                    String key = entry.getKey();
                    gb.b<?> value = entry.getValue();
                    g.f(key, "mapping");
                    g.f(value, "factory");
                    ConcurrentHashMap concurrentHashMap = aVar.f15886b;
                    boolean containsKey = concurrentHashMap.containsKey(key);
                    a aVar3 = aVar.f15885a;
                    BeanDefinition<?> beanDefinition = value.f11319a;
                    if (containsKey) {
                        if (z10) {
                            hb.b bVar = aVar3.c;
                            String str = "Override Mapping '" + key + "' with " + beanDefinition;
                            bVar.getClass();
                            g.f(str, "msg");
                            bVar.b(str, Level.INFO);
                        } else {
                            c.b1(value, key);
                            throw null;
                        }
                    }
                    if (aVar3.c.c(level)) {
                        aVar3.c.a("add mapping '" + key + "' for " + beanDefinition);
                    }
                    concurrentHashMap.put(key, value);
                }
                aVar.c.addAll(aVar2.f11871b);
            } else {
                lb.b bVar2 = this.f16502a;
                bVar2.getClass();
                for (ib.a aVar4 : list) {
                    bVar2.f15887a.addAll(aVar4.f11872d);
                }
                if (this.c.c(level)) {
                    this.c.a("create eager instances ...");
                    double R0 = c.R0(new Koin$createEagerInstances$duration$1(this));
                    this.c.a("eager instances created in " + R0 + " ms");
                    return;
                }
                aVar.a();
                return;
            }
        }
    }
}
