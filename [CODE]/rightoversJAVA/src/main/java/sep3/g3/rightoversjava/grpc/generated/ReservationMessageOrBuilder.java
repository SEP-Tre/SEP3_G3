// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package sep3.g3.rightoversjava.grpc.generated;

public interface ReservationMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sep3.g3.ReservationMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 reservation_id = 1;</code>
   * @return The reservationId.
   */
  int getReservationId();

  /**
   * <code>.sep3.g3.FoodPostResponse food_post = 2;</code>
   * @return Whether the foodPost field is set.
   */
  boolean hasFoodPost();
  /**
   * <code>.sep3.g3.FoodPostResponse food_post = 2;</code>
   * @return The foodPost.
   */
  sep3.g3.rightoversjava.grpc.generated.FoodPostResponse getFoodPost();
  /**
   * <code>.sep3.g3.FoodPostResponse food_post = 2;</code>
   */
  sep3.g3.rightoversjava.grpc.generated.FoodPostResponseOrBuilder getFoodPostOrBuilder();

  /**
   * <code>.sep3.g3.UserMessage user = 3;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.sep3.g3.UserMessage user = 3;</code>
   * @return The user.
   */
  sep3.g3.rightoversjava.grpc.generated.UserMessage getUser();
  /**
   * <code>.sep3.g3.UserMessage user = 3;</code>
   */
  sep3.g3.rightoversjava.grpc.generated.UserMessageOrBuilder getUserOrBuilder();
}
