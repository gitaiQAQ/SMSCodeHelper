package com.xiaomi.mms.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class MxActivateSimpleDialog$2
  implements DialogInterface.OnClickListener
{
  MxActivateSimpleDialog$2(MxActivateSimpleDialog paramMxActivateSimpleDialog) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent("com.miui.voip.action.TURN_ON_VOIP");
    paramDialogInterface.putExtra("extra_turn_on_voip_from", 2);
    MxActivateSimpleDialog.access$000(this$0).sendBroadcast(paramDialogInterface);
  }
}

/* Location:
 * Qualified Name:     com.xiaomi.mms.utils.MxActivateSimpleDialog.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */