package sep3.g3.rightoversjava.grpc.converter.interaces;

import sep3.g3.rightoversjava.grpc.generated.FoodPostResponse;
import sep3.g3.rightoversjava.grpc.generated.PickUpRequest;
import sep3.g3.rightoversjava.grpc.generated.ReportMessage;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.Rating;
import sep3.g3.rightoversjava.model.Report;
import sep3.g3.rightoversjava.model.dto.PickUpDto;
import sep3.g3.rightoversjava.model.dto.ReportCreationDto;


public interface FoodPostConverter {
    FoodPostResponse getFoodPostResponse(FoodPost created);
    PickUpDto getPickUpDtoFromPickUpRequest(PickUpRequest request);

    ReportCreationDto getReportCreationDtoFromRequest(ReportMessage request);
    ReportMessage getReportMessageFromReport(Report report);
}
