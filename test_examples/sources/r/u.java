package r;

import androidx.compose.animation.core.MutatePriority;
import ja.u0;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.sync.MutexImpl;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<a> f17017a = new AtomicReference<>(null);

    /* renamed from: b  reason: collision with root package name */
    public final MutexImpl f17018b = new MutexImpl(false);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final MutatePriority f17019a;

        /* renamed from: b  reason: collision with root package name */
        public final u0 f17020b;

        public a(MutatePriority mutatePriority, u0 u0Var) {
            v7.g.f(mutatePriority, "priority");
            this.f17019a = mutatePriority;
            this.f17020b = u0Var;
        }
    }
}
