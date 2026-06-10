package com.noto.app.label;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import s6.w;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.label.ReorderLabelDialogFragment$setupState$1", f = "ReorderLabelDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ReorderLabelDialogFragment$setupState$1 extends SuspendLambda implements p<t6.a, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8790m;
    public final /* synthetic */ ReorderLabelDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ w f8791o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderLabelDialogFragment$setupState$1(ReorderLabelDialogFragment reorderLabelDialogFragment, w wVar, p7.c<? super ReorderLabelDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = reorderLabelDialogFragment;
        this.f8791o = wVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super n> cVar) {
        return ((ReorderLabelDialogFragment$setupState$1) a(aVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ReorderLabelDialogFragment$setupState$1 reorderLabelDialogFragment$setupState$1 = new ReorderLabelDialogFragment$setupState$1(this.n, this.f8791o, cVar);
        reorderLabelDialogFragment$setupState$1.f8790m = obj;
        return reorderLabelDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8790m;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            w wVar = this.f8791o;
            wVar.f17480b.c.setTextColor(b5);
            Drawable background = wVar.f17480b.f17312d.getBackground();
            if (background != null && (mutate = background.mutate()) != null) {
                mutate.setTint(b5);
            }
        }
        return n.f16010a;
    }
}
