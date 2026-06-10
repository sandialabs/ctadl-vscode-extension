package com.noto.app.folder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.airbnb.epoxy.z;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.noto.R;
import com.noto.app.domain.model.Font;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.folder.NoteItem;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import s6.c0;
import x6.g0;
import x6.h0;

@SuppressLint({"NonConstantResourceId"})
/* loaded from: classes.dex */
public abstract class NoteItem extends z<a> {

    /* renamed from: k  reason: collision with root package name */
    public h0 f8586k;

    /* renamed from: l  reason: collision with root package name */
    public Font f8587l;

    /* renamed from: m  reason: collision with root package name */
    public NotoColor f8588m;
    public String n;

    /* renamed from: o  reason: collision with root package name */
    public int f8589o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8590p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8591q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8592r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8593s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8594t;

    /* renamed from: u  reason: collision with root package name */
    public int f8595u;

    /* renamed from: v  reason: collision with root package name */
    public View.OnClickListener f8596v;

    /* renamed from: w  reason: collision with root package name */
    public View.OnLongClickListener f8597w;

    /* renamed from: x  reason: collision with root package name */
    public View.OnTouchListener f8598x;

    /* renamed from: y  reason: collision with root package name */
    public View.OnClickListener f8599y;

    /* renamed from: z  reason: collision with root package name */
    public View.OnClickListener f8600z;

    /* loaded from: classes.dex */
    public static final class a extends com.airbnb.epoxy.p {

        /* renamed from: a  reason: collision with root package name */
        public c0 f8601a;

        @Override // com.airbnb.epoxy.p
        public final void a(View view) {
            v7.g.f(view, "itemView");
            this.f8601a = c0.a(view);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c0 f8603b;

        public b(c0 c0Var) {
            this.f8603b = c0Var;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            v7.g.f(motionEvent, "e");
            View.OnLongClickListener onLongClickListener = NoteItem.this.f8597w;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(this.f8603b.f17313a);
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            View.OnClickListener onClickListener;
            v7.g.f(motionEvent, "e");
            NoteItem noteItem = NoteItem.this;
            boolean L = noteItem.L();
            c0 c0Var = this.f8603b;
            if (L) {
                if (noteItem.G().c) {
                    onClickListener = noteItem.f8600z;
                    if (onClickListener == null) {
                        return true;
                    }
                } else {
                    onClickListener = noteItem.f8599y;
                    if (onClickListener == null) {
                        return true;
                    }
                }
            } else {
                onClickListener = noteItem.f8596v;
                if (onClickListener == null) {
                    return true;
                }
            }
            onClickListener.onClick(c0Var.f17313a);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0318, code lost:
        if (r4 == null) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ab  */
    @Override // com.airbnb.epoxy.z
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(a aVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        View.OnLongClickListener onLongClickListener;
        int i15;
        int i16;
        int d5;
        ViewGroup.LayoutParams layoutParams;
        int i17;
        int i18;
        Typeface b5;
        Context context;
        Typeface typeface;
        Typeface typeface2;
        Typeface b10;
        boolean z11;
        int i19;
        int i20;
        String str;
        Drawable mutate;
        v7.g.f(aVar, "holder");
        c0 c0Var = aVar.f8601a;
        if (c0Var != null) {
            FrameLayout frameLayout = c0Var.f17313a;
            Context context2 = frameLayout.getContext();
            LinearLayout linearLayout = c0Var.f17316e;
            LinearLayout linearLayout2 = c0Var.f17315d;
            ImageView imageView = c0Var.c;
            TextView textView = c0Var.f17318g;
            TextView textView2 = c0Var.f17319h;
            TextView textView3 = c0Var.f17321j;
            TextView textView4 = c0Var.f17320i;
            if (context2 != null) {
                int b11 = f7.q.b(context2, f7.q.j(E()));
                Drawable background = linearLayout2.getBackground();
                if (background != null) {
                    ViewUtilsKt.s(background, f7.q.h(b11));
                }
                textView3.setLinkTextColor(b11);
                textView4.setLinkTextColor(b11);
                textView3.setText(I(b11, context2, G().f18683a.c));
                if (ha.i.T0(G().f18683a.c) && this.f8589o == 0) {
                    textView4.setText(I(b11, context2, ModelUtilsKt.D(G().f18683a.f17623d, 1)));
                    textView4.setMaxLines(1);
                    textView4.setVisibility(0);
                } else {
                    textView4.setText(I(b11, context2, ModelUtilsKt.D(G().f18683a.f17623d, this.f8589o)));
                    if (this.f8589o != 0 && (!ha.i.T0(G().f18683a.f17623d))) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i19 = 0;
                    } else {
                        i19 = 8;
                    }
                    textView4.setVisibility(i19);
                    if (K()) {
                        textView3.setMaxLines(3);
                        i20 = 5;
                    } else {
                        textView3.setMaxLines(Integer.MAX_VALUE);
                        i20 = this.f8589o;
                    }
                    textView4.setMaxLines(i20);
                }
                if (N()) {
                    na.c cVar = G().f18683a.f17625f;
                    Context context3 = frameLayout.getContext();
                    v7.g.e(context3, "root.context");
                    textView2.setText(f7.q.f(context2, R.string.created, f7.g.a(cVar, context3)));
                }
                if (M()) {
                    na.c cVar2 = G().f18683a.f17630k;
                    Context context4 = frameLayout.getContext();
                    v7.g.e(context4, "root.context");
                    textView.setText(f7.q.f(context2, R.string.accessed, f7.g.a(cVar2, context4)));
                }
                if (G().f18683a.f17628i != null) {
                    Drawable background2 = linearLayout.getBackground();
                    if (background2 != null && (mutate = background2.mutate()) != null) {
                        mutate.setTint(b11);
                    }
                    na.c cVar3 = G().f18683a.f17628i;
                    if (cVar3 != null) {
                        str = f7.g.a(cVar3, context2);
                    } else {
                        str = null;
                    }
                    c0Var.f17322k.setText(str);
                }
                imageView.setImageTintList(f7.q.h(b11));
            }
            v7.g.e(textView2, "tvCreationDate");
            if (N()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            textView2.setVisibility(i10);
            v7.g.e(textView, "tvAccessDate");
            if (M()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            textView.setVisibility(i11);
            v7.g.e(textView3, "tvNoteTitle");
            if (!ha.i.T0(G().f18683a.c)) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            textView3.setVisibility(i12);
            v7.g.e(linearLayout, "llReminder");
            if (G().f18683a.f17628i != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            linearLayout.setVisibility(i13);
            v7.g.e(imageView, "ivSelected");
            if (G().c) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            imageView.setVisibility(i14);
            imageView.setSelected(G().c);
            if (L()) {
                if (G().c) {
                    frameLayout.setOnClickListener(this.f8600z);
                    onLongClickListener = new View.OnLongClickListener() { // from class: x6.f0
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            NoteItem noteItem = NoteItem.this;
                            v7.g.f(noteItem, "this$0");
                            View.OnClickListener onClickListener = noteItem.f8600z;
                            if (onClickListener != null) {
                                onClickListener.onClick(view);
                                return true;
                            }
                            return true;
                        }
                    };
                } else {
                    frameLayout.setOnClickListener(this.f8599y);
                    onLongClickListener = new g0(0, this);
                }
            } else {
                frameLayout.setOnClickListener(this.f8596v);
                onLongClickListener = this.f8597w;
            }
            frameLayout.setOnLongClickListener(onLongClickListener);
            ViewUtilsKt.t(textView3, F());
            v7.g.e(textView4, "tvNoteBody");
            ViewUtilsKt.r(textView4, F());
            ImageButton imageButton = c0Var.f17314b;
            v7.g.e(imageButton, "ibDrag");
            if (J()) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            imageButton.setVisibility(i15);
            imageButton.setOnTouchListener(this.f8598x);
            linearLayout2.setSelected(G().c);
            EpoxyRecyclerView epoxyRecyclerView = c0Var.f17317f;
            v7.g.e(epoxyRecyclerView, "rv");
            boolean z12 = true;
            if (!G().f18684b.isEmpty()) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            epoxyRecyclerView.setVisibility(i16);
            epoxyRecyclerView.setLayoutManager(new FlexboxLayoutManager(frameLayout.getContext()));
            epoxyRecyclerView.p0(new NoteItem$bind$1$4(this));
            ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (!ha.i.T0(G().f18683a.f17623d) && this.f8589o != 0) {
                    d5 = f7.q.d(4);
                    int marginStart = marginLayoutParams.getMarginStart();
                    int i21 = marginLayoutParams.topMargin;
                    int marginEnd = marginLayoutParams.getMarginEnd();
                    marginLayoutParams.setMarginStart(marginStart);
                    marginLayoutParams.topMargin = i21;
                    marginLayoutParams.setMarginEnd(marginEnd);
                    marginLayoutParams.bottomMargin = d5;
                    textView3.setLayoutParams(marginLayoutParams);
                    layoutParams = textView4.getLayoutParams();
                    if (layoutParams == null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (ha.i.T0(G().f18683a.c)) {
                            i17 = 0;
                        } else {
                            i17 = 4;
                        }
                        int d10 = f7.q.d(i17);
                        int marginStart2 = marginLayoutParams2.getMarginStart();
                        int marginEnd2 = marginLayoutParams2.getMarginEnd();
                        int i22 = marginLayoutParams2.bottomMargin;
                        marginLayoutParams2.setMarginStart(marginStart2);
                        marginLayoutParams2.topMargin = d10;
                        marginLayoutParams2.setMarginEnd(marginEnd2);
                        marginLayoutParams2.bottomMargin = i22;
                        textView4.setLayoutParams(marginLayoutParams2);
                        if (ViewUtilsKt.i()) {
                            Context context5 = frameLayout.getContext();
                            i18 = R.font.nunito_semibold;
                            if (context5 != null) {
                                try {
                                    b10 = p2.f.b(context5, R.font.nunito_semibold);
                                } catch (Throwable unused) {
                                }
                                textView2.setTypeface(b10);
                                context = frameLayout.getContext();
                                if (context != null) {
                                    try {
                                        typeface2 = p2.f.b(context, i18);
                                    } catch (Throwable unused2) {
                                        typeface2 = null;
                                    }
                                    typeface = typeface2;
                                }
                                typeface = null;
                            }
                            b10 = null;
                            textView2.setTypeface(b10);
                            context = frameLayout.getContext();
                            if (context != null) {
                            }
                            typeface = null;
                        } else {
                            Context context6 = frameLayout.getContext();
                            i18 = R.font.nunito_semibold_italic;
                            if (context6 != null) {
                                try {
                                    b5 = p2.f.b(context6, R.font.nunito_semibold_italic);
                                } catch (Throwable unused3) {
                                }
                                textView2.setTypeface(b5);
                                context = frameLayout.getContext();
                            }
                            b5 = null;
                            textView2.setTypeface(b5);
                            context = frameLayout.getContext();
                        }
                        textView.setTypeface(typeface);
                        epoxyRecyclerView.setOnTouchListener(new n(new GestureDetector(frameLayout.getContext(), new b(c0Var)), 2, c0Var));
                        if (K()) {
                            frameLayout.getLayoutParams().width = (int) (this.f8595u * 0.9f);
                            z12 = false;
                        } else {
                            frameLayout.getLayoutParams().width = -1;
                        }
                        frameLayout.setEnabled(z12);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                d5 = f7.q.d(0);
                int marginStart3 = marginLayoutParams.getMarginStart();
                int i212 = marginLayoutParams.topMargin;
                int marginEnd3 = marginLayoutParams.getMarginEnd();
                marginLayoutParams.setMarginStart(marginStart3);
                marginLayoutParams.topMargin = i212;
                marginLayoutParams.setMarginEnd(marginEnd3);
                marginLayoutParams.bottomMargin = d5;
                textView3.setLayoutParams(marginLayoutParams);
                layoutParams = textView4.getLayoutParams();
                if (layoutParams == null) {
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else {
            v7.g.l("binding");
            throw null;
        }
    }

    public final NotoColor E() {
        NotoColor notoColor = this.f8588m;
        if (notoColor != null) {
            return notoColor;
        }
        v7.g.l("color");
        throw null;
    }

    public final Font F() {
        Font font = this.f8587l;
        if (font != null) {
            return font;
        }
        v7.g.l("font");
        throw null;
    }

    public final h0 G() {
        h0 h0Var = this.f8586k;
        if (h0Var != null) {
            return h0Var;
        }
        v7.g.l("model");
        throw null;
    }

    public final String H() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        v7.g.l("searchTerm");
        throw null;
    }

    public final SpannableString I(int i10, Context context, String str) {
        Typeface typeface;
        boolean z10;
        String H = H();
        int i11 = ModelUtilsKt.f9848a;
        v7.g.f(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            int b12 = kotlin.text.b.b1(i12, str, H, true);
            if (b12 < 0) {
                break;
            }
            arrayList.add(new b8.i(b12, H.length() + b12));
            i12 = b12 + 1;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            b8.i iVar = (b8.i) next;
            if (iVar.f6497i < iVar.f6498j) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                arrayList2.add(next);
            }
        }
        SpannableString valueOf = SpannableString.valueOf(str);
        v7.g.e(valueOf, "valueOf(this)");
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            b8.i iVar2 = (b8.i) it2.next();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i10);
            StyleSpan styleSpan = null;
            try {
                typeface = p2.f.b(context, R.font.nunito_black);
            } catch (Throwable unused) {
                typeface = null;
            }
            if (typeface != null) {
                styleSpan = new StyleSpan(typeface.getStyle());
            }
            StyleSpan styleSpan2 = new StyleSpan(1);
            int c0 = a1.c.c0(iVar2.f6497i, 0, valueOf.length());
            int c02 = a1.c.c0(iVar2.f6498j, 0, valueOf.length());
            valueOf.setSpan(foregroundColorSpan, c0, c02, 33);
            valueOf.setSpan(styleSpan2, c0, c02, 33);
            if (styleSpan != null) {
                valueOf.setSpan(styleSpan, c0, c02, 33);
            }
        }
        return valueOf;
    }

    public boolean J() {
        return this.f8592r;
    }

    public boolean K() {
        return this.f8594t;
    }

    public boolean L() {
        return this.f8593s;
    }

    public boolean M() {
        return this.f8591q;
    }

    public boolean N() {
        return this.f8590p;
    }
}
