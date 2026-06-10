package com.noto.app.label;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import s6.z;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/c;", "label", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.label.NewLabelDialogFragment$setupState$2", f = "NewLabelDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NewLabelDialogFragment$setupState$2 extends SuspendLambda implements p<t6.c, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8775m;
    public final /* synthetic */ z n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewLabelDialogFragment$setupState$2(z zVar, p7.c<? super NewLabelDialogFragment$setupState$2> cVar) {
        super(2, cVar);
        this.n = zVar;
    }

    @Override // u7.p
    public final Object R(t6.c cVar, p7.c<? super n> cVar2) {
        return ((NewLabelDialogFragment$setupState$2) a(cVar, cVar2)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NewLabelDialogFragment$setupState$2 newLabelDialogFragment$setupState$2 = new NewLabelDialogFragment$setupState$2(this.n, cVar);
        newLabelDialogFragment$setupState$2.f8775m = obj;
        return newLabelDialogFragment$setupState$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        t6.c cVar = (t6.c) this.f8775m;
        z zVar = this.n;
        zVar.c.setText(cVar.c);
        zVar.c.setSelection(cVar.c.length());
        return n.f16010a;
    }
}
