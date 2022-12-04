using Application.DAOInterfaces;
using Domain.Classes;
using Grpc.Net.Client;
using GrpcCL;
using GrpcClient.IConverters;

namespace GrpcClient.DAOs;

public class RatingDao:IRatingDao
{
    private static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:9090", new GrpcChannelOptions
    {
        UnsafeUseInsecureChannelCallCredentials = true
    });

    private static RatingService.RatingServiceClient client = new(channel);

    private IRatingConverter converter;

    public RatingDao(IRatingConverter converter)
    {
        this.converter = converter;
    }

    public async Task<Rating> AddRating(Rating rating)
    {
        Console.WriteLine(rating.ToString());
        Console.WriteLine("-------");
        RatingMessage ratingMessage = converter.getRatingRequestFromRating(rating);
        RatingMessage retrievedMessage = await client.addRatingAsync(ratingMessage);
        Rating retrievedRating = converter.getRatingFromRatingRequest(retrievedMessage);
        return retrievedRating;
    }

    public async Task<List<Rating>> GetAllByUserRated(string username)
    {
        Console.WriteLine(username);
        Console.WriteLine("-------");
        UsernameRequest usernameRequest = new UsernameRequest { Username = username };
        RatingMessageList ratingMessageList = await client.getAllByUserRatedAsync(usernameRequest);
        List<Rating> ratings = converter.getRatingsFromRatingsMessageList(ratingMessageList);
        return ratings;
    }

    public async Task<List<Rating>> GetAllByUserRating(string username)
    {
        Console.WriteLine(username);
        Console.WriteLine("-------");
        UsernameRequest usernameRequest = new UsernameRequest { Username = username };
        RatingMessageList ratingMessageList = await client.getAllByUserRatingAsync(usernameRequest);
        List<Rating> ratings = converter.getRatingsFromRatingsMessageList(ratingMessageList);
        return ratings;
    }
}