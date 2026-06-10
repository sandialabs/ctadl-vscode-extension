package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import t.i;
import u7.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/c;", "delta", "invoke-MK-Hz9U", "(J)J", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends Lambda implements l<u0.c, u0.c> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f1828j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ i f1829k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, i iVar) {
        super(1);
        this.f1828j = scrollingLogic;
        this.f1829k = iVar;
    }

    @Override // u7.l
    public final u0.c U(u0.c cVar) {
        long j2;
        long j10 = cVar.f17724a;
        i iVar = this.f1829k;
        ScrollingLogic scrollingLogic = this.f1828j;
        if (scrollingLogic.f1812b) {
            j2 = u0.c.g(-1.0f, j10);
        } else {
            j2 = j10;
        }
        long a10 = scrollingLogic.a(iVar, j2, null, 2);
        if (scrollingLogic.f1812b) {
            a10 = u0.c.g(-1.0f, a10);
        }
        return new u0.c(u0.c.e(j10, a10));
    }
}
