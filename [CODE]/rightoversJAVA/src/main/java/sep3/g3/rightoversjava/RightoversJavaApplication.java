package sep3.g3.rightoversjava;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sep3.g3.rightoversjava.grpc.AddressServiceGrpcImpl;
import sep3.g3.rightoversjava.grpc.FoodPostServiceGrpcImpl;
import sep3.g3.rightoversjava.grpc.UserServiceGrpcImpl;

import java.io.IOException;

@SpringBootApplication
public class
RightoversJavaApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        SpringApplication.run(RightoversJavaApplication.class, args);
        Server server = ServerBuilder.forPort(9090)
                .addService(new FoodPostServiceGrpcImpl())
                .addService(new AddressServiceGrpcImpl())
                .addService(new UserServiceGrpcImpl())
                .build();
        server.start();
        server.awaitTermination();
    }

}
