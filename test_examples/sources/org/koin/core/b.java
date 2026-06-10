package org.koin.core;

import a1.c;
import java.util.List;
import org.koin.core.logger.Level;
import v7.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f16504a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f16505b = true;

    public final void a(ib.a... aVarArr) {
        List<ib.a> w22 = kotlin.collections.b.w2(aVarArr);
        g.f(w22, "modules");
        a aVar = this.f16504a;
        hb.b bVar = aVar.c;
        Level level = Level.INFO;
        if (bVar.c(level)) {
            double R0 = c.R0(new KoinApplication$modules$duration$1(this, w22));
            int size = aVar.f16503b.f15886b.size();
            hb.b bVar2 = aVar.c;
            String str = "loaded " + size + " definitions - " + R0 + " ms";
            bVar2.getClass();
            g.f(str, "msg");
            bVar2.b(str, level);
            return;
        }
        aVar.a(w22, this.f16505b);
    }
}
