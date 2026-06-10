package org.koin.android.ext.koin;

import a1.c;
import com.noto.app.NotoApplication;
import org.koin.core.b;
import org.koin.core.logger.Level;
import v7.g;

/* loaded from: classes.dex */
public final class a {
    public static final void a(b bVar, NotoApplication notoApplication) {
        g.f(bVar, "<this>");
        g.f(notoApplication, "androidContext");
        org.koin.core.a aVar = bVar.f16504a;
        hb.b bVar2 = aVar.c;
        Level level = Level.INFO;
        if (bVar2.c(level)) {
            hb.b bVar3 = aVar.c;
            bVar3.getClass();
            bVar3.b("[init] declare Android Context", level);
        }
        aVar.a(c.N0(a1.b.s0(new KoinExtKt$androidContext$1(notoApplication))), true);
    }
}
