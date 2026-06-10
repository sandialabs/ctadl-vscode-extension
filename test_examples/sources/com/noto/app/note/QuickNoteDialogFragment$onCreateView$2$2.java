package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import s6.o0;
import u7.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u008a@"}, d2 = {"Lt6/a;", "folder", "", "Lt6/c;", "", "labels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.QuickNoteDialogFragment$onCreateView$2$2", f = "QuickNoteDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class QuickNoteDialogFragment$onCreateView$2$2 extends SuspendLambda implements q<t6.a, Map<t6.c, ? extends Boolean>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f9354m;
    public /* synthetic */ Map n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ o0 f9355o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ QuickNoteDialogFragment f9356p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.QuickNoteDialogFragment$onCreateView$2$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Map<t6.c, Boolean> f9357j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t6.a f9358k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ QuickNoteDialogFragment f9359l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<t6.c, Boolean> map, t6.a aVar, QuickNoteDialogFragment quickNoteDialogFragment) {
            super(1);
            this.f9357j = map;
            this.f9358k = aVar;
            this.f9359l = quickNoteDialogFragment;
        }

        @Override // u7.l
        public final m7.n U(com.airbnb.epoxy.m mVar) {
            com.airbnb.epoxy.m mVar2 = mVar;
            v7.g.f(mVar2, "$this$withModels");
            for (Map.Entry<t6.c, Boolean> entry : this.f9357j.entrySet()) {
                y6.i iVar = new y6.i();
                iVar.J(entry.getKey().f17615a);
                iVar.L(entry.getKey());
                iVar.K(entry.getValue().booleanValue());
                iVar.I(this.f9358k.f17595e);
                iVar.M(new o(entry, this.f9359l));
                iVar.N(p.f9424i);
                mVar2.add(iVar);
            }
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickNoteDialogFragment$onCreateView$2$2(o0 o0Var, QuickNoteDialogFragment quickNoteDialogFragment, p7.c<? super QuickNoteDialogFragment$onCreateView$2$2> cVar) {
        super(3, cVar);
        this.f9355o = o0Var;
        this.f9356p = quickNoteDialogFragment;
    }

    @Override // u7.q
    public final Object O(t6.a aVar, Map<t6.c, ? extends Boolean> map, p7.c<? super m7.n> cVar) {
        QuickNoteDialogFragment$onCreateView$2$2 quickNoteDialogFragment$onCreateView$2$2 = new QuickNoteDialogFragment$onCreateView$2$2(this.f9355o, this.f9356p, cVar);
        quickNoteDialogFragment$onCreateView$2$2.f9354m = aVar;
        quickNoteDialogFragment$onCreateView$2$2.n = map;
        return quickNoteDialogFragment$onCreateView$2$2.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        t6.a aVar = this.f9354m;
        this.f9355o.f17446d.p0(new AnonymousClass1(this.n, aVar, this.f9356p));
        return m7.n.f16010a;
    }
}
