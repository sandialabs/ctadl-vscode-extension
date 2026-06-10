package kotlinx.coroutines;

import androidx.datastore.preferences.PreferencesProto$Value;
import ja.v;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import u7.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$a;", "element", "invoke", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$a;)Lkotlin/coroutines/CoroutineContext;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CoroutineContextKt$foldCopies$folded$1 extends Lambda implements p<CoroutineContext, CoroutineContext.a, CoroutineContext> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef<CoroutineContext> f15144j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ boolean f15145k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineContextKt$foldCopies$folded$1(Ref$ObjectRef<CoroutineContext> ref$ObjectRef, boolean z10) {
        super(2);
        this.f15144j = ref$ObjectRef;
        this.f15145k = z10;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.coroutines.CoroutineContext] */
    @Override // u7.p
    public final CoroutineContext R(CoroutineContext coroutineContext, CoroutineContext.a aVar) {
        v vVar;
        CoroutineContext coroutineContext2 = coroutineContext;
        CoroutineContext.a aVar2 = aVar;
        if (aVar2 instanceof v) {
            Ref$ObjectRef<CoroutineContext> ref$ObjectRef = this.f15144j;
            if (ref$ObjectRef.f13060i.a(aVar2.getKey()) == null) {
                v vVar2 = (v) aVar2;
                vVar = vVar2;
                if (this.f15145k) {
                    vVar = vVar2.p();
                }
            } else {
                ref$ObjectRef.f13060i = ref$ObjectRef.f13060i.N(aVar2.getKey());
                vVar = ((v) aVar2).I();
            }
        } else {
            vVar = aVar2;
        }
        return coroutineContext2.m(vVar);
    }
}
