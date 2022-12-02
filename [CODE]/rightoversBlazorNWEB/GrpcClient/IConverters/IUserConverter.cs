using Domain.Classes;
using Domain.DTOs;
using GrpcCL;

namespace GrpcClient.IConverters;

public interface IUserConverter
{
    UserRequest GetUserRequestFromUsername(String username);
    UserCreationRequest GetUserCreationRequestFromDto(UserCreationDto dto);
    User GetUserFromUserMessage(UserMessage userMessage);
    UserLoginRequest GetUserLoginRequestFromDto(UserLoginDto dto); }