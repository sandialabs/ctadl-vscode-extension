package e3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import y2.d;

/* loaded from: classes.dex */
public final class h {

    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }

        public static int c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static int b(View view) {
            return view.getLayoutDirection();
        }

        public static int c(View view) {
            return view.getTextDirection();
        }

        public static Locale d(TextView textView) {
            return textView.getTextLocale();
        }

        public static void e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
        }

        public static void g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void h(View view, int i10) {
            view.setTextDirection(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(TextView textView) {
            int breakStrategy;
            breakStrategy = textView.getBreakStrategy();
            return breakStrategy;
        }

        public static ColorStateList b(TextView textView) {
            ColorStateList compoundDrawableTintList;
            compoundDrawableTintList = textView.getCompoundDrawableTintList();
            return compoundDrawableTintList;
        }

        public static PorterDuff.Mode c(TextView textView) {
            PorterDuff.Mode compoundDrawableTintMode;
            compoundDrawableTintMode = textView.getCompoundDrawableTintMode();
            return compoundDrawableTintMode;
        }

        public static int d(TextView textView) {
            int hyphenationFrequency;
            hyphenationFrequency = textView.getHyphenationFrequency();
            return hyphenationFrequency;
        }

        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static DecimalFormatSymbols a(Locale locale) {
            DecimalFormatSymbols decimalFormatSymbols;
            decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
            return decimalFormatSymbols;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        public static PrecomputedText.Params b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        public static void c(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f10638a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f10639b;
        public Class<?> c;

        /* renamed from: d  reason: collision with root package name */
        public Method f10640d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10641e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f10642f = false;

        public f(ActionMode.Callback callback, TextView textView) {
            this.f10638a = callback;
            this.f10639b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f10638a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f10638a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f10638a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:72:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Method declaredMethod;
            int checkSelfPermission;
            boolean z10;
            boolean z11;
            TextView textView = this.f10639b;
            Context context = textView.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f10642f) {
                this.f10642f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.c = cls;
                    this.f10640d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f10641e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.c = null;
                    this.f10640d = null;
                    this.f10641e = false;
                }
            }
            try {
                if (this.f10641e && this.c.isInstance(menu)) {
                    declaredMethod = this.f10640d;
                } else {
                    declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (context instanceof Activity) {
                    for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                        if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            if (activityInfo.exported) {
                                String str = activityInfo.permission;
                                if (str != null) {
                                    checkSelfPermission = context.checkSelfPermission(str);
                                    if (checkSelfPermission == 0) {
                                    }
                                }
                            }
                            z10 = false;
                            if (!z10) {
                                arrayList.add(resolveInfo);
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                    }
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i10);
                    MenuItem add = menu.add(0, 0, i10 + 100, resolveInfo2.loadLabel(packageManager));
                    Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                    if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z11);
                    ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                    add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
            return this.f10638a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r4 != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d.a a(TextView textView) {
        int i10;
        int i11;
        TextDirectionHeuristic textDirectionHeuristic;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            return new d.a(e.b(textView));
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 23) {
            i10 = 1;
            i11 = 1;
        } else {
            i10 = 0;
            i11 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (i12 >= 23) {
            i10 = c.a(textView);
            i11 = c.d(textView);
        }
        if (!(textView.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            if (i12 >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(e.a(d.a(b.d(textView)))[0].codePointAt(0));
                if (directionality != 1) {
                    if (directionality == 2) {
                    }
                }
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                if (b.b(textView) == 1) {
                    z10 = true;
                }
                switch (b.c(textView)) {
                    case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                }
            }
            return new d.a(textPaint, textDirectionHeuristic, i10, i11);
        }
        textDirectionHeuristic = TextDirectionHeuristics.LTR;
        return new d.a(textPaint, textDirectionHeuristic, i10, i11);
    }

    public static void b(TextView textView, int i10) {
        v8.b.l(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            e.c(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i10) {
        v8.b.l(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = a.a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void d(TextView textView, y2.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            dVar.getClass();
            textView.setText((CharSequence) null);
            return;
        }
        d.a a10 = a(textView);
        dVar.getClass();
        if (!a10.a(null)) {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        textView.setText(dVar);
    }

    public static void e(TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i10);
        } else {
            textView.setTextAppearance(textView.getContext(), i10);
        }
    }

    public static ActionMode.Callback f(ActionMode.Callback callback) {
        if ((callback instanceof f) && Build.VERSION.SDK_INT >= 26) {
            return ((f) callback).f10638a;
        }
        return callback;
    }

    public static ActionMode.Callback g(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 <= 27 && !(callback instanceof f) && callback != null) {
            return new f(callback, textView);
        }
        return callback;
    }
}
