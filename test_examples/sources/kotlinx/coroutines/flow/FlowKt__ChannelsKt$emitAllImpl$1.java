package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
@q7.c(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
/* loaded from: classes.dex */
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {

    /* renamed from: l  reason: collision with root package name */
    public c f15219l;

    /* renamed from: m  reason: collision with root package name */
    public la.m f15220m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Object f15221o;

    /* renamed from: p  reason: collision with root package name */
    public int f15222p;

    public FlowKt__ChannelsKt$emitAllImpl$1(p7.c<? super FlowKt__ChannelsKt$emitAllImpl$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        this.f15221o = obj;
        this.f15222p |= Integer.MIN_VALUE;
        return e.e(null, null, false, this);
    }
}
