package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Icon;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.j0;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Icon;", "icon", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigActivity$setupState$10", f = "NoteListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteListWidgetConfigActivity$setupState$10 extends SuspendLambda implements p<Icon, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f10060m;
    public final /* synthetic */ j0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$setupState$10(j0 j0Var, p7.c<? super NoteListWidgetConfigActivity$setupState$10> cVar) {
        super(2, cVar);
        this.n = j0Var;
    }

    @Override // u7.p
    public final Object R(Icon icon, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigActivity$setupState$10) a(icon, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigActivity$setupState$10 noteListWidgetConfigActivity$setupState$10 = new NoteListWidgetConfigActivity$setupState$10(this.n, cVar);
        noteListWidgetConfigActivity$setupState$10.f10060m = obj;
        return noteListWidgetConfigActivity$setupState$10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        this.n.f17403o.f17380b.setImageResource(q.i((Icon) this.f10060m));
        return n.f16010a;
    }
}
