package d3;

import a3.e;
import a3.j0;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import com.noto.app.AppActivity;
import com.noto.app.settings.ExportImportDialogFragment;
import d3.h;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements g, androidx.activity.result.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10385a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10386b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f10385a = i10;
        this.f10386b = obj;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        int i10 = this.f10385a;
        Object obj2 = this.f10386b;
        switch (i10) {
            case 1:
                AppActivity.r((AppActivity) obj2, (Boolean) obj);
                return;
            default:
                ExportImportDialogFragment.g0((ExportImportDialogFragment) obj2, (Uri) obj);
                return;
        }
    }

    public final boolean b(h hVar, int i10, Bundle bundle) {
        e.b cVar;
        View view = (View) this.f10386b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                hVar.f10389a.d();
                InputContentInfo inputContentInfo = (InputContentInfo) hVar.f10389a.b();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipDescription a10 = hVar.f10389a.a();
        h.c cVar2 = hVar.f10389a;
        ClipData clipData = new ClipData(a10, new ClipData.Item(cVar2.c()));
        if (i11 >= 31) {
            cVar = new e.a(clipData, 2);
        } else {
            cVar = new e.c(clipData, 2);
        }
        cVar.a(cVar2.e());
        cVar.setExtras(bundle);
        if (j0.l(view, cVar.build()) != null) {
            return false;
        }
        return true;
    }
}
