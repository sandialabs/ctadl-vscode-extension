package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import sa.e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lsa/e;", "invoke", "()Lsa/e;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EnumSerializer$descriptor$2 extends Lambda implements u7.a<e> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ EnumSerializer<T> f15624j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f15625k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumSerializer$descriptor$2(EnumSerializer<T> enumSerializer, String str) {
        super(0);
        this.f15624j = enumSerializer;
        this.f15625k = str;
    }

    @Override // u7.a
    public final e k0() {
        EnumSerializer<T> enumSerializer = this.f15624j;
        enumSerializer.getClass();
        Enum[] enumArr = enumSerializer.f15622a;
        EnumDescriptor enumDescriptor = new EnumDescriptor(this.f15625k, enumArr.length);
        for (Enum r52 : enumArr) {
            enumDescriptor.l(r52.name(), false);
        }
        return enumDescriptor;
    }
}
