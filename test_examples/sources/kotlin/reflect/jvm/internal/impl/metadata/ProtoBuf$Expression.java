package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import i9.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
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
public final class ProtoBuf$Expression extends GeneratedMessageLite implements f {

    /* renamed from: t  reason: collision with root package name */
    public static final ProtoBuf$Expression f14132t;

    /* renamed from: u  reason: collision with root package name */
    public static final a f14133u = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f14134i;

    /* renamed from: j  reason: collision with root package name */
    public int f14135j;

    /* renamed from: k  reason: collision with root package name */
    public int f14136k;

    /* renamed from: l  reason: collision with root package name */
    public int f14137l;

    /* renamed from: m  reason: collision with root package name */
    public ConstantValue f14138m;
    public ProtoBuf$Type n;

    /* renamed from: o  reason: collision with root package name */
    public int f14139o;

    /* renamed from: p  reason: collision with root package name */
    public List<ProtoBuf$Expression> f14140p;

    /* renamed from: q  reason: collision with root package name */
    public List<ProtoBuf$Expression> f14141q;

    /* renamed from: r  reason: collision with root package name */
    public byte f14142r;

    /* renamed from: s  reason: collision with root package name */
    public int f14143s;

    /* loaded from: classes.dex */
    public enum ConstantValue implements f.a {
        f14144j("TRUE"),
        f14145k("FALSE"),
        f14146l("NULL");
        

        /* renamed from: i  reason: collision with root package name */
        public final int f14148i;

        ConstantValue(String str) {
            this.f14148i = r2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
        public final int c() {
            return this.f14148i;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Expression> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Expression(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$Expression, b> implements i9.f {

        /* renamed from: j  reason: collision with root package name */
        public int f14149j;

        /* renamed from: k  reason: collision with root package name */
        public int f14150k;

        /* renamed from: l  reason: collision with root package name */
        public int f14151l;

        /* renamed from: o  reason: collision with root package name */
        public int f14153o;

        /* renamed from: m  reason: collision with root package name */
        public ConstantValue f14152m = ConstantValue.f14144j;
        public ProtoBuf$Type n = ProtoBuf$Type.B;

        /* renamed from: p  reason: collision with root package name */
        public List<ProtoBuf$Expression> f14154p = Collections.emptyList();

        /* renamed from: q  reason: collision with root package name */
        public List<ProtoBuf$Expression> f14155q = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Expression k3 = k();
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
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$Expression protoBuf$Expression) {
            l(protoBuf$Expression);
            return this;
        }

        public final ProtoBuf$Expression k() {
            ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(this);
            int i10 = this.f14149j;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Expression.f14136k = this.f14150k;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$Expression.f14137l = this.f14151l;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$Expression.f14138m = this.f14152m;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$Expression.n = this.n;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$Expression.f14139o = this.f14153o;
            if ((i10 & 32) == 32) {
                this.f14154p = Collections.unmodifiableList(this.f14154p);
                this.f14149j &= -33;
            }
            protoBuf$Expression.f14140p = this.f14154p;
            if ((this.f14149j & 64) == 64) {
                this.f14155q = Collections.unmodifiableList(this.f14155q);
                this.f14149j &= -65;
            }
            protoBuf$Expression.f14141q = this.f14155q;
            protoBuf$Expression.f14135j = i11;
            return protoBuf$Expression;
        }

        public final void l(ProtoBuf$Expression protoBuf$Expression) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            ProtoBuf$Type protoBuf$Type;
            if (protoBuf$Expression == ProtoBuf$Expression.f14132t) {
                return;
            }
            int i10 = protoBuf$Expression.f14135j;
            boolean z14 = false;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = protoBuf$Expression.f14136k;
                this.f14149j |= 1;
                this.f14150k = i11;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = protoBuf$Expression.f14137l;
                this.f14149j = 2 | this.f14149j;
                this.f14151l = i12;
            }
            if ((i10 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                ConstantValue constantValue = protoBuf$Expression.f14138m;
                constantValue.getClass();
                this.f14149j = 4 | this.f14149j;
                this.f14152m = constantValue;
            }
            if ((protoBuf$Expression.f14135j & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                ProtoBuf$Type protoBuf$Type2 = protoBuf$Expression.n;
                if ((this.f14149j & 8) == 8 && (protoBuf$Type = this.n) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t10 = ProtoBuf$Type.t(protoBuf$Type);
                    t10.m(protoBuf$Type2);
                    protoBuf$Type2 = t10.l();
                }
                this.n = protoBuf$Type2;
                this.f14149j |= 8;
            }
            if ((protoBuf$Expression.f14135j & 16) == 16) {
                z14 = true;
            }
            if (z14) {
                int i13 = protoBuf$Expression.f14139o;
                this.f14149j = 16 | this.f14149j;
                this.f14153o = i13;
            }
            if (!protoBuf$Expression.f14140p.isEmpty()) {
                if (this.f14154p.isEmpty()) {
                    this.f14154p = protoBuf$Expression.f14140p;
                    this.f14149j &= -33;
                } else {
                    if ((this.f14149j & 32) != 32) {
                        this.f14154p = new ArrayList(this.f14154p);
                        this.f14149j |= 32;
                    }
                    this.f14154p.addAll(protoBuf$Expression.f14140p);
                }
            }
            if (!protoBuf$Expression.f14141q.isEmpty()) {
                if (this.f14155q.isEmpty()) {
                    this.f14155q = protoBuf$Expression.f14141q;
                    this.f14149j &= -65;
                } else {
                    if ((this.f14149j & 64) != 64) {
                        this.f14155q = new ArrayList(this.f14155q);
                        this.f14149j |= 64;
                    }
                    this.f14155q.addAll(protoBuf$Expression.f14141q);
                }
            }
            this.f14526i = this.f14526i.d(protoBuf$Expression.f14134i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$Expression protoBuf$Expression;
            try {
                try {
                    ProtoBuf$Expression.f14133u.getClass();
                    l(new ProtoBuf$Expression(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Expression = null;
                    if (protoBuf$Expression != null) {
                        l(protoBuf$Expression);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$Expression = (ProtoBuf$Expression) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$Expression != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression();
        f14132t = protoBuf$Expression;
        protoBuf$Expression.f14136k = 0;
        protoBuf$Expression.f14137l = 0;
        protoBuf$Expression.f14138m = ConstantValue.f14144j;
        protoBuf$Expression.n = ProtoBuf$Type.B;
        protoBuf$Expression.f14139o = 0;
        protoBuf$Expression.f14140p = Collections.emptyList();
        protoBuf$Expression.f14141q = Collections.emptyList();
    }

    public ProtoBuf$Expression() {
        this.f14142r = (byte) -1;
        this.f14143s = -1;
        this.f14134i = i9.a.f11832i;
    }

    public ProtoBuf$Expression(c cVar, d dVar) {
        List list;
        ConstantValue constantValue;
        this.f14142r = (byte) -1;
        this.f14143s = -1;
        boolean z10 = false;
        this.f14136k = 0;
        this.f14137l = 0;
        ConstantValue constantValue2 = ConstantValue.f14144j;
        this.f14138m = constantValue2;
        this.n = ProtoBuf$Type.B;
        this.f14139o = 0;
        this.f14140p = Collections.emptyList();
        this.f14141q = Collections.emptyList();
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n = cVar.n();
                        if (n != 0) {
                            if (n == 8) {
                                this.f14135j |= 1;
                                this.f14136k = cVar.k();
                            } else if (n != 16) {
                                ProtoBuf$Type.b bVar2 = null;
                                ConstantValue constantValue3 = null;
                                if (n == 24) {
                                    int k3 = cVar.k();
                                    if (k3 != 0) {
                                        if (k3 == 1) {
                                            constantValue3 = ConstantValue.f14145k;
                                        } else if (k3 == 2) {
                                            constantValue3 = ConstantValue.f14146l;
                                        }
                                        constantValue = constantValue3;
                                    } else {
                                        constantValue = constantValue2;
                                    }
                                    if (constantValue == null) {
                                        j2.v(n);
                                        j2.v(k3);
                                    } else {
                                        this.f14135j |= 4;
                                        this.f14138m = constantValue;
                                    }
                                } else if (n == 34) {
                                    if ((this.f14135j & 8) == 8) {
                                        ProtoBuf$Type protoBuf$Type = this.n;
                                        protoBuf$Type.getClass();
                                        bVar2 = ProtoBuf$Type.t(protoBuf$Type);
                                    }
                                    ProtoBuf$Type.b bVar3 = bVar2;
                                    ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                                    this.n = protoBuf$Type2;
                                    if (bVar3 != null) {
                                        bVar3.m(protoBuf$Type2);
                                        this.n = bVar3.l();
                                    }
                                    this.f14135j |= 8;
                                } else if (n != 40) {
                                    a aVar = f14133u;
                                    if (n == 50) {
                                        if (!(z11 & true)) {
                                            this.f14140p = new ArrayList();
                                            z11 |= true;
                                        }
                                        list = this.f14140p;
                                    } else if (n == 58) {
                                        if (!(z11 & true)) {
                                            this.f14141q = new ArrayList();
                                            z11 |= true;
                                        }
                                        list = this.f14141q;
                                    } else if (!cVar.q(n, j2)) {
                                    }
                                    list.add(cVar.g(aVar, dVar));
                                } else {
                                    this.f14135j |= 16;
                                    this.f14139o = cVar.k();
                                }
                            } else {
                                this.f14135j |= 2;
                                this.f14137l = cVar.k();
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                        invalidProtocolBufferException.f14537i = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    e11.f14537i = this;
                    throw e11;
                }
            } catch (Throwable th) {
                if (z11 & true) {
                    this.f14140p = Collections.unmodifiableList(this.f14140p);
                }
                if (z11 & true) {
                    this.f14141q = Collections.unmodifiableList(this.f14141q);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14134i = bVar.c();
                    throw th2;
                }
                this.f14134i = bVar.c();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14140p = Collections.unmodifiableList(this.f14140p);
        }
        if (z11 & true) {
            this.f14141q = Collections.unmodifiableList(this.f14141q);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14134i = bVar.c();
            throw th3;
        }
        this.f14134i = bVar.c();
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        byte b5 = this.f14142r;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        if ((this.f14135j & 8) == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.n.a()) {
            this.f14142r = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f14140p.size(); i10++) {
            if (!this.f14140p.get(i10).a()) {
                this.f14142r = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f14141q.size(); i11++) {
            if (!this.f14141q.get(i11).a()) {
                this.f14142r = (byte) 0;
                return false;
            }
        }
        this.f14142r = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10;
        int i11 = this.f14143s;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f14135j & 1) == 1) {
            i10 = CodedOutputStream.b(1, this.f14136k) + 0;
        } else {
            i10 = 0;
        }
        if ((this.f14135j & 2) == 2) {
            i10 += CodedOutputStream.b(2, this.f14137l);
        }
        if ((this.f14135j & 4) == 4) {
            i10 += CodedOutputStream.a(3, this.f14138m.f14148i);
        }
        if ((this.f14135j & 8) == 8) {
            i10 += CodedOutputStream.d(4, this.n);
        }
        if ((this.f14135j & 16) == 16) {
            i10 += CodedOutputStream.b(5, this.f14139o);
        }
        for (int i12 = 0; i12 < this.f14140p.size(); i12++) {
            i10 += CodedOutputStream.d(6, this.f14140p.get(i12));
        }
        for (int i13 = 0; i13 < this.f14141q.size(); i13++) {
            i10 += CodedOutputStream.d(7, this.f14141q.get(i13));
        }
        int size = this.f14134i.size() + i10;
        this.f14143s = size;
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
        if ((this.f14135j & 1) == 1) {
            codedOutputStream.m(1, this.f14136k);
        }
        if ((this.f14135j & 2) == 2) {
            codedOutputStream.m(2, this.f14137l);
        }
        if ((this.f14135j & 4) == 4) {
            codedOutputStream.l(3, this.f14138m.f14148i);
        }
        if ((this.f14135j & 8) == 8) {
            codedOutputStream.o(4, this.n);
        }
        if ((this.f14135j & 16) == 16) {
            codedOutputStream.m(5, this.f14139o);
        }
        for (int i10 = 0; i10 < this.f14140p.size(); i10++) {
            codedOutputStream.o(6, this.f14140p.get(i10));
        }
        for (int i11 = 0; i11 < this.f14141q.size(); i11++) {
            codedOutputStream.o(7, this.f14141q.get(i11));
        }
        codedOutputStream.r(this.f14134i);
    }

    public ProtoBuf$Expression(GeneratedMessageLite.a aVar) {
        super(0);
        this.f14142r = (byte) -1;
        this.f14143s = -1;
        this.f14134i = aVar.f14526i;
    }
}
