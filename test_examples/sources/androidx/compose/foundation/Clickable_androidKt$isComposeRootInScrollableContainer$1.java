package androidx.compose.foundation;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends Lambda implements u7.a<Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f1467j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.f1467j = view;
    }

    @Override // u7.a
    public final Boolean k0() {
        boolean z10;
        boolean shouldDelayChildPressedState;
        ViewGroup viewGroup = this.f1467j;
        do {
            ViewParent parent = viewGroup.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup2 = (ViewGroup) parent;
                shouldDelayChildPressedState = viewGroup2.shouldDelayChildPressedState();
                viewGroup = viewGroup2;
            } else {
                z10 = false;
                break;
            }
        } while (!shouldDelayChildPressedState);
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
