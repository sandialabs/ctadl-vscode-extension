package va;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import ua.q0;
import ua.r0;
import ua.s1;

/* loaded from: classes.dex */
public final class o implements qa.b<JsonObject> {

    /* renamed from: a  reason: collision with root package name */
    public static final o f18229a = new o();

    /* renamed from: b  reason: collision with root package name */
    public static final a f18230b = a.f18231b;

    /* loaded from: classes.dex */
    public static final class a implements sa.e {

        /* renamed from: b  reason: collision with root package name */
        public static final a f18231b = new a();
        public static final String c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q0 f18232a;

        public a() {
            s1 s1Var = s1.f18010a;
            JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f15663a;
            this.f18232a = new q0(s1.f18010a.a(), JsonElementSerializer.f15663a.a());
        }

        @Override // sa.e
        public final int a(String str) {
            v7.g.f(str, "name");
            return this.f18232a.a(str);
        }

        @Override // sa.e
        public final String b() {
            return c;
        }

        @Override // sa.e
        public final int c() {
            return this.f18232a.f18035d;
        }

        @Override // sa.e
        public final String d(int i10) {
            this.f18232a.getClass();
            return String.valueOf(i10);
        }

        @Override // sa.e
        public final boolean f() {
            this.f18232a.getClass();
            return false;
        }

        @Override // sa.e
        public final List<Annotation> g(int i10) {
            return this.f18232a.g(i10);
        }

        @Override // sa.e
        public final List<Annotation> getAnnotations() {
            this.f18232a.getClass();
            return EmptyList.f12981i;
        }

        @Override // sa.e
        public final sa.h h() {
            this.f18232a.getClass();
            return b.c.f15611a;
        }

        @Override // sa.e
        public final boolean i() {
            this.f18232a.getClass();
            return false;
        }

        @Override // sa.e
        public final sa.e j(int i10) {
            return this.f18232a.j(i10);
        }

        @Override // sa.e
        public final boolean k(int i10) {
            this.f18232a.k(i10);
            return false;
        }
    }

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18230b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        JsonObject jsonObject = (JsonObject) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(jsonObject, "value");
        ma.i.j(dVar);
        s1 s1Var = s1.f18010a;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f15663a;
        new r0(s1.f18010a, JsonElementSerializer.f15663a).b(dVar, jsonObject);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        ma.i.o(cVar);
        s1 s1Var = s1.f18010a;
        JsonElementSerializer jsonElementSerializer = JsonElementSerializer.f15663a;
        return new JsonObject(new r0(s1.f18010a, JsonElementSerializer.f15663a).e(cVar));
    }
}
