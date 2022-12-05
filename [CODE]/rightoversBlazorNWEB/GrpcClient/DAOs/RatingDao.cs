using Application.DAOInterfaces;
using Domain.Classes;
using Grpc.Net.Client;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.DAOs;

public class RatingDao : IRatingDao
{
    private readonly static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions{
        UnsafeUseInsecureChannelCallCredentials = true
    });

    private readonly static RatingService.RatingServiceClient client = new RatingService.RatingServiceClient(channel);

    private readonly IRatingConverter converter;

    public RatingDao(IRatingConverter converter)
    {
        this.converter = converter;
    }

    public async Task<Rating> AddRating(Rating rating)
    {
        Console.WriteLine(rating.ToString());
        Console.WriteLine("-------");
        var ratingMessage = converter.getRatingRequestFromRating(rating);
        var retrievedMessage = await client.addRatingAsync(ratingMessage);
        var retrievedRating = converter.getRatingFromRatingRequest(retrievedMessage);

        return retrievedRating;
    }

    public async Task<List<Rating>> GetAllByUserRated(string username)
    {
        Console.WriteLine(username);
        Console.WriteLine("-------");
        var usernameRequest = new UsernameRequest{Username = username};
        var ratingMessageList = await client.getAllByUserRatedAsync(usernameRequest);
        var ratings = converter.getRatingsFromRatingsMessageList(ratingMessageList);

        return ratings;
    }

    public async Task<List<Rating>> GetAllByUserRating(string username)
    {
        Console.WriteLine(username);
        Console.WriteLine("-------");
        var usernameRequest = new UsernameRequest{Username = username};
        var ratingMessageList = await client.getAllByUserRatingAsync(usernameRequest);
        var ratings = converter.getRatingsFromRatingsMessageList(ratingMessageList);

        return ratings;
    }
}