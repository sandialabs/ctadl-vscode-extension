package com.noto.app.widget;

import android.widget.FrameLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.j0;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isEnabled", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.NoteListWidgetConfigActivity$setupState$7", f = "NoteListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteListWidgetConfigActivity$setupState$7 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f10073m;
    public final /* synthetic */ j0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteListWidgetConfigActivity$setupState$7(j0 j0Var, p7.c<? super NoteListWidgetConfigActivity$setupState$7> cVar) {
        super(2, cVar);
        this.n = j0Var;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((NoteListWidgetConfigActivity$setupState$7) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        NoteListWidgetConfigActivity$setupState$7 noteListWidgetConfigActivity$setupState$7 = new NoteListWidgetConfigActivity$setupState$7(this.n, cVar);
        noteListWidgetConfigActivity$setupState$7.f10073m = ((Boolean) obj).booleanValue();
        return noteListWidgetConfigActivity$setupState$7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        boolean z10 = this.f10073m;
        j0 j0Var = this.n;
        FrameLayout frameLayout = j0Var.f17403o.f17379a;
        g.e(frameLayout, "widget.fab");
        frameLayout.setVisibility(z10 ? 0 : 8);
        j0Var.f17399j.setChecked(z10);
        return n.f16010a;
    }
}
