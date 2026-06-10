package kotlin.reflect.jvm.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KPackageImpl$Data$multifileFacade$2 extends Lambda implements u7.a<Class<?>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ KPackageImpl.Data f13178j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ KPackageImpl f13179k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$multifileFacade$2(KPackageImpl.Data data, KPackageImpl kPackageImpl) {
        super(0);
        this.f13178j = data;
        this.f13179k = kPackageImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // u7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class<?> k0() {
        String str;
        KotlinClassHeader kotlinClassHeader;
        boolean z10;
        q8.e a10 = KPackageImpl.Data.a(this.f13178j);
        boolean z11 = true;
        if (a10 != null && (kotlinClassHeader = a10.f16951b) != null) {
            if (kotlinClassHeader.f13953a == KotlinClassHeader.Kind.f13964p) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                str = kotlinClassHeader.f13957f;
                if (str != null) {
                    return null;
                }
                if (str.length() <= 0) {
                    z11 = false;
                }
                if (!z11) {
                    return null;
                }
                return this.f13179k.f13168j.getClassLoader().loadClass(ha.i.V0(str, '/', '.'));
            }
        }
        str = null;
        if (str != null) {
        }
    }
}
