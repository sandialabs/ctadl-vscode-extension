package com.noto.app.folder;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm7/n;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderDialogFragment$setupArchiveVaultedFolderConfirmationDialog$1 extends Lambda implements u7.l<Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderDialogFragment f8345j;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.folder.FolderDialogFragment$setupArchiveVaultedFolderConfirmationDialog$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ FolderDialogFragment f8346j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ View f8347k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FolderDialogFragment folderDialogFragment, View view) {
            super(1);
            this.f8346j = folderDialogFragment;
            this.f8347k = view;
        }

        @Override // u7.l
        public final m7.n U(Throwable th) {
            int i10;
            int i11;
            Throwable th2 = th;
            int i12 = FolderDialogFragment.A0;
            FolderDialogFragment folderDialogFragment = this.f8346j;
            boolean z10 = ((t6.a) ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().k()).getValue()).f17599i;
            NotoColor notoColor = ((t6.a) ((kotlinx.coroutines.flow.m) folderDialogFragment.h0().k()).getValue()).f17595e;
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
                a1.c.X1(j2);
                View view = this.f8347k;
                if (view != null) {
                    ViewUtilsKt.w(view, f7.q.f(j2, i10, new Object[0]), Integer.valueOf(i11), Integer.valueOf(FolderDialogFragment.g0(folderDialogFragment)), notoColor, 16);
                }
            }
            folderDialogFragment.Z();
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderDialogFragment$setupArchiveVaultedFolderConfirmationDialog$1(FolderDialogFragment folderDialogFragment) {
        super(1);
        this.f8345j = folderDialogFragment;
    }

    @Override // u7.l
    public final m7.n U(Integer num) {
        View view;
        Integer num2 = num;
        FolderDialogFragment folderDialogFragment = this.f8345j;
        Fragment fragment = folderDialogFragment.C;
        if (fragment != null) {
            view = fragment.M;
        } else {
            view = null;
        }
        int i10 = FolderDialogFragment.A0;
        FolderViewModel h02 = folderDialogFragment.h0();
        h02.getClass();
        m0.b.M0(a1.b.d0(h02), null, null, new FolderViewModel$toggleFolderIsArchived$1(h02, null), 3).O(new AnonymousClass1(folderDialogFragment, view));
        return m7.n.f16010a;
    }
}
