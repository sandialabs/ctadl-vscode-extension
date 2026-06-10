package com.noto.app.label;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import q7.c;
import s6.z;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.label.NewLabelDialogFragment$setupState$1", f = "NewLabelDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NewLabelDialogFragment$setupState$1 extends SuspendLambda implements p<t6.a, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8773m;
    public final /* synthetic */ NewLabelDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ z f8774o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewLabelDialogFragment$setupState$1(NewLabelDialogFragment newLabelDialogFragment, z zVar, p7.c<? super NewLabelDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = newLabelDialogFragment;
        this.f8774o = zVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super n> cVar) {
        return ((NewLabelDialogFragment$setupState$1) a(aVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NewLabelDialogFragment$setupState$1 newLabelDialogFragment$setupState$1 = new NewLabelDialogFragment$setupState$1(this.n, this.f8774o, cVar);
        newLabelDialogFragment$setupState$1.f8773m = obj;
        return newLabelDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Drawable mutate;
        Drawable mutate2;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8773m;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = q.b(j2, q.j(aVar.f17595e));
            z zVar = this.f8774o;
            zVar.f17499d.c.setTextColor(b5);
            Drawable background = zVar.f17499d.f17312d.getBackground();
            if (background != null && (mutate2 = background.mutate()) != null) {
                mutate2.setTint(b5);
            }
            Drawable background2 = zVar.f17498b.getBackground();
            if (background2 != null && (mutate = background2.mutate()) != null) {
                mutate.setTint(b5);
            }
        }
        return n.f16010a;
    }
}
