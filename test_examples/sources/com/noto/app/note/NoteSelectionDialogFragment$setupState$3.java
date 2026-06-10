package com.noto.app.note;

import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.note.NoteSelectionDialogFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import s6.n0;
import u7.q;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"Lt6/a;", "folder", "", "Ly6/h;", "labels", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteSelectionDialogFragment$setupState$3", f = "NoteSelectionDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteSelectionDialogFragment$setupState$3 extends SuspendLambda implements q<t6.a, List<? extends y6.h>, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f9250m;
    public /* synthetic */ List n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ n0 f9251o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NoteSelectionDialogFragment f9252p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.NoteSelectionDialogFragment$setupState$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ List<y6.h> f9253j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t6.a f9254k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ NoteSelectionDialogFragment f9255l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<y6.h> list, t6.a aVar, NoteSelectionDialogFragment noteSelectionDialogFragment) {
            super(1);
            this.f9253j = list;
            this.f9254k = aVar;
            this.f9255l = noteSelectionDialogFragment;
        }

        @Override // u7.l
        public final m7.n U(com.airbnb.epoxy.m mVar) {
            com.airbnb.epoxy.m mVar2 = mVar;
            v7.g.f(mVar2, "$this$withModels");
            for (final y6.h hVar : this.f9253j) {
                y6.i iVar = new y6.i();
                iVar.J(hVar.f18912a.f17615a);
                iVar.L(hVar.f18912a);
                iVar.K(hVar.f18913b);
                iVar.I(this.f9254k.f17595e);
                final NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9255l;
                iVar.M(new n(hVar, 0, noteSelectionDialogFragment));
                iVar.N(new View.OnLongClickListener() { // from class: a7.n0
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        y6.h hVar2 = y6.h.this;
                        v7.g.f(hVar2, "$model");
                        NoteSelectionDialogFragment noteSelectionDialogFragment2 = noteSelectionDialogFragment;
                        v7.g.f(noteSelectionDialogFragment2, "this$0");
                        boolean z10 = hVar2.f18913b;
                        t6.c cVar = hVar2.f18912a;
                        if (z10) {
                            int i10 = NoteSelectionDialogFragment.B0;
                            noteSelectionDialogFragment2.m0().h(cVar.f17615a);
                            return true;
                        }
                        int i11 = NoteSelectionDialogFragment.B0;
                        noteSelectionDialogFragment2.m0().t(cVar.f17615a);
                        return true;
                    }
                });
                mVar2.add(iVar);
            }
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteSelectionDialogFragment$setupState$3(n0 n0Var, NoteSelectionDialogFragment noteSelectionDialogFragment, p7.c<? super NoteSelectionDialogFragment$setupState$3> cVar) {
        super(3, cVar);
        this.f9251o = n0Var;
        this.f9252p = noteSelectionDialogFragment;
    }

    @Override // u7.q
    public final Object O(t6.a aVar, List<? extends y6.h> list, p7.c<? super m7.n> cVar) {
        NoteSelectionDialogFragment$setupState$3 noteSelectionDialogFragment$setupState$3 = new NoteSelectionDialogFragment$setupState$3(this.f9251o, this.f9252p, cVar);
        noteSelectionDialogFragment$setupState$3.f9250m = aVar;
        noteSelectionDialogFragment$setupState$3.n = list;
        return noteSelectionDialogFragment$setupState$3.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        t6.a aVar = this.f9250m;
        this.f9251o.c.p0(new AnonymousClass1(this.n, aVar, this.f9252p));
        return m7.n.f16010a;
    }
}
