package com.android.mms.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class PrivateConversationListActivity$3
  extends BroadcastReceiver
{
  PrivateConversationListActivity$3(PrivateConversationListActivity paramPrivateConversationListActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    if ("android.intent.action.CLOSE_SYSTEM_DIALOGS".equals(paramContext)) {
      if ("homekey".equals(paramIntent.getStringExtra("reason"))) {
        this$0.finish();
      }
    }
    while (!"android.intent.action.SCREEN_OFF".equals(paramContext)) {
      return;
    }
    this$0.finish();
  }
}

/* Location:
 * Qualified Name:     com.android.mms.ui.PrivateConversationListActivity.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */