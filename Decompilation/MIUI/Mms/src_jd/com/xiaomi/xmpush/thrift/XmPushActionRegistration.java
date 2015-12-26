package com.xiaomi.xmpush.thrift;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TBaseHelper;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TProtocolUtil;
import org.apache.thrift.protocol.TStruct;

public class XmPushActionRegistration
  implements TBase<XmPushActionRegistration, _Fields>, Serializable, Cloneable
{
  private static final TField ALIAS_NAME_FIELD_DESC;
  private static final TField APP_ID_FIELD_DESC;
  private static final TField APP_VERSION_FIELD_DESC;
  private static final TField DEBUG_FIELD_DESC;
  private static final TField DEVICE_ID_FIELD_DESC;
  private static final TField ID_FIELD_DESC;
  private static final TField PACKAGE_NAME_FIELD_DESC;
  private static final TField SDK_VERSION_FIELD_DESC;
  private static final TStruct STRUCT_DESC = new TStruct("XmPushActionRegistration");
  private static final TField TARGET_FIELD_DESC;
  private static final TField TOKEN_FIELD_DESC;
  public static final Map<_Fields, FieldMetaData> metaDataMap;
  public String aliasName;
  public String appId;
  public String appVersion;
  public String debug;
  public String deviceId;
  public String id;
  public String packageName;
  public String sdkVersion;
  public Target target;
  public String token;
  
  static
  {
    DEBUG_FIELD_DESC = new TField("debug", (byte)11, (short)1);
    TARGET_FIELD_DESC = new TField("target", (byte)12, (short)2);
    ID_FIELD_DESC = new TField("id", (byte)11, (short)3);
    APP_ID_FIELD_DESC = new TField("appId", (byte)11, (short)4);
    APP_VERSION_FIELD_DESC = new TField("appVersion", (byte)11, (short)5);
    PACKAGE_NAME_FIELD_DESC = new TField("packageName", (byte)11, (short)6);
    TOKEN_FIELD_DESC = new TField("token", (byte)11, (short)7);
    DEVICE_ID_FIELD_DESC = new TField("deviceId", (byte)11, (short)8);
    ALIAS_NAME_FIELD_DESC = new TField("aliasName", (byte)11, (short)9);
    SDK_VERSION_FIELD_DESC = new TField("sdkVersion", (byte)11, (short)10);
    EnumMap localEnumMap = new EnumMap(_Fields.class);
    localEnumMap.put(_Fields.DEBUG, new FieldMetaData("debug", (byte)2, new FieldValueMetaData((byte)11)));
    localEnumMap.put(_Fields.TARGET, new FieldMetaData("target", (byte)2, new StructMetaData((byte)12, Target.class)));
    localEnumMap.put(_Fields.ID, new FieldMetaData("id", (byte)1, new FieldValueMetaData((byte)11)));
    localEnumMap.put(_Fields.APP_ID, new FieldMetaData("appId", (byte)1, new FieldValueMetaData((byte)11)));
    localEnumMap.put(_Fields.APP_VERSION, new FieldMetaData("appVersion", (byte)2, new FieldValueMetaData((byte)11)));
    localEnumMap.put(_Fields.PACKAGE_NAME, new FieldMetaData("packageName", (byte)2, new FieldValueMetaData((byte)11)));
    localEnumMap.put(_Fields.TOKEN, new FieldMetaData("token", (byte)1, new FieldValueMetaData((byte)11)));
    localEnumMap.put(_Fields.DEVICE_ID, new FieldMetaData("deviceId", (byte)2, new FieldValueMetaData((byte)11)));
    localEnumMap.put(_Fields.ALIAS_NAME, new FieldMetaData("aliasName", (byte)2, new FieldValueMetaData((byte)11)));
    localEnumMap.put(_Fields.SDK_VERSION, new FieldMetaData("sdkVersion", (byte)2, new FieldValueMetaData((byte)11)));
    metaDataMap = Collections.unmodifiableMap(localEnumMap);
    FieldMetaData.addStructMetaDataMap(XmPushActionRegistration.class, metaDataMap);
  }
  
  public int compareTo(XmPushActionRegistration paramXmPushActionRegistration)
  {
    int i;
    if (!getClass().equals(paramXmPushActionRegistration.getClass())) {
      i = getClass().getName().compareTo(paramXmPushActionRegistration.getClass().getName());
    }
    int j;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            return i;
                                            j = Boolean.valueOf(isSetDebug()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetDebug()));
                                            i = j;
                                          } while (j != 0);
                                          if (!isSetDebug()) {
                                            break;
                                          }
                                          j = TBaseHelper.compareTo(debug, debug);
                                          i = j;
                                        } while (j != 0);
                                        j = Boolean.valueOf(isSetTarget()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetTarget()));
                                        i = j;
                                      } while (j != 0);
                                      if (!isSetTarget()) {
                                        break;
                                      }
                                      j = TBaseHelper.compareTo(target, target);
                                      i = j;
                                    } while (j != 0);
                                    j = Boolean.valueOf(isSetId()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetId()));
                                    i = j;
                                  } while (j != 0);
                                  if (!isSetId()) {
                                    break;
                                  }
                                  j = TBaseHelper.compareTo(id, id);
                                  i = j;
                                } while (j != 0);
                                j = Boolean.valueOf(isSetAppId()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetAppId()));
                                i = j;
                              } while (j != 0);
                              if (!isSetAppId()) {
                                break;
                              }
                              j = TBaseHelper.compareTo(appId, appId);
                              i = j;
                            } while (j != 0);
                            j = Boolean.valueOf(isSetAppVersion()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetAppVersion()));
                            i = j;
                          } while (j != 0);
                          if (!isSetAppVersion()) {
                            break;
                          }
                          j = TBaseHelper.compareTo(appVersion, appVersion);
                          i = j;
                        } while (j != 0);
                        j = Boolean.valueOf(isSetPackageName()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetPackageName()));
                        i = j;
                      } while (j != 0);
                      if (!isSetPackageName()) {
                        break;
                      }
                      j = TBaseHelper.compareTo(packageName, packageName);
                      i = j;
                    } while (j != 0);
                    j = Boolean.valueOf(isSetToken()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetToken()));
                    i = j;
                  } while (j != 0);
                  if (!isSetToken()) {
                    break;
                  }
                  j = TBaseHelper.compareTo(token, token);
                  i = j;
                } while (j != 0);
                j = Boolean.valueOf(isSetDeviceId()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetDeviceId()));
                i = j;
              } while (j != 0);
              if (!isSetDeviceId()) {
                break;
              }
              j = TBaseHelper.compareTo(deviceId, deviceId);
              i = j;
            } while (j != 0);
            j = Boolean.valueOf(isSetAliasName()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetAliasName()));
            i = j;
          } while (j != 0);
          if (!isSetAliasName()) {
            break;
          }
          j = TBaseHelper.compareTo(aliasName, aliasName);
          i = j;
        } while (j != 0);
        j = Boolean.valueOf(isSetSdkVersion()).compareTo(Boolean.valueOf(paramXmPushActionRegistration.isSetSdkVersion()));
        i = j;
      } while (j != 0);
      if (!isSetSdkVersion()) {
        break;
      }
      j = TBaseHelper.compareTo(sdkVersion, sdkVersion);
      i = j;
    } while (j != 0);
    return 0;
  }
  
  public boolean equals(XmPushActionRegistration paramXmPushActionRegistration)
  {
    if (paramXmPushActionRegistration == null) {
      return false;
    }
    boolean bool1 = isSetDebug();
    boolean bool2 = paramXmPushActionRegistration.isSetDebug();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!debug.equals(debug)) {
        return false;
      }
    }
    bool1 = isSetTarget();
    bool2 = paramXmPushActionRegistration.isSetTarget();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!target.equals(target)) {
        return false;
      }
    }
    bool1 = isSetId();
    bool2 = paramXmPushActionRegistration.isSetId();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!id.equals(id)) {
        return false;
      }
    }
    bool1 = isSetAppId();
    bool2 = paramXmPushActionRegistration.isSetAppId();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!appId.equals(appId)) {
        return false;
      }
    }
    bool1 = isSetAppVersion();
    bool2 = paramXmPushActionRegistration.isSetAppVersion();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!appVersion.equals(appVersion)) {
        return false;
      }
    }
    bool1 = isSetPackageName();
    bool2 = paramXmPushActionRegistration.isSetPackageName();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!packageName.equals(packageName)) {
        return false;
      }
    }
    bool1 = isSetToken();
    bool2 = paramXmPushActionRegistration.isSetToken();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!token.equals(token)) {
        return false;
      }
    }
    bool1 = isSetDeviceId();
    bool2 = paramXmPushActionRegistration.isSetDeviceId();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!deviceId.equals(deviceId)) {
        return false;
      }
    }
    bool1 = isSetAliasName();
    bool2 = paramXmPushActionRegistration.isSetAliasName();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!aliasName.equals(aliasName)) {
        return false;
      }
    }
    bool1 = isSetSdkVersion();
    bool2 = paramXmPushActionRegistration.isSetSdkVersion();
    if ((bool1) || (bool2))
    {
      if ((!bool1) || (!bool2)) {
        return false;
      }
      if (!sdkVersion.equals(sdkVersion)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == null) {}
    while (!(paramObject instanceof XmPushActionRegistration)) {
      return false;
    }
    return equals((XmPushActionRegistration)paramObject);
  }
  
  public String getAppId()
  {
    return appId;
  }
  
  public String getToken()
  {
    return token;
  }
  
  public int hashCode()
  {
    return 0;
  }
  
  public boolean isSetAliasName()
  {
    return aliasName != null;
  }
  
  public boolean isSetAppId()
  {
    return appId != null;
  }
  
  public boolean isSetAppVersion()
  {
    return appVersion != null;
  }
  
  public boolean isSetDebug()
  {
    return debug != null;
  }
  
  public boolean isSetDeviceId()
  {
    return deviceId != null;
  }
  
  public boolean isSetId()
  {
    return id != null;
  }
  
  public boolean isSetPackageName()
  {
    return packageName != null;
  }
  
  public boolean isSetSdkVersion()
  {
    return sdkVersion != null;
  }
  
  public boolean isSetTarget()
  {
    return target != null;
  }
  
  public boolean isSetToken()
  {
    return token != null;
  }
  
  public void read(TProtocol paramTProtocol)
    throws TException
  {
    paramTProtocol.readStructBegin();
    TField localTField = paramTProtocol.readFieldBegin();
    if (type == 0)
    {
      paramTProtocol.readStructEnd();
      validate();
      return;
    }
    switch (id)
    {
    default: 
      TProtocolUtil.skip(paramTProtocol, type);
    }
    for (;;)
    {
      paramTProtocol.readFieldEnd();
      break;
      if (type == 11)
      {
        debug = paramTProtocol.readString();
      }
      else
      {
        TProtocolUtil.skip(paramTProtocol, type);
        continue;
        if (type == 12)
        {
          target = new Target();
          target.read(paramTProtocol);
        }
        else
        {
          TProtocolUtil.skip(paramTProtocol, type);
          continue;
          if (type == 11)
          {
            id = paramTProtocol.readString();
          }
          else
          {
            TProtocolUtil.skip(paramTProtocol, type);
            continue;
            if (type == 11)
            {
              appId = paramTProtocol.readString();
            }
            else
            {
              TProtocolUtil.skip(paramTProtocol, type);
              continue;
              if (type == 11)
              {
                appVersion = paramTProtocol.readString();
              }
              else
              {
                TProtocolUtil.skip(paramTProtocol, type);
                continue;
                if (type == 11)
                {
                  packageName = paramTProtocol.readString();
                }
                else
                {
                  TProtocolUtil.skip(paramTProtocol, type);
                  continue;
                  if (type == 11)
                  {
                    token = paramTProtocol.readString();
                  }
                  else
                  {
                    TProtocolUtil.skip(paramTProtocol, type);
                    continue;
                    if (type == 11)
                    {
                      deviceId = paramTProtocol.readString();
                    }
                    else
                    {
                      TProtocolUtil.skip(paramTProtocol, type);
                      continue;
                      if (type == 11)
                      {
                        aliasName = paramTProtocol.readString();
                      }
                      else
                      {
                        TProtocolUtil.skip(paramTProtocol, type);
                        continue;
                        if (type == 11) {
                          sdkVersion = paramTProtocol.readString();
                        } else {
                          TProtocolUtil.skip(paramTProtocol, type);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public XmPushActionRegistration setAppId(String paramString)
  {
    appId = paramString;
    return this;
  }
  
  public XmPushActionRegistration setAppVersion(String paramString)
  {
    appVersion = paramString;
    return this;
  }
  
  public XmPushActionRegistration setDeviceId(String paramString)
  {
    deviceId = paramString;
    return this;
  }
  
  public XmPushActionRegistration setId(String paramString)
  {
    id = paramString;
    return this;
  }
  
  public XmPushActionRegistration setPackageName(String paramString)
  {
    packageName = paramString;
    return this;
  }
  
  public XmPushActionRegistration setToken(String paramString)
  {
    token = paramString;
    return this;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("XmPushActionRegistration(");
    int i = 1;
    if (isSetDebug())
    {
      localStringBuilder.append("debug:");
      if (debug == null)
      {
        localStringBuilder.append("null");
        i = 0;
      }
    }
    else
    {
      int j = i;
      if (isSetTarget())
      {
        if (i == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append("target:");
        if (target != null) {
          break label431;
        }
        localStringBuilder.append("null");
        label89:
        j = 0;
      }
      if (j == 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append("id:");
      if (id != null) {
        break label443;
      }
      localStringBuilder.append("null");
      label126:
      if (0 == 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append("appId:");
      if (appId != null) {
        break label455;
      }
      localStringBuilder.append("null");
      label161:
      if (isSetAppVersion())
      {
        if (0 == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append("appVersion:");
        if (appVersion != null) {
          break label467;
        }
        localStringBuilder.append("null");
      }
      label203:
      if (isSetPackageName())
      {
        if (0 == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append("packageName:");
        if (packageName != null) {
          break label479;
        }
        localStringBuilder.append("null");
      }
      label245:
      if (0 == 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append("token:");
      if (token != null) {
        break label491;
      }
      localStringBuilder.append("null");
      label280:
      if (isSetDeviceId())
      {
        if (0 == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append("deviceId:");
        if (deviceId != null) {
          break label503;
        }
        localStringBuilder.append("null");
      }
      label322:
      if (isSetAliasName())
      {
        if (0 == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append("aliasName:");
        if (aliasName != null) {
          break label515;
        }
        localStringBuilder.append("null");
      }
      label364:
      if (isSetSdkVersion())
      {
        if (0 == 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append("sdkVersion:");
        if (sdkVersion != null) {
          break label527;
        }
        localStringBuilder.append("null");
      }
    }
    for (;;)
    {
      localStringBuilder.append(")");
      return localStringBuilder.toString();
      localStringBuilder.append(debug);
      break;
      label431:
      localStringBuilder.append(target);
      break label89;
      label443:
      localStringBuilder.append(id);
      break label126;
      label455:
      localStringBuilder.append(appId);
      break label161;
      label467:
      localStringBuilder.append(appVersion);
      break label203;
      label479:
      localStringBuilder.append(packageName);
      break label245;
      label491:
      localStringBuilder.append(token);
      break label280;
      label503:
      localStringBuilder.append(deviceId);
      break label322;
      label515:
      localStringBuilder.append(aliasName);
      break label364;
      label527:
      localStringBuilder.append(sdkVersion);
    }
  }
  
  public void validate()
    throws TException
  {
    if (id == null) {
      throw new TProtocolException("Required field 'id' was not present! Struct: " + toString());
    }
    if (appId == null) {
      throw new TProtocolException("Required field 'appId' was not present! Struct: " + toString());
    }
    if (token == null) {
      throw new TProtocolException("Required field 'token' was not present! Struct: " + toString());
    }
  }
  
  public void write(TProtocol paramTProtocol)
    throws TException
  {
    validate();
    paramTProtocol.writeStructBegin(STRUCT_DESC);
    if ((debug != null) && (isSetDebug()))
    {
      paramTProtocol.writeFieldBegin(DEBUG_FIELD_DESC);
      paramTProtocol.writeString(debug);
      paramTProtocol.writeFieldEnd();
    }
    if ((target != null) && (isSetTarget()))
    {
      paramTProtocol.writeFieldBegin(TARGET_FIELD_DESC);
      target.write(paramTProtocol);
      paramTProtocol.writeFieldEnd();
    }
    if (id != null)
    {
      paramTProtocol.writeFieldBegin(ID_FIELD_DESC);
      paramTProtocol.writeString(id);
      paramTProtocol.writeFieldEnd();
    }
    if (appId != null)
    {
      paramTProtocol.writeFieldBegin(APP_ID_FIELD_DESC);
      paramTProtocol.writeString(appId);
      paramTProtocol.writeFieldEnd();
    }
    if ((appVersion != null) && (isSetAppVersion()))
    {
      paramTProtocol.writeFieldBegin(APP_VERSION_FIELD_DESC);
      paramTProtocol.writeString(appVersion);
      paramTProtocol.writeFieldEnd();
    }
    if ((packageName != null) && (isSetPackageName()))
    {
      paramTProtocol.writeFieldBegin(PACKAGE_NAME_FIELD_DESC);
      paramTProtocol.writeString(packageName);
      paramTProtocol.writeFieldEnd();
    }
    if (token != null)
    {
      paramTProtocol.writeFieldBegin(TOKEN_FIELD_DESC);
      paramTProtocol.writeString(token);
      paramTProtocol.writeFieldEnd();
    }
    if ((deviceId != null) && (isSetDeviceId()))
    {
      paramTProtocol.writeFieldBegin(DEVICE_ID_FIELD_DESC);
      paramTProtocol.writeString(deviceId);
      paramTProtocol.writeFieldEnd();
    }
    if ((aliasName != null) && (isSetAliasName()))
    {
      paramTProtocol.writeFieldBegin(ALIAS_NAME_FIELD_DESC);
      paramTProtocol.writeString(aliasName);
      paramTProtocol.writeFieldEnd();
    }
    if ((sdkVersion != null) && (isSetSdkVersion()))
    {
      paramTProtocol.writeFieldBegin(SDK_VERSION_FIELD_DESC);
      paramTProtocol.writeString(sdkVersion);
      paramTProtocol.writeFieldEnd();
    }
    paramTProtocol.writeFieldStop();
    paramTProtocol.writeStructEnd();
  }
  
  public static enum _Fields
  {
    private static final Map<String, _Fields> byName;
    private final String _fieldName;
    private final short _thriftId;
    
    static
    {
      ID = new _Fields("ID", 2, (short)3, "id");
      APP_ID = new _Fields("APP_ID", 3, (short)4, "appId");
      APP_VERSION = new _Fields("APP_VERSION", 4, (short)5, "appVersion");
      PACKAGE_NAME = new _Fields("PACKAGE_NAME", 5, (short)6, "packageName");
      TOKEN = new _Fields("TOKEN", 6, (short)7, "token");
      DEVICE_ID = new _Fields("DEVICE_ID", 7, (short)8, "deviceId");
      ALIAS_NAME = new _Fields("ALIAS_NAME", 8, (short)9, "aliasName");
      SDK_VERSION = new _Fields("SDK_VERSION", 9, (short)10, "sdkVersion");
      $VALUES = new _Fields[] { DEBUG, TARGET, ID, APP_ID, APP_VERSION, PACKAGE_NAME, TOKEN, DEVICE_ID, ALIAS_NAME, SDK_VERSION };
      byName = new HashMap();
      Iterator localIterator = EnumSet.allOf(_Fields.class).iterator();
      while (localIterator.hasNext())
      {
        _Fields local_Fields = (_Fields)localIterator.next();
        byName.put(local_Fields.getFieldName(), local_Fields);
      }
    }
    
    private _Fields(short paramShort, String paramString)
    {
      _thriftId = paramShort;
      _fieldName = paramString;
    }
    
    public String getFieldName()
    {
      return _fieldName;
    }
  }
}

/* Location:
 * Qualified Name:     com.xiaomi.xmpush.thrift.XmPushActionRegistration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */