// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Address.proto

package sep3.g3.rightoversjava.grpc.generated;

public final class Address {
  private Address() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_AddressRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_AddressRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_AddressResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_AddressResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_GetAllRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_GetAllRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rAddress.proto\022\007sep3.g3\"}\n\016AddressReque" +
      "st\022\016\n\006street\030\001 \001(\t\022\025\n\rstreet_number\030\002 \001(" +
      "\t\022\021\n\tpost_code\030\003 \001(\005\022\014\n\004city\030\004 \001(\t\022\021\n\tlo" +
      "ngitude\030\005 \001(\001\022\020\n\010latitude\030\006 \001(\001\"\222\001\n\017Addr" +
      "essResponse\022\022\n\naddress_id\030\001 \001(\005\022\016\n\006stree" +
      "t\030\002 \001(\t\022\025\n\rstreet_number\030\003 \001(\t\022\021\n\tpost_c" +
      "ode\030\004 \001(\005\022\014\n\004city\030\005 \001(\t\022\021\n\tlongitude\030\006 \001" +
      "(\001\022\020\n\010latitude\030\007 \001(\001\"\037\n\rGetAllRequest\022\016\n" +
      "\006filler\030\001 \001(\0102\233\001\n\016AddressService\022B\n\rcrea" +
      "teAddress\022\027.sep3.g3.AddressRequest\032\030.sep" +
      "3.g3.AddressResponse\022E\n\017getAllAddresses\022" +
      "\026.sep3.g3.GetAllRequest\032\030.sep3.g3.Addres" +
      "sResponse0\001B)\n%sep3.g3.rightoversjava.gr" +
      "pc.generatedP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sep3_g3_AddressRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sep3_g3_AddressRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_AddressRequest_descriptor,
        new java.lang.String[] { "Street", "StreetNumber", "PostCode", "City", "Longitude", "Latitude", });
    internal_static_sep3_g3_AddressResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sep3_g3_AddressResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_AddressResponse_descriptor,
        new java.lang.String[] { "AddressId", "Street", "StreetNumber", "PostCode", "City", "Longitude", "Latitude", });
    internal_static_sep3_g3_GetAllRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sep3_g3_GetAllRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_GetAllRequest_descriptor,
        new java.lang.String[] { "Filler", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
