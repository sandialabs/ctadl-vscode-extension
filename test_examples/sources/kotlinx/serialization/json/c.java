package kotlinx.serialization.json;

import qa.d;
import va.p;

@d(with = p.class)
/* loaded from: classes.dex */
public abstract class c extends b {
    public static final a Companion = new a();

    /* loaded from: classes.dex */
    public static final class a {
        public final qa.b<c> serializer() {
            return p.f18233a;
        }
    }

    public abstract String c();

    public String toString() {
        return c();
    }
}
