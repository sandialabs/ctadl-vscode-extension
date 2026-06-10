package kotlin.reflect.jvm.internal;

import c8.k;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import y9.r;

/* loaded from: classes.dex */
public class h extends v7.j {
    public static KDeclarationContainerImpl j(CallableReference callableReference) {
        c8.d d5 = callableReference.d();
        return d5 instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) d5 : a.f13236j;
    }

    @Override // v7.j
    public final c8.e a(FunctionReference functionReference) {
        KDeclarationContainerImpl j2 = j(functionReference);
        String name = functionReference.getName();
        String e10 = functionReference.e();
        Object obj = functionReference.f13048j;
        v7.g.f(j2, "container");
        v7.g.f(name, "name");
        v7.g.f(e10, "signature");
        return new KFunctionImpl(j2, name, e10, null, obj);
    }

    @Override // v7.j
    public final c8.b b(Class cls) {
        return CachesKt.a(cls);
    }

    @Override // v7.j
    public final c8.d c(Class cls, String str) {
        f8.b bVar = CachesKt.f13076a;
        v7.g.f(cls, "jClass");
        return (c8.d) CachesKt.f13077b.L0(cls);
    }

    @Override // v7.j
    public final c8.g d(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(j(mutablePropertyReference1), mutablePropertyReference1.f13050l, mutablePropertyReference1.f13051m, mutablePropertyReference1.f13048j);
    }

    @Override // v7.j
    public final c8.h e(PropertyReference0 propertyReference0) {
        return new KProperty0Impl(j(propertyReference0), propertyReference0.f13050l, propertyReference0.f13051m, propertyReference0.f13048j);
    }

    @Override // v7.j
    public final c8.i f(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(j(propertyReference1), propertyReference1.f13050l, propertyReference1.f13051m, propertyReference1.f13048j);
    }

    @Override // v7.j
    public final String g(Lambda lambda) {
        return h(lambda);
    }

    @Override // v7.j
    public final String h(v7.f fVar) {
        KFunctionImpl b5;
        KFunctionImpl a10 = kotlin.reflect.jvm.a.a(fVar);
        if (a10 != null && (b5 = f8.i.b(a10)) != null) {
            DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f13232a;
            kotlin.reflect.jvm.internal.impl.descriptors.e d5 = b5.d();
            StringBuilder sb = new StringBuilder();
            ReflectionObjectRenderer.a(sb, d5);
            List<kotlin.reflect.jvm.internal.impl.descriptors.h> m10 = d5.m();
            v7.g.e(m10, "invoke.valueParameters");
            kotlin.collections.c.s2(m10, sb, ", ", "(", ")", ReflectionObjectRenderer$renderLambda$1$1.f13234j, 48);
            sb.append(" -> ");
            r k3 = d5.k();
            v7.g.c(k3);
            sb.append(ReflectionObjectRenderer.d(k3));
            String sb2 = sb.toString();
            v7.g.e(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        return super.h(fVar);
    }

    @Override // v7.j
    public final k i(c8.b bVar, List list) {
        Object putIfAbsent;
        if (bVar instanceof v7.b) {
            Class<?> e10 = ((v7.b) bVar).e();
            f8.b bVar2 = CachesKt.f13076a;
            v7.g.f(e10, "jClass");
            v7.g.f(list, "arguments");
            if (list.isEmpty()) {
                return (k) CachesKt.c.L0(e10);
            }
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) CachesKt.f13078d.L0(e10);
            Pair pair = new Pair(list, Boolean.FALSE);
            Object obj = concurrentHashMap.get(pair);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(pair, (obj = d8.a.a(CachesKt.a(e10), list, false, EmptyList.f12981i)))) != null) {
                obj = putIfAbsent;
            }
            return (k) obj;
        }
        return d8.a.a(bVar, list, false, Collections.emptyList());
    }
}
