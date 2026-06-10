package va;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes.dex */
public final class b implements qa.b<kotlinx.serialization.json.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f18193a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f18194b = a.f18195b;

    /* loaded from: classes.dex */
    public static final class a implements sa.e {

        /* renamed from: b  reason: collision with root package name */
        public static final a f18195b = new a();
        public static final String c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ua.d f18196a = new ua.d(JsonElementSerializer.f15663a.a());

        @Override // sa.e
        public final int a(String str) {
            v7.g.f(str, "name");
            return this.f18196a.a(str);
        }

        @Override // sa.e
        public final String b() {
            return c;
        }

        @Override // sa.e
        public final int c() {
            return this.f18196a.f18016b;
        }

        @Override // sa.e
        public final String d(int i10) {
            this.f18196a.getClass();
            return String.valueOf(i10);
        }

        @Override // sa.e
        public final boolean f() {
            this.f18196a.getClass();
            return false;
        }

        @Override // sa.e
        public final List<Annotation> g(int i10) {
            return this.f18196a.g(i10);
        }

        @Override // sa.e
        public final List<Annotation> getAnnotations() {
            this.f18196a.getClass();
            return EmptyList.f12981i;
        }

        @Override // sa.e
        public final sa.h h() {
            this.f18196a.getClass();
            return b.C0175b.f15610a;
        }

        @Override // sa.e
        public final boolean i() {
            this.f18196a.getClass();
            return false;
        }

        @Override // sa.e
        public final sa.e j(int i10) {
            return this.f18196a.j(i10);
        }

        @Override // sa.e
        public final boolean k(int i10) {
            this.f18196a.k(i10);
            return false;
        }
    }

    @Override // qa.b, qa.e, qa.a
    public final sa.e a() {
        return f18194b;
    }

    @Override // qa.e
    public final void b(ta.d dVar, Object obj) {
        kotlinx.serialization.json.a aVar = (kotlinx.serialization.json.a) obj;
        v7.g.f(dVar, "encoder");
        v7.g.f(aVar, "value");
        ma.i.j(dVar);
        new ua.e(JsonElementSerializer.f15663a).b(dVar, aVar);
    }

    @Override // qa.a
    public final Object e(ta.c cVar) {
        v7.g.f(cVar, "decoder");
        ma.i.o(cVar);
        return new kotlinx.serialization.json.a((List) new ua.e(JsonElementSerializer.f15663a).e(cVar));
    }
}
