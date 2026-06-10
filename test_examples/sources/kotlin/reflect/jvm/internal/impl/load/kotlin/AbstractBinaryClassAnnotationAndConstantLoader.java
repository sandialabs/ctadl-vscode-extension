package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.f;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import l8.d0;
import m9.k;
import m9.o;
import m9.q;
import m9.s;
import m9.t;
import m9.u;
import m9.v;
import u7.p;
import y9.r;

/* loaded from: classes.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, a<? extends A, ? extends C>> implements kotlin.reflect.jvm.internal.impl.serialization.deserialization.b<A, C> {

    /* renamed from: b  reason: collision with root package name */
    public final x9.c<h, a<A, C>> f13911b;

    /* loaded from: classes.dex */
    public static final class a<A, C> extends AbstractBinaryClassAnnotationLoader.a<A> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<i, List<A>> f13912a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<i, C> f13913b;
        public final Map<i, C> c;

        public a(HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
            this.f13912a = hashMap;
            this.f13913b = hashMap2;
            this.c = hashMap3;
        }
    }

    public AbstractBinaryClassAnnotationAndConstantLoader(LockBasedStorageManager lockBasedStorageManager, q8.f fVar) {
        super(fVar);
        this.f13911b = lockBasedStorageManager.e(new AbstractBinaryClassAnnotationAndConstantLoader$storage$1(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.b
    public final C h(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, ProtoBuf$Property protoBuf$Property, r rVar) {
        v7.g.f(protoBuf$Property, "proto");
        return t(fVar, protoBuf$Property, AnnotatedCallableKind.PROPERTY, rVar, AbstractBinaryClassAnnotationAndConstantLoader$loadPropertyConstant$1.f13915j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.b
    public final C k(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, ProtoBuf$Property protoBuf$Property, r rVar) {
        v7.g.f(protoBuf$Property, "proto");
        return t(fVar, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, rVar, AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationDefaultValue$1.f13914j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C t(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f fVar, ProtoBuf$Property protoBuf$Property, AnnotatedCallableKind annotatedCallableKind, r rVar, p<? super a<? extends A, ? extends C>, ? super i, ? extends C> pVar) {
        C R;
        m9.g gVar;
        d9.i iVar;
        h o10 = o(fVar, true, true, f9.b.A.c(protoBuf$Property.f14220l), g9.h.d(protoBuf$Property));
        if (o10 == null) {
            if (fVar instanceof f.a) {
                d0 d0Var = ((f.a) fVar).c;
                if (d0Var instanceof d9.i) {
                    iVar = (d9.i) d0Var;
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    o10 = iVar.f10462b;
                }
            }
            o10 = null;
        }
        if (o10 == null) {
            return null;
        }
        g9.e eVar = o10.a().f13954b;
        g9.e eVar2 = g.f13951e;
        eVar.getClass();
        v7.g.f(eVar2, "version");
        i n = AbstractBinaryClassAnnotationLoader.n(protoBuf$Property, fVar.f14895a, fVar.f14896b, annotatedCallableKind, eVar.a(eVar2.f10974b, eVar2.c, eVar2.f10975d));
        if (n == null || (R = pVar.R((Object) ((LockBasedStorageManager.k) this.f13911b).U(o10), n)) == null) {
            return null;
        }
        if (i8.g.a(rVar)) {
            C c = (C) ((m9.g) R);
            if (c instanceof m9.d) {
                gVar = new s(((Number) ((m9.d) c).f16022a).byteValue());
            } else if (c instanceof q) {
                gVar = new v(((Number) ((q) c).f16022a).shortValue());
            } else if (c instanceof k) {
                gVar = new t(((Number) ((k) c).f16022a).intValue());
            } else if (c instanceof o) {
                gVar = new u(((Number) ((o) c).f16022a).longValue());
            } else {
                return c;
            }
            return gVar;
        }
        return R;
    }
}
