package androidx.compose.ui.layout;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import u7.p;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements p<Integer, Integer, Integer> {

    /* renamed from: r  reason: collision with root package name */
    public static final AlignmentLineKt$FirstBaseline$1 f3314r = new AlignmentLineKt$FirstBaseline$1();

    public AlignmentLineKt$FirstBaseline$1() {
        super(2, x7.a.class, "min", "min(II)I", 1);
    }

    @Override // u7.p
    public final Integer R(Integer num, Integer num2) {
        return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
    }
}
