package com.noto.app.folder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lt6/a;", "folder", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderDialogFragment$setupState$1", f = "FolderDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderDialogFragment$setupState$1 extends SuspendLambda implements u7.p<t6.a, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f8355m;
    public final /* synthetic */ FolderDialogFragment n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ s6.h f8356o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderDialogFragment$setupState$1(FolderDialogFragment folderDialogFragment, s6.h hVar, p7.c<? super FolderDialogFragment$setupState$1> cVar) {
        super(2, cVar);
        this.n = folderDialogFragment;
        this.f8356o = hVar;
    }

    @Override // u7.p
    public final Object R(t6.a aVar, p7.c<? super m7.n> cVar) {
        return ((FolderDialogFragment$setupState$1) a(aVar, cVar)).k(m7.n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<m7.n> a(Object obj, p7.c<?> cVar) {
        FolderDialogFragment$setupState$1 folderDialogFragment$setupState$1 = new FolderDialogFragment$setupState$1(this.n, this.f8356o, cVar);
        folderDialogFragment$setupState$1.f8355m = obj;
        return folderDialogFragment$setupState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = (t6.a) this.f8355m;
        int i10 = FolderDialogFragment.A0;
        Context j2 = this.n.j();
        if (j2 != null) {
            int b5 = f7.q.b(j2, f7.q.j(aVar.f17595e));
            ColorStateList h10 = f7.q.h(b5);
            s6.h hVar = this.f8356o;
            Drawable background = hVar.f17351b.f17312d.getBackground();
            if (background != null && (mutate = background.mutate()) != null) {
                mutate.setTint(b5);
            }
            hVar.f17351b.c.setTextColor(b5);
            MaterialTextView materialTextView = hVar.c;
            MaterialTextView materialTextView2 = hVar.f17356h;
            MaterialTextView materialTextView3 = hVar.f17355g;
            MaterialTextView materialTextView4 = hVar.f17352d;
            for (MaterialTextView materialTextView5 : a1.c.O0(hVar.f17353e, materialTextView, materialTextView2, materialTextView3, hVar.f17354f, materialTextView4)) {
                Drawable background2 = materialTextView5.getBackground();
                v7.g.e(background2, "tv.background");
                ViewUtilsKt.s(background2, h10);
            }
            boolean u10 = ModelUtilsKt.u(aVar);
            s6.j jVar = hVar.f17357i;
            if (u10) {
                jVar.c.setImageDrawable(f7.q.c(j2, R.drawable.ic_round_folder_general_24));
                View view = hVar.f17350a.f17323a;
                v7.g.e(view, "divider.root");
                view.setVisibility(8);
                v7.g.e(materialTextView, "tvArchiveFolder");
                materialTextView.setVisibility(8);
                v7.g.e(materialTextView2, "tvVaultFolder");
                materialTextView2.setVisibility(8);
                v7.g.e(materialTextView4, "tvDeleteFolder");
                materialTextView4.setVisibility(8);
                v7.g.e(materialTextView3, "tvPinFolder");
                materialTextView3.setVisibility(8);
            } else {
                jVar.c.setImageDrawable(f7.q.c(j2, R.drawable.ic_round_folder_24));
            }
            ImageButton imageButton = jVar.f17388b;
            v7.g.e(imageButton, "vFolder.ibFolderHandle");
            imageButton.setVisibility(8);
            String o10 = ModelUtilsKt.o(j2, aVar);
            MaterialTextView materialTextView6 = jVar.f17390e;
            materialTextView6.setText(o10);
            materialTextView6.setTextColor(b5);
            jVar.c.setImageTintList(h10);
            if (aVar.f17599i) {
                materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_round_unarchive_24, 0, 0);
                materialTextView.setText(f7.q.f(j2, R.string.unarchive, new Object[0]));
            } else {
                materialTextView.setText(f7.q.f(j2, R.string.archive, new Object[0]));
                materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_round_archive_24, 0, 0);
            }
            if (aVar.f17606q) {
                materialTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_round_lock_open_24, 0, 0);
                materialTextView2.setText(f7.q.f(j2, R.string.remove_from_vault, new Object[0]));
            } else {
                materialTextView2.setText(f7.q.f(j2, R.string.add_to_vault, new Object[0]));
                materialTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_round_lock_24, 0, 0);
            }
            if (aVar.f17600j) {
                materialTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_round_pin_off_24, 0, 0);
                materialTextView3.setText(f7.q.f(j2, R.string.unpin, new Object[0]));
            } else {
                materialTextView3.setText(f7.q.f(j2, R.string.pin, new Object[0]));
                materialTextView3.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R.drawable.ic_round_pin_24, 0, 0);
            }
        }
        return m7.n.f16010a;
    }
}
