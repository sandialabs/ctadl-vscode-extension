package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$EnumEntry extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$EnumEntry> {

    /* renamed from: o  reason: collision with root package name */
    public static final ProtoBuf$EnumEntry f14124o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f14125p = new a();

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14126j;

    /* renamed from: k  reason: collision with root package name */
    public int f14127k;

    /* renamed from: l  reason: collision with root package name */
    public int f14128l;

    /* renamed from: m  reason: collision with root package name */
    public byte f14129m;
    public int n;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$EnumEntry> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$EnumEntry(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$EnumEntry, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14130l;

        /* renamed from: m  reason: collision with root package name */
        public int f14131m;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this);
            int i10 = 1;
            if ((this.f14130l & 1) != 1) {
                i10 = 0;
            }
            protoBuf$EnumEntry.f14128l = this.f14131m;
            protoBuf$EnumEntry.f14127k = i10;
            if (protoBuf$EnumEntry.a()) {
                return protoBuf$EnumEntry;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final Object clone() {
            b bVar = new b();
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this);
            int i10 = 1;
            if ((this.f14130l & 1) != 1) {
                i10 = 0;
            }
            protoBuf$EnumEntry.f14128l = this.f14131m;
            protoBuf$EnumEntry.f14127k = i10;
            bVar.l(protoBuf$EnumEntry);
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
        public final GeneratedMessageLite.a i() {
            b bVar = new b();
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this);
            int i10 = 1;
            if ((this.f14130l & 1) != 1) {
                i10 = 0;
            }
            protoBuf$EnumEntry.f14128l = this.f14131m;
            protoBuf$EnumEntry.f14127k = i10;
            bVar.l(protoBuf$EnumEntry);
            return bVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.a
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.a j(GeneratedMessageLite generatedMessageLite) {
            l((ProtoBuf$EnumEntry) generatedMessageLite);
            return this;
        }

        public final void l(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
            boolean z10;
            if (protoBuf$EnumEntry == ProtoBuf$EnumEntry.f14124o) {
                return;
            }
            if ((protoBuf$EnumEntry.f14127k & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = protoBuf$EnumEntry.f14128l;
                this.f14130l = 1 | this.f14130l;
                this.f14131m = i10;
            }
            k(protoBuf$EnumEntry);
            this.f14526i = this.f14526i.d(protoBuf$EnumEntry.f14126j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$EnumEntry protoBuf$EnumEntry;
            try {
                try {
                    ProtoBuf$EnumEntry.f14125p.getClass();
                    l(new ProtoBuf$EnumEntry(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$EnumEntry = null;
                    if (protoBuf$EnumEntry != null) {
                        l(protoBuf$EnumEntry);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$EnumEntry = (ProtoBuf$EnumEntry) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$EnumEntry != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(0);
        f14124o = protoBuf$EnumEntry;
        protoBuf$EnumEntry.f14128l = 0;
    }

    public ProtoBuf$EnumEntry() {
        throw null;
    }

    public ProtoBuf$EnumEntry(int i10) {
        this.f14129m = (byte) -1;
        this.n = -1;
        this.f14126j = i9.a.f11832i;
    }

    public ProtoBuf$EnumEntry(c cVar, d dVar) {
        this.f14129m = (byte) -1;
        this.n = -1;
        boolean z10 = false;
        this.f14128l = 0;
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    if (n != 0) {
                        if (n == 8) {
                            this.f14127k |= 1;
                            this.f14128l = cVar.k();
                        } else if (!p(cVar, j2, dVar, n)) {
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
                    this.f14126j = bVar.c();
                    throw th2;
                }
                this.f14126j = bVar.c();
                n();
                throw th;
            }
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14126j = bVar.c();
            throw th3;
        }
        this.f14126j = bVar.c();
        n();
    }

    @Override // i9.f
    public final boolean a() {
        byte b5 = this.f14129m;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        if (j()) {
            this.f14129m = (byte) 1;
            return true;
        }
        this.f14129m = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.n;
        if (i10 != -1) {
            return i10;
        }
        int size = this.f14126j.size() + k() + ((this.f14127k & 1) == 1 ? 0 + CodedOutputStream.b(1, this.f14128l) : 0);
        this.n = size;
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

    @Override // i9.f
    public final h e() {
        return f14124o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        GeneratedMessageLite.ExtendableMessage<MessageType>.a o10 = o();
        if ((this.f14127k & 1) == 1) {
            codedOutputStream.m(1, this.f14128l);
        }
        o10.a(200, codedOutputStream);
        codedOutputStream.r(this.f14126j);
    }

    public ProtoBuf$EnumEntry(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14129m = (byte) -1;
        this.n = -1;
        this.f14126j = bVar.f14526i;
    }
}
