package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt$buildSerialDescriptor$1;
import kotlinx.serialization.descriptors.b;
import sa.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lsa/e;", "invoke", "()[Lsa/e;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EnumDescriptor$elementDescriptors$2 extends Lambda implements u7.a<e[]> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f15619j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f15620k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ EnumDescriptor f15621l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor$elementDescriptors$2(int i10, String str, EnumDescriptor enumDescriptor) {
        super(0);
        this.f15619j = i10;
        this.f15620k = str;
        this.f15621l = enumDescriptor;
    }

    @Override // u7.a
    public final e[] k0() {
        SerialDescriptorImpl c;
        int i10 = this.f15619j;
        e[] eVarArr = new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            c = kotlinx.serialization.descriptors.a.c(this.f15620k + '.' + this.f15621l.f15638e[i11], b.d.f15612a, new e[0], SerialDescriptorsKt$buildSerialDescriptor$1.f15608j);
            eVarArr[i11] = c;
        }
        return eVarArr;
    }
}
