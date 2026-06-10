package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import o8.a0;
import u9.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<KotlinClassHeader.Kind> f13949b = a1.c.v1(KotlinClassHeader.Kind.f13961l);
    public static final Set<KotlinClassHeader.Kind> c = a1.c.w1(KotlinClassHeader.Kind.f13962m, KotlinClassHeader.Kind.f13964p);

    /* renamed from: d  reason: collision with root package name */
    public static final g9.e f13950d;

    /* renamed from: e  reason: collision with root package name */
    public static final g9.e f13951e;

    /* renamed from: a  reason: collision with root package name */
    public u9.e f13952a;

    static {
        new g9.e(new int[]{1, 1, 2}, false);
        f13950d = new g9.e(new int[]{1, 1, 11}, false);
        f13951e = new g9.e(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w9.f a(a0 a0Var, h hVar) {
        String[] strArr;
        Pair<g9.f, ProtoBuf$Package> pair;
        v7.g.f(a0Var, "descriptor");
        v7.g.f(hVar, "kotlinClass");
        KotlinClassHeader a10 = hVar.a();
        String[] strArr2 = a10.c;
        if (strArr2 == null) {
            strArr2 = a10.f13955d;
        }
        if (strArr2 != null) {
            if (c.contains(a10.f13953a)) {
                if (strArr2 != null || (strArr = hVar.a().f13956e) == null) {
                    return null;
                }
                try {
                    try {
                        pair = g9.h.h(strArr2, strArr);
                    } catch (InvalidProtocolBufferException e10) {
                        throw new IllegalStateException("Could not read data from " + hVar.b(), e10);
                    }
                } catch (Throwable th) {
                    c().c.e();
                    if (!hVar.a().f13954b.c()) {
                        pair = null;
                    } else {
                        throw th;
                    }
                }
                if (pair != null) {
                    return null;
                }
                g9.f fVar = pair.f12962i;
                ProtoBuf$Package protoBuf$Package = pair.f12963j;
                d(hVar);
                e(hVar);
                d9.c cVar = new d9.c(hVar, protoBuf$Package, fVar, b(hVar));
                return new w9.f(a0Var, protoBuf$Package, fVar, hVar.a().f13954b, cVar, c(), "scope for " + cVar + " in " + a0Var, DeserializedDescriptorResolver$createKotlinPackagePartScope$2.f13922j);
            }
        }
        strArr2 = null;
        if (strArr2 != null) {
            return null;
        }
        pair = g9.h.h(strArr2, strArr);
        if (pair != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DeserializedContainerAbiStability b(h hVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        c().c.b();
        DeserializedContainerAbiStability deserializedContainerAbiStability = DeserializedContainerAbiStability.STABLE;
        int i10 = hVar.a().f13958g;
        boolean z15 = true;
        if ((i10 & 64) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((i10 & 32) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                z11 = true;
                if (!z11) {
                    return DeserializedContainerAbiStability.FIR_UNSTABLE;
                }
                int i11 = hVar.a().f13958g;
                if ((i11 & 16) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if ((i11 & 32) != 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (!z13) {
                        if (!z15) {
                            return DeserializedContainerAbiStability.IR_UNSTABLE;
                        }
                        return deserializedContainerAbiStability;
                    }
                }
                z15 = false;
                if (!z15) {
                }
            }
        }
        z11 = false;
        if (!z11) {
        }
    }

    public final u9.e c() {
        u9.e eVar = this.f13952a;
        if (eVar != null) {
            return eVar;
        }
        v7.g.l("components");
        throw null;
    }

    public final l<g9.e> d(h hVar) {
        c().c.e();
        if (hVar.a().f13954b.c()) {
            return null;
        }
        return new l<>(hVar.a().f13954b, g9.e.f11274g, hVar.b(), hVar.d());
    }

    public final boolean e(h hVar) {
        boolean z10;
        boolean z11;
        c().c.f();
        c().c.c();
        if ((hVar.a().f13958g & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && v7.g.a(hVar.a().f13954b, f13950d)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u9.b f(h hVar) {
        String[] strArr;
        Pair<g9.f, ProtoBuf$Class> pair;
        KotlinClassHeader a10 = hVar.a();
        String[] strArr2 = a10.c;
        if (strArr2 == null) {
            strArr2 = a10.f13955d;
        }
        if (strArr2 != null) {
            if (f13949b.contains(a10.f13953a)) {
                if (strArr2 != null || (strArr = hVar.a().f13956e) == null) {
                    return null;
                }
                try {
                    try {
                        pair = g9.h.f(strArr2, strArr);
                    } catch (InvalidProtocolBufferException e10) {
                        throw new IllegalStateException("Could not read data from " + hVar.b(), e10);
                    }
                } catch (Throwable th) {
                    c().c.e();
                    if (!hVar.a().f13954b.c()) {
                        pair = null;
                    } else {
                        throw th;
                    }
                }
                if (pair != null) {
                    return null;
                }
                d(hVar);
                e(hVar);
                return new u9.b(pair.f12962i, pair.f12963j, hVar.a().f13954b, new d9.i(hVar, b(hVar)));
            }
        }
        strArr2 = null;
        if (strArr2 != null) {
            return null;
        }
        pair = g9.h.f(strArr2, strArr);
        if (pair != null) {
        }
    }
}
