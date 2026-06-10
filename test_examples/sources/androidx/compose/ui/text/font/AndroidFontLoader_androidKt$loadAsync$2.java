package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.datastore.preferences.PreferencesProto$Value;
import ja.x;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m7.n;
import u1.s;
import u7.p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lja/x;", "Landroid/graphics/Typeface;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
@q7.c(c = "androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2", f = "AndroidFontLoader.android.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AndroidFontLoader_androidKt$loadAsync$2 extends SuspendLambda implements p<x, p7.c<? super Typeface>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ s f4085m;
    public final /* synthetic */ Context n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader_androidKt$loadAsync$2(s sVar, Context context, p7.c<? super AndroidFontLoader_androidKt$loadAsync$2> cVar) {
        super(2, cVar);
        this.f4085m = sVar;
        this.n = context;
    }

    @Override // u7.p
    public final Object R(x xVar, p7.c<? super Typeface> cVar) {
        return ((AndroidFontLoader_androidKt$loadAsync$2) a(xVar, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        return new AndroidFontLoader_androidKt$loadAsync$2(this.f4085m, this.n, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        return m0.b.q(this.n, this.f4085m);
    }
}
