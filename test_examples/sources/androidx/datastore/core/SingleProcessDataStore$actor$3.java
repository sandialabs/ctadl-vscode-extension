package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.preferences.PreferencesProto$Value;
import j3.e;
import j3.g;
import j3.i;
import j3.j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Landroidx/datastore/core/SingleProcessDataStore$a;", "msg", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SingleProcessDataStore$actor$3 extends SuspendLambda implements p<SingleProcessDataStore.a<Object>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f4694m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<Object> f4695o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<Object> singleProcessDataStore, p7.c<? super SingleProcessDataStore$actor$3> cVar) {
        super(2, cVar);
        this.f4695o = singleProcessDataStore;
    }

    @Override // u7.p
    public final Object R(SingleProcessDataStore.a<Object> aVar, p7.c<? super n> cVar) {
        return ((SingleProcessDataStore$actor$3) a(aVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.f4695o, cVar);
        singleProcessDataStore$actor$3.n = obj;
        return singleProcessDataStore$actor$3;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object g10;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4694m;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            SingleProcessDataStore.a aVar = (SingleProcessDataStore.a) this.n;
            boolean z10 = aVar instanceof SingleProcessDataStore.a.C0033a;
            SingleProcessDataStore<Object> singleProcessDataStore = this.f4695o;
            if (z10) {
                SingleProcessDataStore.a.C0033a c0033a = (SingleProcessDataStore.a.C0033a) aVar;
                this.f4694m = 1;
                i iVar = (i) singleProcessDataStore.f4682h.getValue();
                if (!(iVar instanceof j3.b)) {
                    if (iVar instanceof g) {
                        if (iVar == c0033a.f4688a && (g10 = singleProcessDataStore.g(this)) == obj2) {
                            if (g10 == obj2) {
                                return obj2;
                            }
                        }
                    } else if (v7.g.a(iVar, j.f12672a)) {
                        g10 = singleProcessDataStore.g(this);
                        if (g10 == obj2) {
                            if (g10 == obj2) {
                            }
                        }
                    } else if (iVar instanceof e) {
                        throw new IllegalStateException("Can't read in final state.".toString());
                    }
                }
                g10 = n.f16010a;
                if (g10 == obj2) {
                }
            } else if (aVar instanceof SingleProcessDataStore.a.b) {
                this.f4694m = 2;
                if (SingleProcessDataStore.c(singleProcessDataStore, (SingleProcessDataStore.a.b) aVar, this) == obj2) {
                    return obj2;
                }
            }
        }
        return n.f16010a;
    }
}
