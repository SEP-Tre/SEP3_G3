using Domain.Classes;
using Domain.DTOs;
using GrpcCL;

namespace GrpcClient.IConverters;

public interface IUserConverter
{
    UserRequest GetUserRequestFromUsername(string username);
    UserCreationRequest GetUserCreationRequestFromDto(UserCreationDto dto);
    User GetUserFromUserMessage(UserMessage userMessage);
    UserLoginRequest GetUserLoginRequestFromDto(UserLoginDto dto);
    Reservation GetReservationFromReservationMessage(ReservationMessage message);

    MyTime TimeConverter(OCTime time);
    Report GetReportFromMessage(ReportMessage message);
}