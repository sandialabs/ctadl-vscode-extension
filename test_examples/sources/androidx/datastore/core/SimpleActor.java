package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.u0;
import ja.x;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import la.f;
import m7.n;
import p7.c;
import u7.l;
import u7.p;
import v7.g;

/* loaded from: classes.dex */
public final class SimpleActor<T> {

    /* renamed from: a  reason: collision with root package name */
    public final x f4666a;

    /* renamed from: b  reason: collision with root package name */
    public final p<T, c<? super n>, Object> f4667b;
    public final AbstractChannel c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f4668d;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"T", "", "ex", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
    /* renamed from: androidx.datastore.core.SimpleActor$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements l<Throwable, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ l<Throwable, n> f4669j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ SimpleActor<T> f4670k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ p<T, Throwable, n> f4671l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super Throwable, n> lVar, SimpleActor<T> simpleActor, p<? super T, ? super Throwable, n> pVar) {
            super(1);
            this.f4669j = lVar;
            this.f4670k = simpleActor;
            this.f4671l = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // u7.l
        public final n U(Throwable th) {
            n nVar;
            Throwable th2 = th;
            this.f4669j.U(th2);
            SimpleActor<T> simpleActor = this.f4670k;
            simpleActor.c.d(th2);
            do {
                Object E = simpleActor.c.E();
                nVar = null;
                if (E instanceof f.b) {
                    E = null;
                }
                if (E == null) {
                    continue;
                } else {
                    this.f4671l.R(E, th2);
                    nVar = n.f16010a;
                    continue;
                }
            } while (nVar != null);
            return n.f16010a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(x xVar, l<? super Throwable, n> lVar, p<? super T, ? super Throwable, n> pVar, p<? super T, ? super c<? super n>, ? extends Object> pVar2) {
        g.f(xVar, "scope");
        g.f(pVar, "onUndeliveredElement");
        this.f4666a = xVar;
        this.f4667b = pVar2;
        this.c = a1.b.f(Integer.MAX_VALUE, null, 6);
        this.f4668d = new AtomicInteger(0);
        u0 u0Var = (u0) xVar.j().a(u0.b.f12806i);
        if (u0Var == null) {
            return;
        }
        u0Var.O(new AnonymousClass1(lVar, this, pVar));
    }

    public final void a(SingleProcessDataStore.a aVar) {
        f.a aVar2;
        Object F = this.c.F(aVar);
        boolean z10 = F instanceof f.a;
        Throwable th = null;
        if (z10) {
            if (z10) {
                aVar2 = (f.a) F;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                th = aVar2.f15879a;
            }
            if (th == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
        } else if (!(F instanceof f.b)) {
            if (this.f4668d.getAndIncrement() == 0) {
                m0.b.M0(this.f4666a, null, null, new SimpleActor$offer$2(this, null), 3);
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
