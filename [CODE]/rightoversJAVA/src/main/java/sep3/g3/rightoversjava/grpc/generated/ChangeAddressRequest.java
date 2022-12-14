// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package sep3.g3.rightoversjava.grpc.generated;

/**
 * Protobuf type {@code sep3.g3.ChangeAddressRequest}
 */
public final class ChangeAddressRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sep3.g3.ChangeAddressRequest)
    ChangeAddressRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeAddressRequest.newBuilder() to construct.
  private ChangeAddressRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeAddressRequest() {
    username_ = "";
    streetName_ = "";
    streetNumber_ = "";
    city_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangeAddressRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeAddressRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            streetName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            streetNumber_ = s;
            break;
          }
          case 32: {

            postalCode_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            city_ = s;
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
    return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_ChangeAddressRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_ChangeAddressRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.class, sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STREET_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object streetName_;
  /**
   * <code>string street_name = 2;</code>
   * @return The streetName.
   */
  @java.lang.Override
  public java.lang.String getStreetName() {
    java.lang.Object ref = streetName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      streetName_ = s;
      return s;
    }
  }
  /**
   * <code>string street_name = 2;</code>
   * @return The bytes for streetName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStreetNameBytes() {
    java.lang.Object ref = streetName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      streetName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STREET_NUMBER_FIELD_NUMBER = 3;
  private volatile java.lang.Object streetNumber_;
  /**
   * <code>string street_number = 3;</code>
   * @return The streetNumber.
   */
  @java.lang.Override
  public java.lang.String getStreetNumber() {
    java.lang.Object ref = streetNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      streetNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string street_number = 3;</code>
   * @return The bytes for streetNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStreetNumberBytes() {
    java.lang.Object ref = streetNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      streetNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSTAL_CODE_FIELD_NUMBER = 4;
  private int postalCode_;
  /**
   * <code>int32 postal_code = 4;</code>
   * @return The postalCode.
   */
  @java.lang.Override
  public int getPostalCode() {
    return postalCode_;
  }

  public static final int CITY_FIELD_NUMBER = 5;
  private volatile java.lang.Object city_;
  /**
   * <code>string city = 5;</code>
   * @return The city.
   */
  @java.lang.Override
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 5;</code>
   * @return The bytes for city.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(streetName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, streetName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(streetNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, streetNumber_);
    }
    if (postalCode_ != 0) {
      output.writeInt32(4, postalCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, city_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(username_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, username_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(streetName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, streetName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(streetNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, streetNumber_);
    }
    if (postalCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, postalCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(city_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, city_);
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
    if (!(obj instanceof sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest)) {
      return super.equals(obj);
    }
    sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest other = (sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest) obj;

    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (!getStreetName()
        .equals(other.getStreetName())) return false;
    if (!getStreetNumber()
        .equals(other.getStreetNumber())) return false;
    if (getPostalCode()
        != other.getPostalCode()) return false;
    if (!getCity()
        .equals(other.getCity())) return false;
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
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    hash = (37 * hash) + STREET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getStreetName().hashCode();
    hash = (37 * hash) + STREET_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getStreetNumber().hashCode();
    hash = (37 * hash) + POSTAL_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getPostalCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parseFrom(
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
  public static Builder newBuilder(sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest prototype) {
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
   * Protobuf type {@code sep3.g3.ChangeAddressRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sep3.g3.ChangeAddressRequest)
      sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_ChangeAddressRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_ChangeAddressRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.class, sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.Builder.class);
    }

    // Construct using sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.newBuilder()
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
      username_ = "";

      streetName_ = "";

      streetNumber_ = "";

      postalCode_ = 0;

      city_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sep3.g3.rightoversjava.grpc.generated.User.internal_static_sep3_g3_ChangeAddressRequest_descriptor;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest getDefaultInstanceForType() {
      return sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.getDefaultInstance();
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest build() {
      sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest buildPartial() {
      sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest result = new sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest(this);
      result.username_ = username_;
      result.streetName_ = streetName_;
      result.streetNumber_ = streetNumber_;
      result.postalCode_ = postalCode_;
      result.city_ = city_;
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
      if (other instanceof sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest) {
        return mergeFrom((sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest other) {
      if (other == sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest.getDefaultInstance()) return this;
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (!other.getStreetName().isEmpty()) {
        streetName_ = other.streetName_;
        onChanged();
      }
      if (!other.getStreetNumber().isEmpty()) {
        streetNumber_ = other.streetNumber_;
        onChanged();
      }
      if (other.getPostalCode() != 0) {
        setPostalCode(other.getPostalCode());
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        onChanged();
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
      sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 1;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 1;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 1;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object streetName_ = "";
    /**
     * <code>string street_name = 2;</code>
     * @return The streetName.
     */
    public java.lang.String getStreetName() {
      java.lang.Object ref = streetName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        streetName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string street_name = 2;</code>
     * @return The bytes for streetName.
     */
    public com.google.protobuf.ByteString
        getStreetNameBytes() {
      java.lang.Object ref = streetName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        streetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string street_name = 2;</code>
     * @param value The streetName to set.
     * @return This builder for chaining.
     */
    public Builder setStreetName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      streetName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string street_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreetName() {
      
      streetName_ = getDefaultInstance().getStreetName();
      onChanged();
      return this;
    }
    /**
     * <code>string street_name = 2;</code>
     * @param value The bytes for streetName to set.
     * @return This builder for chaining.
     */
    public Builder setStreetNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      streetName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object streetNumber_ = "";
    /**
     * <code>string street_number = 3;</code>
     * @return The streetNumber.
     */
    public java.lang.String getStreetNumber() {
      java.lang.Object ref = streetNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        streetNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string street_number = 3;</code>
     * @return The bytes for streetNumber.
     */
    public com.google.protobuf.ByteString
        getStreetNumberBytes() {
      java.lang.Object ref = streetNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        streetNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string street_number = 3;</code>
     * @param value The streetNumber to set.
     * @return This builder for chaining.
     */
    public Builder setStreetNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      streetNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string street_number = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStreetNumber() {
      
      streetNumber_ = getDefaultInstance().getStreetNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string street_number = 3;</code>
     * @param value The bytes for streetNumber to set.
     * @return This builder for chaining.
     */
    public Builder setStreetNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      streetNumber_ = value;
      onChanged();
      return this;
    }

    private int postalCode_ ;
    /**
     * <code>int32 postal_code = 4;</code>
     * @return The postalCode.
     */
    @java.lang.Override
    public int getPostalCode() {
      return postalCode_;
    }
    /**
     * <code>int32 postal_code = 4;</code>
     * @param value The postalCode to set.
     * @return This builder for chaining.
     */
    public Builder setPostalCode(int value) {
      
      postalCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 postal_code = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPostalCode() {
      
      postalCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 5;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 5;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 5;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      city_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      
      city_ = getDefaultInstance().getCity();
      onChanged();
      return this;
    }
    /**
     * <code>string city = 5;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      city_ = value;
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


    // @@protoc_insertion_point(builder_scope:sep3.g3.ChangeAddressRequest)
  }

  // @@protoc_insertion_point(class_scope:sep3.g3.ChangeAddressRequest)
  private static final sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest();
  }

  public static sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeAddressRequest>
      PARSER = new com.google.protobuf.AbstractParser<ChangeAddressRequest>() {
    @java.lang.Override
    public ChangeAddressRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeAddressRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeAddressRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeAddressRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sep3.g3.rightoversjava.grpc.generated.ChangeAddressRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

