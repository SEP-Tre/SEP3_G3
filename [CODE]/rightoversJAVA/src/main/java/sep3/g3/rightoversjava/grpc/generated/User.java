// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package sep3.g3.rightoversjava.grpc.generated;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_UserCreationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_UserCreationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_UserLoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_UserLoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_AddressMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_AddressMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_UserMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_UserMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_UserName_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_UserName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_OpeningHoursResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_OpeningHoursResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_OpeningHoursRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_OpeningHoursRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_ReservationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_ReservationMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_Filler_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_Filler_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_ChangeFirstNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_ChangeFirstNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_ChangePasswordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_ChangePasswordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_ChangeAddressRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_ChangeAddressRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nUser.proto\022\007sep3.g3\032\016FoodPost.proto\"\037\n" +
      "\013UserRequest\022\020\n\010username\030\001 \001(\t\"\237\001\n\023UserC" +
      "reationRequest\022\020\n\010username\030\001 \001(\t\022\021\n\tfirs" +
      "tname\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022(\n\007address" +
      "\030\004 \001(\0132\027.sep3.g3.AddressMessage\022\022\n\nisBus" +
      "iness\030\005 \001(\010\022\023\n\013phoneNumber\030\006 \001(\t\"6\n\020User" +
      "LoginRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010passwo" +
      "rd\030\002 \001(\t\"\221\001\n\016AddressMessage\022\022\n\naddress_i" +
      "d\030\001 \001(\005\022\016\n\006street\030\002 \001(\t\022\025\n\rstreet_number" +
      "\030\003 \001(\t\022\021\n\tpost_code\030\004 \001(\005\022\014\n\004city\030\005 \001(\t\022" +
      "\021\n\tlongitude\030\006 \001(\001\022\020\n\010latitude\030\007 \001(\001\"\227\001\n" +
      "\013UserMessage\022\020\n\010username\030\001 \001(\t\022\021\n\tfirstn" +
      "ame\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022(\n\007address\030\004" +
      " \001(\0132\027.sep3.g3.AddressMessage\022\022\n\nisBusin" +
      "ess\030\005 \001(\010\022\023\n\013phoneNumber\030\006 \001(\t\"\034\n\010UserNa" +
      "me\022\020\n\010username\030\001 \001(\t\"\334\005\n\024OpeningHoursRes" +
      "ponse\022$\n\rmondayOpening\030\001 \001(\0132\r.sep3.g3.T" +
      "ime\022$\n\rmondayClosing\030\002 \001(\0132\r.sep3.g3.Tim" +
      "e\022%\n\016tuesdayOpening\030\003 \001(\0132\r.sep3.g3.Time" +
      "\022%\n\016tuesdayClosing\030\004 \001(\0132\r.sep3.g3.Time\022" +
      "\'\n\020wednesdayOpening\030\005 \001(\0132\r.sep3.g3.Time" +
      "\022\'\n\020wednesdayClosing\030\006 \001(\0132\r.sep3.g3.Tim" +
      "e\022&\n\017thursdayOpening\030\007 \001(\0132\r.sep3.g3.Tim" +
      "e\022&\n\017thursdayClosing\030\010 \001(\0132\r.sep3.g3.Tim" +
      "e\022$\n\rfridayOpening\030\t \001(\0132\r.sep3.g3.Time\022" +
      "$\n\rfridayClosing\030\n \001(\0132\r.sep3.g3.Time\022&\n" +
      "\017saturdayOpening\030\013 \001(\0132\r.sep3.g3.Time\022&\n" +
      "\017saturdayClosing\030\014 \001(\0132\r.sep3.g3.Time\022$\n" +
      "\rsundayOpening\030\r \001(\0132\r.sep3.g3.Time\022$\n\rs" +
      "undayClosing\030\016 \001(\0132\r.sep3.g3.Time\022\024\n\014mon" +
      "dayIsOpen\030\017 \001(\010\022\025\n\rtuesdayIsOpen\030\020 \001(\010\022\027" +
      "\n\017wednesdayIsOpen\030\021 \001(\010\022\026\n\016thursdayIsOpe" +
      "n\030\022 \001(\010\022\024\n\014fridayIsOpen\030\023 \001(\010\022\026\n\016saturda" +
      "yIsOpen\030\024 \001(\010\022\024\n\014sundayIsOpen\030\025 \001(\010\"\\\n\023O" +
      "peningHoursRequest\022\020\n\010username\030\001 \001(\t\0223\n\014" +
      "openingHours\030\002 \001(\0132\035.sep3.g3.OpeningHour" +
      "sResponse\"~\n\022ReservationMessage\022\026\n\016reser" +
      "vation_id\030\001 \001(\005\022,\n\tfood_post\030\002 \001(\0132\031.sep" +
      "3.g3.FoodPostResponse\022\"\n\004user\030\003 \001(\0132\024.se" +
      "p3.g3.UserMessage\"\030\n\006Filler\022\016\n\006filler\030\001 " +
      "\001(\010\"B\n\026ChangeFirstNameRequest\022\020\n\010usernam" +
      "e\030\001 \001(\t\022\026\n\016new_first_name\030\002 \001(\t\"U\n\025Chang" +
      "ePasswordRequest\022\020\n\010username\030\001 \001(\t\022\024\n\014ol" +
      "d_password\030\002 \001(\t\022\024\n\014new_password\030\003 \001(\t\"w" +
      "\n\024ChangeAddressRequest\022\020\n\010username\030\001 \001(\t" +
      "\022\023\n\013street_name\030\002 \001(\t\022\025\n\rstreet_number\030\003" +
      " \001(\t\022\023\n\013postal_code\030\004 \001(\005\022\014\n\004city\030\005 \001(\t2" +
      "\373\005\n\013UserService\022;\n\rgetByUsername\022\024.sep3." +
      "g3.UserRequest\032\024.sep3.g3.UserMessage\022>\n\010" +
      "register\022\034.sep3.g3.UserCreationRequest\032\024" +
      ".sep3.g3.UserMessage\022H\n\022assignOpeningHou" +
      "rs\022\034.sep3.g3.OpeningHoursRequest\032\024.sep3." +
      "g3.UserMessage\0228\n\005login\022\031.sep3.g3.UserLo" +
      "ginRequest\032\024.sep3.g3.UserMessage\022P\n\031getR" +
      "eservationsByUsername\022\024.sep3.g3.UserRequ" +
      "est\032\033.sep3.g3.ReservationMessage0\001\0223\n\nde" +
      "leteUser\022\024.sep3.g3.UserRequest\032\017.sep3.g3" +
      ".Filler\022G\n\025getReportsAgainstUser\022\024.sep3." +
      "g3.UserRequest\032\026.sep3.g3.ReportMessage0\001" +
      "\022C\n\017getOpeningHours\022\021.sep3.g3.UserName\032\035" +
      ".sep3.g3.OpeningHoursResponse\022H\n\017changeF" +
      "irstName\022\037.sep3.g3.ChangeFirstNameReques" +
      "t\032\024.sep3.g3.UserMessage\022F\n\016changePasswor" +
      "d\022\036.sep3.g3.ChangePasswordRequest\032\024.sep3" +
      ".g3.UserMessage\022D\n\rchangeAddress\022\035.sep3." +
      "g3.ChangeAddressRequest\032\024.sep3.g3.UserMe" +
      "ssageB)\n%sep3.g3.rightoversjava.grpc.gen" +
      "eratedP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          sep3.g3.rightoversjava.grpc.generated.FoodPost.getDescriptor(),
        });
    internal_static_sep3_g3_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sep3_g3_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_UserRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_sep3_g3_UserCreationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sep3_g3_UserCreationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_UserCreationRequest_descriptor,
        new java.lang.String[] { "Username", "Firstname", "Password", "Address", "IsBusiness", "PhoneNumber", });
    internal_static_sep3_g3_UserLoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sep3_g3_UserLoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_UserLoginRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_sep3_g3_AddressMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sep3_g3_AddressMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_AddressMessage_descriptor,
        new java.lang.String[] { "AddressId", "Street", "StreetNumber", "PostCode", "City", "Longitude", "Latitude", });
    internal_static_sep3_g3_UserMessage_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sep3_g3_UserMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_UserMessage_descriptor,
        new java.lang.String[] { "Username", "Firstname", "Password", "Address", "IsBusiness", "PhoneNumber", });
    internal_static_sep3_g3_UserName_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_sep3_g3_UserName_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_UserName_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_sep3_g3_OpeningHoursResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_sep3_g3_OpeningHoursResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_OpeningHoursResponse_descriptor,
        new java.lang.String[] { "MondayOpening", "MondayClosing", "TuesdayOpening", "TuesdayClosing", "WednesdayOpening", "WednesdayClosing", "ThursdayOpening", "ThursdayClosing", "FridayOpening", "FridayClosing", "SaturdayOpening", "SaturdayClosing", "SundayOpening", "SundayClosing", "MondayIsOpen", "TuesdayIsOpen", "WednesdayIsOpen", "ThursdayIsOpen", "FridayIsOpen", "SaturdayIsOpen", "SundayIsOpen", });
    internal_static_sep3_g3_OpeningHoursRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_sep3_g3_OpeningHoursRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_OpeningHoursRequest_descriptor,
        new java.lang.String[] { "Username", "OpeningHours", });
    internal_static_sep3_g3_ReservationMessage_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_sep3_g3_ReservationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_ReservationMessage_descriptor,
        new java.lang.String[] { "ReservationId", "FoodPost", "User", });
    internal_static_sep3_g3_Filler_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_sep3_g3_Filler_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_Filler_descriptor,
        new java.lang.String[] { "Filler", });
    internal_static_sep3_g3_ChangeFirstNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_sep3_g3_ChangeFirstNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_ChangeFirstNameRequest_descriptor,
        new java.lang.String[] { "Username", "NewFirstName", });
    internal_static_sep3_g3_ChangePasswordRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_sep3_g3_ChangePasswordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_ChangePasswordRequest_descriptor,
        new java.lang.String[] { "Username", "OldPassword", "NewPassword", });
    internal_static_sep3_g3_ChangeAddressRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_sep3_g3_ChangeAddressRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_ChangeAddressRequest_descriptor,
        new java.lang.String[] { "Username", "StreetName", "StreetNumber", "PostalCode", "City", });
    sep3.g3.rightoversjava.grpc.generated.FoodPost.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
