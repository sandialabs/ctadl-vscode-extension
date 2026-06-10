package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.PreferencesProto$Value;
import b2.k;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import m7.n;
import t.i;
import u7.l;
import u7.p;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lt/i;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
@q7.c(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {412}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements p<i, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public ScrollingLogic f1819m;
    public Ref$LongRef n;

    /* renamed from: o  reason: collision with root package name */
    public long f1820o;

    /* renamed from: p  reason: collision with root package name */
    public int f1821p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f1822q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ ScrollingLogic f1823r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Ref$LongRef f1824s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ long f1825t;

    /* loaded from: classes.dex */
    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScrollingLogic f1826a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<u0.c, u0.c> f1827b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ScrollingLogic scrollingLogic, l<? super u0.c, u0.c> lVar) {
            this.f1826a = scrollingLogic;
            this.f1827b = lVar;
        }

        @Override // t.i
        public final float a(float f10) {
            ScrollingLogic scrollingLogic = this.f1826a;
            return scrollingLogic.d(this.f1827b.U(new u0.c(scrollingLogic.e(f10))).f17724a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref$LongRef ref$LongRef, long j2, p7.c<? super ScrollingLogic$doFlingAnimation$2> cVar) {
        super(2, cVar);
        this.f1823r = scrollingLogic;
        this.f1824s = ref$LongRef;
        this.f1825t = j2;
    }

    @Override // u7.p
    public final Object R(i iVar, p7.c<? super n> cVar) {
        return ((ScrollingLogic$doFlingAnimation$2) a(iVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.f1823r, this.f1824s, this.f1825t, cVar);
        scrollingLogic$doFlingAnimation$2.f1822q = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        ScrollingLogic scrollingLogic;
        Ref$LongRef ref$LongRef;
        float c;
        long j2;
        ScrollingLogic scrollingLogic2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1821p;
        Orientation orientation = Orientation.Horizontal;
        int i11 = 1;
        if (i10 != 0) {
            if (i10 == 1) {
                j2 = this.f1820o;
                ref$LongRef = this.n;
                scrollingLogic = this.f1819m;
                scrollingLogic2 = (ScrollingLogic) this.f1822q;
                m0.b.n1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            m0.b.n1(obj);
            scrollingLogic = this.f1823r;
            a aVar = new a(scrollingLogic, new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(scrollingLogic, (i) this.f1822q));
            t.c cVar = scrollingLogic.f1814e;
            ref$LongRef = this.f1824s;
            long j10 = ref$LongRef.f13059i;
            Orientation orientation2 = scrollingLogic.f1811a;
            long j11 = this.f1825t;
            if (orientation2 == orientation) {
                c = k.b(j11);
            } else {
                c = k.c(j11);
            }
            if (scrollingLogic.f1812b) {
                c *= -1;
            }
            this.f1822q = scrollingLogic;
            this.f1819m = scrollingLogic;
            this.n = ref$LongRef;
            this.f1820o = j10;
            this.f1821p = 1;
            obj = cVar.a(aVar, c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            j2 = j10;
            scrollingLogic2 = scrollingLogic;
        }
        float floatValue = ((Number) obj).floatValue();
        if (scrollingLogic2.f1812b) {
            floatValue *= -1;
        }
        Orientation orientation3 = scrollingLogic.f1811a;
        float f10 = 0.0f;
        if (orientation3 == orientation) {
            i11 = 2;
        } else {
            f10 = floatValue;
            floatValue = 0.0f;
        }
        ref$LongRef.f13059i = k.a(j2, floatValue, f10, i11);
        return n.f16010a;
    }
}
