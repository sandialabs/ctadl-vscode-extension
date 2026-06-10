package m5;

import android.view.KeyEvent;
import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.noto.app.widget.NoteListWidgetConfigActivity;
import v7.g;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15981a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f15982b;

    public /* synthetic */ a(KeyEvent.Callback callback, int i10) {
        this.f15981a = i10;
        this.f15982b = callback;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        int i10 = this.f15981a;
        KeyEvent.Callback callback = this.f15982b;
        switch (i10) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) callback).f6976q;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
                    return;
                }
                return;
            default:
                NoteListWidgetConfigActivity noteListWidgetConfigActivity = (NoteListWidgetConfigActivity) callback;
                int i11 = NoteListWidgetConfigActivity.L;
                g.f(noteListWidgetConfigActivity, "this$0");
                noteListWidgetConfigActivity.s().f10090o.setValue(Boolean.valueOf(z10));
                return;
        }
    }
}
