package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import x6.e0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "folderId", "Lm7/n;", "invoke", "(J)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NewFolderFragment$setupListeners$5$2 extends Lambda implements u7.l<Long, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NewFolderFragment f8575j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFolderFragment$setupListeners$5$2(NewFolderFragment newFolderFragment) {
        super(1);
        this.f8575j = newFolderFragment;
    }

    @Override // u7.l
    public final m7.n U(Long l2) {
        long longValue = l2.longValue();
        NavController g10 = ViewUtilsKt.g(this.f8575j);
        if (g10 != null) {
            ViewUtilsKt.o(g10, new e0(longValue), null);
        }
        return m7.n.f16010a;
    }
}
