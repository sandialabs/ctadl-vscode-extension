package s6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.noto.R;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final NestedScrollView f17333a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialRadioButton f17334b;
    public final MaterialRadioButton c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialRadioButton f17335d;

    /* renamed from: e  reason: collision with root package name */
    public final c f17336e;

    public e0(NestedScrollView nestedScrollView, MaterialRadioButton materialRadioButton, MaterialRadioButton materialRadioButton2, MaterialRadioButton materialRadioButton3, c cVar) {
        this.f17333a = nestedScrollView;
        this.f17334b = materialRadioButton;
        this.c = materialRadioButton2;
        this.f17335d = materialRadioButton3;
        this.f17336e = cVar;
    }

    public static e0 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.note_list_filtering_dialog_fragment, viewGroup, false);
        int i10 = R.id.ll;
        if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
            i10 = R.id.rb_exclusive;
            MaterialRadioButton materialRadioButton = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_exclusive);
            if (materialRadioButton != null) {
                i10 = R.id.rb_inclusive;
                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_inclusive);
                if (materialRadioButton2 != null) {
                    i10 = R.id.rb_strict;
                    MaterialRadioButton materialRadioButton3 = (MaterialRadioButton) a1.b.O(inflate, R.id.rb_strict);
                    if (materialRadioButton3 != null) {
                        i10 = R.id.rg_type;
                        if (((RadioGroup) a1.b.O(inflate, R.id.rg_type)) != null) {
                            i10 = R.id.tb;
                            View O = a1.b.O(inflate, R.id.tb);
                            if (O != null) {
                                return new e0((NestedScrollView) inflate, materialRadioButton, materialRadioButton2, materialRadioButton3, c.a(O));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
    }
}
