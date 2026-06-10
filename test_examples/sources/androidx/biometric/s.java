package androidx.biometric;

import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class s implements DialogInterface.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ r f1247i;

    public s(r rVar) {
        this.f1247i = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f1247i.f1241v0.i(true);
    }
}
