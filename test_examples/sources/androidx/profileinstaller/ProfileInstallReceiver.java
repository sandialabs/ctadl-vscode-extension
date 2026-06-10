package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.biometric.e;
import androidx.profileinstaller.b;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* loaded from: classes.dex */
    public class a implements b.c {
        public a() {
        }

        @Override // androidx.profileinstaller.b.c
        public final void a(int i10, Object obj) {
            b.f5572b.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            b.b(context, new Executor() { // from class: k.a
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new a(), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            String string = intent.getExtras().getString("EXTRA_SKIP_FILE_OPERATION");
            if ("WRITE_SKIP_FILE".equals(string)) {
                a aVar = new a();
                try {
                    b.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    new e(10, 2, aVar, null).run();
                } catch (PackageManager.NameNotFoundException e10) {
                    new e(7, 2, aVar, e10).run();
                }
            } else if ("DELETE_SKIP_FILE".equals(string)) {
                a aVar2 = new a();
                new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                aVar2.a(11, null);
            }
        }
    }
}
