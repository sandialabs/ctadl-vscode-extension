package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15047a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15048b;
    public final ba.l c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f15049d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f15050e;

    /* renamed from: f  reason: collision with root package name */
    public int f15051f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayDeque<ba.g> f15052g;

    /* renamed from: h  reason: collision with root package name */
    public fa.d f15053h;

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0168a implements a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f15054a;

            @Override // kotlin.reflect.jvm.internal.impl.types.m.a
            public final void a(u7.a<Boolean> aVar) {
                if (this.f15054a) {
                    return;
                }
                this.f15054a = ((Boolean) ((AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.AnonymousClass1) aVar).k0()).booleanValue();
            }
        }

        void a(u7.a<Boolean> aVar);
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static abstract class a extends b {
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0169b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0169b f15055a = new C0169b();

            @Override // kotlin.reflect.jvm.internal.impl.types.m.b
            public final ba.g a(m mVar, ba.f fVar) {
                v7.g.f(mVar, "state");
                v7.g.f(fVar, "type");
                return mVar.c.I(fVar);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f15056a = new c();

            @Override // kotlin.reflect.jvm.internal.impl.types.m.b
            public final ba.g a(m mVar, ba.f fVar) {
                v7.g.f(mVar, "state");
                v7.g.f(fVar, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f15057a = new d();

            @Override // kotlin.reflect.jvm.internal.impl.types.m.b
            public final ba.g a(m mVar, ba.f fVar) {
                v7.g.f(mVar, "state");
                v7.g.f(fVar, "type");
                return mVar.c.l0(fVar);
            }
        }

        public abstract ba.g a(m mVar, ba.f fVar);
    }

    public m(boolean z10, boolean z11, ba.l lVar, androidx.datastore.preferences.protobuf.k kVar, androidx.datastore.preferences.protobuf.k kVar2) {
        v7.g.f(lVar, "typeSystemContext");
        v7.g.f(kVar, "kotlinTypePreparator");
        v7.g.f(kVar2, "kotlinTypeRefiner");
        this.f15047a = z10;
        this.f15048b = z11;
        this.c = lVar;
        this.f15049d = kVar;
        this.f15050e = kVar2;
    }

    public final void a() {
        ArrayDeque<ba.g> arrayDeque = this.f15052g;
        v7.g.c(arrayDeque);
        arrayDeque.clear();
        fa.d dVar = this.f15053h;
        v7.g.c(dVar);
        dVar.clear();
    }

    public boolean b(ba.f fVar, ba.f fVar2) {
        v7.g.f(fVar, "subType");
        v7.g.f(fVar2, "superType");
        return true;
    }

    public final void c() {
        if (this.f15052g == null) {
            this.f15052g = new ArrayDeque<>(4);
        }
        if (this.f15053h == null) {
            this.f15053h = new fa.d();
        }
    }

    public final ba.f d(ba.f fVar) {
        v7.g.f(fVar, "type");
        return this.f15049d.G0(fVar);
    }
}
