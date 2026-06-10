package h7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.widget.FolderListWidgetConfigActivity;
import f7.q;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class a extends ArrayAdapter<Pair<? extends t6.a, ? extends Integer>> {

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11540i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FolderListWidgetConfigActivity folderListWidgetConfigActivity, List list, boolean z10) {
        super(folderListWidgetConfigActivity, (int) R.layout.folder_list_widget, list);
        v7.g.f(folderListWidgetConfigActivity, "context");
        this.f11540i = z10;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @SuppressLint({"ViewHolder"})
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        Context context;
        int i11;
        v7.g.f(viewGroup, "parent");
        int i12 = 0;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.widget_folder_item, viewGroup, false);
        int i13 = R.id.iv_folder_icon;
        ImageView imageView = (ImageView) a1.b.O(inflate, R.id.iv_folder_icon);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            TextView textView = (TextView) a1.b.O(inflate, R.id.tv_folder_notes_count);
            if (textView != null) {
                TextView textView2 = (TextView) a1.b.O(inflate, R.id.tv_folder_title);
                if (textView2 != null) {
                    Pair<? extends t6.a, ? extends Integer> item = getItem(i10);
                    if (item != null) {
                        t6.a aVar = (t6.a) item.f12962i;
                        int intValue = ((Number) item.f12963j).intValue();
                        Context context2 = getContext();
                        v7.g.e(context2, "context");
                        int b5 = q.b(context2, q.j(aVar.f17595e));
                        textView.setText(String.valueOf(intValue));
                        textView2.setTextColor(b5);
                        textView.setTextColor(b5);
                        imageView.setColorFilter(b5);
                        Context context3 = getContext();
                        v7.g.e(context3, "context");
                        textView2.setText(ModelUtilsKt.o(context3, aVar));
                        if (ModelUtilsKt.u(aVar)) {
                            context = getContext();
                            v7.g.e(context, "context");
                            i11 = R.drawable.ic_round_folder_general_24;
                        } else {
                            context = getContext();
                            v7.g.e(context, "context");
                            i11 = R.drawable.ic_round_folder_24;
                        }
                        imageView.setImageDrawable(q.c(context, i11));
                        imageView.setImageTintList(q.h(b5));
                        int i14 = 8;
                        boolean z10 = this.f11540i;
                        if (!z10) {
                            i12 = 8;
                        }
                        textView.setVisibility(i12);
                        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                        if (layoutParams != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (!z10) {
                                i14 = 16;
                            }
                            int d5 = q.d(Integer.valueOf(i14));
                            int marginStart = marginLayoutParams.getMarginStart();
                            int i15 = marginLayoutParams.topMargin;
                            int i16 = marginLayoutParams.bottomMargin;
                            marginLayoutParams.setMarginStart(marginStart);
                            marginLayoutParams.topMargin = i15;
                            marginLayoutParams.setMarginEnd(d5);
                            marginLayoutParams.bottomMargin = i16;
                            textView2.setLayoutParams(marginLayoutParams);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        }
                    }
                    v7.g.e(linearLayout, "root");
                    return linearLayout;
                }
                i13 = R.id.tv_folder_title;
            } else {
                i13 = R.id.tv_folder_notes_count;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i13)));
    }
}
