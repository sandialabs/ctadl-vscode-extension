package com.noto.app.note;

import android.view.Window;
import android.view.WindowManager;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.s;
import com.noto.app.domain.model.ScreenBrightnessLevel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/ScreenBrightnessLevel;", "level", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NotePagerFragment$setupState$6", f = "NotePagerFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NotePagerFragment$setupState$6 extends SuspendLambda implements u7.p<ScreenBrightnessLevel, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9131m;
    public final /* synthetic */ NotePagerFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotePagerFragment$setupState$6(NotePagerFragment notePagerFragment, p7.c<? super NotePagerFragment$setupState$6> cVar) {
        super(2, cVar);
        this.n = notePagerFragment;
    }

    @Override // u7.p
    public final Object R(ScreenBrightnessLevel screenBrightnessLevel, p7.c<? super m7.n> cVar) {
        return ((NotePagerFragment$setupState$6) a(screenBrightnessLevel, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NotePagerFragment$setupState$6 notePagerFragment$setupState$6 = new NotePagerFragment$setupState$6(this.n, cVar);
        notePagerFragment$setupState$6.f9131m = obj;
        return notePagerFragment$setupState$6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Window window;
        Window window2;
        WindowManager.LayoutParams attributes;
        m0.b.n1(obj);
        ScreenBrightnessLevel screenBrightnessLevel = (ScreenBrightnessLevel) this.f9131m;
        NotePagerFragment notePagerFragment = this.n;
        s c = notePagerFragment.c();
        WindowManager.LayoutParams layoutParams = null;
        if (c != null) {
            window = c.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            s c10 = notePagerFragment.c();
            if (c10 != null && (window2 = c10.getWindow()) != null && (attributes = window2.getAttributes()) != null) {
                attributes.screenBrightness = screenBrightnessLevel.f8219i;
                layoutParams = attributes;
            }
            window.setAttributes(layoutParams);
        }
        return m7.n.f16010a;
    }
}
