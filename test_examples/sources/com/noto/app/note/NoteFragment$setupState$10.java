package com.noto.app.note;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.airbnb.epoxy.n0;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.note.NoteFragment;
import com.noto.app.util.ViewUtilsKt;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import s6.b0;
import u7.q;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u008a@"}, d2 = {"Lt6/a;", "folder", "", "Lt6/c;", "", "labels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$10", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$10 extends SuspendLambda implements q<t6.a, Map<t6.c, ? extends Boolean>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f9065m;
    public /* synthetic */ Map n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f9066o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9067p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.NoteFragment$setupState$10$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Map<t6.c, Boolean> f9068j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ b0 f9069k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ t6.a f9070l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ NoteFragment f9071m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<t6.c, Boolean> map, b0 b0Var, t6.a aVar, NoteFragment noteFragment) {
            super(1);
            this.f9068j = map;
            this.f9069k = b0Var;
            this.f9070l = aVar;
            this.f9071m = noteFragment;
        }

        @Override // u7.l
        public final m7.n U(com.airbnb.epoxy.m mVar) {
            com.airbnb.epoxy.m mVar2 = mVar;
            v7.g.f(mVar2, "$this$withModels");
            final b0 b0Var = this.f9069k;
            mVar2.addModelBuildListener(new n0() { // from class: a7.p
                @Override // com.airbnb.epoxy.n0
                public final void a(com.airbnb.epoxy.j jVar) {
                    s6.b0 b0Var2 = s6.b0.this;
                    v7.g.f(b0Var2, "$this_setupState");
                    jVar.a(new b0(b0Var2));
                }
            });
            Iterator<Map.Entry<t6.c, Boolean>> it = this.f9068j.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                t6.a aVar = this.f9070l;
                final NoteFragment noteFragment = this.f9071m;
                if (hasNext) {
                    final Map.Entry<t6.c, Boolean> next = it.next();
                    y6.i iVar = new y6.i();
                    iVar.J(next.getKey().f17615a);
                    iVar.L(next.getKey());
                    iVar.K(next.getValue().booleanValue());
                    iVar.I(aVar.f17595e);
                    iVar.M(new f(0, noteFragment, next));
                    iVar.N(new View.OnLongClickListener() { // from class: a7.q
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            NoteFragment noteFragment2 = NoteFragment.this;
                            v7.g.f(noteFragment2, "this$0");
                            Map.Entry entry = next;
                            v7.g.f(entry, "$entry");
                            NavController g10 = ViewUtilsKt.g(noteFragment2);
                            if (g10 != null) {
                                int i10 = NoteFragment.f9026f0;
                                ViewUtilsKt.o(g10, new u(noteFragment2.a0().f348a, ((t6.c) entry.getKey()).f17615a), null);
                                return true;
                            }
                            return true;
                        }
                    });
                    mVar2.add(iVar);
                } else {
                    y6.q qVar = new y6.q();
                    qVar.l("new");
                    NotoColor notoColor = aVar.f17595e;
                    qVar.p();
                    v7.g.f(notoColor, "<set-?>");
                    qVar.f18925k = notoColor;
                    g gVar = new g(0, noteFragment);
                    qVar.p();
                    qVar.f18926l = gVar;
                    mVar2.add(qVar);
                    return m7.n.f16010a;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$10(b0 b0Var, NoteFragment noteFragment, p7.c<? super NoteFragment$setupState$10> cVar) {
        super(3, cVar);
        this.f9066o = b0Var;
        this.f9067p = noteFragment;
    }

    @Override // u7.q
    public final Object O(t6.a aVar, Map<t6.c, ? extends Boolean> map, p7.c<? super m7.n> cVar) {
        NoteFragment$setupState$10 noteFragment$setupState$10 = new NoteFragment$setupState$10(this.f9066o, this.f9067p, cVar);
        noteFragment$setupState$10.f9065m = aVar;
        noteFragment$setupState$10.n = map;
        return noteFragment$setupState$10.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        t6.a aVar = this.f9065m;
        Map map = this.n;
        b0 b0Var = this.f9066o;
        b0Var.f17304k.p0(new AnonymousClass1(map, b0Var, aVar, this.f9067p));
        return m7.n.f16010a;
    }
}
