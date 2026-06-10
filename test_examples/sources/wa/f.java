package wa;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final p f18506a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18507b;

    public f(p pVar) {
        v7.g.f(pVar, "writer");
        this.f18506a = pVar;
        this.f18507b = true;
    }

    public void a() {
        this.f18507b = true;
    }

    public void b() {
        this.f18507b = false;
    }

    public void c(byte b5) {
        this.f18506a.writeLong(b5);
    }

    public final void d(char c) {
        this.f18506a.a(c);
    }

    public void e(int i10) {
        this.f18506a.writeLong(i10);
    }

    public void f(long j2) {
        this.f18506a.writeLong(j2);
    }

    public final void g(String str) {
        v7.g.f(str, "v");
        this.f18506a.c(str);
    }

    public void h(short s10) {
        this.f18506a.writeLong(s10);
    }

    public void i(String str) {
        v7.g.f(str, "value");
        this.f18506a.b(str);
    }

    public void j() {
    }

    public void k() {
    }
}
