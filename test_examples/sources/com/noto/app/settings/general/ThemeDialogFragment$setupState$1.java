package com.noto.app.settings.general;

import android.widget.RadioButton;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Theme;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.b;
import m7.n;
import q7.c;
import s6.q0;
import u7.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Theme;", "theme", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.settings.general.ThemeDialogFragment$setupState$1", f = "ThemeDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ThemeDialogFragment$setupState$1 extends SuspendLambda implements p<Theme, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9763m;
    public final /* synthetic */ ThemeDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ q0 f9764o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeDialogFragment$setupState$1(ThemeDialogFragment themeDialogFragment, q0 q0Var, p7.c<? super ThemeDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = themeDialogFragment;
        this.f9764o = q0Var;
    }

    @Override // u7.p
    public final Object R(Theme theme, p7.c<? super n> cVar) {
        return ((ThemeDialogFragment$setupState$1) a(theme, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ThemeDialogFragment$setupState$1 themeDialogFragment$setupState$1 = new ThemeDialogFragment$setupState$1(this.n, this.f9764o, cVar);
        themeDialogFragment$setupState$1.f9763m = obj;
        return themeDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        RadioButton radioButton;
        b.n1(obj);
        int i10 = ThemeDialogFragment.f9760v0;
        this.n.getClass();
        int ordinal = ((Theme) this.f9763m).ordinal();
        q0 q0Var = this.f9764o;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            radioButton = q0Var.f17457a;
                        } else {
                            return n.f16010a;
                        }
                    } else {
                        radioButton = q0Var.f17458b;
                    }
                } else {
                    radioButton = q0Var.c;
                }
            } else {
                radioButton = q0Var.f17459d;
            }
        } else {
            radioButton = q0Var.f17460e;
        }
        radioButton.setChecked(true);
        return n.f16010a;
    }
}
