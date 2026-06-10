package com.noto.app.folder;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "noteId", "Lm7/n;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FolderFragment$setupState$12$1 extends Lambda implements u7.l<Long, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8403j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ v<Long> f8404k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$12$1(FolderFragment folderFragment, v<Long> vVar) {
        super(1);
        this.f8403j = folderFragment;
        this.f8404k = vVar;
    }

    @Override // u7.l
    public final m7.n U(Long l2) {
        Long l4 = l2;
        if (l4 != null) {
            int i10 = FolderFragment.f8358k0;
            FolderFragment folderFragment = this.f8403j;
            folderFragment.a0().f8441u.setValue(Boolean.TRUE);
            folderFragment.a0().u(l4.longValue());
            this.f8404k.i(null);
        }
        return m7.n.f16010a;
    }
}
