using Domain.DTOs;
using GrpcCL;

namespace GrpcClient.IConverters;

public interface IUserConverter
{
    UserCreationRequest getUserCreationRequest(UserCreationDto dto);
}