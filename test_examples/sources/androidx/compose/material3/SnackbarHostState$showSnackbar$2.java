package androidx.compose.material3;

import androidx.datastore.preferences.PreferencesProto$Value;
import e0.n;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
@q7.c(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {464, 467}, m = "showSnackbar")
/* loaded from: classes.dex */
public final class SnackbarHostState$showSnackbar$2 extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public d f2433l;

    /* renamed from: m  reason: collision with root package name */
    public n f2434m;
    public kotlinx.coroutines.sync.b n;

    /* renamed from: o  reason: collision with root package name */
    public Object f2435o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f2436p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ d f2437q;

    /* renamed from: r  reason: collision with root package name */
    public int f2438r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$2(d dVar, p7.c<? super SnackbarHostState$showSnackbar$2> cVar) {
        super(cVar);
        this.f2437q = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f2436p = obj;
        this.f2438r |= Integer.MIN_VALUE;
        return this.f2437q.a(null, this);
    }
}
