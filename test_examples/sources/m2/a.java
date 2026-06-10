package m2;

import android.app.Activity;
import android.content.pm.PackageManager;
import androidx.activity.ComponentActivity;
import m2.b;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ String[] f15905i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Activity f15906j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f15907k;

    public a(ComponentActivity componentActivity, String[] strArr, int i10) {
        this.f15905i = strArr;
        this.f15906j = componentActivity;
        this.f15907k = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String[] strArr = this.f15905i;
        int[] iArr = new int[strArr.length];
        Activity activity = this.f15906j;
        PackageManager packageManager = activity.getPackageManager();
        String packageName = activity.getPackageName();
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = packageManager.checkPermission(strArr[i10], packageName);
        }
        ((b.c) activity).onRequestPermissionsResult(this.f15907k, strArr, iArr);
    }
}
