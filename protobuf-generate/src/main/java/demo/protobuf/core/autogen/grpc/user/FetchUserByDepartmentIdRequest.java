// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package demo.protobuf.core.autogen.grpc.user;

/**
 * Protobuf type {@code user.FetchUserByDepartmentIdRequest}
 */
public  final class FetchUserByDepartmentIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.FetchUserByDepartmentIdRequest)
    FetchUserByDepartmentIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FetchUserByDepartmentIdRequest.newBuilder() to construct.
  private FetchUserByDepartmentIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetchUserByDepartmentIdRequest() {
    departmentId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FetchUserByDepartmentIdRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            departmentId_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return demo.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_FetchUserByDepartmentIdRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return demo.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_FetchUserByDepartmentIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest.class, demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest.Builder.class);
  }

  public static final int DEPARTMENTID_FIELD_NUMBER = 1;
  private int departmentId_;
  /**
   * <code>int32 departmentId = 1;</code>
   */
  public int getDepartmentId() {
    return departmentId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (departmentId_ != 0) {
      output.writeInt32(1, departmentId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (departmentId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, departmentId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest)) {
      return super.equals(obj);
    }
    demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest other = (demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest) obj;

    boolean result = true;
    result = result && (getDepartmentId()
        == other.getDepartmentId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DEPARTMENTID_FIELD_NUMBER;
    hash = (53 * hash) + getDepartmentId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code user.FetchUserByDepartmentIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.FetchUserByDepartmentIdRequest)
      demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return demo.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_FetchUserByDepartmentIdRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return demo.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_FetchUserByDepartmentIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest.class, demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest.Builder.class);
    }

    // Construct using configuration.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      departmentId_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return demo.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_FetchUserByDepartmentIdRequest_descriptor;
    }

    public demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest getDefaultInstanceForType() {
      return demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest.getDefaultInstance();
    }

    public demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest build() {
      demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest buildPartial() {
      demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest result = new demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest(this);
      result.departmentId_ = departmentId_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest) {
        return mergeFrom((demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest other) {
      if (other == demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest.getDefaultInstance()) return this;
      if (other.getDepartmentId() != 0) {
        setDepartmentId(other.getDepartmentId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int departmentId_ ;
    /**
     * <code>int32 departmentId = 1;</code>
     */
    public int getDepartmentId() {
      return departmentId_;
    }
    /**
     * <code>int32 departmentId = 1;</code>
     */
    public Builder setDepartmentId(int value) {
      
      departmentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 departmentId = 1;</code>
     */
    public Builder clearDepartmentId() {
      
      departmentId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:user.FetchUserByDepartmentIdRequest)
  }

  // @@protoc_insertion_point(class_scope:user.FetchUserByDepartmentIdRequest)
  private static final demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest();
  }

  public static demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchUserByDepartmentIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<FetchUserByDepartmentIdRequest>() {
    public FetchUserByDepartmentIdRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FetchUserByDepartmentIdRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FetchUserByDepartmentIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchUserByDepartmentIdRequest> getParserForType() {
    return PARSER;
  }

  public demo.protobuf.core.autogen.grpc.user.FetchUserByDepartmentIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

