package com.noto.app.label;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.NotoColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import s6.w;
import u7.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"Lt6/a;", "folder", "", "Lt6/c;", "labels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.label.ReorderLabelDialogFragment$setupState$2", f = "ReorderLabelDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ReorderLabelDialogFragment$setupState$2 extends SuspendLambda implements q<t6.a, List<? extends t6.c>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f8792m;
    public /* synthetic */ List n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ReorderLabelDialogFragment f8793o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ w f8794p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderLabelDialogFragment$setupState$2(ReorderLabelDialogFragment reorderLabelDialogFragment, w wVar, p7.c<? super ReorderLabelDialogFragment$setupState$2> cVar) {
        super(3, cVar);
        this.f8793o = reorderLabelDialogFragment;
        this.f8794p = wVar;
    }

    @Override // u7.q
    public final Object O(t6.a aVar, List<? extends t6.c> list, p7.c<? super n> cVar) {
        ReorderLabelDialogFragment$setupState$2 reorderLabelDialogFragment$setupState$2 = new ReorderLabelDialogFragment$setupState$2(this.f8793o, this.f8794p, cVar);
        reorderLabelDialogFragment$setupState$2.f8792m = aVar;
        reorderLabelDialogFragment$setupState$2.n = list;
        return reorderLabelDialogFragment$setupState$2.k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        t6.a aVar = this.f8792m;
        List list = this.n;
        NotoColor notoColor = aVar.f17595e;
        int i10 = ReorderLabelDialogFragment.f8777x0;
        ReorderLabelDialogFragment reorderLabelDialogFragment = this.f8793o;
        reorderLabelDialogFragment.getClass();
        w wVar = this.f8794p;
        wVar.f17479a.p0(new ReorderLabelDialogFragment$setupLabels$1(reorderLabelDialogFragment, wVar, list, notoColor));
        return n.f16010a;
    }
}
