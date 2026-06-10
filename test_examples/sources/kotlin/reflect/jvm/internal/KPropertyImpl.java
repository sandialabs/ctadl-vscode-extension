package kotlin.reflect.jvm.internal;

import c8.f;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.b;
import kotlin.reflect.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl;
import l8.a0;
import l8.b0;
import l8.z;
import m7.n;

/* loaded from: classes.dex */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements c8.j<V> {

    /* renamed from: p  reason: collision with root package name */
    public static final Object f13198p = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final KDeclarationContainerImpl f13199j;

    /* renamed from: k  reason: collision with root package name */
    public final String f13200k;

    /* renamed from: l  reason: collision with root package name */
    public final String f13201l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f13202m;
    public final g.b<Field> n;

    /* renamed from: o  reason: collision with root package name */
    public final g.a<z> f13203o;

    /* loaded from: classes.dex */
    public static abstract class Getter<V> extends a<V, V> {

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ c8.j<Object>[] f13204l = {v7.i.c(new PropertyReference1Impl(v7.i.a(Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Getter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: j  reason: collision with root package name */
        public final g.a f13205j = g.c(new KPropertyImpl$Getter$descriptor$2(this));

        /* renamed from: k  reason: collision with root package name */
        public final g.b f13206k = g.b(new KPropertyImpl$Getter$caller$2(this));

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final kotlin.reflect.jvm.internal.calls.a<?> b() {
            c8.j<Object> jVar = f13204l[1];
            Object k02 = this.f13206k.k0();
            v7.g.e(k02, "<get-caller>(...)");
            return (kotlin.reflect.jvm.internal.calls.a) k02;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final CallableMemberDescriptor d() {
            c8.j<Object> jVar = f13204l[0];
            Object k02 = this.f13205j.k0();
            v7.g.e(k02, "<get-descriptor>(...)");
            return (a0) k02;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Getter) && v7.g.a(h(), ((Getter) obj).h());
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        public final kotlin.reflect.jvm.internal.impl.descriptors.f g() {
            c8.j<Object> jVar = f13204l[0];
            Object k02 = this.f13205j.k0();
            v7.g.e(k02, "<get-descriptor>(...)");
            return (a0) k02;
        }

        @Override // c8.a
        public final String getName() {
            return androidx.activity.e.j(new StringBuilder("<get-"), h().f13200k, '>');
        }

        public final int hashCode() {
            return h().hashCode();
        }

        public final String toString() {
            return "getter of " + h();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Setter<V> extends a<V, n> implements f.a<V> {

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ c8.j<Object>[] f13209l = {v7.i.c(new PropertyReference1Impl(v7.i.a(Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), v7.i.c(new PropertyReference1Impl(v7.i.a(Setter.class), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};

        /* renamed from: j  reason: collision with root package name */
        public final g.a f13210j = g.c(new KPropertyImpl$Setter$descriptor$2(this));

        /* renamed from: k  reason: collision with root package name */
        public final g.b f13211k = g.b(new KPropertyImpl$Setter$caller$2(this));

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final kotlin.reflect.jvm.internal.calls.a<?> b() {
            c8.j<Object> jVar = f13209l[1];
            Object k02 = this.f13211k.k0();
            v7.g.e(k02, "<get-caller>(...)");
            return (kotlin.reflect.jvm.internal.calls.a) k02;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final CallableMemberDescriptor d() {
            c8.j<Object> jVar = f13209l[0];
            Object k02 = this.f13210j.k0();
            v7.g.e(k02, "<get-descriptor>(...)");
            return (b0) k02;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Setter) && v7.g.a(h(), ((Setter) obj).h());
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.a
        public final kotlin.reflect.jvm.internal.impl.descriptors.f g() {
            c8.j<Object> jVar = f13209l[0];
            Object k02 = this.f13210j.k0();
            v7.g.e(k02, "<get-descriptor>(...)");
            return (b0) k02;
        }

        @Override // c8.a
        public final String getName() {
            return androidx.activity.e.j(new StringBuilder("<set-"), h().f13200k, '>');
        }

        public final int hashCode() {
            return h().hashCode();
        }

        public final String toString() {
            return "setter of " + h();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements c8.e<ReturnType> {
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final KDeclarationContainerImpl c() {
            return h().f13199j;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public final boolean f() {
            return h().f();
        }

        public abstract kotlin.reflect.jvm.internal.impl.descriptors.f g();

        public abstract KPropertyImpl<PropertyType> h();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(str, "name");
        v7.g.f(str2, "signature");
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, z zVar, Object obj) {
        this.f13199j = kDeclarationContainerImpl;
        this.f13200k = str;
        this.f13201l = str2;
        this.f13202m = obj;
        this.n = new g.b<>(new KPropertyImpl$_javaField$1(this));
        this.f13203o = new g.a<>(zVar, new KPropertyImpl$_descriptor$1(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, z zVar) {
        this(kDeclarationContainerImpl, r3, i.b(zVar).a(), zVar, CallableReference.f13046o);
        v7.g.f(kDeclarationContainerImpl, "container");
        v7.g.f(zVar, "descriptor");
        String b5 = zVar.getName().b();
        v7.g.e(b5, "descriptor.name.asString()");
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final kotlin.reflect.jvm.internal.calls.a<?> b() {
        return i().b();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final KDeclarationContainerImpl c() {
        return this.f13199j;
    }

    public final boolean equals(Object obj) {
        KPropertyImpl<?> c = f8.i.c(obj);
        return c != null && v7.g.a(this.f13199j, c.f13199j) && v7.g.a(this.f13200k, c.f13200k) && v7.g.a(this.f13201l, c.f13201l) && v7.g.a(this.f13202m, c.f13202m);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public final boolean f() {
        return !v7.g.a(this.f13202m, CallableReference.f13046o);
    }

    public final Member g() {
        boolean z10;
        boolean z11;
        if (!d().p0()) {
            return null;
        }
        h9.b bVar = i.f13291a;
        b b5 = i.b(d());
        if (b5 instanceof b.c) {
            b.c cVar = (b.c) b5;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = cVar.c;
            boolean z12 = true;
            if ((jvmPropertySignature.f14470j & 16) == 16) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.f14474o;
                int i10 = jvmMethodSignature.f14460j;
                if ((i10 & 1) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if ((i10 & 2) != 2) {
                        z12 = false;
                    }
                    if (z12) {
                        int i11 = jvmMethodSignature.f14461k;
                        f9.c cVar2 = cVar.f13242d;
                        return this.f13199j.g(cVar2.getString(i11), cVar2.getString(jvmMethodSignature.f14462l));
                    }
                }
                return null;
            }
        }
        return this.n.k0();
    }

    @Override // c8.a
    public final String getName() {
        return this.f13200k;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    /* renamed from: h */
    public final z d() {
        z k02 = this.f13203o.k0();
        v7.g.e(k02, "_descriptor()");
        return k02;
    }

    public final int hashCode() {
        return this.f13201l.hashCode() + a4.b.g(this.f13200k, this.f13199j.hashCode() * 31, 31);
    }

    public abstract Getter<V> i();

    public final String toString() {
        DescriptorRendererImpl descriptorRendererImpl = ReflectionObjectRenderer.f13232a;
        return ReflectionObjectRenderer.c(d());
    }
}
