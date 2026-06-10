package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.j;

/* loaded from: classes.dex */
public final class g implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: i  reason: collision with root package name */
    public final f f635i;

    /* renamed from: j  reason: collision with root package name */
    public androidx.appcompat.app.b f636j;

    /* renamed from: k  reason: collision with root package name */
    public d f637k;

    public g(f fVar) {
        this.f635i = fVar;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final void b(f fVar, boolean z10) {
        androidx.appcompat.app.b bVar;
        if ((z10 || fVar == this.f635i) && (bVar = this.f636j) != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final boolean c(f fVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        d dVar = this.f637k;
        if (dVar.n == null) {
            dVar.n = new d.a();
        }
        this.f635i.q(dVar.n.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f637k.b(this.f635i, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        f fVar = this.f635i;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f636j.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f636j.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                fVar.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return fVar.performShortcut(i10, keyEvent, 0);
    }
}
