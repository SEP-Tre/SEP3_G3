// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodPost.proto

package sep3.g3.rightoversjava.grpc.generated;

/**
 * Protobuf type {@code sep3.g3.ReportMessage}
 */
public final class ReportMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sep3.g3.ReportMessage)
    ReportMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReportMessage.newBuilder() to construct.
  private ReportMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReportMessage() {
    comment_ = "";
    usernameReporting_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReportMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReportMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            postId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            comment_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            usernameReporting_ = s;
            break;
          }
          case 32: {

            reportId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_ReportMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_ReportMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sep3.g3.rightoversjava.grpc.generated.ReportMessage.class, sep3.g3.rightoversjava.grpc.generated.ReportMessage.Builder.class);
  }

  public static final int POST_ID_FIELD_NUMBER = 1;
  private int postId_;
  /**
   * <code>int32 post_id = 1;</code>
   * @return The postId.
   */
  @java.lang.Override
  public int getPostId() {
    return postId_;
  }

  public static final int COMMENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object comment_;
  /**
   * <code>string comment = 2;</code>
   * @return The comment.
   */
  @java.lang.Override
  public java.lang.String getComment() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comment_ = s;
      return s;
    }
  }
  /**
   * <code>string comment = 2;</code>
   * @return The bytes for comment.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCommentBytes() {
    java.lang.Object ref = comment_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      comment_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_REPORTING_FIELD_NUMBER = 3;
  private volatile java.lang.Object usernameReporting_;
  /**
   * <code>string username_reporting = 3;</code>
   * @return The usernameReporting.
   */
  @java.lang.Override
  public java.lang.String getUsernameReporting() {
    java.lang.Object ref = usernameReporting_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      usernameReporting_ = s;
      return s;
    }
  }
  /**
   * <code>string username_reporting = 3;</code>
   * @return The bytes for usernameReporting.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameReportingBytes() {
    java.lang.Object ref = usernameReporting_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      usernameReporting_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REPORT_ID_FIELD_NUMBER = 4;
  private int reportId_;
  /**
   * <code>int32 report_id = 4;</code>
   * @return The reportId.
   */
  @java.lang.Override
  public int getReportId() {
    return reportId_;
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
    if (postId_ != 0) {
      output.writeInt32(1, postId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comment_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, comment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(usernameReporting_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, usernameReporting_);
    }
    if (reportId_ != 0) {
      output.writeInt32(4, reportId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (postId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, postId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comment_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, comment_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(usernameReporting_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, usernameReporting_);
    }
    if (reportId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, reportId_);
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
    if (!(obj instanceof sep3.g3.rightoversjava.grpc.generated.ReportMessage)) {
      return super.equals(obj);
    }
    sep3.g3.rightoversjava.grpc.generated.ReportMessage other = (sep3.g3.rightoversjava.grpc.generated.ReportMessage) obj;

    if (getPostId()
        != other.getPostId()) return false;
    if (!getComment()
        .equals(other.getComment())) return false;
    if (!getUsernameReporting()
        .equals(other.getUsernameReporting())) return false;
    if (getReportId()
        != other.getReportId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + POST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getPostId();
    hash = (37 * hash) + COMMENT_FIELD_NUMBER;
    hash = (53 * hash) + getComment().hashCode();
    hash = (37 * hash) + USERNAME_REPORTING_FIELD_NUMBER;
    hash = (53 * hash) + getUsernameReporting().hashCode();
    hash = (37 * hash) + REPORT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getReportId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage parseFrom(
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
  public static Builder newBuilder(sep3.g3.rightoversjava.grpc.generated.ReportMessage prototype) {
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
   * Protobuf type {@code sep3.g3.ReportMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sep3.g3.ReportMessage)
      sep3.g3.rightoversjava.grpc.generated.ReportMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_ReportMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_ReportMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sep3.g3.rightoversjava.grpc.generated.ReportMessage.class, sep3.g3.rightoversjava.grpc.generated.ReportMessage.Builder.class);
    }

    // Construct using sep3.g3.rightoversjava.grpc.generated.ReportMessage.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      postId_ = 0;

      comment_ = "";

      usernameReporting_ = "";

      reportId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sep3.g3.rightoversjava.grpc.generated.FoodPost.internal_static_sep3_g3_ReportMessage_descriptor;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.ReportMessage getDefaultInstanceForType() {
      return sep3.g3.rightoversjava.grpc.generated.ReportMessage.getDefaultInstance();
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.ReportMessage build() {
      sep3.g3.rightoversjava.grpc.generated.ReportMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.ReportMessage buildPartial() {
      sep3.g3.rightoversjava.grpc.generated.ReportMessage result = new sep3.g3.rightoversjava.grpc.generated.ReportMessage(this);
      result.postId_ = postId_;
      result.comment_ = comment_;
      result.usernameReporting_ = usernameReporting_;
      result.reportId_ = reportId_;
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
      if (other instanceof sep3.g3.rightoversjava.grpc.generated.ReportMessage) {
        return mergeFrom((sep3.g3.rightoversjava.grpc.generated.ReportMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sep3.g3.rightoversjava.grpc.generated.ReportMessage other) {
      if (other == sep3.g3.rightoversjava.grpc.generated.ReportMessage.getDefaultInstance()) return this;
      if (other.getPostId() != 0) {
        setPostId(other.getPostId());
      }
      if (!other.getComment().isEmpty()) {
        comment_ = other.comment_;
        onChanged();
      }
      if (!other.getUsernameReporting().isEmpty()) {
        usernameReporting_ = other.usernameReporting_;
        onChanged();
      }
      if (other.getReportId() != 0) {
        setReportId(other.getReportId());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      sep3.g3.rightoversjava.grpc.generated.ReportMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sep3.g3.rightoversjava.grpc.generated.ReportMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int postId_ ;
    /**
     * <code>int32 post_id = 1;</code>
     * @return The postId.
     */
    @java.lang.Override
    public int getPostId() {
      return postId_;
    }
    /**
     * <code>int32 post_id = 1;</code>
     * @param value The postId to set.
     * @return This builder for chaining.
     */
    public Builder setPostId(int value) {
      
      postId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 post_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPostId() {
      
      postId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object comment_ = "";
    /**
     * <code>string comment = 2;</code>
     * @return The comment.
     */
    public java.lang.String getComment() {
      java.lang.Object ref = comment_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comment_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string comment = 2;</code>
     * @return The bytes for comment.
     */
    public com.google.protobuf.ByteString
        getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string comment = 2;</code>
     * @param value The comment to set.
     * @return This builder for chaining.
     */
    public Builder setComment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      comment_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string comment = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearComment() {
      
      comment_ = getDefaultInstance().getComment();
      onChanged();
      return this;
    }
    /**
     * <code>string comment = 2;</code>
     * @param value The bytes for comment to set.
     * @return This builder for chaining.
     */
    public Builder setCommentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      comment_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object usernameReporting_ = "";
    /**
     * <code>string username_reporting = 3;</code>
     * @return The usernameReporting.
     */
    public java.lang.String getUsernameReporting() {
      java.lang.Object ref = usernameReporting_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        usernameReporting_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username_reporting = 3;</code>
     * @return The bytes for usernameReporting.
     */
    public com.google.protobuf.ByteString
        getUsernameReportingBytes() {
      java.lang.Object ref = usernameReporting_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        usernameReporting_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username_reporting = 3;</code>
     * @param value The usernameReporting to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameReporting(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      usernameReporting_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username_reporting = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsernameReporting() {
      
      usernameReporting_ = getDefaultInstance().getUsernameReporting();
      onChanged();
      return this;
    }
    /**
     * <code>string username_reporting = 3;</code>
     * @param value The bytes for usernameReporting to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameReportingBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      usernameReporting_ = value;
      onChanged();
      return this;
    }

    private int reportId_ ;
    /**
     * <code>int32 report_id = 4;</code>
     * @return The reportId.
     */
    @java.lang.Override
    public int getReportId() {
      return reportId_;
    }
    /**
     * <code>int32 report_id = 4;</code>
     * @param value The reportId to set.
     * @return This builder for chaining.
     */
    public Builder setReportId(int value) {
      
      reportId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 report_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearReportId() {
      
      reportId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:sep3.g3.ReportMessage)
  }

  // @@protoc_insertion_point(class_scope:sep3.g3.ReportMessage)
  private static final sep3.g3.rightoversjava.grpc.generated.ReportMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sep3.g3.rightoversjava.grpc.generated.ReportMessage();
  }

  public static sep3.g3.rightoversjava.grpc.generated.ReportMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportMessage>
      PARSER = new com.google.protobuf.AbstractParser<ReportMessage>() {
    @java.lang.Override
    public ReportMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReportMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReportMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sep3.g3.rightoversjava.grpc.generated.ReportMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

