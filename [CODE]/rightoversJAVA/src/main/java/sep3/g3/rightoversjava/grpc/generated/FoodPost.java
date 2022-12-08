// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodPost.proto

package sep3.g3.rightoversjava.grpc.generated;

public final class FoodPost {
  private FoodPost() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_FPByUsernameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_FPByUsernameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_FoodPostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_FoodPostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_Date_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_Date_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_Time_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_Time_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_FoodPostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_FoodPostResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_GetAllRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_GetAllRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_FoodPostID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_FoodPostID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_FoodPostReservation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_FoodPostReservation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_ReservationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_ReservationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_PickUpRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_PickUpRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sep3_g3_ReportMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sep3_g3_ReportMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016FoodPost.proto\022\007sep3.g3\032\037google/protob" +
      "uf/timestamp.proto\"\'\n\023FPByUsernameReques" +
      "t\022\020\n\010username\030\001 \001(\t\"\214\002\n\017FoodPostRequest\022" +
      "\r\n\005title\030\001 \001(\t\022\021\n\tcategory_\030\002 \001(\t\022\023\n\013des" +
      "cription\030\003 \001(\t\022\022\n\npictureUrl\030\004 \001(\t\022\030\n\020da" +
      "ysUntilExpired\030\005 \001(\005\022 \n\tstartDate\030\006 \001(\0132" +
      "\r.sep3.g3.Date\022\036\n\007endDate\030\007 \001(\0132\r.sep3.g" +
      "3.Date\022 \n\tstartTime\030\010 \001(\0132\r.sep3.g3.Time" +
      "\022\036\n\007endTime\030\t \001(\0132\r.sep3.g3.Time\022\020\n\010user" +
      "name\030\n \001(\t\"0\n\004Date\022\013\n\003day\030\001 \001(\005\022\r\n\005month" +
      "\030\002 \001(\005\022\014\n\004year\030\003 \001(\005\"%\n\004Time\022\014\n\004hour\030\001 \001" +
      "(\005\022\017\n\007minutes\030\002 \001(\005\"\344\002\n\020FoodPostResponse" +
      "\022\r\n\005fp_id\030\001 \001(\005\022\r\n\005title\030\002 \001(\t\022\021\n\tcatego" +
      "ry_\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\022\022\n\npictur" +
      "eUrl\030\005 \001(\t\022\030\n\020daysUntilExpired\030\006 \001(\005\022\020\n\010" +
      "fp_state\030\007 \001(\t\0224\n\020timestamp_posted\030\010 \001(\013" +
      "2\032.google.protobuf.Timestamp\022 \n\tstartDat" +
      "e\030\t \001(\0132\r.sep3.g3.Date\022\036\n\007endDate\030\n \001(\0132" +
      "\r.sep3.g3.Date\022 \n\tstartTime\030\013 \001(\0132\r.sep3" +
      ".g3.Time\022\036\n\007endTime\030\014 \001(\0132\r.sep3.g3.Time" +
      "\022\020\n\010username\030\r \001(\t\"\037\n\rGetAllRequest\022\016\n\006f" +
      "iller\030\001 \001(\010\"\030\n\nFoodPostID\022\n\n\002id\030\001 \001(\005\"<\n" +
      "\023FoodPostReservation\022\020\n\010username\030\001 \001(\t\022\023" +
      "\n\013foodpost_id\030\002 \001(\005\"%\n\023ReservationRespon" +
      "se\022\016\n\006filler\030\001 \001(\010\"-\n\rPickUpRequest\022\n\n\002i" +
      "d\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\"M\n\rReportMessa" +
      "ge\022\017\n\007post_id\030\001 \001(\005\022\017\n\007comment\030\002 \001(\t\022\032\n\022" +
      "username_reporting\030\003 \001(\t2\253\004\n\017FoodPostSer" +
      "vice\022S\n\026getFoodPostsByUsername\022\034.sep3.g3" +
      ".FPByUsernameRequest\032\031.sep3.g3.FoodPostR" +
      "esponse0\001\022;\n\004post\022\030.sep3.g3.FoodPostRequ" +
      "est\032\031.sep3.g3.FoodPostResponse\022F\n\017getAll" +
      "FoodPosts\022\026.sep3.g3.GetAllRequest\032\031.sep3" +
      ".g3.FoodPostResponse0\001\022C\n\021getSingleFoodP" +
      "ost\022\023.sep3.g3.FoodPostID\032\031.sep3.g3.FoodP" +
      "ostResponse\022E\n\007reserve\022\034.sep3.g3.FoodPos" +
      "tReservation\032\034.sep3.g3.ReservationRespon" +
      "se\022;\n\006pickUp\022\026.sep3.g3.PickUpRequest\032\031.s" +
      "ep3.g3.FoodPostResponse\022;\n\006delete\022\023.sep3" +
      ".g3.FoodPostID\032\034.sep3.g3.ReservationResp" +
      "onse\0228\n\006report\022\026.sep3.g3.ReportMessage\032\026" +
      ".sep3.g3.ReportMessageB)\n%sep3.g3.righto" +
      "versjava.grpc.generatedP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_sep3_g3_FPByUsernameRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sep3_g3_FPByUsernameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_FPByUsernameRequest_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_sep3_g3_FoodPostRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sep3_g3_FoodPostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_FoodPostRequest_descriptor,
        new java.lang.String[] { "Title", "Category", "Description", "PictureUrl", "DaysUntilExpired", "StartDate", "EndDate", "StartTime", "EndTime", "Username", });
    internal_static_sep3_g3_Date_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sep3_g3_Date_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_Date_descriptor,
        new java.lang.String[] { "Day", "Month", "Year", });
    internal_static_sep3_g3_Time_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sep3_g3_Time_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_Time_descriptor,
        new java.lang.String[] { "Hour", "Minutes", });
    internal_static_sep3_g3_FoodPostResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sep3_g3_FoodPostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_FoodPostResponse_descriptor,
        new java.lang.String[] { "FpId", "Title", "Category", "Description", "PictureUrl", "DaysUntilExpired", "FpState", "TimestampPosted", "StartDate", "EndDate", "StartTime", "EndTime", "Username", });
    internal_static_sep3_g3_GetAllRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_sep3_g3_GetAllRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_GetAllRequest_descriptor,
        new java.lang.String[] { "Filler", });
    internal_static_sep3_g3_FoodPostID_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_sep3_g3_FoodPostID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_FoodPostID_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_sep3_g3_FoodPostReservation_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_sep3_g3_FoodPostReservation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_FoodPostReservation_descriptor,
        new java.lang.String[] { "Username", "FoodpostId", });
    internal_static_sep3_g3_ReservationResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_sep3_g3_ReservationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_ReservationResponse_descriptor,
        new java.lang.String[] { "Filler", });
    internal_static_sep3_g3_PickUpRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_sep3_g3_PickUpRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_PickUpRequest_descriptor,
        new java.lang.String[] { "Id", "Username", });
    internal_static_sep3_g3_ReportMessage_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_sep3_g3_ReportMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sep3_g3_ReportMessage_descriptor,
        new java.lang.String[] { "PostId", "Comment", "UsernameReporting", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
