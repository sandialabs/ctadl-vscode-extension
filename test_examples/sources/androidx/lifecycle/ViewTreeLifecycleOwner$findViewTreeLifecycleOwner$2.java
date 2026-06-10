package androidx.lifecycle;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "viewParent", "Landroidx/lifecycle/q;", "invoke", "(Landroid/view/View;)Landroidx/lifecycle/q;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 extends Lambda implements u7.l<View, q> {

    /* renamed from: j  reason: collision with root package name */
    public static final ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2 f5362j = new ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2();

    public ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2() {
        super(1);
    }

    @Override // u7.l
    public final q U(View view) {
        View view2 = view;
        v7.g.f(view2, "viewParent");
        Object tag = view2.getTag(R.id.view_tree_lifecycle_owner);
        if (tag instanceof q) {
            return (q) tag;
        }
        return null;
    }
}
