package c8;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KTypeImpl;

/* loaded from: classes.dex */
public final class m {
    public static final m c = new m(null, null);

    /* renamed from: a  reason: collision with root package name */
    public final KVariance f6561a;

    /* renamed from: b  reason: collision with root package name */
    public final k f6562b;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6563a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6563a = iArr;
        }
    }

    public m(KVariance kVariance, KTypeImpl kTypeImpl) {
        String str;
        this.f6561a = kVariance;
        this.f6562b = kTypeImpl;
        if ((kVariance == null) == (kTypeImpl == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f6561a == mVar.f6561a && v7.g.a(this.f6562b, mVar.f6562b);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        KVariance kVariance = this.f6561a;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        k kVar = this.f6562b;
        if (kVar != null) {
            i10 = kVar.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb;
        KVariance kVariance = this.f6561a;
        int i10 = kVariance == null ? -1 : a.f6563a[kVariance.ordinal()];
        if (i10 != -1) {
            k kVar = this.f6562b;
            if (i10 != 1) {
                if (i10 == 2) {
                    sb = new StringBuilder("in ");
                } else if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    sb = new StringBuilder("out ");
                }
                sb.append(kVar);
                return sb.toString();
            }
            return String.valueOf(kVar);
        }
        return "*";
    }
}
