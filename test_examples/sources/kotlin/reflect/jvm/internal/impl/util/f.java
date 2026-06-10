package kotlin.reflect.jvm.internal.impl.util;

import kotlin.reflect.jvm.internal.impl.util.b;

/* loaded from: classes.dex */
public abstract class f implements kotlin.reflect.jvm.internal.impl.util.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f15104a;

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f15105b = new a();

        public a() {
            super("must be a member function");
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.b
        public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            v7.g.f(eVar, "functionDescriptor");
            return eVar.E() != null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final b f15106b = new b();

        public b() {
            super("must be a member or an extension function");
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.b
        public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            v7.g.f(eVar, "functionDescriptor");
            if (eVar.E() == null && eVar.R() == null) {
                return false;
            }
            return true;
        }
    }

    public f(String str) {
        this.f15104a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String a() {
        return this.f15104a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }
}
