package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "folderId", "", "<anonymous parameter 1>", "Lm7/n;", "invoke", "(JLjava/lang/String;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NewFolderFragment$setupListeners$4$1 extends Lambda implements u7.p<Long, String, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NewFolderFragment f8574j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFolderFragment$setupListeners$4$1(NewFolderFragment newFolderFragment) {
        super(2);
        this.f8574j = newFolderFragment;
    }

    @Override // u7.p
    public final m7.n R(Long l2, String str) {
        long longValue = l2.longValue();
        v7.g.f(str, "<anonymous parameter 1>");
        int i10 = NewFolderFragment.f8567f0;
        FolderViewModel b02 = this.f8574j.b0();
        Long valueOf = Long.valueOf(longValue);
        b02.getClass();
        m0.b.M0(a1.b.d0(b02), null, null, new FolderViewModel$setParentFolder$1(b02, valueOf, null), 3);
        return m7.n.f16010a;
    }
}
