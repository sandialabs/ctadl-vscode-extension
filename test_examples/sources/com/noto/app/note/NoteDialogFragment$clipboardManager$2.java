package com.noto.app.note;

import android.content.ClipboardManager;
import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/ClipboardManager;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoteDialogFragment$clipboardManager$2 extends Lambda implements u7.a<ClipboardManager> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteDialogFragment f8998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDialogFragment$clipboardManager$2(NoteDialogFragment noteDialogFragment) {
        super(0);
        this.f8998j = noteDialogFragment;
    }

    @Override // u7.a
    public final ClipboardManager k0() {
        Context j2 = this.f8998j.j();
        return (ClipboardManager) (j2 != null ? j2.getSystemService("clipboard") : null);
    }
}
