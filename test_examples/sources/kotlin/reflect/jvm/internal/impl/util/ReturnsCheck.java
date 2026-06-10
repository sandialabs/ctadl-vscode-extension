package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.b;
import u7.l;
import y9.r;
import y9.v;

/* loaded from: classes.dex */
public abstract class ReturnsCheck implements b {

    /* renamed from: a  reason: collision with root package name */
    public final l<kotlin.reflect.jvm.internal.impl.builtins.e, r> f15088a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15089b;

    /* loaded from: classes.dex */
    public static final class ReturnsBoolean extends ReturnsCheck {
        public static final ReturnsBoolean c = new ReturnsBoolean();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsBoolean$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements l<kotlin.reflect.jvm.internal.impl.builtins.e, r> {

            /* renamed from: j  reason: collision with root package name */
            public static final AnonymousClass1 f15090j = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // u7.l
            public final r U(kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
                kotlin.reflect.jvm.internal.impl.builtins.e eVar2 = eVar;
                v7.g.f(eVar2, "$this$null");
                v t10 = eVar2.t(PrimitiveType.n);
                if (t10 != null) {
                    return t10;
                }
                kotlin.reflect.jvm.internal.impl.builtins.e.a(63);
                throw null;
            }
        }

        public ReturnsBoolean() {
            super("Boolean", AnonymousClass1.f15090j);
        }
    }

    /* loaded from: classes.dex */
    public static final class ReturnsInt extends ReturnsCheck {
        public static final ReturnsInt c = new ReturnsInt();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsInt$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements l<kotlin.reflect.jvm.internal.impl.builtins.e, r> {

            /* renamed from: j  reason: collision with root package name */
            public static final AnonymousClass1 f15091j = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // u7.l
            public final r U(kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
                kotlin.reflect.jvm.internal.impl.builtins.e eVar2 = eVar;
                v7.g.f(eVar2, "$this$null");
                v t10 = eVar2.t(PrimitiveType.f13300r);
                if (t10 != null) {
                    return t10;
                }
                kotlin.reflect.jvm.internal.impl.builtins.e.a(58);
                throw null;
            }
        }

        public ReturnsInt() {
            super("Int", AnonymousClass1.f15091j);
        }
    }

    /* loaded from: classes.dex */
    public static final class ReturnsUnit extends ReturnsCheck {
        public static final ReturnsUnit c = new ReturnsUnit();

        /* renamed from: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsUnit$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements l<kotlin.reflect.jvm.internal.impl.builtins.e, r> {

            /* renamed from: j  reason: collision with root package name */
            public static final AnonymousClass1 f15092j = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // u7.l
            public final r U(kotlin.reflect.jvm.internal.impl.builtins.e eVar) {
                kotlin.reflect.jvm.internal.impl.builtins.e eVar2 = eVar;
                v7.g.f(eVar2, "$this$null");
                v x3 = eVar2.x();
                v7.g.e(x3, "unitType");
                return x3;
            }
        }

        public ReturnsUnit() {
            super("Unit", AnonymousClass1.f15092j);
        }
    }

    public ReturnsCheck(String str, l lVar) {
        this.f15088a = lVar;
        this.f15089b = "must return ".concat(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String a() {
        return this.f15089b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final String b(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.b
    public final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        v7.g.f(eVar, "functionDescriptor");
        return v7.g.a(eVar.k(), this.f15088a.U(DescriptorUtilsKt.e(eVar)));
    }
}
