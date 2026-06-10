package androidx.compose.ui.text.input;

import android.content.Context;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.AbstractChannel;
import la.e;
import la.f;
import m7.n;
import p1.o;
import u7.l;
import v1.a;
import v1.b;
import v1.c;
import v7.g;

/* loaded from: classes.dex */
public final class TextInputServiceAndroid implements c {

    /* renamed from: a  reason: collision with root package name */
    public final View f4135a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4136b;
    public final l<? super List<Object>, n> c;

    /* renamed from: d  reason: collision with root package name */
    public final l<? super a, n> f4137d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractChannel f4138e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextInputServiceAndroid$TextInputCommand;", "", "ui_release"}, k = 1, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1})
    /* loaded from: classes.dex */
    public enum TextInputCommand {
        /* JADX INFO: Fake field, exist only in values array */
        StartInput,
        /* JADX INFO: Fake field, exist only in values array */
        StopInput,
        ShowKeyboard,
        /* JADX INFO: Fake field, exist only in values array */
        HideKeyboard
    }

    public TextInputServiceAndroid(View view) {
        g.f(view, "view");
        Context context = view.getContext();
        g.e(context, "view.context");
        InputMethodManagerImpl inputMethodManagerImpl = new InputMethodManagerImpl(context);
        this.f4135a = view;
        this.f4136b = inputMethodManagerImpl;
        this.c = TextInputServiceAndroid$onEditCommand$1.f4142j;
        this.f4137d = TextInputServiceAndroid$onImeActionPerformed$1.f4143j;
        new TextFieldValue(new p1.a("", null, 6), o.f16701b, null);
        new ArrayList();
        kotlin.a.a(LazyThreadSafetyMode.NONE, new TextInputServiceAndroid$baseInputConnection$2(this));
        this.f4138e = a1.b.f(Integer.MAX_VALUE, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004b -> B:18:0x004e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p7.c<? super n> cVar) {
        TextInputServiceAndroid$textInputCommandEventLoop$1 textInputServiceAndroid$textInputCommandEventLoop$1;
        int i10;
        e aVar;
        TextInputServiceAndroid textInputServiceAndroid;
        T t10;
        T t11;
        Object E;
        boolean z10;
        if (cVar instanceof TextInputServiceAndroid$textInputCommandEventLoop$1) {
            textInputServiceAndroid$textInputCommandEventLoop$1 = (TextInputServiceAndroid$textInputCommandEventLoop$1) cVar;
            int i11 = textInputServiceAndroid$textInputCommandEventLoop$1.f4147p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                textInputServiceAndroid$textInputCommandEventLoop$1.f4147p = i11 - Integer.MIN_VALUE;
                Object obj = textInputServiceAndroid$textInputCommandEventLoop$1.n;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = textInputServiceAndroid$textInputCommandEventLoop$1.f4147p;
                if (i10 == 0) {
                    if (i10 == 1) {
                        aVar = textInputServiceAndroid$textInputCommandEventLoop$1.f4145m;
                        textInputServiceAndroid = textInputServiceAndroid$textInputCommandEventLoop$1.f4144l;
                        m0.b.n1(obj);
                        if (((Boolean) obj).booleanValue()) {
                            TextInputCommand textInputCommand = (TextInputCommand) aVar.next();
                            boolean isFocused = textInputServiceAndroid.f4135a.isFocused();
                            AbstractChannel abstractChannel = textInputServiceAndroid.f4138e;
                            if (!isFocused) {
                                do {
                                } while (!(abstractChannel.E() instanceof f.b));
                            } else {
                                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                                while (textInputCommand != null) {
                                    int ordinal = textInputCommand.ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal != 1) {
                                            if ((ordinal == 2 || ordinal == 3) && !g.a(ref$ObjectRef.f13060i, Boolean.FALSE)) {
                                                if (textInputCommand == TextInputCommand.ShowKeyboard) {
                                                    z10 = true;
                                                } else {
                                                    z10 = false;
                                                }
                                                t11 = Boolean.valueOf(z10);
                                                ref$ObjectRef2.f13060i = t11;
                                            }
                                            E = abstractChannel.E();
                                            if (!(E instanceof f.b)) {
                                                E = null;
                                            }
                                            textInputCommand = (TextInputCommand) E;
                                        } else {
                                            t10 = Boolean.FALSE;
                                        }
                                    } else {
                                        t10 = Boolean.TRUE;
                                    }
                                    ref$ObjectRef.f13060i = t10;
                                    t11 = t10;
                                    ref$ObjectRef2.f13060i = t11;
                                    E = abstractChannel.E();
                                    if (!(E instanceof f.b)) {
                                    }
                                    textInputCommand = (TextInputCommand) E;
                                }
                                boolean a10 = g.a(ref$ObjectRef.f13060i, Boolean.TRUE);
                                View view = textInputServiceAndroid.f4135a;
                                b bVar = textInputServiceAndroid.f4136b;
                                if (a10) {
                                    bVar.c(view);
                                }
                                Boolean bool = (Boolean) ref$ObjectRef2.f13060i;
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        bVar.b(view);
                                    } else {
                                        bVar.a(view.getWindowToken());
                                    }
                                }
                                if (g.a(ref$ObjectRef.f13060i, Boolean.FALSE)) {
                                    bVar.c(view);
                                }
                            }
                            textInputServiceAndroid$textInputCommandEventLoop$1.f4144l = textInputServiceAndroid;
                            textInputServiceAndroid$textInputCommandEventLoop$1.f4145m = aVar;
                            textInputServiceAndroid$textInputCommandEventLoop$1.f4147p = 1;
                            obj = aVar.a(textInputServiceAndroid$textInputCommandEventLoop$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            if (((Boolean) obj).booleanValue()) {
                                return n.f16010a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    m0.b.n1(obj);
                    AbstractChannel abstractChannel2 = this.f4138e;
                    abstractChannel2.getClass();
                    aVar = new AbstractChannel.a(abstractChannel2);
                    textInputServiceAndroid = this;
                    textInputServiceAndroid$textInputCommandEventLoop$1.f4144l = textInputServiceAndroid;
                    textInputServiceAndroid$textInputCommandEventLoop$1.f4145m = aVar;
                    textInputServiceAndroid$textInputCommandEventLoop$1.f4147p = 1;
                    obj = aVar.a(textInputServiceAndroid$textInputCommandEventLoop$1);
                    if (obj == coroutineSingletons) {
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
            }
        }
        textInputServiceAndroid$textInputCommandEventLoop$1 = new TextInputServiceAndroid$textInputCommandEventLoop$1(this, cVar);
        Object obj2 = textInputServiceAndroid$textInputCommandEventLoop$1.n;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i10 = textInputServiceAndroid$textInputCommandEventLoop$1.f4147p;
        if (i10 == 0) {
        }
    }
}
