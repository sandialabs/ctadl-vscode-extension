package com.noto.app;

import a1.b;
import android.os.Bundle;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.t;
import com.noto.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m7.n;
import ma.i;
import u7.l;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "folderId", "Lm7/n;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppActivity$showSelectFolderDialog$1 extends Lambda implements l<Long, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f7539j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ AppActivity f7540k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivity$showSelectFolderDialog$1(String str, AppActivity appActivity) {
        super(1);
        this.f7539j = str;
        this.f7540k = appActivity;
    }

    @Override // u7.l
    public final n U(Long l2) {
        t E = i.E(AppActivity$showSelectFolderDialog$1$options$1.f7541j);
        Bundle n = b.n(new Pair("folder_id", l2), new Pair("body", this.f7539j), new Pair("selected_note_ids", new long[0]));
        int i10 = AppActivity.N;
        AppActivity appActivity = this.f7540k;
        appActivity.u().h(R.id.folderFragment, n, E);
        appActivity.u().h(R.id.noteFragment, n, null);
        return n.f16010a;
    }
}
