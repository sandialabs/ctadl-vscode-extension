package h7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.domain.model.NotoColor;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import com.noto.app.widget.NoteListWidgetConfigActivity;
import f7.q;
import java.util.ArrayList;
import java.util.List;
import x6.h0;

/* loaded from: classes.dex */
public final class f extends ArrayAdapter<h0> {

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11548i;

    /* renamed from: j  reason: collision with root package name */
    public final NotoColor f11549j;

    /* renamed from: k  reason: collision with root package name */
    public final int f11550k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(NoteListWidgetConfigActivity noteListWidgetConfigActivity, ArrayList arrayList, boolean z10, NotoColor notoColor, int i10) {
        super(noteListWidgetConfigActivity, (int) R.layout.note_list_widget, arrayList);
        v7.g.f(noteListWidgetConfigActivity, "context");
        v7.g.f(notoColor, "color");
        this.f11548i = z10;
        this.f11549j = notoColor;
        this.f11550k = i10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:11|(2:13|(23:15|16|(1:18)(1:85)|19|(1:21)(1:84)|22|(1:24)(1:83)|25|(4:74|(1:82)(1:78)|(1:80)|81)(1:28)|29|(12:33|34|(1:36)(1:72)|37|(3:40|(3:42|(2:46|47)|48)(3:51|52|53)|38)|55|56|(3:58|(1:60)|66)(3:69|(1:71)|66)|61|62|63|66)|73|34|(0)(0)|37|(1:38)|55|56|(0)(0)|61|62|63|66))|86|16|(0)(0)|19|(0)(0)|22|(0)(0)|25|(0)|74|(1:76)|82|(0)|81|29|(12:33|34|(0)(0)|37|(1:38)|55|56|(0)(0)|61|62|63|66)|73|34|(0)(0)|37|(1:38)|55|56|(0)(0)|61|62|63|66) */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b7  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @SuppressLint({"ViewHolder"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        LinearLayout linearLayout;
        NotoColor notoColor;
        int i11;
        int i12;
        String str;
        boolean z10;
        int i13;
        List<t6.c> list;
        int i14;
        boolean T0;
        String str2;
        int i15;
        int d5;
        int i16;
        Context context;
        int i17;
        Drawable mutate;
        v7.g.f(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(getContext());
        View inflate = from.inflate(R.layout.widget_note_item, viewGroup, false);
        LinearLayout linearLayout2 = (LinearLayout) inflate;
        int i18 = R.id.ll_labels;
        LinearLayout linearLayout3 = (LinearLayout) a1.b.O(inflate, R.id.ll_labels);
        if (linearLayout3 != null) {
            i18 = R.id.tv_creation_date;
            TextView textView = (TextView) a1.b.O(inflate, R.id.tv_creation_date);
            if (textView != null) {
                i18 = R.id.tv_note_body;
                TextView textView2 = (TextView) a1.b.O(inflate, R.id.tv_note_body);
                if (textView2 != null) {
                    i18 = R.id.tv_note_title;
                    TextView textView3 = (TextView) a1.b.O(inflate, R.id.tv_note_title);
                    if (textView3 != null) {
                        h0 item = getItem(i10);
                        if (item != null) {
                            Context context2 = linearLayout2.getContext();
                            boolean z11 = this.f11548i;
                            NotoColor notoColor2 = this.f11549j;
                            t6.d dVar = item.f18683a;
                            if (context2 != null) {
                                int b5 = q.b(context2, q.j(notoColor2));
                                textView3.setLinkTextColor(b5);
                                textView2.setLinkTextColor(b5);
                                if (z11) {
                                    na.c cVar = dVar.f17625f;
                                    notoColor = notoColor2;
                                    Context context3 = linearLayout2.getContext();
                                    linearLayout = linearLayout2;
                                    v7.g.e(context3, "root.context");
                                    textView.setText(q.f(context2, R.string.created, f7.g.a(cVar, context3)));
                                    textView3.setText(dVar.c);
                                    i11 = 8;
                                    if (!z11) {
                                        i12 = 0;
                                    } else {
                                        i12 = 8;
                                    }
                                    textView.setVisibility(i12);
                                    str = dVar.c;
                                    z10 = true;
                                    if (!(!ha.i.T0(str))) {
                                        i13 = 0;
                                    } else {
                                        i13 = 8;
                                    }
                                    textView3.setVisibility(i13);
                                    textView3.setMaxLines(3);
                                    list = item.f18684b;
                                    if (!(!list.isEmpty())) {
                                        i14 = 0;
                                    } else {
                                        i14 = 8;
                                    }
                                    linearLayout3.setVisibility(i14);
                                    T0 = ha.i.T0(str);
                                    str2 = dVar.f17623d;
                                    i15 = this.f11550k;
                                    if (!T0 && i15 == 0) {
                                        textView2.setText(ModelUtilsKt.D(str2, 1));
                                        textView2.setMaxLines(1);
                                        textView2.setVisibility(0);
                                    } else {
                                        textView2.setText(ModelUtilsKt.D(str2, i15));
                                        textView2.setMaxLines(i15);
                                        if (i15 != 0 || !(!ha.i.T0(str2))) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            i11 = 0;
                                        }
                                        textView2.setVisibility(i11);
                                    }
                                    int d10 = q.d(0);
                                    int d11 = q.d(0);
                                    int d12 = q.d(0);
                                    if (!ha.i.T0(str2) && i15 != 0) {
                                        d5 = q.d(4);
                                        textView3.setPadding(d10, d11, d12, d5);
                                        if (!ha.i.T0(str)) {
                                            i16 = 0;
                                        } else {
                                            i16 = 4;
                                        }
                                        textView2.setPadding(q.d(i16), q.d(0), q.d(0), q.d(0));
                                        for (t6.c cVar2 : list) {
                                            View inflate2 = from.inflate(R.layout.note_label_item, viewGroup, false);
                                            if (inflate2 != null) {
                                                MaterialTextView materialTextView = (MaterialTextView) inflate2;
                                                materialTextView.setText(cVar2.c);
                                                Drawable background = materialTextView.getBackground();
                                                if (background != null && (mutate = background.mutate()) != null) {
                                                    Context context4 = getContext();
                                                    v7.g.e(context4, "context");
                                                    mutate.setTint(q.b(context4, q.j(notoColor)));
                                                }
                                                Context context5 = getContext();
                                                v7.g.e(context5, "context");
                                                materialTextView.setTextColor(q.a(context5, R.attr.notoBackgroundColor));
                                                linearLayout3.addView(materialTextView);
                                            } else {
                                                throw new NullPointerException("rootView");
                                            }
                                        }
                                        Typeface typeface = null;
                                        if (!ViewUtilsKt.i()) {
                                            context = linearLayout.getContext();
                                            if (context != null) {
                                                i17 = R.font.nunito_semibold;
                                            }
                                            textView.setTypeface(typeface);
                                        } else {
                                            context = linearLayout.getContext();
                                            if (context != null) {
                                                i17 = R.font.nunito_semibold_italic;
                                            }
                                            textView.setTypeface(typeface);
                                        }
                                        typeface = p2.f.b(context, i17);
                                        textView.setTypeface(typeface);
                                    }
                                    d5 = q.d(0);
                                    textView3.setPadding(d10, d11, d12, d5);
                                    if (!ha.i.T0(str)) {
                                    }
                                    textView2.setPadding(q.d(i16), q.d(0), q.d(0), q.d(0));
                                    while (r3.hasNext()) {
                                    }
                                    Typeface typeface2 = null;
                                    if (!ViewUtilsKt.i()) {
                                    }
                                    typeface2 = p2.f.b(context, i17);
                                    textView.setTypeface(typeface2);
                                }
                            }
                            linearLayout = linearLayout2;
                            notoColor = notoColor2;
                            textView3.setText(dVar.c);
                            i11 = 8;
                            if (!z11) {
                            }
                            textView.setVisibility(i12);
                            str = dVar.c;
                            z10 = true;
                            if (!(!ha.i.T0(str))) {
                            }
                            textView3.setVisibility(i13);
                            textView3.setMaxLines(3);
                            list = item.f18684b;
                            if (!(!list.isEmpty())) {
                            }
                            linearLayout3.setVisibility(i14);
                            T0 = ha.i.T0(str);
                            str2 = dVar.f17623d;
                            i15 = this.f11550k;
                            if (!T0) {
                            }
                            textView2.setText(ModelUtilsKt.D(str2, i15));
                            textView2.setMaxLines(i15);
                            if (i15 != 0) {
                            }
                            z10 = false;
                            if (z10) {
                            }
                            textView2.setVisibility(i11);
                            int d102 = q.d(0);
                            int d112 = q.d(0);
                            int d122 = q.d(0);
                            if (!ha.i.T0(str2)) {
                                d5 = q.d(4);
                                textView3.setPadding(d102, d112, d122, d5);
                                if (!ha.i.T0(str)) {
                                }
                                textView2.setPadding(q.d(i16), q.d(0), q.d(0), q.d(0));
                                while (r3.hasNext()) {
                                }
                                Typeface typeface22 = null;
                                if (!ViewUtilsKt.i()) {
                                }
                                typeface22 = p2.f.b(context, i17);
                                textView.setTypeface(typeface22);
                            }
                            d5 = q.d(0);
                            textView3.setPadding(d102, d112, d122, d5);
                            if (!ha.i.T0(str)) {
                            }
                            textView2.setPadding(q.d(i16), q.d(0), q.d(0), q.d(0));
                            while (r3.hasNext()) {
                            }
                            Typeface typeface222 = null;
                            if (!ViewUtilsKt.i()) {
                            }
                            typeface222 = p2.f.b(context, i17);
                            textView.setTypeface(typeface222);
                        } else {
                            linearLayout = linearLayout2;
                        }
                        LinearLayout linearLayout4 = linearLayout;
                        v7.g.e(linearLayout4, "root");
                        return linearLayout4;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }
}
