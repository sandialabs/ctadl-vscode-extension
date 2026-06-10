package f7;

import a3.d1;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.core.graphics.drawable.IconCompat;
import com.noto.R;
import com.noto.app.AppActivity;
import com.noto.app.domain.model.Icon;
import com.noto.app.util.ModelUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f {
    public static final void a(Context context, Window window) {
        d1.e aVar;
        d1.e eVar;
        boolean z10;
        v7.g.f(context, "<this>");
        View rootView = window.getDecorView().getRootView();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            eVar = new d1.d(window);
        } else {
            if (i10 >= 26) {
                aVar = new d1.c(window, rootView);
            } else if (i10 >= 23) {
                aVar = new d1.b(window, rootView);
            } else {
                aVar = new d1.a(window, rootView);
            }
            eVar = aVar;
        }
        int i11 = context.getResources().getConfiguration().uiMode & 48;
        if (i11 != 16) {
            if (i11 == 32) {
                z10 = false;
            } else {
                return;
            }
        } else {
            z10 = true;
        }
        eVar.d(z10);
        eVar.c(z10);
    }

    public static final void b(Context context, Window window, boolean z10) {
        int a10;
        v7.g.f(context, "<this>");
        if (Build.VERSION.SDK_INT < 23) {
            window.setStatusBarColor(q.b(context, 17170444));
            a10 = q.b(context, 17170444);
        } else if (!z10) {
            return;
        } else {
            window.setStatusBarColor(q.a(context, R.attr.notoBackgroundColor));
            a10 = q.a(context, R.attr.notoBackgroundColor);
        }
        window.setNavigationBarColor(a10);
    }

    public static final o2.b c(Context context, t6.a aVar) {
        Drawable mutate;
        v7.g.f(aVar, "folder");
        Intent intent = new Intent("com.noto.intent.action.CREATE_NOTE", (Uri) null);
        long j2 = aVar.f17592a;
        intent.putExtra("folder_id", j2);
        intent.setComponent(d(context));
        int b5 = q.b(context, q.j(aVar.f17595e));
        int b10 = q.b(context, 17170443);
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        v7.g.e(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(b5);
        Drawable c = q.c(context, R.drawable.ic_round_edit_24);
        if (c != null && (mutate = c.mutate()) != null) {
            mutate.setTint(b10);
            mutate.setBounds(128, 128, canvas.getWidth() - 128, canvas.getHeight() - 128);
            mutate.draw(canvas);
        }
        String valueOf = String.valueOf(j2);
        o2.b bVar = new o2.b();
        bVar.f16219a = context;
        bVar.f16220b = valueOf;
        bVar.c = new Intent[]{intent};
        bVar.f16222e = ModelUtilsKt.o(context, aVar);
        bVar.f16223f = ModelUtilsKt.o(context, aVar);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f4617b = createBitmap;
        bVar.f16225h = iconCompat;
        if (!TextUtils.isEmpty(bVar.f16222e)) {
            Intent[] intentArr = bVar.c;
            if (intentArr != null && intentArr.length != 0) {
                return bVar;
            }
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
        throw new IllegalArgumentException("Shortcut must have a non-empty label");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ComponentName d(Context context) {
        Object obj;
        boolean z10;
        v7.g.f(context, "<this>");
        ComponentName componentName = new ComponentName(context, AppActivity.class);
        Icon[] values = Icon.values();
        ArrayList<String> arrayList = new ArrayList(values.length);
        for (Icon icon : values) {
            arrayList.add(ModelUtilsKt.E(icon, false));
        }
        ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
        for (String str : arrayList) {
            arrayList2.add(new ComponentName(context, str));
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ComponentName componentName2 = (ComponentName) obj;
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName2);
                z10 = true;
                if (componentEnabledSetting == 1) {
                    continue;
                    if (z10) {
                        break;
                    }
                }
            }
            z10 = false;
            continue;
            if (z10) {
            }
        }
        ComponentName componentName3 = (ComponentName) obj;
        return componentName3 == null ? componentName : componentName3;
    }
}
