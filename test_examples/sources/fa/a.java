package fa;

import fa.b;
import u7.l;

/* loaded from: classes.dex */
public final class a extends b.a<Object, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f11008a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean[] f11009b;

    public a(l lVar, boolean[] zArr) {
        this.f11008a = lVar;
        this.f11009b = zArr;
    }

    @Override // fa.b.c
    public final Object a() {
        return Boolean.valueOf(this.f11009b[0]);
    }

    @Override // fa.b.c
    public final boolean c(Object obj) {
        boolean booleanValue = ((Boolean) this.f11008a.U(obj)).booleanValue();
        boolean[] zArr = this.f11009b;
        if (booleanValue) {
            zArr[0] = true;
        }
        return !zArr[0];
    }
}
