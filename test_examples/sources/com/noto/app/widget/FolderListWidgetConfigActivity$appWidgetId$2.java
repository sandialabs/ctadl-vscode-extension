package com.noto.app.widget;

import android.content.Intent;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FolderListWidgetConfigActivity$appWidgetId$2 extends Lambda implements u7.a<Integer> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderListWidgetConfigActivity f9943j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListWidgetConfigActivity$appWidgetId$2(FolderListWidgetConfigActivity folderListWidgetConfigActivity) {
        super(0);
        this.f9943j = folderListWidgetConfigActivity;
    }

    @Override // u7.a
    public final Integer k0() {
        Intent intent = this.f9943j.getIntent();
        return Integer.valueOf(intent != null ? intent.getIntExtra("appWidgetId", 0) : 0);
    }
}
