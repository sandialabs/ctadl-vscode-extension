package com.noto.app.components;

import a1.b;
import android.content.Intent;
import android.os.Bundle;
import com.noto.app.AppViewModel;
import com.noto.app.note.QuickNoteDialogFragment;
import d.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.a;
import m7.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/components/TransparentActivity;", "Ld/f;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TransparentActivity extends f {
    public static final /* synthetic */ int H = 0;
    public final e F = a.a(LazyThreadSafetyMode.SYNCHRONIZED, new TransparentActivity$special$$inlined$viewModel$default$1(this));
    public final e G = a.b(new TransparentActivity$notificationManager$2(this));

    @Override // androidx.fragment.app.s, androidx.activity.ComponentActivity, m2.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Intent intent = getIntent();
        String str2 = null;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            e eVar = this.F;
            if (hashCode != -920596209) {
                if (hashCode == 1703997026 && str.equals("android.intent.action.PROCESS_TEXT")) {
                    CharSequence charSequenceExtra = getIntent().getCharSequenceExtra("android.intent.extra.PROCESS_TEXT");
                    if (charSequenceExtra != null) {
                        str2 = charSequenceExtra.toString();
                    }
                    if (str2 != null) {
                        ((AppViewModel) eVar.getValue()).e(str2, new TransparentActivity$onCreate$1(this));
                    }
                }
            } else if (str.equals("com.noto.intent.action.QUICK_NOTE")) {
                QuickNoteDialogFragment quickNoteDialogFragment = new QuickNoteDialogFragment(new TransparentActivity$onCreate$2(this));
                quickNoteDialogFragment.W(b.n(new Pair("folder_id", ((AppViewModel) eVar.getValue()).f7558s.getValue())));
                quickNoteDialogFragment.f0(this.f5251z.f5260a.f5265l, null);
            }
        }
    }
}
