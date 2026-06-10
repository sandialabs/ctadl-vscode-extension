package kotlin.reflect.jvm.internal.impl.types;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import y9.c0;

/* loaded from: classes.dex */
public final class l extends da.d<c0<?>, c0<?>> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f15045j = new a();

    /* renamed from: k  reason: collision with root package name */
    public static final l f15046k = new l(EmptyList.f12981i);

    /* loaded from: classes.dex */
    public static final class a extends TypeRegistry<c0<?>, c0<?>> {
        public static l c(List list) {
            if (list.isEmpty()) {
                return l.f15046k;
            }
            return new l(list);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public final <T extends c0<?>> int a(ConcurrentHashMap<c8.b<? extends c0<?>>, Integer> concurrentHashMap, c8.b<T> bVar, u7.l<? super c8.b<? extends c0<?>>, Integer> lVar) {
            int intValue;
            v7.g.f(concurrentHashMap, "<this>");
            v7.g.f(bVar, "kClass");
            Integer num = concurrentHashMap.get(bVar);
            if (num == null) {
                synchronized (concurrentHashMap) {
                    Integer num2 = concurrentHashMap.get(bVar);
                    if (num2 == null) {
                        Integer U = lVar.U(bVar);
                        concurrentHashMap.putIfAbsent(bVar, Integer.valueOf(U.intValue()));
                        num2 = U;
                    }
                    v7.g.e(num2, "this[kClass] ?: compute(…putIfAbsent(kClass, it) }");
                    intValue = num2.intValue();
                }
                return intValue;
            }
            return num.intValue();
        }
    }

    public l() {
        throw null;
    }

    public l(List<? extends c0<?>> list) {
        da.h hVar;
        for (c0<?> c0Var : list) {
            c8.b<? extends Object> b5 = c0Var.b();
            v7.g.f(b5, "tClass");
            int b10 = f15045j.b(b5);
            int c = this.f10480i.c();
            if (c != 0) {
                if (c == 1) {
                    w7.a aVar = this.f10480i;
                    v7.g.d(aVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    da.h hVar2 = (da.h) aVar;
                    if (hVar2.f10484j == b10) {
                        hVar = new da.h(b10, c0Var);
                    } else {
                        da.c cVar = new da.c();
                        this.f10480i = cVar;
                        cVar.d(hVar2.f10484j, hVar2.f10483i);
                    }
                }
                this.f10480i.d(b10, c0Var);
            } else {
                hVar = new da.h(b10, c0Var);
            }
            this.f10480i = hVar;
        }
    }
}
