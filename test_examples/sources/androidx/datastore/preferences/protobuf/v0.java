package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.c0;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface v0 {
    @Deprecated
    <T> void A(List<T> list, w0<T> w0Var, m mVar);

    boolean B();

    int C();

    void D(List<ByteString> list);

    void E(List<Double> list);

    <T> void F(List<T> list, w0<T> w0Var, m mVar);

    void G(List<Long> list);

    void H(List<Long> list);

    long I();

    String J();

    void K(List<Long> list);

    void L(List<Integer> list);

    void M(List<Integer> list);

    @Deprecated
    <T> T N(w0<T> w0Var, m mVar);

    <T> T a(w0<T> w0Var, m mVar);

    <K, V> void b(Map<K, V> map, c0.a<K, V> aVar, m mVar);

    void c(List<Integer> list);

    int d();

    int e();

    long f();

    void g(List<Integer> list);

    long h();

    void i(List<Integer> list);

    int j();

    void k(List<Long> list);

    long l();

    void m(List<Integer> list);

    void n(List<Boolean> list);

    String o();

    int p();

    boolean q();

    int r();

    double readDouble();

    float readFloat();

    void s(List<String> list);

    long t();

    void u(List<Long> list);

    void v(List<String> list);

    ByteString w();

    void x(List<Float> list);

    int y();

    int z();
}
