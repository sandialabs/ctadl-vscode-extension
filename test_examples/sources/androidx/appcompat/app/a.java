package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ AlertController f533i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f534j;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f534j = bVar;
        this.f533i = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j2) {
        AlertController.b bVar = this.f534j;
        DialogInterface.OnClickListener onClickListener = bVar.f528j;
        AlertController alertController = this.f533i;
        onClickListener.onClick(alertController.f494b, i10);
        if (bVar.f530l) {
            return;
        }
        alertController.f494b.dismiss();
    }
}
