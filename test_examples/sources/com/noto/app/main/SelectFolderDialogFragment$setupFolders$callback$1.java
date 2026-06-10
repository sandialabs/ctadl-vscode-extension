package com.noto.app.main;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import androidx.navigation.i;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "id", "", "title", "Lm7/n;", "invoke", "(JLjava/lang/String;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SelectFolderDialogFragment$setupFolders$callback$1 extends Lambda implements p<Long, String, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ SelectFolderDialogFragment f8970j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectFolderDialogFragment$setupFolders$callback$1(SelectFolderDialogFragment selectFolderDialogFragment) {
        super(2);
        this.f8970j = selectFolderDialogFragment;
    }

    @Override // u7.p
    public final n R(Long l2, String str) {
        i g10;
        d0 a10;
        long longValue = l2.longValue();
        String str2 = str;
        SelectFolderDialogFragment selectFolderDialogFragment = this.f8970j;
        g.f(str2, "title");
        try {
            NavController g11 = ViewUtilsKt.g(selectFolderDialogFragment);
            if (g11 != null && (g10 = g11.g()) != null && (a10 = g10.a()) != null) {
                a10.e(str2, "folder_title");
                a10.e(Long.valueOf(longValue), "folder_id");
            }
            selectFolderDialogFragment.f8954u0.R(Long.valueOf(longValue), str2);
        } catch (IllegalStateException unused) {
            selectFolderDialogFragment.f8954u0.R(Long.valueOf(longValue), str2);
        }
        selectFolderDialogFragment.Z();
        return n.f16010a;
    }
}
