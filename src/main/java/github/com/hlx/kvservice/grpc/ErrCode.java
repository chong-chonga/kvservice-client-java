// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package github.com.hlx.kvservice.grpc;

/**
 * Protobuf enum {@code ErrCode}
 */
public enum ErrCode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>WRONG_LEADER = 0;</code>
   */
  WRONG_LEADER(0),
  /**
   * <code>OK = 1;</code>
   */
  OK(1),
  /**
   * <code>NO_KEY = 2;</code>
   */
  NO_KEY(2),
  /**
   * <code>INVALID_SESSION = 3;</code>
   */
  INVALID_SESSION(3),
  /**
   * <code>INVALID_REQUEST_TYPE = 4;</code>
   */
  INVALID_REQUEST_TYPE(4),
  /**
   * <code>INVALID_PASSWORD = 5;</code>
   */
  INVALID_PASSWORD(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>WRONG_LEADER = 0;</code>
   */
  public static final int WRONG_LEADER_VALUE = 0;
  /**
   * <code>OK = 1;</code>
   */
  public static final int OK_VALUE = 1;
  /**
   * <code>NO_KEY = 2;</code>
   */
  public static final int NO_KEY_VALUE = 2;
  /**
   * <code>INVALID_SESSION = 3;</code>
   */
  public static final int INVALID_SESSION_VALUE = 3;
  /**
   * <code>INVALID_REQUEST_TYPE = 4;</code>
   */
  public static final int INVALID_REQUEST_TYPE_VALUE = 4;
  /**
   * <code>INVALID_PASSWORD = 5;</code>
   */
  public static final int INVALID_PASSWORD_VALUE = 5;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ErrCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ErrCode forNumber(int value) {
    switch (value) {
      case 0: return WRONG_LEADER;
      case 1: return OK;
      case 2: return NO_KEY;
      case 3: return INVALID_SESSION;
      case 4: return INVALID_REQUEST_TYPE;
      case 5: return INVALID_PASSWORD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrCode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ErrCode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ErrCode>() {
          public ErrCode findValueByNumber(int number) {
            return ErrCode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return github.com.hlx.kvservice.grpc.FTKVService.getDescriptor().getEnumTypes().get(0);
  }

  private static final ErrCode[] VALUES = values();

  public static ErrCode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ErrCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ErrCode)
}
