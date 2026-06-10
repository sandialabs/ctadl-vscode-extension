package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import t.i;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultScrollableState$scroll$2 extends SuspendLambda implements p<x, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f1616m;
    public final /* synthetic */ b n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ MutatePriority f1617o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ p<i, p7.c<? super n>, Object> f1618p;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lt/i;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
    @q7.c(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", l = {150}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i, p7.c<? super n>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public int f1619m;
        public /* synthetic */ Object n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ b f1620o;

        /* renamed from: p  reason: collision with root package name */
        public final /* synthetic */ p<i, p7.c<? super n>, Object> f1621p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(b bVar, p<? super i, ? super p7.c<? super n>, ? extends Object> pVar, p7.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f1620o = bVar;
            this.f1621p = pVar;
        }

        @Override // u7.p
        public final Object R(i iVar, p7.c<? super n> cVar) {
            return ((AnonymousClass1) a(iVar, cVar)).k(n.f16010a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final p7.c<n> a(Object obj, p7.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f1620o, this.f1621p, cVar);
            anonymousClass1.n = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object k(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1619m;
            b bVar = this.f1620o;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        m0.b.n1(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    i iVar = (i) this.n;
                    bVar.f1863d.setValue(Boolean.TRUE);
                    p<i, p7.c<? super n>, Object> pVar = this.f1621p;
                    this.f1619m = 1;
                    if (pVar.R(iVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                bVar.f1863d.setValue(Boolean.FALSE);
                return n.f16010a;
            } catch (Throwable th) {
                bVar.f1863d.setValue(Boolean.FALSE);
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState$scroll$2(b bVar, MutatePriority mutatePriority, p<? super i, ? super p7.c<? super n>, ? extends Object> pVar, p7.c<? super DefaultScrollableState$scroll$2> cVar) {
        super(2, cVar);
        this.n = bVar;
        this.f1617o = mutatePriority;
        this.f1618p = pVar;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super n> cVar) {
        return ((DefaultScrollableState$scroll$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new DefaultScrollableState$scroll$2(this.n, this.f1617o, this.f1618p, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1616m;
        if (i10 != 0) {
            if (i10 == 1) {
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            b bVar = this.n;
            MutatorMutex mutatorMutex = bVar.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, this.f1618p, null);
            this.f1616m = 1;
            if (mutatorMutex.a(bVar.f1862b, this.f1617o, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return n.f16010a;
    }
}
