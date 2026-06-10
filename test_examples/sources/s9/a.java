package s9;

import y9.r;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final r f17502a;

    /* renamed from: b  reason: collision with root package name */
    public final g f17503b;

    public a(r rVar, g gVar) {
        if (rVar == null) {
            d(0);
            throw null;
        }
        this.f17502a = rVar;
        if (gVar == null) {
            gVar = this;
        }
        this.f17503b = gVar;
    }

    public static /* synthetic */ void d(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // s9.g
    public final r b() {
        r rVar = this.f17502a;
        if (rVar != null) {
            return rVar;
        }
        d(1);
        throw null;
    }
}
