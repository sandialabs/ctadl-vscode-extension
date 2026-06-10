package ja;

/* loaded from: classes.dex */
public class w0 extends y0 {

    /* renamed from: j  reason: collision with root package name */
    public final boolean f12808j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var) {
        super(true);
        n nVar;
        boolean z10 = true;
        l0(u0Var);
        m h02 = h0();
        if (h02 instanceof n) {
            nVar = (n) h02;
        } else {
            nVar = null;
        }
        if (nVar != null) {
            while (true) {
                y0 N = nVar.N();
                if (!N.e0()) {
                    m h03 = N.h0();
                    if (h03 instanceof n) {
                        nVar = (n) h03;
                    } else {
                        nVar = null;
                    }
                    if (nVar == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f12808j = z10;
        }
        z10 = false;
        this.f12808j = z10;
    }

    @Override // ja.y0
    public final boolean e0() {
        return this.f12808j;
    }

    @Override // ja.y0
    public final boolean f0() {
        return true;
    }
}
