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
public final class ProtoBuf$Contract extends GeneratedMessageLite implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final ProtoBuf$Contract f14094m;
    public static final a n = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f14095i;

    /* renamed from: j  reason: collision with root package name */
    public List<ProtoBuf$Effect> f14096j;

    /* renamed from: k  reason: collision with root package name */
    public byte f14097k;

    /* renamed from: l  reason: collision with root package name */
    public int f14098l;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Contract> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Contract(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$Contract, b> implements f {

        /* renamed from: j  reason: collision with root package name */
        public int f14099j;

        /* renamed from: k  reason: collision with root package name */
        public List<ProtoBuf$Effect> f14100k = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Contract k3 = k();
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
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$Contract protoBuf$Contract) {
            l(protoBuf$Contract);
            return this;
        }

        public final ProtoBuf$Contract k() {
            ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract(this);
            if ((this.f14099j & 1) == 1) {
                this.f14100k = Collections.unmodifiableList(this.f14100k);
                this.f14099j &= -2;
            }
            protoBuf$Contract.f14096j = this.f14100k;
            return protoBuf$Contract;
        }

        public final void l(ProtoBuf$Contract protoBuf$Contract) {
            if (protoBuf$Contract == ProtoBuf$Contract.f14094m) {
                return;
            }
            if (!protoBuf$Contract.f14096j.isEmpty()) {
                if (this.f14100k.isEmpty()) {
                    this.f14100k = protoBuf$Contract.f14096j;
                    this.f14099j &= -2;
                } else {
                    if ((this.f14099j & 1) != 1) {
                        this.f14100k = new ArrayList(this.f14100k);
                        this.f14099j |= 1;
                    }
                    this.f14100k.addAll(protoBuf$Contract.f14096j);
                }
            }
            this.f14526i = this.f14526i.d(protoBuf$Contract.f14095i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$Contract protoBuf$Contract;
            try {
                try {
                    ProtoBuf$Contract.n.getClass();
                    l(new ProtoBuf$Contract(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Contract = null;
                    if (protoBuf$Contract != null) {
                        l(protoBuf$Contract);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$Contract = (ProtoBuf$Contract) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$Contract != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract();
        f14094m = protoBuf$Contract;
        protoBuf$Contract.f14096j = Collections.emptyList();
    }

    public ProtoBuf$Contract() {
        this.f14097k = (byte) -1;
        this.f14098l = -1;
        this.f14095i = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$Contract(c cVar, d dVar) {
        this.f14097k = (byte) -1;
        this.f14098l = -1;
        this.f14096j = Collections.emptyList();
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = cVar.n();
                    if (n10 != 0) {
                        if (n10 == 10) {
                            if (!(z11 & true)) {
                                this.f14096j = new ArrayList();
                                z11 |= true;
                            }
                            this.f14096j.add(cVar.g(ProtoBuf$Effect.f14102r, dVar));
                        } else if (!cVar.q(n10, j2)) {
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
                    this.f14096j = Collections.unmodifiableList(this.f14096j);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14095i = bVar.c();
                    throw th2;
                }
                this.f14095i = bVar.c();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14096j = Collections.unmodifiableList(this.f14096j);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14095i = bVar.c();
            throw th3;
        }
        this.f14095i = bVar.c();
    }

    @Override // i9.f
    public final boolean a() {
        byte b5 = this.f14097k;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14096j.size(); i10++) {
            if (!this.f14096j.get(i10).a()) {
                this.f14097k = (byte) 0;
                return false;
            }
        }
        this.f14097k = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10 = this.f14098l;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f14096j.size(); i12++) {
            i11 += CodedOutputStream.d(1, this.f14096j.get(i12));
        }
        int size = this.f14095i.size() + i11;
        this.f14098l = size;
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
        for (int i10 = 0; i10 < this.f14096j.size(); i10++) {
            codedOutputStream.o(1, this.f14096j.get(i10));
        }
        codedOutputStream.r(this.f14095i);
    }

    public ProtoBuf$Contract(GeneratedMessageLite.a aVar) {
        super(0);
        this.f14097k = (byte) -1;
        this.f14098l = -1;
        this.f14095i = aVar.f14526i;
    }
}
