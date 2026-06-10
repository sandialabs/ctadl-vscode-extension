package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes.dex */
public interface h extends i9.f {

    /* loaded from: classes.dex */
    public interface a extends Cloneable, i9.f {
        h build();

        a g(c cVar, d dVar);
    }

    int b();

    a c();

    a d();

    void f(CodedOutputStream codedOutputStream);
}
