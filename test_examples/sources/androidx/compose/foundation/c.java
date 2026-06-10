package androidx.compose.foundation;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final long f1596a = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f1597b = 0;

    public static final u7.a a(g0.d dVar) {
        dVar.f(-1990508712);
        Clickable_androidKt$isComposeRootInScrollableContainer$1 clickable_androidKt$isComposeRootInScrollableContainer$1 = new Clickable_androidKt$isComposeRootInScrollableContainer$1((View) dVar.w(AndroidCompositionLocals_androidKt.f3659f));
        dVar.u();
        return clickable_androidKt$isComposeRootInScrollableContainer$1;
    }
}
