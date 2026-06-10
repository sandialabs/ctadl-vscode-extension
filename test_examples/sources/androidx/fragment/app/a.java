package androidx.fragment.app;

import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.h0;
import androidx.fragment.app.z;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a extends h0 implements z.m {

    /* renamed from: q  reason: collision with root package name */
    public final z f5098q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5099r;

    /* renamed from: s  reason: collision with root package name */
    public int f5100s;

    public a(z zVar) {
        zVar.H();
        w<?> wVar = zVar.f5286p;
        if (wVar != null) {
            wVar.f5263j.getClassLoader();
        }
        this.f5100s = -1;
        this.f5098q = zVar;
    }

    @Override // androidx.fragment.app.z.m
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (z.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f5169g) {
            z zVar = this.f5098q;
            if (zVar.f5275d == null) {
                zVar.f5275d = new ArrayList<>();
            }
            zVar.f5275d.add(this);
            return true;
        }
        return true;
    }

    public final void c(int i10) {
        h0.a aVar;
        if (this.f5169g) {
            if (z.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList<h0.a> arrayList = this.f5164a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Fragment fragment = arrayList.get(i11).f5179b;
                if (fragment != null) {
                    fragment.f5051y += i10;
                    if (z.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f5179b + " to " + aVar.f5179b.f5051y);
                    }
                }
            }
        }
    }

    public final int d(boolean z10) {
        int i10;
        if (!this.f5099r) {
            if (z.K(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new p0());
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.f5099r = true;
            boolean z11 = this.f5169g;
            z zVar = this.f5098q;
            if (z11) {
                i10 = zVar.f5280i.getAndIncrement();
            } else {
                i10 = -1;
            }
            this.f5100s = i10;
            zVar.w(this, z10);
            return this.f5100s;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void e(int i10, Fragment fragment, String str, int i11) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.F;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.F + " now " + str);
                }
                fragment.F = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.D;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.D + " now " + i10);
                    }
                    fragment.D = i10;
                    fragment.E = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            b(new h0.a(i11, fragment));
            fragment.f5052z = this.f5098q;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void f(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f5171i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f5100s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f5099r);
            if (this.f5168f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f5168f));
            }
            if (this.f5165b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5165b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.f5166d != 0 || this.f5167e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f5166d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f5167e));
            }
            if (this.f5172j != 0 || this.f5173k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5172j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f5173k);
            }
            if (this.f5174l != 0 || this.f5175m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f5174l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f5175m);
            }
        }
        ArrayList<h0.a> arrayList = this.f5164a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0.a aVar = arrayList.get(i10);
            switch (aVar.f5178a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    str2 = "REPLACE";
                    break;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    str2 = "REMOVE";
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case ma.i.f16046m /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case ma.i.f16047o /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f5178a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f5179b);
            if (z10) {
                if (aVar.c != 0 || aVar.f5180d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f5180d));
                }
                if (aVar.f5181e != 0 || aVar.f5182f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f5181e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f5182f));
                }
            }
        }
    }

    public final void g() {
        ArrayList<h0.a> arrayList = this.f5164a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            h0.a aVar = arrayList.get(i10);
            Fragment fragment = aVar.f5179b;
            if (fragment != null) {
                if (fragment.P != null) {
                    fragment.b().f5055a = false;
                }
                int i11 = this.f5168f;
                if (fragment.P != null || i11 != 0) {
                    fragment.b();
                    fragment.P.f5059f = i11;
                }
                ArrayList<String> arrayList2 = this.n;
                ArrayList<String> arrayList3 = this.f5176o;
                fragment.b();
                Fragment.b bVar = fragment.P;
                bVar.f5060g = arrayList2;
                bVar.f5061h = arrayList3;
            }
            int i12 = aVar.f5178a;
            z zVar = this.f5098q;
            switch (i12) {
                case 1:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.Y(fragment, false);
                    zVar.a(fragment);
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5178a);
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.T(fragment);
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.J(fragment);
                    break;
                case 5:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.Y(fragment, false);
                    z.c0(fragment);
                    break;
                case 6:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.h(fragment);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.Y(fragment, false);
                    zVar.d(fragment);
                    break;
                case 8:
                    zVar.a0(fragment);
                    break;
                case ma.i.f16046m /* 9 */:
                    zVar.a0(null);
                    break;
                case ma.i.f16047o /* 10 */:
                    zVar.Z(fragment, aVar.f5184h);
                    break;
            }
        }
    }

    public final void h() {
        ArrayList<h0.a> arrayList = this.f5164a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h0.a aVar = arrayList.get(size);
            Fragment fragment = aVar.f5179b;
            if (fragment != null) {
                if (fragment.P != null) {
                    fragment.b().f5055a = true;
                }
                int i10 = this.f5168f;
                int i11 = 8194;
                if (i10 != 4097) {
                    if (i10 != 4099) {
                        if (i10 != 8194) {
                            i11 = 0;
                        } else {
                            i11 = 4097;
                        }
                    } else {
                        i11 = 4099;
                    }
                }
                if (fragment.P != null || i11 != 0) {
                    fragment.b();
                    fragment.P.f5059f = i11;
                }
                ArrayList<String> arrayList2 = this.f5176o;
                ArrayList<String> arrayList3 = this.n;
                fragment.b();
                Fragment.b bVar = fragment.P;
                bVar.f5060g = arrayList2;
                bVar.f5061h = arrayList3;
            }
            int i12 = aVar.f5178a;
            z zVar = this.f5098q;
            switch (i12) {
                case 1:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.Y(fragment, true);
                    zVar.T(fragment);
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f5178a);
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.a(fragment);
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.getClass();
                    z.c0(fragment);
                    break;
                case 5:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.Y(fragment, true);
                    zVar.J(fragment);
                    break;
                case 6:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.d(fragment);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    fragment.V(aVar.c, aVar.f5180d, aVar.f5181e, aVar.f5182f);
                    zVar.Y(fragment, true);
                    zVar.h(fragment);
                    break;
                case 8:
                    zVar.a0(null);
                    break;
                case ma.i.f16046m /* 9 */:
                    zVar.a0(fragment);
                    break;
                case ma.i.f16047o /* 10 */:
                    zVar.Z(fragment, aVar.f5183g);
                    break;
            }
        }
    }

    public final a i(Fragment fragment) {
        z zVar = fragment.f5052z;
        if (zVar != null && zVar != this.f5098q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new h0.a(3, fragment));
        return this;
    }

    public final a j(Fragment fragment, Lifecycle.State state) {
        z zVar = fragment.f5052z;
        z zVar2 = this.f5098q;
        if (zVar == zVar2) {
            if (state == Lifecycle.State.INITIALIZED && fragment.f5036i > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
            }
            if (state != Lifecycle.State.DESTROYED) {
                b(new h0.a(fragment, state));
                return this;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + zVar2);
    }

    public final a k(Fragment fragment) {
        z zVar;
        if (fragment != null && (zVar = fragment.f5052z) != null && zVar != this.f5098q) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new h0.a(8, fragment));
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f5100s >= 0) {
            sb.append(" #");
            sb.append(this.f5100s);
        }
        if (this.f5171i != null) {
            sb.append(" ");
            sb.append(this.f5171i);
        }
        sb.append("}");
        return sb.toString();
    }
}
