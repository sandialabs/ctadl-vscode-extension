package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.noto.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import n2.a;

/* loaded from: classes.dex */
public final class w0 extends f3.c implements View.OnClickListener {
    public static final /* synthetic */ int F = 0;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;

    /* renamed from: s  reason: collision with root package name */
    public final SearchView f1121s;

    /* renamed from: t  reason: collision with root package name */
    public final SearchableInfo f1122t;

    /* renamed from: u  reason: collision with root package name */
    public final Context f1123u;

    /* renamed from: v  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1124v;

    /* renamed from: w  reason: collision with root package name */
    public final int f1125w;

    /* renamed from: x  reason: collision with root package name */
    public int f1126x;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f1127y;

    /* renamed from: z  reason: collision with root package name */
    public int f1128z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1129a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1130b;
        public final ImageView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1131d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1132e;

        public a(View view) {
            this.f1129a = (TextView) view.findViewById(16908308);
            this.f1130b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.f1131d = (ImageView) view.findViewById(16908296);
            this.f1132e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public w0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.f1126x = 1;
        this.f1128z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.E = -1;
        this.f1121s = searchView;
        this.f1122t = searchableInfo;
        this.f1125w = searchView.getSuggestionCommitIconResId();
        this.f1123u = context;
        this.f1124v = weakHashMap;
    }

    public static String i(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    @Override // f3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, Cursor cursor) {
        int i10;
        Drawable g10;
        Drawable g11;
        String obj;
        Drawable drawable;
        Drawable.ConstantState constantState;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        int i11;
        int i12;
        a aVar = (a) view.getTag();
        int i13 = this.E;
        if (i13 != -1) {
            i10 = cursor.getInt(i13);
        } else {
            i10 = 0;
        }
        TextView textView = aVar.f1129a;
        if (textView != null) {
            String i14 = i(cursor, this.f1128z);
            textView.setText(i14);
            if (TextUtils.isEmpty(i14)) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            textView.setVisibility(i12);
        }
        Context context = this.f1123u;
        TextView textView2 = aVar.f1130b;
        if (textView2 != null) {
            String i15 = i(cursor, this.B);
            if (i15 != null) {
                if (this.f1127y == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f1127y = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(i15);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1127y, null), 0, i15.length(), 33);
                str = spannableString;
            } else {
                str = i(cursor, this.A);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            textView2.setVisibility(i11);
        }
        ImageView imageView = aVar.c;
        if (imageView != null) {
            int i16 = this.C;
            if (i16 == -1) {
                g11 = null;
            } else {
                g11 = g(cursor.getString(i16));
                if (g11 == null) {
                    ComponentName searchActivity = this.f1122t.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f1124v;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = weakHashMap.get(flattenToShortString);
                        if (constantState2 == null) {
                            g11 = null;
                        } else {
                            g11 = constantState2.newDrawable(context.getResources());
                        }
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e10) {
                            obj = e10.toString();
                        }
                        if (iconResource != 0) {
                            drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder o10 = a4.b.o("Invalid icon resource ", iconResource, " for ");
                                o10.append(searchActivity.flattenToShortString());
                                obj = o10.toString();
                                Log.w("SuggestionsAdapter", obj);
                                drawable = null;
                            }
                            if (drawable != null) {
                                constantState = null;
                            } else {
                                constantState = drawable.getConstantState();
                            }
                            weakHashMap.put(flattenToShortString, constantState);
                            g11 = drawable;
                        } else {
                            drawable = null;
                            if (drawable != null) {
                            }
                            weakHashMap.put(flattenToShortString, constantState);
                            g11 = drawable;
                        }
                    }
                    if (g11 == null) {
                        g11 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(g11);
            if (g11 == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                g11.setVisible(false, false);
                g11.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.f1131d;
        if (imageView2 != null) {
            int i17 = this.D;
            if (i17 == -1) {
                g10 = null;
            } else {
                g10 = g(cursor.getString(i17));
            }
            imageView2.setImageDrawable(g10);
            if (g10 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                g10.setVisible(false, false);
                g10.setVisible(true, false);
            }
        }
        int i18 = this.f1126x;
        ImageView imageView3 = aVar.f1132e;
        if (i18 != 2 && (i18 != 1 || (i10 & 1) == 0)) {
            imageView3.setVisibility(8);
            return;
        }
        imageView3.setVisibility(0);
        imageView3.setTag(textView.getText());
        imageView3.setOnClickListener(this);
    }

    @Override // f3.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f1128z = cursor.getColumnIndex("suggest_text_1");
                this.A = cursor.getColumnIndex("suggest_text_2");
                this.B = cursor.getColumnIndex("suggest_text_2_url");
                this.C = cursor.getColumnIndex("suggest_icon_1");
                this.D = cursor.getColumnIndex("suggest_icon_2");
                this.E = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // f3.a
    public final String d(Cursor cursor) {
        String i10;
        String i11;
        if (cursor == null) {
            return null;
        }
        String i12 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (i12 != null) {
            return i12;
        }
        SearchableInfo searchableInfo = this.f1122t;
        if (searchableInfo.shouldRewriteQueryFromData() && (i11 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return i11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (i10 = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return i10;
    }

    @Override // f3.a
    public final View e(ViewGroup viewGroup) {
        View inflate = this.f10909r.inflate(this.f10907p, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f1125w);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f1123u.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(String str) {
        Drawable newDrawable;
        Drawable newDrawable2;
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.f1124v;
        Context context = this.f1123u;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = weakHashMap.get(str2);
                if (constantState == null) {
                    newDrawable2 = null;
                } else {
                    newDrawable2 = constantState.newDrawable();
                }
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Object obj = n2.a.f16069a;
                Drawable b5 = a.b.b(context, parseInt);
                if (b5 != null) {
                    weakHashMap.put(str2, b5.getConstantState());
                }
                return b5;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = weakHashMap.get(str);
                if (constantState2 == null) {
                    newDrawable = null;
                } else {
                    newDrawable = constantState2.newDrawable();
                }
                if (newDrawable != null) {
                    return newDrawable;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e10) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e10.getMessage());
                    if (drawable != null) {
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = f(parse);
                        if (drawable != null) {
                            weakHashMap.put(str, drawable.getConstantState());
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e11) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e11);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } else {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                }
                Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e10.getMessage());
                if (drawable != null) {
                }
            }
        }
        return drawable;
    }

    @Override // f3.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f10909r.inflate(this.f10908q, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1129a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // f3.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f1129a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f1123u.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f10900k;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f10900k;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1121s.p((CharSequence) tag);
        }
    }
}
