package kotlin.reflect.jvm.internal.impl.metadata;

import i9.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.c;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* loaded from: classes.dex */
public final class ProtoBuf$Function extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Function> {
    public static final ProtoBuf$Function C;
    public static final a D = new a();
    public byte A;
    public int B;

    /* renamed from: j  reason: collision with root package name */
    public final i9.a f14156j;

    /* renamed from: k  reason: collision with root package name */
    public int f14157k;

    /* renamed from: l  reason: collision with root package name */
    public int f14158l;

    /* renamed from: m  reason: collision with root package name */
    public int f14159m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public ProtoBuf$Type f14160o;

    /* renamed from: p  reason: collision with root package name */
    public int f14161p;

    /* renamed from: q  reason: collision with root package name */
    public List<ProtoBuf$TypeParameter> f14162q;

    /* renamed from: r  reason: collision with root package name */
    public ProtoBuf$Type f14163r;

    /* renamed from: s  reason: collision with root package name */
    public int f14164s;

    /* renamed from: t  reason: collision with root package name */
    public List<ProtoBuf$Type> f14165t;

    /* renamed from: u  reason: collision with root package name */
    public List<Integer> f14166u;

    /* renamed from: v  reason: collision with root package name */
    public int f14167v;

    /* renamed from: w  reason: collision with root package name */
    public List<ProtoBuf$ValueParameter> f14168w;

    /* renamed from: x  reason: collision with root package name */
    public ProtoBuf$TypeTable f14169x;

    /* renamed from: y  reason: collision with root package name */
    public List<Integer> f14170y;

    /* renamed from: z  reason: collision with root package name */
    public ProtoBuf$Contract f14171z;

    /* loaded from: classes.dex */
    public static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<ProtoBuf$Function> {
        @Override // i9.g
        public final Object a(c cVar, d dVar) {
            return new ProtoBuf$Function(cVar, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Function, b> {

        /* renamed from: l  reason: collision with root package name */
        public int f14172l;

        /* renamed from: m  reason: collision with root package name */
        public int f14173m = 6;
        public int n = 6;

        /* renamed from: o  reason: collision with root package name */
        public int f14174o;

        /* renamed from: p  reason: collision with root package name */
        public ProtoBuf$Type f14175p;

        /* renamed from: q  reason: collision with root package name */
        public int f14176q;

        /* renamed from: r  reason: collision with root package name */
        public List<ProtoBuf$TypeParameter> f14177r;

        /* renamed from: s  reason: collision with root package name */
        public ProtoBuf$Type f14178s;

        /* renamed from: t  reason: collision with root package name */
        public int f14179t;

        /* renamed from: u  reason: collision with root package name */
        public List<ProtoBuf$Type> f14180u;

        /* renamed from: v  reason: collision with root package name */
        public List<Integer> f14181v;

        /* renamed from: w  reason: collision with root package name */
        public List<ProtoBuf$ValueParameter> f14182w;

        /* renamed from: x  reason: collision with root package name */
        public ProtoBuf$TypeTable f14183x;

        /* renamed from: y  reason: collision with root package name */
        public List<Integer> f14184y;

        /* renamed from: z  reason: collision with root package name */
        public ProtoBuf$Contract f14185z;

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
            this.f14175p = protoBuf$Type;
            this.f14177r = Collections.emptyList();
            this.f14178s = protoBuf$Type;
            this.f14180u = Collections.emptyList();
            this.f14181v = Collections.emptyList();
            this.f14182w = Collections.emptyList();
            this.f14183x = ProtoBuf$TypeTable.f14372o;
            this.f14184y = Collections.emptyList();
            this.f14185z = ProtoBuf$Contract.f14094m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.a
        public final h build() {
            ProtoBuf$Function l2 = l();
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
            m((ProtoBuf$Function) generatedMessageLite);
            return this;
        }

        public final ProtoBuf$Function l() {
            ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(this);
            int i10 = this.f14172l;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Function.f14158l = this.f14173m;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$Function.f14159m = this.n;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$Function.n = this.f14174o;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$Function.f14160o = this.f14175p;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$Function.f14161p = this.f14176q;
            if ((i10 & 32) == 32) {
                this.f14177r = Collections.unmodifiableList(this.f14177r);
                this.f14172l &= -33;
            }
            protoBuf$Function.f14162q = this.f14177r;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            protoBuf$Function.f14163r = this.f14178s;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            protoBuf$Function.f14164s = this.f14179t;
            if ((this.f14172l & 256) == 256) {
                this.f14180u = Collections.unmodifiableList(this.f14180u);
                this.f14172l &= -257;
            }
            protoBuf$Function.f14165t = this.f14180u;
            if ((this.f14172l & 512) == 512) {
                this.f14181v = Collections.unmodifiableList(this.f14181v);
                this.f14172l &= -513;
            }
            protoBuf$Function.f14166u = this.f14181v;
            if ((this.f14172l & 1024) == 1024) {
                this.f14182w = Collections.unmodifiableList(this.f14182w);
                this.f14172l &= -1025;
            }
            protoBuf$Function.f14168w = this.f14182w;
            if ((i10 & 2048) == 2048) {
                i11 |= 128;
            }
            protoBuf$Function.f14169x = this.f14183x;
            if ((this.f14172l & 4096) == 4096) {
                this.f14184y = Collections.unmodifiableList(this.f14184y);
                this.f14172l &= -4097;
            }
            protoBuf$Function.f14170y = this.f14184y;
            if ((i10 & 8192) == 8192) {
                i11 |= 256;
            }
            protoBuf$Function.f14171z = this.f14185z;
            protoBuf$Function.f14157k = i11;
            return protoBuf$Function;
        }

        public final void m(ProtoBuf$Function protoBuf$Function) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            ProtoBuf$Contract protoBuf$Contract;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Function == ProtoBuf$Function.C) {
                return;
            }
            int i10 = protoBuf$Function.f14157k;
            boolean z18 = false;
            if ((i10 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i11 = protoBuf$Function.f14158l;
                this.f14172l |= 1;
                this.f14173m = i11;
            }
            if ((i10 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i12 = protoBuf$Function.f14159m;
                this.f14172l = 2 | this.f14172l;
                this.n = i12;
            }
            if ((i10 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                int i13 = protoBuf$Function.n;
                this.f14172l = 4 | this.f14172l;
                this.f14174o = i13;
            }
            if ((i10 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$Function.f14160o;
                if ((this.f14172l & 8) == 8 && (protoBuf$Type2 = this.f14175p) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t10 = ProtoBuf$Type.t(protoBuf$Type2);
                    t10.m(protoBuf$Type3);
                    protoBuf$Type3 = t10.l();
                }
                this.f14175p = protoBuf$Type3;
                this.f14172l |= 8;
            }
            if ((protoBuf$Function.f14157k & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                int i14 = protoBuf$Function.f14161p;
                this.f14172l = 16 | this.f14172l;
                this.f14176q = i14;
            }
            if (!protoBuf$Function.f14162q.isEmpty()) {
                if (this.f14177r.isEmpty()) {
                    this.f14177r = protoBuf$Function.f14162q;
                    this.f14172l &= -33;
                } else {
                    if ((this.f14172l & 32) != 32) {
                        this.f14177r = new ArrayList(this.f14177r);
                        this.f14172l |= 32;
                    }
                    this.f14177r.addAll(protoBuf$Function.f14162q);
                }
            }
            if ((protoBuf$Function.f14157k & 32) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$Function.f14163r;
                if ((this.f14172l & 64) == 64 && (protoBuf$Type = this.f14178s) != ProtoBuf$Type.B) {
                    ProtoBuf$Type.b t11 = ProtoBuf$Type.t(protoBuf$Type);
                    t11.m(protoBuf$Type4);
                    protoBuf$Type4 = t11.l();
                }
                this.f14178s = protoBuf$Type4;
                this.f14172l |= 64;
            }
            if ((protoBuf$Function.f14157k & 64) == 64) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                int i15 = protoBuf$Function.f14164s;
                this.f14172l |= 128;
                this.f14179t = i15;
            }
            if (!protoBuf$Function.f14165t.isEmpty()) {
                if (this.f14180u.isEmpty()) {
                    this.f14180u = protoBuf$Function.f14165t;
                    this.f14172l &= -257;
                } else {
                    if ((this.f14172l & 256) != 256) {
                        this.f14180u = new ArrayList(this.f14180u);
                        this.f14172l |= 256;
                    }
                    this.f14180u.addAll(protoBuf$Function.f14165t);
                }
            }
            if (!protoBuf$Function.f14166u.isEmpty()) {
                if (this.f14181v.isEmpty()) {
                    this.f14181v = protoBuf$Function.f14166u;
                    this.f14172l &= -513;
                } else {
                    if ((this.f14172l & 512) != 512) {
                        this.f14181v = new ArrayList(this.f14181v);
                        this.f14172l |= 512;
                    }
                    this.f14181v.addAll(protoBuf$Function.f14166u);
                }
            }
            if (!protoBuf$Function.f14168w.isEmpty()) {
                if (this.f14182w.isEmpty()) {
                    this.f14182w = protoBuf$Function.f14168w;
                    this.f14172l &= -1025;
                } else {
                    if ((this.f14172l & 1024) != 1024) {
                        this.f14182w = new ArrayList(this.f14182w);
                        this.f14172l |= 1024;
                    }
                    this.f14182w.addAll(protoBuf$Function.f14168w);
                }
            }
            if ((protoBuf$Function.f14157k & 128) == 128) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Function.f14169x;
                if ((this.f14172l & 2048) == 2048 && (protoBuf$TypeTable = this.f14183x) != ProtoBuf$TypeTable.f14372o) {
                    ProtoBuf$TypeTable.b j2 = ProtoBuf$TypeTable.j(protoBuf$TypeTable);
                    j2.l(protoBuf$TypeTable2);
                    protoBuf$TypeTable2 = j2.k();
                }
                this.f14183x = protoBuf$TypeTable2;
                this.f14172l |= 2048;
            }
            if (!protoBuf$Function.f14170y.isEmpty()) {
                if (this.f14184y.isEmpty()) {
                    this.f14184y = protoBuf$Function.f14170y;
                    this.f14172l &= -4097;
                } else {
                    if ((this.f14172l & 4096) != 4096) {
                        this.f14184y = new ArrayList(this.f14184y);
                        this.f14172l |= 4096;
                    }
                    this.f14184y.addAll(protoBuf$Function.f14170y);
                }
            }
            if ((protoBuf$Function.f14157k & 256) == 256) {
                z18 = true;
            }
            if (z18) {
                ProtoBuf$Contract protoBuf$Contract2 = protoBuf$Function.f14171z;
                if ((this.f14172l & 8192) == 8192 && (protoBuf$Contract = this.f14185z) != ProtoBuf$Contract.f14094m) {
                    ProtoBuf$Contract.b bVar = new ProtoBuf$Contract.b();
                    bVar.l(protoBuf$Contract);
                    bVar.l(protoBuf$Contract2);
                    protoBuf$Contract2 = bVar.k();
                }
                this.f14185z = protoBuf$Contract2;
                this.f14172l |= 8192;
            }
            k(protoBuf$Function);
            this.f14526i = this.f14526i.d(protoBuf$Function.f14156j);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(c cVar, d dVar) {
            ProtoBuf$Function protoBuf$Function;
            try {
                try {
                    ProtoBuf$Function.D.getClass();
                    m(new ProtoBuf$Function(cVar, dVar));
                } catch (Throwable th) {
                    th = th;
                    protoBuf$Function = null;
                    if (protoBuf$Function != null) {
                        m(protoBuf$Function);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$Function = (ProtoBuf$Function) e10.f14537i;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    if (protoBuf$Function != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(0);
        C = protoBuf$Function;
        protoBuf$Function.r();
    }

    public ProtoBuf$Function() {
        throw null;
    }

    public ProtoBuf$Function(int i10) {
        this.f14167v = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f14156j = i9.a.f11832i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public ProtoBuf$Function(c cVar, d dVar) {
        int i10;
        List list;
        kotlin.reflect.jvm.internal.impl.protobuf.b bVar;
        int d5;
        h hVar;
        this.f14167v = -1;
        this.A = (byte) -1;
        this.B = -1;
        r();
        a.b bVar2 = new a.b();
        CodedOutputStream j2 = CodedOutputStream.j(bVar2, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 1024;
            if (z10) {
                if (z11 & true) {
                    this.f14162q = Collections.unmodifiableList(this.f14162q);
                }
                if (z11 & true) {
                    this.f14168w = Collections.unmodifiableList(this.f14168w);
                }
                if (z11 & true) {
                    this.f14165t = Collections.unmodifiableList(this.f14165t);
                }
                if (z11 & true) {
                    this.f14166u = Collections.unmodifiableList(this.f14166u);
                }
                if (z11 & true) {
                    this.f14170y = Collections.unmodifiableList(this.f14170y);
                }
                try {
                    j2.i();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f14156j = bVar2.c();
                    throw th;
                }
                this.f14156j = bVar2.c();
                n();
                return;
            }
            try {
                try {
                    int n = cVar.n();
                    ProtoBuf$Type.b bVar3 = null;
                    ProtoBuf$Contract.b bVar4 = null;
                    ProtoBuf$TypeTable.b bVar5 = null;
                    ProtoBuf$Type.b bVar6 = null;
                    switch (n) {
                        case 0:
                            z10 = true;
                            break;
                        case 8:
                            this.f14157k |= 2;
                            this.f14159m = cVar.k();
                            break;
                        case 16:
                            this.f14157k |= 4;
                            this.n = cVar.k();
                            break;
                        case 26:
                            i10 = 8;
                            if ((this.f14157k & 8) == 8) {
                                ProtoBuf$Type protoBuf$Type = this.f14160o;
                                protoBuf$Type.getClass();
                                bVar3 = ProtoBuf$Type.t(protoBuf$Type);
                            }
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                            this.f14160o = protoBuf$Type2;
                            if (bVar3 != null) {
                                bVar3.m(protoBuf$Type2);
                                this.f14160o = bVar3.l();
                            }
                            this.f14157k |= i10;
                            break;
                        case 34:
                            if (!(z11 & true)) {
                                this.f14162q = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14162q;
                            bVar = ProtoBuf$TypeParameter.f14350v;
                            hVar = cVar.g(bVar, dVar);
                            list.add(hVar);
                            break;
                        case 42:
                            if ((this.f14157k & 32) == 32) {
                                ProtoBuf$Type protoBuf$Type3 = this.f14163r;
                                protoBuf$Type3.getClass();
                                bVar6 = ProtoBuf$Type.t(protoBuf$Type3);
                            }
                            ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) cVar.g(ProtoBuf$Type.C, dVar);
                            this.f14163r = protoBuf$Type4;
                            if (bVar6 != null) {
                                bVar6.m(protoBuf$Type4);
                                this.f14163r = bVar6.l();
                            }
                            this.f14157k |= 32;
                            break;
                        case 50:
                            if (!(z11 & true)) {
                                this.f14168w = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14168w;
                            bVar = ProtoBuf$ValueParameter.f14383u;
                            hVar = cVar.g(bVar, dVar);
                            list.add(hVar);
                            break;
                        case 56:
                            this.f14157k |= 16;
                            this.f14161p = cVar.k();
                            break;
                        case 64:
                            this.f14157k |= 64;
                            this.f14164s = cVar.k();
                            break;
                        case 72:
                            this.f14157k |= 1;
                            this.f14158l = cVar.k();
                            break;
                        case 82:
                            if (!(z11 & true)) {
                                this.f14165t = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14165t;
                            bVar = ProtoBuf$Type.C;
                            hVar = cVar.g(bVar, dVar);
                            list.add(hVar);
                            break;
                        case 88:
                            if (!(z11 & true)) {
                                this.f14166u = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14166u;
                            hVar = Integer.valueOf(cVar.k());
                            list.add(hVar);
                            break;
                        case 90:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.f14166u = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.f14166u.add(Integer.valueOf(cVar.k()));
                            }
                            cVar.c(d5);
                            break;
                        case 242:
                            i10 = 128;
                            if ((this.f14157k & 128) == 128) {
                                ProtoBuf$TypeTable protoBuf$TypeTable = this.f14169x;
                                protoBuf$TypeTable.getClass();
                                bVar5 = ProtoBuf$TypeTable.j(protoBuf$TypeTable);
                            }
                            ProtoBuf$TypeTable protoBuf$TypeTable2 = (ProtoBuf$TypeTable) cVar.g(ProtoBuf$TypeTable.f14373p, dVar);
                            this.f14169x = protoBuf$TypeTable2;
                            if (bVar5 != null) {
                                bVar5.l(protoBuf$TypeTable2);
                                this.f14169x = bVar5.k();
                            }
                            this.f14157k |= i10;
                            break;
                        case 248:
                            if (!(z11 & true)) {
                                this.f14170y = new ArrayList();
                                z11 |= true;
                            }
                            list = this.f14170y;
                            hVar = Integer.valueOf(cVar.k());
                            list.add(hVar);
                            break;
                        case 250:
                            d5 = cVar.d(cVar.k());
                            if (!(z11 & true) && cVar.b() > 0) {
                                this.f14170y = new ArrayList();
                                z11 |= true;
                            }
                            while (cVar.b() > 0) {
                                this.f14170y.add(Integer.valueOf(cVar.k()));
                            }
                            cVar.c(d5);
                            break;
                        case 258:
                            if ((this.f14157k & 256) == 256) {
                                ProtoBuf$Contract protoBuf$Contract = this.f14171z;
                                protoBuf$Contract.getClass();
                                bVar4 = new ProtoBuf$Contract.b();
                                bVar4.l(protoBuf$Contract);
                            }
                            ProtoBuf$Contract protoBuf$Contract2 = (ProtoBuf$Contract) cVar.g(ProtoBuf$Contract.n, dVar);
                            this.f14171z = protoBuf$Contract2;
                            if (bVar4 != null) {
                                bVar4.l(protoBuf$Contract2);
                                this.f14171z = bVar4.k();
                            }
                            this.f14157k |= 256;
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
                } catch (InvalidProtocolBufferException e10) {
                    e10.f14537i = this;
                    throw e10;
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f14537i = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f14162q = Collections.unmodifiableList(this.f14162q);
                }
                if ((z11 & true) == r52) {
                    this.f14168w = Collections.unmodifiableList(this.f14168w);
                }
                if (z11 & true) {
                    this.f14165t = Collections.unmodifiableList(this.f14165t);
                }
                if (z11 & true) {
                    this.f14166u = Collections.unmodifiableList(this.f14166u);
                }
                if (z11 & true) {
                    this.f14170y = Collections.unmodifiableList(this.f14170y);
                }
                try {
                    j2.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f14156j = bVar2.c();
                    throw th3;
                }
                this.f14156j = bVar2.c();
                n();
                throw th2;
            }
        }
    }

    @Override // i9.f
    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        byte b5 = this.A;
        if (b5 == 1) {
            return true;
        }
        if (b5 == 0) {
            return false;
        }
        int i10 = this.f14157k;
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
        if (z11 && !this.f14160o.a()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f14162q.size(); i11++) {
            if (!this.f14162q.get(i11).a()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if ((this.f14157k & 32) == 32) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.f14163r.a()) {
            this.A = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f14165t.size(); i12++) {
            if (!this.f14165t.get(i12).a()) {
                this.A = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f14168w.size(); i13++) {
            if (!this.f14168w.get(i13).a()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if ((this.f14157k & 128) == 128) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13 && !this.f14169x.a()) {
            this.A = (byte) 0;
            return false;
        }
        if ((this.f14157k & 256) == 256) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 && !this.f14171z.a()) {
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
        if ((this.f14157k & 2) == 2) {
            i10 = CodedOutputStream.b(1, this.f14159m) + 0;
        } else {
            i10 = 0;
        }
        if ((this.f14157k & 4) == 4) {
            i10 += CodedOutputStream.b(2, this.n);
        }
        if ((this.f14157k & 8) == 8) {
            i10 += CodedOutputStream.d(3, this.f14160o);
        }
        for (int i12 = 0; i12 < this.f14162q.size(); i12++) {
            i10 += CodedOutputStream.d(4, this.f14162q.get(i12));
        }
        if ((this.f14157k & 32) == 32) {
            i10 += CodedOutputStream.d(5, this.f14163r);
        }
        for (int i13 = 0; i13 < this.f14168w.size(); i13++) {
            i10 += CodedOutputStream.d(6, this.f14168w.get(i13));
        }
        if ((this.f14157k & 16) == 16) {
            i10 += CodedOutputStream.b(7, this.f14161p);
        }
        if ((this.f14157k & 64) == 64) {
            i10 += CodedOutputStream.b(8, this.f14164s);
        }
        if ((this.f14157k & 1) == 1) {
            i10 += CodedOutputStream.b(9, this.f14158l);
        }
        for (int i14 = 0; i14 < this.f14165t.size(); i14++) {
            i10 += CodedOutputStream.d(10, this.f14165t.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f14166u.size(); i16++) {
            i15 += CodedOutputStream.c(this.f14166u.get(i16).intValue());
        }
        int i17 = i10 + i15;
        if (!this.f14166u.isEmpty()) {
            i17 = i17 + 1 + CodedOutputStream.c(i15);
        }
        this.f14167v = i15;
        if ((this.f14157k & 128) == 128) {
            i17 += CodedOutputStream.d(30, this.f14169x);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f14170y.size(); i19++) {
            i18 += CodedOutputStream.c(this.f14170y.get(i19).intValue());
        }
        int size = (this.f14170y.size() * 2) + i17 + i18;
        if ((this.f14157k & 256) == 256) {
            size += CodedOutputStream.d(32, this.f14171z);
        }
        int size2 = this.f14156j.size() + k() + size;
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
        if ((this.f14157k & 2) == 2) {
            codedOutputStream.m(1, this.f14159m);
        }
        if ((this.f14157k & 4) == 4) {
            codedOutputStream.m(2, this.n);
        }
        if ((this.f14157k & 8) == 8) {
            codedOutputStream.o(3, this.f14160o);
        }
        for (int i10 = 0; i10 < this.f14162q.size(); i10++) {
            codedOutputStream.o(4, this.f14162q.get(i10));
        }
        if ((this.f14157k & 32) == 32) {
            codedOutputStream.o(5, this.f14163r);
        }
        for (int i11 = 0; i11 < this.f14168w.size(); i11++) {
            codedOutputStream.o(6, this.f14168w.get(i11));
        }
        if ((this.f14157k & 16) == 16) {
            codedOutputStream.m(7, this.f14161p);
        }
        if ((this.f14157k & 64) == 64) {
            codedOutputStream.m(8, this.f14164s);
        }
        if ((this.f14157k & 1) == 1) {
            codedOutputStream.m(9, this.f14158l);
        }
        for (int i12 = 0; i12 < this.f14165t.size(); i12++) {
            codedOutputStream.o(10, this.f14165t.get(i12));
        }
        if (this.f14166u.size() > 0) {
            codedOutputStream.v(90);
            codedOutputStream.v(this.f14167v);
        }
        for (int i13 = 0; i13 < this.f14166u.size(); i13++) {
            codedOutputStream.n(this.f14166u.get(i13).intValue());
        }
        if ((this.f14157k & 128) == 128) {
            codedOutputStream.o(30, this.f14169x);
        }
        for (int i14 = 0; i14 < this.f14170y.size(); i14++) {
            codedOutputStream.m(31, this.f14170y.get(i14).intValue());
        }
        if ((this.f14157k & 256) == 256) {
            codedOutputStream.o(32, this.f14171z);
        }
        aVar.a(19000, codedOutputStream);
        codedOutputStream.r(this.f14156j);
    }

    public final void r() {
        this.f14158l = 6;
        this.f14159m = 6;
        this.n = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.B;
        this.f14160o = protoBuf$Type;
        this.f14161p = 0;
        this.f14162q = Collections.emptyList();
        this.f14163r = protoBuf$Type;
        this.f14164s = 0;
        this.f14165t = Collections.emptyList();
        this.f14166u = Collections.emptyList();
        this.f14168w = Collections.emptyList();
        this.f14169x = ProtoBuf$TypeTable.f14372o;
        this.f14170y = Collections.emptyList();
        this.f14171z = ProtoBuf$Contract.f14094m;
    }

    public ProtoBuf$Function(GeneratedMessageLite.b bVar) {
        super(bVar);
        this.f14167v = -1;
        this.A = (byte) -1;
        this.B = -1;
        this.f14156j = bVar.f14526i;
    }
}
