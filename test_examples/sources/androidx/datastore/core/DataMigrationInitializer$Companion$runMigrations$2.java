package androidx.datastore.core;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import u7.l;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0001H\u008a@"}, d2 = {"T", "startingData", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 5, 1})
@c(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements p<Object, p7.c<Object>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public Iterator f4659m;
    public j3.c n;

    /* renamed from: o  reason: collision with root package name */
    public Object f4660o;

    /* renamed from: p  reason: collision with root package name */
    public int f4661p;

    /* renamed from: q  reason: collision with root package name */
    public /* synthetic */ Object f4662q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ List<j3.c<Object>> f4663r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ List<l<p7.c<? super n>, Object>> f4664s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends j3.c<Object>> list, List<l<p7.c<? super n>, Object>> list2, p7.c<? super DataMigrationInitializer$Companion$runMigrations$2> cVar) {
        super(2, cVar);
        this.f4663r = list;
        this.f4664s = list2;
    }

    @Override // u7.p
    public final Object R(Object obj, p7.c<Object> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) a(obj, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.f4663r, this.f4664s, cVar);
        dataMigrationInitializer$Companion$runMigrations$2.f4662q = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:12:0x003b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Iterator it;
        List<l<p7.c<? super n>, Object>> list;
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4661p;
        if (i10 == 0) {
            m0.b.n1(obj);
            obj = this.f4662q;
            it = this.f4663r.iterator();
            list = this.f4664s;
        } else if (i10 == 1) {
            Object obj2 = this.f4660o;
            j3.c cVar = this.n;
            Iterator it2 = this.f4659m;
            List<l<p7.c<? super n>, Object>> list2 = (List) this.f4662q;
            m0.b.n1(obj);
            DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$22 = this;
            if (((Boolean) obj).booleanValue()) {
                obj = obj2;
            } else {
                list2.add(new DataMigrationInitializer$Companion$runMigrations$2$1$1(cVar, null));
                dataMigrationInitializer$Companion$runMigrations$22.f4662q = list2;
                dataMigrationInitializer$Companion$runMigrations$22.f4659m = it2;
                dataMigrationInitializer$Companion$runMigrations$22.n = null;
                dataMigrationInitializer$Companion$runMigrations$22.f4660o = null;
                dataMigrationInitializer$Companion$runMigrations$22.f4661p = 2;
                obj = cVar.c();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            it = it2;
            list = list2;
            dataMigrationInitializer$Companion$runMigrations$2 = dataMigrationInitializer$Companion$runMigrations$22;
            if (it.hasNext()) {
                j3.c cVar2 = (j3.c) it.next();
                dataMigrationInitializer$Companion$runMigrations$2.f4662q = list;
                dataMigrationInitializer$Companion$runMigrations$2.f4659m = it;
                dataMigrationInitializer$Companion$runMigrations$2.n = cVar2;
                dataMigrationInitializer$Companion$runMigrations$2.f4660o = obj;
                dataMigrationInitializer$Companion$runMigrations$2.f4661p = 1;
                Object b5 = cVar2.b();
                if (b5 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                Iterator it3 = it;
                obj2 = obj;
                obj = b5;
                dataMigrationInitializer$Companion$runMigrations$22 = dataMigrationInitializer$Companion$runMigrations$2;
                it2 = it3;
                list2 = list;
                cVar = cVar2;
                if (((Boolean) obj).booleanValue()) {
                }
                it = it2;
                list = list2;
                dataMigrationInitializer$Companion$runMigrations$2 = dataMigrationInitializer$Companion$runMigrations$22;
                if (it.hasNext()) {
                    return obj;
                }
            }
        } else if (i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            it = this.f4659m;
            list = (List) this.f4662q;
            m0.b.n1(obj);
        }
        dataMigrationInitializer$Companion$runMigrations$2 = this;
        if (it.hasNext()) {
        }
    }
}
