package com.noto.app.folder;

import a3.q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MenuItem;
import android.view.animation.AccelerateInterpolator;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import com.robinhood.ticker.TickerView;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lt6/a;", "folder", "", "isRememberScrollingPosition", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.folder.FolderFragment$setupState$4", f = "FolderFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class FolderFragment$setupState$4 extends SuspendLambda implements u7.q<t6.a, Boolean, p7.c<? super t6.a>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.a f8414m;
    public /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ FolderFragment f8415o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ s6.i f8416p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ MenuItem f8417q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FolderFragment$setupState$4(FolderFragment folderFragment, s6.i iVar, MenuItem menuItem, p7.c<? super FolderFragment$setupState$4> cVar) {
        super(3, cVar);
        this.f8415o = folderFragment;
        this.f8416p = iVar;
        this.f8417q = menuItem;
    }

    @Override // u7.q
    public final Object O(t6.a aVar, Boolean bool, p7.c<? super t6.a> cVar) {
        boolean booleanValue = bool.booleanValue();
        FolderFragment$setupState$4 folderFragment$setupState$4 = new FolderFragment$setupState$4(this.f8415o, this.f8416p, this.f8417q, cVar);
        folderFragment$setupState$4.f8414m = aVar;
        folderFragment$setupState$4.n = booleanValue;
        return folderFragment$setupState$4.k(m7.n.f16010a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        r6 = com.noto.R.drawable.ic_round_lock_24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Typeface typeface;
        BitmapDrawable bitmapDrawable;
        int dimension;
        Drawable mutate;
        m0.b.n1(obj);
        t6.a aVar = this.f8414m;
        boolean z10 = this.n;
        int i10 = FolderFragment.f8358k0;
        FolderFragment folderFragment = this.f8415o;
        Context j2 = folderFragment.j();
        s6.i iVar = this.f8416p;
        if (j2 != null) {
            int b5 = f7.q.b(j2, f7.q.j(aVar.f17595e));
            ColorStateList h10 = f7.q.h(b5);
            iVar.f17378k.setText(ModelUtilsKt.o(j2, aVar));
            MaterialTextView materialTextView = iVar.f17378k;
            materialTextView.setTextColor(h10);
            try {
                typeface = p2.f.b(j2, R.font.nunito_semibold);
            } catch (Throwable unused) {
                typeface = null;
            }
            TickerView tickerView = iVar.f17376i;
            tickerView.setTypeface(typeface);
            tickerView.setAnimationInterpolator(new AccelerateInterpolator());
            FloatingActionButton floatingActionButton = iVar.f17372e;
            floatingActionButton.setBackgroundTintList(h10);
            FloatingActionButton floatingActionButton2 = iVar.f17373f;
            floatingActionButton2.setBackgroundTintList(h10);
            if (Build.VERSION.SDK_INT >= 28) {
                floatingActionButton.setOutlineAmbientShadowColor(b5);
                floatingActionButton.setOutlineSpotShadowColor(b5);
                floatingActionButton2.setOutlineAmbientShadowColor(b5);
                floatingActionButton2.setOutlineSpotShadowColor(b5);
            }
            boolean z11 = aVar.f17599i;
            boolean z12 = aVar.f17606q;
            if (!z11 && !z12) {
                materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                dimension = 0;
                materialTextView.setCompoundDrawablePadding(dimension);
            }
            int i11 = R.drawable.ic_round_archive_24;
            Drawable c = f7.q.c(j2, i11);
            if (c != null && (mutate = c.mutate()) != null) {
                Bitmap H0 = a1.b.H0(mutate, f7.q.d(20), f7.q.d(20));
                Resources n = folderFragment.n();
                v7.g.e(n, "resources");
                bitmapDrawable = new BitmapDrawable(n, H0);
                bitmapDrawable.setTint(b5);
            } else {
                bitmapDrawable = null;
            }
            materialTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, bitmapDrawable, (Drawable) null);
            dimension = (int) j2.getResources().getDimension(R.dimen.spacing_small);
            materialTextView.setCompoundDrawablePadding(dimension);
        }
        iVar.f17374g.post(new o4.o(folderFragment, z10, aVar));
        Context j10 = folderFragment.j();
        if (j10 != null) {
            String f10 = f7.q.f(j10, R.string.folder_archive, ModelUtilsKt.o(j10, aVar));
            MenuItem menuItem = this.f8417q;
            if (menuItem instanceof t2.b) {
                ((t2.b) menuItem).setTooltipText((CharSequence) f10);
            } else if (Build.VERSION.SDK_INT >= 26) {
                q.a.m(menuItem, f10);
            }
            a3.q.a(menuItem, f10);
        }
        return aVar;
    }
}
