package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.SnapshotKt;
import com.noto.R;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlinx.coroutines.channels.AbstractChannel;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ViewGroup.LayoutParams f3920a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final g0.f a(AbstractComposeView abstractComposeView, g0.g gVar, ComposableLambdaImpl composableLambdaImpl) {
        AndroidComposeView androidComposeView;
        Object tag;
        v7.g.f(abstractComposeView, "<this>");
        v7.g.f(gVar, "parent");
        boolean z10 = false;
        WrappedComposition wrappedComposition = null;
        if (k0.f3853a.compareAndSet(false, true)) {
            AbstractChannel f10 = a1.b.f(-1, null, 6);
            m0.b.M0(a1.b.g(AndroidUiDispatcher.f3677u.getValue()), null, null, new GlobalSnapshotManager$ensureStarted$1(f10, null), 3);
            GlobalSnapshotManager$ensureStarted$2 globalSnapshotManager$ensureStarted$2 = new GlobalSnapshotManager$ensureStarted$2(f10);
            synchronized (SnapshotKt.c) {
                SnapshotKt.f2944h.add(globalSnapshotManager$ensureStarted$2);
            }
            SnapshotKt.a();
        }
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
                if (androidComposeView == null) {
                    Context context = abstractComposeView.getContext();
                    v7.g.e(context, "context");
                    androidComposeView = new AndroidComposeView(context);
                    abstractComposeView.addView(androidComposeView.getView(), f3920a);
                }
                if (Build.VERSION.SDK_INT >= 29 && (!w1.f3917a.a(androidComposeView).isEmpty())) {
                    z10 = true;
                }
                if (z10) {
                    androidComposeView.setTag(R.id.inspection_slot_table_set, Collections.newSetFromMap(new WeakHashMap()));
                    u7.l<n0, m7.n> lVar = InspectableValueKt.f3744a;
                    try {
                        Field declaredField = InspectableValueKt.class.getDeclaredField("b");
                        declaredField.setAccessible(true);
                        declaredField.setBoolean(null, true);
                    } catch (Exception unused) {
                        Log.w("Wrapper", "Could not access isDebugInspectorInfoEnabled. Please set explicitly.");
                    }
                }
                androidx.compose.runtime.b a10 = g0.i.a(new l1.i0(androidComposeView.getRoot()), gVar);
                tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
                if (tag instanceof WrappedComposition) {
                    wrappedComposition = (WrappedComposition) tag;
                }
                if (wrappedComposition == null) {
                    wrappedComposition = new WrappedComposition(androidComposeView, a10);
                    androidComposeView.getView().setTag(R.id.wrapped_composition_tag, wrappedComposition);
                }
                wrappedComposition.j(composableLambdaImpl);
                return wrappedComposition;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        if (Build.VERSION.SDK_INT >= 29) {
            z10 = true;
        }
        if (z10) {
        }
        androidx.compose.runtime.b a102 = g0.i.a(new l1.i0(androidComposeView.getRoot()), gVar);
        tag = androidComposeView.getView().getTag(R.id.wrapped_composition_tag);
        if (tag instanceof WrappedComposition) {
        }
        if (wrappedComposition == null) {
        }
        wrappedComposition.j(composableLambdaImpl);
        return wrappedComposition;
    }
}
