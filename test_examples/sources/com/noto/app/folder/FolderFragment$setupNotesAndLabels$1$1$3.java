package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import x6.u;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt6/c;", "kotlin.jvm.PlatformType", "label", "", "invoke", "(Lt6/c;)Ljava/lang/Boolean;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderFragment$setupNotesAndLabels$1$1$3 extends Lambda implements u7.l<t6.c, Boolean> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8400j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupNotesAndLabels$1$1$3(FolderFragment folderFragment) {
        super(1);
        this.f8400j = folderFragment;
    }

    @Override // u7.l
    public final Boolean U(t6.c cVar) {
        t6.c cVar2 = cVar;
        FolderFragment folderFragment = this.f8400j;
        NavController g10 = ViewUtilsKt.g(folderFragment);
        if (g10 != null) {
            int i10 = FolderFragment.f8358k0;
            ViewUtilsKt.o(g10, new u(folderFragment.Z().f18713a, cVar2.f17615a), null);
        }
        return Boolean.TRUE;
    }
}
