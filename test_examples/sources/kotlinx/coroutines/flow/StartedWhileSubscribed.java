package kotlinx.coroutines.flow;

import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes.dex */
public final class StartedWhileSubscribed implements s {

    /* renamed from: a  reason: collision with root package name */
    public final long f15337a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15338b;

    public StartedWhileSubscribed(long j2, long j10) {
        this.f15337a = j2;
        this.f15338b = j10;
        boolean z10 = true;
        if (!(j2 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j2 + " ms) cannot be negative").toString());
        }
        if (j10 < 0) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j10 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.s
    public final b<SharingCommand> a(u<Integer> uVar) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this, null);
        int i10 = h.f15362a;
        return a1.b.K(new g(new StartedWhileSubscribed$command$2(null), new ChannelFlowTransformLatest(startedWhileSubscribed$command$1, uVar, EmptyCoroutineContext.f13021i, -2, BufferOverflow.SUSPEND)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof StartedWhileSubscribed) {
            StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
            if (this.f15337a == startedWhileSubscribed.f15337a && this.f15338b == startedWhileSubscribed.f15338b) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        long j2 = this.f15337a;
        long j10 = this.f15338b;
        return (((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        long j2 = this.f15337a;
        if (j2 > 0) {
            listBuilder.add("stopTimeout=" + j2 + "ms");
        }
        long j10 = this.f15338b;
        if (j10 < Long.MAX_VALUE) {
            listBuilder.add("replayExpiration=" + j10 + "ms");
        }
        a1.c.S(listBuilder);
        return androidx.activity.e.j(new StringBuilder("SharingStarted.WhileSubscribed("), kotlin.collections.c.t2(listBuilder, null, null, null, null, 63), ')');
    }
}
