// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package hlx.examples.helloworld.grpc;

/**
 * <pre>
 * The response message containing the greetings
 * </pre>
 *
 * Protobuf type {@code helloworld.HelloReply}
 */
public final class HelloReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:helloworld.HelloReply)
    HelloReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HelloReply.newBuilder() to construct.
  private HelloReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HelloReply() {
    message_ = "";
    errorCode_ = 0;
    errorInfo_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HelloReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hlx.examples.helloworld.grpc.HelloReply.class, hlx.examples.helloworld.grpc.HelloReply.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
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
    if (!(obj instanceof hlx.examples.helloworld.grpc.HelloReply)) {
      return super.equals(obj);
    }
    hlx.examples.helloworld.grpc.HelloReply other = (hlx.examples.helloworld.grpc.HelloReply) obj;

    if (!getMessage()
        .equals(other.getMessage())) return false;
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
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + ERRORCODE_FIELD_NUMBER;
    hash = (53 * hash) + errorCode_;
    hash = (37 * hash) + ERRORINFO_FIELD_NUMBER;
    hash = (53 * hash) + getErrorInfo().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hlx.examples.helloworld.grpc.HelloReply parseFrom(
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
  public static Builder newBuilder(hlx.examples.helloworld.grpc.HelloReply prototype) {
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
   * <pre>
   * The response message containing the greetings
   * </pre>
   *
   * Protobuf type {@code helloworld.HelloReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:helloworld.HelloReply)
      hlx.examples.helloworld.grpc.HelloReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hlx.examples.helloworld.grpc.HelloReply.class, hlx.examples.helloworld.grpc.HelloReply.Builder.class);
    }

    // Construct using hlx.examples.helloworld.grpc.HelloReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      message_ = "";

      errorCode_ = 0;

      errorInfo_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hlx.examples.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloReply_descriptor;
    }

    @java.lang.Override
    public hlx.examples.helloworld.grpc.HelloReply getDefaultInstanceForType() {
      return hlx.examples.helloworld.grpc.HelloReply.getDefaultInstance();
    }

    @java.lang.Override
    public hlx.examples.helloworld.grpc.HelloReply build() {
      hlx.examples.helloworld.grpc.HelloReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public hlx.examples.helloworld.grpc.HelloReply buildPartial() {
      hlx.examples.helloworld.grpc.HelloReply result = new hlx.examples.helloworld.grpc.HelloReply(this);
      result.message_ = message_;
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
      if (other instanceof hlx.examples.helloworld.grpc.HelloReply) {
        return mergeFrom((hlx.examples.helloworld.grpc.HelloReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hlx.examples.helloworld.grpc.HelloReply other) {
      if (other == hlx.examples.helloworld.grpc.HelloReply.getDefaultInstance()) return this;
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
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
              message_ = input.readStringRequireUtf8();

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

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 1;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 1;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 1;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:helloworld.HelloReply)
  }

  // @@protoc_insertion_point(class_scope:helloworld.HelloReply)
  private static final hlx.examples.helloworld.grpc.HelloReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hlx.examples.helloworld.grpc.HelloReply();
  }

  public static hlx.examples.helloworld.grpc.HelloReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloReply>
      PARSER = new com.google.protobuf.AbstractParser<HelloReply>() {
    @java.lang.Override
    public HelloReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<HelloReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public hlx.examples.helloworld.grpc.HelloReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

