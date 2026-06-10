package com.noto.app.label;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import s6.t;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/c;", "label", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.label.LabelDialogFragment$setupState$2", f = "LabelDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LabelDialogFragment$setupState$2 extends SuspendLambda implements p<t6.c, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8740m;
    public final /* synthetic */ t n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ LabelDialogFragment f8741o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelDialogFragment$setupState$2(t tVar, LabelDialogFragment labelDialogFragment, p7.c<? super LabelDialogFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = tVar;
        this.f8741o = labelDialogFragment;
    }

    @Override // u7.p
    public final Object R(t6.c cVar, p7.c<? super n> cVar2) {
        return ((LabelDialogFragment$setupState$2) a(cVar, cVar2)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        LabelDialogFragment$setupState$2 labelDialogFragment$setupState$2 = new LabelDialogFragment$setupState$2(this.n, this.f8741o, cVar);
        labelDialogFragment$setupState$2.f8740m = obj;
        return labelDialogFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        ColorStateList colorStateList;
        m0.b.n1(obj);
        t tVar = this.n;
        ((MaterialTextView) tVar.f17473e.f17476b).setText(((t6.c) this.f8740m).c);
        MaterialTextView materialTextView = (MaterialTextView) tVar.f17473e.f17476b;
        Context j2 = this.f8741o.j();
        if (j2 != null) {
            colorStateList = q.h(q.a(j2, R.attr.notoBackgroundColor));
        } else {
            colorStateList = null;
        }
        materialTextView.setBackgroundTintList(colorStateList);
        return n.f16010a;
    }
}
