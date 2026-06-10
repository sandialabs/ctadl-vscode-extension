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
@c(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = {119, 121}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements p<j<? super View>, p7.c<? super n>, Object> {

    /* renamed from: k  reason: collision with root package name */
    public ViewGroup f4625k;

    /* renamed from: l  reason: collision with root package name */
    public View f4626l;

    /* renamed from: m  reason: collision with root package name */
    public int f4627m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f4628o;

    /* renamed from: p  reason: collision with root package name */
    public /* synthetic */ Object f4629p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4630q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, p7.c<? super ViewGroupKt$descendants$1> cVar) {
        super(2, cVar);
        this.f4630q = viewGroup;
    }

    @Override // u7.p
    public final Object R(j<? super View> jVar, p7.c<? super n> cVar) {
        return ((ViewGroupKt$descendants$1) a(jVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.f4630q, cVar);
        viewGroupKt$descendants$1.f4629p = obj;
        return viewGroupKt$descendants$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:25:0x00a5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ad -> B:27:0x00b2). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        j jVar;
        ViewGroup viewGroup;
        int childCount;
        int i10;
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1;
        CoroutineSingletons coroutineSingletons;
        ViewGroupKt$descendants$1 viewGroupKt$descendants$12;
        CoroutineSingletons coroutineSingletons2;
        j jVar2;
        ViewGroup viewGroup2;
        View view;
        int i11;
        int i12;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.f4628o;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    i12 = this.n;
                    i11 = this.f4627m;
                    ViewGroup viewGroup3 = this.f4625k;
                    j jVar3 = (j) this.f4629p;
                    b.n1(obj);
                    viewGroupKt$descendants$12 = this;
                    coroutineSingletons2 = coroutineSingletons3;
                    coroutineSingletons = coroutineSingletons2;
                    j jVar4 = jVar3;
                    viewGroupKt$descendants$1 = viewGroupKt$descendants$12;
                    jVar = jVar4;
                    ViewGroup viewGroup4 = viewGroup3;
                    int i14 = i12;
                    viewGroup = viewGroup4;
                    int i15 = i14;
                    i10 = i11 + 1;
                    childCount = i15;
                    if (i10 >= childCount) {
                        View childAt = viewGroup.getChildAt(i10);
                        g.e(childAt, "getChildAt(index)");
                        viewGroupKt$descendants$1.f4629p = jVar;
                        viewGroupKt$descendants$1.f4625k = viewGroup;
                        viewGroupKt$descendants$1.f4626l = childAt;
                        viewGroupKt$descendants$1.f4627m = i10;
                        viewGroupKt$descendants$1.n = childCount;
                        viewGroupKt$descendants$1.f4628o = 1;
                        jVar.a(childAt, viewGroupKt$descendants$1);
                        if (coroutineSingletons3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        CoroutineSingletons coroutineSingletons4 = coroutineSingletons;
                        jVar2 = jVar;
                        viewGroupKt$descendants$12 = viewGroupKt$descendants$1;
                        viewGroup2 = viewGroup;
                        i12 = childCount;
                        i11 = i10;
                        view = childAt;
                        coroutineSingletons2 = coroutineSingletons4;
                        if (!(view instanceof ViewGroup)) {
                            ViewGroup viewGroup5 = (ViewGroup) view;
                            g.f(viewGroup5, "<this>");
                            ViewGroupKt$descendants$1 viewGroupKt$descendants$13 = new ViewGroupKt$descendants$1(viewGroup5, null);
                            viewGroupKt$descendants$12.f4629p = jVar2;
                            viewGroupKt$descendants$12.f4625k = viewGroup2;
                            viewGroupKt$descendants$12.f4626l = null;
                            viewGroupKt$descendants$12.f4627m = i11;
                            viewGroupKt$descendants$12.n = i12;
                            viewGroupKt$descendants$12.f4628o = 2;
                            jVar2.getClass();
                            i iVar = new i();
                            iVar.f11305l = b.P(iVar, iVar, viewGroupKt$descendants$13);
                            Object c = jVar2.c(iVar, viewGroupKt$descendants$12);
                            if (c != coroutineSingletons3) {
                                c = n.f16010a;
                            }
                            if (c == coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            viewGroup3 = viewGroup2;
                            jVar3 = jVar2;
                            coroutineSingletons = coroutineSingletons2;
                            j jVar42 = jVar3;
                            viewGroupKt$descendants$1 = viewGroupKt$descendants$12;
                            jVar = jVar42;
                            ViewGroup viewGroup42 = viewGroup3;
                            int i142 = i12;
                            viewGroup = viewGroup42;
                            int i152 = i142;
                            i10 = i11 + 1;
                            childCount = i152;
                            if (i10 >= childCount) {
                                return n.f16010a;
                            }
                        } else {
                            i142 = i12;
                            viewGroup = viewGroup2;
                            viewGroupKt$descendants$1 = viewGroupKt$descendants$12;
                            jVar = jVar2;
                            coroutineSingletons = coroutineSingletons2;
                            int i1522 = i142;
                            i10 = i11 + 1;
                            childCount = i1522;
                            if (i10 >= childCount) {
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i12 = this.n;
                i11 = this.f4627m;
                view = this.f4626l;
                viewGroup2 = this.f4625k;
                jVar2 = (j) this.f4629p;
                b.n1(obj);
                viewGroupKt$descendants$12 = this;
                coroutineSingletons2 = coroutineSingletons3;
                if (!(view instanceof ViewGroup)) {
                }
            }
        } else {
            b.n1(obj);
            jVar = (j) this.f4629p;
            viewGroup = this.f4630q;
            childCount = viewGroup.getChildCount();
            i10 = 0;
            viewGroupKt$descendants$1 = this;
            coroutineSingletons = coroutineSingletons3;
            if (i10 >= childCount) {
            }
        }
    }
}
