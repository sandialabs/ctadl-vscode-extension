package androidx.compose.ui.focus;

import androidx.datastore.preferences.PreferencesProto$Value;
import j1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lj1/b$a;", "", "invoke", "(Lj1/b$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt$generateAndSearchChildren$1 extends Lambda implements l<b.a, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FocusModifier f3067j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ FocusModifier f3068k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f3069l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l<FocusModifier, Boolean> f3070m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneDimensionalFocusSearchKt$generateAndSearchChildren$1(FocusModifier focusModifier, FocusModifier focusModifier2, int i10, l<? super FocusModifier, Boolean> lVar) {
        super(1);
        this.f3067j = focusModifier;
        this.f3068k = focusModifier2;
        this.f3069l = i10;
        this.f3070m = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[ORIG_RETURN, RETURN] */
    @Override // u7.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean U(b.a aVar) {
        boolean z10;
        b.a aVar2 = aVar;
        g.f(aVar2, "$this$searchBeyondBounds");
        Boolean valueOf = Boolean.valueOf(OneDimensionalFocusSearchKt.e(this.f3067j, this.f3068k, this.f3069l, this.f3070m));
        if (!valueOf.booleanValue() && aVar2.a()) {
            z10 = false;
            if (z10) {
                return null;
            }
            return valueOf;
        }
        z10 = true;
        if (z10) {
        }
    }
}
