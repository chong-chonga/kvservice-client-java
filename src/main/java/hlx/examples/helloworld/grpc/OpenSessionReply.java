// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package hlx.examples.helloworld.grpc;

/**
 * Protobuf type {@code helloworld.OpenSessionReply}
 */
public final class OpenSessionReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.OpenSessionReply)
    OpenSessionReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenSessionReply.newBuilder() to construct.
  private OpenSessionReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenSessionReply() {
    sessionId_ = "";
    errorCode_ = 0;
    errorInfo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenSessionReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_OpenSessionReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_OpenSessionReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hlx.examples.helloworld.grpc.OpenSessionReply.class, hlx.examples.helloworld.grpc.OpenSessionReply.Builder.class);
  }

  public static final int SESSIONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionId_;
  /**
   * <code>string sessionId = 1;</code>
   * @return The sessionId.
   */
  @java.lang.Override
  public java.lang.String getSessionId() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionId_ = s;
      return s;
    }
  }
  /**
   * <code>string sessionId = 1;</code>
   * @return The bytes for sessionId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionIdBytes() {
    java.lang.Object ref = sessionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERRORCODE_FIELD_NUMBER = 2;
  private int errorCode_;
  /**
   * <code>.helloworld.ErrorCode errorCode = 2;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  @java.lang.Override public int getErrorCodeValue() {
    return errorCode_;
  }
  /**
   * <code>.helloworld.ErrorCode errorCode = 2;</code>
   * @return The errorCode.
   */
  @java.lang.Override public hlx.examples.helloworld.grpc.ErrorCode getErrorCode() {
    @SuppressWarnings("deprecation")
    hlx.examples.helloworld.grpc.ErrorCode result = hlx.examples.helloworld.grpc.ErrorCode.valueOf(errorCode_);
    return result == null ? hlx.examples.helloworld.grpc.ErrorCode.UNRECOGNIZED : result;
  }

  public static final int ERRORINFO_FIELD_NUMBER = 3;
  private volatile java.lang.Object errorInfo_;
  /**
   * <code>string errorInfo = 3;</code>
   * @return The errorInfo.
   */
  @java.lang.Override
  public java.lang.String getErrorInfo() {
    java.lang.Object ref = errorInfo_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorInfo_ = s;
      return s;
    }
  }
  /**
   * <code>string errorInfo = 3;</code>
   * @return The bytes for errorInfo.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorInfoBytes() {
    java.lang.Object ref = errorInfo_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorInfo_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionId_);
    }
    if (errorCode_ != hlx.examples.helloworld.grpc.ErrorCode.WRONG_LEADER.getNumber()) {
      output.writeEnum(2, errorCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorInfo_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorInfo_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sessionId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionId_);
    }
    if (errorCode_ != hlx.examples.helloworld.grpc.ErrorCode.WRONG_LEADER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, errorCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(errorInfo_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorInfo_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof hlx.examples.helloworld.grpc.OpenSessionReply)) {
      return super.equals(obj);
    }
    hlx.examples.helloworld.grpc.OpenSessionReply other = (hlx.examples.helloworld.grpc.OpenSessionReply) obj;

    if (!getSessionId()
        .equals(other.getSessionId())) return false;
    if (errorCode_ != other.errorCode_) return false;
    if (!getErrorInfo()
        .equals(other.getErrorInfo())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SESSIONID_FIELD_NUMBER;
    hash = (53 * hash) + getSessionId().hashCode();
    hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
    hash = (53 * hash) + errorCode_;
    hash = (37 * hash) + ERRORINFO_FIELD_NUMBER;
    hash = (53 * hash) + getErrorInfo().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hlx.examples.helloworld.grpc.OpenSessionReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(hlx.examples.helloworld.grpc.OpenSessionReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code helloworld.OpenSessionReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.OpenSessionReply)
      hlx.examples.helloworld.grpc.OpenSessionReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_OpenSessionReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_OpenSessionReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hlx.examples.helloworld.grpc.OpenSessionReply.class, hlx.examples.helloworld.grpc.OpenSessionReply.Builder.class);
    }

    // Construct using hlx.examples.helloworld.grpc.OpenSessionReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionId_ = "";

      errorCode_ = 0;

      errorInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_OpenSessionReply_descriptor;
    }

    @java.lang.Override
    public hlx.examples.helloworld.grpc.OpenSessionReply getDefaultInstanceForType() {
      return hlx.examples.helloworld.grpc.OpenSessionReply.getDefaultInstance();
    }

    @java.lang.Override
    public hlx.examples.helloworld.grpc.OpenSessionReply build() {
      hlx.examples.helloworld.grpc.OpenSessionReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hlx.examples.helloworld.grpc.OpenSessionReply buildPartial() {
      hlx.examples.helloworld.grpc.OpenSessionReply result = new hlx.examples.helloworld.grpc.OpenSessionReply(this);
      result.sessionId_ = sessionId_;
      result.errorCode_ = errorCode_;
      result.errorInfo_ = errorInfo_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hlx.examples.helloworld.grpc.OpenSessionReply) {
        return mergeFrom((hlx.examples.helloworld.grpc.OpenSessionReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hlx.examples.helloworld.grpc.OpenSessionReply other) {
      if (other == hlx.examples.helloworld.grpc.OpenSessionReply.getDefaultInstance()) return this;
      if (!other.getSessionId().isEmpty()) {
        sessionId_ = other.sessionId_;
        onChanged();
      }
      if (other.errorCode_ != 0) {
        setErrorCodeValue(other.getErrorCodeValue());
      }
      if (!other.getErrorInfo().isEmpty()) {
        errorInfo_ = other.errorInfo_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              sessionId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              errorCode_ = input.readEnum();

              break;
            } // case 16
            case 26: {
              errorInfo_ = input.readStringRequireUtf8();

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object sessionId_ = "";
    /**
     * <code>string sessionId = 1;</code>
     * @return The sessionId.
     */
    public java.lang.String getSessionId() {
      java.lang.Object ref = sessionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sessionId = 1;</code>
     * @return The bytes for sessionId.
     */
    public com.google.protobuf.ByteString
        getSessionIdBytes() {
      java.lang.Object ref = sessionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sessionId = 1;</code>
     * @param value The sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sessionId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionId() {
      
      sessionId_ = getDefaultInstance().getSessionId();
      onChanged();
      return this;
    }
    /**
     * <code>string sessionId = 1;</code>
     * @param value The bytes for sessionId to set.
     * @return This builder for chaining.
     */
    public Builder setSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionId_ = value;
      onChanged();
      return this;
    }

    private int errorCode_ = 0;
    /**
     * <code>.helloworld.ErrorCode errorCode = 2;</code>
     * @return The enum numeric value on the wire for errorCode.
     */
    @java.lang.Override public int getErrorCodeValue() {
      return errorCode_;
    }
    /**
     * <code>.helloworld.ErrorCode errorCode = 2;</code>
     * @param value The enum numeric value on the wire for errorCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrorCodeValue(int value) {
      
      errorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.helloworld.ErrorCode errorCode = 2;</code>
     * @return The errorCode.
     */
    @java.lang.Override
    public hlx.examples.helloworld.grpc.ErrorCode getErrorCode() {
      @SuppressWarnings("deprecation")
      hlx.examples.helloworld.grpc.ErrorCode result = hlx.examples.helloworld.grpc.ErrorCode.valueOf(errorCode_);
      return result == null ? hlx.examples.helloworld.grpc.ErrorCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.helloworld.ErrorCode errorCode = 2;</code>
     * @param value The errorCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrorCode(hlx.examples.helloworld.grpc.ErrorCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      errorCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.helloworld.ErrorCode errorCode = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorCode() {
      
      errorCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object errorInfo_ = "";
    /**
     * <code>string errorInfo = 3;</code>
     * @return The errorInfo.
     */
    public java.lang.String getErrorInfo() {
      java.lang.Object ref = errorInfo_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorInfo_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string errorInfo = 3;</code>
     * @return The bytes for errorInfo.
     */
    public com.google.protobuf.ByteString
        getErrorInfoBytes() {
      java.lang.Object ref = errorInfo_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorInfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string errorInfo = 3;</code>
     * @param value The errorInfo to set.
     * @return This builder for chaining.
     */
    public Builder setErrorInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorInfo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string errorInfo = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorInfo() {
      
      errorInfo_ = getDefaultInstance().getErrorInfo();
      onChanged();
      return this;
    }
    /**
     * <code>string errorInfo = 3;</code>
     * @param value The bytes for errorInfo to set.
     * @return This builder for chaining.
     */
    public Builder setErrorInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorInfo_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:helloworld.OpenSessionReply)
  }

  // @@protoc_insertion_point(class_scope:helloworld.OpenSessionReply)
  private static final hlx.examples.helloworld.grpc.OpenSessionReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hlx.examples.helloworld.grpc.OpenSessionReply();
  }

  public static hlx.examples.helloworld.grpc.OpenSessionReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenSessionReply>
      PARSER = new com.google.protobuf.AbstractParser<OpenSessionReply>() {
    @java.lang.Override
    public OpenSessionReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<OpenSessionReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenSessionReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hlx.examples.helloworld.grpc.OpenSessionReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

