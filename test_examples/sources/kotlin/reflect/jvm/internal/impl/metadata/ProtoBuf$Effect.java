package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import i9.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
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
public final class ProtoBuf$Effect extends GeneratedMessageLite implements f {

    /* renamed from: q  reason: collision with root package name */
    public static final ProtoBuf$Effect f14101q;

    /* renamed from: r  reason: collision with root package name */
    public static final a f14102r = new a();

    /* renamed from: i  reason: collision with root package name */
    public final i9.a f14103i;

    /* renamed from: j  reason: collision with root package name */
    public int f14104j;

    /* renamed from: k  reason: collision with root package name */
    public EffectType f14105k;

    /* renamed from: l  reason: collision with root package name */
    public List<ProtoBuf$Expression> f14106l;

    /* renamed from: m  reason: collision with root package name */
    public ProtoBuf$Expression f14107m;
    public InvocationKind n;

    /* renamed from: o  reason: collision with root package name */
    public byte f14108o;

    /* renamed from: p  reason: collision with root package name */
    public int f14109p;

    /* loaded from: classes.dex */
    public enum EffectType implements f.a {
        f14110j("RETURNS_CONSTANT"),
        f14111k("CALLS"),
        f14112l("RETURNS_NOT_NULL");
        

        /* renamed from: i  reason: collision with root package name */
        public final int f14114i;

        EffectType(String str) {
            this.f14114i = r2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
        public final int c() {
            return this.f14114i;
        }
    }

    /* loaded from: classes.dex */
    public enum InvocationKind implements f.a {
        f14115j("AT_MOST_ONCE"),
        f14116k("EXACTLY_ONCE"),
        f14117l("AT_LEAST_ONCE");
        

        /* renamed from: i  reason: collision with root package name */
        public final int f14119i;

        InvocationKind(String str) {
            this.f14119i = r2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.f.a
        public final int c() {
            return this.f14119i;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Effect> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Effect(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.a<ProtoBuf$Effect, b> implements i9.f {

        /* renamed from: j  reason: collision with root package name */
        public int f14120j;

        /* renamed from: k  reason: collision with root package name */
        public EffectType f14121k = EffectType.f14110j;

        /* renamed from: l  reason: collision with root package name */
        public List<ProtoBuf$Expression> f14122l = Collections.emptyList();

        /* renamed from: m  reason: collision with root package name */
        public ProtoBuf$Expression f14123m = ProtoBuf$Expression.f14132t;
        public InvocationKind n = InvocationKind.f14115j;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Effect k3 = k();
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
        public final /* bridge */ /* synthetic */ b j(ProtoBuf$Effect protoBuf$Effect) {
            l(protoBuf$Effect);
            return this;
        }

        public final ProtoBuf$Effect k() {
            ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(this);
            int i10 = this.f14120j;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Effect.f14105k = this.f14121k;
            if ((i10 & 2) == 2) {
                this.f14122l = Collections.unmodifiableList(this.f14122l);
                this.f14120j &= -3;
            }
            protoBuf$Effect.f14106l = this.f14122l;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            protoBuf$Effect.f14107m = this.f14123m;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            protoBuf$Effect.n = this.n;
            protoBuf$Effect.f14104j = i11;
            return protoBuf$Effect;
        }

        public final void l(ProtoBuf$Effect protoBuf$Effect) {
            boolean z10;
            boolean z11;
            ProtoBuf$Expression protoBuf$Expression;
            if (protoBuf$Effect == ProtoBuf$Effect.f14101q) {
                return;
            }
            boolean z12 = true;
            if ((protoBuf$Effect.f14104j & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                EffectType effectType = protoBuf$Effect.f14105k;
                effectType.getClass();
                this.f14120j |= 1;
                this.f14121k = effectType;
            }
            if (!protoBuf$Effect.f14106l.isEmpty()) {
                if (this.f14122l.isEmpty()) {
                    this.f14122l = protoBuf$Effect.f14106l;
                    this.f14120j &= -3;
                } else {
                    if ((this.f14120j & 2) != 2) {
                        this.f14122l = new ArrayList(this.f14122l);
                        this.f14120j |= 2;
                    }
                    this.f14122l.addAll(protoBuf$Effect.f14106l);
                }
            }
            if ((protoBuf$Effect.f14104j & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                ProtoBuf$Expression protoBuf$Expression2 = protoBuf$Effect.f14107m;
                if ((this.f14120j & 4) == 4 && (protoBuf$Expression = this.f14123m) != ProtoBuf$Expression.f14132t) {
                    ProtoBuf$Expression.b bVar = new ProtoBuf$Expression.b();
                    bVar.l(protoBuf$Expression);
                    bVar.l(protoBuf$Expression2);
                    protoBuf$Expression2 = bVar.k();
                }
                this.f14123m = protoBuf$Expression2;
                this.f14120j |= 4;
            }
            if ((protoBuf$Effect.f14104j & 4) != 4) {
                z12 = false;
            }
            if (z12) {
                InvocationKind invocationKind = protoBuf$Effect.n;
                invocationKind.getClass();
                this.f14120j |= 8;
                this.n = invocationKind;
            }
            this.f14526i = this.f14526i.d(protoBuf$Effect.f14103i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(c cVar, d dVar) {
            ProtoBuf$Effect protoBuf$Effect;
            try {
                try {
                    ProtoBuf$Effect.f14102r.getClass();
                    l(new ProtoBuf$Effect(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Effect = null;
                    if (protoBuf$Effect != null) {
                        l(protoBuf$Effect);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$Effect = (ProtoBuf$Effect) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$Effect != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect();
        f14101q = protoBuf$Effect;
        protoBuf$Effect.f14105k = EffectType.f14110j;
        protoBuf$Effect.f14106l = Collections.emptyList();
        protoBuf$Effect.f14107m = ProtoBuf$Expression.f14132t;
        protoBuf$Effect.n = InvocationKind.f14115j;
    }

    public ProtoBuf$Effect() {
        this.f14108o = (byte) -1;
        this.f14109p = -1;
        this.f14103i = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$Effect(c cVar, d dVar) {
        int k3;
        this.f14108o = (byte) -1;
        this.f14109p = -1;
        EffectType effectType = EffectType.f14110j;
        this.f14105k = effectType;
        this.f14106l = Collections.emptyList();
        this.f14107m = ProtoBuf$Expression.f14132t;
        InvocationKind invocationKind = InvocationKind.f14115j;
        this.n = invocationKind;
        a.b bVar = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n = cVar.n();
                    if (n != 0) {
                        InvocationKind invocationKind2 = null;
                        EffectType effectType2 = null;
                        ProtoBuf$Expression.b bVar2 = null;
                        if (n == 8) {
                            k3 = cVar.k();
                            if (k3 == 0) {
                                effectType2 = effectType;
                            } else if (k3 == 1) {
                                effectType2 = EffectType.f14111k;
                            } else if (k3 == 2) {
                                effectType2 = EffectType.f14112l;
                            }
                            if (effectType2 == null) {
                                j2.v(n);
                                j2.v(k3);
                            } else {
                                this.f14104j |= 1;
                                this.f14105k = effectType2;
                            }
                        } else if (n == 18) {
                            if (!(z11 & true)) {
                                this.f14106l = new ArrayList();
                                z11 |= true;
                            }
                            this.f14106l.add(cVar.g(ProtoBuf$Expression.f14133u, dVar));
                        } else if (n == 26) {
                            if ((this.f14104j & 2) == 2) {
                                ProtoBuf$Expression protoBuf$Expression = this.f14107m;
                                protoBuf$Expression.getClass();
                                bVar2 = new ProtoBuf$Expression.b();
                                bVar2.l(protoBuf$Expression);
                            }
                            ProtoBuf$Expression protoBuf$Expression2 = (ProtoBuf$Expression) cVar.g(ProtoBuf$Expression.f14133u, dVar);
                            this.f14107m = protoBuf$Expression2;
                            if (bVar2 != null) {
                                bVar2.l(protoBuf$Expression2);
                                this.f14107m = bVar2.k();
                            }
                            this.f14104j |= 2;
                        } else if (n != 32) {
                            if (!cVar.q(n, j2)) {
                            }
                        } else {
                            k3 = cVar.k();
                            if (k3 == 0) {
                                invocationKind2 = invocationKind;
                            } else if (k3 == 1) {
                                invocationKind2 = InvocationKind.f14116k;
                            } else if (k3 == 2) {
                                invocationKind2 = InvocationKind.f14117l;
                            }
                            if (invocationKind2 != null) {
                                this.f14104j |= 4;
                                this.n = invocationKind2;
                            } else {
                                j2.v(n);
                                j2.v(k3);
                            }
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
                    this.f14106l = Collections.unmodifiableList(this.f14106l);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f14103i = bVar.c();
                    throw th2;
                }
                this.f14103i = bVar.c();
                throw th;
            }
        }
        if (z11 & true) {
            this.f14106l = Collections.unmodifiableList(this.f14106l);
        }
        try {
            j2.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f14103i = bVar.c();
            throw th3;
        }
        this.f14103i = bVar.c();
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        byte b5 = this.f14108o;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f14106l.size(); i10++) {
            if (!this.f14106l.get(i10).a()) {
                this.f14108o = (byte) 0;
                return false;
            }
        }
        if ((this.f14104j & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f14107m.a()) {
            this.f14108o = (byte) 0;
            return false;
        }
        this.f14108o = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
    public final int b() {
        int i10;
        int i11 = this.f14109p;
        if (i11 != -1) {
            return i11;
        }
        if ((this.f14104j & 1) == 1) {
            i10 = CodedOutputStream.a(1, this.f14105k.f14114i) + 0;
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < this.f14106l.size(); i12++) {
            i10 += CodedOutputStream.d(2, this.f14106l.get(i12));
        }
        if ((this.f14104j & 2) == 2) {
            i10 += CodedOutputStream.d(3, this.f14107m);
        }
        if ((this.f14104j & 4) == 4) {
            i10 += CodedOutputStream.a(4, this.n.f14119i);
        }
        int size = this.f14103i.size() + i10;
        this.f14109p = size;
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
        if ((this.f14104j & 1) == 1) {
            codedOutputStream.l(1, this.f14105k.f14114i);
        }
        for (int i10 = 0; i10 < this.f14106l.size(); i10++) {
            codedOutputStream.o(2, this.f14106l.get(i10));
        }
        if ((this.f14104j & 2) == 2) {
            codedOutputStream.o(3, this.f14107m);
        }
        if ((this.f14104j & 4) == 4) {
            codedOutputStream.l(4, this.n.f14119i);
        }
        codedOutputStream.r(this.f14103i);
    }

    public ProtoBuf$Effect(GeneratedMessageLite.a aVar) {
        super(0);
        this.f14108o = (byte) -1;
        this.f14109p = -1;
        this.f14103i = aVar.f14526i;
    }
}
