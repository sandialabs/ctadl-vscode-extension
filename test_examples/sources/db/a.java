package db;

import a1.c;
import v7.g;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: db.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0108a {
        public static org.koin.core.a a(a aVar) {
            g.f(aVar, "this");
            org.koin.core.a aVar2 = c.f72i;
            if (aVar2 != null) {
                return aVar2;
            }
            throw new IllegalStateException("KoinApplication has not been started".toString());
        }
    }

    org.koin.core.a c();
}
