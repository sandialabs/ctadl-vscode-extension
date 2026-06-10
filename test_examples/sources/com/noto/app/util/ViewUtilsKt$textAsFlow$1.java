package com.noto.app.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ProduceKt;
import la.k;
import m0.b;
import m7.n;
import q7.c;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, d2 = {"Lla/k;", "", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.util.ViewUtilsKt$textAsFlow$1", f = "ViewUtils.kt", l = {180}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewUtilsKt$textAsFlow$1 extends SuspendLambda implements p<k<? super CharSequence>, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public int f9904m;
    public /* synthetic */ Object n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ boolean f9905o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ EditText f9906p;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm7/n;", "invoke", "()V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.util.ViewUtilsKt$textAsFlow$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements u7.a<n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ EditText f9907j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ TextWatcher f9908k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EditText editText, a aVar) {
            super(0);
            this.f9907j = editText;
            this.f9908k = aVar;
        }

        @Override // u7.a
        public final n k0() {
            this.f9907j.removeTextChangedListener(this.f9908k);
            return n.f16010a;
        }
    }

    /* loaded from: classes.dex */
    public static final class a implements TextWatcher {

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ k f9909i;

        public a(k kVar) {
            this.f9909i = kVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f9909i.F(charSequence);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewUtilsKt$textAsFlow$1(boolean z10, EditText editText, p7.c<? super ViewUtilsKt$textAsFlow$1> cVar) {
        super(2, cVar);
        this.f9905o = z10;
        this.f9906p = editText;
    }

    @Override // u7.p
    public final Object R(k<? super CharSequence> kVar, p7.c<? super n> cVar) {
        return ((ViewUtilsKt$textAsFlow$1) a(kVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        ViewUtilsKt$textAsFlow$1 viewUtilsKt$textAsFlow$1 = new ViewUtilsKt$textAsFlow$1(this.f9905o, this.f9906p, cVar);
        viewUtilsKt$textAsFlow$1.n = obj;
        return viewUtilsKt$textAsFlow$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f9904m;
        if (i10 == 0) {
            b.n1(obj);
            k kVar = (k) this.n;
            boolean z10 = this.f9905o;
            EditText editText = this.f9906p;
            if (z10) {
                kVar.F(editText.getText());
            }
            a aVar = new a(kVar);
            editText.addTextChangedListener(aVar);
            editText.addTextChangedListener(aVar);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(editText, aVar);
            this.f9904m = 1;
            if (ProduceKt.a(kVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            b.n1(obj);
        }
        return n.f16010a;
    }
}
