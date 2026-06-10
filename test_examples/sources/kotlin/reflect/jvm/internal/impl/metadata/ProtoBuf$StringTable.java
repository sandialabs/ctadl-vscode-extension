package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import i9.d;
import i9.e;
import i9.f;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$StringTable extends GeneratedMessageLite implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final ProtoBuf$StringTable f14272m;
    public static final a n = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f14273i;

    /* renamed from: j  reason: collision with root package name */
    public d f14274j;

    /* renamed from: k  reason: collision with root package name */
    public byte f14275k;

    /* renamed from: l  reason: collision with root package name */
    public int f14276l;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$StringTable> {
        @Override // i9.g
        public final Object a(c cVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            return new ProtoBuf$StringTable(cVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$StringTable, b> implements f {

        /* renamed from: j  reason: collision with root package name */
        public int f14277j;

        /* renamed from: k  reason: collision with root package name */
        public d f14278k = i9.c.f11840j;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$StringTable k3 = k();
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
        public final /* bridge */ /* synthetic */ h.a g(c cVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            m(cVar, dVar);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0162a
        public final /* bridge */ /* synthetic */ a.AbstractC0162a h(c cVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
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
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$StringTable protoBuf$StringTable) {
            l(protoBuf$StringTable);
            return this;
        }

        public final ProtoBuf$StringTable k() {
            ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(this);
            if ((this.f14277j & 1) == 1) {
                this.f14278k = this.f14278k.a();
                this.f14277j &= -2;
            }
            protoBuf$StringTable.f14274j = this.f14278k;
            return protoBuf$StringTable;
        }

        public final void l(ProtoBuf$StringTable protoBuf$StringTable) {
            if (protoBuf$StringTable == ProtoBuf$StringTable.f14272m) {
                return;
            }
            if (!protoBuf$StringTable.f14274j.isEmpty()) {
                if (this.f14278k.isEmpty()) {
                    this.f14278k = protoBuf$StringTable.f14274j;
                    this.f14277j &= -2;
                } else {
                    if ((this.f14277j & 1) != 1) {
                        this.f14278k = new i9.c(this.f14278k);
                        this.f14277j |= 1;
                    }
                    this.f14278k.addAll(protoBuf$StringTable.f14274j);
                }
            }
            this.f14526i = this.f14526i.d(protoBuf$StringTable.f14273i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            ProtoBuf$StringTable protoBuf$StringTable;
            try {
                try {
                    ProtoBuf$StringTable.n.getClass();
                    l(new ProtoBuf$StringTable(cVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$StringTable = null;
                    if (protoBuf$StringTable != null) {
                        l(protoBuf$StringTable);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$StringTable = (ProtoBuf$StringTable) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$StringTable != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable();
        f14272m = protoBuf$StringTable;
        protoBuf$StringTable.f14274j = i9.c.f11840j;
    }

    public ProtoBuf$StringTable() {
        this.f14275k = (byte) -1;
        this.f14276l = -1;
        this.f14273i = i9.a.f11832i;
    }

    public ProtoBuf$StringTable(c cVar) {
        this.f14275k = (byte) -1;
        this.f14276l = -1;
        this.f14274j = i9.c.f11840j;
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = cVar.n();
                        if (n10 != 0) {
                            if (n10 != 10) {
                                if (!cVar.q(n10, j2)) {
                                }
                            } else {
                                e e10 = cVar.e();
                                if (!(z11 & true)) {
                                    this.f14274j = new i9.c();
                                    z11 |= true;
                                }
                                this.f14274j.o(e10);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        e11.f14537i = this;
                        throw e11;
                    }
                } catch (IOException e12) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e12.getMessage());
                    invalidProtocolBufferException.f14537i = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if (z11 & true) {
                    this.f14274j = this.f14274j.a();
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14273i = bVar.c();
                    throw th2;
                }
                this.f14273i = bVar.c();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14274j = this.f14274j.a();
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14273i = bVar.c();
            throw th3;
        }
        this.f14273i = bVar.c();
    }

    @Override // i9.f
    public final boolean a() {
        byte b5 = this.f14275k;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        this.f14275k = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.f14276l;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14274j.size(); i12++) {
            i9.a m10 = this.f14274j.m(i12);
            i11 += m10.size() + CodedOutputStream.f(m10.size());
        }
        int size = this.f14273i.size() + (this.f14274j.size() * 1) + 0 + i11;
        this.f14276l = size;
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
        for (int i10 = 0; i10 < this.f14274j.size(); i10++) {
            i9.a m10 = this.f14274j.m(i10);
            codedOutputStream.x(1, 2);
            codedOutputStream.v(m10.size());
            codedOutputStream.r(m10);
        }
        codedOutputStream.r(this.f14273i);
    }

    public ProtoBuf$StringTable(GeneratedMessageLite.a aVar) {
        super(0);
        this.f14275k = (byte) -1;
        this.f14276l = -1;
        this.f14273i = aVar.f14526i;
    }
}
