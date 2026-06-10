package kotlin.collections;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArraysKt___ArraysKt$withIndex$1 extends Lambda implements u7.a<Iterator<Object>> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object[] f12979j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArraysKt___ArraysKt$withIndex$1(Object[] objArr) {
        super(0);
        this.f12979j = objArr;
    }

    @Override // u7.a
    public final Iterator<Object> k0() {
        return m0.b.K0(this.f12979j);
    }
}
