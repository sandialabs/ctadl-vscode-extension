package d;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import d.j;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f10244i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Context f10245j;

    public /* synthetic */ i(Context context, int i10) {
        this.f10244i = i10;
        this.f10245j = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10244i;
        Context context = this.f10245j;
        switch (i10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (j.h().f18149a.isEmpty()) {
                            String b5 = w.b(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                j.b.b(systemService, j.a.a(b5));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                j.n = true;
                return;
            default:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new androidx.activity.b(7, context));
                return;
        }
    }
}
