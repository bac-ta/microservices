// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package com.dimageshare.protobuf.core.autogen.grpc.user;

/**
 * Protobuf type {@code user.UserResponses}
 */
public  final class UserResponses extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user.UserResponses)
    UserResponsesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserResponses.newBuilder() to construct.
  private UserResponses(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserResponses() {
    user_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserResponses(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              user_ = new java.util.ArrayList<com.dimageshare.protobuf.core.autogen.grpc.user.User>();
              mutable_bitField0_ |= 0x00000001;
            }
            user_.add(
                input.readMessage(com.dimageshare.protobuf.core.autogen.grpc.user.User.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        user_ = java.util.Collections.unmodifiableList(user_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.dimageshare.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_UserResponses_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.dimageshare.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_UserResponses_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses.class, com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private java.util.List<com.dimageshare.protobuf.core.autogen.grpc.user.User> user_;
  /**
   * <code>repeated .user.User user = 1;</code>
   */
  public java.util.List<com.dimageshare.protobuf.core.autogen.grpc.user.User> getUserList() {
    return user_;
  }
  /**
   * <code>repeated .user.User user = 1;</code>
   */
  public java.util.List<? extends com.dimageshare.protobuf.core.autogen.grpc.user.UserOrBuilder> 
      getUserOrBuilderList() {
    return user_;
  }
  /**
   * <code>repeated .user.User user = 1;</code>
   */
  public int getUserCount() {
    return user_.size();
  }
  /**
   * <code>repeated .user.User user = 1;</code>
   */
  public com.dimageshare.protobuf.core.autogen.grpc.user.User getUser(int index) {
    return user_.get(index);
  }
  /**
   * <code>repeated .user.User user = 1;</code>
   */
  public com.dimageshare.protobuf.core.autogen.grpc.user.UserOrBuilder getUserOrBuilder(
      int index) {
    return user_.get(index);
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
    for (int i = 0; i < user_.size(); i++) {
      output.writeMessage(1, user_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < user_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, user_.get(i));
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
    if (!(obj instanceof com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses)) {
      return super.equals(obj);
    }
    com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses other = (com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses) obj;

    boolean result = true;
    result = result && getUserList()
        .equals(other.getUserList());
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
    if (getUserCount() > 0) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUserList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parseFrom(
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
  public static Builder newBuilder(com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses prototype) {
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
   * Protobuf type {@code user.UserResponses}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user.UserResponses)
      com.dimageshare.protobuf.core.autogen.grpc.user.UserResponsesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.dimageshare.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_UserResponses_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dimageshare.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_UserResponses_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses.class, com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses.Builder.class);
    }

    // Construct using com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses.newBuilder()
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
        getUserFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        userBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.dimageshare.protobuf.core.autogen.grpc.user.UserOuterClass.internal_static_user_UserResponses_descriptor;
    }

    public com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses getDefaultInstanceForType() {
      return com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses.getDefaultInstance();
    }

    public com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses build() {
      com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses buildPartial() {
      com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses result = new com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses(this);
      int from_bitField0_ = bitField0_;
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          user_ = java.util.Collections.unmodifiableList(user_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
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
      if (other instanceof com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses) {
        return mergeFrom((com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses other) {
      if (other == com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses.getDefaultInstance()) return this;
      if (userBuilder_ == null) {
        if (!other.user_.isEmpty()) {
          if (user_.isEmpty()) {
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUserIsMutable();
            user_.addAll(other.user_);
          }
          onChanged();
        }
      } else {
        if (!other.user_.isEmpty()) {
          if (userBuilder_.isEmpty()) {
            userBuilder_.dispose();
            userBuilder_ = null;
            user_ = other.user_;
            bitField0_ = (bitField0_ & ~0x00000001);
            userBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUserFieldBuilder() : null;
          } else {
            userBuilder_.addAllMessages(other.user_);
          }
        }
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
      com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.dimageshare.protobuf.core.autogen.grpc.user.User> user_ =
      java.util.Collections.emptyList();
    private void ensureUserIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        user_ = new java.util.ArrayList<com.dimageshare.protobuf.core.autogen.grpc.user.User>(user_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dimageshare.protobuf.core.autogen.grpc.user.User, com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder, com.dimageshare.protobuf.core.autogen.grpc.user.UserOrBuilder> userBuilder_;

    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public java.util.List<com.dimageshare.protobuf.core.autogen.grpc.user.User> getUserList() {
      if (userBuilder_ == null) {
        return java.util.Collections.unmodifiableList(user_);
      } else {
        return userBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public int getUserCount() {
      if (userBuilder_ == null) {
        return user_.size();
      } else {
        return userBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public com.dimageshare.protobuf.core.autogen.grpc.user.User getUser(int index) {
      if (userBuilder_ == null) {
        return user_.get(index);
      } else {
        return userBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder setUser(
        int index, com.dimageshare.protobuf.core.autogen.grpc.user.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.set(index, value);
        onChanged();
      } else {
        userBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder setUser(
        int index, com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.set(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder addUser(com.dimageshare.protobuf.core.autogen.grpc.user.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(value);
        onChanged();
      } else {
        userBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder addUser(
        int index, com.dimageshare.protobuf.core.autogen.grpc.user.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUserIsMutable();
        user_.add(index, value);
        onChanged();
      } else {
        userBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder addUser(
        com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder addUser(
        int index, com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.add(index, builderForValue.build());
        onChanged();
      } else {
        userBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder addAllUser(
        java.lang.Iterable<? extends com.dimageshare.protobuf.core.autogen.grpc.user.User> values) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, user_);
        onChanged();
      } else {
        userBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        userBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public Builder removeUser(int index) {
      if (userBuilder_ == null) {
        ensureUserIsMutable();
        user_.remove(index);
        onChanged();
      } else {
        userBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder getUserBuilder(
        int index) {
      return getUserFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public com.dimageshare.protobuf.core.autogen.grpc.user.UserOrBuilder getUserOrBuilder(
        int index) {
      if (userBuilder_ == null) {
        return user_.get(index);  } else {
        return userBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public java.util.List<? extends com.dimageshare.protobuf.core.autogen.grpc.user.UserOrBuilder> 
         getUserOrBuilderList() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(user_);
      }
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder addUserBuilder() {
      return getUserFieldBuilder().addBuilder(
          com.dimageshare.protobuf.core.autogen.grpc.user.User.getDefaultInstance());
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder addUserBuilder(
        int index) {
      return getUserFieldBuilder().addBuilder(
          index, com.dimageshare.protobuf.core.autogen.grpc.user.User.getDefaultInstance());
    }
    /**
     * <code>repeated .user.User user = 1;</code>
     */
    public java.util.List<com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder> 
         getUserBuilderList() {
      return getUserFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.dimageshare.protobuf.core.autogen.grpc.user.User, com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder, com.dimageshare.protobuf.core.autogen.grpc.user.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.dimageshare.protobuf.core.autogen.grpc.user.User, com.dimageshare.protobuf.core.autogen.grpc.user.User.Builder, com.dimageshare.protobuf.core.autogen.grpc.user.UserOrBuilder>(
                user_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:user.UserResponses)
  }

  // @@protoc_insertion_point(class_scope:user.UserResponses)
  private static final com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses();
  }

  public static com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserResponses>
      PARSER = new com.google.protobuf.AbstractParser<UserResponses>() {
    public UserResponses parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserResponses(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserResponses> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserResponses> getParserForType() {
    return PARSER;
  }

  public com.dimageshare.protobuf.core.autogen.grpc.user.UserResponses getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

