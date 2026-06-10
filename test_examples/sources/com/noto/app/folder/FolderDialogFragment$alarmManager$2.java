package com.noto.app.folder;

import android.app.AlarmManager;
import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/AlarmManager;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FolderDialogFragment$alarmManager$2 extends Lambda implements u7.a<AlarmManager> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderDialogFragment f8341j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderDialogFragment$alarmManager$2(FolderDialogFragment folderDialogFragment) {
        super(0);
        this.f8341j = folderDialogFragment;
    }

    @Override // u7.a
    public final AlarmManager k0() {
        Context j2 = this.f8341j.j();
        return (AlarmManager) (j2 != null ? j2.getSystemService("alarm") : null);
    }
}
