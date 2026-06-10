package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.noto.R;
import java.util.LinkedHashMap;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.StartedWhileSubscribed;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f3909a = new LinkedHashMap();

    public static final kotlinx.coroutines.flow.u a(Context context) {
        kotlinx.coroutines.flow.u uVar;
        LinkedHashMap linkedHashMap = f3909a;
        synchronized (linkedHashMap) {
            Object obj = linkedHashMap.get(context);
            if (obj == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                AbstractChannel f10 = a1.b.f(-1, null, 6);
                kotlinx.coroutines.flow.n nVar = new kotlinx.coroutines.flow.n(new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(contentResolver, uriFor, new t1(f10, v2.g.a(Looper.getMainLooper())), f10, context, null));
                ja.l1 l1Var = new ja.l1(null);
                kotlinx.coroutines.scheduling.b bVar = ja.f0.f12766a;
                obj = a1.b.C0(nVar, new kotlinx.coroutines.internal.e(l1Var.m(kotlinx.coroutines.internal.l.f15491a)), new StartedWhileSubscribed(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                linkedHashMap.put(context, obj);
            }
            uVar = (kotlinx.coroutines.flow.u) obj;
        }
        return uVar;
    }

    public static final g0.g b(View view) {
        v7.g.f(view, "<this>");
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof g0.g) {
            return (g0.g) tag;
        }
        return null;
    }
}
