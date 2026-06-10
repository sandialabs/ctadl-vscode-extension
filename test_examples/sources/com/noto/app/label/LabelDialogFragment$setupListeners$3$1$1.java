package com.noto.app.label;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.e;
import m7.n;
import u7.l;
import v7.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm7/n;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LabelDialogFragment$setupListeners$3$1$1 extends Lambda implements l<Integer, n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LabelDialogFragment f8735j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Context f8736k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm7/n;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.label.LabelDialogFragment$setupListeners$3$1$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends Lambda implements l<Throwable, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ LabelDialogFragment f8737j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LabelDialogFragment labelDialogFragment) {
            super(1);
            this.f8737j = labelDialogFragment;
        }

        @Override // u7.l
        public final n U(Throwable th) {
            Throwable th2 = th;
            this.f8737j.Z();
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelDialogFragment$setupListeners$3$1$1(LabelDialogFragment labelDialogFragment, Context context) {
        super(1);
        this.f8735j = labelDialogFragment;
        this.f8736k = context;
    }

    @Override // u7.l
    public final n U(Integer num) {
        View view;
        Integer num2 = num;
        LabelDialogFragment labelDialogFragment = this.f8735j;
        Fragment fragment = labelDialogFragment.C;
        if (fragment != null) {
            view = fragment.M;
        } else {
            view = null;
        }
        int i10 = LabelDialogFragment.f8728w0;
        e eVar = labelDialogFragment.f8729u0;
        NotoColor notoColor = ((t6.a) ((LabelViewModel) eVar.getValue()).f8753g.getValue()).f17595e;
        if (view != null) {
            Context context = this.f8736k;
            g.e(context, "context");
            ViewUtilsKt.w(view, q.f(context, R.string.label_is_deleted, new Object[0]), Integer.valueOf((int) R.drawable.ic_round_delete_24), Integer.valueOf((int) R.id.bab), notoColor, 16);
        }
        LabelViewModel labelViewModel = (LabelViewModel) eVar.getValue();
        labelViewModel.getClass();
        m0.b.M0(a1.b.d0(labelViewModel), null, null, new LabelViewModel$deleteLabel$1(labelViewModel, null), 3).O(new AnonymousClass1(labelDialogFragment));
        return n.f16010a;
    }
}
