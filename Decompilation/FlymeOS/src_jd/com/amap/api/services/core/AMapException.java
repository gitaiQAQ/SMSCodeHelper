package com.amap.api.services.core;

public class AMapException
  extends Exception
{
  public static final int ERROR_CODE_CONNECTION = 30;
  public static final int ERROR_CODE_FAILURE_AUTH = 32;
  public static final int ERROR_CODE_INVALID_PARAMETER = 24;
  public static final int ERROR_CODE_IO = 21;
  public static final int ERROR_CODE_NULL_PARAMETER = 25;
  public static final int ERROR_CODE_PROTOCOL = 29;
  public static final int ERROR_CODE_QUOTA = 35;
  public static final int ERROR_CODE_REQUEST = 36;
  public static final int ERROR_CODE_SERVER = 34;
  public static final int ERROR_CODE_SERVICE = 33;
  public static final int ERROR_CODE_SOCKET = 22;
  public static final int ERROR_CODE_SOCKE_TIME_OUT = 23;
  public static final int ERROR_CODE_UNKNOWN = 31;
  public static final int ERROR_CODE_UNKNOW_HOST = 27;
  public static final int ERROR_CODE_UNKNOW_SERVICE = 28;
  public static final int ERROR_CODE_URL = 26;
  public static final String ERROR_CONNECTION = "http连接失败 - ConnectionException";
  public static final String ERROR_FAILURE_AUTH = "key鉴权失败";
  public static final String ERROR_INVALID_PARAMETER = "无效的参数 - IllegalArgumentException";
  public static final String ERROR_IO = "IO 操作异常 - IOException";
  public static final String ERROR_NULL_PARAMETER = "空指针异常 - NullPointException";
  public static final String ERROR_PROTOCOL = "协议解析错误 - ProtocolException";
  public static final String ERROR_QUOTA = "请求次数超过配额";
  public static final String ERROR_REQUEST = "请求错误";
  public static final String ERROR_SERVER = "服务不存在或服务正在维护中";
  public static final String ERROR_SERVICE = "服务返回信息失败";
  public static final String ERROR_SOCKET = "socket 连接异常 - SocketException";
  public static final String ERROR_SOCKE_TIME_OUT = "socket 连接超时 - SocketTimeoutException";
  public static final String ERROR_UNKNOWN = "未知的错误";
  public static final String ERROR_UNKNOW_HOST = "未知主机 - UnKnowHostException";
  public static final String ERROR_UNKNOW_SERVICE = "服务器连接失败 - UnknownServiceException";
  public static final String ERROR_URL = "url异常 - MalformedURLException";
  private String a = "";
  private int b = 0;
  
  public AMapException() {}
  
  public AMapException(String paramString)
  {
    a = paramString;
    a(paramString);
  }
  
  private void a(String paramString)
  {
    if ("IO 操作异常 - IOException".equals(paramString))
    {
      b = 21;
      return;
    }
    if ("socket 连接异常 - SocketException".equals(paramString))
    {
      b = 22;
      return;
    }
    if ("socket 连接超时 - SocketTimeoutException".equals(paramString))
    {
      b = 23;
      return;
    }
    if ("无效的参数 - IllegalArgumentException".equals(paramString))
    {
      b = 24;
      return;
    }
    if ("空指针异常 - NullPointException".equals(paramString))
    {
      b = 25;
      return;
    }
    if ("url异常 - MalformedURLException".equals(paramString))
    {
      b = 26;
      return;
    }
    if ("未知主机 - UnKnowHostException".equals(paramString))
    {
      b = 27;
      return;
    }
    if ("服务器连接失败 - UnknownServiceException".equals(paramString))
    {
      b = 28;
      return;
    }
    if ("协议解析错误 - ProtocolException".equals(paramString))
    {
      b = 29;
      return;
    }
    if ("http连接失败 - ConnectionException".equals(paramString))
    {
      b = 30;
      return;
    }
    if ("未知的错误".equals(paramString))
    {
      b = 31;
      return;
    }
    if ("key鉴权失败".equals(paramString))
    {
      b = 32;
      return;
    }
    if ("服务不存在或服务正在维护中".equals(paramString))
    {
      b = 34;
      return;
    }
    if ("请求次数超过配额".equals(paramString))
    {
      b = 35;
      return;
    }
    b = 36;
  }
  
  public int getErrorCode()
  {
    return b;
  }
  
  public String getErrorMessage()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.amap.api.services.core.AMapException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */