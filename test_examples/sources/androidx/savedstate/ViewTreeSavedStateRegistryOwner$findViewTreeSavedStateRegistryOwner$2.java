package androidx.savedstate;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import b4.d;
import com.noto.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.l;
import v7.g;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lb4/d;", "invoke", "(Landroid/view/View;)Lb4/d;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 extends Lambda implements l<View, d> {

    /* renamed from: j  reason: collision with root package name */
    public static final ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2 f6064j = new ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2();

    public ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2() {
        super(1);
    }

    @Override // u7.l
    public final d U(View view) {
        View view2 = view;
        g.f(view2, "view");
        Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
        if (tag instanceof d) {
            return (d) tag;
        }
        return null;
    }
}
