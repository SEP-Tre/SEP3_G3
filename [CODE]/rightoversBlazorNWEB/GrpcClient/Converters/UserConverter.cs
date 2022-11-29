using Domain.DTOs;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.Converters;

public class UserConverter: IUserConverter
{
    public UserCreationRequest getUserCreationRequest(UserCreationDto dto)
    {
        throw new NotImplementedException();
    }
}