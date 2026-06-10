package com.noto.app.note;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.noto.app.util.ViewUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.k0;
import u7.q;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"", "", "noteIds", "selectedId", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NotePagerFragment$setupState$2", f = "NotePagerFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NotePagerFragment$setupState$2 extends SuspendLambda implements q<List<? extends Long>, Long, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ List f9123m;
    public /* synthetic */ long n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ k0 f9124o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NotePagerFragment f9125p;

    /* loaded from: classes.dex */
    public static final class a extends FragmentStateAdapter {

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ NotePagerFragment f9126l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ List<Long> f9127m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NotePagerFragment notePagerFragment, List<Long> list) {
            super(notePagerFragment);
            this.f9126l = notePagerFragment;
            this.f9127m = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int d() {
            return this.f9127m.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public final NoteReadingModeFragment u(int i10) {
            NoteReadingModeFragment noteReadingModeFragment = new NoteReadingModeFragment();
            int i11 = NotePagerFragment.f9109i0;
            noteReadingModeFragment.W(a1.b.n(new Pair("folder_id", Long.valueOf(this.f9126l.Z().f298a)), new Pair("note_id", this.f9127m.get(i10))));
            return noteReadingModeFragment;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePagerFragment$setupState$2(k0 k0Var, NotePagerFragment notePagerFragment, p7.c<? super NotePagerFragment$setupState$2> cVar) {
        super(3, cVar);
        this.f9124o = k0Var;
        this.f9125p = notePagerFragment;
    }

    @Override // u7.q
    public final Object O(List<? extends Long> list, Long l2, p7.c<? super m7.n> cVar) {
        long longValue = l2.longValue();
        NotePagerFragment$setupState$2 notePagerFragment$setupState$2 = new NotePagerFragment$setupState$2(this.f9124o, this.f9125p, cVar);
        notePagerFragment$setupState$2.f9123m = list;
        notePagerFragment$setupState$2.n = longValue;
        return notePagerFragment$setupState$2.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        boolean z10;
        m0.b.n1(obj);
        List list = this.f9123m;
        long j2 = this.n;
        k0 k0Var = this.f9124o;
        RecyclerView.Adapter adapter = k0Var.f17411g.getAdapter();
        ViewPager2 viewPager2 = k0Var.f17411g;
        boolean z11 = true;
        if (adapter == null && (!list.isEmpty())) {
            NotePagerFragment notePagerFragment = this.f9125p;
            a aVar = new a(notePagerFragment, list);
            v7.g.e(viewPager2, "vp");
            viewPager2.setAdapter(aVar);
            notePagerFragment.f9114h0 = aVar;
        }
        int indexOf = list.indexOf(new Long(j2));
        if (kotlin.collections.c.q2(indexOf - 1, list) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (kotlin.collections.c.q2(indexOf + 1, list) == null) {
            z11 = false;
        }
        viewPager2.setCurrentItem(indexOf);
        FloatingActionButton floatingActionButton = k0Var.f17409e;
        v7.g.e(floatingActionButton, "fabPrevious");
        if (z10) {
            ViewUtilsKt.d(floatingActionButton);
        } else {
            ViewUtilsKt.c(floatingActionButton);
        }
        FloatingActionButton floatingActionButton2 = k0Var.f17408d;
        v7.g.e(floatingActionButton2, "fabNext");
        if (z11) {
            ViewUtilsKt.d(floatingActionButton2);
        } else {
            ViewUtilsKt.c(floatingActionButton2);
        }
        return m7.n.f16010a;
    }
}
