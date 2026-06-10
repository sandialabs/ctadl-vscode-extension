package f7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.domain.model.Icon;
import com.noto.app.domain.model.NotoColor;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import p2.f;

/* loaded from: classes.dex */
public final class q {
    public static final int a(Context context, int i10) {
        v7.g.f(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.data;
    }

    public static final int b(Context context, int i10) {
        v7.g.f(context, "<this>");
        Resources resources = context.getResources();
        ThreadLocal<TypedValue> threadLocal = p2.f.f16726a;
        if (Build.VERSION.SDK_INT >= 23) {
            return f.b.a(resources, i10, null);
        }
        return resources.getColor(i10);
    }

    public static final Drawable c(Context context, int i10) {
        v7.g.f(context, "<this>");
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = p2.f.f16726a;
        return f.a.a(resources, i10, theme);
    }

    public static final int d(Integer num) {
        v7.g.f(num, "<this>");
        return (int) TypedValue.applyDimension(1, num.floatValue(), Resources.getSystem().getDisplayMetrics());
    }

    public static final String e(Context context, int i10, int i11, Object... objArr) {
        String quantityString = context.getResources().getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
        v7.g.e(quantityString, "resources.getQuantityStr…d, quantity, *formatArgs)");
        return quantityString;
    }

    public static final String f(Context context, int i10, Object... objArr) {
        v7.g.f(context, "<this>");
        v7.g.f(objArr, "formatArgs");
        String string = context.getString(i10, Arrays.copyOf(objArr, objArr.length));
        v7.g.e(string, "getString(id, *formatArgs)");
        return string;
    }

    public static final ColorStateList h(int i10) {
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        v7.g.e(valueOf, "valueOf(this)");
        return valueOf;
    }

    public static final int i(Icon icon) {
        v7.g.f(icon, "<this>");
        switch (icon.ordinal()) {
            case 0:
                return R.mipmap.ic_launcher_futuristic;
            case 1:
                return R.mipmap.ic_launcher_dark_rain;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return R.mipmap.ic_launcher_airplane;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return R.mipmap.ic_launcher_blossom_ice;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return R.mipmap.ic_launcher_dark_alpine;
            case 5:
                return R.mipmap.ic_launcher_dark_side;
            case 6:
                return R.mipmap.ic_launcher_earth;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return R.mipmap.ic_launcher_fire;
            case 8:
                return R.mipmap.ic_launcher_purpleberry;
            case ma.i.f16046m /* 9 */:
                return R.mipmap.ic_launcher_sanguine_sun;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int j(NotoColor notoColor) {
        v7.g.f(notoColor, "<this>");
        switch (notoColor.ordinal()) {
            case 0:
                return R.color.colorAccentGray;
            case 1:
                return R.color.colorAccentBlue;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                return R.color.colorAccentPink;
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                return R.color.colorAccentCyan;
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                return R.color.colorAccentPurple;
            case 5:
                return R.color.colorAccentRed;
            case 6:
                return R.color.colorAccentYellow;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return R.color.colorAccentOrange;
            case 8:
                return R.color.colorAccentGreen;
            case ma.i.f16046m /* 9 */:
                return R.color.colorAccentBrown;
            case ma.i.f16047o /* 10 */:
                return R.color.colorAccentBlueGray;
            case 11:
                return R.color.colorAccentTeal;
            case 12:
                return R.color.colorAccentIndigo;
            case 13:
                return R.color.colorAccentDeepPurple;
            case 14:
                return R.color.colorAccentDeepOrange;
            case ma.i.f16049q /* 15 */:
                return R.color.colorAccentDeepGreen;
            case 16:
                return R.color.colorAccentLightBlue;
            case 17:
                return R.color.colorAccentLightGreen;
            case 18:
                return R.color.colorAccentLightRed;
            case 19:
                return R.color.colorAccentLightPink;
            case 20:
                return R.color.colorAccentBlack;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
