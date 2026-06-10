package com.noto.app.note;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.util.ModelUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/d;", "note", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$8", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$8 extends SuspendLambda implements u7.p<t6.d, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9105m;
    public final /* synthetic */ NoteFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ b0 f9106o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$8(b0 b0Var, NoteFragment noteFragment, p7.c cVar) {
        super(2, cVar);
        this.n = noteFragment;
        this.f9106o = b0Var;
    }

    @Override // u7.p
    public final Object R(t6.d dVar, p7.c<? super m7.n> cVar) {
        return ((NoteFragment$setupState$8) a(dVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        NoteFragment$setupState$8 noteFragment$setupState$8 = new NoteFragment$setupState$8(this.f9106o, this.n, cVar);
        noteFragment$setupState$8.f9105m = obj;
        return noteFragment$setupState$8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        m0.b.n1(obj);
        boolean w10 = ModelUtilsKt.w((t6.d) this.f9105m);
        b0 b0Var = this.f9106o;
        NoteFragment noteFragment = this.n;
        if (w10) {
            int i10 = NoteFragment.f9026f0;
            noteFragment.getClass();
            Menu menu = b0Var.f17296b.getMenu();
            v7.g.e(menu, "bab.menu");
            int size = menu.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = menu.getItem(i11);
                v7.g.e(item, "getItem(index)");
                item.setEnabled(true);
                Drawable icon = item.getIcon();
                if (icon != null) {
                    icon.setAlpha(255);
                }
            }
        } else {
            int i12 = NoteFragment.f9026f0;
            noteFragment.getClass();
            Menu menu2 = b0Var.f17296b.getMenu();
            v7.g.e(menu2, "bab.menu");
            int size2 = menu2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                MenuItem item2 = menu2.getItem(i13);
                v7.g.e(item2, "getItem(index)");
                item2.setEnabled(false);
                Drawable icon2 = item2.getIcon();
                if (icon2 != null) {
                    icon2.setAlpha(127);
                }
            }
        }
        return m7.n.f16010a;
    }
}
