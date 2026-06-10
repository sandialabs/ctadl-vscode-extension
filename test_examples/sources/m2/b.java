package m2;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class b extends n2.a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f15908b = 0;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    /* renamed from: m2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0184b {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        public static boolean c(Activity activity, String str) {
            boolean shouldShowRequestPermissionRationale;
            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            return shouldShowRequestPermissionRationale;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    /* loaded from: classes.dex */
    public interface d {
        void c();
    }
}
