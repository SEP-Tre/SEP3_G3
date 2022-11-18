package sep3.g3.rightoversjava.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Configurable;
import sep3.g3.rightoversjava.grpc.generated.AddressRequest;
import sep3.g3.rightoversjava.grpc.generated.AddressResponse;
import sep3.g3.rightoversjava.grpc.generated.AddressServiceGrpc;
import sep3.g3.rightoversjava.grpc.generated.GetAllRequest;
import sep3.g3.rightoversjava.model.Address;
import sep3.g3.rightoversjava.model.AddressDTO;
import sep3.g3.rightoversjava.service.AddressService;

import java.util.ArrayList;

@Configurable
public class AddressServiceGrpcImpl extends AddressServiceGrpc.AddressServiceImplBase {
    private AddressService addressService;

     public AddressServiceGrpcImpl() {
         addressService = SpringContext.getBean(AddressService.class);
     }

    public void createAddress(AddressRequest request, StreamObserver<AddressResponse> responseObserver) {
        Address address = addressService.create(new AddressDTO(
                request.getStreetNumber(),
                request.getStreet(),
                request.getCity(),
                request.getPostCode()));

        AddressResponse addressResponse = AddressResponse.newBuilder()
                .setAddressId(address.getAddressId())
                .setStreet(address.getStreet())
                .setStreetNumber(address.getStreetNumber())
                .setPostCode(address.getPostCode())
                .setCity(address.getCity())
                .build();

        responseObserver.onNext(addressResponse);
        responseObserver.onCompleted();
    }

    public void getAllAddresses(GetAllRequest request, StreamObserver<AddressResponse> responseObserver) {
        ArrayList<Address> addresses = addressService.getAllAddresses();
        for (Address address:
             addresses) {
            AddressResponse addressResponse = AddressResponse.newBuilder()
                    .setAddressId(address.getAddressId())
                    .setStreet(address.getStreet())
                    .setStreetNumber(address.getStreetNumber())
                    .setPostCode(address.getPostCode())
                    .setCity(address.getCity())
                    .build();
            responseObserver.onNext(addressResponse);
        }
        responseObserver.onCompleted();
    }
}
