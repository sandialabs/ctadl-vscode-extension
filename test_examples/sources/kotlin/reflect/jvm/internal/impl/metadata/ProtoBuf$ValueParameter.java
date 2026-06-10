package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> {

    /* renamed from: t  reason: collision with root package name */
    public static final ProtoBuf$ValueParameter f14382t;

    /* renamed from: u  reason: collision with root package name */
    public static final a f14383u = new a();

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14384j;

    /* renamed from: k  reason: collision with root package name */
    public int f14385k;

    /* renamed from: l  reason: collision with root package name */
    public int f14386l;

    /* renamed from: m  reason: collision with root package name */
    public int f14387m;
    public ProtoBuf$Type n;

    /* renamed from: o  reason: collision with root package name */
    public int f14388o;

    /* renamed from: p  reason: collision with root package name */
    public ProtoBuf$Type f14389p;

    /* renamed from: q  reason: collision with root package name */
    public int f14390q;

    /* renamed from: r  reason: collision with root package name */
    public byte f14391r;

    /* renamed from: s  reason: collision with root package name */
    public int f14392s;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$ValueParameter> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$ValueParameter(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$ValueParameter, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14393l;

        /* renamed from: m  reason: collision with root package name */
        public int f14394m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public ProtoBuf$Type f14395o;

        /* renamed from: p  reason: collision with root package name */
        public int f14396p;

        /* renamed from: q  reason: collision with root package name */
        public ProtoBuf$Type f14397q;

        /* renamed from: r  reason: collision with root package name */
        public int f14398r;

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
            this.f14395o = protoBuf$Type;
            this.f14397q = protoBuf$Type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$ValueParameter l2 = l();
            if (l2.a()) {
                return l2;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final Object clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a, kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final /* bridge */ /* synthetic */ h.a g(c cVar, d dVar) {
            n(cVar, dVar);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a
        public final /* bridge */ /* synthetic */ a.AbstractC0162a h(c cVar, d dVar) {
            n(cVar, dVar);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final GeneratedMessageLite.a i() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.a j(GeneratedMessageLite generatedMessageLite) {
            m((ProtoBuf$ValueParameter) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$ValueParameter l() {
            ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(this);
            int i10 = this.f14393l;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$ValueParameter.f14386l = this.f14394m;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$ValueParameter.f14387m = this.n;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$ValueParameter.n = this.f14395o;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$ValueParameter.f14388o = this.f14396p;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$ValueParameter.f14389p = this.f14397q;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            protoBuf$ValueParameter.f14390q = this.f14398r;
            protoBuf$ValueParameter.f14385k = i11;
            return protoBuf$ValueParameter;
        }

        public final void m(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$ValueParameter == ProtoBuf$ValueParameter.f14382t) {
                return;
            }
            int i10 = protoBuf$ValueParameter.f14385k;
            boolean z15 = false;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = protoBuf$ValueParameter.f14386l;
                this.f14393l |= 1;
                this.f14394m = i11;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = protoBuf$ValueParameter.f14387m;
                this.f14393l = 2 | this.f14393l;
                this.n = i12;
            }
            if ((i10 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$ValueParameter.n;
                if ((this.f14393l & 4) == 4 && (protoBuf$Type2 = this.f14395o) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t10 = ProtoBuf$Type.t(protoBuf$Type2);
                    t10.m(protoBuf$Type3);
                    protoBuf$Type3 = t10.l();
                }
                this.f14395o = protoBuf$Type3;
                this.f14393l |= 4;
            }
            int i13 = protoBuf$ValueParameter.f14385k;
            if ((i13 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i14 = protoBuf$ValueParameter.f14388o;
                this.f14393l = 8 | this.f14393l;
                this.f14396p = i14;
            }
            if ((i13 & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$ValueParameter.f14389p;
                if ((this.f14393l & 16) == 16 && (protoBuf$Type = this.f14397q) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t11 = ProtoBuf$Type.t(protoBuf$Type);
                    t11.m(protoBuf$Type4);
                    protoBuf$Type4 = t11.l();
                }
                this.f14397q = protoBuf$Type4;
                this.f14393l |= 16;
            }
            if ((protoBuf$ValueParameter.f14385k & 32) == 32) {
                z15 = true;
            }
            if (z15) {
                int i15 = protoBuf$ValueParameter.f14390q;
                this.f14393l = 32 | this.f14393l;
                this.f14398r = i15;
            }
            k(protoBuf$ValueParameter);
            this.f14526i = this.f14526i.d(protoBuf$ValueParameter.f14384j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            try {
                try {
                    ProtoBuf$ValueParameter.f14383u.getClass();
                    m(new ProtoBuf$ValueParameter(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$ValueParameter = null;
                    if (protoBuf$ValueParameter != null) {
                        m(protoBuf$ValueParameter);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$ValueParameter = (ProtoBuf$ValueParameter) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$ValueParameter != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(0);
        f14382t = protoBuf$ValueParameter;
        protoBuf$ValueParameter.f14386l = 0;
        protoBuf$ValueParameter.f14387m = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
        protoBuf$ValueParameter.n = protoBuf$Type;
        protoBuf$ValueParameter.f14388o = 0;
        protoBuf$ValueParameter.f14389p = protoBuf$Type;
        protoBuf$ValueParameter.f14390q = 0;
    }

    public ProtoBuf$ValueParameter() {
        throw null;
    }

    public ProtoBuf$ValueParameter(int i10) {
        this.f14391r = (byte) -1;
        this.f14392s = -1;
        this.f14384j = i9.a.f11832i;
    }

    public ProtoBuf$ValueParameter(c cVar, d dVar) {
        this.f14391r = (byte) -1;
        this.f14392s = -1;
        boolean z10 = false;
        this.f14386l = 0;
        this.f14387m = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
        this.n = protoBuf$Type;
        this.f14388o = 0;
        this.f14389p = protoBuf$Type;
        this.f14390q = 0;
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.f14385k |= 1;
                            this.f14386l = cVar.k();
                        } else if (n != 16) {
                            ProtoBuf$Type.b bVar2 = null;
                            if (n == 26) {
                                if ((this.f14385k & 4) == 4) {
                                    ProtoBuf$Type protoBuf$Type2 = this.n;
                                    protoBuf$Type2.getClass();
                                    bVar2 = ProtoBuf$Type.t(protoBuf$Type2);
                                }
                                ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                                this.n = protoBuf$Type3;
                                if (bVar2 != null) {
                                    bVar2.m(protoBuf$Type3);
                                    this.n = bVar2.l();
                                }
                                this.f14385k |= 4;
                            } else if (n == 34) {
                                if ((this.f14385k & 16) == 16) {
                                    ProtoBuf$Type protoBuf$Type4 = this.f14389p;
                                    protoBuf$Type4.getClass();
                                    bVar2 = ProtoBuf$Type.t(protoBuf$Type4);
                                }
                                ProtoBuf$Type protoBuf$Type5 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                                this.f14389p = protoBuf$Type5;
                                if (bVar2 != null) {
                                    bVar2.m(protoBuf$Type5);
                                    this.f14389p = bVar2.l();
                                }
                                this.f14385k |= 16;
                            } else if (n == 40) {
                                this.f14385k |= 8;
                                this.f14388o = cVar.k();
                            } else if (n == 48) {
                                this.f14385k |= 32;
                                this.f14390q = cVar.k();
                            } else if (!p(cVar, j2, dVar, n)) {
                            }
                        } else {
                            this.f14385k |= 2;
                            this.f14387m = cVar.k();
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f14537i = this;
                    throw e10;
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f14537i = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14384j = bVar.c();
                    throw th2;
                }
                this.f14384j = bVar.c();
                n();
                throw th;
            }
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14384j = bVar.c();
            throw th3;
        }
        this.f14384j = bVar.c();
        n();
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte b5 = this.f14391r;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        int i10 = this.f14385k;
        if ((i10 & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f14391r = (byte) 0;
            return false;
        }
        if ((i10 & 4) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.n.a()) {
            this.f14391r = (byte) 0;
            return false;
        }
        if ((this.f14385k & 16) == 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.f14389p.a()) {
            this.f14391r = (byte) 0;
            return false;
        } else if (!j()) {
            this.f14391r = (byte) 0;
            return false;
        } else {
            this.f14391r = (byte) 1;
            return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.f14392s;
        if (i10 != -1) {
            return i10;
        }
        int b5 = (this.f14385k & 1) == 1 ? 0 + CodedOutputStream.b(1, this.f14386l) : 0;
        if ((this.f14385k & 2) == 2) {
            b5 += CodedOutputStream.b(2, this.f14387m);
        }
        if ((this.f14385k & 4) == 4) {
            b5 += CodedOutputStream.d(3, this.n);
        }
        if ((this.f14385k & 16) == 16) {
            b5 += CodedOutputStream.d(4, this.f14389p);
        }
        if ((this.f14385k & 8) == 8) {
            b5 += CodedOutputStream.b(5, this.f14388o);
        }
        if ((this.f14385k & 32) == 32) {
            b5 += CodedOutputStream.b(6, this.f14390q);
        }
        int size = this.f14384j.size() + k() + b5;
        this.f14392s = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a c() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a d() {
        return new b();
    }

    @Override // i9.f
    public final h e() {
        return f14382t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        if ((this.f14385k & 1) == 1) {
            codedOutputStream.m(1, this.f14386l);
        }
        if ((this.f14385k & 2) == 2) {
            codedOutputStream.m(2, this.f14387m);
        }
        if ((this.f14385k & 4) == 4) {
            codedOutputStream.o(3, this.n);
        }
        if ((this.f14385k & 16) == 16) {
            codedOutputStream.o(4, this.f14389p);
        }
        if ((this.f14385k & 8) == 8) {
            codedOutputStream.m(5, this.f14388o);
        }
        if ((this.f14385k & 32) == 32) {
            codedOutputStream.m(6, this.f14390q);
        }
        aVar.a(200, codedOutputStream);
        codedOutputStream.r(this.f14384j);
    }

    public ProtoBuf$ValueParameter(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14391r = (byte) -1;
        this.f14392s = -1;
        this.f14384j = bVar.f14526i;
    }
}
