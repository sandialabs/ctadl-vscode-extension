package androidx.compose.ui.semantics;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm7/n;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Lm7/n;Lm7/n;)Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class SemanticsProperties$IsDialog$1 extends Lambda implements p<n, n, n> {

    /* renamed from: j  reason: collision with root package name */
    public static final SemanticsProperties$IsDialog$1 f3969j = new SemanticsProperties$IsDialog$1();

    public SemanticsProperties$IsDialog$1() {
        super(2);
    }

    @Override // u7.p
    public final n R(n nVar, n nVar2) {
        n nVar3 = nVar;
        g.f(nVar2, "<anonymous parameter 1>");
        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
    }
}
