// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package github.com.hlx.kvservice.grpc;

/**
 * Protobuf type {@code OpenSessionRequest}
 */
public final class OpenSessionRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OpenSessionRequest)
    OpenSessionRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OpenSessionRequest.newBuilder() to construct.
  private OpenSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OpenSessionRequest() {
    password_ = "";
    requestType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OpenSessionRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return github.com.hlx.kvservice.grpc.FTKVService.internal_static_OpenSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return github.com.hlx.kvservice.grpc.FTKVService.internal_static_OpenSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            github.com.hlx.kvservice.grpc.OpenSessionRequest.class, github.com.hlx.kvservice.grpc.OpenSessionRequest.Builder.class);
  }

  public static final int PASSWORD_FIELD_NUMBER = 1;
  private volatile java.lang.Object password_;
  /**
   * <code>string password = 1;</code>
   * @return The password.
   */
  @java.lang.Override
  public java.lang.String getPassword() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      password_ = s;
      return s;
    }
  }
  /**
   * <code>string password = 1;</code>
   * @return The bytes for password.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPasswordBytes() {
    java.lang.Object ref = password_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      password_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUEST_TYPE_FIELD_NUMBER = 2;
  private int requestType_;
  /**
   * <code>.RequestType request_type = 2;</code>
   * @return The enum numeric value on the wire for requestType.
   */
  @java.lang.Override public int getRequestTypeValue() {
    return requestType_;
  }
  /**
   * <code>.RequestType request_type = 2;</code>
   * @return The requestType.
   */
  @java.lang.Override public github.com.hlx.kvservice.grpc.RequestType getRequestType() {
    @SuppressWarnings("deprecation")
    github.com.hlx.kvservice.grpc.RequestType result = github.com.hlx.kvservice.grpc.RequestType.valueOf(requestType_);
    return result == null ? github.com.hlx.kvservice.grpc.RequestType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, password_);
    }
    if (requestType_ != github.com.hlx.kvservice.grpc.RequestType.OPEN_SESSION.getNumber()) {
      output.writeEnum(2, requestType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(password_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, password_);
    }
    if (requestType_ != github.com.hlx.kvservice.grpc.RequestType.OPEN_SESSION.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, requestType_);
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
    if (!(obj instanceof github.com.hlx.kvservice.grpc.OpenSessionRequest)) {
      return super.equals(obj);
    }
    github.com.hlx.kvservice.grpc.OpenSessionRequest other = (github.com.hlx.kvservice.grpc.OpenSessionRequest) obj;

    if (!getPassword()
        .equals(other.getPassword())) return false;
    if (requestType_ != other.requestType_) return false;
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
    hash = (37 * hash) + PASSWORD_FIELD_NUMBER;
    hash = (53 * hash) + getPassword().hashCode();
    hash = (37 * hash) + REQUEST_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + requestType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static github.com.hlx.kvservice.grpc.OpenSessionRequest parseFrom(
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
  public static Builder newBuilder(github.com.hlx.kvservice.grpc.OpenSessionRequest prototype) {
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
   * Protobuf type {@code OpenSessionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OpenSessionRequest)
      github.com.hlx.kvservice.grpc.OpenSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return github.com.hlx.kvservice.grpc.FTKVService.internal_static_OpenSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return github.com.hlx.kvservice.grpc.FTKVService.internal_static_OpenSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              github.com.hlx.kvservice.grpc.OpenSessionRequest.class, github.com.hlx.kvservice.grpc.OpenSessionRequest.Builder.class);
    }

    // Construct using github.com.hlx.kvservice.grpc.OpenSessionRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      password_ = "";

      requestType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return github.com.hlx.kvservice.grpc.FTKVService.internal_static_OpenSessionRequest_descriptor;
    }

    @java.lang.Override
    public github.com.hlx.kvservice.grpc.OpenSessionRequest getDefaultInstanceForType() {
      return github.com.hlx.kvservice.grpc.OpenSessionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public github.com.hlx.kvservice.grpc.OpenSessionRequest build() {
      github.com.hlx.kvservice.grpc.OpenSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public github.com.hlx.kvservice.grpc.OpenSessionRequest buildPartial() {
      github.com.hlx.kvservice.grpc.OpenSessionRequest result = new github.com.hlx.kvservice.grpc.OpenSessionRequest(this);
      result.password_ = password_;
      result.requestType_ = requestType_;
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
      if (other instanceof github.com.hlx.kvservice.grpc.OpenSessionRequest) {
        return mergeFrom((github.com.hlx.kvservice.grpc.OpenSessionRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(github.com.hlx.kvservice.grpc.OpenSessionRequest other) {
      if (other == github.com.hlx.kvservice.grpc.OpenSessionRequest.getDefaultInstance()) return this;
      if (!other.getPassword().isEmpty()) {
        password_ = other.password_;
        onChanged();
      }
      if (other.requestType_ != 0) {
        setRequestTypeValue(other.getRequestTypeValue());
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
              password_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 16: {
              requestType_ = input.readEnum();

              break;
            } // case 16
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

    private java.lang.Object password_ = "";
    /**
     * <code>string password = 1;</code>
     * @return The password.
     */
    public java.lang.String getPassword() {
      java.lang.Object ref = password_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        password_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string password = 1;</code>
     * @return The bytes for password.
     */
    public com.google.protobuf.ByteString
        getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string password = 1;</code>
     * @param value The password to set.
     * @return This builder for chaining.
     */
    public Builder setPassword(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      password_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string password = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassword() {
      
      password_ = getDefaultInstance().getPassword();
      onChanged();
      return this;
    }
    /**
     * <code>string password = 1;</code>
     * @param value The bytes for password to set.
     * @return This builder for chaining.
     */
    public Builder setPasswordBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      password_ = value;
      onChanged();
      return this;
    }

    private int requestType_ = 0;
    /**
     * <code>.RequestType request_type = 2;</code>
     * @return The enum numeric value on the wire for requestType.
     */
    @java.lang.Override public int getRequestTypeValue() {
      return requestType_;
    }
    /**
     * <code>.RequestType request_type = 2;</code>
     * @param value The enum numeric value on the wire for requestType to set.
     * @return This builder for chaining.
     */
    public Builder setRequestTypeValue(int value) {
      
      requestType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.RequestType request_type = 2;</code>
     * @return The requestType.
     */
    @java.lang.Override
    public github.com.hlx.kvservice.grpc.RequestType getRequestType() {
      @SuppressWarnings("deprecation")
      github.com.hlx.kvservice.grpc.RequestType result = github.com.hlx.kvservice.grpc.RequestType.valueOf(requestType_);
      return result == null ? github.com.hlx.kvservice.grpc.RequestType.UNRECOGNIZED : result;
    }
    /**
     * <code>.RequestType request_type = 2;</code>
     * @param value The requestType to set.
     * @return This builder for chaining.
     */
    public Builder setRequestType(github.com.hlx.kvservice.grpc.RequestType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      requestType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.RequestType request_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestType() {
      
      requestType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:OpenSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:OpenSessionRequest)
  private static final github.com.hlx.kvservice.grpc.OpenSessionRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new github.com.hlx.kvservice.grpc.OpenSessionRequest();
  }

  public static github.com.hlx.kvservice.grpc.OpenSessionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenSessionRequest>
      PARSER = new com.google.protobuf.AbstractParser<OpenSessionRequest>() {
    @java.lang.Override
    public OpenSessionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<OpenSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public github.com.hlx.kvservice.grpc.OpenSessionRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

