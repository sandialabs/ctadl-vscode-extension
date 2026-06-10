package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.util.b;

/* loaded from: classes.dex */
public abstract class h implements kotlin.reflect.jvm.internal.impl.util.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f15108a;

    /* loaded from: classes.dex */
    public static final class a extends h {

        /* renamed from: b  reason: collision with root package name */
        public final int f15109b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i10) {
            super(r0.toString());
            String str;
            StringBuilder o10 = a4.b.o("must have at least ", i10, " value parameter");
            if (i10 > 1) {
                str = "s";
            } else {
                str = "";
            }
            o10.append(str);
            this.f15109b = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.b
        public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            v7.g.f(eVar, "functionDescriptor");
            return eVar.m().size() >= this.f15109b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends h {

        /* renamed from: b  reason: collision with root package name */
        public final int f15110b;

        public b() {
            super("must have exactly 2 value parameters");
            this.f15110b = 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.b
        public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            v7.g.f(eVar, "functionDescriptor");
            return eVar.m().size() == this.f15110b;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends h {

        /* renamed from: b  reason: collision with root package name */
        public static final c f15111b = new c();

        public c() {
            super("must have no value parameters");
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.b
        public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            v7.g.f(eVar, "functionDescriptor");
            return eVar.m().isEmpty();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends h {

        /* renamed from: b  reason: collision with root package name */
        public static final d f15112b = new d();

        public d() {
            super("must have a single value parameter");
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.b
        public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            v7.g.f(eVar, "functionDescriptor");
            return eVar.m().size() == 1;
        }
    }

    public h(String str) {
        this.f15108a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String a() {
        return this.f15108a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }
}
