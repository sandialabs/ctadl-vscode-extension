package androidx.compose.ui.platform;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1654, 1683}, m = "boundsUpdatesEventLoop")
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public AndroidComposeViewAccessibilityDelegateCompat f3633l;

    /* renamed from: m  reason: collision with root package name */
    public p.d f3634m;
    public la.e n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f3635o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f3636p;

    /* renamed from: q  reason: collision with root package name */
    public int f3637q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, p7.c<? super AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1> cVar) {
        super(cVar);
        this.f3636p = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f3635o = obj;
        this.f3637q |= Integer.MIN_VALUE;
        return this.f3636p.j(this);
    }
}
