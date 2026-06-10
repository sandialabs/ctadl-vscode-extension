package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Font;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import n6.c;
import s6.n0;
import u7.r;
import x6.h0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@"}, d2 = {"Lt6/a;", "folder", "Ln6/c;", "", "Lx6/h0;", "notesState", "Lcom/noto/app/domain/model/Font;", "font", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteSelectionDialogFragment$setupState$1", f = "NoteSelectionDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteSelectionDialogFragment$setupState$1 extends SuspendLambda implements r<t6.a, n6.c<? extends List<? extends h0>>, Font, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f9237m;
    public /* synthetic */ n6.c n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ Font f9238o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ n0 f9239p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.NoteSelectionDialogFragment$setupState$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ List<h0> f9240j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ n0 f9241k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Font f9242l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ t6.a f9243m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ArrayList arrayList, n0 n0Var, Font font, t6.a aVar) {
            super(1);
            this.f9240j = arrayList;
            this.f9241k = n0Var;
            this.f9242l = font;
            this.f9243m = aVar;
        }

        @Override // u7.l
        public final m7.n U(com.airbnb.epoxy.m mVar) {
            com.airbnb.epoxy.m mVar2 = mVar;
            v7.g.f(mVar2, "$this$withModels");
            for (h0 h0Var : this.f9240j) {
                com.noto.app.folder.r rVar = new com.noto.app.folder.r();
                rVar.Q(h0Var.f18683a.f17621a);
                rVar.W(h0Var);
                rVar.S();
                rVar.a0(this.f9241k.f17431b.getWidth());
                rVar.P(this.f9242l);
                t6.a aVar = this.f9243m;
                rVar.O(aVar.f17595e);
                rVar.b0(aVar.f17598h);
                rVar.V(aVar.f17601k);
                rVar.c0("");
                rVar.R(false);
                rVar.T(false);
                mVar2.add(rVar);
            }
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteSelectionDialogFragment$setupState$1(n0 n0Var, p7.c<? super NoteSelectionDialogFragment$setupState$1> cVar) {
        super(4, cVar);
        this.f9239p = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        t6.a aVar = this.f9237m;
        n6.c cVar = this.n;
        Font font = this.f9238o;
        if (cVar instanceof c.b) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) ((c.b) cVar).f16111a) {
                if (((h0) obj2).c) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(n7.l.Z1(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(h0.a((h0) it.next(), null, false, 0, 11));
            }
            n0 n0Var = this.f9239p;
            n0Var.f17431b.p0(new AnonymousClass1(arrayList2, n0Var, font, aVar));
        }
        return m7.n.f16010a;
    }

    @Override // u7.r
    public final Object l0(t6.a aVar, n6.c<? extends List<? extends h0>> cVar, Font font, p7.c<? super m7.n> cVar2) {
        NoteSelectionDialogFragment$setupState$1 noteSelectionDialogFragment$setupState$1 = new NoteSelectionDialogFragment$setupState$1(this.f9239p, cVar2);
        noteSelectionDialogFragment$setupState$1.f9237m = aVar;
        noteSelectionDialogFragment$setupState$1.n = cVar;
        noteSelectionDialogFragment$setupState$1.f9238o = font;
        return noteSelectionDialogFragment$setupState$1.k(m7.n.f16010a);
    }
}
