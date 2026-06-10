package fa;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ma.i;
import u7.l;

/* loaded from: classes.dex */
public final class b {

    /* loaded from: classes.dex */
    public static abstract class a<N, R> implements c<N, R> {
        @Override // fa.b.c
        public void b(N n) {
        }
    }

    /* renamed from: fa.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0118b<N> {
        Iterable<? extends N> c(N n);
    }

    /* loaded from: classes.dex */
    public interface c<N, R> {
        R a();

        void b(N n);

        boolean c(N n);
    }

    /* loaded from: classes.dex */
    public static class d<N> {

        /* renamed from: a  reason: collision with root package name */
        public final Set<N> f11010a = new HashSet();
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case i.f16049q /* 15 */:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case i.f16046m /* 9 */:
                objArr[0] = "predicate";
                break;
            case i.f16047o /* 10 */:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case i.f16046m /* 9 */:
                objArr[2] = "ifAny";
                break;
            case i.f16047o /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case i.f16049q /* 15 */:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(List list, InterfaceC0118b interfaceC0118b, a aVar) {
        d dVar = new d();
        for (Object obj : list) {
            c(obj, interfaceC0118b, dVar, aVar);
        }
        return aVar.a();
    }

    public static void c(Object obj, InterfaceC0118b interfaceC0118b, d dVar, a aVar) {
        if (obj != null) {
            if (!dVar.f11010a.add(obj) || !aVar.c(obj)) {
                return;
            }
            for (Object obj2 : interfaceC0118b.c(obj)) {
                c(obj2, interfaceC0118b, dVar, aVar);
            }
            aVar.b(obj);
            return;
        }
        a(22);
        throw null;
    }

    public static Boolean d(List list, InterfaceC0118b interfaceC0118b, l lVar) {
        if (lVar != null) {
            return (Boolean) b(list, interfaceC0118b, new fa.a(lVar, new boolean[1]));
        }
        a(9);
        throw null;
    }
}
