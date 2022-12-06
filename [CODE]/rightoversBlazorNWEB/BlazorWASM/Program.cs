using BlazorWASM;
using BlazorWASM.Auth;
using Domain.Auth;
using HttpClients.ClientInterfaces;
using HttpClients.Implementations;
using Microsoft.AspNetCore.Components.Authorization;
using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using Radzen;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");
AuthorizationPolicies.AddPolicies(builder.Services);

builder.Services.AddScoped(sp => new HttpClient{BaseAddress = new Uri("https://localhost:7182")});
builder.Services.AddScoped<IFoodPostService, FoodPostHttpClient>();
builder.Services.AddScoped<IUserService, UserHttpClient>();
builder.Services.AddScoped<AuthenticationStateProvider, CustomAuthProvider>();
builder.Services.AddScoped<IAddressService, AddressServiceHttpClient>();
builder.Services.AddScoped<IRatingService, RatingHttpClient>();
builder.Services.AddScoped<DialogService>();

await builder.Build().RunAsync();