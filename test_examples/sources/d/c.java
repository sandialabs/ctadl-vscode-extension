package d;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ View f10238i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ View f10239j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ AlertController f10240k;

    public c(AlertController alertController, View view, View view2) {
        this.f10240k = alertController;
        this.f10238i = view;
        this.f10239j = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.b(this.f10240k.f497f, this.f10238i, this.f10239j);
    }
}
