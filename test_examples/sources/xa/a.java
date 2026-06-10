package xa;

import java.util.List;
import v7.g;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: xa.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0240a extends a {
        @Override // xa.a
        public final qa.b<?> a(List<? extends qa.b<?>> list) {
            g.f(list, "typeArgumentsSerializers");
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0240a) {
                ((C0240a) obj).getClass();
                if (g.a(null, null)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        @Override // xa.a
        public final qa.b<?> a(List<? extends qa.b<?>> list) {
            g.f(list, "typeArgumentsSerializers");
            throw null;
        }
    }

    public abstract qa.b<?> a(List<? extends qa.b<?>> list);
}
