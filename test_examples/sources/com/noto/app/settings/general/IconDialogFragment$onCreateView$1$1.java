package com.noto.app.settings.general;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.r;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isScrolling", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.settings.general.IconDialogFragment$onCreateView$1$1", f = "IconDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IconDialogFragment$onCreateView$1$1 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9747m;
    public final /* synthetic */ r n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconDialogFragment$onCreateView$1$1(r rVar, p7.c<? super IconDialogFragment$onCreateView$1$1> cVar) {
        super(2, cVar);
        this.n = rVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((IconDialogFragment$onCreateView$1$1) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        IconDialogFragment$onCreateView$1$1 iconDialogFragment$onCreateView$1$1 = new IconDialogFragment$onCreateView$1$1(this.n, cVar);
        iconDialogFragment$onCreateView$1$1.f9747m = ((Boolean) obj).booleanValue();
        return iconDialogFragment$onCreateView$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        this.n.f17462b.f17311b.setSelected(this.f9747m);
        return n.f16010a;
    }
}
