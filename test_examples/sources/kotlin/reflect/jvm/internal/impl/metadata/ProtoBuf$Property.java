package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$Property extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Property> {
    public static final ProtoBuf$Property C;
    public static final a D = new a();
    public byte A;
    public int B;

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14218j;

    /* renamed from: k  reason: collision with root package name */
    public int f14219k;

    /* renamed from: l  reason: collision with root package name */
    public int f14220l;

    /* renamed from: m  reason: collision with root package name */
    public int f14221m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public ProtoBuf$Type f14222o;

    /* renamed from: p  reason: collision with root package name */
    public int f14223p;

    /* renamed from: q  reason: collision with root package name */
    public List<ProtoBuf$TypeParameter> f14224q;

    /* renamed from: r  reason: collision with root package name */
    public ProtoBuf$Type f14225r;

    /* renamed from: s  reason: collision with root package name */
    public int f14226s;

    /* renamed from: t  reason: collision with root package name */
    public List<ProtoBuf$Type> f14227t;

    /* renamed from: u  reason: collision with root package name */
    public List<Integer> f14228u;

    /* renamed from: v  reason: collision with root package name */
    public int f14229v;

    /* renamed from: w  reason: collision with root package name */
    public ProtoBuf$ValueParameter f14230w;

    /* renamed from: x  reason: collision with root package name */
    public int f14231x;

    /* renamed from: y  reason: collision with root package name */
    public int f14232y;

    /* renamed from: z  reason: collision with root package name */
    public List<Integer> f14233z;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Property> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Property(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Property, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14234l;

        /* renamed from: m  reason: collision with root package name */
        public int f14235m = 518;
        public int n = 2054;

        /* renamed from: o  reason: collision with root package name */
        public int f14236o;

        /* renamed from: p  reason: collision with root package name */
        public ProtoBuf$Type f14237p;

        /* renamed from: q  reason: collision with root package name */
        public int f14238q;

        /* renamed from: r  reason: collision with root package name */
        public List<ProtoBuf$TypeParameter> f14239r;

        /* renamed from: s  reason: collision with root package name */
        public ProtoBuf$Type f14240s;

        /* renamed from: t  reason: collision with root package name */
        public int f14241t;

        /* renamed from: u  reason: collision with root package name */
        public List<ProtoBuf$Type> f14242u;

        /* renamed from: v  reason: collision with root package name */
        public List<Integer> f14243v;

        /* renamed from: w  reason: collision with root package name */
        public ProtoBuf$ValueParameter f14244w;

        /* renamed from: x  reason: collision with root package name */
        public int f14245x;

        /* renamed from: y  reason: collision with root package name */
        public int f14246y;

        /* renamed from: z  reason: collision with root package name */
        public List<Integer> f14247z;

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
            this.f14237p = protoBuf$Type;
            this.f14239r = Collections.emptyList();
            this.f14240s = protoBuf$Type;
            this.f14242u = Collections.emptyList();
            this.f14243v = Collections.emptyList();
            this.f14244w = ProtoBuf$ValueParameter.f14382t;
            this.f14247z = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Property l2 = l();
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
            m((ProtoBuf$Property) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$Property l() {
            ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(this);
            int i10 = this.f14234l;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Property.f14220l = this.f14235m;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$Property.f14221m = this.n;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$Property.n = this.f14236o;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$Property.f14222o = this.f14237p;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$Property.f14223p = this.f14238q;
            if ((i10 & 32) == 32) {
                this.f14239r = Collections.unmodifiableList(this.f14239r);
                this.f14234l &= -33;
            }
            protoBuf$Property.f14224q = this.f14239r;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            protoBuf$Property.f14225r = this.f14240s;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            protoBuf$Property.f14226s = this.f14241t;
            if ((this.f14234l & 256) == 256) {
                this.f14242u = Collections.unmodifiableList(this.f14242u);
                this.f14234l &= -257;
            }
            protoBuf$Property.f14227t = this.f14242u;
            if ((this.f14234l & 512) == 512) {
                this.f14243v = Collections.unmodifiableList(this.f14243v);
                this.f14234l &= -513;
            }
            protoBuf$Property.f14228u = this.f14243v;
            if ((i10 & 1024) == 1024) {
                i11 |= 128;
            }
            protoBuf$Property.f14230w = this.f14244w;
            if ((i10 & 2048) == 2048) {
                i11 |= 256;
            }
            protoBuf$Property.f14231x = this.f14245x;
            if ((i10 & 4096) == 4096) {
                i11 |= 512;
            }
            protoBuf$Property.f14232y = this.f14246y;
            if ((this.f14234l & 8192) == 8192) {
                this.f14247z = Collections.unmodifiableList(this.f14247z);
                this.f14234l &= -8193;
            }
            protoBuf$Property.f14233z = this.f14247z;
            protoBuf$Property.f14219k = i11;
            return protoBuf$Property;
        }

        public final void m(ProtoBuf$Property protoBuf$Property) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Property == ProtoBuf$Property.C) {
                return;
            }
            int i10 = protoBuf$Property.f14219k;
            boolean z19 = false;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = protoBuf$Property.f14220l;
                this.f14234l |= 1;
                this.f14235m = i11;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = protoBuf$Property.f14221m;
                this.f14234l = 2 | this.f14234l;
                this.n = i12;
            }
            if ((i10 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i13 = protoBuf$Property.n;
                this.f14234l = 4 | this.f14234l;
                this.f14236o = i13;
            }
            if ((i10 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$Property.f14222o;
                if ((this.f14234l & 8) == 8 && (protoBuf$Type2 = this.f14237p) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t10 = ProtoBuf$Type.t(protoBuf$Type2);
                    t10.m(protoBuf$Type3);
                    protoBuf$Type3 = t10.l();
                }
                this.f14237p = protoBuf$Type3;
                this.f14234l |= 8;
            }
            if ((protoBuf$Property.f14219k & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                int i14 = protoBuf$Property.f14223p;
                this.f14234l = 16 | this.f14234l;
                this.f14238q = i14;
            }
            if (!protoBuf$Property.f14224q.isEmpty()) {
                if (this.f14239r.isEmpty()) {
                    this.f14239r = protoBuf$Property.f14224q;
                    this.f14234l &= -33;
                } else {
                    if ((this.f14234l & 32) != 32) {
                        this.f14239r = new ArrayList(this.f14239r);
                        this.f14234l |= 32;
                    }
                    this.f14239r.addAll(protoBuf$Property.f14224q);
                }
            }
            if ((protoBuf$Property.f14219k & 32) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$Property.f14225r;
                if ((this.f14234l & 64) == 64 && (protoBuf$Type = this.f14240s) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t11 = ProtoBuf$Type.t(protoBuf$Type);
                    t11.m(protoBuf$Type4);
                    protoBuf$Type4 = t11.l();
                }
                this.f14240s = protoBuf$Type4;
                this.f14234l |= 64;
            }
            if ((protoBuf$Property.f14219k & 64) == 64) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                int i15 = protoBuf$Property.f14226s;
                this.f14234l |= 128;
                this.f14241t = i15;
            }
            if (!protoBuf$Property.f14227t.isEmpty()) {
                if (this.f14242u.isEmpty()) {
                    this.f14242u = protoBuf$Property.f14227t;
                    this.f14234l &= -257;
                } else {
                    if ((this.f14234l & 256) != 256) {
                        this.f14242u = new ArrayList(this.f14242u);
                        this.f14234l |= 256;
                    }
                    this.f14242u.addAll(protoBuf$Property.f14227t);
                }
            }
            if (!protoBuf$Property.f14228u.isEmpty()) {
                if (this.f14243v.isEmpty()) {
                    this.f14243v = protoBuf$Property.f14228u;
                    this.f14234l &= -513;
                } else {
                    if ((this.f14234l & 512) != 512) {
                        this.f14243v = new ArrayList(this.f14243v);
                        this.f14234l |= 512;
                    }
                    this.f14243v.addAll(protoBuf$Property.f14228u);
                }
            }
            if ((protoBuf$Property.f14219k & 128) == 128) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                ProtoBuf$ValueParameter protoBuf$ValueParameter2 = protoBuf$Property.f14230w;
                if ((this.f14234l & 1024) == 1024 && (protoBuf$ValueParameter = this.f14244w) != ProtoBuf$ValueParameter.f14382t) {
                    ProtoBuf$ValueParameter.b bVar = new ProtoBuf$ValueParameter.b();
                    bVar.m(protoBuf$ValueParameter);
                    bVar.m(protoBuf$ValueParameter2);
                    protoBuf$ValueParameter2 = bVar.l();
                }
                this.f14244w = protoBuf$ValueParameter2;
                this.f14234l |= 1024;
            }
            int i16 = protoBuf$Property.f14219k;
            if ((i16 & 256) == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                int i17 = protoBuf$Property.f14231x;
                this.f14234l |= 2048;
                this.f14245x = i17;
            }
            if ((i16 & 512) == 512) {
                z19 = true;
            }
            if (z19) {
                int i18 = protoBuf$Property.f14232y;
                this.f14234l |= 4096;
                this.f14246y = i18;
            }
            if (!protoBuf$Property.f14233z.isEmpty()) {
                if (this.f14247z.isEmpty()) {
                    this.f14247z = protoBuf$Property.f14233z;
                    this.f14234l &= -8193;
                } else {
                    if ((this.f14234l & 8192) != 8192) {
                        this.f14247z = new ArrayList(this.f14247z);
                        this.f14234l |= 8192;
                    }
                    this.f14247z.addAll(protoBuf$Property.f14233z);
                }
            }
            k(protoBuf$Property);
            this.f14526i = this.f14526i.d(protoBuf$Property.f14218j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$Property protoBuf$Property;
            try {
                try {
                    ProtoBuf$Property.D.getClass();
                    m(new ProtoBuf$Property(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Property = null;
                    if (protoBuf$Property != null) {
                        m(protoBuf$Property);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$Property = (ProtoBuf$Property) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$Property != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(0);
        C = protoBuf$Property;
        protoBuf$Property.r();
    }

    public ProtoBuf$Property() {
        throw null;
    }

    public ProtoBuf$Property(int i10) {
        this.f14229v = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f14218j = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public ProtoBuf$Property(c cVar, d dVar) {
        int i10;
        List list;
        kotlin.reflect.jvm.internal.impl.protobuf.b bVar;
        int d5;
        h hVar;
        this.f14229v = -1;
        this.A = (byte) -1;
        this.B = -1;
        r();
        a.b bVar2 = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar2, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 256;
            if (z10) {
                if (z11 & true) {
                    this.f14224q = Collections.unmodifiableList(this.f14224q);
                }
                if (z11 & true) {
                    this.f14227t = Collections.unmodifiableList(this.f14227t);
                }
                if (z11 & true) {
                    this.f14228u = Collections.unmodifiableList(this.f14228u);
                }
                if (z11 & true) {
                    this.f14233z = Collections.unmodifiableList(this.f14233z);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f14218j = bVar2.c();
                    throw th;
                }
                this.f14218j = bVar2.c();
                n();
                return;
            }
            try {
                try {
                    int n = cVar.n();
                    ProtoBuf$Type.b bVar3 = null;
                    ProtoBuf$ValueParameter.b bVar4 = null;
                    ProtoBuf$Type.b bVar5 = null;
                    switch (n) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f14219k |= 2;
                            this.f14221m = cVar.k();
                            break;
                        case 16:
                            this.f14219k |= 4;
                            this.n = cVar.k();
                            break;
                        case 26:
                            i10 = 8;
                            if ((this.f14219k & 8) == 8) {
                                ProtoBuf$Type protoBuf$Type = this.f14222o;
                                protoBuf$Type.getClass();
                                bVar3 = ProtoBuf$Type.t(protoBuf$Type);
                            }
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                            this.f14222o = protoBuf$Type2;
                            if (bVar3 != null) {
                                bVar3.m(protoBuf$Type2);
                                this.f14222o = bVar3.l();
                            }
                            this.f14219k |= i10;
                            break;
                        case 34:
                            if (!(z11 & true)) {
                                this.f14224q = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14224q;
                            bVar = ProtoBuf$TypeParameter.f14350v;
                            hVar = cVar.g(bVar, dVar);
                            list.add(hVar);
                            break;
                        case 42:
                            if ((this.f14219k & 32) == 32) {
                                ProtoBuf$Type protoBuf$Type3 = this.f14225r;
                                protoBuf$Type3.getClass();
                                bVar5 = ProtoBuf$Type.t(protoBuf$Type3);
                            }
                            ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                            this.f14225r = protoBuf$Type4;
                            if (bVar5 != null) {
                                bVar5.m(protoBuf$Type4);
                                this.f14225r = bVar5.l();
                            }
                            this.f14219k |= 32;
                            break;
                        case 50:
                            i10 = 128;
                            if ((this.f14219k & 128) == 128) {
                                ProtoBuf$ValueParameter protoBuf$ValueParameter = this.f14230w;
                                protoBuf$ValueParameter.getClass();
                                bVar4 = new ProtoBuf$ValueParameter.b();
                                bVar4.m(protoBuf$ValueParameter);
                            }
                            ProtoBuf$ValueParameter protoBuf$ValueParameter2 = (ProtoBuf$ValueParameter) cVar.g(ProtoBuf$ValueParameter.f14383u, dVar);
                            this.f14230w = protoBuf$ValueParameter2;
                            if (bVar4 != null) {
                                bVar4.m(protoBuf$ValueParameter2);
                                this.f14230w = bVar4.l();
                            }
                            this.f14219k |= i10;
                            break;
                        case 56:
                            this.f14219k |= 256;
                            this.f14231x = cVar.k();
                            break;
                        case 64:
                            this.f14219k |= 512;
                            this.f14232y = cVar.k();
                            break;
                        case 72:
                            this.f14219k |= 16;
                            this.f14223p = cVar.k();
                            break;
                        case 80:
                            this.f14219k |= 64;
                            this.f14226s = cVar.k();
                            break;
                        case 88:
                            this.f14219k |= 1;
                            this.f14220l = cVar.k();
                            break;
                        case 98:
                            if (!(z11 & true)) {
                                this.f14227t = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14227t;
                            bVar = ProtoBuf$Type.C;
                            hVar = cVar.g(bVar, dVar);
                            list.add(hVar);
                            break;
                        case 104:
                            if (!(z11 & true)) {
                                this.f14228u = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14228u;
                            hVar = Integer.valueOf(cVar.k());
                            list.add(hVar);
                            break;
                        case 106:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.f14228u = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.f14228u.add(Integer.valueOf(cVar.k()));
                            }
                            cVar.c(d5);
                            break;
                        case 248:
                            if (!(z11 & true)) {
                                this.f14233z = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14233z;
                            hVar = Integer.valueOf(cVar.k());
                            list.add(hVar);
                            break;
                        case 250:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.f14233z = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.f14233z.add(Integer.valueOf(cVar.k()));
                            }
                            cVar.c(d5);
                            break;
                        default:
                            r52 = p(cVar, j2, dVar, n);
                            if (r52 != 0) {
                                break;
                            } else {
                                z10 = true;
                                break;
                            }
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f14224q = Collections.unmodifiableList(this.f14224q);
                    }
                    if ((z11 & true) == r52) {
                        this.f14227t = Collections.unmodifiableList(this.f14227t);
                    }
                    if (z11 & true) {
                        this.f14228u = Collections.unmodifiableList(this.f14228u);
                    }
                    if (z11 & true) {
                        this.f14233z = Collections.unmodifiableList(this.f14233z);
                    }
                    try {
                        j2.i();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
                        this.f14218j = bVar2.c();
                        throw th3;
                    }
                    this.f14218j = bVar2.c();
                    n();
                    throw th2;
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
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        byte b5 = this.A;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        int i10 = this.f14219k;
        if ((i10 & 4) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.A = (byte) 0;
            return false;
        }
        if ((i10 & 8) == 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.f14222o.a()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f14224q.size(); i11++) {
            if (!this.f14224q.get(i11).a()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if ((this.f14219k & 32) == 32) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.f14225r.a()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f14227t.size(); i12++) {
            if (!this.f14227t.get(i12).a()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if ((this.f14219k & 128) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && !this.f14230w.a()) {
            this.A = (byte) 0;
            return false;
        } else if (!j()) {
            this.A = (byte) 0;
            return false;
        } else {
            this.A = (byte) 1;
            return true;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10;
        int i11 = this.B;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f14219k & 2) == 2) {
            i10 = CodedOutputStream.b(1, this.f14221m) + 0;
        } else {
            i10 = 0;
        }
        if ((this.f14219k & 4) == 4) {
            i10 += CodedOutputStream.b(2, this.n);
        }
        if ((this.f14219k & 8) == 8) {
            i10 += CodedOutputStream.d(3, this.f14222o);
        }
        for (int i12 = 0; i12 < this.f14224q.size(); i12++) {
            i10 += CodedOutputStream.d(4, this.f14224q.get(i12));
        }
        if ((this.f14219k & 32) == 32) {
            i10 += CodedOutputStream.d(5, this.f14225r);
        }
        if ((this.f14219k & 128) == 128) {
            i10 += CodedOutputStream.d(6, this.f14230w);
        }
        if ((this.f14219k & 256) == 256) {
            i10 += CodedOutputStream.b(7, this.f14231x);
        }
        if ((this.f14219k & 512) == 512) {
            i10 += CodedOutputStream.b(8, this.f14232y);
        }
        if ((this.f14219k & 16) == 16) {
            i10 += CodedOutputStream.b(9, this.f14223p);
        }
        if ((this.f14219k & 64) == 64) {
            i10 += CodedOutputStream.b(10, this.f14226s);
        }
        if ((this.f14219k & 1) == 1) {
            i10 += CodedOutputStream.b(11, this.f14220l);
        }
        for (int i13 = 0; i13 < this.f14227t.size(); i13++) {
            i10 += CodedOutputStream.d(12, this.f14227t.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f14228u.size(); i15++) {
            i14 += CodedOutputStream.c(this.f14228u.get(i15).intValue());
        }
        int i16 = i10 + i14;
        if (!this.f14228u.isEmpty()) {
            i16 = i16 + 1 + CodedOutputStream.c(i14);
        }
        this.f14229v = i14;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f14233z.size(); i18++) {
            i17 += CodedOutputStream.c(this.f14233z.get(i18).intValue());
        }
        int size = (this.f14233z.size() * 2) + i16 + i17;
        int size2 = this.f14218j.size() + k() + size;
        this.B = size2;
        return size2;
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
        return C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        if ((this.f14219k & 2) == 2) {
            codedOutputStream.m(1, this.f14221m);
        }
        if ((this.f14219k & 4) == 4) {
            codedOutputStream.m(2, this.n);
        }
        if ((this.f14219k & 8) == 8) {
            codedOutputStream.o(3, this.f14222o);
        }
        for (int i10 = 0; i10 < this.f14224q.size(); i10++) {
            codedOutputStream.o(4, this.f14224q.get(i10));
        }
        if ((this.f14219k & 32) == 32) {
            codedOutputStream.o(5, this.f14225r);
        }
        if ((this.f14219k & 128) == 128) {
            codedOutputStream.o(6, this.f14230w);
        }
        if ((this.f14219k & 256) == 256) {
            codedOutputStream.m(7, this.f14231x);
        }
        if ((this.f14219k & 512) == 512) {
            codedOutputStream.m(8, this.f14232y);
        }
        if ((this.f14219k & 16) == 16) {
            codedOutputStream.m(9, this.f14223p);
        }
        if ((this.f14219k & 64) == 64) {
            codedOutputStream.m(10, this.f14226s);
        }
        if ((this.f14219k & 1) == 1) {
            codedOutputStream.m(11, this.f14220l);
        }
        for (int i11 = 0; i11 < this.f14227t.size(); i11++) {
            codedOutputStream.o(12, this.f14227t.get(i11));
        }
        if (this.f14228u.size() > 0) {
            codedOutputStream.v(106);
            codedOutputStream.v(this.f14229v);
        }
        for (int i12 = 0; i12 < this.f14228u.size(); i12++) {
            codedOutputStream.n(this.f14228u.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.f14233z.size(); i13++) {
            codedOutputStream.m(31, this.f14233z.get(i13).intValue());
        }
        aVar.a(19000, codedOutputStream);
        codedOutputStream.r(this.f14218j);
    }

    public final void r() {
        this.f14220l = 518;
        this.f14221m = 2054;
        this.n = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
        this.f14222o = protoBuf$Type;
        this.f14223p = 0;
        this.f14224q = Collections.emptyList();
        this.f14225r = protoBuf$Type;
        this.f14226s = 0;
        this.f14227t = Collections.emptyList();
        this.f14228u = Collections.emptyList();
        this.f14230w = ProtoBuf$ValueParameter.f14382t;
        this.f14231x = 0;
        this.f14232y = 0;
        this.f14233z = Collections.emptyList();
    }

    public ProtoBuf$Property(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14229v = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f14218j = bVar.f14526i;
    }
}
