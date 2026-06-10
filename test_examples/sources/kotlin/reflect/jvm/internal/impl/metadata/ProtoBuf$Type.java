package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import i9.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$Type extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Type> {
    public static final ProtoBuf$Type B;
    public static final a C = new a();
    public int A;

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14279j;

    /* renamed from: k  reason: collision with root package name */
    public int f14280k;

    /* renamed from: l  reason: collision with root package name */
    public List<Argument> f14281l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14282m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public ProtoBuf$Type f14283o;

    /* renamed from: p  reason: collision with root package name */
    public int f14284p;

    /* renamed from: q  reason: collision with root package name */
    public int f14285q;

    /* renamed from: r  reason: collision with root package name */
    public int f14286r;

    /* renamed from: s  reason: collision with root package name */
    public int f14287s;

    /* renamed from: t  reason: collision with root package name */
    public int f14288t;

    /* renamed from: u  reason: collision with root package name */
    public ProtoBuf$Type f14289u;

    /* renamed from: v  reason: collision with root package name */
    public int f14290v;

    /* renamed from: w  reason: collision with root package name */
    public ProtoBuf$Type f14291w;

    /* renamed from: x  reason: collision with root package name */
    public int f14292x;

    /* renamed from: y  reason: collision with root package name */
    public int f14293y;

    /* renamed from: z  reason: collision with root package name */
    public byte f14294z;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Type> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Type(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Type, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14312l;

        /* renamed from: m  reason: collision with root package name */
        public List<Argument> f14313m = Collections.emptyList();
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public int f14314o;

        /* renamed from: p  reason: collision with root package name */
        public ProtoBuf$Type f14315p;

        /* renamed from: q  reason: collision with root package name */
        public int f14316q;

        /* renamed from: r  reason: collision with root package name */
        public int f14317r;

        /* renamed from: s  reason: collision with root package name */
        public int f14318s;

        /* renamed from: t  reason: collision with root package name */
        public int f14319t;

        /* renamed from: u  reason: collision with root package name */
        public int f14320u;

        /* renamed from: v  reason: collision with root package name */
        public ProtoBuf$Type f14321v;

        /* renamed from: w  reason: collision with root package name */
        public int f14322w;

        /* renamed from: x  reason: collision with root package name */
        public ProtoBuf$Type f14323x;

        /* renamed from: y  reason: collision with root package name */
        public int f14324y;

        /* renamed from: z  reason: collision with root package name */
        public int f14325z;

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
            this.f14315p = protoBuf$Type;
            this.f14321v = protoBuf$Type;
            this.f14323x = protoBuf$Type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Type l2 = l();
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
            m((ProtoBuf$Type) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$Type l() {
            ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(this);
            int i10 = this.f14312l;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f14313m = Collections.unmodifiableList(this.f14313m);
                this.f14312l &= -2;
            }
            protoBuf$Type.f14281l = this.f14313m;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            protoBuf$Type.f14282m = this.n;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            protoBuf$Type.n = this.f14314o;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            protoBuf$Type.f14283o = this.f14315p;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            protoBuf$Type.f14284p = this.f14316q;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            protoBuf$Type.f14285q = this.f14317r;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            protoBuf$Type.f14286r = this.f14318s;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            protoBuf$Type.f14287s = this.f14319t;
            if ((i10 & 256) == 256) {
                i11 |= 128;
            }
            protoBuf$Type.f14288t = this.f14320u;
            if ((i10 & 512) == 512) {
                i11 |= 256;
            }
            protoBuf$Type.f14289u = this.f14321v;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            protoBuf$Type.f14290v = this.f14322w;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            protoBuf$Type.f14291w = this.f14323x;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            protoBuf$Type.f14292x = this.f14324y;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            protoBuf$Type.f14293y = this.f14325z;
            protoBuf$Type.f14280k = i11;
            return protoBuf$Type;
        }

        public final b m(ProtoBuf$Type protoBuf$Type) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            ProtoBuf$Type protoBuf$Type2;
            ProtoBuf$Type protoBuf$Type3;
            ProtoBuf$Type protoBuf$Type4;
            ProtoBuf$Type protoBuf$Type5 = ProtoBuf$Type.B;
            if (protoBuf$Type == protoBuf$Type5) {
                return this;
            }
            boolean z21 = true;
            if (!protoBuf$Type.f14281l.isEmpty()) {
                if (this.f14313m.isEmpty()) {
                    this.f14313m = protoBuf$Type.f14281l;
                    this.f14312l &= -2;
                } else {
                    if ((this.f14312l & 1) != 1) {
                        this.f14313m = new ArrayList(this.f14313m);
                        this.f14312l |= 1;
                    }
                    this.f14313m.addAll(protoBuf$Type.f14281l);
                }
            }
            int i10 = protoBuf$Type.f14280k;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                boolean z22 = protoBuf$Type.f14282m;
                this.f14312l |= 2;
                this.n = z22;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = protoBuf$Type.n;
                this.f14312l |= 4;
                this.f14314o = i11;
            }
            if ((i10 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ProtoBuf$Type protoBuf$Type6 = protoBuf$Type.f14283o;
                if ((this.f14312l & 8) == 8 && (protoBuf$Type4 = this.f14315p) != protoBuf$Type5) {
                    b t10 = ProtoBuf$Type.t(protoBuf$Type4);
                    t10.m(protoBuf$Type6);
                    protoBuf$Type6 = t10.l();
                }
                this.f14315p = protoBuf$Type6;
                this.f14312l |= 8;
            }
            if ((protoBuf$Type.f14280k & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i12 = protoBuf$Type.f14284p;
                this.f14312l |= 16;
                this.f14316q = i12;
            }
            if (protoBuf$Type.r()) {
                int i13 = protoBuf$Type.f14285q;
                this.f14312l |= 32;
                this.f14317r = i13;
            }
            int i14 = protoBuf$Type.f14280k;
            if ((i14 & 32) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                int i15 = protoBuf$Type.f14286r;
                this.f14312l |= 64;
                this.f14318s = i15;
            }
            if ((i14 & 64) == 64) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                int i16 = protoBuf$Type.f14287s;
                this.f14312l |= 128;
                this.f14319t = i16;
            }
            if ((i14 & 128) == 128) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                int i17 = protoBuf$Type.f14288t;
                this.f14312l |= 256;
                this.f14320u = i17;
            }
            if ((i14 & 256) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                ProtoBuf$Type protoBuf$Type7 = protoBuf$Type.f14289u;
                if ((this.f14312l & 512) == 512 && (protoBuf$Type3 = this.f14321v) != protoBuf$Type5) {
                    b t11 = ProtoBuf$Type.t(protoBuf$Type3);
                    t11.m(protoBuf$Type7);
                    protoBuf$Type7 = t11.l();
                }
                this.f14321v = protoBuf$Type7;
                this.f14312l |= 512;
            }
            int i18 = protoBuf$Type.f14280k;
            if ((i18 & 512) == 512) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                int i19 = protoBuf$Type.f14290v;
                this.f14312l |= 1024;
                this.f14322w = i19;
            }
            if ((i18 & 1024) == 1024) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (z19) {
                ProtoBuf$Type protoBuf$Type8 = protoBuf$Type.f14291w;
                if ((this.f14312l & 2048) == 2048 && (protoBuf$Type2 = this.f14323x) != protoBuf$Type5) {
                    b t12 = ProtoBuf$Type.t(protoBuf$Type2);
                    t12.m(protoBuf$Type8);
                    protoBuf$Type8 = t12.l();
                }
                this.f14323x = protoBuf$Type8;
                this.f14312l |= 2048;
            }
            int i20 = protoBuf$Type.f14280k;
            if ((i20 & 2048) == 2048) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (z20) {
                int i21 = protoBuf$Type.f14292x;
                this.f14312l |= 4096;
                this.f14324y = i21;
            }
            if ((i20 & 4096) != 4096) {
                z21 = false;
            }
            if (z21) {
                int i22 = protoBuf$Type.f14293y;
                this.f14312l |= 8192;
                this.f14325z = i22;
            }
            k(protoBuf$Type);
            this.f14526i = this.f14526i.d(protoBuf$Type.f14279j);
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$Type protoBuf$Type;
            try {
                try {
                    ProtoBuf$Type.C.getClass();
                    m(new ProtoBuf$Type(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Type = null;
                    if (protoBuf$Type != null) {
                        m(protoBuf$Type);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$Type = (ProtoBuf$Type) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$Type != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(0);
        B = protoBuf$Type;
        protoBuf$Type.s();
    }

    public ProtoBuf$Type() {
        throw null;
    }

    public ProtoBuf$Type(int i10) {
        this.f14294z = (byte) -1;
        this.A = -1;
        this.f14279j = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$Type(c cVar, d dVar) {
        int i10;
        this.f14294z = (byte) -1;
        this.A = -1;
        s();
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    a aVar = C;
                    b bVar2 = null;
                    switch (n) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f14280k |= 4096;
                            this.f14293y = cVar.k();
                            break;
                        case 18:
                            if (!(z11 & true)) {
                                this.f14281l = new ArrayList();
                                z11 |= true;
                            }
                            this.f14281l.add(cVar.g(Argument.f14296q, dVar));
                            break;
                        case 24:
                            this.f14280k |= 1;
                            this.f14282m = cVar.l() != 0;
                            break;
                        case 32:
                            this.f14280k |= 2;
                            this.n = cVar.k();
                            break;
                        case 42:
                            i10 = 4;
                            if ((this.f14280k & 4) == 4) {
                                ProtoBuf$Type protoBuf$Type = this.f14283o;
                                protoBuf$Type.getClass();
                                bVar2 = t(protoBuf$Type);
                            }
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.g(aVar, dVar);
                            this.f14283o = protoBuf$Type2;
                            if (bVar2 != null) {
                                bVar2.m(protoBuf$Type2);
                                this.f14283o = bVar2.l();
                            }
                            this.f14280k |= i10;
                            break;
                        case 48:
                            this.f14280k |= 16;
                            this.f14285q = cVar.k();
                            break;
                        case 56:
                            this.f14280k |= 32;
                            this.f14286r = cVar.k();
                            break;
                        case 64:
                            this.f14280k |= 8;
                            this.f14284p = cVar.k();
                            break;
                        case 72:
                            this.f14280k |= 64;
                            this.f14287s = cVar.k();
                            break;
                        case 82:
                            i10 = 256;
                            if ((this.f14280k & 256) == 256) {
                                ProtoBuf$Type protoBuf$Type3 = this.f14289u;
                                protoBuf$Type3.getClass();
                                bVar2 = t(protoBuf$Type3);
                            }
                            ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) cVar.g(aVar, dVar);
                            this.f14289u = protoBuf$Type4;
                            if (bVar2 != null) {
                                bVar2.m(protoBuf$Type4);
                                this.f14289u = bVar2.l();
                            }
                            this.f14280k |= i10;
                            break;
                        case 88:
                            this.f14280k |= 512;
                            this.f14290v = cVar.k();
                            break;
                        case 96:
                            this.f14280k |= 128;
                            this.f14288t = cVar.k();
                            break;
                        case 106:
                            i10 = 1024;
                            if ((this.f14280k & 1024) == 1024) {
                                ProtoBuf$Type protoBuf$Type5 = this.f14291w;
                                protoBuf$Type5.getClass();
                                bVar2 = t(protoBuf$Type5);
                            }
                            ProtoBuf$Type protoBuf$Type6 = (ProtoBuf$Type) cVar.g(aVar, dVar);
                            this.f14291w = protoBuf$Type6;
                            if (bVar2 != null) {
                                bVar2.m(protoBuf$Type6);
                                this.f14291w = bVar2.l();
                            }
                            this.f14280k |= i10;
                            break;
                        case 112:
                            this.f14280k |= 2048;
                            this.f14292x = cVar.k();
                            break;
                        default:
                            if (!p(cVar, j2, dVar, n)) {
                                z10 = true;
                                break;
                            } else {
                                break;
                            }
                    }
                } catch (Throwable th) {
                    if (z11 & true) {
                        this.f14281l = Collections.unmodifiableList(this.f14281l);
                    }
                    try {
                        j2.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f14279j = bVar.c();
                        throw th2;
                    }
                    this.f14279j = bVar.c();
                    n();
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.f14537i = this;
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.f14537i = this;
                throw invalidProtocolBufferException;
            }
        }
        if (z11 & true) {
            this.f14281l = Collections.unmodifiableList(this.f14281l);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14279j = bVar.c();
            throw th3;
        }
        this.f14279j = bVar.c();
        n();
    }

    public static b t(ProtoBuf$Type protoBuf$Type) {
        b bVar = new b();
        bVar.m(protoBuf$Type);
        return bVar;
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte b5 = this.f14294z;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14281l.size(); i10++) {
            if (!this.f14281l.get(i10).a()) {
                this.f14294z = (byte) 0;
                return false;
            }
        }
        if ((this.f14280k & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f14283o.a()) {
            this.f14294z = (byte) 0;
            return false;
        }
        if ((this.f14280k & 256) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.f14289u.a()) {
            this.f14294z = (byte) 0;
            return false;
        }
        if ((this.f14280k & 1024) == 1024) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.f14291w.a()) {
            this.f14294z = (byte) 0;
            return false;
        } else if (!j()) {
            this.f14294z = (byte) 0;
            return false;
        } else {
            this.f14294z = (byte) 1;
            return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10;
        int i11 = this.A;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f14280k & 4096) == 4096) {
            i10 = CodedOutputStream.b(1, this.f14293y) + 0;
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f14281l.size(); i12++) {
            i10 += CodedOutputStream.d(2, this.f14281l.get(i12));
        }
        if ((this.f14280k & 1) == 1) {
            i10 += CodedOutputStream.h(3) + 1;
        }
        if ((this.f14280k & 2) == 2) {
            i10 += CodedOutputStream.b(4, this.n);
        }
        if ((this.f14280k & 4) == 4) {
            i10 += CodedOutputStream.d(5, this.f14283o);
        }
        if ((this.f14280k & 16) == 16) {
            i10 += CodedOutputStream.b(6, this.f14285q);
        }
        if ((this.f14280k & 32) == 32) {
            i10 += CodedOutputStream.b(7, this.f14286r);
        }
        if ((this.f14280k & 8) == 8) {
            i10 += CodedOutputStream.b(8, this.f14284p);
        }
        if ((this.f14280k & 64) == 64) {
            i10 += CodedOutputStream.b(9, this.f14287s);
        }
        if ((this.f14280k & 256) == 256) {
            i10 += CodedOutputStream.d(10, this.f14289u);
        }
        if ((this.f14280k & 512) == 512) {
            i10 += CodedOutputStream.b(11, this.f14290v);
        }
        if ((this.f14280k & 128) == 128) {
            i10 += CodedOutputStream.b(12, this.f14288t);
        }
        if ((this.f14280k & 1024) == 1024) {
            i10 += CodedOutputStream.d(13, this.f14291w);
        }
        if ((this.f14280k & 2048) == 2048) {
            i10 += CodedOutputStream.b(14, this.f14292x);
        }
        int size = this.f14279j.size() + k() + i10;
        this.A = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a c() {
        return t(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a d() {
        return new b();
    }

    @Override // i9.f
    public final h e() {
        return B;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        if ((this.f14280k & 4096) == 4096) {
            codedOutputStream.m(1, this.f14293y);
        }
        for (int i10 = 0; i10 < this.f14281l.size(); i10++) {
            codedOutputStream.o(2, this.f14281l.get(i10));
        }
        if ((this.f14280k & 1) == 1) {
            boolean z10 = this.f14282m;
            codedOutputStream.x(3, 0);
            codedOutputStream.q(z10 ? 1 : 0);
        }
        if ((this.f14280k & 2) == 2) {
            codedOutputStream.m(4, this.n);
        }
        if ((this.f14280k & 4) == 4) {
            codedOutputStream.o(5, this.f14283o);
        }
        if ((this.f14280k & 16) == 16) {
            codedOutputStream.m(6, this.f14285q);
        }
        if ((this.f14280k & 32) == 32) {
            codedOutputStream.m(7, this.f14286r);
        }
        if ((this.f14280k & 8) == 8) {
            codedOutputStream.m(8, this.f14284p);
        }
        if ((this.f14280k & 64) == 64) {
            codedOutputStream.m(9, this.f14287s);
        }
        if ((this.f14280k & 256) == 256) {
            codedOutputStream.o(10, this.f14289u);
        }
        if ((this.f14280k & 512) == 512) {
            codedOutputStream.m(11, this.f14290v);
        }
        if ((this.f14280k & 128) == 128) {
            codedOutputStream.m(12, this.f14288t);
        }
        if ((this.f14280k & 1024) == 1024) {
            codedOutputStream.o(13, this.f14291w);
        }
        if ((this.f14280k & 2048) == 2048) {
            codedOutputStream.m(14, this.f14292x);
        }
        aVar.a(200, codedOutputStream);
        codedOutputStream.r(this.f14279j);
    }

    public final boolean r() {
        return (this.f14280k & 16) == 16;
    }

    public final void s() {
        this.f14281l = Collections.emptyList();
        this.f14282m = false;
        this.n = 0;
        ProtoBuf$Type protoBuf$Type = B;
        this.f14283o = protoBuf$Type;
        this.f14284p = 0;
        this.f14285q = 0;
        this.f14286r = 0;
        this.f14287s = 0;
        this.f14288t = 0;
        this.f14289u = protoBuf$Type;
        this.f14290v = 0;
        this.f14291w = protoBuf$Type;
        this.f14292x = 0;
        this.f14293y = 0;
    }

    public final b u() {
        return t(this);
    }

    /* loaded from: classes.dex */
    public static final class Argument extends GeneratedMessageLite implements f {

        /* renamed from: p  reason: collision with root package name */
        public static final Argument f14295p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f14296q = new a();

        /* renamed from: i  reason: collision with root package name */
        public final i9.a f14297i;

        /* renamed from: j  reason: collision with root package name */
        public int f14298j;

        /* renamed from: k  reason: collision with root package name */
        public Projection f14299k;

        /* renamed from: l  reason: collision with root package name */
        public ProtoBuf$Type f14300l;

        /* renamed from: m  reason: collision with root package name */
        public int f14301m;
        public byte n;

        /* renamed from: o  reason: collision with root package name */
        public int f14302o;

        /* loaded from: classes.dex */
        public enum Projection implements f.a {
            f14303j("IN"),
            f14304k("OUT"),
            f14305l("INV"),
            f14306m("STAR");
            

            /* renamed from: i  reason: collision with root package name */
            public final int f14307i;

            Projection(String str) {
                this.f14307i = r2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
            public final int c() {
                return this.f14307i;
            }
        }

        /* loaded from: classes.dex */
        public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<Argument> {
            @Override // i9.g
            public final Object a(c cVar, d dVar) {
                return new Argument(cVar, dVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends GeneratedMessageLite.a<Argument, b> implements i9.f {

            /* renamed from: j  reason: collision with root package name */
            public int f14308j;

            /* renamed from: k  reason: collision with root package name */
            public Projection f14309k = Projection.f14305l;

            /* renamed from: l  reason: collision with root package name */
            public ProtoBuf$Type f14310l = ProtoBuf$Type.B;

            /* renamed from: m  reason: collision with root package name */
            public int f14311m;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final h build() {
                Argument k3 = k();
                if (k3.a()) {
                    return k3;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
            public final Object clone() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a, kotlin.reflect.jvm.internal.impl.protobuf.h.a
            public final /* bridge */ /* synthetic */ h.a g(c cVar, d dVar) {
                m(cVar, dVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a
            public final /* bridge */ /* synthetic */ a.AbstractC0162a h(c cVar, d dVar) {
                m(cVar, dVar);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
            public final b i() {
                b bVar = new b();
                bVar.l(k());
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
            public final /* bridge */ /* synthetic */ b j(Argument argument) {
                l(argument);
                return this;
            }

            public final Argument k() {
                Argument argument = new Argument(this);
                int i10 = this.f14308j;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                argument.f14299k = this.f14309k;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                argument.f14300l = this.f14310l;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                argument.f14301m = this.f14311m;
                argument.f14298j = i11;
                return argument;
            }

            public final void l(Argument argument) {
                boolean z10;
                boolean z11;
                ProtoBuf$Type protoBuf$Type;
                if (argument == Argument.f14295p) {
                    return;
                }
                boolean z12 = true;
                if ((argument.f14298j & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    Projection projection = argument.f14299k;
                    projection.getClass();
                    this.f14308j |= 1;
                    this.f14309k = projection;
                }
                if ((argument.f14298j & 2) == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ProtoBuf$Type protoBuf$Type2 = argument.f14300l;
                    if ((this.f14308j & 2) == 2 && (protoBuf$Type = this.f14310l) != ProtoBuf$Type.B) {
                        b t10 = ProtoBuf$Type.t(protoBuf$Type);
                        t10.m(protoBuf$Type2);
                        protoBuf$Type2 = t10.l();
                    }
                    this.f14310l = protoBuf$Type2;
                    this.f14308j |= 2;
                }
                if ((argument.f14298j & 4) != 4) {
                    z12 = false;
                }
                if (z12) {
                    int i10 = argument.f14301m;
                    this.f14308j |= 4;
                    this.f14311m = i10;
                }
                this.f14526i = this.f14526i.d(argument.f14297i);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(c cVar, d dVar) {
                Argument argument;
                try {
                    try {
                        Argument.f14296q.getClass();
                        l(new Argument(cVar, dVar));
                    } catch (Throwable th) {
                        th = th;
                        argument = null;
                        if (argument != null) {
                            l(argument);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    argument = (Argument) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (argument != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            Argument argument = new Argument();
            f14295p = argument;
            argument.f14299k = Projection.f14305l;
            argument.f14300l = ProtoBuf$Type.B;
            argument.f14301m = 0;
        }

        public Argument() {
            this.n = (byte) -1;
            this.f14302o = -1;
            this.f14297i = i9.a.f11832i;
        }

        public Argument(c cVar, d dVar) {
            this.n = (byte) -1;
            this.f14302o = -1;
            Projection projection = Projection.f14305l;
            this.f14299k = projection;
            this.f14300l = ProtoBuf$Type.B;
            boolean z10 = false;
            this.f14301m = 0;
            a.b bVar = new a.b();
            CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            b bVar2 = null;
                            Projection projection2 = null;
                            if (n == 8) {
                                int k3 = cVar.k();
                                if (k3 == 0) {
                                    projection2 = Projection.f14303j;
                                } else if (k3 == 1) {
                                    projection2 = Projection.f14304k;
                                } else if (k3 == 2) {
                                    projection2 = projection;
                                } else if (k3 == 3) {
                                    projection2 = Projection.f14306m;
                                }
                                if (projection2 == null) {
                                    j2.v(n);
                                    j2.v(k3);
                                } else {
                                    this.f14298j |= 1;
                                    this.f14299k = projection2;
                                }
                            } else if (n == 18) {
                                if ((this.f14298j & 2) == 2) {
                                    ProtoBuf$Type protoBuf$Type = this.f14300l;
                                    protoBuf$Type.getClass();
                                    bVar2 = ProtoBuf$Type.t(protoBuf$Type);
                                }
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                                this.f14300l = protoBuf$Type2;
                                if (bVar2 != null) {
                                    bVar2.m(protoBuf$Type2);
                                    this.f14300l = bVar2.l();
                                }
                                this.f14298j |= 2;
                            } else if (n != 24) {
                                if (!cVar.q(n, j2)) {
                                }
                            } else {
                                this.f14298j |= 4;
                                this.f14301m = cVar.k();
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
                        this.f14297i = bVar.c();
                        throw th2;
                    }
                    this.f14297i = bVar.c();
                    throw th;
                }
            }
            try {
                j2.i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f14297i = bVar.c();
                throw th3;
            }
            this.f14297i = bVar.c();
        }

        @Override // i9.f
        public final boolean a() {
            boolean z10;
            byte b5 = this.n;
            if (b5 == 1) {
                return true;
            }
            if (b5 == 0) {
                return false;
            }
            if ((this.f14298j & 2) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !this.f14300l.a()) {
                this.n = (byte) 0;
                return false;
            }
            this.n = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final int b() {
            int i10 = this.f14302o;
            if (i10 != -1) {
                return i10;
            }
            int i11 = 0;
            if ((this.f14298j & 1) == 1) {
                i11 = 0 + CodedOutputStream.a(1, this.f14299k.f14307i);
            }
            if ((this.f14298j & 2) == 2) {
                i11 += CodedOutputStream.d(2, this.f14300l);
            }
            if ((this.f14298j & 4) == 4) {
                i11 += CodedOutputStream.b(3, this.f14301m);
            }
            int size = this.f14297i.size() + i11;
            this.f14302o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final h.a c() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final h.a d() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            if ((this.f14298j & 1) == 1) {
                codedOutputStream.l(1, this.f14299k.f14307i);
            }
            if ((this.f14298j & 2) == 2) {
                codedOutputStream.o(2, this.f14300l);
            }
            if ((this.f14298j & 4) == 4) {
                codedOutputStream.m(3, this.f14301m);
            }
            codedOutputStream.r(this.f14297i);
        }

        public Argument(GeneratedMessageLite.a aVar) {
            super(0);
            this.n = (byte) -1;
            this.f14302o = -1;
            this.f14297i = aVar.f14526i;
        }
    }

    public ProtoBuf$Type(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14294z = (byte) -1;
        this.A = -1;
        this.f14279j = bVar.f14526i;
    }
}
