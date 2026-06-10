package com.noto.app.note;

import a7.y0;
import android.view.View;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavController;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.note.UndoRedoDialogFragment;
import com.noto.app.util.ViewUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class UndoRedoDialogFragment$setupItems$1 extends Lambda implements u7.l<com.airbnb.epoxy.m, m7.n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ List<Triple<Integer, Integer, String>> f9380j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ String f9381k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ NotoColor f9382l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f9383m;
    public final /* synthetic */ UndoRedoDialogFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndoRedoDialogFragment$setupItems$1(ArrayList arrayList, String str, NotoColor notoColor, boolean z10, UndoRedoDialogFragment undoRedoDialogFragment) {
        super(1);
        this.f9380j = arrayList;
        this.f9381k = str;
        this.f9382l = notoColor;
        this.f9383m = z10;
        this.n = undoRedoDialogFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [a7.v0] */
    @Override // u7.l
    public final m7.n U(com.airbnb.epoxy.m mVar) {
        com.airbnb.epoxy.m mVar2 = mVar;
        v7.g.f(mVar2, "$this$withModels");
        Iterator<T> it = this.f9380j.iterator();
        while (it.hasNext()) {
            final Triple triple = (Triple) it.next();
            y0 y0Var = new y0();
            Object obj = triple.f12972i;
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" ");
            Object obj2 = triple.f12973j;
            sb.append(obj2);
            sb.append(" ");
            Object obj3 = triple.f12974k;
            sb.append(obj3);
            y0Var.l(sb.toString());
            y0Var.O((String) obj3);
            y0Var.K(((Number) triple.f12972i).intValue());
            y0Var.J(((Number) obj2).intValue());
            y0Var.L(v7.g.a(obj3, this.f9381k));
            y0Var.I(this.f9382l);
            final boolean z10 = this.f9383m;
            final UndoRedoDialogFragment undoRedoDialogFragment = this.n;
            y0Var.M(new View.OnClickListener() { // from class: a7.v0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str;
                    androidx.navigation.i g10;
                    androidx.lifecycle.d0 a10;
                    UndoRedoDialogFragment undoRedoDialogFragment2 = undoRedoDialogFragment;
                    v7.g.f(undoRedoDialogFragment2, "this$0");
                    Triple triple2 = triple;
                    v7.g.f(triple2, "$item");
                    if (z10) {
                        str = "NoteTitle";
                    } else {
                        str = "NoteBody";
                    }
                    NavController g11 = ViewUtilsKt.g(undoRedoDialogFragment2);
                    if (g11 != null && (g10 = g11.g()) != null && (a10 = g10.a()) != null) {
                        a10.e(triple2.f12974k, str);
                    }
                    undoRedoDialogFragment2.Z();
                }
            });
            y0Var.N(new n(undoRedoDialogFragment, 1, triple));
            mVar2.add(y0Var);
        }
        return m7.n.f16010a;
    }
}
