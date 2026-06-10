package com.noto.app.note;

import android.view.View;
import android.widget.EditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import com.noto.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/widget/EditText;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UndoRedoDialogFragment$etNoteTitle$2 extends Lambda implements u7.a<EditText> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ UndoRedoDialogFragment f9379j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndoRedoDialogFragment$etNoteTitle$2(UndoRedoDialogFragment undoRedoDialogFragment) {
        super(0);
        this.f9379j = undoRedoDialogFragment;
    }

    @Override // u7.a
    public final EditText k0() {
        View view;
        Fragment fragment = this.f9379j.C;
        if (fragment != null && (view = fragment.M) != null) {
            return (EditText) view.findViewById(R.id.et_note_title);
        }
        return null;
    }
}
