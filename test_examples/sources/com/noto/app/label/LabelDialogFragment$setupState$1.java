package com.noto.app.label;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import s6.t;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.label.LabelDialogFragment$setupState$1", f = "LabelDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LabelDialogFragment$setupState$1 extends SuspendLambda implements p<t6.a, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8738m;
    public final /* synthetic */ LabelDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ t f8739o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelDialogFragment$setupState$1(t tVar, LabelDialogFragment labelDialogFragment, p7.c cVar) {
        super(2, cVar);
        this.n = labelDialogFragment;
        this.f8739o = tVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super n> cVar) {
        return ((LabelDialogFragment$setupState$1) a(aVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        LabelDialogFragment$setupState$1 labelDialogFragment$setupState$1 = new LabelDialogFragment$setupState$1(this.f8739o, this.n, cVar);
        labelDialogFragment$setupState$1.f8738m = obj;
        return labelDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8738m;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            ColorStateList h10 = q.h(b5);
            t tVar = this.f8739o;
            Drawable background = tVar.f17470a.f17312d.getBackground();
            if (background != null && (mutate = background.mutate()) != null) {
                mutate.setTint(b5);
            }
            tVar.f17470a.c.setTextColor(b5);
            for (MaterialTextView materialTextView : a1.c.O0(tVar.c, tVar.f17472d, tVar.f17471b)) {
                Drawable background2 = materialTextView.getBackground();
                g.e(background2, "tv.background");
                ViewUtilsKt.s(background2, h10);
            }
        }
        return n.f16010a;
    }
}
