package com.noto.app.note;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoteDialogFragment$selectFolderTitle$2 extends Lambda implements u7.a<String> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteDialogFragment f9001j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDialogFragment$selectFolderTitle$2(NoteDialogFragment noteDialogFragment) {
        super(0);
        this.f9001j = noteDialogFragment;
    }

    @Override // u7.a
    public final String k0() {
        Integer num;
        Context j2;
        int i10;
        androidx.navigation.i g10;
        androidx.navigation.n nVar;
        NoteDialogFragment noteDialogFragment = this.f9001j;
        NavController g11 = ViewUtilsKt.g(noteDialogFragment);
        if (g11 != null && (g10 = g11.g()) != null && (nVar = g10.f5479j) != null) {
            num = Integer.valueOf(nVar.f5511k);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.folderArchiveFragment) {
            j2 = noteDialogFragment.j();
            if (j2 == null) {
                return null;
            }
            i10 = R.string.select_folder_archive;
            return q.f(j2, i10, new Object[0]);
        }
        j2 = noteDialogFragment.j();
        if (j2 == null) {
            return null;
        }
        i10 = R.string.select_folder;
        return q.f(j2, i10, new Object[0]);
    }
}
