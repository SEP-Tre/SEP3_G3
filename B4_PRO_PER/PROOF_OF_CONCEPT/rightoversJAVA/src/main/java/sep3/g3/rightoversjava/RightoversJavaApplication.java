package sep3.g3.rightoversjava;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sep3.g3.rightoversjava.grpc.FoodPostServiceGrpcImpl;
import sep3.g3.rightoversjava.service.FoodPostService;
import sep3.g3.rightoversjava.service.FoodPostServiceImp;

import java.io.IOException;

@SpringBootApplication
public class RightoversJavaApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		SpringApplication.run(RightoversJavaApplication.class, args);
		Server server = ServerBuilder.forPort(9090).addService(new FoodPostServiceGrpcImpl()).build();
		server.start();
		server.awaitTermination();

	}

}
