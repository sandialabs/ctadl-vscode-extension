package androidx.compose.ui.input.nestedscroll;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lja/x;", "invoke", "()Lja/x;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class NestedScrollDispatcher$calculateNestedScrollScope$1 extends Lambda implements a<x> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NestedScrollDispatcher f3253j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$calculateNestedScrollScope$1(NestedScrollDispatcher nestedScrollDispatcher) {
        super(0);
        this.f3253j = nestedScrollDispatcher;
    }

    @Override // u7.a
    public final x k0() {
        return this.f3253j.f3252b;
    }
}
