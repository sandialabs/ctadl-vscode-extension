package com.noto.app.settings.general;

import android.widget.RadioButton;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Font;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Font;", "font", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.settings.general.FontDialogFragment$setupState$1", f = "FontDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FontDialogFragment$setupState$1 extends SuspendLambda implements p<Font, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9684m;
    public final /* synthetic */ s6.p n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontDialogFragment$setupState$1(s6.p pVar, p7.c<? super FontDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = pVar;
    }

    @Override // u7.p
    public final Object R(Font font, p7.c<? super n> cVar) {
        return ((FontDialogFragment$setupState$1) a(font, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        FontDialogFragment$setupState$1 fontDialogFragment$setupState$1 = new FontDialogFragment$setupState$1(this.n, cVar);
        fontDialogFragment$setupState$1.f9684m = obj;
        return fontDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        RadioButton radioButton;
        b.n1(obj);
        int ordinal = ((Font) this.f9684m).ordinal();
        s6.p pVar = this.n;
        if (ordinal == 0) {
            radioButton = pVar.f17451b;
        } else if (ordinal != 1) {
            return n.f16010a;
        } else {
            radioButton = pVar.f17450a;
        }
        radioButton.setChecked(true);
        return n.f16010a;
    }
}
