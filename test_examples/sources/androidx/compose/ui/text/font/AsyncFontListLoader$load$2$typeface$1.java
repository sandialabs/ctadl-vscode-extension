package androidx.compose.ui.text.font;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u1.d;
import u7.l;

@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {273}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements l<p7.c<? super Object>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f4099m;
    public final /* synthetic */ AsyncFontListLoader n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ d f4100o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, d dVar, p7.c<? super AsyncFontListLoader$load$2$typeface$1> cVar) {
        super(1, cVar);
        this.n = asyncFontListLoader;
        this.f4100o = dVar;
    }

    @Override // u7.l
    public final Object U(p7.c<? super Object> cVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) i(cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> i(p7.c<?> cVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.n, this.f4100o, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4099m;
        if (i10 == 0) {
            m0.b.n1(obj);
            this.f4099m = 1;
            obj = this.n.b(this.f4100o, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            m0.b.n1(obj);
        }
        return obj;
    }
}
