package androidx.compose.ui.semantics;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.c;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lm7/c;", "", "T", "Lo1/a;", "parentValue", "childValue", "invoke", "(Lo1/a;Lo1/a;)Lo1/a;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends Lambda implements p<o1.a<c<? extends Boolean>>, o1.a<c<? extends Boolean>>, o1.a<c<? extends Boolean>>> {

    /* renamed from: j  reason: collision with root package name */
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 f3977j = new SemanticsPropertiesKt$ActionPropertyKey$1();

    public SemanticsPropertiesKt$ActionPropertyKey$1() {
        super(2);
    }

    @Override // u7.p
    public final o1.a<c<? extends Boolean>> R(o1.a<c<? extends Boolean>> aVar, o1.a<c<? extends Boolean>> aVar2) {
        String str;
        c<? extends Boolean> cVar;
        o1.a<c<? extends Boolean>> aVar3 = aVar;
        o1.a<c<? extends Boolean>> aVar4 = aVar2;
        g.f(aVar4, "childValue");
        if (aVar3 == null || (str = aVar3.f16184a) == null) {
            str = aVar4.f16184a;
        }
        if (aVar3 == null || (cVar = aVar3.f16185b) == null) {
            cVar = aVar4.f16185b;
        }
        return new o1.a<>(str, cVar);
    }
}
