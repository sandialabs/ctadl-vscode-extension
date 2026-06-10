package kotlinx.serialization.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import c8.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import ua.l;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ClassValueCache$get$$inlined$getOrSet$1 extends Lambda implements u7.a<T> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ClassValueCache f15615j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ b f15616k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassValueCache$get$$inlined$getOrSet$1(ClassValueCache classValueCache, b bVar) {
        super(0);
        this.f15615j = classValueCache;
        this.f15616k = bVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, ua.l] */
    @Override // u7.a
    public final T k0() {
        return new l((qa.b) this.f15615j.f15613a.U(this.f15616k));
    }
}
