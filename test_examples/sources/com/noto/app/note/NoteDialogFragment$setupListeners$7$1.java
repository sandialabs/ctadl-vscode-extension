package com.noto.app.note;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "folderId", "Lm7/n;", "invoke", "(Ljava/lang/Long;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class NoteDialogFragment$setupListeners$7$1 extends Lambda implements u7.l<Long, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ NoteDialogFragment f9009j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ d0 f9010k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.note.NoteDialogFragment$setupListeners$7$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements u7.l<Throwable, m7.n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ d0 f9011j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ NoteDialogFragment f9012k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d0 d0Var, NoteDialogFragment noteDialogFragment) {
            super(1);
            this.f9011j = d0Var;
            this.f9012k = noteDialogFragment;
        }

        @Override // u7.l
        public final m7.n U(Throwable th) {
            Throwable th2 = th;
            String str = (String) this.f9011j.b("folder_title");
            NoteDialogFragment noteDialogFragment = this.f9012k;
            Context j2 = noteDialogFragment.j();
            if (j2 != null) {
                a1.c.W1(j2);
                a1.c.Y1(j2);
                View k02 = noteDialogFragment.k0();
                if (k02 != null) {
                    ViewUtilsKt.w(k02, q.e(j2, R.plurals.note_is_copied, 1, str), Integer.valueOf((int) R.drawable.ic_round_file_copy_24), noteDialogFragment.g0(), noteDialogFragment.j0(), 16);
                }
            }
            NavController g10 = ViewUtilsKt.g(noteDialogFragment);
            if (g10 != null) {
                g10.l(noteDialogFragment.h0().c, false);
            }
            noteDialogFragment.Z();
            return m7.n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteDialogFragment$setupListeners$7$1(NoteDialogFragment noteDialogFragment, d0 d0Var) {
        super(1);
        this.f9009j = noteDialogFragment;
        this.f9010k = d0Var;
    }

    @Override // u7.l
    public final m7.n U(Long l2) {
        Long l4 = l2;
        int i10 = NoteDialogFragment.C0;
        NoteDialogFragment noteDialogFragment = this.f9009j;
        NoteViewModel l02 = noteDialogFragment.l0();
        v7.g.e(l4, "folderId");
        long longValue = l4.longValue();
        l02.getClass();
        m0.b.M0(a1.b.d0(l02), null, null, new NoteViewModel$copyNote$1(l02, longValue, null), 3).O(new AnonymousClass1(this.f9010k, noteDialogFragment));
        return m7.n.f16010a;
    }
}
