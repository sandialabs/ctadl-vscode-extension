package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class s0 {
    public static final s0 c = new s0();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f4936b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final b0 f4935a = new b0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.datastore.preferences.protobuf.m0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.m0] */
    public final <T> w0<T> a(Class<T> cls) {
        n0 n0Var;
        z zVar;
        b1<?, ?> b1Var;
        n<?> nVar;
        d0 d0Var;
        l0 u10;
        l0 l0Var;
        Class<?> cls2;
        Charset charset = u.f4942a;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f4936b;
            w0<T> w0Var = (w0) concurrentHashMap.get(cls);
            if (w0Var == null) {
                b0 b0Var = this.f4935a;
                b0Var.getClass();
                Class<?> cls3 = x0.f4952a;
                if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = x0.f4952a) != null && !cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
                g0 a10 = b0Var.f4843a.a(cls);
                if (a10.a()) {
                    if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                        l0Var = new m0(x0.f4954d, p.f4925a, a10.c());
                    } else {
                        b1<?, ?> b1Var2 = x0.f4953b;
                        n<?> nVar2 = p.f4926b;
                        if (nVar2 != null) {
                            l0Var = new m0(b1Var2, nVar2, a10.c());
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    }
                    u10 = l0Var;
                } else {
                    boolean isAssignableFrom = GeneratedMessageLite.class.isAssignableFrom(cls);
                    boolean z10 = true;
                    ProtoSyntax protoSyntax = ProtoSyntax.PROTO2;
                    if (isAssignableFrom) {
                        if (a10.b() != protoSyntax) {
                            z10 = false;
                        }
                        if (z10) {
                            n0Var = p0.f4928b;
                            zVar = z.f4956b;
                            b1Var = x0.f4954d;
                            nVar = p.f4925a;
                        } else {
                            n0Var = p0.f4928b;
                            zVar = z.f4956b;
                            b1Var = x0.f4954d;
                            nVar = null;
                        }
                        d0Var = f0.f4867b;
                    } else {
                        if (a10.b() != protoSyntax) {
                            z10 = false;
                        }
                        if (z10) {
                            n0Var = p0.f4927a;
                            zVar = z.f4955a;
                            b1<?, ?> b1Var3 = x0.f4953b;
                            n<?> nVar3 = p.f4926b;
                            if (nVar3 != null) {
                                b1Var = b1Var3;
                                nVar = nVar3;
                            } else {
                                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                            }
                        } else {
                            n0Var = p0.f4927a;
                            zVar = z.f4955a;
                            b1Var = x0.c;
                            nVar = null;
                        }
                        d0Var = f0.f4866a;
                    }
                    n0 n0Var2 = n0Var;
                    z zVar2 = zVar;
                    b1<?, ?> b1Var4 = b1Var;
                    n<?> nVar4 = nVar;
                    d0 d0Var2 = d0Var;
                    int[] iArr = l0.f4901r;
                    if (a10 instanceof u0) {
                        u10 = l0.u((u0) a10, n0Var2, zVar2, b1Var4, nVar4, d0Var2);
                    } else {
                        a1 a1Var = (a1) a10;
                        throw null;
                    }
                }
                w0<T> w0Var2 = (w0) concurrentHashMap.putIfAbsent(cls, u10);
                if (w0Var2 != null) {
                    return w0Var2;
                }
                return u10;
            }
            return w0Var;
        }
        throw new NullPointerException("messageType");
    }
}
