// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package hlx.examples.helloworld.grpc;

public interface OpenSessionReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:helloworld.OpenSessionReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sessionId = 1;</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <code>string sessionId = 1;</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <code>.helloworld.ErrorCode errorCode = 2;</code>
   * @return The enum numeric value on the wire for errorCode.
   */
  int getErrorCodeValue();
  /**
   * <code>.helloworld.ErrorCode errorCode = 2;</code>
   * @return The errorCode.
   */
  hlx.examples.helloworld.grpc.ErrorCode getErrorCode();

  /**
   * <code>string errorInfo = 3;</code>
   * @return The errorInfo.
   */
  java.lang.String getErrorInfo();
  /**
   * <code>string errorInfo = 3;</code>
   * @return The bytes for errorInfo.
   */
  com.google.protobuf.ByteString
      getErrorInfoBytes();
}
