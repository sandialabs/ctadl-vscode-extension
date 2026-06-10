package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
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
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$Constructor extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Constructor> {

    /* renamed from: q  reason: collision with root package name */
    public static final ProtoBuf$Constructor f14083q;

    /* renamed from: r  reason: collision with root package name */
    public static final a f14084r = new a();

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14085j;

    /* renamed from: k  reason: collision with root package name */
    public int f14086k;

    /* renamed from: l  reason: collision with root package name */
    public int f14087l;

    /* renamed from: m  reason: collision with root package name */
    public List<ProtoBuf$ValueParameter> f14088m;
    public List<Integer> n;

    /* renamed from: o  reason: collision with root package name */
    public byte f14089o;

    /* renamed from: p  reason: collision with root package name */
    public int f14090p;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Constructor> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Constructor(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Constructor, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14091l;

        /* renamed from: m  reason: collision with root package name */
        public int f14092m = 6;
        public List<ProtoBuf$ValueParameter> n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        public List<Integer> f14093o = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Constructor l2 = l();
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
            m((ProtoBuf$Constructor) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$Constructor l() {
            ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(this);
            int i10 = this.f14091l;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Constructor.f14087l = this.f14092m;
            if ((i10 & 2) == 2) {
                this.n = Collections.unmodifiableList(this.n);
                this.f14091l &= -3;
            }
            protoBuf$Constructor.f14088m = this.n;
            if ((this.f14091l & 4) == 4) {
                this.f14093o = Collections.unmodifiableList(this.f14093o);
                this.f14091l &= -5;
            }
            protoBuf$Constructor.n = this.f14093o;
            protoBuf$Constructor.f14086k = i11;
            return protoBuf$Constructor;
        }

        public final void m(ProtoBuf$Constructor protoBuf$Constructor) {
            boolean z10;
            if (protoBuf$Constructor == ProtoBuf$Constructor.f14083q) {
                return;
            }
            if ((protoBuf$Constructor.f14086k & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = protoBuf$Constructor.f14087l;
                this.f14091l = 1 | this.f14091l;
                this.f14092m = i10;
            }
            if (!protoBuf$Constructor.f14088m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = protoBuf$Constructor.f14088m;
                    this.f14091l &= -3;
                } else {
                    if ((this.f14091l & 2) != 2) {
                        this.n = new ArrayList(this.n);
                        this.f14091l |= 2;
                    }
                    this.n.addAll(protoBuf$Constructor.f14088m);
                }
            }
            if (!protoBuf$Constructor.n.isEmpty()) {
                if (this.f14093o.isEmpty()) {
                    this.f14093o = protoBuf$Constructor.n;
                    this.f14091l &= -5;
                } else {
                    if ((this.f14091l & 4) != 4) {
                        this.f14093o = new ArrayList(this.f14093o);
                        this.f14091l |= 4;
                    }
                    this.f14093o.addAll(protoBuf$Constructor.n);
                }
            }
            k(protoBuf$Constructor);
            this.f14526i = this.f14526i.d(protoBuf$Constructor.f14085j);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$Constructor protoBuf$Constructor;
            try {
                try {
                    m((ProtoBuf$Constructor) ProtoBuf$Constructor.f14084r.a(cVar, dVar));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Constructor = (ProtoBuf$Constructor) e10.f14537i;
                    try {
                        throw e10;
                    } catch (Throwable th) {
                        th = th;
                        if (protoBuf$Constructor != null) {
                            m(protoBuf$Constructor);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                protoBuf$Constructor = null;
                if (protoBuf$Constructor != null) {
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(0);
        f14083q = protoBuf$Constructor;
        protoBuf$Constructor.f14087l = 6;
        protoBuf$Constructor.f14088m = Collections.emptyList();
        protoBuf$Constructor.n = Collections.emptyList();
    }

    public ProtoBuf$Constructor() {
        throw null;
    }

    public ProtoBuf$Constructor(int i10) {
        this.f14089o = (byte) -1;
        this.f14090p = -1;
        this.f14085j = i9.a.f11832i;
    }

    public ProtoBuf$Constructor(c cVar, d dVar) {
        List list;
        Object g10;
        this.f14089o = (byte) -1;
        this.f14090p = -1;
        this.f14087l = 6;
        this.f14088m = Collections.emptyList();
        this.n = Collections.emptyList();
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            if (n != 8) {
                                if (n == 18) {
                                    if (!(z11 & true)) {
                                        this.f14088m = new ArrayList();
                                        z11 |= true;
                                    }
                                    list = this.f14088m;
                                    g10 = cVar.g(ProtoBuf$ValueParameter.f14383u, dVar);
                                } else if (n == 248) {
                                    if (!(z11 & true)) {
                                        this.n = new ArrayList();
                                        z11 |= true;
                                    }
                                    list = this.n;
                                    g10 = Integer.valueOf(cVar.k());
                                } else if (n == 250) {
                                    int d5 = cVar.d(cVar.k());
                                    if (!(z11 & true) && cVar.b() > 0) {
                                        this.n = new ArrayList();
                                        z11 |= true;
                                    }
                                    while (cVar.b() > 0) {
                                        this.n.add(Integer.valueOf(cVar.k()));
                                    }
                                    cVar.c(d5);
                                } else if (!p(cVar, j2, dVar, n)) {
                                }
                                list.add(g10);
                            } else {
                                this.f14086k |= 1;
                                this.f14087l = cVar.k();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f14537i = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f14537i = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (z11 & true) {
                    this.f14088m = Collections.unmodifiableList(this.f14088m);
                }
                if (z11 & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14085j = bVar.c();
                    throw th2;
                }
                this.f14085j = bVar.c();
                n();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14088m = Collections.unmodifiableList(this.f14088m);
        }
        if (z11 & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14085j = bVar.c();
            throw th3;
        }
        this.f14085j = bVar.c();
        n();
    }

    @Override // i9.f
    public final boolean a() {
        byte b5 = this.f14089o;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14088m.size(); i10++) {
            if (!this.f14088m.get(i10).a()) {
                this.f14089o = (byte) 0;
                return false;
            }
        }
        if (!j()) {
            this.f14089o = (byte) 0;
            return false;
        }
        this.f14089o = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10;
        int i11 = this.f14090p;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f14086k & 1) == 1) {
            i10 = CodedOutputStream.b(1, this.f14087l) + 0;
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f14088m.size(); i12++) {
            i10 += CodedOutputStream.d(2, this.f14088m.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.n.size(); i14++) {
            i13 += CodedOutputStream.c(this.n.get(i14).intValue());
        }
        int size = this.f14085j.size() + k() + (this.n.size() * 2) + i10 + i13;
        this.f14090p = size;
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
        return f14083q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage.a aVar = new GeneratedMessageLite.ExtendableMessage.a(this);
        if ((this.f14086k & 1) == 1) {
            codedOutputStream.m(1, this.f14087l);
        }
        for (int i10 = 0; i10 < this.f14088m.size(); i10++) {
            codedOutputStream.o(2, this.f14088m.get(i10));
        }
        for (int i11 = 0; i11 < this.n.size(); i11++) {
            codedOutputStream.m(31, this.n.get(i11).intValue());
        }
        aVar.a(19000, codedOutputStream);
        codedOutputStream.r(this.f14085j);
    }

    public ProtoBuf$Constructor(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14089o = (byte) -1;
        this.f14090p = -1;
        this.f14085j = bVar.f14526i;
    }
}
