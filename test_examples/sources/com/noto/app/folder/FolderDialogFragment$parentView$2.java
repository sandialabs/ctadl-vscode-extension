package com.noto.app.folder;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FolderDialogFragment$parentView$2 extends Lambda implements u7.a<View> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderDialogFragment f8344j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderDialogFragment$parentView$2(FolderDialogFragment folderDialogFragment) {
        super(0);
        this.f8344j = folderDialogFragment;
    }

    @Override // u7.a
    public final View k0() {
        Fragment fragment = this.f8344j.C;
        if (fragment != null) {
            return fragment.M;
        }
        return null;
    }
}
