package com.noto.app.widget;

import android.widget.ImageButton;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.o;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isEnabled", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.FolderListWidgetConfigActivity$setupState$7", f = "FolderListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderListWidgetConfigActivity$setupState$7 extends SuspendLambda implements p<Boolean, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ boolean f9952m;
    public final /* synthetic */ o n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListWidgetConfigActivity$setupState$7(o oVar, p7.c<? super FolderListWidgetConfigActivity$setupState$7> cVar) {
        super(2, cVar);
        this.n = oVar;
    }

    @Override // u7.p
    public final Object R(Boolean bool, p7.c<? super n> cVar) {
        return ((FolderListWidgetConfigActivity$setupState$7) a(Boolean.valueOf(bool.booleanValue()), cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListWidgetConfigActivity$setupState$7 folderListWidgetConfigActivity$setupState$7 = new FolderListWidgetConfigActivity$setupState$7(this.n, cVar);
        folderListWidgetConfigActivity$setupState$7.f9952m = ((Boolean) obj).booleanValue();
        return folderListWidgetConfigActivity$setupState$7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        boolean z10 = this.f9952m;
        o oVar = this.n;
        ImageButton imageButton = oVar.f17443k.f17423a;
        g.e(imageButton, "widget.fab");
        imageButton.setVisibility(z10 ? 0 : 8);
        oVar.f17439g.setChecked(z10);
        return n.f16010a;
    }
}
