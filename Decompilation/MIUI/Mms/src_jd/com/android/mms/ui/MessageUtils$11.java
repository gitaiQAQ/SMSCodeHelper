package com.android.mms.ui;

import android.content.Context;
import android.content.Intent;

final class MessageUtils$11
  implements Runnable
{
  MessageUtils$11(Context paramContext, MessageUtils.UriInfo paramUriInfo) {}
  
  public void run()
  {
    MessageUtils.access$000(val$context, new Intent("android.intent.action.VIEW", val$info.uri));
  }
}

/* Location:
 * Qualified Name:     com.android.mms.ui.MessageUtils.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */