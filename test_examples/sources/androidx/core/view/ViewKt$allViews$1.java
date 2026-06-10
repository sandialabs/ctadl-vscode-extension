package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.preferences.PreferencesProto$Value;
import ga.i;
import ga.j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lga/j;", "Landroid/view/View;", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@c(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {414, 416}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements p<j<? super View>, p7.c<? super n>, Object> {

    /* renamed from: k  reason: collision with root package name */
    public int f4631k;

    /* renamed from: l  reason: collision with root package name */
    public /* synthetic */ Object f4632l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ View f4633m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, p7.c<? super ViewKt$allViews$1> cVar) {
        super(2, cVar);
        this.f4633m = view;
    }

    @Override // u7.p
    public final Object R(j<? super View> jVar, p7.c<? super n> cVar) {
        return ((ViewKt$allViews$1) a(jVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f4633m, cVar);
        viewKt$allViews$1.f4632l = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f4631k;
        View view = this.f4633m;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    b.n1(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                j jVar = (j) this.f4632l;
                b.n1(obj);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    g.f(viewGroup, "<this>");
                    ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(viewGroup, null);
                    this.f4632l = null;
                    this.f4631k = 2;
                    jVar.getClass();
                    i iVar = new i();
                    iVar.f11305l = b.P(iVar, iVar, viewGroupKt$descendants$1);
                    Object c = jVar.c(iVar, this);
                    if (c != coroutineSingletons) {
                        c = n.f16010a;
                    }
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return n.f16010a;
        }
        b.n1(obj);
        j jVar2 = (j) this.f4632l;
        this.f4632l = jVar2;
        this.f4631k = 1;
        jVar2.a(view, this);
        return coroutineSingletons;
    }
}
