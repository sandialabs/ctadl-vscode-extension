package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.u;
import androidx.navigation.z;
import com.noto.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/u;", "Lm7/n;", "invoke", "(Landroidx/navigation/u;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderDialogFragment$setupDeleteFolderConfirmationDialog$1$options$1 extends Lambda implements u7.l<u, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public static final FolderDialogFragment$setupDeleteFolderConfirmationDialog$1$options$1 f8350j = new FolderDialogFragment$setupDeleteFolderConfirmationDialog$1$options$1();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/z;", "Lm7/n;", "invoke", "(Landroidx/navigation/z;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.folder.FolderDialogFragment$setupDeleteFolderConfirmationDialog$1$options$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.l<z, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public static final AnonymousClass1 f8351j = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // u7.l
        public final m7.n U(z zVar) {
            z zVar2 = zVar;
            v7.g.f(zVar2, "$this$popUpTo");
            zVar2.f5558a = true;
            return m7.n.f16010a;
        }
    }

    public FolderDialogFragment$setupDeleteFolderConfirmationDialog$1$options$1() {
        super(1);
    }

    @Override // u7.l
    public final m7.n U(u uVar) {
        u uVar2 = uVar;
        v7.g.f(uVar2, "$this$navOptions");
        uVar2.a(R.id.folderFragment, AnonymousClass1.f8351j);
        return m7.n.f16010a;
    }
}
