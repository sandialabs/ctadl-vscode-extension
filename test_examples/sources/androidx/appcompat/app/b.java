package androidx.appcompat.app;

import a3.j0;
import a3.v0;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.n0;
import androidx.core.widget.NestedScrollView;
import com.noto.R;
import d.c;
import d.r;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends r implements DialogInterface {

    /* renamed from: m  reason: collision with root package name */
    public final AlertController f535m;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f536a;

        /* renamed from: b  reason: collision with root package name */
        public final int f537b;

        public a(Context context) {
            int g10 = b.g(context, 0);
            this.f536a = new AlertController.b(new ContextThemeWrapper(context, b.g(context, g10)));
            this.f537b = g10;
        }

        public final b a() {
            Message message;
            int i10;
            AlertController.b bVar = this.f536a;
            b bVar2 = new b(bVar.f520a, this.f537b);
            View view = bVar.f523e;
            AlertController alertController = bVar2.f535m;
            if (view != null) {
                alertController.f512v = view;
            } else {
                CharSequence charSequence = bVar.f522d;
                if (charSequence != null) {
                    alertController.f496e = charSequence;
                    TextView textView = alertController.f510t;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.c;
                if (drawable != null) {
                    alertController.f508r = drawable;
                    alertController.f507q = 0;
                    ImageView imageView = alertController.f509s;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f509s.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f524f;
            if (charSequence2 != null) {
                DialogInterface.OnClickListener onClickListener = bVar.f525g;
                if (onClickListener != null) {
                    message = alertController.D.obtainMessage(-2, onClickListener);
                } else {
                    message = null;
                }
                alertController.f503l = charSequence2;
                alertController.f504m = message;
                alertController.n = null;
            }
            if (bVar.f527i != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f521b.inflate(alertController.f516z, (ViewGroup) null);
                if (bVar.f530l) {
                    i10 = alertController.A;
                } else {
                    i10 = alertController.B;
                }
                ListAdapter listAdapter = bVar.f527i;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f520a, i10);
                }
                alertController.f513w = listAdapter;
                alertController.f514x = bVar.f531m;
                if (bVar.f528j != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar, alertController));
                }
                if (bVar.f530l) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f497f = recycleListView;
            }
            View view2 = bVar.f529k;
            if (view2 != null) {
                alertController.f498g = view2;
                alertController.f499h = 0;
                alertController.f500i = false;
            }
            bVar2.setCancelable(true);
            bVar2.setCanceledOnTouchOutside(true);
            bVar2.setOnCancelListener(null);
            bVar2.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = bVar.f526h;
            if (onKeyListener != null) {
                bVar2.setOnKeyListener(onKeyListener);
            }
            return bVar2;
        }
    }

    public b(Context context, int i10) {
        super(context, g(context, i10));
        this.f535m = new AlertController(getContext(), this, getWindow());
    }

    public static int g(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02b6, code lost:
        if (r2 != null) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0286  */
    @Override // d.r, androidx.activity.h, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        View view;
        boolean z12;
        boolean z13;
        View view2;
        boolean z14;
        int i10;
        boolean z15;
        View findViewById;
        AlertController.RecycleListView recycleListView;
        AlertController.RecycleListView recycleListView2;
        ListAdapter listAdapter;
        int i11;
        int i12;
        View findViewById2;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.f535m;
        alertController.f494b.setContentView(alertController.f515y);
        Window window = alertController.c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view3 = alertController.f498g;
        int i13 = 0;
        Context context = alertController.f493a;
        if (view3 == null) {
            if (alertController.f499h != 0) {
                view3 = LayoutInflater.from(context).inflate(alertController.f499h, viewGroup, false);
            } else {
                view3 = null;
            }
        }
        if (view3 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !AlertController.a(view3)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f500i) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f497f != null) {
                ((LinearLayout.LayoutParams) ((n0.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c = AlertController.c(findViewById7, findViewById4);
        ViewGroup c10 = AlertController.c(findViewById8, findViewById5);
        ViewGroup c11 = AlertController.c(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.f506p = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f506p.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c10.findViewById(16908299);
        alertController.f511u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            alertController.f506p.removeView(alertController.f511u);
            if (alertController.f497f != null) {
                ViewGroup viewGroup2 = (ViewGroup) alertController.f506p.getParent();
                int indexOfChild = viewGroup2.indexOfChild(alertController.f506p);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(alertController.f497f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c10.setVisibility(8);
            }
        }
        Button button2 = (Button) c11.findViewById(16908313);
        alertController.f501j = button2;
        AlertController.a aVar = alertController.E;
        button2.setOnClickListener(aVar);
        alertController.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        int i14 = alertController.f495d;
        if (isEmpty) {
            alertController.getClass();
            alertController.f501j.setVisibility(8);
            z11 = false;
        } else {
            Button button3 = alertController.f501j;
            alertController.getClass();
            button3.setText((CharSequence) null);
            alertController.getClass();
            alertController.f501j.setVisibility(0);
            z11 = true;
        }
        Button button4 = (Button) c11.findViewById(16908314);
        alertController.f502k = button4;
        button4.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f503l) && alertController.n == null) {
            alertController.f502k.setVisibility(8);
        } else {
            alertController.f502k.setText(alertController.f503l);
            Drawable drawable = alertController.n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i14, i14);
                alertController.f502k.setCompoundDrawables(alertController.n, null, null, null);
            }
            alertController.f502k.setVisibility(0);
            z11 |= true;
        }
        Button button5 = (Button) c11.findViewById(16908315);
        alertController.f505o = button5;
        button5.setOnClickListener(aVar);
        alertController.getClass();
        if (TextUtils.isEmpty(null)) {
            alertController.getClass();
            alertController.f505o.setVisibility(8);
            view = null;
        } else {
            Button button6 = alertController.f505o;
            alertController.getClass();
            button6.setText((CharSequence) null);
            alertController.getClass();
            view = null;
            alertController.f505o.setVisibility(0);
            z11 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z11) {
                button = alertController.f501j;
            } else if (z11) {
                button = alertController.f502k;
            } else if (z11) {
                button = alertController.f505o;
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
            layoutParams.gravity = 1;
            layoutParams.weight = 0.5f;
            button.setLayoutParams(layoutParams);
        }
        if (z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            c11.setVisibility(8);
        }
        if (alertController.f512v != null) {
            c.addView(alertController.f512v, 0, new ViewGroup.LayoutParams(-1, -2));
            view2 = window.findViewById(R.id.title_template);
        } else {
            alertController.f509s = (ImageView) window.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f496e)) && alertController.C) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.f510t = textView2;
                textView2.setText(alertController.f496e);
                int i15 = alertController.f507q;
                if (i15 != 0) {
                    alertController.f509s.setImageResource(i15);
                } else {
                    Drawable drawable2 = alertController.f508r;
                    if (drawable2 != null) {
                        alertController.f509s.setImageDrawable(drawable2);
                    } else {
                        alertController.f510t.setPadding(alertController.f509s.getPaddingLeft(), alertController.f509s.getPaddingTop(), alertController.f509s.getPaddingRight(), alertController.f509s.getPaddingBottom());
                        alertController.f509s.setVisibility(8);
                    }
                }
                if (viewGroup.getVisibility() == 8) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c == null && c.getVisibility() != 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (c11.getVisibility() == 8) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (!z15 && (findViewById2 = c10.findViewById(R.id.textSpacerNoButtons)) != null) {
                    findViewById2.setVisibility(0);
                }
                if (i10 == 0) {
                    NestedScrollView nestedScrollView2 = alertController.f506p;
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.setClipToPadding(true);
                    }
                    if (alertController.f497f != null) {
                        findViewById = c.findViewById(R.id.titleDividerNoCustom);
                    } else {
                        findViewById = view;
                    }
                    if (findViewById != null) {
                        findViewById.setVisibility(0);
                    }
                } else {
                    findViewById = c10.findViewById(R.id.textSpacerNoTitle);
                }
                recycleListView = alertController.f497f;
                if (recycleListView instanceof AlertController.RecycleListView) {
                    recycleListView.getClass();
                    if (!z15 || i10 == 0) {
                        int paddingLeft = recycleListView.getPaddingLeft();
                        if (i10 != 0) {
                            i11 = recycleListView.getPaddingTop();
                        } else {
                            i11 = recycleListView.f517i;
                        }
                        int paddingRight = recycleListView.getPaddingRight();
                        if (z15) {
                            i12 = recycleListView.getPaddingBottom();
                        } else {
                            i12 = recycleListView.f518j;
                        }
                        recycleListView.setPadding(paddingLeft, i11, paddingRight, i12);
                    }
                }
                if (!z14) {
                    View view4 = alertController.f497f;
                    if (view4 == null) {
                        view4 = alertController.f506p;
                    }
                    if (view4 != null) {
                        if (z15) {
                            i13 = 2;
                        }
                        int i16 = i10 | i13;
                        View findViewById10 = window.findViewById(R.id.scrollIndicatorUp);
                        View findViewById11 = window.findViewById(R.id.scrollIndicatorDown);
                        int i17 = Build.VERSION.SDK_INT;
                        if (i17 >= 23) {
                            WeakHashMap<View, v0> weakHashMap = j0.f188a;
                            if (i17 >= 23) {
                                j0.j.d(view4, i16, 3);
                            }
                            if (findViewById10 != null) {
                                c10.removeView(findViewById10);
                            }
                            if (findViewById11 != null) {
                                c10.removeView(findViewById11);
                            }
                        } else {
                            if (findViewById10 != null && (i16 & 1) == 0) {
                                c10.removeView(findViewById10);
                                findViewById10 = view;
                            }
                            if (findViewById11 != null && (i16 & 2) == 0) {
                                c10.removeView(findViewById11);
                            } else {
                                view = findViewById11;
                            }
                            if (findViewById10 != null || view != null) {
                                AlertController.RecycleListView recycleListView3 = alertController.f497f;
                                if (recycleListView3 != null) {
                                    recycleListView3.setOnScrollListener(new d.b(findViewById10, view));
                                    alertController.f497f.post(new c(alertController, findViewById10, view));
                                } else {
                                    if (findViewById10 != null) {
                                        c10.removeView(findViewById10);
                                    }
                                    if (view != null) {
                                        findViewById11 = view;
                                        c10.removeView(findViewById11);
                                    }
                                }
                            }
                        }
                    }
                }
                recycleListView2 = alertController.f497f;
                if (recycleListView2 == null && (listAdapter = alertController.f513w) != null) {
                    recycleListView2.setAdapter(listAdapter);
                    int i18 = alertController.f514x;
                    if (i18 > -1) {
                        recycleListView2.setItemChecked(i18, true);
                        recycleListView2.setSelection(i18);
                        return;
                    }
                    return;
                }
            }
            window.findViewById(R.id.title_template).setVisibility(8);
            alertController.f509s.setVisibility(8);
            view2 = c;
        }
        view2.setVisibility(8);
        if (viewGroup.getVisibility() == 8) {
        }
        if (c == null) {
        }
        i10 = 0;
        if (c11.getVisibility() == 8) {
        }
        if (!z15) {
            findViewById2.setVisibility(0);
        }
        if (i10 == 0) {
        }
        recycleListView = alertController.f497f;
        if (recycleListView instanceof AlertController.RecycleListView) {
        }
        if (!z14) {
        }
        recycleListView2 = alertController.f497f;
        if (recycleListView2 == null) {
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f535m.f506p;
        if (nestedScrollView != null && nestedScrollView.e(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f535m.f506p;
        if (nestedScrollView != null && nestedScrollView.e(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // d.r, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f535m;
        alertController.f496e = charSequence;
        TextView textView = alertController.f510t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
