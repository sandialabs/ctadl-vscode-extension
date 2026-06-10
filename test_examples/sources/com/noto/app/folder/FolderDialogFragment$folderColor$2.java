package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NotoColor;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/noto/app/domain/model/NotoColor;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FolderDialogFragment$folderColor$2 extends Lambda implements u7.a<NotoColor> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderDialogFragment f8343j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderDialogFragment$folderColor$2(FolderDialogFragment folderDialogFragment) {
        super(0);
        this.f8343j = folderDialogFragment;
    }

    @Override // u7.a
    public final NotoColor k0() {
        int i10 = FolderDialogFragment.A0;
        return ((t6.a) ((kotlinx.coroutines.flow.m) this.f8343j.h0().k()).getValue()).f17595e;
    }
}
