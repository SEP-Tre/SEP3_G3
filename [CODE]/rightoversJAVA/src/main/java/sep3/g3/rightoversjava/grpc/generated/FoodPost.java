// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FoodPost.proto

package sep3.g3.rightoversjava.grpc.generated;

public final class FoodPost {
    static final com.google.protobuf.Descriptors.Descriptor
            internal_static_sep3_g3_FoodPostRequest_descriptor;
    static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_sep3_g3_FoodPostRequest_fieldAccessorTable;
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
    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\016FoodPost.proto\022\007sep3.g3\"v\n\017FoodPostReq" +
                        "uest\022\r\n\005title\030\001 \001(\t\022\021\n\tcategory_\030\002 \001(\t\022\023" +
                        "\n\013description\030\003 \001(\t\022\022\n\npictureUrl\030\004 \001(\t\022" +
                        "\030\n\020daysUntilExpired\030\005 \001(\005\"\230\001\n\020FoodPostRe" +
                        "sponse\022\r\n\005fp_id\030\001 \001(\005\022\r\n\005title\030\002 \001(\t\022\021\n\t" +
                        "category_\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\022\022\n\n" +
                        "pictureUrl\030\005 \001(\t\022\030\n\020daysUntilExpired\030\006 \001" +
                        "(\005\022\020\n\010fp_state\030\007 \001(\t\"\037\n\rGetAllRequest\022\016\n" +
                        "\006filler\030\001 \001(\0102\226\001\n\017FoodPostService\022;\n\004pos" +
                        "t\022\030.sep3.g3.FoodPostRequest\032\031.sep3.g3.Fo" +
                        "odPostResponse\022F\n\017getAllFoodPosts\022\026.sep3" +
                        ".g3.GetAllRequest\032\031.sep3.g3.FoodPostResp" +
                        "onse0\001B)\n%sep3.g3.rightoversjava.grpc.ge" +
                        "neratedP\001b\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        });
        internal_static_sep3_g3_FoodPostRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_sep3_g3_FoodPostRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_sep3_g3_FoodPostRequest_descriptor,
                new java.lang.String[]{"Title", "Category", "Description", "PictureUrl", "DaysUntilExpired",});
        internal_static_sep3_g3_FoodPostResponse_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_sep3_g3_FoodPostResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_sep3_g3_FoodPostResponse_descriptor,
                new java.lang.String[]{"FpId", "Title", "Category", "Description", "PictureUrl", "DaysUntilExpired", "FpState",});
        internal_static_sep3_g3_GetAllRequest_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_sep3_g3_GetAllRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_sep3_g3_GetAllRequest_descriptor,
                new java.lang.String[]{"Filler",});
    }
    private FoodPost() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    // @@protoc_insertion_point(outer_class_scope)
}
