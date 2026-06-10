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
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$TypeTable extends GeneratedMessageLite implements f {

    /* renamed from: o  reason: collision with root package name */
    public static final ProtoBuf$TypeTable f14372o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f14373p = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f14374i;

    /* renamed from: j  reason: collision with root package name */
    public int f14375j;

    /* renamed from: k  reason: collision with root package name */
    public List<ProtoBuf$Type> f14376k;

    /* renamed from: l  reason: collision with root package name */
    public int f14377l;

    /* renamed from: m  reason: collision with root package name */
    public byte f14378m;
    public int n;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$TypeTable> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$TypeTable(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$TypeTable, b> implements f {

        /* renamed from: j  reason: collision with root package name */
        public int f14379j;

        /* renamed from: k  reason: collision with root package name */
        public List<ProtoBuf$Type> f14380k = Collections.emptyList();

        /* renamed from: l  reason: collision with root package name */
        public int f14381l = -1;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$TypeTable k3 = k();
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
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$TypeTable protoBuf$TypeTable) {
            l(protoBuf$TypeTable);
            return this;
        }

        public final ProtoBuf$TypeTable k() {
            ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable(this);
            int i10 = this.f14379j;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f14380k = Collections.unmodifiableList(this.f14380k);
                this.f14379j &= -2;
            }
            protoBuf$TypeTable.f14376k = this.f14380k;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            protoBuf$TypeTable.f14377l = this.f14381l;
            protoBuf$TypeTable.f14375j = i11;
            return protoBuf$TypeTable;
        }

        public final void l(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if (protoBuf$TypeTable == ProtoBuf$TypeTable.f14372o) {
                return;
            }
            boolean z10 = true;
            if (!protoBuf$TypeTable.f14376k.isEmpty()) {
                if (this.f14380k.isEmpty()) {
                    this.f14380k = protoBuf$TypeTable.f14376k;
                    this.f14379j &= -2;
                } else {
                    if ((this.f14379j & 1) != 1) {
                        this.f14380k = new ArrayList(this.f14380k);
                        this.f14379j |= 1;
                    }
                    this.f14380k.addAll(protoBuf$TypeTable.f14376k);
                }
            }
            if ((protoBuf$TypeTable.f14375j & 1) != 1) {
                z10 = false;
            }
            if (z10) {
                int i10 = protoBuf$TypeTable.f14377l;
                this.f14379j |= 2;
                this.f14381l = i10;
            }
            this.f14526i = this.f14526i.d(protoBuf$TypeTable.f14374i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$TypeTable protoBuf$TypeTable;
            try {
                try {
                    ProtoBuf$TypeTable.f14373p.getClass();
                    l(new ProtoBuf$TypeTable(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$TypeTable = null;
                    if (protoBuf$TypeTable != null) {
                        l(protoBuf$TypeTable);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$TypeTable = (ProtoBuf$TypeTable) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$TypeTable != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable();
        f14372o = protoBuf$TypeTable;
        protoBuf$TypeTable.f14376k = Collections.emptyList();
        protoBuf$TypeTable.f14377l = -1;
    }

    public ProtoBuf$TypeTable() {
        this.f14378m = (byte) -1;
        this.n = -1;
        this.f14374i = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$TypeTable(c cVar, d dVar) {
        this.f14378m = (byte) -1;
        this.n = -1;
        this.f14376k = Collections.emptyList();
        this.f14377l = -1;
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    if (n != 0) {
                        if (n == 10) {
                            if (!(z11 & true)) {
                                this.f14376k = new ArrayList();
                                z11 |= true;
                            }
                            this.f14376k.add(cVar.g(ProtoBuf$Type.C, dVar));
                        } else if (n != 16) {
                            if (!cVar.q(n, j2)) {
                            }
                        } else {
                            this.f14375j |= 1;
                            this.f14377l = cVar.k();
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
                if (z11 & true) {
                    this.f14376k = Collections.unmodifiableList(this.f14376k);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14374i = bVar.c();
                    throw th2;
                }
                this.f14374i = bVar.c();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14376k = Collections.unmodifiableList(this.f14376k);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14374i = bVar.c();
            throw th3;
        }
        this.f14374i = bVar.c();
    }

    public static b j(ProtoBuf$TypeTable protoBuf$TypeTable) {
        b bVar = new b();
        bVar.l(protoBuf$TypeTable);
        return bVar;
    }

    @Override // i9.f
    public final boolean a() {
        byte b5 = this.f14378m;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14376k.size(); i10++) {
            if (!this.f14376k.get(i10).a()) {
                this.f14378m = (byte) 0;
                return false;
            }
        }
        this.f14378m = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.n;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14376k.size(); i12++) {
            i11 += CodedOutputStream.d(1, this.f14376k.get(i12));
        }
        if ((this.f14375j & 1) == 1) {
            i11 += CodedOutputStream.b(2, this.f14377l);
        }
        int size = this.f14374i.size() + i11;
        this.n = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a c() {
        return j(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final h.a d() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i10 = 0; i10 < this.f14376k.size(); i10++) {
            codedOutputStream.o(1, this.f14376k.get(i10));
        }
        if ((this.f14375j & 1) == 1) {
            codedOutputStream.m(2, this.f14377l);
        }
        codedOutputStream.r(this.f14374i);
    }

    public final b k() {
        return j(this);
    }

    public ProtoBuf$TypeTable(GeneratedMessageLite.a aVar) {
        super(0);
        this.f14378m = (byte) -1;
        this.n = -1;
        this.f14374i = aVar.f14526i;
    }
}
