package w2;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final l1.m f18266a = new l1.m(2);

    /* loaded from: classes.dex */
    public static class a {
        public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[LOOP:1: B:14:0x004c->B:29:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k a(Context context, e eVar) {
        Cursor cursor;
        int i10;
        int i11;
        Uri withAppendedId;
        int i12;
        boolean z10;
        boolean z11;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = eVar.f18267a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = eVar.f18268b;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                l1.m mVar = f18266a;
                Collections.sort(arrayList, mVar);
                List<List<byte[]>> list = eVar.f18269d;
                if (list == null) {
                    list = p2.d.b(resources, 0);
                }
                int i13 = 0;
                while (true) {
                    cursor = null;
                    if (i13 < list.size()) {
                        ArrayList arrayList2 = new ArrayList(list.get(i13));
                        Collections.sort(arrayList2, mVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                if (Arrays.equals((byte[]) arrayList.get(i14), (byte[]) arrayList2.get(i14))) {
                                }
                            }
                            z11 = true;
                            if (!z11) {
                                break;
                            }
                            i13++;
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    } else {
                        resolveContentProvider = null;
                        break;
                    }
                }
                if (resolveContentProvider == null) {
                    return new k(1, null);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                try {
                    cursor = a.a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.c}, null, null);
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i10 = cursor.getInt(columnIndex);
                            } else {
                                i10 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i11 = cursor.getInt(columnIndex4);
                            } else {
                                i11 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i12 = cursor.getInt(columnIndex5);
                            } else {
                                i12 = 400;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            arrayList3.add(new l(uri, i11, i12, z10, i10));
                        }
                    }
                    return new k(0, (l[]) arrayList3.toArray(new l[0]));
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
    }
}
