package kotlin.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.k;
import c8.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc8/m;", "it", "", "invoke", "(Lc8/m;)Ljava/lang/CharSequence;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TypeReference$asString$args$1 extends Lambda implements l<m, CharSequence> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ TypeReference f13064j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypeReference$asString$args$1(TypeReference typeReference) {
        super(1);
        this.f13064j = typeReference;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence U(m mVar) {
        TypeReference typeReference;
        String valueOf;
        int ordinal;
        String str;
        String d5;
        m mVar2 = mVar;
        g.f(mVar2, "it");
        this.f13064j.getClass();
        KVariance kVariance = mVar2.f6561a;
        if (kVariance == null) {
            return "*";
        }
        k kVar = mVar2.f6562b;
        if (kVar instanceof TypeReference) {
            typeReference = (TypeReference) kVar;
        } else {
            typeReference = null;
        }
        if (typeReference != null && (d5 = typeReference.d(true)) != null) {
            valueOf = d5;
            ordinal = kVariance.ordinal();
            if (ordinal == 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        str = "out ";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str = "in ";
                }
                return str.concat(valueOf);
            }
            return valueOf;
        }
        valueOf = String.valueOf(kVar);
        ordinal = kVariance.ordinal();
        if (ordinal == 0) {
        }
    }
}
