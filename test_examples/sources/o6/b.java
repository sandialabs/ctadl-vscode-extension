package o6;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.noto.R;
import f7.q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo6/b;", "Lcom/google/android/material/bottomsheet/c;", "", "isCollapsable", "<init>", "(Z)V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class b extends com.google.android.material.bottomsheet.c {

    /* renamed from: t0  reason: collision with root package name */
    public final boolean f16359t0;

    public b() {
        this(false, 1, null);
    }

    public b(boolean z10) {
        this.f16359t0 = z10;
    }

    public /* synthetic */ b(boolean z10, int i10, v7.d dVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // androidx.fragment.app.Fragment
    public final void E() {
        Window window;
        this.K = true;
        Dialog dialog = this.f5220o0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            Context j2 = j();
            if (j2 != null) {
                f7.f.a(j2, window);
            }
            Context j10 = j();
            if (j10 != null) {
                f7.f.b(j10, window, false);
            }
        }
    }

    @Override // androidx.fragment.app.m
    public final int b0() {
        return R.style.BottomSheetDialog;
    }

    @Override // com.google.android.material.bottomsheet.c, d.s, androidx.fragment.app.m
    public Dialog c0() {
        com.google.android.material.bottomsheet.b bVar = new com.google.android.material.bottomsheet.b(S(), R.style.BottomSheetDialog);
        if (this.f16359t0) {
            if (bVar.f6921m == null) {
                bVar.g();
            }
            bVar.f6921m.D(q.d(500));
        } else {
            if (bVar.f6921m == null) {
                bVar.g();
            }
            bVar.f6921m.E(3);
            if (bVar.f6921m == null) {
                bVar.g();
            }
            bVar.f6921m.J = true;
        }
        return bVar;
    }
}
