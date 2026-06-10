package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.appbar.MaterialToolbar;
import com.noto.R;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.o;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isCreated", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.FolderListWidgetConfigActivity$setupState$3", f = "FolderListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderListWidgetConfigActivity$setupState$3 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9947m;
    public final /* synthetic */ o n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderListWidgetConfigActivity f9948o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListWidgetConfigActivity$setupState$3(o oVar, FolderListWidgetConfigActivity folderListWidgetConfigActivity, p7.c<? super FolderListWidgetConfigActivity$setupState$3> cVar) {
        super(2, cVar);
        this.n = oVar;
        this.f9948o = folderListWidgetConfigActivity;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((FolderListWidgetConfigActivity$setupState$3) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListWidgetConfigActivity$setupState$3 folderListWidgetConfigActivity$setupState$3 = new FolderListWidgetConfigActivity$setupState$3(this.n, this.f9948o, cVar);
        folderListWidgetConfigActivity$setupState$3.f9947m = ((Boolean) obj).booleanValue();
        return folderListWidgetConfigActivity$setupState$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String f10;
        b.n1(obj);
        if (this.f9947m) {
            o oVar = this.n;
            MaterialToolbar materialToolbar = oVar.f17442j;
            FolderListWidgetConfigActivity folderListWidgetConfigActivity = this.f9948o;
            f10 = q.f(folderListWidgetConfigActivity, R.string.edit_folders_widget, new Object[0]);
            materialToolbar.setTitle(f10);
            oVar.f17435b.setText(q.f(folderListWidgetConfigActivity, R.string.update_widget, new Object[0]));
        }
        return n.f16010a;
    }
}
