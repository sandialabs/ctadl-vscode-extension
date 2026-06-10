package h7;

import android.widget.CompoundButton;
import com.noto.app.components.BaseActivity;
import com.noto.app.widget.FolderListWidgetConfigActivity;
import com.noto.app.widget.NoteListWidgetConfigActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11545a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f11546b;

    public /* synthetic */ d(BaseActivity baseActivity, int i10) {
        this.f11545a = i10;
        this.f11546b = baseActivity;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int i10 = this.f11545a;
        BaseActivity baseActivity = this.f11546b;
        switch (i10) {
            case 0:
                FolderListWidgetConfigActivity folderListWidgetConfigActivity = (FolderListWidgetConfigActivity) baseActivity;
                int i11 = FolderListWidgetConfigActivity.J;
                v7.g.f(folderListWidgetConfigActivity, "this$0");
                folderListWidgetConfigActivity.s().f9965l.setValue(Boolean.valueOf(z10));
                return;
            default:
                NoteListWidgetConfigActivity noteListWidgetConfigActivity = (NoteListWidgetConfigActivity) baseActivity;
                int i12 = NoteListWidgetConfigActivity.L;
                v7.g.f(noteListWidgetConfigActivity, "this$0");
                noteListWidgetConfigActivity.s().f10091p.setValue(Boolean.valueOf(z10));
                return;
        }
    }
}
