package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.m;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KVariance;
import n7.l;
import y9.f0;
import y9.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lc8/m;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class KTypeImpl$arguments$2 extends Lambda implements u7.a<List<? extends m>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KTypeImpl f13220j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ u7.a<Type> f13221k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, u7.a<? extends Type> aVar) {
        super(0);
        this.f13220j = kTypeImpl;
        this.f13221k = aVar;
    }

    @Override // u7.a
    public final List<? extends m> k0() {
        m mVar;
        KTypeImpl kTypeImpl = this.f13220j;
        List<f0> S0 = kTypeImpl.f13217a.S0();
        if (S0.isEmpty()) {
            return EmptyList.f12981i;
        }
        m7.e a10 = kotlin.a.a(LazyThreadSafetyMode.PUBLICATION, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(kTypeImpl));
        ArrayList arrayList = new ArrayList(l.Z1(S0, 10));
        int i10 = 0;
        for (Object obj : S0) {
            int i11 = i10 + 1;
            KTypeImpl$arguments$2$1$type$1 kTypeImpl$arguments$2$1$type$1 = null;
            if (i10 >= 0) {
                f0 f0Var = (f0) obj;
                if (f0Var.d()) {
                    mVar = m.c;
                } else {
                    r b5 = f0Var.b();
                    v7.g.e(b5, "typeProjection.type");
                    if (this.f13221k != null) {
                        kTypeImpl$arguments$2$1$type$1 = new KTypeImpl$arguments$2$1$type$1(kTypeImpl, i10, a10);
                    }
                    KTypeImpl kTypeImpl2 = new KTypeImpl(b5, kTypeImpl$arguments$2$1$type$1);
                    int ordinal = f0Var.a().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                mVar = new m(KVariance.OUT, kTypeImpl2);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            mVar = new m(KVariance.IN, kTypeImpl2);
                        }
                    } else {
                        mVar = new m(KVariance.INVARIANT, kTypeImpl2);
                    }
                }
                arrayList.add(mVar);
                i10 = i11;
            } else {
                a1.c.F1();
                throw null;
            }
        }
        return arrayList;
    }
}
