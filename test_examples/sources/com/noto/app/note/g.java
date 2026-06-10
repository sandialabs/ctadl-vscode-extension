package com.noto.app.note;

import a7.i0;
import a7.w;
import android.app.AlarmManager;
import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.lifecycle.d0;
import androidx.navigation.NavController;
import com.noto.R;
import com.noto.app.note.NoteReminderDialogFragment;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import j$.time.Clock;
import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import java.util.Calendar;
import na.g;
import s6.b0;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9403i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f9404j;

    public /* synthetic */ g(int i10, Object obj) {
        this.f9403i = i10;
        this.f9404j = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d0 d0Var;
        int i10;
        boolean z10;
        boolean z11;
        Boolean bool;
        Boolean bool2;
        Integer num;
        androidx.navigation.i d5;
        AlarmManager alarmManager;
        int i11;
        int i12 = this.f9403i;
        boolean z12 = true;
        Object obj = this.f9404j;
        switch (i12) {
            case 0:
                NoteFragment noteFragment = (NoteFragment) obj;
                v7.g.f(noteFragment, "this$0");
                NavController g10 = ViewUtilsKt.g(noteFragment);
                if (g10 != null) {
                    int i13 = NoteFragment.f9026f0;
                    ViewUtilsKt.o(g10, new w(noteFragment.a0().f348a, 0L), null);
                    return;
                }
                return;
            case 1:
                b0 b0Var = (b0) obj;
                int i14 = NoteFragment.f9026f0;
                v7.g.f(b0Var, "$this_setupListeners");
                b0Var.f17303j.v(0);
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                NotePagerFragment notePagerFragment = (NotePagerFragment) obj;
                int i15 = NotePagerFragment.f9109i0;
                v7.g.f(notePagerFragment, "this$0");
                NavController g11 = ViewUtilsKt.g(notePagerFragment);
                if (g11 != null && (d5 = g11.d()) != null) {
                    d0Var = d5.a();
                } else {
                    d0Var = null;
                }
                if (d0Var != null && (num = (Integer) d0Var.b("ScrollPosition")) != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                if (d0Var != null && (bool2 = (Boolean) d0Var.b("IsTitleVisible")) != null) {
                    z10 = bool2.booleanValue();
                } else {
                    z10 = true;
                }
                if (d0Var != null && (bool = (Boolean) d0Var.b("IsBodyVisible")) != null) {
                    z11 = bool.booleanValue();
                } else {
                    z11 = true;
                }
                NavController g12 = ViewUtilsKt.g(notePagerFragment);
                if (g12 != null) {
                    long j2 = notePagerFragment.Z().f298a;
                    long longValue = ((Number) a1.b.m(notePagerFragment.a0().n).getValue()).longValue();
                    long[] jArr = notePagerFragment.Z().c;
                    v7.g.f(jArr, "selectedNoteIds");
                    ViewUtilsKt.o(g12, new i0(j2, longValue, null, null, i10, z10, z11, jArr), null);
                    return;
                }
                return;
            default:
                final NoteReminderDialogFragment noteReminderDialogFragment = (NoteReminderDialogFragment) obj;
                int i16 = NoteReminderDialogFragment.f9176x0;
                v7.g.f(noteReminderDialogFragment, "this$0");
                if (((t6.d) noteReminderDialogFragment.g0().h().getValue()).f17628i == null) {
                    Calendar calendar = Calendar.getInstance();
                    int i17 = calendar.get(1);
                    int i18 = calendar.get(2);
                    int i19 = calendar.get(5);
                    final int i20 = calendar.get(11);
                    final int i21 = calendar.get(12);
                    if ((noteReminderDialogFragment.n().getConfiguration().uiMode & 48) != 32) {
                        z12 = false;
                    }
                    if (z12) {
                        i11 = 16974126;
                    } else {
                        i11 = 16974130;
                    }
                    final boolean is24HourFormat = DateFormat.is24HourFormat(noteReminderDialogFragment.j());
                    final Context j10 = noteReminderDialogFragment.j();
                    if (j10 != null) {
                        final int a10 = q.a(j10, R.attr.notoPrimaryColor);
                        final int i22 = i11;
                        DatePickerDialog datePickerDialog = new DatePickerDialog(j10, i11, new DatePickerDialog.OnDateSetListener() { // from class: a7.l0
                            @Override // android.app.DatePickerDialog.OnDateSetListener
                            public final void onDateSet(DatePicker datePicker, final int i23, final int i24, final int i25) {
                                int i26 = i22;
                                int i27 = i20;
                                int i28 = i21;
                                boolean z13 = is24HourFormat;
                                int i29 = NoteReminderDialogFragment.f9176x0;
                                final Context context = j10;
                                v7.g.f(context, "$context");
                                final NoteReminderDialogFragment noteReminderDialogFragment2 = noteReminderDialogFragment;
                                v7.g.f(noteReminderDialogFragment2, "this$0");
                                TimePickerDialog timePickerDialog = new TimePickerDialog(context, i26, new TimePickerDialog.OnTimeSetListener() { // from class: com.noto.app.note.h
                                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                                    public final void onTimeSet(TimePicker timePicker, int i30, int i31) {
                                        int i32 = i23;
                                        int i33 = i25;
                                        int i34 = NoteReminderDialogFragment.f9176x0;
                                        NoteReminderDialogFragment noteReminderDialogFragment3 = noteReminderDialogFragment2;
                                        v7.g.f(noteReminderDialogFragment3, "this$0");
                                        Context context2 = context;
                                        v7.g.f(context2, "$context");
                                        try {
                                            LocalDateTime of = LocalDateTime.of(i32, i24 + 1, i33, i30, i31, 0, 0);
                                            v7.g.e(of, "try {\n                jt…xception(e)\n            }");
                                            na.e eVar = new na.e(of);
                                            na.g.Companion.getClass();
                                            na.c I0 = a1.b.I0(eVar, g.a.a());
                                            NoteViewModel g02 = noteReminderDialogFragment3.g0();
                                            g02.getClass();
                                            m0.b.M0(a1.b.d0(g02), null, null, new NoteViewModel$setNoteReminder$1(g02, I0, null), 3);
                                            long a11 = I0.a();
                                            t6.d dVar = (t6.d) noteReminderDialogFragment3.g0().h().getValue();
                                            AlarmManager alarmManager2 = (AlarmManager) noteReminderDialogFragment3.f9179w0.getValue();
                                            if (alarmManager2 != null) {
                                                long j11 = dVar.f17622b;
                                                Intent intent = new Intent(context2, NoteReminderReceiver.class);
                                                intent.putExtra("folder_id", j11);
                                                long j12 = dVar.f17621a;
                                                intent.putExtra("note_id", j12);
                                                PendingIntent broadcast = PendingIntent.getBroadcast(context2, (int) j12, intent, f7.h.f10949a);
                                                if (Build.VERSION.SDK_INT >= 23) {
                                                    m2.h.b(alarmManager2, 0, a11, broadcast);
                                                } else {
                                                    m2.g.a(alarmManager2, 0, a11, broadcast);
                                                }
                                            }
                                        } catch (DateTimeException e10) {
                                            throw new IllegalArgumentException(e10);
                                        }
                                    }
                                }, i27, i28, z13);
                                timePickerDialog.show();
                                Button button = timePickerDialog.getButton(-1);
                                int i30 = a10;
                                if (button != null) {
                                    button.setTextColor(i30);
                                }
                                Button button2 = timePickerDialog.getButton(-3);
                                if (button2 != null) {
                                    button2.setTextColor(i30);
                                }
                                Button button3 = timePickerDialog.getButton(-2);
                                if (button3 != null) {
                                    button3.setTextColor(i30);
                                }
                            }
                        }, i17, i18, i19);
                        DatePicker datePicker = datePickerDialog.getDatePicker();
                        na.c.Companion.getClass();
                        Instant instant = Clock.systemUTC().instant();
                        v7.g.e(instant, "systemUTC().instant()");
                        datePicker.setMinDate(new na.c(instant).a() - 1000);
                        datePickerDialog.show();
                        Button button = datePickerDialog.getButton(-1);
                        if (button != null) {
                            button.setTextColor(a10);
                        }
                        Button button2 = datePickerDialog.getButton(-3);
                        if (button2 != null) {
                            button2.setTextColor(a10);
                        }
                        Button button3 = datePickerDialog.getButton(-2);
                        if (button3 != null) {
                            button3.setTextColor(a10);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Context j11 = noteReminderDialogFragment.j();
                if (j11 != null && (alarmManager = (AlarmManager) noteReminderDialogFragment.f9179w0.getValue()) != null) {
                    a1.c.U(alarmManager, j11, ((t6.d) noteReminderDialogFragment.g0().h().getValue()).f17621a);
                }
                NoteViewModel g02 = noteReminderDialogFragment.g0();
                g02.getClass();
                m0.b.M0(a1.b.d0(g02), null, null, new NoteViewModel$setNoteReminder$1(g02, null, null), 3);
                return;
        }
    }
}
