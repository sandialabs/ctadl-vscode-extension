package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import b9.n;
import b9.q;
import b9.v;
import h9.e;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import v7.g;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0154a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0154a f13822a = new C0154a();

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        public final Set<e> a() {
            return EmptySet.f12983i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        public final v b(e eVar) {
            g.f(eVar, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        public final Collection c(e eVar) {
            g.f(eVar, "name");
            return EmptyList.f12981i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        public final Set<e> d() {
            return EmptySet.f12983i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        public final n e(e eVar) {
            g.f(eVar, "name");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.a
        public final Set<e> f() {
            return EmptySet.f12983i;
        }
    }

    Set<e> a();

    v b(e eVar);

    Collection<q> c(e eVar);

    Set<e> d();

    n e(e eVar);

    Set<e> f();
}
