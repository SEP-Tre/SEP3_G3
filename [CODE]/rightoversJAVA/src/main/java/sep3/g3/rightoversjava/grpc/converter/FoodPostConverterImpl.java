package sep3.g3.rightoversjava.grpc.converter;

import com.google.protobuf.Timestamp;
import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.grpc.converter.interaces.FoodPostConverter;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.Report;
import sep3.g3.rightoversjava.model.dto.PickUpDto;
import sep3.g3.rightoversjava.model.dto.ReportCreationDto;

import java.time.Instant;

@Service
public class FoodPostConverterImpl implements FoodPostConverter {
    public FoodPostResponse getFoodPostResponse(FoodPost created) {
        Instant instant =
                created.getTimestamp_posted()
                        .toInstant();

        Timestamp createdTimestamp =
                Timestamp.newBuilder()
                        .setSeconds(instant.getEpochSecond())
                        .setNanos(instant.getNano())
                        .build();

        Date sd = Date.newBuilder()
                .setDay(created.getStartDate().getDayOfMonth())
                .setMonth(created.getStartDate().getMonthValue())
                .setYear(created.getStartDate().getYear()).build();

        Date ed = Date.newBuilder()
                .setDay(created.getEndDate().getDayOfMonth())
                .setMonth(created.getEndDate().getMonthValue())
                .setYear(created.getEndDate().getYear()).build();

        Time st = Time.newBuilder()
                .setHour(created.getStartTime().getHour())
                .setMinutes(created.getStartTime().getMinute())
                .build();

        Time et = Time.newBuilder()
                .setHour(created.getEndTime().getHour())
                .setMinutes(created.getEndTime().getMinute())
                .build();

        return FoodPostResponse.newBuilder()
                .setFpId(created.getPost_id())
                .setTitle(created.getTitle())
                .setCategory(created.getCategory_())
                .setDescription(created.getDescription())
                .setPictureUrl(created.getPictureUrl())
                .setDaysUntilExpired(created.getDaysUntilExpired())
                .setFpState(created.getPostState())
                .setTimestampPosted(createdTimestamp)
                .setStartDate(sd)
                .setEndDate(ed)
                .setStartTime(st)
                .setEndTime(et)
                .setUsername(created.getUser().username).build();
    }

    @Override
    public PickUpDto getPickUpDtoFromPickUpRequest(PickUpRequest request)
    {
        return new PickUpDto(request.getId(), request.getUsername());
    }

    @Override
    public ReportCreationDto getReportCreationDtoFromRequest(ReportMessage request)
    {
        ReportCreationDto dto = new ReportCreationDto(request.getPostId(), request.getComment(), request.getUsernameReporting());
        return dto;
    }

    @Override
    public ReportMessage getReportMessageFromReport(Report report)
    {
        ReportMessage message = ReportMessage.newBuilder()
                .setPostId(report.getFoodPost().getPost_id())
                .setComment(report.getComment())
                .setUsernameReporting(report.getUserReporting().getUsername())
                .build();
        return message;
    }


}
