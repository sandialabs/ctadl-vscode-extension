package androidx.appcompat.view.menu;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d1;
import com.noto.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: i  reason: collision with root package name */
    public h f552i;

    /* renamed from: j  reason: collision with root package name */
    public ImageView f553j;

    /* renamed from: k  reason: collision with root package name */
    public RadioButton f554k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f555l;

    /* renamed from: m  reason: collision with root package name */
    public CheckBox f556m;
    public TextView n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f557o;

    /* renamed from: p  reason: collision with root package name */
    public ImageView f558p;

    /* renamed from: q  reason: collision with root package name */
    public LinearLayout f559q;

    /* renamed from: r  reason: collision with root package name */
    public final Drawable f560r;

    /* renamed from: s  reason: collision with root package name */
    public final int f561s;

    /* renamed from: t  reason: collision with root package name */
    public final Context f562t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f563u;

    /* renamed from: v  reason: collision with root package name */
    public final Drawable f564v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f565w;

    /* renamed from: x  reason: collision with root package name */
    public LayoutInflater f566x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f567y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d1 m10 = d1.m(getContext(), attributeSet, a1.b.B, R.attr.listMenuViewStyle);
        this.f560r = m10.e(5);
        this.f561s = m10.i(1, -1);
        this.f563u = m10.a(7, false);
        this.f562t = context;
        this.f564v = m10.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f565w = obtainStyledAttributes.hasValue(0);
        m10.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f566x == null) {
            this.f566x = LayoutInflater.from(getContext());
        }
        return this.f566x;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f557o;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f558p;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f558p.getLayoutParams();
        rect.top = this.f558p.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    @Override // androidx.appcompat.view.menu.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h hVar) {
        int i10;
        boolean z10;
        char c;
        int i11;
        int i12;
        String sb;
        boolean z11;
        char c10;
        char c11;
        this.f552i = hVar;
        int i13 = 0;
        if (hVar.isVisible()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        setTitle(hVar.f641e);
        setCheckable(hVar.isCheckable());
        f fVar = hVar.n;
        if (fVar.o()) {
            if (fVar.n()) {
                c11 = hVar.f646j;
            } else {
                c11 = hVar.f644h;
            }
            if (c11 != 0) {
                z10 = true;
                fVar.n();
                if (z10) {
                    h hVar2 = this.f552i;
                    f fVar2 = hVar2.n;
                    if (fVar2.o()) {
                        if (fVar2.n()) {
                            c10 = hVar2.f646j;
                        } else {
                            c10 = hVar2.f644h;
                        }
                        if (c10 != 0) {
                            z11 = true;
                            if (z11) {
                                if (i13 == 0) {
                                    TextView textView = this.n;
                                    h hVar3 = this.f552i;
                                    if (hVar3.n.n()) {
                                        c = hVar3.f646j;
                                    } else {
                                        c = hVar3.f644h;
                                    }
                                    if (c == 0) {
                                        sb = "";
                                    } else {
                                        f fVar3 = hVar3.n;
                                        Resources resources = fVar3.f613a.getResources();
                                        StringBuilder sb2 = new StringBuilder();
                                        if (ViewConfiguration.get(fVar3.f613a).hasPermanentMenuKey()) {
                                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                                        }
                                        if (fVar3.n()) {
                                            i11 = hVar3.f647k;
                                        } else {
                                            i11 = hVar3.f645i;
                                        }
                                        h.c(i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                                        h.c(i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                                        h.c(i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                                        h.c(i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                                        h.c(i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                                        h.c(i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                                        if (c != '\b') {
                                            if (c != '\n') {
                                                if (c != ' ') {
                                                    sb2.append(c);
                                                    sb = sb2.toString();
                                                } else {
                                                    i12 = R.string.abc_menu_space_shortcut_label;
                                                }
                                            } else {
                                                i12 = R.string.abc_menu_enter_shortcut_label;
                                            }
                                        } else {
                                            i12 = R.string.abc_menu_delete_shortcut_label;
                                        }
                                        sb2.append(resources.getString(i12));
                                        sb = sb2.toString();
                                    }
                                    textView.setText(sb);
                                }
                                if (this.n.getVisibility() != i13) {
                                    this.n.setVisibility(i13);
                                }
                                setIcon(hVar.getIcon());
                                setEnabled(hVar.isEnabled());
                                setSubMenuArrowVisible(hVar.hasSubMenu());
                                setContentDescription(hVar.f652q);
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                }
                i13 = 8;
                if (i13 == 0) {
                }
                if (this.n.getVisibility() != i13) {
                }
                setIcon(hVar.getIcon());
                setEnabled(hVar.isEnabled());
                setSubMenuArrowVisible(hVar.hasSubMenu());
                setContentDescription(hVar.f652q);
            }
        }
        z10 = false;
        fVar.n();
        if (z10) {
        }
        i13 = 8;
        if (i13 == 0) {
        }
        if (this.n.getVisibility() != i13) {
        }
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.f652q);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f552i;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, v0> weakHashMap = j0.f188a;
        j0.d.q(this, this.f560r);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f555l = textView;
        int i10 = this.f561s;
        if (i10 != -1) {
            textView.setTextAppearance(this.f562t, i10);
        }
        this.n = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f557o = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f564v);
        }
        this.f558p = (ImageView) findViewById(R.id.group_divider);
        this.f559q = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f553j != null && this.f563u) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f553j.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f554k == null && this.f556m == null) {
            return;
        }
        if ((this.f552i.f659x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f554k == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f554k = radioButton;
                LinearLayout linearLayout = this.f559q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f554k;
            view = this.f556m;
        } else {
            if (this.f556m == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f556m = checkBox;
                LinearLayout linearLayout2 = this.f559q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f556m;
            view = this.f554k;
        }
        if (z10) {
            compoundButton.setChecked(this.f552i.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f556m;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f554k;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        if ((this.f552i.f659x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f554k == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f554k = radioButton;
                LinearLayout linearLayout = this.f559q;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f554k;
        } else {
            if (this.f556m == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f556m = checkBox;
                LinearLayout linearLayout2 = this.f559q;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f556m;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f567y = z10;
        this.f563u = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f558p;
        if (imageView != null) {
            imageView.setVisibility((this.f565w || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f552i.n.getClass();
        boolean z10 = this.f567y;
        if (!z10 && !this.f563u) {
            return;
        }
        ImageView imageView = this.f553j;
        if (imageView == null && drawable == null && !this.f563u) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f553j = imageView2;
            LinearLayout linearLayout = this.f559q;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f563u) {
            this.f553j.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f553j;
        if (!z10) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f553j.getVisibility() != 0) {
            this.f553j.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i10;
        TextView textView;
        if (charSequence != null) {
            this.f555l.setText(charSequence);
            if (this.f555l.getVisibility() == 0) {
                return;
            }
            textView = this.f555l;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f555l.getVisibility() == 8) {
                return;
            }
            textView = this.f555l;
        }
        textView.setVisibility(i10);
    }
}
