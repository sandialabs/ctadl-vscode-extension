package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.navigation.x;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@x.a("activity")
/* loaded from: classes.dex */
public final class b extends x<a> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5450a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f5451b;

    /* loaded from: classes.dex */
    public static class a extends n {

        /* renamed from: q  reason: collision with root package name */
        public Intent f5452q;

        /* renamed from: r  reason: collision with root package name */
        public String f5453r;

        public a(x<? extends a> xVar) {
            super(xVar);
        }

        @Override // androidx.navigation.n
        public final void t(Context context, AttributeSet attributeSet) {
            super.t(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, a1.c.f66b);
            String string = obtainAttributes.getString(4);
            if (string != null) {
                string = string.replace("${applicationId}", context.getPackageName());
            }
            if (this.f5452q == null) {
                this.f5452q = new Intent();
            }
            this.f5452q.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.f5452q == null) {
                    this.f5452q = new Intent();
                }
                this.f5452q.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.f5452q == null) {
                this.f5452q = new Intent();
            }
            this.f5452q.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.f5452q == null) {
                    this.f5452q = new Intent();
                }
                this.f5452q.setData(parse);
            }
            this.f5453r = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        @Override // androidx.navigation.n
        public final String toString() {
            ComponentName component;
            Intent intent = this.f5452q;
            String str = null;
            if (intent == null) {
                component = null;
            } else {
                component = intent.getComponent();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            if (component != null) {
                sb.append(" class=");
                sb.append(component.getClassName());
            } else {
                Intent intent2 = this.f5452q;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb.append(" action=");
                    sb.append(str);
                }
            }
            return sb.toString();
        }
    }

    public b(Context context) {
        this.f5450a = context;
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                this.f5451b = (Activity) context;
                return;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
    }

    @Override // androidx.navigation.x
    public final a a() {
        return new a(this);
    }

    @Override // androidx.navigation.x
    public final n b(n nVar, Bundle bundle, t tVar) {
        Intent intent;
        int intExtra;
        a aVar = (a) nVar;
        if (aVar.f5452q != null) {
            Intent intent2 = new Intent(aVar.f5452q);
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = aVar.f5453r;
                if (!TextUtils.isEmpty(str)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(bundle.get(group).toString()));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            Context context = this.f5450a;
            if (!(context instanceof Activity)) {
                intent2.addFlags(268435456);
            }
            if (tVar != null && tVar.f5530a) {
                intent2.addFlags(536870912);
            }
            Activity activity = this.f5451b;
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", aVar.f5511k);
            Resources resources = context.getResources();
            if (tVar != null) {
                int i10 = tVar.f5534f;
                int i11 = tVar.f5535g;
                if ((i10 > 0 && resources.getResourceTypeName(i10).equals("animator")) || (i11 > 0 && resources.getResourceTypeName(i11).equals("animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + "when launching " + aVar);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11);
                }
            }
            context.startActivity(intent2);
            if (tVar != null && activity != null) {
                int i12 = tVar.f5532d;
                int i13 = tVar.f5533e;
                if ((i12 > 0 && resources.getResourceTypeName(i12).equals("animator")) || (i13 > 0 && resources.getResourceTypeName(i13).equals("animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + aVar);
                    return null;
                } else if (i12 >= 0 || i13 >= 0) {
                    activity.overridePendingTransition(Math.max(i12, 0), Math.max(i13, 0));
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
        throw new IllegalStateException("Destination " + aVar.f5511k + " does not have an Intent set.");
    }

    @Override // androidx.navigation.x
    public final boolean e() {
        Activity activity = this.f5451b;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
