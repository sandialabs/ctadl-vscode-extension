package androidx.core.view;

import android.view.ViewParent;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import u7.l;
import v7.g;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class ViewKt$ancestors$1 extends FunctionReferenceImpl implements l<ViewParent, ViewParent> {

    /* renamed from: r  reason: collision with root package name */
    public static final ViewKt$ancestors$1 f4634r = new ViewKt$ancestors$1();

    public ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // u7.l
    public final ViewParent U(ViewParent viewParent) {
        ViewParent viewParent2 = viewParent;
        g.f(viewParent2, "p0");
        return viewParent2.getParent();
    }
}
