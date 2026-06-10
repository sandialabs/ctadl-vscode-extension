package com.noto.app.note;

import android.view.Menu;
import android.view.MenuItem;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/d;", "note", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$6", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$6 extends SuspendLambda implements u7.p<t6.d, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9103m;
    public final /* synthetic */ b0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$6(b0 b0Var, p7.c<? super NoteFragment$setupState$6> cVar) {
        super(2, cVar);
        this.n = b0Var;
    }

    @Override // u7.p
    public final Object R(t6.d dVar, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$6) a(dVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteFragment$setupState$6 noteFragment$setupState$6 = new NoteFragment$setupState$6(this.n, cVar);
        noteFragment$setupState$6.f9103m = obj;
        return noteFragment$setupState$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        MenuItem findItem;
        m0.b.n1(obj);
        if (((t6.d) this.f9103m).f17628i == null) {
            i10 = R.drawable.ic_round_notification_add_24;
        } else {
            i10 = R.drawable.ic_round_edit_notifications_24;
        }
        Menu menu = this.n.f17296b.getMenu();
        if (menu != null && (findItem = menu.findItem(R.id.add_reminder)) != null) {
            findItem.setIcon(i10);
        }
        return m7.n.f16010a;
    }
}
