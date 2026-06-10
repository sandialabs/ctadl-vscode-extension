package com.noto.app.folder;

import android.os.Bundle;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/e;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListSortingDialogFragment$special$$inlined$navArgs$1 extends Lambda implements u7.a<Bundle> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Fragment f8649j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListSortingDialogFragment$special$$inlined$navArgs$1(Fragment fragment) {
        super(0);
        this.f8649j = fragment;
    }

    @Override // u7.a
    public final Bundle k0() {
        Fragment fragment = this.f8649j;
        Bundle bundle = fragment.n;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(a4.b.k("Fragment ", fragment, " has null arguments"));
    }
}
