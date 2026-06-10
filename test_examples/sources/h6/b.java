package h6;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.domain.model.Theme;
import com.noto.app.filtered.FilteredFragment;
import com.noto.app.label.LabelDialogFragment;
import com.noto.app.main.MainDialogFragment;
import com.noto.app.main.MainFragment;
import com.noto.app.main.MainVaultFragment;
import com.noto.app.main.MainViewModel;
import com.noto.app.note.NoteFragment;
import com.noto.app.note.NoteReminderDialogFragment;
import com.noto.app.settings.ExportImportDialogFragment;
import com.noto.app.settings.general.ThemeDialogFragment;
import com.noto.app.settings.whatsnew.WhatsNewFragment;
import com.noto.app.util.ViewUtilsKt;
import com.noto.app.widget.FolderListWidgetConfigActivity;
import com.noto.app.widget.NoteListWidgetConfigActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f11453i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f11454j;

    public /* synthetic */ b(int i10, Object obj) {
        this.f11453i = i10;
        this.f11454j = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        androidx.navigation.a aVar;
        androidx.navigation.a aVar2;
        NavController navController;
        boolean z10 = false;
        int i10 = this.f11453i;
        PasswordTransformationMethod passwordTransformationMethod = null;
        Object obj = this.f11454j;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                EditText editText2 = fVar.f11463i;
                if (editText2 != null) {
                    Editable text = editText2.getText();
                    if (text != null) {
                        text.clear();
                    }
                    fVar.q();
                    return;
                }
                return;
            case 1:
                ((n) obj).u();
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                v vVar = (v) obj;
                EditText editText3 = vVar.f11529f;
                if (editText3 != null) {
                    int selectionEnd = editText3.getSelectionEnd();
                    EditText editText4 = vVar.f11529f;
                    if (editText4 != null && (editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z10 = true;
                    }
                    if (z10) {
                        editText = vVar.f11529f;
                    } else {
                        editText = vVar.f11529f;
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        vVar.f11529f.setSelection(selectionEnd);
                    }
                    vVar.q();
                    return;
                }
                return;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                s6.e eVar = (s6.e) obj;
                int i11 = FilteredFragment.f8233f0;
                v7.g.f(eVar, "$this_setupListeners");
                eVar.f17329e.j0(0);
                return;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                LabelDialogFragment labelDialogFragment = (LabelDialogFragment) obj;
                int i12 = LabelDialogFragment.f8728w0;
                v7.g.f(labelDialogFragment, "this$0");
                Context j2 = labelDialogFragment.j();
                if (j2 != null) {
                    a1.c.W1(j2);
                }
                labelDialogFragment.Z();
                NavController g10 = ViewUtilsKt.g(labelDialogFragment);
                if (g10 != null) {
                    ViewUtilsKt.o(g10, new y6.e(labelDialogFragment.h0().f18899a, labelDialogFragment.h0().f18900b), null);
                    return;
                }
                return;
            case 5:
                MainDialogFragment mainDialogFragment = (MainDialogFragment) obj;
                int i13 = MainDialogFragment.f8838v0;
                v7.g.f(mainDialogFragment, "this$0");
                m7.e eVar2 = mainDialogFragment.f8839u0;
                if (((MainViewModel) eVar2.getValue()).f8914m.getValue() == null) {
                    navController = ViewUtilsKt.g(mainDialogFragment);
                    if (navController != null) {
                        aVar2 = new androidx.navigation.a(R.id.action_mainDialogFragment_to_vaultPasscodeDialogFragment);
                    } else {
                        return;
                    }
                } else {
                    boolean booleanValue = ((Boolean) ((MainViewModel) eVar2.getValue()).f8913l.getValue()).booleanValue();
                    NavController g11 = ViewUtilsKt.g(mainDialogFragment);
                    if (booleanValue) {
                        if (g11 != null) {
                            aVar = new androidx.navigation.a(R.id.action_mainDialogFragment_to_mainVaultFragment);
                        } else {
                            return;
                        }
                    } else if (g11 != null) {
                        aVar = new androidx.navigation.a(R.id.action_mainDialogFragment_to_validateVaultPasscodeDialogFragment);
                    } else {
                        return;
                    }
                    aVar2 = aVar;
                    navController = g11;
                }
                ViewUtilsKt.o(navController, aVar2, null);
                return;
            case 6:
                MainFragment mainFragment = (MainFragment) obj;
                int i14 = MainFragment.A0;
                v7.g.f(mainFragment, "this$0");
                mainFragment.Z();
                NavController g12 = ViewUtilsKt.g(mainFragment);
                if (g12 != null) {
                    a4.b.r(R.id.action_mainFragment_to_mainDialogFragment, g12, null);
                    return;
                }
                return;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                MainVaultFragment.g0((MainVaultFragment) obj);
                return;
            case 8:
                u7.a aVar3 = (u7.a) obj;
                int i15 = NoteFragment.f9026f0;
                v7.g.f(aVar3, "$backCallback");
                aVar3.k0();
                return;
            case ma.i.f16046m /* 9 */:
                NoteReminderDialogFragment noteReminderDialogFragment = (NoteReminderDialogFragment) obj;
                int i16 = NoteReminderDialogFragment.f9176x0;
                v7.g.f(noteReminderDialogFragment, "this$0");
                noteReminderDialogFragment.Z();
                return;
            case ma.i.f16047o /* 10 */:
                ExportImportDialogFragment exportImportDialogFragment = (ExportImportDialogFragment) obj;
                int i17 = ExportImportDialogFragment.f9425y0;
                v7.g.f(exportImportDialogFragment, "this$0");
                exportImportDialogFragment.f9429x0.a(a1.c.f69f);
                return;
            case 11:
                ThemeDialogFragment themeDialogFragment = (ThemeDialogFragment) obj;
                int i18 = ThemeDialogFragment.f9760v0;
                v7.g.f(themeDialogFragment, "this$0");
                themeDialogFragment.g0().r(Theme.Light);
                themeDialogFragment.Z();
                return;
            case 12:
                WhatsNewFragment whatsNewFragment = (WhatsNewFragment) obj;
                int i19 = WhatsNewFragment.f9806e0;
                v7.g.f(whatsNewFragment, "this$0");
                whatsNewFragment.Y(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/alialbaali/Noto/releases")));
                return;
            case 13:
                FolderListWidgetConfigActivity.r((FolderListWidgetConfigActivity) obj);
                return;
            default:
                NoteListWidgetConfigActivity.r((NoteListWidgetConfigActivity) obj);
                return;
        }
    }
}
