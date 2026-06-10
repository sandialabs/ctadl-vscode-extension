package com.noto.app.widget;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.i0;
import s6.j0;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isEnabled", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigActivity$setupState$6", f = "NoteListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteListWidgetConfigActivity$setupState$6 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f10072m;
    public final /* synthetic */ j0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$setupState$6(j0 j0Var, p7.c<? super NoteListWidgetConfigActivity$setupState$6> cVar) {
        super(2, cVar);
        this.n = j0Var;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigActivity$setupState$6) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigActivity$setupState$6 noteListWidgetConfigActivity$setupState$6 = new NoteListWidgetConfigActivity$setupState$6(this.n, cVar);
        noteListWidgetConfigActivity$setupState$6.f10072m = ((Boolean) obj).booleanValue();
        return noteListWidgetConfigActivity$setupState$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        int i10;
        b.n1(obj);
        boolean z10 = this.f10072m;
        j0 j0Var = this.n;
        ImageView imageView = j0Var.f17403o.f17380b;
        g.e(imageView, "widget.ivAppIcon");
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        j0Var.f17397h.setChecked(z10);
        i0 i0Var = j0Var.f17403o;
        if (z10) {
            i0Var.f17385h.setPadding(q.d(new Integer(0)), q.d(new Integer(16)), q.d(new Integer(0)), q.d(new Integer(16)));
        } else {
            TextView textView = i0Var.f17385h;
            g.e(textView, "widget.tvFolderTitle");
            int d5 = q.d(new Integer(16));
            textView.setPadding(d5, d5, d5, d5);
        }
        return n.f16010a;
    }
}
