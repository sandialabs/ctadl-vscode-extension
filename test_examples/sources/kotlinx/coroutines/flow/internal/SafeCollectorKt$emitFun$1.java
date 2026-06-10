package kotlinx.coroutines.flow.internal;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m7.n;
import u7.q;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements q<kotlinx.coroutines.flow.c<? super Object>, Object, p7.c<? super n>, Object> {

    /* renamed from: r  reason: collision with root package name */
    public static final SafeCollectorKt$emitFun$1 f15416r = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, kotlinx.coroutines.flow.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // u7.q
    public final Object O(kotlinx.coroutines.flow.c<? super Object> cVar, Object obj, p7.c<? super n> cVar2) {
        return cVar.c(obj, cVar2);
    }
}
