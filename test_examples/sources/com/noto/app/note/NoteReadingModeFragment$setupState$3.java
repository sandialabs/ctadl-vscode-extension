package com.noto.app.note;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import s6.l0;
import u7.q;
import z6.a0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u008a@"}, d2 = {"Lt6/a;", "folder", "", "Lt6/c;", "", "labels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteReadingModeFragment$setupState$3", f = "NoteReadingModeFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteReadingModeFragment$setupState$3 extends SuspendLambda implements q<t6.a, Map<t6.c, ? extends Boolean>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f9169m;
    public /* synthetic */ Map n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ l0 f9170o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.NoteReadingModeFragment$setupState$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Map<t6.c, Boolean> f9171j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t6.a f9172k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<t6.c, Boolean> map, t6.a aVar) {
            super(1);
            this.f9171j = map;
            this.f9172k = aVar;
        }

        @Override // u7.l
        public final m7.n U(com.airbnb.epoxy.m mVar) {
            com.airbnb.epoxy.m mVar2 = mVar;
            v7.g.f(mVar2, "$this$withModels");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<t6.c, Boolean> entry : this.f9171j.entrySet()) {
                if (entry.getValue().booleanValue()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                y6.i iVar = new y6.i();
                iVar.J(((t6.c) entry2.getKey()).f17615a);
                iVar.L((t6.c) entry2.getKey());
                iVar.K(((Boolean) entry2.getValue()).booleanValue());
                iVar.I(this.f9172k.f17595e);
                iVar.M(new View.OnClickListener() { // from class: a7.k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
                iVar.N(new a0());
                mVar2.add(iVar);
            }
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteReadingModeFragment$setupState$3(l0 l0Var, p7.c<? super NoteReadingModeFragment$setupState$3> cVar) {
        super(3, cVar);
        this.f9170o = l0Var;
    }

    @Override // u7.q
    public final Object O(t6.a aVar, Map<t6.c, ? extends Boolean> map, p7.c<? super m7.n> cVar) {
        NoteReadingModeFragment$setupState$3 noteReadingModeFragment$setupState$3 = new NoteReadingModeFragment$setupState$3(this.f9170o, cVar);
        noteReadingModeFragment$setupState$3.f9169m = aVar;
        noteReadingModeFragment$setupState$3.n = map;
        return noteReadingModeFragment$setupState$3.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        t6.a aVar = this.f9169m;
        this.f9170o.c.p0(new AnonymousClass1(this.n, aVar));
        return m7.n.f16010a;
    }
}
