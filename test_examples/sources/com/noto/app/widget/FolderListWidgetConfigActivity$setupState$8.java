package com.noto.app.widget;

import android.widget.LinearLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.o;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "radius", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.FolderListWidgetConfigActivity$setupState$8", f = "FolderListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderListWidgetConfigActivity$setupState$8 extends SuspendLambda implements p<Integer, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ int f9953m;
    public final /* synthetic */ o n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderListWidgetConfigActivity f9954o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListWidgetConfigActivity$setupState$8(o oVar, FolderListWidgetConfigActivity folderListWidgetConfigActivity, p7.c<? super FolderListWidgetConfigActivity$setupState$8> cVar) {
        super(2, cVar);
        this.n = oVar;
        this.f9954o = folderListWidgetConfigActivity;
    }

    @Override // u7.p
    public final Object R(Integer num, p7.c<? super n> cVar) {
        return ((FolderListWidgetConfigActivity$setupState$8) a(Integer.valueOf(num.intValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListWidgetConfigActivity$setupState$8 folderListWidgetConfigActivity$setupState$8 = new FolderListWidgetConfigActivity$setupState$8(this.n, this.f9954o, cVar);
        folderListWidgetConfigActivity$setupState$8.f9953m = ((Number) obj).intValue();
        return folderListWidgetConfigActivity$setupState$8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        int i10 = this.f9953m;
        o oVar = this.n;
        oVar.f17436d.setValue(i10);
        LinearLayout linearLayout = oVar.f17443k.c;
        int Q1 = a1.c.Q1(i10);
        FolderListWidgetConfigActivity folderListWidgetConfigActivity = this.f9954o;
        linearLayout.setBackground(q.c(folderListWidgetConfigActivity, Q1));
        oVar.f17443k.f17426e.setBackground(q.c(folderListWidgetConfigActivity, a1.c.P1(i10)));
        return n.f16010a;
    }
}
