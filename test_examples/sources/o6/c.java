package o6;

import a7.v;
import android.net.Uri;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.noto.app.components.ConfirmationDialogFragment;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.VaultTimeout;
import com.noto.app.filtered.FilteredFragment;
import com.noto.app.folder.FolderArchiveFragment;
import com.noto.app.folder.NewFolderFragment;
import com.noto.app.label.LabelDialogFragment;
import com.noto.app.note.NoteFragment;
import com.noto.app.settings.ExportImportDialogFragment;
import com.noto.app.settings.general.FontDialogFragment;
import com.noto.app.settings.vault.VaultTimeoutDialogFragment;
import com.noto.app.settings.whatsnew.WhatsNewDialogFragment;
import com.noto.app.settings.whatsnew.WhatsNewFragment;
import com.noto.app.util.ViewUtilsKt;
import com.noto.app.widget.FolderListWidgetConfigActivity;
import s6.o;
import w6.n;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f16360i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f16361j;

    public /* synthetic */ c(int i10, Object obj) {
        this.f16360i = i10;
        this.f16361j = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        androidx.navigation.i g10;
        d0 a10;
        int i10 = this.f16360i;
        Object obj = this.f16361j;
        switch (i10) {
            case 0:
                ConfirmationDialogFragment confirmationDialogFragment = (ConfirmationDialogFragment) obj;
                int i11 = ConfirmationDialogFragment.f7625v0;
                v7.g.f(confirmationDialogFragment, "this$0");
                NavController g11 = ViewUtilsKt.g(confirmationDialogFragment);
                if (g11 != null && (g10 = g11.g()) != null && (a10 = g10.a()) != null) {
                    a10.e(0, "click_listener");
                }
                confirmationDialogFragment.Z();
                return;
            case 1:
                FilteredFragment filteredFragment = (FilteredFragment) obj;
                int i12 = FilteredFragment.f8233f0;
                v7.g.f(filteredFragment, "this$0");
                NavController g12 = ViewUtilsKt.g(filteredFragment);
                if (g12 != null) {
                    ViewUtilsKt.o(g12, new n(false), null);
                    return;
                }
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                FolderArchiveFragment folderArchiveFragment = (FolderArchiveFragment) obj;
                int i13 = FolderArchiveFragment.f8310g0;
                v7.g.f(folderArchiveFragment, "this$0");
                NavController g13 = ViewUtilsKt.g(folderArchiveFragment);
                if (g13 != null) {
                    g13.j();
                    return;
                }
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                NewFolderFragment.Z((NewFolderFragment) obj);
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                LabelDialogFragment.g0((LabelDialogFragment) obj);
                return;
            case 5:
                NoteFragment noteFragment = (NoteFragment) obj;
                int i14 = NoteFragment.f9026f0;
                v7.g.f(noteFragment, "this$0");
                NavController g14 = ViewUtilsKt.g(noteFragment);
                if (g14 != null) {
                    ViewUtilsKt.o(g14, new v(false), null);
                    return;
                }
                return;
            case 6:
                ExportImportDialogFragment exportImportDialogFragment = (ExportImportDialogFragment) obj;
                int i15 = ExportImportDialogFragment.f9425y0;
                v7.g.f(exportImportDialogFragment, "this$0");
                exportImportDialogFragment.f9428w0.a(Uri.EMPTY);
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                FontDialogFragment fontDialogFragment = (FontDialogFragment) obj;
                int i16 = FontDialogFragment.f9681v0;
                v7.g.f(fontDialogFragment, "this$0");
                ((com.noto.app.settings.c) fontDialogFragment.f9682u0.getValue()).n(Font.Monospace);
                fontDialogFragment.Z();
                return;
            case 8:
                VaultTimeoutDialogFragment vaultTimeoutDialogFragment = (VaultTimeoutDialogFragment) obj;
                int i17 = VaultTimeoutDialogFragment.f9795v0;
                v7.g.f(vaultTimeoutDialogFragment, "this$0");
                vaultTimeoutDialogFragment.g0().h(VaultTimeout.After1Hour);
                vaultTimeoutDialogFragment.Z();
                return;
            case ma.i.f16046m /* 9 */:
                WhatsNewDialogFragment.g0((WhatsNewDialogFragment) obj);
                return;
            case ma.i.f16047o /* 10 */:
                WhatsNewFragment whatsNewFragment = (WhatsNewFragment) obj;
                int i18 = WhatsNewFragment.f9806e0;
                v7.g.f(whatsNewFragment, "this$0");
                NavController g15 = ViewUtilsKt.g(whatsNewFragment);
                if (g15 != null) {
                    g15.j();
                    return;
                }
                return;
            default:
                o oVar = (o) obj;
                int i19 = FolderListWidgetConfigActivity.J;
                v7.g.f(oVar, "$this_setupListeners");
                oVar.c.v(0);
                return;
        }
    }
}
