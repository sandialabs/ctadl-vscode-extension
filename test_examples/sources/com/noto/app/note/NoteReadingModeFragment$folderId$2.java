package com.noto.app.note;

import android.os.Bundle;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoteReadingModeFragment$folderId$2 extends Lambda implements u7.a<Long> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteReadingModeFragment f9162j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReadingModeFragment$folderId$2(NoteReadingModeFragment noteReadingModeFragment) {
        super(0);
        this.f9162j = noteReadingModeFragment;
    }

    @Override // u7.a
    public final Long k0() {
        Bundle bundle = this.f9162j.n;
        if (bundle != null) {
            return Long.valueOf(bundle.getLong("folder_id"));
        }
        return null;
    }
}
