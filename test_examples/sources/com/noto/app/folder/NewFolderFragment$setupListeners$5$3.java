package com.noto.app.folder;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NewFolderFragment$setupListeners$5$3 extends Lambda implements u7.l<Throwable, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NewFolderFragment f8576j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewFolderFragment$setupListeners$5$3(NewFolderFragment newFolderFragment) {
        super(1);
        this.f8576j = newFolderFragment;
    }

    @Override // u7.l
    public final m7.n U(Throwable th) {
        NavController g10;
        Throwable th2 = th;
        NewFolderFragment newFolderFragment = this.f8576j;
        Context j2 = newFolderFragment.j();
        if (j2 != null) {
            a1.c.W1(j2);
        }
        Context j10 = newFolderFragment.j();
        if (j10 != null) {
            a1.c.X1(j10);
        }
        Context j11 = newFolderFragment.j();
        if (j11 != null) {
            a1.c.Y1(j11);
        }
        if (newFolderFragment.a0().f18667a != 0 && (g10 = ViewUtilsKt.g(newFolderFragment)) != null) {
            g10.j();
        }
        return m7.n.f16010a;
    }
}
