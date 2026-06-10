package androidx.compose.ui.input.rotary;

import androidx.datastore.preferences.PreferencesProto$Value;
import d1.b;
import i1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld1/b;", "e", "", "invoke", "(Ld1/b;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
final class RotaryInputModifierKt$focusAwareCallback$1 extends Lambda implements l<b, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ l<a, Boolean> f3311j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputModifierKt$focusAwareCallback$1(l<? super a, Boolean> lVar) {
        super(1);
        this.f3311j = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u7.l
    public final Boolean U(b bVar) {
        b bVar2 = bVar;
        g.f(bVar2, "e");
        if (bVar2 instanceof a) {
            return (Boolean) this.f3311j.U(bVar2);
        }
        throw new IllegalStateException("FocusAwareEvent is dispatched to the wrong FocusAwareParent.".toString());
    }
}
