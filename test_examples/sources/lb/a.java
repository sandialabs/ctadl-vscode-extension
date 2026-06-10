package lb;

import androidx.fragment.app.g0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final org.koin.core.a f15885a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f15886b;
    public final HashSet<SingleInstanceFactory<?>> c;

    public a(org.koin.core.a aVar) {
        g.f(aVar, "_koin");
        this.f15885a = aVar;
        this.f15886b = new ConcurrentHashMap();
        this.c = new HashSet<>();
    }

    public final void a() {
        HashSet<SingleInstanceFactory<?>> hashSet = this.c;
        if (!hashSet.isEmpty()) {
            org.koin.core.a aVar = this.f15885a;
            if (aVar.c.c(Level.DEBUG)) {
                aVar.c.a("Creating eager instances ...");
            }
            g0 g0Var = new g0(aVar, aVar.f16502a.f15888b);
            Iterator<SingleInstanceFactory<?>> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().b(g0Var);
            }
        }
        hashSet.clear();
    }
}
