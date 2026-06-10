package hb;

import org.koin.core.logger.Level;
import v7.g;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Level f11615a;

    public b(Level level) {
        g.f(level, "level");
        this.f11615a = level;
    }

    public final void a(String str) {
        g.f(str, "msg");
        b(str, Level.DEBUG);
    }

    public final void b(String str, Level level) {
        boolean z10;
        if (this.f11615a.compareTo(level) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d(str, level);
        }
    }

    public final boolean c(Level level) {
        return this.f11615a.compareTo(level) <= 0;
    }

    public abstract void d(String str, Level level);

    public final void e(u7.a aVar) {
        Level level = Level.DEBUG;
        if (c(level)) {
            b((String) aVar.k0(), level);
        }
    }
}
