package com.noto.app.note;

import android.app.AlarmManager;
import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm7/n;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteSelectionDialogFragment$setupListeners$10$1$1 extends Lambda implements u7.l<Integer, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteSelectionDialogFragment f9221j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Context f9222k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.NoteSelectionDialogFragment$setupListeners$10$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Context f9223j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ NoteSelectionDialogFragment f9224k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, NoteSelectionDialogFragment noteSelectionDialogFragment) {
            super(1);
            this.f9223j = context;
            this.f9224k = noteSelectionDialogFragment;
        }

        @Override // u7.l
        public final m7.n U(Throwable th) {
            AlarmManager alarmManager;
            Throwable th2 = th;
            Context context = this.f9223j;
            v7.g.e(context, "context");
            int i10 = NoteSelectionDialogFragment.B0;
            NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9224k;
            String e10 = q.e(context, R.plurals.note_is_deleted, noteSelectionDialogFragment.l0().size(), Integer.valueOf(noteSelectionDialogFragment.l0().size()));
            View k02 = noteSelectionDialogFragment.k0();
            if (k02 != null) {
                ViewUtilsKt.w(k02, e10, Integer.valueOf((int) R.drawable.ic_round_delete_24), Integer.valueOf(noteSelectionDialogFragment.g0()), noteSelectionDialogFragment.j0(), 16);
            }
            Iterator it = noteSelectionDialogFragment.l0().iterator();
            while (it.hasNext()) {
                t6.d dVar = (t6.d) it.next();
                if (dVar.f17628i != null && (alarmManager = (AlarmManager) noteSelectionDialogFragment.f9205x0.getValue()) != null) {
                    a1.c.U(alarmManager, context, dVar.f17621a);
                }
            }
            a1.c.W1(context);
            a1.c.Y1(context);
            noteSelectionDialogFragment.Z();
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteSelectionDialogFragment$setupListeners$10$1$1(Context context, NoteSelectionDialogFragment noteSelectionDialogFragment) {
        super(1);
        this.f9221j = noteSelectionDialogFragment;
        this.f9222k = context;
    }

    @Override // u7.l
    public final m7.n U(Integer num) {
        Integer num2 = num;
        int i10 = NoteSelectionDialogFragment.B0;
        NoteSelectionDialogFragment noteSelectionDialogFragment = this.f9221j;
        noteSelectionDialogFragment.m0().g().O(new AnonymousClass1(this.f9222k, noteSelectionDialogFragment));
        return m7.n.f16010a;
    }
}
