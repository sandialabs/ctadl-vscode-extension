package androidx.compose.ui.semantics;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertyKey$1 extends Lambda implements p<Object, Object, Object> {

    /* renamed from: j  reason: collision with root package name */
    public static final SemanticsPropertyKey$1 f3978j = new SemanticsPropertyKey$1();

    public SemanticsPropertyKey$1() {
        super(2);
    }

    @Override // u7.p
    public final Object R(Object obj, Object obj2) {
        return obj == null ? obj2 : obj;
    }
}
