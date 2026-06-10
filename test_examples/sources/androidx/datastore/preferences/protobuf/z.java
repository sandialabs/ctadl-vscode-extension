package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final a f4955a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f4956b = new b();

    /* loaded from: classes.dex */
    public static final class a extends z {
        public static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX WARN: Multi-variable type inference failed */
        public static List d(int i10, long j2, Object obj) {
            u.c k3;
            x xVar;
            List list = (List) f1.n(j2, obj);
            if (list.isEmpty()) {
                if (list instanceof y) {
                    list = new x(i10);
                } else if ((list instanceof r0) && (list instanceof u.c)) {
                    k3 = ((u.c) list).k(i10);
                    list = k3;
                } else {
                    list = new ArrayList(i10);
                }
                f1.u(j2, obj, list);
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    ArrayList arrayList = new ArrayList(list.size() + i10);
                    arrayList.addAll(list);
                    xVar = arrayList;
                } else if (list instanceof e1) {
                    x xVar2 = new x(list.size() + i10);
                    xVar2.addAll((e1) list);
                    xVar = xVar2;
                } else if ((list instanceof r0) && (list instanceof u.c)) {
                    u.c cVar = (u.c) list;
                    if (!cVar.r()) {
                        k3 = cVar.k(list.size() + i10);
                        list = k3;
                        f1.u(j2, obj, list);
                    }
                }
                list = xVar;
                f1.u(j2, obj, list);
            }
            return list;
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public final void a(long j2, Object obj) {
            Object unmodifiableList;
            List list = (List) f1.n(j2, obj);
            if (list instanceof y) {
                unmodifiableList = ((y) list).a();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof r0) && (list instanceof u.c)) {
                    u.c cVar = (u.c) list;
                    if (cVar.r()) {
                        cVar.f();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            f1.u(j2, obj, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public final void b(long j2, Object obj, Object obj2) {
            List list = (List) f1.n(j2, obj2);
            List d5 = d(list.size(), j2, obj);
            int size = d5.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d5.addAll(list);
            }
            if (size > 0) {
                list = d5;
            }
            f1.u(j2, obj, list);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public final List c(long j2, Object obj) {
            return d(10, j2, obj);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z {
        @Override // androidx.datastore.preferences.protobuf.z
        public final void a(long j2, Object obj) {
            ((u.c) f1.n(j2, obj)).f();
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public final void b(long j2, Object obj, Object obj2) {
            u.c cVar = (u.c) f1.n(j2, obj);
            u.c cVar2 = (u.c) f1.n(j2, obj2);
            int size = cVar.size();
            int size2 = cVar2.size();
            if (size > 0 && size2 > 0) {
                if (!cVar.r()) {
                    cVar = cVar.k(size2 + size);
                }
                cVar.addAll(cVar2);
            }
            if (size > 0) {
                cVar2 = cVar;
            }
            f1.u(j2, obj, cVar2);
        }

        @Override // androidx.datastore.preferences.protobuf.z
        public final List c(long j2, Object obj) {
            int i10;
            u.c cVar = (u.c) f1.n(j2, obj);
            if (!cVar.r()) {
                int size = cVar.size();
                if (size == 0) {
                    i10 = 10;
                } else {
                    i10 = size * 2;
                }
                u.c k3 = cVar.k(i10);
                f1.u(j2, obj, k3);
                return k3;
            }
            return cVar;
        }
    }

    public abstract void a(long j2, Object obj);

    public abstract void b(long j2, Object obj, Object obj2);

    public abstract List c(long j2, Object obj);
}
