package androidx.compose.ui.platform;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class k implements f0 {

    /* renamed from: a  reason: collision with root package name */
    public final ClipboardManager f3852a;

    public k(Context context) {
        Object systemService = context.getSystemService("clipboard");
        v7.g.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f3852a = (ClipboardManager) systemService;
    }
}
