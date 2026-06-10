package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlinx.coroutines.channels.AbstractChannel;

/* loaded from: classes.dex */
public final class t1 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ la.c<m7.n> f3906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(AbstractChannel abstractChannel, Handler handler) {
        super(handler);
        this.f3906a = abstractChannel;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        this.f3906a.F(m7.n.f16010a);
    }
}
