package com.noto.app.note;

import android.content.Context;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import com.robinhood.ticker.TickerView;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;
import u7.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "body", "selectedText", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$12", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$12 extends SuspendLambda implements q<String, String, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ String f9072m;
    public /* synthetic */ String n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f9073o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9074p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$12(b0 b0Var, NoteFragment noteFragment, p7.c<? super NoteFragment$setupState$12> cVar) {
        super(3, cVar);
        this.f9073o = b0Var;
        this.f9074p = noteFragment;
    }

    @Override // u7.q
    public final Object O(String str, String str2, p7.c<? super m7.n> cVar) {
        NoteFragment$setupState$12 noteFragment$setupState$12 = new NoteFragment$setupState$12(this.f9073o, this.f9074p, cVar);
        noteFragment$setupState$12.f9072m = str;
        noteFragment$setupState$12.n = str2;
        return noteFragment$setupState$12.k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        String str;
        String str2;
        m0.b.n1(obj);
        String str3 = this.f9072m;
        String str4 = this.n;
        String str5 = null;
        NoteFragment noteFragment = this.f9074p;
        b0 b0Var = this.f9073o;
        if (str4 != null && (!ha.i.T0(str4))) {
            TickerView tickerView = b0Var.f17308p;
            Context j2 = noteFragment.j();
            if (j2 != null) {
                str2 = f7.q.e(j2, R.plurals.words_selected_count, ModelUtilsKt.p(str3), new Integer(ModelUtilsKt.p(str3)), new Integer(ModelUtilsKt.p(str4)));
            } else {
                str2 = null;
            }
            tickerView.setText(str2);
            Context j10 = noteFragment.j();
            if (j10 != null) {
                str5 = f7.q.e(j10, R.plurals.words_selected_count, ModelUtilsKt.p(str3), new Integer(ModelUtilsKt.p(str3)), new Integer(ModelUtilsKt.p(str4)));
            }
        } else {
            TickerView tickerView2 = b0Var.f17308p;
            Context j11 = noteFragment.j();
            if (j11 != null) {
                str = f7.q.e(j11, R.plurals.words_count, ModelUtilsKt.p(str3), new Integer(ModelUtilsKt.p(str3)));
            } else {
                str = null;
            }
            tickerView2.setText(str);
            Context j12 = noteFragment.j();
            if (j12 != null) {
                str5 = f7.q.e(j12, R.plurals.words_count, ModelUtilsKt.p(str3), new Integer(ModelUtilsKt.p(str3)));
            }
        }
        b0Var.f17309q.setText(str5);
        return m7.n.f16010a;
    }
}
