using System.Text;
using Application.DAOInterfaces;
using Application.Logic;
using Application.LogicInterfaces;
using Domain.Auth;
using GrpcClient.Converters;
using GrpcClient.DAOs;
using GrpcClient.IConverters;
using Microsoft.AspNetCore.Authentication.JwtBearer;
using Microsoft.IdentityModel.Tokens;


var builder = WebApplication.CreateBuilder(args);

// Add services to the container.

builder.Services.AddControllers();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

builder.Services.AddScoped<IFoodPostConverter, FoodPostConverter>();
builder.Services.AddScoped<IFoodPostDao, FoodPostDao>();
builder.Services.AddScoped<IAddressDao, AddressDao>();
builder.Services.AddScoped<IFoodPostLogic, FoodPostLogic>();
builder.Services.AddScoped<IUserDao, UserDao>();
builder.Services.AddScoped<IUserLogic, UserLogic>();
AuthorizationPolicies.AddPolicies(builder.Services);
builder.Services.AddScoped<IAddressLogic, AddressLogic>();

builder.Services.AddAuthentication(JwtBearerDefaults.AuthenticationScheme).AddJwtBearer(options =>
{
    options.RequireHttpsMetadata = false;
    options.SaveToken = true;
    options.TokenValidationParameters = new TokenValidationParameters()
    {
        ValidateIssuer = true,
        ValidateAudience = true,
        ValidAudience = builder.Configuration["Jwt:Audience"],
        ValidIssuer = builder.Configuration["Jwt:Issuer"],
        IssuerSigningKey = new SymmetricSecurityKey(Encoding.UTF8.GetBytes(builder.Configuration["Jwt:Key"]))
    };
});
var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

app.UseCors(x => x
    .AllowAnyMethod()
    .AllowAnyHeader()
    .SetIsOriginAllowed(origin => true) // allow any origin
    .AllowCredentials());

app.UseHttpsRedirection();

app.UseAuthorization();

app.MapControllers();

app.Run();