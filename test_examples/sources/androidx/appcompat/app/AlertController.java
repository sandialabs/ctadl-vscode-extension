package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.noto.R;
import d.r;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AlertController {
    public final int A;
    public final int B;
    public final boolean C;
    public final c D;

    /* renamed from: a  reason: collision with root package name */
    public final Context f493a;

    /* renamed from: b  reason: collision with root package name */
    public final r f494b;
    public final Window c;

    /* renamed from: d  reason: collision with root package name */
    public final int f495d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f496e;

    /* renamed from: f  reason: collision with root package name */
    public RecycleListView f497f;

    /* renamed from: g  reason: collision with root package name */
    public View f498g;

    /* renamed from: h  reason: collision with root package name */
    public int f499h;

    /* renamed from: j  reason: collision with root package name */
    public Button f501j;

    /* renamed from: k  reason: collision with root package name */
    public Button f502k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f503l;

    /* renamed from: m  reason: collision with root package name */
    public Message f504m;
    public Drawable n;

    /* renamed from: o  reason: collision with root package name */
    public Button f505o;

    /* renamed from: p  reason: collision with root package name */
    public NestedScrollView f506p;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f508r;

    /* renamed from: s  reason: collision with root package name */
    public ImageView f509s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f510t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f511u;

    /* renamed from: v  reason: collision with root package name */
    public View f512v;

    /* renamed from: w  reason: collision with root package name */
    public ListAdapter f513w;

    /* renamed from: y  reason: collision with root package name */
    public final int f515y;

    /* renamed from: z  reason: collision with root package name */
    public final int f516z;

    /* renamed from: i  reason: collision with root package name */
    public boolean f500i = false;

    /* renamed from: q  reason: collision with root package name */
    public int f507q = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f514x = -1;
    public final a E = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: i  reason: collision with root package name */
        public final int f517i;

        /* renamed from: j  reason: collision with root package name */
        public final int f518j;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a1.b.D);
            this.f518j = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f517i = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            if (view == alertController.f501j) {
                alertController.getClass();
            }
            if (view != alertController.f502k || (message2 = alertController.f504m) == null) {
                if (view == alertController.f505o) {
                    alertController.getClass();
                }
                message = null;
            } else {
                message = Message.obtain(message2);
            }
            if (message != null) {
                message.sendToTarget();
            }
            alertController.D.obtainMessage(1, alertController.f494b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f520a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f521b;
        public Drawable c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f522d;

        /* renamed from: e  reason: collision with root package name */
        public View f523e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f524f;

        /* renamed from: g  reason: collision with root package name */
        public DialogInterface.OnClickListener f525g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnKeyListener f526h;

        /* renamed from: i  reason: collision with root package name */
        public ListAdapter f527i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f528j;

        /* renamed from: k  reason: collision with root package name */
        public View f529k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f530l;

        /* renamed from: m  reason: collision with root package name */
        public int f531m = -1;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f520a = contextThemeWrapper;
            this.f521b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<DialogInterface> f532a;

        public c(DialogInterface dialogInterface) {
            this.f532a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f532a.get(), message.what);
            } else if (i10 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i10) {
            super(context, i10, 16908308, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f493a = context;
        this.f494b = rVar;
        this.c = window;
        this.D = new c(rVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a1.b.f42o, R.attr.alertDialogStyle, 0);
        this.f515y = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f516z = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.A = obtainStyledAttributes.getResourceId(7, 0);
        this.B = obtainStyledAttributes.getResourceId(3, 0);
        this.C = obtainStyledAttributes.getBoolean(6, true);
        this.f495d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        rVar.c().w(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        int i10 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
