package com.noto.app.widget;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Icon;
import f7.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.o;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Icon;", "icon", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.widget.FolderListWidgetConfigActivity$setupState$9", f = "FolderListWidgetConfigActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderListWidgetConfigActivity$setupState$9 extends SuspendLambda implements p<Icon, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9955m;
    public final /* synthetic */ o n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderListWidgetConfigActivity$setupState$9(o oVar, p7.c<? super FolderListWidgetConfigActivity$setupState$9> cVar) {
        super(2, cVar);
        this.n = oVar;
    }

    @Override // u7.p
    public final Object R(Icon icon, p7.c<? super n> cVar) {
        return ((FolderListWidgetConfigActivity$setupState$9) a(icon, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FolderListWidgetConfigActivity$setupState$9 folderListWidgetConfigActivity$setupState$9 = new FolderListWidgetConfigActivity$setupState$9(this.n, cVar);
        folderListWidgetConfigActivity$setupState$9.f9955m = obj;
        return folderListWidgetConfigActivity$setupState$9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        this.n.f17443k.f17424b.setImageResource(q.i((Icon) this.f9955m));
        return n.f16010a;
    }
}
