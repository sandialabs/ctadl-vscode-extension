package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import f9.g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import l8.d0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final f9.c f14895a;

    /* renamed from: b  reason: collision with root package name */
    public final g f14896b;
    public final d0 c;

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: d  reason: collision with root package name */
        public final ProtoBuf$Class f14897d;

        /* renamed from: e  reason: collision with root package name */
        public final a f14898e;

        /* renamed from: f  reason: collision with root package name */
        public final h9.b f14899f;

        /* renamed from: g  reason: collision with root package name */
        public final ProtoBuf$Class.Kind f14900g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f14901h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ProtoBuf$Class protoBuf$Class, f9.c cVar, g gVar, d0 d0Var, a aVar) {
            super(cVar, gVar, d0Var);
            v7.g.f(protoBuf$Class, "classProto");
            v7.g.f(cVar, "nameResolver");
            v7.g.f(gVar, "typeTable");
            this.f14897d = protoBuf$Class;
            this.f14898e = aVar;
            this.f14899f = m0.b.j0(cVar, protoBuf$Class.f14050m);
            ProtoBuf$Class.Kind kind = (ProtoBuf$Class.Kind) f9.b.f10981f.c(protoBuf$Class.f14049l);
            this.f14900g = kind == null ? ProtoBuf$Class.Kind.f14063j : kind;
            this.f14901h = a4.b.v(f9.b.f10982g, protoBuf$Class.f14049l, "IS_INNER.get(classProto.flags)");
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
        public final h9.c a() {
            h9.c b5 = this.f14899f.b();
            v7.g.e(b5, "classId.asSingleFqName()");
            return b5;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: d  reason: collision with root package name */
        public final h9.c f14902d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h9.c cVar, f9.c cVar2, g gVar, w9.d dVar) {
            super(cVar2, gVar, dVar);
            v7.g.f(cVar, "fqName");
            v7.g.f(cVar2, "nameResolver");
            v7.g.f(gVar, "typeTable");
            this.f14902d = cVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.f
        public final h9.c a() {
            return this.f14902d;
        }
    }

    public f(f9.c cVar, g gVar, d0 d0Var) {
        this.f14895a = cVar;
        this.f14896b = gVar;
        this.c = d0Var;
    }

    public abstract h9.c a();

    public final String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
