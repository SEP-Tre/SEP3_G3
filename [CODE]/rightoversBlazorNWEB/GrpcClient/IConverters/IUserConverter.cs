using Domain.Classes;
using Domain.DTOs;
using GrpcCL;

namespace GrpcClient.IConverters;

public interface IUserConverter
{
    UserCreationRequest GetUserCreationRequestFromDto(UserCreationDto dto);
    User GetUserFromUserMessage(UserMessage userMessage);
    UserLoginRequest GetUserLoginRequestFromDto(UserLoginDto dto);
}