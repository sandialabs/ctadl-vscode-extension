package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "folderId", "", "<anonymous parameter 1>", "Lm7/n;", "invoke", "(JLjava/lang/String;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListWidgetConfigActivity$showSelectFolderDialog$1 extends Lambda implements p<Long, String, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteListWidgetConfigActivity f10078j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$showSelectFolderDialog$1(NoteListWidgetConfigActivity noteListWidgetConfigActivity) {
        super(2);
        this.f10078j = noteListWidgetConfigActivity;
    }

    @Override // u7.p
    public final n R(Long l2, String str) {
        long longValue = l2.longValue();
        g.f(str, "<anonymous parameter 1>");
        int i10 = NoteListWidgetConfigActivity.L;
        this.f10078j.s().d(longValue);
        return n.f16010a;
    }
}
