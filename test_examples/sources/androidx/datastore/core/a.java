package androidx.datastore.core;

import j3.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import m7.n;
import p7.c;
import u7.l;

/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final C0034a f4751a = new C0034a();

    /* renamed from: androidx.datastore.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0034a {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:23:0x0067). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:23:0x0067). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Object a(C0034a c0034a, List list, f fVar, c cVar) {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            int i10;
            List list2;
            Iterator<T> it;
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            c0034a.getClass();
            if (cVar instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) cVar;
                int i11 = dataMigrationInitializer$Companion$runMigrations$1.f4658p;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.f4658p = i11 - Integer.MIN_VALUE;
                    Object obj = dataMigrationInitializer$Companion$runMigrations$1.n;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i10 = dataMigrationInitializer$Companion$runMigrations$1.f4658p;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                it = dataMigrationInitializer$Companion$runMigrations$1.f4656m;
                                ref$ObjectRef = (Ref$ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.f4655l;
                                try {
                                    m0.b.n1(obj);
                                } catch (Throwable r52) {
                                    r52 = (T) th;
                                    T t10 = ref$ObjectRef.f13060i;
                                    if (t10 == null) {
                                        ref$ObjectRef.f13060i = r52;
                                    } else {
                                        a1.c.M((Throwable) t10, r52);
                                    }
                                }
                                while (it.hasNext()) {
                                    l lVar = (l) it.next();
                                    dataMigrationInitializer$Companion$runMigrations$1.f4655l = ref$ObjectRef;
                                    dataMigrationInitializer$Companion$runMigrations$1.f4656m = it;
                                    dataMigrationInitializer$Companion$runMigrations$1.f4658p = 2;
                                    if (lVar.U(dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                                        return obj2;
                                    }
                                }
                                th = (Throwable) ref$ObjectRef.f13060i;
                                if (th == null) {
                                    return n.f16010a;
                                }
                                throw th;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.f4655l;
                        m0.b.n1(obj);
                    } else {
                        m0.b.n1(obj);
                        ArrayList arrayList = new ArrayList();
                        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
                        dataMigrationInitializer$Companion$runMigrations$1.f4655l = arrayList;
                        dataMigrationInitializer$Companion$runMigrations$1.f4658p = 1;
                        if (fVar.a(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) != obj2) {
                            list2 = arrayList;
                        } else {
                            return obj2;
                        }
                    }
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    it = list2.iterator();
                    ref$ObjectRef = ref$ObjectRef2;
                    while (it.hasNext()) {
                    }
                    th = (Throwable) ref$ObjectRef.f13060i;
                    if (th == null) {
                    }
                }
            }
            dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(c0034a, cVar);
            Object obj3 = dataMigrationInitializer$Companion$runMigrations$1.n;
            Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i10 = dataMigrationInitializer$Companion$runMigrations$1.f4658p;
            if (i10 == 0) {
            }
            Ref$ObjectRef ref$ObjectRef22 = new Ref$ObjectRef();
            it = list2.iterator();
            ref$ObjectRef = ref$ObjectRef22;
            while (it.hasNext()) {
            }
            th = (Throwable) ref$ObjectRef.f13060i;
            if (th == null) {
            }
        }
    }
}
