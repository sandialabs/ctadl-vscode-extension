package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteViewModel$copyNote$1$1$1", f = "NoteViewModel.kt", l = {160, 161}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class NoteViewModel$copyNote$1$1$1 extends SuspendLambda implements u7.p<x, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9290m;
    public final /* synthetic */ NoteViewModel n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ long f9291o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ t6.c f9292p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ long f9293q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteViewModel$copyNote$1$1$1(NoteViewModel noteViewModel, long j2, t6.c cVar, long j10, p7.c<? super NoteViewModel$copyNote$1$1$1> cVar2) {
        super(2, cVar2);
        this.n = noteViewModel;
        this.f9291o = j2;
        this.f9292p = cVar;
        this.f9293q = j10;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super m7.n> cVar) {
        return ((NoteViewModel$copyNote$1$1$1) a(xVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        return new NoteViewModel$copyNote$1$1$1(this.n, this.f9291o, this.f9292p, this.f9293q, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9290m;
        NoteViewModel noteViewModel = this.n;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    m0.b.n1(obj);
                    return m7.n.f16010a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0.b.n1(obj);
        } else {
            m0.b.n1(obj);
            u6.b bVar = noteViewModel.f9260f;
            this.f9290m = 1;
            obj = ModelUtilsKt.n(bVar, this.f9291o, this.f9292p, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        long longValue = ((Number) obj).longValue();
        u6.c cVar = noteViewModel.f9261g;
        t6.e eVar = new t6.e(this.f9293q, longValue);
        this.f9290m = 2;
        if (cVar.c(eVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return m7.n.f16010a;
    }
}
