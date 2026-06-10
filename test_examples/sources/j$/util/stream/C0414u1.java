package j$.util.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.u1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0414u1 extends AbstractC0418v1 {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f12552d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0414u1(E0 e02, Object obj) {
        this(e02, obj, 0);
        this.c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0414u1(F0 f02, Object obj, int i10) {
        super(f02);
        this.c = i10;
        this.f12552d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0414u1(F0 f02, Object[] objArr) {
        this(f02, objArr, 1);
        this.c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0414u1(C0414u1 c0414u1, E0 e02, int i10) {
        super(c0414u1, e02, i10);
        this.c = 0;
        this.f12552d = c0414u1.f12552d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0414u1(C0414u1 c0414u1, F0 f02, int i10) {
        super(c0414u1, f02, i10);
        this.c = 1;
        this.f12552d = (Object[]) c0414u1.f12552d;
    }

    @Override // j$.util.stream.AbstractC0418v1
    final void a() {
        switch (this.c) {
            case 0:
                ((E0) this.f12558a).c(this.f12559b, this.f12552d);
                return;
            default:
                this.f12558a.f((Object[]) this.f12552d, this.f12559b);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0418v1
    final C0414u1 b(int i10, int i11) {
        switch (this.c) {
            case 0:
                return new C0414u1(this, ((E0) this.f12558a).a(i10), i11);
            default:
                return new C0414u1(this, this.f12558a.a(i10), i11);
        }
    }
}
