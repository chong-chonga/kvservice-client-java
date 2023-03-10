// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package github.com.hlx.kvservice.grpc;

/**
 * Protobuf type {@code UpdateReply}
 */
public final class UpdateReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdateReply)
    UpdateReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateReply.newBuilder() to construct.
  private UpdateReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateReply() {
    errCode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return github.com.hlx.kvservice.grpc.FTKVService.internal_static_UpdateReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return github.com.hlx.kvservice.grpc.FTKVService.internal_static_UpdateReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            github.com.hlx.kvservice.grpc.UpdateReply.class, github.com.hlx.kvservice.grpc.UpdateReply.Builder.class);
  }

  public static final int ERR_CODE_FIELD_NUMBER = 1;
  private int errCode_;
  /**
   * <code>.ErrCode err_code = 1;</code>
   * @return The enum numeric value on the wire for errCode.
   */
  @java.lang.Override public int getErrCodeValue() {
    return errCode_;
  }
  /**
   * <code>.ErrCode err_code = 1;</code>
   * @return The errCode.
   */
  @java.lang.Override public github.com.hlx.kvservice.grpc.ErrCode getErrCode() {
    @SuppressWarnings("deprecation")
    github.com.hlx.kvservice.grpc.ErrCode result = github.com.hlx.kvservice.grpc.ErrCode.valueOf(errCode_);
    return result == null ? github.com.hlx.kvservice.grpc.ErrCode.UNRECOGNIZED : result;
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
    if (errCode_ != github.com.hlx.kvservice.grpc.ErrCode.WRONG_LEADER.getNumber()) {
      output.writeEnum(1, errCode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errCode_ != github.com.hlx.kvservice.grpc.ErrCode.WRONG_LEADER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, errCode_);
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
    if (!(obj instanceof github.com.hlx.kvservice.grpc.UpdateReply)) {
      return super.equals(obj);
    }
    github.com.hlx.kvservice.grpc.UpdateReply other = (github.com.hlx.kvservice.grpc.UpdateReply) obj;

    if (errCode_ != other.errCode_) return false;
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
    hash = (37 * hash) + ERR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + errCode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static github.com.hlx.kvservice.grpc.UpdateReply parseFrom(
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
  public static Builder newBuilder(github.com.hlx.kvservice.grpc.UpdateReply prototype) {
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
   * Protobuf type {@code UpdateReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateReply)
      github.com.hlx.kvservice.grpc.UpdateReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return github.com.hlx.kvservice.grpc.FTKVService.internal_static_UpdateReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return github.com.hlx.kvservice.grpc.FTKVService.internal_static_UpdateReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              github.com.hlx.kvservice.grpc.UpdateReply.class, github.com.hlx.kvservice.grpc.UpdateReply.Builder.class);
    }

    // Construct using github.com.hlx.kvservice.grpc.UpdateReply.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      errCode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return github.com.hlx.kvservice.grpc.FTKVService.internal_static_UpdateReply_descriptor;
    }

    @java.lang.Override
    public github.com.hlx.kvservice.grpc.UpdateReply getDefaultInstanceForType() {
      return github.com.hlx.kvservice.grpc.UpdateReply.getDefaultInstance();
    }

    @java.lang.Override
    public github.com.hlx.kvservice.grpc.UpdateReply build() {
      github.com.hlx.kvservice.grpc.UpdateReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public github.com.hlx.kvservice.grpc.UpdateReply buildPartial() {
      github.com.hlx.kvservice.grpc.UpdateReply result = new github.com.hlx.kvservice.grpc.UpdateReply(this);
      result.errCode_ = errCode_;
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
      if (other instanceof github.com.hlx.kvservice.grpc.UpdateReply) {
        return mergeFrom((github.com.hlx.kvservice.grpc.UpdateReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(github.com.hlx.kvservice.grpc.UpdateReply other) {
      if (other == github.com.hlx.kvservice.grpc.UpdateReply.getDefaultInstance()) return this;
      if (other.errCode_ != 0) {
        setErrCodeValue(other.getErrCodeValue());
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
            case 8: {
              errCode_ = input.readEnum();

              break;
            } // case 8
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

    private int errCode_ = 0;
    /**
     * <code>.ErrCode err_code = 1;</code>
     * @return The enum numeric value on the wire for errCode.
     */
    @java.lang.Override public int getErrCodeValue() {
      return errCode_;
    }
    /**
     * <code>.ErrCode err_code = 1;</code>
     * @param value The enum numeric value on the wire for errCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrCodeValue(int value) {
      
      errCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ErrCode err_code = 1;</code>
     * @return The errCode.
     */
    @java.lang.Override
    public github.com.hlx.kvservice.grpc.ErrCode getErrCode() {
      @SuppressWarnings("deprecation")
      github.com.hlx.kvservice.grpc.ErrCode result = github.com.hlx.kvservice.grpc.ErrCode.valueOf(errCode_);
      return result == null ? github.com.hlx.kvservice.grpc.ErrCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.ErrCode err_code = 1;</code>
     * @param value The errCode to set.
     * @return This builder for chaining.
     */
    public Builder setErrCode(github.com.hlx.kvservice.grpc.ErrCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      errCode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ErrCode err_code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrCode() {
      
      errCode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:UpdateReply)
  }

  // @@protoc_insertion_point(class_scope:UpdateReply)
  private static final github.com.hlx.kvservice.grpc.UpdateReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new github.com.hlx.kvservice.grpc.UpdateReply();
  }

  public static github.com.hlx.kvservice.grpc.UpdateReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateReply>
      PARSER = new com.google.protobuf.AbstractParser<UpdateReply>() {
    @java.lang.Override
    public UpdateReply parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public github.com.hlx.kvservice.grpc.UpdateReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

