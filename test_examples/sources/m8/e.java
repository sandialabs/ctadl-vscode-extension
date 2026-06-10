package m8;

import java.util.Iterator;
import kotlin.collections.EmptyList;
import n7.q;

/* loaded from: classes.dex */
public interface e extends Iterable<c>, w7.a {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0187a f16014a = new C0187a();

        /* renamed from: m8.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0187a implements e {
            @Override // m8.e
            public final boolean i(h9.c cVar) {
                return b.b(this, cVar);
            }

            @Override // m8.e
            public final boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public final Iterator<c> iterator() {
                EmptyList.f12981i.getClass();
                return q.f16127i;
            }

            @Override // m8.e
            public final c j(h9.c cVar) {
                v7.g.f(cVar, "fqName");
                return null;
            }

            public final String toString() {
                return "EMPTY";
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static c a(e eVar, h9.c cVar) {
            c cVar2;
            v7.g.f(cVar, "fqName");
            Iterator<c> it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar2 = null;
                    break;
                }
                cVar2 = it.next();
                if (v7.g.a(cVar2.e(), cVar)) {
                    break;
                }
            }
            return cVar2;
        }

        public static boolean b(e eVar, h9.c cVar) {
            v7.g.f(cVar, "fqName");
            return eVar.j(cVar) != null;
        }
    }

    boolean i(h9.c cVar);

    boolean isEmpty();

    c j(h9.c cVar);
}
