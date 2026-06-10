package com.noto.app.folder;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderDialogFragment$setupListeners$3$2 extends Lambda implements u7.l<Throwable, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderDialogFragment f8352j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderDialogFragment$setupListeners$3$2(FolderDialogFragment folderDialogFragment) {
        super(1);
        this.f8352j = folderDialogFragment;
    }

    @Override // u7.l
    public final m7.n U(Throwable th) {
        int i10;
        int i11;
        Throwable th2 = th;
        int i12 = FolderDialogFragment.A0;
        FolderDialogFragment folderDialogFragment = this.f8352j;
        boolean z10 = ((t6.a) ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().k()).getValue()).f17599i;
        if (z10) {
            i10 = R.string.folder_is_unarchived;
        } else {
            i10 = R.string.folder_is_archived;
        }
        if (z10) {
            i11 = R.drawable.ic_round_unarchive_24;
        } else {
            i11 = R.drawable.ic_round_archive_24;
        }
        Context j2 = folderDialogFragment.j();
        if (j2 != null) {
            a1.c.W1(j2);
            View view = (View) folderDialogFragment.f8335y0.getValue();
            if (view != null) {
                ViewUtilsKt.w(view, f7.q.f(j2, i10, new Object[0]), Integer.valueOf(i11), Integer.valueOf(FolderDialogFragment.g0(folderDialogFragment)), (NotoColor) folderDialogFragment.f8336z0.getValue(), 16);
            }
        }
        folderDialogFragment.Z();
        return m7.n.f16010a;
    }
}
