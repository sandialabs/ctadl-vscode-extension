package va;

import kotlinx.serialization.json.internal.WriteMode;
import wa.r;
import wa.u;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0233a f18190d = new C0233a();

    /* renamed from: a  reason: collision with root package name */
    public final e f18191a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f18192b;
    public final kotlinx.serialization.json.internal.a c = new kotlinx.serialization.json.internal.a();

    /* renamed from: va.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0233a extends a {
        public C0233a() {
            super(new e(false, false, false, false, false, true, "    ", false, false, "type", false, true), xa.c.f18773a);
        }
    }

    public a(e eVar, androidx.datastore.preferences.protobuf.k kVar) {
        this.f18191a = eVar;
        this.f18192b = kVar;
    }

    public final Object a(qa.b bVar, String str) {
        v7.g.f(bVar, "deserializer");
        v7.g.f(str, "string");
        u uVar = new u(str);
        Object J = new r(this, WriteMode.OBJ, uVar, bVar.a(), null).J(bVar);
        if (uVar.g() == 10) {
            return J;
        }
        wa.a.p(uVar, "Expected EOF after parsing, but had " + uVar.f18540e.charAt(uVar.f18498a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(qa.b bVar, t6.f fVar) {
        v7.g.f(bVar, "serializer");
        wa.m mVar = new wa.m();
        try {
            wa.l.a(this, mVar, bVar, fVar);
            return mVar.toString();
        } finally {
            mVar.e();
        }
    }
}
