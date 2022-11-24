﻿using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Domain.DTOs;
using GrpcCL;
using Microsoft.AspNetCore.Mvc;

namespace WebAPI.Controllers;

[ApiController]
[Route("[controller]")]
public class AddressController : ControllerBase
{
    private readonly IAddressLogic addressLogic;

    public AddressController(IAddressLogic addressLogic)
    {
        this.addressLogic = addressLogic;
    }

    [HttpPost]
    public async Task<ActionResult<AddressDTO>> CreateAsync(AddressDTO addressDto)
    {

        try
        {
            AddressDTO savedAddressDto = await addressLogic.CreateAsync(addressDto);

            return Created($"/addresses/{savedAddressDto.AddressId}", savedAddressDto);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            return StatusCode(500, e.Message);
        }
    }

    [HttpGet]
    public async Task<ActionResult<IEnumerable<AddressDTO>>> GetAsync()
    {
        try
        {
            var addresses = await addressLogic.GetAllAsync();

            return Ok(addresses);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);

            return StatusCode(500, e.Message);
        }
    }
}