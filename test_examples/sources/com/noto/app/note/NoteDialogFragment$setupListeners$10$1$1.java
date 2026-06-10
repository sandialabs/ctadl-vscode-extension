package com.noto.app.note;

import android.app.AlarmManager;
import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm7/n;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteDialogFragment$setupListeners$10$1$1 extends Lambda implements u7.l<Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteDialogFragment f9003j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Context f9004k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.NoteDialogFragment$setupListeners$10$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Context f9005j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ NoteDialogFragment f9006k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, NoteDialogFragment noteDialogFragment) {
            super(1);
            this.f9005j = context;
            this.f9006k = noteDialogFragment;
        }

        @Override // u7.l
        public final m7.n U(Throwable th) {
            Throwable th2 = th;
            Context context = this.f9005j;
            v7.g.e(context, "context");
            a1.c.W1(context);
            a1.c.Y1(context);
            this.f9006k.Z();
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDialogFragment$setupListeners$10$1$1(Context context, NoteDialogFragment noteDialogFragment) {
        super(1);
        this.f9003j = noteDialogFragment;
        this.f9004k = context;
    }

    @Override // u7.l
    public final m7.n U(Integer num) {
        AlarmManager alarmManager;
        Integer num2 = num;
        int i10 = NoteDialogFragment.C0;
        NoteDialogFragment noteDialogFragment = this.f9003j;
        View k02 = noteDialogFragment.k0();
        Context context = this.f9004k;
        if (k02 != null) {
            v7.g.e(context, "context");
            ViewUtilsKt.w(k02, q.e(context, R.plurals.note_is_deleted, 1, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_delete_24), noteDialogFragment.g0(), noteDialogFragment.j0(), 16);
        }
        NavController g10 = ViewUtilsKt.g(noteDialogFragment);
        if (g10 != null) {
            g10.l(noteDialogFragment.h0().c, false);
        }
        if (((t6.d) noteDialogFragment.l0().h().getValue()).f17628i != null && (alarmManager = (AlarmManager) noteDialogFragment.f8986x0.getValue()) != null) {
            v7.g.e(context, "context");
            a1.c.U(alarmManager, context, ((t6.d) noteDialogFragment.l0().h().getValue()).f17621a);
        }
        NoteViewModel l02 = noteDialogFragment.l0();
        l02.getClass();
        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$deleteNote$1(l02, null), 3).O(new AnonymousClass1(context, noteDialogFragment));
        return m7.n.f16010a;
    }
}
