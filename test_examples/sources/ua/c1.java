package ua;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.b;

/* loaded from: classes.dex */
public final class c1 implements sa.e {

    /* renamed from: a  reason: collision with root package name */
    public static final c1 f17955a = new c1();

    /* renamed from: b  reason: collision with root package name */
    public static final b.d f17956b = b.d.f15612a;
    public static final String c = "kotlin.Nothing";

    @Override // sa.e
    public final int a(String str) {
        v7.g.f(str, "name");
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // sa.e
    public final String b() {
        return c;
    }

    @Override // sa.e
    public final int c() {
        return 0;
    }

    @Override // sa.e
    public final String d(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // sa.e
    public final boolean f() {
        return false;
    }

    @Override // sa.e
    public final List<Annotation> g(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // sa.e
    public final List<Annotation> getAnnotations() {
        return EmptyList.f12981i;
    }

    @Override // sa.e
    public final sa.h h() {
        return f17956b;
    }

    public final int hashCode() {
        return (f17956b.hashCode() * 31) + c.hashCode();
    }

    @Override // sa.e
    public final boolean i() {
        return false;
    }

    @Override // sa.e
    public final sa.e j(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // sa.e
    public final boolean k(int i10) {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public final String toString() {
        return "NothingSerialDescriptor";
    }
}
